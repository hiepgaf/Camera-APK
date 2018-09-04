package p000;

/* compiled from: PG */
/* renamed from: gxe */
public final class gxe implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f5744a;
    /* renamed from: b */
    private final /* synthetic */ int f5745b;
    /* renamed from: c */
    private final /* synthetic */ gxc f5746c;

    public gxe(gxc gxc, int i, int i2) {
        this.f5746c = gxc;
        this.f5744a = i;
        this.f5745b = i2;
    }

    public final void run() {
        String str = gxc.f5737a;
        int i = this.f5744a;
        int i2 = this.f5745b;
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("showActiveFocusAt(");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        bli.m871d(str, stringBuilder.toString());
        this.f5746c.f5738b.mo1671d();
        this.f5746c.f5738b.mo1668a((float) this.f5744a, (float) this.f5745b);
    }
}
