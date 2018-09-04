package p000;

/* compiled from: PG */
/* renamed from: axt */
public final class axt implements ayv {
    /* renamed from: a */
    private final fbg f10499a;
    /* renamed from: b */
    private final axp f10500b;
    /* renamed from: c */
    private final fbe f10501c;
    /* renamed from: d */
    private int f10502d = go.f5579q;

    static {
        bli.m862a("AdviceChip");
    }

    public axt(fbg fbg, axp axp) {
        this.f10499a = fbg;
        this.f10500b = axp;
        fbf a = fbg.mo1334a();
        a.f4441d = axp.f1014a;
        a.f4438a = false;
        a.f4440c = axp.f1017d;
        a.f4439b = axp.f1018e;
        this.f10501c = a.m2217a();
    }

    /* renamed from: a */
    public final void mo388a() {
        this.f10499a.mo1336a(this.f10501c);
        this.f10502d = go.f5581s;
        this.f10500b.f1015b.mo387a();
    }

    /* renamed from: b */
    public final int mo389b() {
        return this.f10502d;
    }

    /* renamed from: c */
    public final void mo390c() {
        this.f10499a.mo1338b(this.f10501c);
        this.f10502d = go.f5580r;
    }
}
