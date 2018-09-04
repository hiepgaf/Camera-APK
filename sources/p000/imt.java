package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imt */
public abstract class imt implements ilp {
    /* renamed from: a */
    private final ilp f21754a;
    /* renamed from: b */
    private final ilp f21755b;

    public imt(ilp ilp) {
        this.f21754a = ilp;
        this.f21755b = ilq.m3817a(ilp, new imu(this));
    }

    /* renamed from: b */
    public abstract Object mo3369b(Object obj);

    /* renamed from: c */
    public abstract Object mo3370c(Object obj);

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        return this.f21755b.mo2859a(iqt, executor);
    }

    /* renamed from: b */
    public Object mo2860b() {
        return this.f21755b.mo2860b();
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        ilp ilp = this.f21754a;
        jri.m13152b(obj);
        Object c = mo3370c(obj);
        if (c == null) {
            String valueOf = String.valueOf(obj);
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 64) + String.valueOf(name).length());
            stringBuilder.append("Transforming output value: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" resulted in a null input value for: ");
            stringBuilder.append(name);
            throw new NullPointerException(stringBuilder.toString());
        }
        ilp.mo348a(c);
    }
}
