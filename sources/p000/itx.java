package p000;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import com.google.android.camera.experimental2016.ExperimentalImageReaderExtensions;

/* compiled from: PG */
/* renamed from: itx */
final class itx implements ixb {
    /* renamed from: a */
    private final Object f21781a = new Object();
    /* renamed from: b */
    private final ImageReader f21782b;
    /* renamed from: c */
    private final boolean f21783c;

    itx(ImageReader imageReader, boolean z) {
        this.f21782b = imageReader;
        this.f21783c = z;
    }

    /* renamed from: a */
    public final iwz mo3147a() {
        synchronized (this.f21781a) {
            Image acquireLatestImage = this.f21782b.acquireLatestImage();
            if (acquireLatestImage == null) {
                return null;
            }
            iwz itv = new itv(acquireLatestImage);
            return itv;
        }
    }

    /* renamed from: b */
    public final iwz mo3149b() {
        synchronized (this.f21781a) {
            Image acquireNextImage = this.f21782b.acquireNextImage();
            if (acquireNextImage == null) {
                return null;
            }
            iwz itv = new itv(acquireNextImage);
            return itv;
        }
    }

    public final void close() {
        synchronized (this.f21781a) {
            this.f21782b.close();
        }
    }

    /* renamed from: c */
    public final void mo3150c() {
        synchronized (this.f21781a) {
            if (this.f21783c) {
                this.f21782b.discardFreeBuffers();
            } else {
                ImageReader imageReader = this.f21782b;
                if (hsx.m3356a(hsx.f6598a, 1)) {
                    ExperimentalImageReaderExtensions.discardFreeBuffers(imageReader);
                } else if (hsx.m3356a(hsx.f6598a, 2)) {
                    com.google.android.camera.experimental2017.ExperimentalImageReaderExtensions.discardFreeBuffers(imageReader);
                } else {
                    throw new RuntimeException("Implementation isn't available");
                }
            }
        }
    }

    /* renamed from: d */
    public final int mo3151d() {
        int height;
        synchronized (this.f21781a) {
            height = this.f21782b.getHeight();
        }
        return height;
    }

    /* renamed from: e */
    public final int mo3152e() {
        int imageFormat;
        synchronized (this.f21781a) {
            imageFormat = this.f21782b.getImageFormat();
        }
        return imageFormat;
    }

    /* renamed from: f */
    public final int mo3153f() {
        int maxImages;
        synchronized (this.f21781a) {
            maxImages = this.f21782b.getMaxImages();
        }
        return maxImages;
    }

    /* renamed from: g */
    public final Surface mo3154g() {
        Surface surface;
        synchronized (this.f21781a) {
            surface = this.f21782b.getSurface();
        }
        return surface;
    }

    /* renamed from: h */
    public final int mo3155h() {
        int width;
        synchronized (this.f21781a) {
            width = this.f21782b.getWidth();
        }
        return width;
    }

    /* renamed from: a */
    public final void mo3148a(ixd ixd, Handler handler) {
        synchronized (this.f21781a) {
            this.f21782b.setOnImageAvailableListener(new ity(ixd), handler);
        }
    }

    public final String toString() {
        kbd b;
        synchronized (this.f21781a) {
            b = jqk.m13098b(this.f21782b);
        }
        return b.m4740a("width", mo3155h()).m4740a("height", mo3151d()).m4742a("format", ion.m3961b(mo3152e())).m4740a("max images", mo3153f()).toString();
    }
}
