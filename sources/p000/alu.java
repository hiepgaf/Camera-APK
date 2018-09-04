package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: alu */
public final class alu implements adr {
    /* renamed from: a */
    public static final adm f19787a = adm.m169a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
    /* renamed from: b */
    public static final adm f19788b = adm.m168a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    /* renamed from: c */
    private final agu f19789c;

    @Deprecated
    public alu() {
        this.f19789c = null;
    }

    public alu(agu agu) {
        this.f19789c = agu;
    }

    /* renamed from: a */
    private final boolean m14657a(agn agn, File file, adp adp) {
        CompressFormat compressFormat;
        OutputStream outputStream;
        Throwable th;
        Throwable e;
        OutputStream outputStream2;
        boolean z;
        String valueOf;
        int a;
        double a2;
        String valueOf2;
        boolean hasAlpha;
        StringBuilder stringBuilder;
        OutputStream outputStream3;
        Bitmap bitmap = (Bitmap) agn.mo55b();
        CompressFormat compressFormat2 = (CompressFormat) adp.m6303a(f19788b);
        if (compressFormat2 != null) {
            compressFormat = compressFormat2;
        } else if (bitmap.hasAlpha()) {
            compressFormat = CompressFormat.PNG;
        } else {
            compressFormat = CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        long a3 = arm.m630a();
        int intValue = ((Integer) adp.m6303a(f19787a)).intValue();
        try {
            OutputStream fileOutputStream = new FileOutputStream(file);
            try {
                agu agu = this.f19789c;
                if (agu != null) {
                    fileOutputStream = new adv(fileOutputStream, agu);
                }
            } catch (Throwable e2) {
                outputStream = fileOutputStream;
                th = e2;
                outputStream2 = outputStream;
                try {
                    if (Log.isLoggable("BitmapEncoder", 3)) {
                        Log.d("BitmapEncoder", "Failed to encode Bitmap", th);
                    }
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                            z = false;
                        } catch (IOException e3) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (Log.isLoggable("BitmapEncoder", 2)) {
                        valueOf = String.valueOf(compressFormat);
                        a = arq.m647a(bitmap);
                        a2 = arm.m629a(a3);
                        valueOf2 = String.valueOf(adp.m6303a(f19788b));
                        hasAlpha = bitmap.hasAlpha();
                        stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 105) + String.valueOf(valueOf2).length());
                        stringBuilder.append("Compressed with type: ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" of size ");
                        stringBuilder.append(a);
                        stringBuilder.append(" in ");
                        stringBuilder.append(a2);
                        stringBuilder.append(", options format: ");
                        stringBuilder.append(valueOf2);
                        stringBuilder.append(", hasAlpha: ");
                        stringBuilder.append(hasAlpha);
                        Log.v("BitmapEncoder", stringBuilder.toString());
                    }
                    return z;
                } catch (Throwable th2) {
                    outputStream = outputStream2;
                    e2 = th2;
                    outputStream3 = outputStream;
                    if (outputStream3 != null) {
                        try {
                            outputStream3.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw e2;
                }
            } catch (Throwable th22) {
                e2 = th22;
                outputStream3 = fileOutputStream;
                if (outputStream3 != null) {
                    outputStream3.close();
                }
                throw e2;
            }
            try {
                bitmap.compress(compressFormat, intValue, fileOutputStream);
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                    z = true;
                } catch (IOException e5) {
                    z = true;
                }
            } catch (Throwable e22) {
                outputStream = fileOutputStream;
                th = e22;
                outputStream2 = outputStream;
                if (Log.isLoggable("BitmapEncoder", 3)) {
                    Log.d("BitmapEncoder", "Failed to encode Bitmap", th);
                }
                if (outputStream2 != null) {
                    z = false;
                } else {
                    outputStream2.close();
                    z = false;
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    valueOf = String.valueOf(compressFormat);
                    a = arq.m647a(bitmap);
                    a2 = arm.m629a(a3);
                    valueOf2 = String.valueOf(adp.m6303a(f19788b));
                    hasAlpha = bitmap.hasAlpha();
                    stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 105) + String.valueOf(valueOf2).length());
                    stringBuilder.append("Compressed with type: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" of size ");
                    stringBuilder.append(a);
                    stringBuilder.append(" in ");
                    stringBuilder.append(a2);
                    stringBuilder.append(", options format: ");
                    stringBuilder.append(valueOf2);
                    stringBuilder.append(", hasAlpha: ");
                    stringBuilder.append(hasAlpha);
                    Log.v("BitmapEncoder", stringBuilder.toString());
                }
                return z;
            } catch (Throwable th222) {
                e22 = th222;
                outputStream3 = fileOutputStream;
                if (outputStream3 != null) {
                    outputStream3.close();
                }
                throw e22;
            }
        } catch (Throwable e222) {
            th = e222;
            outputStream2 = null;
            if (Log.isLoggable("BitmapEncoder", 3)) {
                Log.d("BitmapEncoder", "Failed to encode Bitmap", th);
            }
            if (outputStream2 != null) {
                outputStream2.close();
                z = false;
            } else {
                z = false;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                valueOf = String.valueOf(compressFormat);
                a = arq.m647a(bitmap);
                a2 = arm.m629a(a3);
                valueOf2 = String.valueOf(adp.m6303a(f19788b));
                hasAlpha = bitmap.hasAlpha();
                stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 105) + String.valueOf(valueOf2).length());
                stringBuilder.append("Compressed with type: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" of size ");
                stringBuilder.append(a);
                stringBuilder.append(" in ");
                stringBuilder.append(a2);
                stringBuilder.append(", options format: ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(", hasAlpha: ");
                stringBuilder.append(hasAlpha);
                Log.v("BitmapEncoder", stringBuilder.toString());
            }
            return z;
        } catch (Throwable th2222) {
            e222 = th2222;
            outputStream3 = null;
            if (outputStream3 != null) {
                outputStream3.close();
            }
            throw e222;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            valueOf = String.valueOf(compressFormat);
            a = arq.m647a(bitmap);
            a2 = arm.m629a(a3);
            valueOf2 = String.valueOf(adp.m6303a(f19788b));
            hasAlpha = bitmap.hasAlpha();
            stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 105) + String.valueOf(valueOf2).length());
            stringBuilder.append("Compressed with type: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" of size ");
            stringBuilder.append(a);
            stringBuilder.append(" in ");
            stringBuilder.append(a2);
            stringBuilder.append(", options format: ");
            stringBuilder.append(valueOf2);
            stringBuilder.append(", hasAlpha: ");
            stringBuilder.append(hasAlpha);
            Log.v("BitmapEncoder", stringBuilder.toString());
        }
        return z;
    }

    /* renamed from: a */
    public final adh mo2592a(adp adp) {
        return adh.TRANSFORMED;
    }
}
