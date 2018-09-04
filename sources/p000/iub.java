package p000;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: iub */
public final class iub implements ixe {
    /* renamed from: a */
    private final Object f21784a = new Object();
    /* renamed from: b */
    private final ImageWriter f21785b;
    /* renamed from: c */
    private final int f21786c;
    /* renamed from: d */
    private final int f21787d;

    public iub(ImageWriter imageWriter) {
        this.f21785b = imageWriter;
        this.f21786c = this.f21785b.getFormat();
        this.f21787d = this.f21785b.getMaxImages();
    }

    public final void close() {
        synchronized (this.f21784a) {
            this.f21785b.close();
        }
    }

    /* renamed from: a */
    public final iwz mo3157a(long j) {
        iwz itv;
        synchronized (this.f21784a) {
            try {
                Image dequeueInputImage = this.f21785b.dequeueInputImage();
                dequeueInputImage.setTimestamp(j);
                itv = new itv(dequeueInputImage);
            } catch (Throwable e) {
                throw new isr(e);
            }
        }
        return itv;
    }

    /* renamed from: a */
    public final int mo3156a() {
        return this.f21787d;
    }

    /* renamed from: a */
    public final void mo3158a(iwz iwz) {
        synchronized (this.f21784a) {
            try {
                this.f21785b.queueInputImage((Image) ion.m3945a((iwe) iwz));
            } catch (Throwable e) {
                throw new isr(e);
            }
        }
        iwz.close();
    }

    /* renamed from: a */
    public final void mo3159a(ixg ixg, Handler handler) {
        jri.m13152b((Object) ixg);
        jri.m13152b((Object) handler);
        synchronized (this.f21784a) {
            try {
                this.f21785b.setOnImageReleasedListener(new iuc(ixg), handler);
            } catch (IllegalStateException e) {
            }
        }
    }

    public final String toString() {
        return jqk.m13098b((Object) this).m4742a("format", ion.m3961b(this.f21786c)).toString();
    }
}
