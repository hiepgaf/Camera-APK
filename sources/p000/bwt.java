package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: bwt */
public final class bwt implements bwp {
    /* renamed from: a */
    private final List f20169a = new ArrayList(400);
    /* renamed from: b */
    private boolean f20170b = true;
    /* renamed from: c */
    private final /* synthetic */ ccq f20171c;

    public bwt(ccq ccq) {
        this.f20171c = ccq;
    }

    public final synchronized void close() {
        this.f20170b = false;
        this.f20171c.m8010a((bwp) this);
    }

    /* renamed from: a */
    public final synchronized void mo2712a(long j, long j2, bwq bwq) {
        if (this.f20170b) {
            synchronized (this.f20171c) {
                int i;
                bwr bwr;
                long j3;
                bwr bwr2;
                this.f20169a.clear();
                for (i = this.f20171c.f11656c; i < 400; i++) {
                    bwr = (bwr) this.f20171c.f11654a.get(i);
                    j3 = bwr.f1661e;
                    if (j3 > j2) {
                        i = 0;
                        break;
                    }
                    if (j3 >= j) {
                        bwr2 = (bwr) this.f20171c.f11655b.m4053a();
                        bwr2.m1022a(bwr);
                        this.f20169a.add(bwr2);
                    }
                }
                i = 0;
                while (true) {
                    ccq ccq = this.f20171c;
                    if (i < ccq.f11656c) {
                        bwr = (bwr) ccq.f11654a.get(i);
                        j3 = bwr.f1661e;
                        if (j3 > j2) {
                            break;
                        }
                        if (j3 >= j) {
                            bwr2 = (bwr) this.f20171c.f11655b.m4053a();
                            bwr2.m1022a(bwr);
                            this.f20169a.add(bwr2);
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            bwq.mo549a(this.f20169a);
            synchronized (this.f20171c) {
                for (int i2 = 0; i2 < this.f20169a.size(); i2++) {
                    this.f20171c.f11655b.m4054a((bwr) this.f20169a.get(i2));
                }
                this.f20169a.clear();
            }
        } else {
            bwq.mo549a(Collections.emptyList());
        }
    }
}
