package p000;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: dtf */
public final class dtf implements kwk {
    /* renamed from: a */
    private final kwk f14422a;
    /* renamed from: b */
    private final kwk f14423b;
    /* renamed from: c */
    private final kwk f14424c;
    /* renamed from: d */
    private final kwk f14425d;

    private dtf(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f14422a = kwk;
        this.f14423b = kwk2;
        this.f14424c = kwk3;
        this.f14425d = kwk4;
    }

    /* renamed from: a */
    public static dtf m9354a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new dtf(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f14422a;
        kwk kwk2 = this.f14423b;
        kwk kwk3 = this.f14424c;
        Object obj = (fmg) kwk.mo345a();
        fhg fhg = (fhg) kwk2.mo345a();
        era era = (era) kwk3.mo345a();
        bym bym = (bym) this.f14425d.mo345a();
        Collection arrayList = new ArrayList();
        arrayList.add(fhg.mo1383b());
        arrayList.add(era.m2027a(eqv.HDR_PLUS));
        int max_full_metering_sweep_frames = bym.mo613a().getMax_full_metering_sweep_frames();
        int max_payload_frames = bym.mo613a().getMax_payload_frames();
        jri.m13152b(obj);
        arrayList.add(ilq.m3832b(obj.m2337a(), Integer.valueOf(max_full_metering_sweep_frames)));
        arrayList.add(ilq.m3832b(obj.m2337a(), Integer.valueOf(max_payload_frames)));
        return (ilp) ktm.m13963a(ilq.m3833b(arrayList), "Cannot return null from a non-@Nullable @Provides method");
    }
}
