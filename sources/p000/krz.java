package p000;

/* compiled from: PG */
/* renamed from: krz */
public class krz extends kqp {
    /* renamed from: a */
    public final kry f23440a;
    /* renamed from: b */
    public kry f23441b;
    /* renamed from: c */
    public boolean f23442c;

    public krz() {
        this(hqi.f23510c);
    }

    public krz(byte b) {
        this(hqk.f23514c);
    }

    public krz(kry kry) {
        this.f23440a = kry;
        this.f23441b = (kry) kry.mo3571a(go.bY, null);
        this.f23442c = false;
    }

    public krz(char c) {
        this(hqm.f23518c);
    }

    /* renamed from: b */
    public final kry m17813b() {
        boolean z;
        Object e = mo3600e();
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) e.mo3571a(go.bV, null)).byteValue();
        if (byteValue == (byte) 1) {
            z = true;
        } else if (byteValue == (byte) 0) {
            z = false;
        } else {
            boolean c = kto.f8542a.m5175a(e).mo2300c(e);
            if (booleanValue) {
                Object obj;
                if (c) {
                    obj = e;
                } else {
                    obj = null;
                }
                e.mo3571a(go.bW, obj);
                z = c;
            } else {
                z = c;
            }
        }
        if (z) {
            return e;
        }
        throw new jdh();
    }

    /* renamed from: c */
    public final /* synthetic */ kte mo3542c() {
        return m17813b();
    }

    /* renamed from: e */
    public kry mo3600e() {
        if (this.f23442c) {
            return this.f23441b;
        }
        Object obj = this.f23441b;
        kto.f8542a.m5175a(obj).mo2301d(obj);
        this.f23442c = true;
        return this.f23441b;
    }

    /* renamed from: g */
    public /* synthetic */ kte mo3544g() {
        return mo3600e();
    }

    /* renamed from: a */
    public final /* synthetic */ kqp mo3540a() {
        return m17809i();
    }

    /* renamed from: i */
    private final krz m17809i() {
        krz krz = (krz) this.f23440a.mo3571a(go.bZ, null);
        krz.m17812a(mo3600e());
        return krz;
    }

    public /* synthetic */ Object clone() {
        return m17809i();
    }

    /* renamed from: h */
    public void mo3601h() {
        if (this.f23442c) {
            kry kry = (kry) this.f23441b.mo3571a(go.bY, null);
            krz.m17808a(kry, this.f23441b);
            this.f23441b = kry;
            this.f23442c = false;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ kte mo3535d() {
        return this.f23440a;
    }

    /* renamed from: a */
    protected final /* synthetic */ kqp mo3541a(kqo kqo) {
        return m17812a((kry) kqo);
    }

    /* renamed from: f */
    public final boolean mo3537f() {
        return kry.m17798a(this.f23441b);
    }

    /* renamed from: a */
    public final krz m17812a(kry kry) {
        mo3601h();
        krz.m17808a(this.f23441b, kry);
        return this;
    }

    /* renamed from: a */
    private static void m17808a(kry kry, kry kry2) {
        kto.f8542a.m5175a((Object) kry).mo2299b(kry, kry2);
    }
}
