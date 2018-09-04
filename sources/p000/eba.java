package p000;

import android.content.Context;
import android.support.v8.renderscript.RenderScript;

/* compiled from: PG */
/* renamed from: eba */
public final class eba {
    /* renamed from: a */
    public static final String f3498a = bli.m862a("TinyPlanetRS");
    /* renamed from: b */
    public RenderScript f3499b;
    /* renamed from: c */
    public xo f3500c = new xo(this.f3499b);

    eba(Context context) {
        this.f3499b = RenderScript.create(context);
    }
}
