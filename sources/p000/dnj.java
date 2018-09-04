package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dnj */
final class dnj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ List f3162a;
    /* renamed from: b */
    private final /* synthetic */ dni f3163b;

    dnj(dni dni, List list) {
        this.f3163b = dni;
        this.f3162a = list;
    }

    public final void run() {
        bgl bgl;
        this.f3163b.f13588a.f21122e.close();
        if (this.f3162a.isEmpty()) {
            bgl = null;
        } else {
            bgl = (bgl) this.f3162a.get(0);
        }
        this.f3163b.f13588a.f1595a.mo573a(new dlt(bgl));
    }
}
