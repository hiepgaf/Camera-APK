package p000;

/* compiled from: PG */
/* renamed from: flm */
public final class flm implements kwk {
    /* renamed from: a */
    private final kwk f16140a;
    /* renamed from: b */
    private final kwk f16141b;
    /* renamed from: c */
    private final kwk f16142c;

    public flm(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f16140a = kwk;
        this.f16141b = kwk2;
        this.f16142c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16140a;
        kwk kwk2 = this.f16141b;
        ikb ikb = (ikb) kwk.mo345a();
        ixb ixb = (ixb) kwk2.mo345a();
        fjv fjz = new fjz(ixb, ((fjx) this.f16142c.mo345a()).f4593a);
        ikb.mo1879a(fjz);
        String b = ion.m3961b(ixb.mo3152e());
        int h = ixb.mo3155h();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 12);
        stringBuilder.append(b);
        stringBuilder.append("w");
        stringBuilder.append(h);
        b = String.valueOf(stringBuilder.toString());
        String str = "IR-";
        if (b.length() == 0) {
            b = new String(str);
        } else {
            b = str.concat(b);
        }
        ixb.mo3148a(new fkf(fjz), ijy.m3789a(ikb, b));
        Object fkk = new fkk(fjz);
        ikb.mo1879a(fkk);
        return (fjv) ktm.m13963a(new fkg(fkk), "Cannot return null from a non-@Nullable @Provides method");
    }
}
