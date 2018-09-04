package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ctx */
public class ctx extends gqj {
    /* renamed from: a */
    public static final String f20787a = bli.m862a("FSTransStatechart");
    /* renamed from: b */
    private csp f20788b;
    /* renamed from: c */
    private Context f20789c;

    public ctx() {
        super(null);
    }

    /* renamed from: a */
    public void mo1562a() {
        bli.m869c(f20787a, "onFilmstripShown");
        acc.m100b(this.f20789c).mo9c();
    }

    /* renamed from: b */
    public void mo1563b() {
        bli.m869c(f20787a, "onFilmstripHidden");
        acc.m100b(this.f20789c).mo10d();
        acc.m100b(this.f20789c).m6288e();
        this.f20788b.mo761e().mo1075b();
    }

    /* renamed from: a */
    public void mo3400a(csp csp, Context context) {
        this.f20788b = csp;
        this.f20789c = context;
    }
}
