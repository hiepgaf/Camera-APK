package p000;

/* compiled from: PG */
/* renamed from: kfw */
abstract class kfw implements kfu {
    kfw() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kfu)) {
            return false;
        }
        kfu kfu = (kfu) obj;
        if (mo3239a() == kfu.mo3239a() && kbf.m16436b(mo3240b(), kfu.mo3240b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object b = mo3240b();
        return (b != null ? b.hashCode() : 0) ^ mo3239a();
    }

    public String toString() {
        String valueOf = String.valueOf(mo3240b());
        int a = mo3239a();
        if (a == 1) {
            return valueOf;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append(valueOf);
        stringBuilder.append(" x ");
        stringBuilder.append(a);
        return stringBuilder.toString();
    }
}
