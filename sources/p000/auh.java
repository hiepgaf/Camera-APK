package p000;

/* compiled from: PG */
/* renamed from: auh */
final class auh implements iqt {
    /* renamed from: a */
    private final /* synthetic */ aug f10283a;

    auh(aug aug) {
        this.f10283a = aug;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            aug aug = this.f10283a;
            if (aug.f10277d) {
                hke hke = aug.f10278e;
                aug.f10276c = System.currentTimeMillis();
                String str = aug.f10274a;
                String valueOf = String.valueOf(Long.toString(this.f10283a.f10276c));
                String str2 = "evScrollingState update";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m863a(str, valueOf);
            }
        }
        this.f10283a.f10277d = bool.booleanValue();
    }
}
