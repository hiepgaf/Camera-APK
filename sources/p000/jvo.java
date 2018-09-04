package p000;

/* compiled from: PG */
/* renamed from: jvo */
public final class jvo extends jun {
    /* renamed from: a */
    private final int f21958a;

    public jvo(int i) {
        this.f21958a = i;
    }

    /* renamed from: a */
    public final boolean mo3184a(juh juh) {
        return juh.m4648d() >= this.f21958a;
    }

    public final String toString() {
        int i = this.f21958a;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("MinCountSegmentSelector[minCount=");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
