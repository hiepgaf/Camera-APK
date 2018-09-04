package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: awc */
final class awc implements aub {
    /* renamed from: a */
    private final /* synthetic */ kpw f10411a;
    /* renamed from: b */
    private final /* synthetic */ ilp f10412b;
    /* renamed from: c */
    private final /* synthetic */ avy f10413c;

    awc(avy avy, kpw kpw, ilp ilp) {
        this.f10413c = avy;
        this.f10411a = kpw;
        this.f10412b = ilp;
    }

    /* renamed from: a */
    public final void mo355a() {
        Object e;
        bli.m863a(avy.f10396a, "ae/af lock initiated.");
        ((gva) this.f10413c.f10397b.mo2081a()).m11569e();
        avy avy = this.f10413c;
        try {
            avy.f10400e.f4462a.mo348a(Boolean.valueOf(true));
            fio fio = new fio((fim) ((ffw) isr.m4143a(avy.f10399d)).mo2860b());
            fio.m2303a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            avy.m7080a(fio.m2301a());
            return;
        } catch (isr e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        }
        String str = avy.f10396a;
        String valueOf = String.valueOf(e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
        stringBuilder.append("Error when locking ae/af. ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
    }

    /* renamed from: b */
    public final ilp mo356b() {
        return this.f10412b;
    }

    /* renamed from: c */
    public final kpk mo357c() {
        return this.f10411a;
    }

    /* renamed from: d */
    public final kpk mo358d() {
        return kow.m13617a(null);
    }

    /* renamed from: e */
    public final void mo359e() {
        bli.m863a(avy.f10396a, "ae/af unlock initiated");
        this.f10413c.m7078a();
    }
}
