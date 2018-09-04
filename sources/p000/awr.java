package p000;

import android.app.Activity;
import android.content.Intent;

@Deprecated
/* compiled from: PG */
/* renamed from: awr */
public final class awr {
    /* renamed from: a */
    public final Activity f989a;

    public awr(Activity activity) {
        jri.m13152b((Object) activity);
        this.f989a = activity;
    }

    /* renamed from: a */
    public final void m719a(Intent intent) {
        jri.m13152b((Object) intent);
        this.f989a.setIntent(intent);
    }

    /* renamed from: b */
    public final void m721b(Intent intent) {
        jri.m13152b((Object) intent);
        this.f989a.startActivity(intent);
    }

    /* renamed from: a */
    public final void m720a(Intent intent, int i, int i2) {
        m721b(intent);
        this.f989a.overridePendingTransition(i, i2);
    }
}
