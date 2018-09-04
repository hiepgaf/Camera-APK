package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: kqt */
final class kqt implements ktq {
    /* renamed from: a */
    private final boolean f19256a;
    /* renamed from: b */
    private final byte[] f19257b;
    /* renamed from: c */
    private int f19258c;
    /* renamed from: d */
    private int f19259d;
    /* renamed from: e */
    private int f19260e;
    /* renamed from: f */
    private int f19261f;

    kqt() {
    }

    public kqt(ByteBuffer byteBuffer) {
        this();
        this.f19256a = true;
        this.f19257b = byteBuffer.array();
        this.f19258c = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f19259d = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    /* renamed from: a */
    public final int mo2213a() {
        if (m13667u()) {
            return LfuScheduler.MAX_PRIORITY;
        }
        this.f19260e = m13653A();
        int i = this.f19260e;
        if (i != this.f19261f) {
            return i >>> 3;
        }
        return LfuScheduler.MAX_PRIORITY;
    }

    /* renamed from: b */
    public final int mo2219b() {
        return this.f19260e;
    }

    /* renamed from: u */
    private final boolean m13667u() {
        return this.f19258c == this.f19259d;
    }

    /* renamed from: c */
    public final boolean mo2225c() {
        m13662c(0);
        if (m13653A() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2216a(List list) {
        int A;
        int i;
        if (list instanceof kqv) {
            kqv kqv = (kqv) list;
            switch (this.f19260e & 7) {
                case 0:
                    break;
                case 2:
                    A = this.f19258c + m13653A();
                    while (this.f19258c < A) {
                        kqv.m16629a(m13653A() != 0);
                    }
                    m13660b(A);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kqv.m16629a(mo2225c());
                if (!m13667u()) {
                    i = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = i;
            return;
        }
        switch (this.f19260e & 7) {
            case 0:
                break;
            case 2:
                A = this.f19258c + m13653A();
                while (this.f19258c < A) {
                    boolean z;
                    if (m13653A() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(Boolean.valueOf(z));
                }
                m13660b(A);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Boolean.valueOf(mo2225c()));
            if (!m13667u()) {
                i = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = i;
    }

    /* renamed from: v */
    private final byte m13668v() {
        int i = this.f19258c;
        if (i == this.f19259d) {
            throw ksh.m5148g();
        }
        byte[] bArr = this.f19257b;
        this.f19258c = i + 1;
        return bArr[i];
    }

    /* renamed from: d */
    public final kqx mo2226d() {
        m13662c(2);
        int A = m13653A();
        if (A == 0) {
            return kqx.f8429a;
        }
        kqx b;
        m13658a(A);
        if (this.f19256a) {
            b = kqx.m5057b(this.f19257b, this.f19258c, A);
        } else {
            b = kqx.m5056a(this.f19257b, this.f19258c, A);
        }
        this.f19258c = A + this.f19258c;
        return b;
    }

    /* renamed from: b */
    public final void mo2222b(List list) {
        if ((this.f19260e & 7) == 2) {
            int i;
            do {
                list.add(mo2226d());
                if (!m13667u()) {
                    i = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = i;
            return;
        }
        throw ksh.m5144c();
    }

    /* renamed from: e */
    public final double mo2228e() {
        m13662c(1);
        return Double.longBitsToDouble(m13671y());
    }

    /* renamed from: c */
    public final void mo2224c(List list) {
        int A;
        if (list instanceof krk) {
            krk krk = (krk) list;
            switch (this.f19260e & 7) {
                case 1:
                    break;
                case 2:
                    A = m13653A();
                    m13666f(A);
                    A += this.f19258c;
                    while (this.f19258c < A) {
                        krk.m16668a(Double.longBitsToDouble(m13672z()));
                    }
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                krk.m16668a(mo2228e());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 1:
                break;
            case 2:
                A = m13653A();
                m13666f(A);
                A += this.f19258c;
                while (this.f19258c < A) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m13672z())));
                }
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Double.valueOf(mo2228e()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: f */
    public final int mo2230f() {
        m13662c(0);
        return m13653A();
    }

    /* renamed from: d */
    public final void mo2227d(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19260e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13653A() + this.f19258c;
                    while (this.f19258c < A) {
                        ksc.m16678b(m13653A());
                    }
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(mo2230f());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 0:
                break;
            case 2:
                A = m13653A() + this.f19258c;
                while (this.f19258c < A) {
                    list.add(Integer.valueOf(m13653A()));
                }
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(mo2230f()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: a */
    private final Object m13656a(kuw kuw, Class cls, krn krn) {
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
                return m13657a(true);
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
        m13662c(5);
        return m13669w();
    }

    /* renamed from: e */
    public final void mo2229e(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19260e & 7) {
                case 2:
                    A = m13653A();
                    m13665e(A);
                    A += this.f19258c;
                    while (this.f19258c < A) {
                        ksc.m16678b(m13670x());
                    }
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(mo2232g());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 2:
                A = m13653A();
                m13665e(A);
                A += this.f19258c;
                while (this.f19258c < A) {
                    list.add(Integer.valueOf(m13670x()));
                }
                return;
            case 5:
                break;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(mo2232g()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: h */
    public final long mo2234h() {
        m13662c(1);
        return m13671y();
    }

    /* renamed from: f */
    public final void mo2231f(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19260e & 7) {
                case 1:
                    break;
                case 2:
                    A = m13653A();
                    m13666f(A);
                    A += this.f19258c;
                    while (this.f19258c < A) {
                        kst.m16691a(m13672z());
                    }
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(mo2234h());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 1:
                break;
            case 2:
                A = m13653A();
                m13666f(A);
                A += this.f19258c;
                while (this.f19258c < A) {
                    list.add(Long.valueOf(m13672z()));
                }
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(mo2234h()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: i */
    public final float mo2236i() {
        m13662c(5);
        return Float.intBitsToFloat(m13669w());
    }

    /* renamed from: g */
    public final void mo2233g(List list) {
        int A;
        if (list instanceof krv) {
            krv krv = (krv) list;
            switch (this.f19260e & 7) {
                case 2:
                    A = m13653A();
                    m13665e(A);
                    A += this.f19258c;
                    while (this.f19258c < A) {
                        krv.m16673a(Float.intBitsToFloat(m13670x()));
                    }
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5144c();
            }
            do {
                krv.m16673a(mo2236i());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 2:
                A = m13653A();
                m13665e(A);
                A += this.f19258c;
                while (this.f19258c < A) {
                    list.add(Float.valueOf(Float.intBitsToFloat(m13670x())));
                }
                return;
            case 5:
                break;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Float.valueOf(mo2236i()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: c */
    private final Object m13661c(ktr ktr, krn krn) {
        int i = this.f19261f;
        this.f19261f = ((this.f19260e >>> 3) << 3) | 4;
        try {
            Object a = ktr.mo2294a();
            ktr.mo2295a(a, this, krn);
            ktr.mo2301d(a);
            if (this.f19260e == this.f19261f) {
                return a;
            }
            throw ksh.m5147f();
        } finally {
            this.f19261f = i;
        }
    }

    /* renamed from: a */
    public final Object mo2214a(Class cls, krn krn) {
        m13662c(3);
        return m13661c(kto.f8542a.m5174a(cls), krn);
    }

    /* renamed from: a */
    public final Object mo2215a(ktr ktr, krn krn) {
        m13662c(3);
        return m13661c(ktr, krn);
    }

    /* renamed from: a */
    public final void mo2217a(List list, ktr ktr, krn krn) {
        int i = this.f19260e;
        if ((i & 7) == 3) {
            int i2;
            do {
                list.add(m13661c(ktr, krn));
                if (!m13667u()) {
                    i2 = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == i);
            this.f19258c = i2;
            return;
        }
        throw ksh.m5144c();
    }

    /* renamed from: j */
    public final int mo2238j() {
        m13662c(0);
        return m13653A();
    }

    /* renamed from: h */
    public final void mo2235h(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19260e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13653A() + this.f19258c;
                    while (this.f19258c < A) {
                        ksc.m16678b(m13653A());
                    }
                    m13660b(A);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(mo2238j());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 0:
                break;
            case 2:
                A = m13653A() + this.f19258c;
                while (this.f19258c < A) {
                    list.add(Integer.valueOf(m13653A()));
                }
                m13660b(A);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(mo2238j()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: k */
    public final long mo2240k() {
        m13662c(0);
        return m13654B();
    }

    /* renamed from: i */
    public final void mo2237i(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19260e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13653A() + this.f19258c;
                    while (this.f19258c < A) {
                        kst.m16691a(m13654B());
                    }
                    m13660b(A);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(mo2240k());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 0:
                break;
            case 2:
                A = m13653A() + this.f19258c;
                while (this.f19258c < A) {
                    list.add(Long.valueOf(m13654B()));
                }
                m13660b(A);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(mo2240k()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: w */
    private final int m13669w() {
        m13658a(4);
        return m13670x();
    }

    /* renamed from: x */
    private final int m13670x() {
        int i = this.f19258c;
        byte[] bArr = this.f19257b;
        this.f19258c = i + 4;
        return ((bArr[i + 3] & Illuminant.kOther) << 24) | (((bArr[i] & Illuminant.kOther) | ((bArr[i + 1] & Illuminant.kOther) << 8)) | ((bArr[i + 2] & Illuminant.kOther) << 16));
    }

    /* renamed from: y */
    private final long m13671y() {
        m13658a(8);
        return m13672z();
    }

    /* renamed from: z */
    private final long m13672z() {
        int i = this.f19258c;
        byte[] bArr = this.f19257b;
        this.f19258c = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2218a(java.util.Map r7, p000.krn r8) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 2;
        r6.m13662c(r1);
        r1 = r6.m13653A();
        r6.m13658a(r1);
        r2 = r6.f19259d;
        r3 = r6.f19258c;
        r1 = r1 + r3;
        r6.f19259d = r1;
        r1 = r0;
    L_0x0014:
        r3 = r6.mo2213a();	 Catch:{ all -> 0x003d }
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r3 == r4) goto L_0x0054;
    L_0x001d:
        switch(r3) {
            case 1: goto L_0x004c;
            case 2: goto L_0x0041;
            default: goto L_0x0020;
        };
    L_0x0020:
        r3 = r6.mo2256t();	 Catch:{ ksi -> 0x002e }
        if (r3 != 0) goto L_0x0014;
    L_0x0026:
        r3 = new ksh;	 Catch:{ ksi -> 0x002e }
        r4 = "Unable to parse map entry.";
        r3.<init>(r4);	 Catch:{ ksi -> 0x002e }
        throw r3;	 Catch:{ ksi -> 0x002e }
    L_0x002e:
        r3 = move-exception;
        r3 = r6.mo2256t();	 Catch:{ all -> 0x003d }
        if (r3 != 0) goto L_0x0014;
    L_0x0035:
        r0 = new ksh;	 Catch:{ all -> 0x003d }
        r1 = "Unable to parse map entry.";
        r0.<init>(r1);	 Catch:{ all -> 0x003d }
        throw r0;	 Catch:{ all -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        r6.f19259d = r2;
        throw r0;
    L_0x0041:
        r3 = 0;
        r3 = r3.getClass();	 Catch:{ ksi -> 0x002e }
        r4 = 0;
        r0 = r6.m13656a(r4, r3, r8);	 Catch:{ ksi -> 0x002e }
        goto L_0x0014;
    L_0x004c:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r6.m13656a(r3, r4, r5);	 Catch:{ ksi -> 0x002e }
        goto L_0x0014;
    L_0x0054:
        r7.put(r1, r0);	 Catch:{ all -> 0x003d }
        r6.f19259d = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kqt.a(java.util.Map, krn):void");
    }

    /* renamed from: d */
    private final Object m13663d(ktr ktr, krn krn) {
        int A = m13653A();
        m13658a(A);
        int i = this.f19259d;
        Object obj = this.f19258c;
        A += obj;
        this.f19259d = A;
        try {
            obj = ktr.mo2294a();
            ktr.mo2295a(obj, this, krn);
            ktr.mo2301d(obj);
            if (this.f19258c == A) {
                return obj;
            }
            throw ksh.m5147f();
        } finally {
            this.f19259d = i;
        }
    }

    /* renamed from: b */
    public final Object mo2220b(Class cls, krn krn) {
        m13662c(2);
        return m13663d(kto.f8542a.m5174a(cls), krn);
    }

    /* renamed from: b */
    public final Object mo2221b(ktr ktr, krn krn) {
        m13662c(2);
        return m13663d(ktr, krn);
    }

    /* renamed from: b */
    public final void mo2223b(List list, ktr ktr, krn krn) {
        int i = this.f19260e;
        if ((i & 7) == 2) {
            int i2;
            do {
                list.add(m13663d(ktr, krn));
                if (!m13667u()) {
                    i2 = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == i);
            this.f19258c = i2;
            return;
        }
        throw ksh.m5144c();
    }

    /* renamed from: l */
    public final int mo2242l() {
        m13662c(5);
        return m13669w();
    }

    /* renamed from: j */
    public final void mo2239j(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19260e & 7) {
                case 2:
                    A = m13653A();
                    m13665e(A);
                    A += this.f19258c;
                    while (this.f19258c < A) {
                        ksc.m16678b(m13670x());
                    }
                    return;
                case 5:
                    break;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(mo2242l());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 2:
                A = m13653A();
                m13665e(A);
                A += this.f19258c;
                while (this.f19258c < A) {
                    list.add(Integer.valueOf(m13670x()));
                }
                return;
            case 5:
                break;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(mo2242l()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: m */
    public final long mo2244m() {
        m13662c(1);
        return m13671y();
    }

    /* renamed from: k */
    public final void mo2241k(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19260e & 7) {
                case 1:
                    break;
                case 2:
                    A = m13653A();
                    m13666f(A);
                    A += this.f19258c;
                    while (this.f19258c < A) {
                        kst.m16691a(m13672z());
                    }
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(mo2244m());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 1:
                break;
            case 2:
                A = m13653A();
                m13666f(A);
                A += this.f19258c;
                while (this.f19258c < A) {
                    list.add(Long.valueOf(m13672z()));
                }
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(mo2244m()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: n */
    public final int mo2246n() {
        m13662c(0);
        return kre.m5073b(m13653A());
    }

    /* renamed from: l */
    public final void mo2243l(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19260e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13653A() + this.f19258c;
                    while (this.f19258c < A) {
                        ksc.m16678b(kre.m5073b(m13653A()));
                    }
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(mo2246n());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 0:
                break;
            case 2:
                A = m13653A() + this.f19258c;
                while (this.f19258c < A) {
                    list.add(Integer.valueOf(kre.m5073b(m13653A())));
                }
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(mo2246n()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: o */
    public final long mo2248o() {
        m13662c(0);
        return kre.m5071a(m13654B());
    }

    /* renamed from: m */
    public final void mo2245m(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19260e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13653A() + this.f19258c;
                    while (this.f19258c < A) {
                        kst.m16691a(kre.m5071a(m13654B()));
                    }
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(mo2248o());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 0:
                break;
            case 2:
                A = m13653A() + this.f19258c;
                while (this.f19258c < A) {
                    list.add(Long.valueOf(kre.m5071a(m13654B())));
                }
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(mo2248o()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: p */
    public final String mo2250p() {
        return m13657a(false);
    }

    /* renamed from: a */
    private final String m13657a(boolean z) {
        m13662c(2);
        int A = m13653A();
        if (A == 0) {
            return "";
        }
        m13658a(A);
        if (z) {
            byte[] bArr = this.f19257b;
            int i = this.f19258c;
            if (!kur.m5359b(bArr, i, i + A)) {
                throw ksh.m5143b();
            }
        }
        String str = new String(this.f19257b, this.f19258c, A, ksd.f8515a);
        this.f19258c = A + this.f19258c;
        return str;
    }

    /* renamed from: n */
    public final void mo2247n(List list) {
        m13659a(list, false);
    }

    /* renamed from: a */
    private final void m13659a(List list, boolean z) {
        if ((this.f19260e & 7) != 2) {
            throw ksh.m5144c();
        } else if ((list instanceof ksp) && !z) {
            ksp ksp = (ksp) list;
            do {
                ksp.mo2307a(mo2226d());
                if (!m13667u()) {
                    r0 = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = r0;
        } else {
            do {
                list.add(m13657a(z));
                if (!m13667u()) {
                    r0 = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = r0;
        }
    }

    /* renamed from: o */
    public final void mo2249o(List list) {
        m13659a(list, true);
    }

    /* renamed from: q */
    public final String mo2252q() {
        return m13657a(true);
    }

    /* renamed from: r */
    public final int mo2254r() {
        m13662c(0);
        return m13653A();
    }

    /* renamed from: p */
    public final void mo2251p(List list) {
        int A;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            switch (this.f19260e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13653A() + this.f19258c;
                    while (this.f19258c < A) {
                        ksc.m16678b(m13653A());
                    }
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                ksc.m16678b(mo2254r());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 0:
                break;
            case 2:
                A = m13653A() + this.f19258c;
                while (this.f19258c < A) {
                    list.add(Integer.valueOf(m13653A()));
                }
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Integer.valueOf(mo2254r()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: s */
    public final long mo2255s() {
        m13662c(0);
        return m13654B();
    }

    /* renamed from: q */
    public final void mo2253q(List list) {
        int A;
        if (list instanceof kst) {
            kst kst = (kst) list;
            switch (this.f19260e & 7) {
                case 0:
                    break;
                case 2:
                    A = m13653A() + this.f19258c;
                    while (this.f19258c < A) {
                        kst.m16691a(m13654B());
                    }
                    m13660b(A);
                    return;
                default:
                    throw ksh.m5144c();
            }
            do {
                kst.m16691a(mo2255s());
                if (!m13667u()) {
                    A = this.f19258c;
                } else {
                    return;
                }
            } while (m13653A() == this.f19260e);
            this.f19258c = A;
            return;
        }
        switch (this.f19260e & 7) {
            case 0:
                break;
            case 2:
                A = m13653A() + this.f19258c;
                while (this.f19258c < A) {
                    list.add(Long.valueOf(m13654B()));
                }
                m13660b(A);
                return;
            default:
                throw ksh.m5144c();
        }
        do {
            list.add(Long.valueOf(mo2255s()));
            if (!m13667u()) {
                A = this.f19258c;
            } else {
                return;
            }
        } while (m13653A() == this.f19260e);
        this.f19258c = A;
    }

    /* renamed from: A */
    private final int m13653A() {
        int i = this.f19258c;
        int i2 = this.f19259d;
        if (i2 == i) {
            throw ksh.m5148g();
        }
        byte[] bArr = this.f19257b;
        int i3 = i + 1;
        byte b = bArr[i];
        if (b >= (byte) 0) {
            this.f19258c = i3;
            return b;
        } else if (i2 - i3 < 9) {
            return (int) m13655C();
        } else {
            i2 = i3 + 1;
            i = b ^ (bArr[i3] << 7);
            if (i >= 0) {
                i3 = i2 + 1;
                i ^= bArr[i2] << 14;
                if (i < 0) {
                    i2 = i3 + 1;
                    i ^= bArr[i3] << 21;
                    if (i >= 0) {
                        i3 = i2 + 1;
                        byte b2 = bArr[i2];
                        i = (i ^ (b2 << 28)) ^ 266354560;
                        if (b2 < (byte) 0) {
                            i2 = i3 + 1;
                            if (bArr[i3] < (byte) 0) {
                                i3 = i2 + 1;
                                if (bArr[i2] < (byte) 0) {
                                    i2 = i3 + 1;
                                    if (bArr[i3] < (byte) 0) {
                                        i3 = i2 + 1;
                                        if (bArr[i2] < (byte) 0) {
                                            i2 = i3 + 1;
                                            if (bArr[i3] < (byte) 0) {
                                                throw ksh.m5145d();
                                            }
                                        }
                                        i2 = i3;
                                    }
                                } else {
                                    i2 = i3;
                                }
                            }
                        } else {
                            i2 = i3;
                        }
                    } else {
                        i ^= -2080896;
                    }
                } else {
                    i ^= 16256;
                    i2 = i3;
                }
            } else {
                i ^= -128;
            }
            this.f19258c = i2;
            return i;
        }
    }

    /* renamed from: B */
    private final long m13654B() {
        int i = this.f19258c;
        int i2 = this.f19259d;
        if (i2 == i) {
            throw ksh.m5148g();
        }
        byte[] bArr = this.f19257b;
        int i3 = i + 1;
        byte b = bArr[i];
        if (b >= (byte) 0) {
            this.f19258c = i3;
            return (long) b;
        } else if (i2 - i3 < 9) {
            return m13655C();
        } else {
            long j;
            int i4 = i3 + 1;
            i = b ^ (bArr[i3] << 7);
            if (i >= 0) {
                i3 = i4 + 1;
                i ^= bArr[i4] << 14;
                if (i < 0) {
                    i4 = i3 + 1;
                    i ^= bArr[i3] << 21;
                    if (i < 0) {
                        j = (long) (i ^ -2080896);
                    } else {
                        i3 = i4 + 1;
                        j = ((long) i) ^ (((long) bArr[i4]) << 28);
                        if (j < 0) {
                            i4 = i3 + 1;
                            j ^= ((long) bArr[i3]) << 35;
                            if (j >= 0) {
                                i3 = i4 + 1;
                                j ^= ((long) bArr[i4]) << 42;
                                if (j < 0) {
                                    i4 = i3 + 1;
                                    j ^= ((long) bArr[i3]) << 49;
                                    if (j >= 0) {
                                        i3 = i4 + 1;
                                        j = (j ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                        if (j < 0) {
                                            i4 = i3 + 1;
                                            if (((long) bArr[i3]) < 0) {
                                                throw ksh.m5145d();
                                            }
                                        }
                                        i4 = i3;
                                    } else {
                                        j ^= -558586000294016L;
                                    }
                                } else {
                                    j ^= 4363953127296L;
                                    i4 = i3;
                                }
                            } else {
                                j ^= -34093383808L;
                            }
                        } else {
                            j ^= 266354560;
                            i4 = i3;
                        }
                    }
                } else {
                    j = (long) (i ^ 16256);
                    i4 = i3;
                }
            } else {
                j = (long) (i ^ -128);
            }
            this.f19258c = i4;
            return j;
        }
    }

    /* renamed from: C */
    private final long m13655C() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte v = m13668v();
            j |= ((long) (v & ScriptIntrinsicBLAS.RsBlas_csyrk)) << i;
            if ((v & 128) == 0) {
                return j;
            }
        }
        throw ksh.m5145d();
    }

    /* renamed from: a */
    private final void m13658a(int i) {
        if (i < 0 || i > this.f19259d - this.f19258c) {
            throw ksh.m5148g();
        }
    }

    /* renamed from: b */
    private final void m13660b(int i) {
        if (this.f19258c != i) {
            throw ksh.m5148g();
        }
    }

    /* renamed from: c */
    private final void m13662c(int i) {
        if ((this.f19260e & 7) != i) {
            throw ksh.m5144c();
        }
    }

    /* renamed from: d */
    private final void m13664d(int i) {
        m13658a(i);
        this.f19258c += i;
    }

    /* renamed from: t */
    public final boolean mo2256t() {
        int i = 0;
        if (!m13667u()) {
            int i2 = this.f19260e;
            int i3 = this.f19261f;
            if (i2 != i3) {
                switch (i2 & 7) {
                    case 0:
                        i3 = this.f19259d;
                        i2 = this.f19258c;
                        if (i3 - i2 >= 10) {
                            byte[] bArr = this.f19257b;
                            i3 = i2;
                            i2 = 0;
                            while (i2 < 10) {
                                int i4 = i3 + 1;
                                if (bArr[i3] < (byte) 0) {
                                    i2++;
                                    i3 = i4;
                                } else {
                                    this.f19258c = i4;
                                    return true;
                                }
                            }
                        }
                        while (i < 10) {
                            if (m13668v() >= (byte) 0) {
                                return true;
                            }
                            i++;
                        }
                        throw ksh.m5145d();
                    case 1:
                        m13664d(8);
                        return true;
                    case 2:
                        m13664d(m13653A());
                        return true;
                    case 3:
                        this.f19261f = ((i2 >>> 3) << 3) | 4;
                        while (mo2213a() != LfuScheduler.MAX_PRIORITY) {
                            if (!mo2256t()) {
                                if (this.f19260e == this.f19261f) {
                                    throw ksh.m5147f();
                                }
                                this.f19261f = i3;
                                return true;
                            }
                        }
                        if (this.f19260e == this.f19261f) {
                            this.f19261f = i3;
                            return true;
                        }
                        throw ksh.m5147f();
                    case 5:
                        m13664d(4);
                        return true;
                    default:
                        throw ksh.m5144c();
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private final void m13665e(int i) {
        m13658a(i);
        if ((i & 3) != 0) {
            throw ksh.m5147f();
        }
    }

    /* renamed from: f */
    private final void m13666f(int i) {
        m13658a(i);
        if ((i & 7) != 0) {
            throw ksh.m5147f();
        }
    }
}
