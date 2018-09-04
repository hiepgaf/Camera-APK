package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: ggo */
final class ggo extends ggx {
    /* renamed from: a */
    public final /* synthetic */ ggt f21460a;
    /* renamed from: b */
    public final /* synthetic */ ggt f21461b;
    /* renamed from: i */
    private final /* synthetic */ byte[] f21462i;
    /* renamed from: j */
    private final /* synthetic */ int[] f21463j;
    /* renamed from: k */
    private final /* synthetic */ kpk f21464k;

    ggo(ggr ggr, int i, byte[] bArr, ggt ggt, int[] iArr, ggt ggt2, kpk kpk) {
        this.f21462i = bArr;
        this.f21460a = ggt;
        this.f21463j = iArr;
        this.f21461b = ggt2;
        this.f21464k = kpk;
        super(ggr, i);
    }

    public final void run() {
        byte[] bArr = this.f21462i;
        ggt ggt = this.f21460a;
        byte[] a = ggx.m11073a(bArr, ggt.f5172c, ggt.f5171b, this.f21463j);
        m11077a(this.e, this.f21461b, a, go.aX);
        ExifInterface a2 = m11075a(kau.f19138a, this.f21461b, this.f21464k);
        ((grg) jri.m13152b(this.h.mo1482h())).mo1512a(a2);
        get get = this.h;
        ggt ggt2 = this.f21461b;
        kow.m13622a(glx.m11180a(get, a, ggt2.f5172c, ggt2.f5171b, ggt2.f5170a.f7326e, a2), new ggp(this), kpq.f8410a);
        if (this.f21464k.isDone()) {
            try {
                ((grg) jri.m13152b(this.h.mo1482h())).mo1517a((iwp) this.f21464k.get());
                ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
            } catch (InterruptedException e) {
                bli.m866b(ggn.f21458a, "CaptureResults not added to photoCaptureDoneEvent event due to Interrupted Exception.");
                ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
            } catch (ExecutionException e2) {
                bli.m873e(ggn.f21458a, "CaptureResults not added to photoCaptureDoneEvent event due to Execution Exception.");
                ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
            } catch (Throwable th) {
                Throwable th2 = th;
                ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
            }
        } else {
            bli.m873e(ggn.f21458a, "CaptureResults unavailable to photoCaptureDoneEvent event.");
            ((grg) jri.m13152b(this.h.mo1482h())).mo1524c();
        }
    }
}
