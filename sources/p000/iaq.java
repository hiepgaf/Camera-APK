package p000;

import android.support.v4.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;

/* renamed from: iaq */
public final class iaq {
    /* renamed from: a */
    public static final huk f6875a = new iar();
    /* renamed from: b */
    public static final huh f6876b = new huh("SignIn.API", f6875a, f6877c);
    /* renamed from: c */
    private static final hum f6877c = new hum((byte) 0);
    /* renamed from: d */
    private static final hum f6878d = new hum((byte) 0);
    /* renamed from: e */
    private static final huk f6879e = new ias();

    static {
        Scope scope = new Scope("profile");
        scope = new Scope(NotificationCompat.CATEGORY_EMAIL);
        huh huh = new huh("SignIn.INTERNAL_API", f6879e, f6878d);
    }
}
