package p000;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: kom */
final class kom extends koc {
    /* renamed from: d */
    private List f22455d;
    /* renamed from: e */
    private final /* synthetic */ kol f22456e;

    private kom(kol kol, keh keh, boolean z) {
        List e;
        this.f22456e = kol;
        super(kol, keh, z);
        if (keh.isEmpty()) {
            e = ken.m13464e();
        } else {
            e = khb.m4863a(keh.size());
        }
        this.f22455d = e;
        for (int i = 0; i < keh.size(); i++) {
            this.f22455d.add(null);
        }
    }

    kom(kol kol, keh keh, boolean z, byte b) {
        this(kol, keh, z);
    }

    /* renamed from: a */
    final void mo3248a(boolean z, int i, Object obj) {
        boolean z2 = true;
        List list = this.f22455d;
        if (list != null) {
            list.set(i, kbg.m4744b(obj));
            return;
        }
        if (!(z || this.f22456e.isCancelled())) {
            z2 = false;
        }
        jri.m13154b(z2, (Object) "Future was done before all dependencies completed");
    }

    /* renamed from: b */
    final void mo3249b() {
        List<kbg> list = this.f22455d;
        if (list != null) {
            kol kol = this.f22456e;
            List a = khb.m4863a(list.size());
            for (kbg kbg : list) {
                Object c;
                if (kbg != null) {
                    c = kbg.mo2085c();
                } else {
                    c = null;
                }
                a.add(c);
            }
            kol.mo3557a((Object) Collections.unmodifiableList(a));
            return;
        }
        jri.m13153b(this.f22456e.isDone());
    }

    /* renamed from: d */
    final void mo3250d() {
        super.mo3250d();
        this.f22455d = null;
    }
}
