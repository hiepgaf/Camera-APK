package p000;

/* compiled from: PG */
/* renamed from: gxd */
public final class gxd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f5741a;
    /* renamed from: b */
    private final /* synthetic */ int f5742b;
    /* renamed from: c */
    private final /* synthetic */ gxc f5743c;

    public gxd(gxc gxc, int i, int i2) {
        this.f5743c = gxc;
        this.f5741a = i;
        this.f5742b = i2;
    }

    public final void run() {
        if (!this.f5743c.f5738b.mo1669b()) {
            String str = gxc.f5737a;
            int i = this.f5741a;
            int i2 = this.f5742b;
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("Running showPassiveFocusAt(");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            stringBuilder.append(")");
            bli.m871d(str, stringBuilder.toString());
            this.f5743c.f5738b.mo1672e();
            this.f5743c.f5738b.mo1668a((float) this.f5741a, (float) this.f5742b);
        }
    }
}
