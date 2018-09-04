package p000;

/* compiled from: PG */
/* renamed from: fdb */
final class fdb extends fce {
    /* renamed from: a */
    private final fbx f15879a;
    /* renamed from: b */
    private final fbx f15880b;

    fdb(fbx fbx, fbx fbx2) {
        if (fbx == null) {
            throw new NullPointerException("Null prevState");
        }
        this.f15879a = fbx;
        if (fbx2 == null) {
            throw new NullPointerException("Null curState");
        }
        this.f15880b = fbx2;
    }

    /* renamed from: a */
    public final fbx mo1353a() {
        return this.f15880b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fce)) {
            return false;
        }
        fce fce = (fce) obj;
        if (this.f15879a.equals(fce.mo1354b()) && this.f15880b.equals(fce.mo1353a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15879a.hashCode() ^ 1000003) * 1000003) ^ this.f15880b.hashCode();
    }

    /* renamed from: b */
    public final fbx mo1354b() {
        return this.f15879a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15879a);
        String valueOf2 = String.valueOf(this.f15880b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(valueOf2).length());
        stringBuilder.append("AeStateTransition{prevState=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", curState=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
