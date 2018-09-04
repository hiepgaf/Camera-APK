package p000;

/* compiled from: PG */
/* renamed from: cqy */
public final class cqy {
    /* renamed from: a */
    public cqz f2574a = null;
    /* renamed from: b */
    public cqz f2575b = null;
    /* renamed from: c */
    public int f2576c = 0;

    /* renamed from: a */
    public final cra m1412a(cra cra, Object obj) {
        cqz cqz = new cqz(this, obj);
        if (this.f2576c == 0) {
            this.f2574a = cqz;
            this.f2575b = cqz;
        } else if (cra == null) {
            cqy.m1410a(cqz, this.f2574a);
            this.f2574a = cqz;
        } else {
            boolean z;
            if (cra.mo1055d() == this) {
                z = true;
            } else {
                z = false;
            }
            jri.m13144a(z, (Object) "Node is not part of this list.");
            cqz cqz2 = (cqz) cra;
            cqz cqz3 = cqz2.f12547a;
            cqy.m1410a(cqz2, cqz);
            cqy.m1410a(cqz, cqz3);
            if (cra == this.f2575b) {
                this.f2575b = cqz;
            }
        }
        this.f2576c++;
        return cqz;
    }

    /* renamed from: a */
    public final cra m1411a(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f2576c) {
            z = true;
        }
        int i2 = this.f2576c;
        StringBuilder stringBuilder = new StringBuilder(61);
        stringBuilder.append("Index: ");
        stringBuilder.append(i);
        stringBuilder.append(" out of range for list of size: ");
        stringBuilder.append(i2);
        jri.m13144a(z, stringBuilder.toString());
        cra cra = this.f2574a;
        while (i > 0) {
            cra = cra.mo1056e();
            i--;
        }
        return cra;
    }

    /* renamed from: a */
    private static void m1410a(cqz cqz, cqz cqz2) {
        if (cqz != null) {
            cqz.f12547a = cqz2;
        }
        if (cqz2 != null) {
            cqz2.f12548b = cqz;
        }
    }
}
