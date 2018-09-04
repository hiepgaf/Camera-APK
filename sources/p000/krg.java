package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: krg */
final class krg implements ktq {
    /* renamed from: a */
    private final kre f19270a;
    /* renamed from: b */
    private int f19271b;
    /* renamed from: c */
    private int f19272c;
    /* renamed from: d */
    private int f19273d = 0;

    krg(kre kre) {
        this.f19270a = (kre) ksd.m5133a((Object) kre, "input");
        this.f19270a.f8438c = this;
    }

    /* renamed from: a */
    public final int mo2213a() {
        int i = this.f19273d;
        if (i != 0) {
            this.f19271b = i;
            this.f19273d = 0;
        } else {
            this.f19271b = this.f19270a.mo2281s();
        }
        i = this.f19271b;
        if (i == 0 || i == this.f19272c) {
            return LfuScheduler.MAX_PRIORITY;
        }
        return i >>> 3;
    }

    /* renamed from: b */
    public final int mo2219b() {
        return this.f19271b;
    }

    /* renamed from: c */
    public final boolean mo2225c() {
        m13753b(0);
        return this.f19270a.mo2263c();
    }

    /* renamed from: a */
    public final void mo2216a(List list) {
        int t;
        if (list instanceof kqv) {
            kqv kqv = (kqv) list;
            switch (this.f19271b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                    do {
                        kqv.m16629a(this.f19270a.mo2263c());
                    } while (this.f19270a.mo2259a() < t);
                    m13751a(t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kqv.m16629a(this.f19270a.mo2263c());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 0:
                break;
            case 2:
                t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                do {
                    list.add(Boolean.valueOf(this.f19270a.mo2263c()));
                } while (this.f19270a.mo2259a() < t);
                m13751a(t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Boolean.valueOf(this.f19270a.mo2263c()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: d */
    public final kqx mo2226d() {
        m13753b(2);
        return this.f19270a.mo2265d();
    }

    /* renamed from: b */
    public final void mo2222b(List list) {
        if ((this.f19271b & 7) == 2) {
            int s;
            do {
                list.add(mo2226d());
                if (!this.f19270a.mo2261b()) {
                    s = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (s == this.f19271b);
            this.f19273d = s;
            return;
        }
        throw ksh.m5144c();
    }

    /* renamed from: e */
    public final double mo2228e() {
        m13753b(1);
        return this.f19270a.mo2266e();
    }

    /* renamed from: c */
    public final void mo2224c(List list) {
        int t;
        if (list instanceof krk) {
            krk krk = (krk) list;
            switch (this.f19271b & 7) {
                case 1:
                    break;
                case 2:
                    t = this.f19270a.mo2282t();
                    krg.m13757d(t);
                    t += this.f19270a.mo2259a();
                    do {
                        krk.m16668a(this.f19270a.mo2266e());
                    } while (this.f19270a.mo2259a() < t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                krk.m16668a(this.f19270a.mo2266e());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 1:
                break;
            case 2:
                t = this.f19270a.mo2282t();
                krg.m13757d(t);
                t += this.f19270a.mo2259a();
                do {
                    list.add(Double.valueOf(this.f19270a.mo2266e()));
                } while (this.f19270a.mo2259a() < t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Double.valueOf(this.f19270a.mo2266e()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: f */
    public final int mo2230f() {
        m13753b(0);
        return this.f19270a.mo2268f();
    }

    /* renamed from: d */
    public final void mo2227d(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19271b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                    do {
                        ksc.m16678b(this.f19270a.mo2268f());
                    } while (this.f19270a.mo2259a() < t);
                    m13751a(t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(this.f19270a.mo2268f());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 0:
                break;
            case 2:
                t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                do {
                    list.add(Integer.valueOf(this.f19270a.mo2268f()));
                } while (this.f19270a.mo2259a() < t);
                m13751a(t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(this.f19270a.mo2268f()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: a */
    private final Object m13750a(kuw kuw, Class cls, krn krn) {
        kuw kuw2 = null;
        switch (kuw2.ordinal()) {
            case 0:
                return Double.valueOf(mo2228e());
            case 1:
                return Float.valueOf(mo2236i());
            case 2:
                return Long.valueOf(mo2240k());
            case 3:
                return Long.valueOf(mo2255s());
            case 4:
                return Integer.valueOf(mo2238j());
            case 5:
                return Long.valueOf(mo2234h());
            case 6:
                return Integer.valueOf(mo2232g());
            case 7:
                return Boolean.valueOf(mo2225c());
            case 8:
                return mo2252q();
            case 10:
                return mo2220b(cls, krn);
            case 11:
                return mo2226d();
            case 12:
                return Integer.valueOf(mo2254r());
            case 13:
                return Integer.valueOf(mo2230f());
            case 14:
                return Integer.valueOf(mo2242l());
            case 15:
                return Long.valueOf(mo2244m());
            case 16:
                return Integer.valueOf(mo2246n());
            case 17:
                return Long.valueOf(mo2248o());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: g */
    public final int mo2232g() {
        m13753b(5);
        return this.f19270a.mo2269g();
    }

    /* renamed from: e */
    public final void mo2229e(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19271b & 7) {
                case 2:
                    t = this.f19270a.mo2282t();
                    krg.m13755c(t);
                    t += this.f19270a.mo2259a();
                    do {
                        ksc.m16678b(this.f19270a.mo2269g());
                    } while (this.f19270a.mo2259a() < t);
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(this.f19270a.mo2269g());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 2:
                t = this.f19270a.mo2282t();
                krg.m13755c(t);
                t += this.f19270a.mo2259a();
                do {
                    list.add(Integer.valueOf(this.f19270a.mo2269g()));
                } while (this.f19270a.mo2259a() < t);
                return;
            case 5:
                break;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(this.f19270a.mo2269g()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: h */
    public final long mo2234h() {
        m13753b(1);
        return this.f19270a.mo2270h();
    }

    /* renamed from: f */
    public final void mo2231f(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19271b & 7) {
                case 1:
                    break;
                case 2:
                    t = this.f19270a.mo2282t();
                    krg.m13757d(t);
                    t += this.f19270a.mo2259a();
                    do {
                        kst.m16691a(this.f19270a.mo2270h());
                    } while (this.f19270a.mo2259a() < t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(this.f19270a.mo2270h());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 1:
                break;
            case 2:
                t = this.f19270a.mo2282t();
                krg.m13757d(t);
                t += this.f19270a.mo2259a();
                do {
                    list.add(Long.valueOf(this.f19270a.mo2270h()));
                } while (this.f19270a.mo2259a() < t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(this.f19270a.mo2270h()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: i */
    public final float mo2236i() {
        m13753b(5);
        return this.f19270a.mo2271i();
    }

    /* renamed from: g */
    public final void mo2233g(List list) {
        int t;
        if (list instanceof krv) {
            krv krv = (krv) list;
            switch (this.f19271b & 7) {
                case 2:
                    t = this.f19270a.mo2282t();
                    krg.m13755c(t);
                    t += this.f19270a.mo2259a();
                    do {
                        krv.m16673a(this.f19270a.mo2271i());
                    } while (this.f19270a.mo2259a() < t);
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5144c();
            }
            do {
                krv.m16673a(this.f19270a.mo2271i());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 2:
                t = this.f19270a.mo2282t();
                krg.m13755c(t);
                t += this.f19270a.mo2259a();
                do {
                    list.add(Float.valueOf(this.f19270a.mo2271i()));
                } while (this.f19270a.mo2259a() < t);
                return;
            case 5:
                break;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Float.valueOf(this.f19270a.mo2271i()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: c */
    private final Object m13754c(ktr ktr, krn krn) {
        int i = this.f19272c;
        this.f19272c = ((this.f19271b >>> 3) << 3) | 4;
        try {
            Object a = ktr.mo2294a();
            ktr.mo2295a(a, this, krn);
            ktr.mo2301d(a);
            if (this.f19271b == this.f19272c) {
                return a;
            }
            throw ksh.m5147f();
        } finally {
            this.f19272c = i;
        }
    }

    /* renamed from: a */
    public final Object mo2214a(Class cls, krn krn) {
        m13753b(3);
        return m13754c(kto.f8542a.m5174a(cls), krn);
    }

    /* renamed from: a */
    public final Object mo2215a(ktr ktr, krn krn) {
        m13753b(3);
        return m13754c(ktr, krn);
    }

    /* renamed from: a */
    public final void mo2217a(List list, ktr ktr, krn krn) {
        int i = this.f19271b;
        if ((i & 7) == 3) {
            int s;
            do {
                list.add(m13754c(ktr, krn));
                if (!this.f19270a.mo2261b() && this.f19273d == 0) {
                    s = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (s == i);
            this.f19273d = s;
            return;
        }
        throw ksh.m5144c();
    }

    /* renamed from: j */
    public final int mo2238j() {
        m13753b(0);
        return this.f19270a.mo2272j();
    }

    /* renamed from: h */
    public final void mo2235h(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19271b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                    do {
                        ksc.m16678b(this.f19270a.mo2272j());
                    } while (this.f19270a.mo2259a() < t);
                    m13751a(t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(this.f19270a.mo2272j());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 0:
                break;
            case 2:
                t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                do {
                    list.add(Integer.valueOf(this.f19270a.mo2272j()));
                } while (this.f19270a.mo2259a() < t);
                m13751a(t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(this.f19270a.mo2272j()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: k */
    public final long mo2240k() {
        m13753b(0);
        return this.f19270a.mo2273k();
    }

    /* renamed from: i */
    public final void mo2237i(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19271b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                    do {
                        kst.m16691a(this.f19270a.mo2273k());
                    } while (this.f19270a.mo2259a() < t);
                    m13751a(t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(this.f19270a.mo2273k());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 0:
                break;
            case 2:
                t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                do {
                    list.add(Long.valueOf(this.f19270a.mo2273k()));
                } while (this.f19270a.mo2259a() < t);
                m13751a(t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(this.f19270a.mo2273k()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2218a(java.util.Map r7, p000.krn r8) {
        /*
        r6 = this;
        r1 = 0;
        r0 = 2;
        r6.m13753b(r0);
        r0 = r6.f19270a;
        r0 = r0.mo2282t();
        r2 = r6.f19270a;
        r2 = r2.mo2264d(r0);
        r0 = r1;
    L_0x0012:
        r3 = r6.mo2213a();	 Catch:{ all -> 0x0043 }
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r3 == r4) goto L_0x005d;
    L_0x001b:
        r4 = r6.f19270a;	 Catch:{ all -> 0x0043 }
        r4 = r4.mo2261b();	 Catch:{ all -> 0x0043 }
        if (r4 != 0) goto L_0x005d;
    L_0x0023:
        switch(r3) {
            case 1: goto L_0x0055;
            case 2: goto L_0x004a;
            default: goto L_0x0026;
        };
    L_0x0026:
        r3 = r6.mo2256t();	 Catch:{ ksi -> 0x0034 }
        if (r3 != 0) goto L_0x0012;
    L_0x002c:
        r3 = new ksh;	 Catch:{ ksi -> 0x0034 }
        r4 = "Unable to parse map entry.";
        r3.<init>(r4);	 Catch:{ ksi -> 0x0034 }
        throw r3;	 Catch:{ ksi -> 0x0034 }
    L_0x0034:
        r3 = move-exception;
        r3 = r6.mo2256t();	 Catch:{ all -> 0x0043 }
        if (r3 != 0) goto L_0x0012;
    L_0x003b:
        r0 = new ksh;	 Catch:{ all -> 0x0043 }
        r1 = "Unable to parse map entry.";
        r0.<init>(r1);	 Catch:{ all -> 0x0043 }
        throw r0;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        r1 = r6.f19270a;
        r1.mo2262c(r2);
        throw r0;
    L_0x004a:
        r3 = 0;
        r3 = r3.getClass();	 Catch:{ ksi -> 0x0034 }
        r4 = 0;
        r1 = r6.m13750a(r4, r3, r8);	 Catch:{ ksi -> 0x0034 }
        goto L_0x0012;
    L_0x0055:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0 = r6.m13750a(r3, r4, r5);	 Catch:{ ksi -> 0x0034 }
        goto L_0x0012;
    L_0x005d:
        r7.put(r0, r1);	 Catch:{ all -> 0x0043 }
        r0 = r6.f19270a;
        r0.mo2262c(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: krg.a(java.util.Map, krn):void");
    }

    /* renamed from: d */
    private final Object m13756d(ktr ktr, krn krn) {
        int t = this.f19270a.mo2282t();
        kre kre = this.f19270a;
        if (kre.f8436a < kre.f8437b) {
            t = kre.mo2264d(t);
            Object a = ktr.mo2294a();
            kre kre2 = this.f19270a;
            kre2.f8436a++;
            ktr.mo2295a(a, this, krn);
            ktr.mo2301d(a);
            this.f19270a.mo2260a(0);
            kre2 = this.f19270a;
            kre2.f8436a--;
            kre2.mo2262c(t);
            return a;
        }
        throw new ksh("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: b */
    public final Object mo2220b(Class cls, krn krn) {
        m13753b(2);
        return m13756d(kto.f8542a.m5174a(cls), krn);
    }

    /* renamed from: b */
    public final Object mo2221b(ktr ktr, krn krn) {
        m13753b(2);
        return m13756d(ktr, krn);
    }

    /* renamed from: b */
    public final void mo2223b(List list, ktr ktr, krn krn) {
        int i = this.f19271b;
        if ((i & 7) == 2) {
            int s;
            do {
                list.add(m13756d(ktr, krn));
                if (!this.f19270a.mo2261b() && this.f19273d == 0) {
                    s = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (s == i);
            this.f19273d = s;
            return;
        }
        throw ksh.m5144c();
    }

    /* renamed from: l */
    public final int mo2242l() {
        m13753b(5);
        return this.f19270a.mo2275m();
    }

    /* renamed from: j */
    public final void mo2239j(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19271b & 7) {
                case 2:
                    t = this.f19270a.mo2282t();
                    krg.m13755c(t);
                    t += this.f19270a.mo2259a();
                    do {
                        ksc.m16678b(this.f19270a.mo2275m());
                    } while (this.f19270a.mo2259a() < t);
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(this.f19270a.mo2275m());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 2:
                t = this.f19270a.mo2282t();
                krg.m13755c(t);
                t += this.f19270a.mo2259a();
                do {
                    list.add(Integer.valueOf(this.f19270a.mo2275m()));
                } while (this.f19270a.mo2259a() < t);
                return;
            case 5:
                break;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(this.f19270a.mo2275m()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: m */
    public final long mo2244m() {
        m13753b(1);
        return this.f19270a.mo2276n();
    }

    /* renamed from: k */
    public final void mo2241k(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19271b & 7) {
                case 1:
                    break;
                case 2:
                    t = this.f19270a.mo2282t();
                    krg.m13757d(t);
                    t += this.f19270a.mo2259a();
                    do {
                        kst.m16691a(this.f19270a.mo2276n());
                    } while (this.f19270a.mo2259a() < t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(this.f19270a.mo2276n());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 1:
                break;
            case 2:
                t = this.f19270a.mo2282t();
                krg.m13757d(t);
                t += this.f19270a.mo2259a();
                do {
                    list.add(Long.valueOf(this.f19270a.mo2276n()));
                } while (this.f19270a.mo2259a() < t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(this.f19270a.mo2276n()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: n */
    public final int mo2246n() {
        m13753b(0);
        return this.f19270a.mo2277o();
    }

    /* renamed from: l */
    public final void mo2243l(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19271b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                    do {
                        ksc.m16678b(this.f19270a.mo2277o());
                    } while (this.f19270a.mo2259a() < t);
                    m13751a(t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(this.f19270a.mo2277o());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 0:
                break;
            case 2:
                t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                do {
                    list.add(Integer.valueOf(this.f19270a.mo2277o()));
                } while (this.f19270a.mo2259a() < t);
                m13751a(t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(this.f19270a.mo2277o()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: o */
    public final long mo2248o() {
        m13753b(0);
        return this.f19270a.mo2278p();
    }

    /* renamed from: m */
    public final void mo2245m(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19271b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                    do {
                        kst.m16691a(this.f19270a.mo2278p());
                    } while (this.f19270a.mo2259a() < t);
                    m13751a(t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(this.f19270a.mo2278p());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 0:
                break;
            case 2:
                t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                do {
                    list.add(Long.valueOf(this.f19270a.mo2278p()));
                } while (this.f19270a.mo2259a() < t);
                m13751a(t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(this.f19270a.mo2278p()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: p */
    public final String mo2250p() {
        m13753b(2);
        return this.f19270a.mo2279q();
    }

    /* renamed from: n */
    public final void mo2247n(List list) {
        m13752a(list, false);
    }

    /* renamed from: a */
    private final void m13752a(List list, boolean z) {
        if ((this.f19271b & 7) != 2) {
            throw ksh.m5144c();
        } else if ((list instanceof ksp) && !z) {
            ksp ksp = (ksp) list;
            do {
                ksp.mo2307a(mo2226d());
                if (!this.f19270a.mo2261b()) {
                    r0 = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (r0 == this.f19271b);
            this.f19273d = r0;
        } else {
            do {
                Object q;
                if (z) {
                    q = mo2252q();
                } else {
                    q = mo2250p();
                }
                list.add(q);
                if (!this.f19270a.mo2261b()) {
                    r0 = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (r0 == this.f19271b);
            this.f19273d = r0;
        }
    }

    /* renamed from: o */
    public final void mo2249o(List list) {
        m13752a(list, true);
    }

    /* renamed from: q */
    public final String mo2252q() {
        m13753b(2);
        return this.f19270a.mo2280r();
    }

    /* renamed from: r */
    public final int mo2254r() {
        m13753b(0);
        return this.f19270a.mo2282t();
    }

    /* renamed from: p */
    public final void mo2251p(List list) {
        int t;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19271b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                    do {
                        ksc.m16678b(this.f19270a.mo2282t());
                    } while (this.f19270a.mo2259a() < t);
                    m13751a(t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(this.f19270a.mo2282t());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 0:
                break;
            case 2:
                t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                do {
                    list.add(Integer.valueOf(this.f19270a.mo2282t()));
                } while (this.f19270a.mo2259a() < t);
                m13751a(t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(this.f19270a.mo2282t()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: s */
    public final long mo2255s() {
        m13753b(0);
        return this.f19270a.mo2283u();
    }

    /* renamed from: q */
    public final void mo2253q(List list) {
        int t;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19271b & 7) {
                case 0:
                    break;
                case 2:
                    t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                    do {
                        kst.m16691a(this.f19270a.mo2283u());
                    } while (this.f19270a.mo2259a() < t);
                    m13751a(t);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(this.f19270a.mo2283u());
                if (!this.f19270a.mo2261b()) {
                    t = this.f19270a.mo2281s();
                } else {
                    return;
                }
            } while (t == this.f19271b);
            this.f19273d = t;
            return;
        }
        switch (this.f19271b & 7) {
            case 0:
                break;
            case 2:
                t = this.f19270a.mo2282t() + this.f19270a.mo2259a();
                do {
                    list.add(Long.valueOf(this.f19270a.mo2283u()));
                } while (this.f19270a.mo2259a() < t);
                m13751a(t);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(this.f19270a.mo2283u()));
            if (!this.f19270a.mo2261b()) {
                t = this.f19270a.mo2281s();
            } else {
                return;
            }
        } while (t == this.f19271b);
        this.f19273d = t;
    }

    /* renamed from: a */
    private final void m13751a(int i) {
        if (this.f19270a.mo2259a() != i) {
            throw ksh.m5148g();
        }
    }

    /* renamed from: b */
    private final void m13753b(int i) {
        if ((this.f19271b & 7) != i) {
            throw ksh.m5144c();
        }
    }

    /* renamed from: t */
    public final boolean mo2256t() {
        if (!this.f19270a.mo2261b()) {
            int i = this.f19271b;
            if (i != this.f19272c) {
                return this.f19270a.mo2267e(i);
            }
        }
        return false;
    }

    /* renamed from: c */
    private static void m13755c(int i) {
        if ((i & 3) != 0) {
            throw ksh.m5147f();
        }
    }

    /* renamed from: d */
    private static void m13757d(int i) {
        if ((i & 7) != 0) {
            throw ksh.m5147f();
        }
    }
}
