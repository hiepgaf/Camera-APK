package p000;

import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jmh */
final class jmh implements jnp {
    /* renamed from: a */
    private final /* synthetic */ int f18938a = 10;
    /* renamed from: b */
    private final /* synthetic */ EnumSet f18939b;

    jmh(EnumSet enumSet) {
        this.f18939b = enumSet;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        return new jkx(this.f18939b, (int) (((float) TimeUnit.SECONDS.convert((long) this.f18938a, TimeUnit.MINUTES)) * 30.0f), 30.0f);
    }
}
