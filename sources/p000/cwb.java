package p000;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: cwb */
public final class cwb implements cvy {
    /* renamed from: a */
    private final EnumMap f12697a = new EnumMap(hhx.class);
    /* renamed from: b */
    private hhx f12698b = hhx.UNINITIALIZED;

    static {
        bli.m862a("ModuleManagerImpl");
    }

    public cwb(Iterable iterable) {
        for (cvz cvz : iterable) {
            if (cvz == null) {
                throw new NullPointerException("Registering a null ModuleAgent.");
            }
            Enum enumR = cvz.mo1106b().f2812a;
            if (hhx.UNINITIALIZED.equals(enumR)) {
                throw new IllegalArgumentException("ModuleManager: The ApplicationMode can not be UNINITIALIZED");
            } else if (this.f12697a.get(enumR) != null) {
                String valueOf = String.valueOf(enumR);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
                stringBuilder.append("ModuleManager: Mode ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is registered already");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                this.f12697a.put(enumR, cvz);
            }
        }
    }

    /* renamed from: a */
    public final cvz mo1102a(hhx hhx) {
        cvz cvz = (cvz) this.f12697a.get(hhx);
        if (cvz == null) {
            return (cvz) this.f12697a.get(this.f12698b);
        }
        return cvz;
    }

    /* renamed from: a */
    public final List mo1103a() {
        return new ArrayList(this.f12697a.values());
    }

    /* renamed from: b */
    public final boolean mo1104b(hhx hhx) {
        if (this.f12697a.get(hhx) == null) {
            return false;
        }
        this.f12698b = hhx;
        return true;
    }
}
