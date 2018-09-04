package p000;

/* compiled from: PG */
/* renamed from: fac */
public final class fac implements kwk {
    /* renamed from: a */
    private final kwk f15822a;

    private fac(kwk kwk) {
        this.f15822a = kwk;
    }

    /* renamed from: a */
    public static fac m10144a(kwk kwk) {
        return new fac(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        bmb bmb = (bmb) this.f15822a.mo345a();
        fab fab = new fab((byte) 0);
        fab.f4401a = Integer.valueOf(6);
        fab.f4402b = Integer.valueOf(2);
        fab a = fab.m2213a(6);
        a.f4405e = Integer.valueOf(3);
        a.f4403c = Integer.valueOf(20);
        bsn bsn = bmb.f1307a;
        a.m2213a(1);
        String str = "";
        if (a.f4401a == null) {
            str = String.valueOf(str).concat(" contiguousFrameCount");
        }
        if (a.f4402b == null) {
            str = String.valueOf(str).concat(" hdrPlusQueueLength");
        }
        if (a.f4403c == null) {
            str = String.valueOf(str).concat(" ringBufferCapacity");
        }
        if (a.f4404d == null) {
            str = String.valueOf(str).concat(" numFramesInSingleBurst");
        }
        if (a.f4405e == null) {
            str = String.valueOf(str).concat(" maxNumAlternatives");
        }
        if (str.isEmpty()) {
            return (faa) ktm.m13963a(new ezz(a.f4401a.intValue(), a.f4402b.intValue(), a.f4403c.intValue(), a.f4404d.intValue(), a.f4405e.intValue()), "Cannot return null from a non-@Nullable @Provides method");
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
