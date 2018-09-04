package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bmh */
public final class bmh {
    /* renamed from: a */
    public final Context f1313a;
    /* renamed from: b */
    private final ikd f1314b;

    public bmh(Context context, ikd ikd) {
        this.f1313a = context;
        this.f1314b = ikd;
    }

    /* renamed from: a */
    public final void m888a(String str, int i) {
        this.f1314b.execute(new bmi(this, str, i));
    }
}
