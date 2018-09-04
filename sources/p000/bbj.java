package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: bbj */
public final class bbj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ List f1060a;
    /* renamed from: b */
    private final /* synthetic */ bcp f1061b;

    public bbj(List list, bcp bcp) {
        this.f1060a = list;
        this.f1061b = bcp;
    }

    public final void run() {
        Object obj = null;
        int i = 1;
        for (bbi bbi : this.f1060a) {
            i &= bbi.mo2656b();
            if (bbi.mo2656b() && bbi.mo2654a() != null) {
                this.f1061b.m14754a(bbi.mo2654a());
                obj = 1;
            }
        }
        if (obj != null || this.f1061b.mo2656b()) {
            for (bbi bbi2 : this.f1060a) {
                bbi2.close();
            }
        } else if (i != 0) {
            iqo bbo = new bbo();
            try {
                for (bbi bbi22 : this.f1060a) {
                    boolean z;
                    jri.m13153b(bbi22.mo2656b());
                    if (bbi22.mo2654a() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jri.m13153b(z);
                    iqo c = bbi22.mo2657c();
                    if (c != null) {
                        bbo.add(c);
                    } else {
                        this.f1061b.close();
                    }
                    bbi22.close();
                }
            } finally {
                this.f1061b.m14753a(bbo);
            }
        }
    }
}
