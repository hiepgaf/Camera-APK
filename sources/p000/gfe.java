package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gfe */
final class gfe implements Runnable {
    /* renamed from: a */
    private final gfa f5135a;
    /* renamed from: b */
    private final gff f5136b;
    /* renamed from: c */
    private final ggr f5137c;
    /* renamed from: d */
    private final ird f5138d;

    public gfe(gfa gfa, gff gff, ggr ggr, ird ird) {
        this.f5135a = gfa;
        this.f5136b = gff;
        this.f5137c = ggr;
        this.f5138d = ird;
    }

    public final void run() {
        this.f5138d.mo1903a("TaskDoneWrapper#run");
        try {
            this.f5137c.run();
            gfu gfu = this.f5136b.f5139a;
            if (this.f5135a.m11029a(gfu)) {
                Set<iwz> set = this.f5136b.f5140b;
                gfa gfa = this.f5135a;
                synchronized (gfa.f16862b) {
                    for (iwz iwz : set) {
                        if (!(((gfd) gfa.f16862b.get(iwz)) == null || gfa.f16863c.contains(iwz))) {
                            gfa.f16863c.add(iwz);
                        }
                    }
                }
                Runnable runnable = gfu.f21452b;
                if (runnable != null) {
                    this.f5138d.mo1903a("TaskDoneWrapper#done#run");
                    Executor executor = this.f5137c.f5164d;
                    if (executor == null) {
                        runnable.run();
                    } else {
                        executor.execute(runnable);
                    }
                    this.f5138d.mo1904b();
                }
            }
            this.f5138d.mo1904b();
        } finally {
            this.f5135a.m11027a(this.f5137c);
        }
    }
}
