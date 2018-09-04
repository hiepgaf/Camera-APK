package p000;

import android.content.Context;
import android.provider.Settings.Secure;

/* compiled from: PG */
/* renamed from: gyk */
public final class gyk {
    /* renamed from: a */
    private Context f5802a;

    public gyk(Context context) {
        this.f5802a = context;
    }

    /* renamed from: a */
    public final boolean m2919a() {
        if (Secure.getInt(this.f5802a.getContentResolver(), "camera_double_twist_to_flip_enabled", 1) != 1) {
            return false;
        }
        return true;
    }
}
