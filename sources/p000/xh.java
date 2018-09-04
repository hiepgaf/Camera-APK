package p000;

/* compiled from: PG */
/* renamed from: xh */
public abstract class xh {
    /* renamed from: a */
    public int f9510a = 0;

    /* renamed from: a */
    protected abstract int mo2540a();

    public xh(int i) {
        m6235d(i);
        m6240c(i);
    }

    /* renamed from: a */
    protected void mo2541a(int i) {
    }

    /* renamed from: d */
    private final void m6235d(int i) {
        int a = (mo2540a() ^ -1) & i;
        if (a == 0) {
            mo2541a(i);
            return;
        }
        String toHexString = Integer.toHexString(a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(toHexString).length() + 33);
        stringBuilder.append("The option bit(s) 0x");
        stringBuilder.append(toHexString);
        stringBuilder.append(" are invalid!");
        throw new wb(stringBuilder.toString(), 103);
    }

    public boolean equals(Object obj) {
        return this.f9510a == ((xh) obj).f9510a;
    }

    /* renamed from: b */
    public final boolean m6239b(int i) {
        return (this.f9510a & i) != 0;
    }

    public int hashCode() {
        return this.f9510a;
    }

    /* renamed from: a */
    public final void m6238a(int i, boolean z) {
        int i2;
        if (z) {
            i2 = this.f9510a | i;
        } else {
            i2 = this.f9510a & (i ^ -1);
        }
        this.f9510a = i2;
    }

    /* renamed from: c */
    public final void m6240c(int i) {
        m6235d(i);
        this.f9510a = i;
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f9510a));
        String str = "0x";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
