package p000;

import android.view.Surface;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fhf */
final class fhf implements iwh {
    /* renamed from: a */
    private final Map f16019a;
    /* renamed from: b */
    private final /* synthetic */ fhe f16020b;

    public fhf(fhe fhe, Map map) {
        this.f16020b = fhe;
        this.f16019a = kes.m4806a(map);
    }

    /* renamed from: a */
    public final void mo444a(iwo iwo, Surface surface, long j) {
        Object b = iwo.mo3140b();
        ird ird = this.f16020b.f16014b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
        stringBuilder.append("onCaptureBufferLost_");
        stringBuilder.append(valueOf);
        ird.mo1903a(stringBuilder.toString());
        ((fiw) jri.m13152b((fiw) this.f16019a.get(b))).mo455a(surface, j);
        this.f16020b.f16014b.mo1904b();
    }

    /* renamed from: a */
    public final void mo446a(iwo iwo, iwp iwp) {
        Object b = iwo.mo3140b();
        ird ird = this.f16020b.f16014b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("onCaptureCompleted_");
        stringBuilder.append(valueOf);
        ird.mo1903a(stringBuilder.toString());
        ((fiw) jri.m13152b((fiw) this.f16019a.get(b))).a_(iwp);
        this.f16020b.f16014b.mo1904b();
    }

    /* renamed from: a */
    public final void mo445a(iwo iwo, iwm iwm) {
        Object b = iwo.mo3140b();
        ird ird = this.f16020b.f16014b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("onCaptureFailed_");
        stringBuilder.append(valueOf);
        ird.mo1903a(stringBuilder.toString());
        ((fiw) jri.m13152b((fiw) this.f16019a.get(b))).mo456a(iwm);
        this.f16020b.f16014b.mo1904b();
    }

    /* renamed from: b */
    public final void mo447b(iwo iwo, iwp iwp) {
        Object b = iwo.mo3140b();
        ird ird = this.f16020b.f16014b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
        stringBuilder.append("onCaptureProgressed_");
        stringBuilder.append(valueOf);
        ird.mo1903a(stringBuilder.toString());
        ((fiw) jri.m13152b((fiw) this.f16019a.get(b))).mo1391c(iwp);
        this.f16020b.f16014b.mo1904b();
    }

    /* renamed from: a */
    public final void mo441a(int i) {
        for (fiw a : this.f16019a.values()) {
            a.mo1388a(i);
        }
    }

    /* renamed from: a */
    public final void mo442a(int i, long j) {
        for (fiw a : this.f16019a.values()) {
            a.mo1389a(i, j);
        }
    }

    /* renamed from: a */
    public final void mo443a(iwo iwo, long j, long j2) {
        Object b = iwo.mo3140b();
        ird ird = this.f16020b.f16014b;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
        stringBuilder.append("onCaptureStarted_");
        stringBuilder.append(valueOf);
        stringBuilder.append("@");
        stringBuilder.append(j);
        ird.mo1903a(stringBuilder.toString());
        fhq fhq = new fhq(j, (long) this.f16020b.f16013a.incrementAndGet(), j2);
        ((fiw) jri.m13152b((fiw) this.f16019a.get(b))).mo508a(fhq);
        ((fiw) jri.m13152b((fiw) this.f16019a.get(b))).mo1390b(fhq);
        this.f16020b.f16014b.mo1904b();
    }
}
