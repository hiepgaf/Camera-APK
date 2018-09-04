package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: arx */
final class arx implements iw {
    /* renamed from: a */
    private final arw f10173a;
    /* renamed from: b */
    private final arz f10174b;
    /* renamed from: c */
    private final iw f10175c;

    arx(iw iwVar, arw arw, arz arz) {
        this.f10175c = iwVar;
        this.f10173a = arw;
        this.f10174b = arz;
    }

    /* renamed from: a */
    public final Object mo341a() {
        Object a = this.f10175c.mo341a();
        if (a == null) {
            a = this.f10173a.mo51a();
            if (Log.isLoggable("FactoryPools", 2)) {
                String valueOf = String.valueOf(a.getClass());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
                stringBuilder.append("Created new ");
                stringBuilder.append(valueOf);
                Log.v("FactoryPools", stringBuilder.toString());
            }
        }
        if (a instanceof ary) {
            ((ary) a).mo39a().mo343a(false);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo342a(Object obj) {
        if (obj instanceof ary) {
            ((ary) obj).mo39a().mo343a(true);
        }
        this.f10174b.mo340a(obj);
        return this.f10175c.mo342a(obj);
    }
}
