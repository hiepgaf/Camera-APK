package p000;

import android.content.Context;
import com.google.android.apps.camera.metadata.refocus.RefocusHelper;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cvr */
public final class cvr implements kwk {
    /* renamed from: a */
    private final kwk f12680a;
    /* renamed from: b */
    private final kwk f12681b;
    /* renamed from: c */
    private final kwk f12682c;
    /* renamed from: d */
    private final kwk f12683d;
    /* renamed from: e */
    private final kwk f12684e;
    /* renamed from: f */
    private final kwk f12685f;
    /* renamed from: g */
    private final kwk f12686g;
    /* renamed from: h */
    private final kwk f12687h;
    /* renamed from: i */
    private final kwk f12688i;
    /* renamed from: j */
    private final kwk f12689j;
    /* renamed from: k */
    private final kwk f12690k;
    /* renamed from: l */
    private final kwk f12691l;
    /* renamed from: m */
    private final kwk f12692m;

    public cvr(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13) {
        this.f12680a = kwk;
        this.f12681b = kwk2;
        this.f12682c = kwk3;
        this.f12683d = kwk4;
        this.f12684e = kwk5;
        this.f12685f = kwk6;
        this.f12686g = kwk7;
        this.f12687h = kwk8;
        this.f12688i = kwk9;
        this.f12689j = kwk10;
        this.f12690k = kwk11;
        this.f12691l = kwk12;
        this.f12692m = kwk13;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f12680a;
        kwk kwk2 = this.f12681b;
        kwk kwk3 = this.f12682c;
        kwk kwk4 = this.f12683d;
        kwk kwk5 = this.f12684e;
        kwk kwk6 = this.f12685f;
        kwk kwk7 = this.f12686g;
        kwk kwk8 = this.f12687h;
        kwk kwk9 = this.f12688i;
        kwk kwk10 = this.f12689j;
        kwk kwk11 = this.f12690k;
        kwk kwk12 = this.f12691l;
        Context context = (Context) kwk.mo345a();
        cvz cvz = (cvz) kwk2.mo345a();
        cvz cvz2 = (cvz) kwk3.mo345a();
        cvz cvz3 = (cvz) kwk4.mo345a();
        cvz cvz4 = (cvz) kwk5.mo345a();
        kbg kbg = (kbg) kwk10.mo345a();
        fbn fbn = (fbn) kwk11.mo345a();
        cbu cbu = (cbu) kwk12.mo345a();
        ird ird = (ird) this.f12692m.mo345a();
        ird.mo1903a("ModuleManager#provide");
        Iterable arrayList = new ArrayList();
        arrayList.add(cvz);
        arrayList.add(cvz2);
        arrayList.add(cvz3);
        arrayList.add(cvz4);
        ird.mo1903a("ModuleManager#lightcycle");
        if (erz.m2096a(context, cbu.m1101b(), cbu.m1100a())) {
            arrayList.add((cvz) kwk6.mo345a());
            arrayList.add((cvz) kwk7.mo345a());
        }
        ird.mo1904b();
        ird.mo1903a("ModuleManager#refocus");
        if (RefocusHelper.hasRefocusCapture(context, cbu.m1100a())) {
            arrayList.add((cvz) kwk8.mo345a());
        }
        ird.mo1904b();
        ird.mo1903a("ModuleManager#hfr-video");
        if (fbn.mo1350d()) {
            arrayList.add((cvz) kwk9.mo345a());
        }
        ird.mo1904b();
        ird.mo1903a("ModuleManager#gouda");
        if (kbg.mo2084b()) {
            arrayList.add((cvz) kbg.mo2081a());
        }
        ird.mo1904b();
        cvy cwb = new cwb(arrayList);
        cwb.mo1104b(cvz.mo1106b().f2812a);
        ird.mo1904b();
        return (cvy) ktm.m13963a(cwb, "Cannot return null from a non-@Nullable @Provides method");
    }
}
