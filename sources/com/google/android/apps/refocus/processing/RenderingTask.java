package com.google.android.apps.refocus.processing;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.media.CameraProfile;
import android.net.Uri;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.image.RGBZ.Data;
import com.google.android.apps.refocus.processing.Renderer.Priority;
import com.google.android.apps.refocus.processing.TiledRenderer.Options;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.bli;
import p000.epl;
import p000.get;
import p000.gex;
import p000.glm;
import p000.glw;
import p000.glx;
import p000.gmz;
import p000.gnf;
import p000.gnu;
import p000.goe;
import p000.hci;
import p000.iqb;
import p000.itg;
import p000.jri;
import p000.kbg;
import p000.ken;

/* compiled from: PG */
public class RenderingTask implements gex {
    public static final int JPEG_QUALITY = CameraProfile.getJpegEncodingQualityParameter(2);
    public static final String TAG = bli.m862a("RenderingTask");
    public ProgressCallback callback;
    public final glm captureSessionListener = new C01411();
    public final ContentResolver contentResolver;
    public final List finishedCallback;
    public final FocusSettings focusSettings;
    public final Location location;
    public final String name;
    public RGBZ rgbz;
    public gmz session;
    public final Uri uri;

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.refocus.processing.RenderingTask$1 */
    class C01411 implements glm {
        C01411() {
        }

        public void onCaptureCanceled(int i, int i2) {
            if (RenderingTask.this.callback != null) {
                RenderingTask.this.callback.cancel();
            }
        }

        public void onCaptureDeleted() {
            if (RenderingTask.this.callback != null) {
                RenderingTask.this.callback.cancel();
            }
        }

        public void onCaptureFailed(int i, int i2) {
        }

        public void onCaptureFinalized() {
        }

        public void onCapturePersisted(int i, int i2) {
        }

        public void onCaptureStartCommitted(int i, int i2) {
        }

        public void onCaptureStarted(glw glw) {
        }

        public void onLuckyShotSessionMetadataReceived(epl epl) {
        }

        public void onMediumThumb() {
        }

        public void onReprocessingFinished(long j, long j2) {
        }

        public void onTinyThumb() {
        }
    }

    public RenderingTask(Uri uri, FocusSettings focusSettings, RGBZ rgbz, String str, Location location, FaceDetector faceDetector, ContentResolver contentResolver, gnu gnu, gnf gnf) {
        this.uri = uri;
        if (focusSettings == null) {
            bli.m863a(TAG, "No focus settings supplied, using default");
            this.focusSettings = FocusSettings.createDefault(faceDetector, new DepthOfFieldOptions(rgbz).rgbz);
        } else {
            this.focusSettings = focusSettings;
        }
        this.rgbz = rgbz;
        this.name = str.substring(0, str.lastIndexOf(46));
        this.location = location;
        this.contentResolver = contentResolver;
        gnf gnf2 = gnf;
        this.session = gnf2.m2630a(getName(), kbg.m4744b(getLocation()), System.currentTimeMillis(), new goe(gnu, "TEMP_SESSIONS", getName()));
        this.finishedCallback = new ArrayList();
    }

    public void addFinishedCallback(iqb iqb) {
        jri.m13152b((Object) iqb);
        this.finishedCallback.add(iqb);
    }

    public Location getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public get getSession() {
        return this.session;
    }

    public void process(Context context) {
        processInternal(context, this.session);
        ken a = ken.m13458a(this.finishedCallback);
        int size = a.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((iqb) a.get(i)).mo369a(this);
            i = i2;
        }
    }

    private void processInternal(Context context, gmz gmz) {
        if (this.rgbz == null) {
            try {
                this.rgbz = new RGBZ(this.uri, this.contentResolver);
            } catch (IOException e) {
                String str = TAG;
                String valueOf = String.valueOf(e.toString());
                String str2 = "Error creating RGBZ: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m866b(str, valueOf);
                return;
            }
        }
        if (this.rgbz.hasDepthmap()) {
            gmz.m17442a(this.uri, hci.m11749a((int) R.string.processing_notification, new Object[0]), glw.LENS_BLUR_RERENDER);
            this.callback = new ProgressCallbackImpl(gmz);
            Bitmap renderRGBZ = renderRGBZ(context, this.callback);
            if (renderRGBZ == null) {
                gmz.mo2879f();
                return;
            }
            this.rgbz.setPreview(renderRGBZ);
            this.rgbz.setFocusSettings(this.focusSettings);
            Data createRgbzFile = this.rgbz.createRgbzFile(JPEG_QUALITY);
            if (this.location != null) {
                new itg(createRgbzFile.exif).m4200a(this.location);
            }
            glx.m11180a((get) gmz, createRgbzFile.fileData, this.rgbz.getWidth(), this.rgbz.getHeight(), 0, createRgbzFile.exif);
        }
    }

    public void releaseRgbz() {
        this.rgbz = null;
    }

    public void removeFinishedCallback(iqb iqb) {
        jri.m13152b((Object) iqb);
        this.finishedCallback.remove(iqb);
    }

    private Bitmap renderRGBZ(Context context, ProgressCallback progressCallback) {
        DepthOfFieldOptions depthOfFieldOptions = new DepthOfFieldOptions(this.rgbz);
        int width = depthOfFieldOptions.rgbz.getWidth();
        int height = depthOfFieldOptions.rgbz.getHeight();
        FocusSettings focusSettings = this.focusSettings;
        depthOfFieldOptions.focalDepth = focusSettings.focalDistance;
        depthOfFieldOptions.depthOfField = focusSettings.depthOfField;
        depthOfFieldOptions.blurInfinity = ((float) Math.max(width, height)) * focusSettings.blurAtInfinity;
        return new TiledRenderer(new Options(), new Renderer(context, Priority.LOW)).render(depthOfFieldOptions, progressCallback);
    }

    public void resume() {
    }

    public void suspend() {
    }

    public String toString() {
        String valueOf = String.valueOf(this.uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
        stringBuilder.append("RenderingTask{ uri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
