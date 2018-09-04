package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: eyv */
public final class eyv implements exf, eyt {
    /* renamed from: c */
    private static final long f15770c = Math.round(1.6666666666666666E7d);
    /* renamed from: a */
    public final exd f15771a;
    /* renamed from: b */
    public final eyx f15772b = new eyx();
    /* renamed from: d */
    private final AtomicBoolean f15773d;
    /* renamed from: e */
    private final long f15774e;
    /* renamed from: f */
    private final AtomicBoolean f15775f;
    /* renamed from: g */
    private final List f15776g;
    /* renamed from: h */
    private final Executor f15777h;
    /* renamed from: i */
    private final bmb f15778i;
    /* renamed from: j */
    private final List f15779j;
    /* renamed from: k */
    private volatile gid f15780k;
    /* renamed from: l */
    private volatile eyu f15781l;
    /* renamed from: m */
    private volatile long f15782m;
    /* renamed from: n */
    private volatile long f15783n;
    /* renamed from: o */
    private volatile ezj f15784o;

    public eyv(exd exd, long j, List list, ezj ezj, Executor executor, bmb bmb) {
        this.f15771a = exd;
        this.f15774e = j;
        this.f15776g = list;
        this.f15784o = ezj;
        this.f15777h = executor;
        this.f15773d = new AtomicBoolean(false);
        this.f15775f = new AtomicBoolean(true);
        this.f15783n = Long.MAX_VALUE;
        this.f15778i = bmb;
        this.f15779j = new ArrayList();
    }

    /* renamed from: b */
    private final synchronized void m10093b(gid gid) {
        this.f15779j.add(Float.valueOf(gid.f16932j));
    }

    /* renamed from: a */
    private final void m10091a(eyu eyu, long j) {
        boolean z = false;
        if (this.f15773d.compareAndSet(false, true) && eyu != null) {
            long min = Math.min(TimeUnit.MICROSECONDS.convert(this.f15783n, TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.f15774e, TimeUnit.NANOSECONDS) + 1500000);
            if (this.f15778i != null && this.f15784o.equals(ezj.TRIMMING_MODE_AUTO)) {
                z = m10095b();
            }
            if (min - j >= 1000000 && !z) {
                eyu.mo1291a(min);
            } else if (this.f15784o.equals(ezj.TRIMMING_MODE_AUTO)) {
                if (z) {
                    m10092a("static scene");
                } else {
                    m10092a("too short");
                }
                eyu.mo1290a();
            } else if (this.f15784o.equals(ezj.TRIMMING_MODE_NEVER_DROP)) {
                eyu.mo1291a(j + 1000000);
            } else {
                String valueOf = String.valueOf(this.f15784o);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                stringBuilder.append("Unknown trimming mode:");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    private final int m10090a(List list) {
        int size = list.size() - 1;
        while (size > 1 && ((gid) list.get(size)).f16923a > this.f15774e + f15770c) {
            size--;
        }
        this.f15780k = (gid) list.get(size);
        return size;
    }

    /* renamed from: a */
    public final long mo1319a() {
        List b = this.f15771a.m2186b();
        if (b.isEmpty()) {
            return TimeUnit.MICROSECONDS.convert(this.f15774e, TimeUnit.NANOSECONDS) - 1500000;
        }
        Object obj;
        int a = m10090a(b);
        long j = this.f15780k.f16923a;
        int i = a - 1;
        while (i >= 0) {
            gid gid = (gid) b.get(i);
            long j2 = gid.f16923a;
            gid gid2 = this.f15780k;
            if (gid2 == null) {
                obj = null;
            } else if (gid != null) {
                m10093b(gid);
                long j3 = gid.f16923a;
                long j4 = this.f15774e;
                if (j3 > j4) {
                    obj = null;
                } else if (j3 < j4 - 1500000000) {
                    m10096c("max length");
                    obj = 1;
                } else {
                    for (ezi ezi : this.f15776g) {
                        if (ezi.mo1322a(gid, gid2)) {
                            m10096c(ezi.mo1321a());
                            obj = 1;
                            break;
                        }
                    }
                    obj = null;
                }
            } else {
                obj = null;
            }
            if (obj != null && i <= a - 7) {
                obj = 1;
                break;
            }
            i--;
            j = j2;
        }
        obj = null;
        if (obj == null) {
            m10096c("max length");
        }
        this.f15782m = Math.max(TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.f15774e, TimeUnit.NANOSECONDS) - 1500000);
        return this.f15782m;
    }

    /* renamed from: b */
    private final synchronized boolean m10095b() {
        boolean z;
        float f = 0.0f;
        for (Float f2 : this.f15779j) {
            if (f2.floatValue() > f) {
                f = f2.floatValue();
            }
        }
        int i = 0;
        int i2 = 0;
        for (Float f22 : this.f15779j) {
            float floatValue;
            int i3;
            if (f22.floatValue() > 0.1f) {
                floatValue = f22.floatValue() / f;
            } else {
                floatValue = f22.floatValue();
            }
            if (floatValue > 0.3f) {
                int i4 = i;
                i = i2 + 1;
                i3 = i4;
            } else {
                i3 = i + 1;
                i = i2;
            }
            i2 = i;
            i = i3;
        }
        if (i2 == 0) {
            z = true;
        } else if (((float) i2) / ((float) (i + i2)) < 0.5f) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private final void m10092a(String str) {
        this.f15772b.f4371c = str;
    }

    /* renamed from: b */
    private final void m10094b(String str) {
        this.f15772b.f4370b = str;
    }

    /* renamed from: c */
    private final void m10096c(String str) {
        this.f15772b.f4369a = str;
    }

    /* renamed from: a */
    public final synchronized void mo1310a(gid gid) {
        eyu eyu = this.f15781l;
        long j = this.f15782m;
        if (this.f15775f.compareAndSet(true, false)) {
            List b = this.f15771a.m2186b();
            if (!b.isEmpty()) {
                this.f15783n = this.f15774e;
                for (int a = m10090a(b) + 1; a < b.size(); a++) {
                    gid gid2 = (gid) b.get(a);
                    if (m10097c(gid2)) {
                        m10091a(eyu, j);
                    }
                    this.f15783n = gid2.f16923a;
                }
            }
        } else if (m10097c(gid)) {
            m10091a(eyu, j);
        }
        this.f15783n = gid.f16923a;
    }

    /* renamed from: c */
    private final boolean m10097c(gid gid) {
        gid gid2 = this.f15780k;
        if (gid2 == null || gid == null) {
            return false;
        }
        m10093b(gid);
        long j = gid.f16923a;
        long j2 = this.f15774e;
        if (j < j2) {
            return false;
        }
        if (j > j2 + 1500000000) {
            m10094b("max length");
            return true;
        }
        for (ezi ezi : this.f15776g) {
            if (ezi.mo1322a(gid, gid2)) {
                m10094b(ezi.mo1321a());
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1320a(eyu eyu) {
        this.f15781l = new eyw(this, eyu);
        this.f15771a.m2184a(this, this.f15777h);
    }
}
