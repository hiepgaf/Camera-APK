package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: khv */
final class khv {
    /* renamed from: a */
    public final Object f8299a;
    /* renamed from: b */
    public int f8300b;
    /* renamed from: c */
    public int f8301c;
    /* renamed from: d */
    public long f8302d;
    /* renamed from: e */
    public khv f8303e;
    /* renamed from: f */
    public khv f8304f;
    /* renamed from: g */
    public khv f8305g;
    /* renamed from: h */
    public khv f8306h;
    /* renamed from: i */
    private int f8307i;

    khv(Object obj, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f8299a = obj;
        this.f8300b = i;
        this.f8302d = (long) i;
        this.f8301c = 1;
        this.f8307i = 1;
        this.f8303e = null;
        this.f8304f = null;
    }

    /* renamed from: a */
    final khv m4929a(Comparator comparator, Object obj, int i, int[] iArr) {
        boolean z = false;
        int compare = comparator.compare(obj, this.f8299a);
        khv khv;
        int i2;
        if (compare < 0) {
            khv = this.f8303e;
            if (khv == null) {
                iArr[0] = 0;
                return m4916a(obj, i);
            }
            i2 = khv.f8307i;
            this.f8303e = khv.m4929a(comparator, obj, i, iArr);
            if (iArr[0] == 0) {
                this.f8301c++;
            }
            this.f8302d += (long) i;
            if (this.f8303e.f8307i != i2) {
                return m4920c();
            }
            return this;
        } else if (compare > 0) {
            khv = this.f8304f;
            if (khv == null) {
                iArr[0] = 0;
                return m4918b(obj, i);
            }
            i2 = khv.f8307i;
            this.f8304f = khv.m4929a(comparator, obj, i, iArr);
            if (iArr[0] == 0) {
                this.f8301c++;
            }
            this.f8302d += (long) i;
            if (this.f8304f.f8307i != i2) {
                return m4920c();
            }
            return this;
        } else {
            compare = this.f8300b;
            iArr[0] = compare;
            long j = (long) i;
            if (((long) compare) + j <= 2147483647L) {
                z = true;
            }
            jri.m13143a(z);
            this.f8300b += i;
            this.f8302d += j;
            return this;
        }
    }

    /* renamed from: a */
    private final khv m4916a(Object obj, int i) {
        this.f8303e = new khv(obj, i);
        kho.m17745a(this.f8305g, this.f8303e, this);
        this.f8307i = Math.max(2, this.f8307i);
        this.f8301c++;
        this.f8302d += (long) i;
        return this;
    }

    /* renamed from: b */
    private final khv m4918b(Object obj, int i) {
        this.f8304f = new khv(obj, i);
        kho.m17745a(this, this.f8304f, this.f8306h);
        this.f8307i = Math.max(2, this.f8307i);
        this.f8301c++;
        this.f8302d += (long) i;
        return this;
    }

    /* renamed from: a */
    private final int m4914a() {
        return khv.m4915a(this.f8303e) - khv.m4915a(this.f8304f);
    }

    /* renamed from: a */
    final khv m4927a(Comparator comparator, Object obj) {
        do {
            int compare = comparator.compare(obj, r1.f8299a);
            if (compare < 0) {
                khv khv = r1.f8303e;
                if (khv != null) {
                    return (khv) jqk.m13078a(khv.m4927a(comparator, obj), r1);
                }
                return r1;
            } else if (compare == 0) {
                return r1;
            } else {
                this = r1.f8304f;
            }
        } while (this != null);
        return null;
    }

    /* renamed from: b */
    private final khv m4917b() {
        int i = this.f8300b;
        this.f8300b = 0;
        kho.m17744a(this.f8305g, this.f8306h);
        khv khv = this.f8303e;
        if (khv == null) {
            return this.f8304f;
        }
        khv khv2 = this.f8304f;
        if (khv2 == null) {
            return khv;
        }
        if (khv.f8307i >= khv2.f8307i) {
            khv2 = this.f8305g;
            khv2.f8303e = khv.m4919b(khv2);
            khv2.f8304f = this.f8304f;
            khv2.f8301c = this.f8301c - 1;
            khv2.f8302d = this.f8302d - ((long) i);
            return khv2.m4920c();
        }
        khv = this.f8306h;
        khv.f8304f = khv2.m4921c(khv);
        khv.f8303e = this.f8303e;
        khv.f8301c = this.f8301c - 1;
        khv.f8302d = this.f8302d - ((long) i);
        return khv.m4920c();
    }

    /* renamed from: b */
    final khv m4930b(Comparator comparator, Object obj) {
        do {
            int compare = comparator.compare(obj, r1.f8299a);
            if (compare > 0) {
                khv khv = r1.f8304f;
                if (khv != null) {
                    return (khv) jqk.m13078a(khv.m4930b(comparator, obj), r1);
                }
                return r1;
            } else if (compare == 0) {
                return r1;
            } else {
                this = r1.f8303e;
            }
        } while (this != null);
        return null;
    }

    /* renamed from: a */
    private static int m4915a(khv khv) {
        return khv != null ? khv.f8307i : 0;
    }

    /* renamed from: c */
    private final khv m4920c() {
        switch (m4914a()) {
            case -2:
                if (this.f8304f.m4914a() > 0) {
                    this.f8304f = this.f8304f.m4926g();
                }
                return m4925f();
            case 2:
                if (this.f8303e.m4914a() < 0) {
                    this.f8303e = this.f8303e.m4925f();
                }
                return m4926g();
            default:
                m4924e();
                return this;
        }
    }

    /* renamed from: d */
    private final void m4923d() {
        this.f8301c = (kho.m17741a(this.f8303e) + 1) + kho.m17741a(this.f8304f);
        this.f8302d = (((long) this.f8300b) + khv.m4922d(this.f8303e)) + khv.m4922d(this.f8304f);
        m4924e();
    }

    /* renamed from: e */
    private final void m4924e() {
        this.f8307i = Math.max(khv.m4915a(this.f8303e), khv.m4915a(this.f8304f)) + 1;
    }

    /* renamed from: b */
    final khv m4931b(Comparator comparator, Object obj, int i, int[] iArr) {
        int compare = comparator.compare(obj, this.f8299a);
        khv khv;
        if (compare < 0) {
            khv = this.f8303e;
            if (khv == null) {
                iArr[0] = 0;
                return this;
            }
            this.f8303e = khv.m4931b(comparator, obj, i, iArr);
            compare = iArr[0];
            if (compare > 0) {
                if (i >= compare) {
                    this.f8301c--;
                    this.f8302d -= (long) compare;
                } else {
                    this.f8302d -= (long) i;
                }
            }
            if (compare != 0) {
                return m4920c();
            }
            return this;
        } else if (compare > 0) {
            khv = this.f8304f;
            if (khv == null) {
                iArr[0] = 0;
                return this;
            }
            this.f8304f = khv.m4931b(comparator, obj, i, iArr);
            compare = iArr[0];
            if (compare > 0) {
                if (i >= compare) {
                    this.f8301c--;
                    this.f8302d -= (long) compare;
                } else {
                    this.f8302d -= (long) i;
                }
            }
            return m4920c();
        } else {
            compare = this.f8300b;
            iArr[0] = compare;
            if (i >= compare) {
                return m4917b();
            }
            this.f8300b = compare - i;
            this.f8302d -= (long) i;
            return this;
        }
    }

    /* renamed from: b */
    private final khv m4919b(khv khv) {
        khv khv2 = this.f8304f;
        if (khv2 == null) {
            return this.f8303e;
        }
        this.f8304f = khv2.m4919b(khv);
        this.f8301c--;
        this.f8302d -= (long) khv.f8300b;
        return m4920c();
    }

    /* renamed from: c */
    private final khv m4921c(khv khv) {
        khv khv2 = this.f8303e;
        if (khv2 == null) {
            return this.f8304f;
        }
        this.f8303e = khv2.m4921c(khv);
        this.f8301c--;
        this.f8302d -= (long) khv.f8300b;
        return m4920c();
    }

    /* renamed from: f */
    private final khv m4925f() {
        boolean z;
        if (this.f8304f != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        khv khv = this.f8304f;
        this.f8304f = khv.f8303e;
        khv.f8303e = this;
        khv.f8302d = this.f8302d;
        khv.f8301c = this.f8301c;
        m4923d();
        khv.m4924e();
        return khv;
    }

    /* renamed from: g */
    private final khv m4926g() {
        boolean z;
        if (this.f8303e != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        khv khv = this.f8303e;
        this.f8303e = khv.f8304f;
        khv.f8304f = this;
        khv.f8302d = this.f8302d;
        khv.f8301c = this.f8301c;
        m4923d();
        khv.m4924e();
        return khv;
    }

    /* renamed from: a */
    final khv m4928a(Comparator comparator, Object obj, int i, int i2, int[] iArr) {
        int compare = comparator.compare(obj, this.f8299a);
        khv khv;
        if (compare < 0) {
            khv = this.f8303e;
            if (khv == null) {
                iArr[0] = 0;
                if (i != 0 || i2 <= 0) {
                    return this;
                }
                return m4916a(obj, i2);
            }
            this.f8303e = khv.m4928a(comparator, obj, i, i2, iArr);
            compare = iArr[0];
            if (compare == i) {
                if (i2 == 0 && compare != 0) {
                    this.f8301c--;
                } else if (i2 > 0 && compare == 0) {
                    this.f8301c++;
                }
                this.f8302d = ((long) (i2 - compare)) + this.f8302d;
            }
            return m4920c();
        } else if (compare > 0) {
            khv = this.f8304f;
            if (khv == null) {
                iArr[0] = 0;
                if (i != 0 || i2 <= 0) {
                    return this;
                }
                return m4918b(obj, i2);
            }
            this.f8304f = khv.m4928a(comparator, obj, i, i2, iArr);
            compare = iArr[0];
            if (compare == i) {
                if (i2 == 0 && compare != 0) {
                    this.f8301c--;
                } else if (i2 > 0 && compare == 0) {
                    this.f8301c++;
                }
                this.f8302d = ((long) (i2 - compare)) + this.f8302d;
            }
            return m4920c();
        } else {
            compare = this.f8300b;
            iArr[0] = compare;
            if (i != compare) {
                return this;
            }
            if (i2 == 0) {
                return m4917b();
            }
            this.f8302d = ((long) (i2 - compare)) + this.f8302d;
            this.f8300b = i2;
            return this;
        }
    }

    /* renamed from: c */
    final khv m4932c(Comparator comparator, Object obj, int i, int[] iArr) {
        int compare = comparator.compare(obj, this.f8299a);
        khv khv;
        if (compare < 0) {
            khv = this.f8303e;
            if (khv == null) {
                iArr[0] = 0;
                return i > 0 ? m4916a(obj, i) : this;
            } else {
                this.f8303e = khv.m4932c(comparator, obj, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f8301c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f8301c++;
                }
                this.f8302d += (long) (i - iArr[0]);
                return m4920c();
            }
        } else if (compare > 0) {
            khv = this.f8304f;
            if (khv == null) {
                iArr[0] = 0;
                if (i > 0) {
                    return m4918b(obj, i);
                }
                return this;
            }
            this.f8304f = khv.m4932c(comparator, obj, i, iArr);
            if (i == 0 && iArr[0] != 0) {
                this.f8301c--;
            } else if (i > 0 && iArr[0] == 0) {
                this.f8301c++;
            }
            this.f8302d += (long) (i - iArr[0]);
            return m4920c();
        } else {
            compare = this.f8300b;
            iArr[0] = compare;
            if (i == 0) {
                return m4917b();
            }
            this.f8302d = ((long) (i - compare)) + this.f8302d;
            this.f8300b = i;
            return this;
        }
    }

    public final String toString() {
        return khb.m4891b(this.f8299a, this.f8300b).toString();
    }

    /* renamed from: d */
    private static long m4922d(khv khv) {
        return khv != null ? khv.f8302d : 0;
    }
}
