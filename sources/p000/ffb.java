package p000;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ffb */
public final class ffb implements kwk {
    /* renamed from: a */
    private final kwk f15937a;
    /* renamed from: b */
    private final kwk f15938b;
    /* renamed from: c */
    private final kwk f15939c;
    /* renamed from: d */
    private final kwk f15940d;
    /* renamed from: e */
    private final kwk f15941e;
    /* renamed from: f */
    private final kwk f15942f;
    /* renamed from: g */
    private final kwk f15943g;
    /* renamed from: h */
    private final kwk f15944h;
    /* renamed from: i */
    private final kwk f15945i;
    /* renamed from: j */
    private final kwk f15946j;
    /* renamed from: k */
    private final kwk f15947k;

    private ffb(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11) {
        this.f15937a = kwk;
        this.f15938b = kwk2;
        this.f15939c = kwk3;
        this.f15940d = kwk4;
        this.f15941e = kwk5;
        this.f15942f = kwk6;
        this.f15943g = kwk7;
        this.f15944h = kwk8;
        this.f15945i = kwk9;
        this.f15946j = kwk10;
        this.f15947k = kwk11;
    }

    /* renamed from: a */
    public static ffb m10293a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11) {
        return new ffb(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7, kwk8, kwk9, kwk10, kwk11);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15937a;
        kwk kwk2 = this.f15938b;
        kwk kwk3 = this.f15939c;
        kwk kwk4 = this.f15940d;
        kwk kwk5 = this.f15941e;
        kwk kwk6 = this.f15942f;
        kwk kwk7 = this.f15943g;
        kwk kwk8 = this.f15944h;
        kwk kwk9 = this.f15945i;
        kwk kwk10 = this.f15946j;
        kwk kwk11 = this.f15947k;
        ikb ikb = (ikb) kwk.mo345a();
        kpk kpk = (kpk) kwk2.mo345a();
        Set set = (Set) kwk3.mo345a();
        ivr ivr = (ivr) kwk4.mo345a();
        ira ira = (ira) kwk5.mo345a();
        kwk6.mo345a();
        bpq bpq = (bpq) kwk8.mo345a();
        hjf hjf = (hjf) kwk9.mo345a();
        ird ird = (ird) kwk10.mo345a();
        Executor executor = (Executor) kwk11.mo345a();
        ive ive = ((fyy) kwk7.mo345a()).f4830a;
        iqp iqp = ive.f7495b;
        return (ivl) ktm.m13963a(new ivl(ikb, kpk, set, ivr, ira, bpq, kbg.m4745c(new InputConfiguration(iqp.f7329a, iqp.f7330b, ive.f7494a)), hjf.f6268c, ird, executor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
