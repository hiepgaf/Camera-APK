package p000;

import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bng */
final class bng implements bno {
    /* renamed from: a */
    private final /* synthetic */ bnd f11063a;

    bng(bnd bnd) {
        this.f11063a = bnd;
    }

    /* renamed from: a */
    public final void mo531a(long j) {
    }

    /* renamed from: a */
    public final void mo534a(UUID uuid, long j, IOException iOException) {
        bnh bnh = (bnh) this.f11063a.f11050h.get(uuid);
        if (bnh != null) {
            bnh.f1345i.m8413e();
        }
    }

    /* renamed from: a */
    public final void mo532a(bnk bnk) {
        bnh bnh = (bnh) this.f11063a.f11050h.get(bnk.f11069a);
        if (bnh != null) {
            if (bnh.f1342f.incrementAndGet() == 3) {
                this.f11063a.f11051i.execute(new bne(bnh, bnk));
            }
            bnh.f1337a.mo2868a((bnl) bnk);
            bnh.f1345i.m8414f();
            this.f11063a.m7566a(bnh);
        } else {
            bnk.mo537a();
        }
        if (this.f11063a.f11056n.get()) {
            this.f11063a.m7575h();
        }
    }

    /* renamed from: a */
    public final void mo533a(fkp fkp) {
        UUID uuid = (UUID) fkp.m17317a(fkr.f4604d);
        bnh bnh = (bnh) this.f11063a.f11050h.get(uuid);
        if (bnh != null) {
            int incrementAndGet = bnh.f1343g.incrementAndGet();
            bnh.f1344h.mo548a(incrementAndGet);
            if (incrementAndGet >= 3) {
                this.f11063a.m7568a(uuid, true);
            }
        }
    }
}
