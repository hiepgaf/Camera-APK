package p000;

/* compiled from: PG */
/* renamed from: aqq */
public abstract class aqq extends aql {
    /* renamed from: a */
    private final int f22599a;
    /* renamed from: b */
    private final int f22600b;

    public aqq() {
        this(kvl.UNSET_ENUM_VALUE, kvl.UNSET_ENUM_VALUE);
    }

    public aqq(int i, int i2) {
        this.f22599a = i;
        this.f22600b = i2;
    }

    /* renamed from: a */
    public final void mo3363a(aqr aqr) {
        if (arq.m657b(this.f22599a, this.f22600b)) {
            aqr.mo320a(this.f22599a, this.f22600b);
            return;
        }
        int i = this.f22599a;
        int i2 = this.f22600b;
        StringBuilder stringBuilder = new StringBuilder(176);
        stringBuilder.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(i);
        stringBuilder.append(" and height: ");
        stringBuilder.append(i2);
        stringBuilder.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public final void mo3367b(aqr aqr) {
    }
}
