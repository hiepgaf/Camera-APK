package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: kry */
public abstract class kry extends kqo {
    /* renamed from: f */
    public static Map f23437f = new ConcurrentHashMap();
    /* renamed from: a */
    private int f23438a = -1;
    /* renamed from: e */
    public kuh f23439e = kuh.f8572a;

    /* renamed from: a */
    public abstract Object mo3571a(int i, Object obj);

    /* renamed from: a */
    public static krl m17793a(krl krl) {
        return krl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((kry) mo3571a(go.ca, null)).getClass().isInstance(obj)) {
            return kto.f8542a.m5175a((Object) this).mo2297a((Object) this, (kry) obj);
        }
        return false;
    }

    /* renamed from: a */
    static kry m17795a(Class cls) {
        kry kry = (kry) f23437f.get(cls);
        if (kry == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                kry = (kry) f23437f.get(cls);
            } catch (Throwable e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (kry != null) {
            return kry;
        }
        String valueOf = String.valueOf(cls.getName());
        String str = "Unable to get default instance for: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        throw new IllegalStateException(valueOf);
    }

    /* renamed from: d */
    public final /* synthetic */ kte mo3535d() {
        return (kry) mo3571a(go.ca, null);
    }

    /* renamed from: a */
    final int mo3532a() {
        return this.f23438a;
    }

    /* renamed from: e */
    public final int mo3536e() {
        if (this.f23438a == -1) {
            this.f23438a = kto.f8542a.m5175a((Object) this).mo2293a(this);
        }
        return this.f23438a;
    }

    public int hashCode() {
        if (this.d != 0) {
            return this.d;
        }
        this.d = kto.f8542a.m5175a((Object) this).mo2298b(this);
        return this.d;
    }

    /* renamed from: a */
    static Object m17792a(Method method, Object obj, Object... objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", e2);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo3537f() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo3571a(go.bV, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        boolean c = kto.f8542a.m5175a((Object) this).mo2300c(this);
        if (booleanValue) {
            Object obj;
            if (c) {
                kry kry = this;
            } else {
                obj = null;
            }
            mo3571a(go.bW, obj);
        }
        return c;
    }

    /* renamed from: a */
    protected static final boolean m17798a(kry kry) {
        byte byteValue = ((Byte) kry.mo3571a(go.bV, null)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        return kto.f8542a.m5175a((Object) kry).mo2300c(kry);
    }

    /* renamed from: g */
    public final /* synthetic */ ktf mo3538g() {
        return (krz) mo3571a(go.bZ, null);
    }

    /* renamed from: a */
    public static krl m17794a(kte kte, Object obj, kte kte2, int i, kuw kuw) {
        return new krl(kte, obj, kte2, new krs(i, kuw));
    }

    /* renamed from: a */
    private static kry m17796a(kry kry, kre kre, krn krn) {
        Object obj = (kry) kry.mo3571a(go.bY, null);
        try {
            ktr a = kto.f8542a.m5175a(obj);
            ktq ktq = kre.f8438c;
            if (ktq == null) {
                ktq = new krg(kre);
            }
            a.mo2295a(obj, ktq, krn);
            kto.f8542a.m5175a(obj).mo2301d(obj);
            return obj;
        } catch (IOException e) {
            if (e.getCause() instanceof ksh) {
                throw ((ksh) e.getCause());
            }
            throw new ksh(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ksh) {
                throw ((ksh) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public static kry m17797a(kry kry, byte[] bArr, krn krn) {
        try {
            kre a = kre.m5072a(bArr, bArr.length);
            kry a2 = kry.m17796a(kry, a, krn);
            a.mo2260a(0);
            return a2;
        } catch (ksh e) {
            throw e;
        } catch (ksh e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    final void mo3533a(int i) {
        this.f23438a = i;
    }

    /* renamed from: h */
    public final /* synthetic */ ktf mo3539h() {
        krz krz = (krz) mo3571a(go.bZ, null);
        krz.m17812a(this);
        return krz;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(obj);
        ktm.m13970a((kte) this, stringBuilder, 0);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo3534a(krh krh) {
        ktr a = kto.f8542a.m5174a(getClass());
        kvb kvb = krh.f19276c;
        if (kvb == null) {
            kvb = new kvb(krh);
        }
        a.mo2296a((Object) this, kvb);
    }
}
