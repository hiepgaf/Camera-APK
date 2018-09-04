package p000;

/* compiled from: PG */
/* renamed from: ezg */
public final class ezg implements ezi {
    /* renamed from: a */
    private final exk f15808a;
    /* renamed from: b */
    private gid f15809b = null;

    public ezg(exk exk) {
        this.f15808a = exk;
    }

    /* renamed from: a */
    public final String mo1321a() {
        return "motion blur";
    }

    /* renamed from: a */
    public final synchronized boolean mo1322a(gid gid, gid gid2) {
        boolean z = false;
        synchronized (this) {
            gid gid3 = this.f15809b;
            if (gid3 == null || Math.abs(gid.f16923a - gid3.f16923a) > 100000000) {
                this.f15809b = gid;
            } else {
                float a = this.f15808a.mo1318a(gid, gid3);
                long j = gid.f16924b;
                this.f15809b = gid;
                if (a * ((float) j) > 1.0E9f) {
                    this.f15809b = null;
                    z = true;
                }
            }
        }
        return z;
    }
}
