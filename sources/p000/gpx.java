package p000;

/* compiled from: PG */
/* renamed from: gpx */
final class gpx implements kov {
    /* renamed from: a */
    private final /* synthetic */ int f17214a;
    /* renamed from: b */
    private final /* synthetic */ gpv f17215b;

    gpx(gpv gpv, int i) {
        this.f17215b = gpv;
        this.f17214a = i;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        String str = gpv.f17205a;
        int i = this.f17214a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 43);
        stringBuilder.append("Sound resource ");
        stringBuilder.append(i);
        stringBuilder.append(" failed to load: ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
        this.f17215b.m11310f(this.f17214a);
    }

    public final /* synthetic */ void b_(Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            i = 0;
        } else if (bool.booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            this.f17215b.m11302a(this.f17214a, 0.6f, 0);
            return;
        }
        String str = gpv.f17205a;
        int i2 = this.f17214a;
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("Sound resource ");
        stringBuilder.append(i2);
        stringBuilder.append(" failed to load.");
        bli.m866b(str, stringBuilder.toString());
        this.f17215b.m11310f(this.f17214a);
    }
}
