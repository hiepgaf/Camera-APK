package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: goo */
abstract class goo implements ilp {
    /* renamed from: a */
    public final gos f21541a;
    /* renamed from: b */
    public final String f21542b;
    /* renamed from: c */
    public final String f21543c;

    goo(gos gos, String str, String str2) {
        this.f21541a = gos;
        this.f21542b = str;
        this.f21543c = str2;
    }

    /* renamed from: a */
    protected abstract Object mo3450a();

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        jri.m13152b((Object) iqt);
        jri.m13152b((Object) executor);
        gol gop = new gop(this, iqt, executor);
        this.f21541a.mo1529a(gop);
        gop.mo1526a(this.f21543c);
        return gop;
    }

    /* renamed from: b */
    public final Object mo2860b() {
        Object a = mo3450a();
        if (a != null) {
            return a;
        }
        String str = this.f21542b;
        String str2 = this.f21543c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length());
        stringBuilder.append("Null value for setting: ");
        stringBuilder.append(str);
        stringBuilder.append(" : ");
        stringBuilder.append(str2);
        throw new NullPointerException(stringBuilder.toString());
    }
}
