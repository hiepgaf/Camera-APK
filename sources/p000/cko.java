package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: cko */
final class cko implements iqo {
    /* renamed from: a */
    private static final String f12110a = bli.m862a("LegacyRingBuffer");
    /* renamed from: b */
    private int f12111b;
    /* renamed from: c */
    private boolean f12112c;
    /* renamed from: d */
    private final AtomicInteger f12113d = new AtomicInteger(0);
    /* renamed from: e */
    private final kpk f12114e;
    /* renamed from: f */
    private final in f12115f = new in();
    /* renamed from: g */
    private final ckj f12116g;
    /* renamed from: h */
    private final List f12117h = new ArrayList();
    /* renamed from: i */
    private final jmr f12118i;
    /* renamed from: j */
    private final wd f12119j;
    /* renamed from: k */
    private jwa f12120k = null;

    public cko(int i, kpk kpk, ckj ckj, jmr jmr, UUID uuid) {
        jri.m13152b((Object) kpk);
        jri.m13152b((Object) ckj);
        jri.m13152b((Object) jmr);
        this.f12111b = i;
        this.f12114e = kpk;
        this.f12116g = ckj;
        this.f12118i = jmr;
        this.f12119j = bbz.m788a(uuid, false, bve.BURSTS.m1007d(), true);
        this.f12112c = false;
        String str = f12110a;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("Created with capacity ");
        stringBuilder.append(i);
        bli.m863a(str, stringBuilder.toString());
    }

    /* renamed from: b */
    private final synchronized void m8291b(fkp fkp) {
        this.f12115f.m3867a(fkp.mo2719f(), new ckq(fkp, this.f12113d));
    }

    public final synchronized void close() {
        for (int i = 0; i < this.f12115f.m3871c(); i++) {
            ((ckq) this.f12115f.m3868b(i)).close();
        }
        this.f12115f.m3865a();
        this.f12117h.clear();
        this.f12116g.close();
    }

    /* renamed from: a */
    private final synchronized void m8289a(ckq ckq, ckk ckk) {
        long f = ckq.mo2719f();
        int g = ckq.mo2720g();
        int d = ckq.mo2717d();
        iwz iwz = (iwz) ckk.f2106a.getAndSet(ckq);
        if (iwz != null) {
            iwz.close();
            throw new IllegalArgumentException("Old image was not null");
        }
        if (ckk.f2107b.getAndSet(this.f12119j) != null) {
            throw new IllegalArgumentException("Attempting to set multiple XMP metadata!");
        }
        this.f12117h.add(new chs(f, this.f12116g.mo2776a(ckk), g, d));
    }

    /* renamed from: f */
    private final synchronized jwa m8292f() {
        if (this.f12120k == null) {
            this.f12120k = (jwa) kow.m13625c(this.f12114e);
        }
        return this.f12120k;
    }

    /* renamed from: a */
    public final synchronized jrg m8294a() {
        jrj jrj;
        m8293g();
        while (this.f12120k.mo3186a().size() > 8) {
            long d = this.f12120k.mo3189d();
            if (this.f12120k.mo3186a().size() > 8) {
                m8288a(d);
                this.f12120k.mo2034a(d);
            }
            m8293g();
        }
        Set a = this.f12120k.mo3186a();
        jrj = new jrj();
        this.f12112c = true;
        for (int i = 0; i < this.f12115f.m3871c(); i++) {
            long a2 = this.f12115f.m3864a(i);
            ckq ckq = (ckq) this.f12115f.m3868b(i);
            if (a.contains(Long.valueOf(a2))) {
                jrj.m4622a(a2, new ckn(ckq.f23451a), false);
            } else {
                ckq.close();
            }
        }
        for (chs chs : this.f12117h) {
            boolean z;
            if (this.f12118i != jmr.HYBRID_BURST) {
                z = false;
            } else if (a.contains(Long.valueOf(chs.f1994a))) {
                z = false;
            } else {
                z = true;
            }
            jrj.m4622a(chs.f1994a, new ckn(chs), z);
        }
        this.f12115f.m3865a();
        this.f12117h.clear();
        return jrj.m4620a();
    }

    /* renamed from: b */
    public final synchronized void m8296b() {
        this.f12111b++;
        String str = f12110a;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("increased capacity by ");
        stringBuilder.append(1);
        bli.m863a(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final synchronized void m8295a(fkp fkp) {
        long f = fkp.mo2719f();
        if (this.f12115f.m3869b(f) != null) {
            fkp.close();
        } else if (this.f12112c) {
            bli.m866b(f12110a, "Ring buffer is locked, cannot add image");
            fkp.close();
        } else if (this.f12113d.get() >= this.f12111b) {
            bli.m866b(f12110a, "Ring buffer is full, cannot add image");
            fkp.close();
        } else {
            m8291b(fkp);
            m8292f().mo2035b(f);
            m8293g();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m8297c() {
        this.f12112c = true;
        if (this.f12113d.get() < this.f12111b) {
            this.f12112c = false;
        }
        return this.f12112c;
    }

    /* renamed from: a */
    private final synchronized void m8288a(long j) {
        ckq b = m8290b(j);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: b */
    private final synchronized ckq m8290b(long j) {
        ckq ckq;
        ckq = (ckq) this.f12115f.m3869b(j);
        if (ckq != null) {
            this.f12115f.m3866a(j);
        } else {
            String str = f12110a;
            StringBuilder stringBuilder = new StringBuilder(80);
            stringBuilder.append("Could not remove image with timestamp ");
            stringBuilder.append(j);
            stringBuilder.append(": image does not exist");
            bli.m866b(str, stringBuilder.toString());
            bli.m863a(f12110a, "Available timestamps are: ");
            for (int i = 0; i < this.f12115f.m3871c(); i++) {
                String str2 = f12110a;
                long a = this.f12115f.m3864a(i);
                StringBuilder stringBuilder2 = new StringBuilder(24);
                stringBuilder2.append(GraphFactorySource.INDENT);
                stringBuilder2.append(a);
                bli.m863a(str2, stringBuilder2.toString());
            }
        }
        return ckq;
    }

    /* renamed from: d */
    public final synchronized int m8298d() {
        return this.f12113d.get();
    }

    /* renamed from: g */
    private final synchronized void m8293g() {
        ckk ckk;
        while (true) {
            ckq b;
            kbg a = this.f12116g.mo2775a();
            if (!a.mo2084b()) {
                break;
            }
            ckk = (ckk) a.mo2081a();
            kbg b2 = m8292f().mo3187b();
            if (!b2.mo2084b()) {
                break;
            }
            b = m8290b(((Long) b2.mo2081a()).longValue());
            if (b != null) {
                try {
                    m8289a(b, ckk);
                } catch (Throwable th) {
                    if (b != null) {
                        b.close();
                    }
                }
            }
        }
        this.f12116g.mo2777b(ckk);
    }

    /* renamed from: e */
    final synchronized void m8299e() {
        try {
            if (this.f12112c) {
                bli.m873e(f12110a, "Trying to free up a slot when the ring buffer is already done");
            } else if (this.f12113d.get() >= this.f12111b) {
                long d = this.f12120k.mo3189d();
                m8288a(d);
                this.f12120k.mo2034a(d);
            }
        } catch (Throwable e) {
            bli.m867b(f12110a, "Error when freeing a slot", e);
        }
    }
}
