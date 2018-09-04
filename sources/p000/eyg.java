package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eyg */
public final class eyg {
    /* renamed from: a */
    public final kbg f4346a;
    /* renamed from: b */
    public final eym f4347b;
    /* renamed from: c */
    public final Map f4348c = new HashMap();

    public eyg(kbg kbg, eym eym) {
        this.f4346a = kbg;
        this.f4347b = eym;
    }

    /* renamed from: a */
    public final synchronized eyh m2191a(long j) {
        eyh eyh;
        Map map = this.f4348c;
        Long valueOf = Long.valueOf(j);
        jri.m13154b(map.containsKey(valueOf) ^ 1, (Object) "Current session exists; didn't clear last one?");
        jri.m13154b(this.f4346a.mo2084b(), (Object) "Trying to create a tone map session with no microvideo API");
        eyh = new eyh(this, j);
        this.f4348c.put(valueOf, eyh);
        return eyh;
    }

    /* renamed from: b */
    public final synchronized kbg m2192b(long j) {
        return kbg.m4744b((eyh) this.f4348c.get(Long.valueOf(j)));
    }
}
