package com.google.android.apps.refocus.image;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.android.apps.refocus.processing.FocusSettings;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TimeZone;
import p000.bli;
import p000.bve;
import p000.ern;
import p000.hrw;
import p000.hrx;
import p000.hry;
import p000.kqg;
import p000.wd;

/* compiled from: PG */
public class RGBZ {
    public static final String TAG = bli.m862a("RGBZ");
    public Bitmap bitmap;
    public DepthTransform depthTransform;
    public hrw depthmapData;
    public final ExifInterface exif;
    public FocusSettings focusSettings;
    public hry imageData;
    public InputStream lazyInputStream;
    public Bitmap preview;

    /* compiled from: PG */
    public class Data {
        public final ExifInterface exif;
        public final byte[] fileData;

        public Data(byte[] bArr, ExifInterface exifInterface) {
            this.fileData = bArr;
            this.exif = exifInterface;
        }
    }

    public RGBZ(Bitmap bitmap) {
        this(bitmap, null);
    }

    public RGBZ(Bitmap bitmap, DepthTransform depthTransform) {
        if (bitmap == null) {
            throw new IllegalArgumentException();
        }
        this.bitmap = bitmap;
        this.depthTransform = depthTransform;
        if (depthTransform != null) {
            bitmap = null;
        }
        this.preview = bitmap;
        this.focusSettings = null;
        this.lazyInputStream = null;
        this.exif = new ExifInterface();
    }

    public RGBZ(Uri uri, ContentResolver contentResolver) {
        InputStream openInputStream = contentResolver.openInputStream(uri);
        try {
            this.preview = BitmapFactory.decodeStream(openInputStream);
            Bitmap bitmap = this.preview;
            if (bitmap == null) {
                throw new FileNotFoundException(uri.toString());
            }
            this.bitmap = bitmap;
            this.depthTransform = null;
            this.focusSettings = null;
            this.exif = new ExifInterface();
            openInputStream = contentResolver.openInputStream(uri);
            try {
                this.exif.m8484a(openInputStream);
                this.lazyInputStream = contentResolver.openInputStream(uri);
            } finally {
                openInputStream.close();
            }
        } finally {
            openInputStream.close();
        }
    }

    private static InputStream applyExif(InputStream inputStream, ExifInterface exifInterface) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            exifInterface.m8488b(inputStream, byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            bli.m866b(TAG, e.toString());
            return null;
        }
    }

    public Data createRgbzFile(int i) {
        finishParsingXMPMeta();
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeExifAndXMP(byteArrayOutputStream, this.exif, i);
        return new Data(byteArrayOutputStream.toByteArray(), this.exif);
    }

    private void finishParsingXMPMeta() {
        Bitmap bitmap = null;
        InputStream inputStream = this.lazyInputStream;
        if (inputStream != null) {
            wd extractXMPMeta = XmpUtil.extractXMPMeta(inputStream);
            try {
                this.lazyInputStream.close();
                this.lazyInputStream = null;
            } catch (IOException e) {
                String str = TAG;
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Unable to close stream: ");
                stringBuilder.append(valueOf);
                bli.m873e(str, stringBuilder.toString());
            }
            this.imageData = hry.m3321a(extractXMPMeta);
            hry hry = this.imageData;
            if (hry != null) {
                byte[] bArr = hry.f6533b;
                if (bArr != null) {
                    bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                }
                this.bitmap = bitmap;
            }
            this.depthmapData = hrw.m3317a(extractXMPMeta);
            hrw hrw = this.depthmapData;
            if (hrw != null) {
                this.depthTransform = hrw.f6530c;
                Bitmap bitmap2 = this.bitmap;
                if (!(hrw.f6529b == null || bitmap2 == null)) {
                    if (GDepthUtil.MIME_JPEG.equals(hrw.f6528a)) {
                        BitmapNative.decodeJPEGToChannel(hrw.f6529b, bitmap2, 3);
                    } else {
                        byte[] bArr2 = hrw.f6529b;
                        bitmap = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                        if (!(bitmap.getWidth() == bitmap2.getWidth() && bitmap.getHeight() == bitmap2.getHeight())) {
                            Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Config.ARGB_8888);
                            if (BitmapNative.resize(bitmap, createBitmap)) {
                                bitmap = createBitmap;
                            }
                        }
                        BitmapNative.setAlphaChannel(bitmap, bitmap2);
                    }
                }
            }
            hrx a = hrx.m3319a(extractXMPMeta);
            if (a != null) {
                this.focusSettings = a.f6531a;
            }
        }
    }

    public Bitmap getBitmap() {
        finishParsingXMPMeta();
        return this.bitmap;
    }

    public float getDepth(int i, int i2) {
        if (hasDepthmap()) {
            return getDepthTransform().reconstruct(Color.alpha(BitmapNative.getPixel(this.bitmap, i, i2)));
        }
        return 0.0f;
    }

    public DepthTransform getDepthTransform() {
        finishParsingXMPMeta();
        return this.depthTransform;
    }

    public FocusSettings getFocusSettings() {
        finishParsingXMPMeta();
        return this.focusSettings;
    }

    public int getHeight() {
        return this.bitmap.getHeight();
    }

    public Bitmap getPreview() {
        return this.preview;
    }

    public int getWidth() {
        return this.bitmap.getWidth();
    }

    public boolean hasDepthmap() {
        finishParsingXMPMeta();
        return this.depthTransform != null;
    }

    public boolean hasFocusSettings() {
        finishParsingXMPMeta();
        return this.focusSettings != null;
    }

    public static RGBZ resizeIfLarger(RGBZ rgbz, int i) {
        int width = rgbz.getWidth();
        int height = rgbz.getHeight();
        if (Math.max(width, height) <= i) {
            return rgbz;
        }
        if (width > height) {
            int i2 = (height * i) / width;
            width = i;
            i = i2;
        } else {
            width = (width * i) / height;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i, Config.ARGB_8888);
        BitmapNative.resize(rgbz.getBitmap(), createBitmap);
        return new RGBZ(createBitmap, rgbz.getDepthTransform());
    }

    public static RGBZ rotate(RGBZ rgbz, int i) {
        if (rgbz == null || i % 90 != 0) {
            return null;
        }
        if (i == 0) {
            return rgbz;
        }
        RGBZ rgbz2 = new RGBZ(BitmapProcessing.rotate(rgbz.getBitmap(), i), rgbz.getDepthTransform());
        rgbz2.setPreview(BitmapProcessing.rotate(rgbz.getPreview(), i));
        rgbz2.setFocusSettings(FocusSettings.rotate(rgbz.getFocusSettings(), i));
        return rgbz2;
    }

    public void setFocusSettings(FocusSettings focusSettings) {
        finishParsingXMPMeta();
        this.focusSettings = focusSettings;
    }

    public void setPreview(Bitmap bitmap) {
        this.preview = bitmap;
    }

    private void writeExifAndXMP(OutputStream outputStream, ExifInterface exifInterface, int i) {
        if (exifInterface != null) {
            exifInterface.m8486a(ExifInterface.f12397i, System.currentTimeMillis(), TimeZone.getDefault());
        }
        writeXMPMeta(i, exifInterface, outputStream);
        try {
            outputStream.close();
        } catch (IOException e) {
        }
    }

    private void writeXMPMeta(int i, ExifInterface exifInterface, OutputStream outputStream) {
        InputStream applyExif = applyExif(BitmapIO.toInputStream(this.preview, i), exifInterface);
        wd createXMPMeta = XmpUtil.createXMPMeta();
        if (hasFocusSettings()) {
            hrx a = hrx.m3318a(getFocusSettings());
            hrx.m3320a();
            try {
                createXMPMeta.mo2518a("http://ns.google.com/photos/1.0/focus/", "BlurAtInfinity", Float.valueOf(a.f6531a.blurAtInfinity));
                createXMPMeta.mo2518a("http://ns.google.com/photos/1.0/focus/", "FocalDistance", Float.valueOf(a.f6531a.focalDistance));
                createXMPMeta.mo2518a("http://ns.google.com/photos/1.0/focus/", "DepthOfField", Float.valueOf(a.f6531a.depthOfField));
                createXMPMeta.mo2518a("http://ns.google.com/photos/1.0/focus/", "FocalPointX", Float.valueOf(a.f6531a.focalPointX));
                createXMPMeta.mo2518a("http://ns.google.com/photos/1.0/focus/", "FocalPointY", Float.valueOf(a.f6531a.focalPointY));
            } catch (Throwable e) {
                kqg.f8420a.mo2210b(e);
            }
        }
        wd createXMPMeta2 = XmpUtil.createXMPMeta();
        if (this.imageData == null) {
            bli.m863a(TAG, "Encoding image data");
            Bitmap bitmap = this.bitmap;
            hry hry = new hry();
            hry.f6532a = GDepthUtil.MIME_JPEG;
            hry.f6533b = BitmapIO.toByteArray(bitmap, 85);
            this.imageData = hry;
        }
        hry hry2 = this.imageData;
        if (hry2 != null) {
            hry.m3322a();
            try {
                createXMPMeta.mo2518a("http://ns.google.com/photos/1.0/image/", GDepthUtil.MIME, GDepthUtil.MIME_JPEG);
                createXMPMeta2.mo2524a("http://ns.google.com/photos/1.0/image/", "Data", hry2.f6533b);
            } catch (Throwable e2) {
                kqg.f8420a.mo2210b(e2);
            }
        }
        if (hasDepthmap()) {
            if (this.depthmapData == null) {
                bli.m863a(TAG, "Encoding depth data");
                this.depthmapData = hrw.m3316a(this);
            }
            hrw hrw = this.depthmapData;
            if (hrw != null) {
                GDepthUtil.initialize();
                try {
                    createXMPMeta.mo2518a(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.FORMAT, hrw.f6530c.getFormat());
                    createXMPMeta.mo2516a(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.NEAR, (double) hrw.f6530c.getNear());
                    createXMPMeta.mo2516a(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.FAR, (double) hrw.f6530c.getFar());
                    createXMPMeta.mo2518a(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, GDepthUtil.MIME, hrw.f6528a);
                    createXMPMeta2.mo2524a(GDepthUtil.GOOGLE_DEPTH_NAMESPACE, "Data", hrw.f6529b);
                } catch (Throwable e22) {
                    kqg.f8420a.mo2210b(e22);
                }
            }
        }
        if (hasDepthmap()) {
            ern.m2044a(createXMPMeta, bve.REFOCUS.m1007d());
        } else {
            bli.m863a(TAG, "no depth map exists for current image");
        }
        if (!XmpUtil.writeXMPMeta(applyExif, outputStream, createXMPMeta, createXMPMeta2)) {
            bli.m866b(TAG, "failed to write xmp data");
        }
    }
}
