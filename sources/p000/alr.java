package p000;

import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: alr */
public final class alr implements adq {
    /* renamed from: a */
    private final adq f9884a;
    /* renamed from: b */
    private final Resources f9885b;

    public alr(Resources resources, adq adq) {
        this.f9885b = (Resources) aqe.m585a((Object) resources, "Argument must not be null");
        this.f9884a = (adq) aqe.m585a((Object) adq, "Argument must not be null");
    }

    /* renamed from: a */
    public final agn mo101a(Object obj, int i, int i2, adp adp) {
        return amv.m6657a(this.f9885b, this.f9884a.mo101a(obj, i, i2, adp));
    }

    /* renamed from: a */
    public final boolean mo102a(Object obj, adp adp) {
        return this.f9884a.mo102a(obj, adp);
    }
}
