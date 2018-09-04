package p000;

import android.content.Context;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* renamed from: mc */
public final class mc {
    /* renamed from: a */
    public final lx f8823a;
    /* renamed from: b */
    public final int f8824b;

    public mc(Context context) {
        this(context, mb.m16694a(context, 0));
    }

    private mc(Context context, int i) {
        this.f8823a = new lx(new ContextThemeWrapper(context, mb.m16694a(context, i)));
        this.f8824b = i;
    }
}
