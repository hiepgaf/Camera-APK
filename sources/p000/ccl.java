package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: ccl */
public final class ccl implements kwk {
    /* renamed from: a */
    private final cdi f11641a;
    /* renamed from: b */
    private final int f11642b;
    /* renamed from: c */
    private final byte[] f11643c = new byte[this.f11642b];
    /* renamed from: d */
    private final iqr f11644d = new iqr(new bxo(), this.f11642b / 104);
    /* renamed from: e */
    private long f11645e;
    /* renamed from: f */
    private long f11646f;
    /* renamed from: g */
    private int f11647g;
    /* renamed from: h */
    private long f11648h;
    /* renamed from: i */
    private long f11649i;
    /* renamed from: j */
    private int f11650j;

    public ccl(cdi cdi) {
        this.f11641a = cdi;
        this.f11642b = (((cdi.f1847a.getWidth() * cdi.f1847a.getHeight()) * cdi.f1847a.getLayers()) / 104) * 104;
    }

    /* renamed from: b */
    private final synchronized void m7996b() {
        synchronized (this) {
            this.f11641a.m1114a(this.f11643c, 0, 0, this.f11642b);
            this.f11645e = 0;
            this.f11646f = 0;
            this.f11647g = 0;
            this.f11648h = 0;
            this.f11649i = 0;
            this.f11650j = 0;
            for (int i = 0; i < this.f11642b; i += 104) {
                long c = cci.m7989c(this.f11643c, i);
                if (c > this.f11646f) {
                    this.f11646f = c;
                    this.f11647g = i;
                }
                if (c != 0) {
                    long j = this.f11649i;
                    if (j == 0 || c < j) {
                        this.f11649i = c;
                        this.f11650j = i;
                    }
                }
            }
            if (this.f11646f > 0) {
                this.f11645e = cci.m7990d(this.f11643c, this.f11647g);
            }
            if (this.f11649i > 0) {
                this.f11648h = cci.m7990d(this.f11643c, this.f11650j);
            }
        }
    }

    /* renamed from: c */
    private final synchronized void m7997c() {
        if (this.f11646f == 0 || this.f11649i == 0) {
            m7996b();
        } else {
            m7995a(this.f11647g);
            long c = cci.m7989c(this.f11643c, this.f11647g);
            long j = this.f11646f;
            if (c != j) {
                m7996b();
            } else {
                int i = (this.f11647g + 104) % this.f11642b;
                c = j + 1;
                while (true) {
                    m7995a(i);
                    j = cci.m7989c(this.f11643c, i);
                    if (j != c) {
                        break;
                    }
                    this.f11647g = i;
                    this.f11646f = c;
                    this.f11645e = cci.m7990d(this.f11643c, i);
                    i = (i + 104) % this.f11642b;
                    c++;
                }
                if (j != 0 && j > this.f11649i) {
                    this.f11650j = i;
                    this.f11649i = j;
                    this.f11648h = cci.m7990d(this.f11643c, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final synchronized void m7999a(long j, long j2, List list) {
        list.clear();
        m7997c();
        if (j <= this.f11645e) {
            long j3 = this.f11648h;
            if (j2 >= j3) {
                long j4 = this.f11649i;
                int i = this.f11650j;
                while (true) {
                    if (j3 >= j && j3 <= j2) {
                        bwr bwr = (bwr) this.f11644d.m4053a();
                        byte[] bArr = this.f11643c;
                        bwr.f1657a = cci.m7988b(bArr, i);
                        bwr.f1658b = cci.m7988b(bArr, i + 4);
                        bwr.f1659c = cci.m7988b(bArr, i + 8);
                        bwr.f1660d = cci.m7989c(bArr, i);
                        bwr.f1661e = cci.m7990d(bArr, i);
                        bwr.f1662f = cci.m7987a(bArr, i + 24);
                        bwr.f1663g = cci.m7987a(bArr, i + 28);
                        bwr.f1664h = cci.m7987a(bArr, i + 32);
                        list.add(bwr);
                    }
                    int i2 = i + 104;
                    if (i2 >= this.f11642b) {
                        i2 = 0;
                    }
                    j3 = cci.m7989c(this.f11643c, i2);
                    if (j3 == 0 || j3 < r4) {
                        break;
                    }
                    j4 = cci.m7990d(this.f11643c, i2);
                    if (j4 > j2) {
                        break;
                    }
                    i = i2;
                    long j5 = j3;
                    j3 = j4;
                    j4 = j5;
                }
            }
        }
    }

    /* renamed from: a */
    private final synchronized void m7995a(int i) {
        this.f11641a.m1114a(this.f11643c, i, i, 104);
    }

    /* renamed from: a */
    public final synchronized void m8000a(List list) {
        for (bwr a : list) {
            this.f11644d.m4054a(a);
        }
        list.clear();
    }
}
