package p000;

import android.view.Surface;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: bhk */
final class bhk implements iwh {
    /* renamed from: a */
    private final Map f10880a;
    /* renamed from: b */
    private final /* synthetic */ bhj f10881b;

    bhk(bhj bhj, Map map) {
        this.f10881b = bhj;
        this.f10880a = map;
    }

    /* renamed from: a */
    private final fiw m7383a(iwo iwo) {
        boolean z = true;
        Object b = iwo.mo3140b();
        if (b != null || !this.f10881b.f10877c.f7504e) {
            return (fiw) this.f10880a.get(b);
        }
        bli.m866b(bhj.f10875a, "Invoking listener for null tag, ideally should never happen");
        if (this.f10880a.size() != 1) {
            z = false;
        }
        jri.m13154b(z, (Object) "Since we submit one request at a time, only one listener should be in the map.");
        return (fiw) ((Entry) this.f10880a.entrySet().iterator().next()).getValue();
    }

    /* renamed from: a */
    public final void mo444a(iwo iwo, Surface surface, long j) {
        ((fiw) jri.m13152b(m7383a(iwo))).mo455a(surface, j);
    }

    /* renamed from: a */
    public final void mo446a(iwo iwo, iwp iwp) {
        ((fiw) jri.m13152b(m7383a(iwo))).a_(iwp);
    }

    /* renamed from: a */
    public final void mo445a(iwo iwo, iwm iwm) {
        ((fiw) jri.m13152b(m7383a(iwo))).mo456a(iwm);
    }

    /* renamed from: b */
    public final void mo447b(iwo iwo, iwp iwp) {
        ((fiw) jri.m13152b(m7383a(iwo))).mo1391c(iwp);
    }

    /* renamed from: a */
    public final void mo441a(int i) {
        for (fiw a : this.f10880a.values()) {
            a.mo1388a(i);
        }
    }

    /* renamed from: a */
    public final void mo442a(int i, long j) {
        for (fiw a : this.f10880a.values()) {
            a.mo1389a(i, j);
        }
    }

    /* renamed from: a */
    public final void mo443a(iwo iwo, long j, long j2) {
        ((fiw) jri.m13152b(m7383a(iwo))).mo508a(new fhq(j, (long) this.f10881b.f10876b.incrementAndGet(), j2));
    }
}
