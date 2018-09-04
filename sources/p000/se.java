package p000;

/* compiled from: PG */
/* renamed from: se */
final class se {
    /* renamed from: a */
    public ux f9190a;
    /* renamed from: b */
    public ux f9191b;
    /* renamed from: c */
    public int f9192c;
    /* renamed from: d */
    public int f9193d;
    /* renamed from: e */
    public int f9194e;
    /* renamed from: f */
    public int f9195f;

    private se(ux uxVar, ux uxVar2) {
        this.f9190a = uxVar;
        this.f9191b = uxVar2;
    }

    se(ux uxVar, ux uxVar2, int i, int i2, int i3, int i4) {
        this(uxVar, uxVar2);
        this.f9192c = i;
        this.f9193d = i2;
        this.f9194e = i3;
        this.f9195f = i4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChangeInfo{oldHolder=");
        stringBuilder.append(this.f9190a);
        stringBuilder.append(", newHolder=");
        stringBuilder.append(this.f9191b);
        stringBuilder.append(", fromX=");
        stringBuilder.append(this.f9192c);
        stringBuilder.append(", fromY=");
        stringBuilder.append(this.f9193d);
        stringBuilder.append(", toX=");
        stringBuilder.append(this.f9194e);
        stringBuilder.append(", toY=");
        stringBuilder.append(this.f9195f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
