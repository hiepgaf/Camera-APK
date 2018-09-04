package p000;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: axi */
public final class axi {
    /* renamed from: a */
    public static final String f1001a = bli.m862a("GoogleHelpHelper");
    /* renamed from: b */
    public static final Uri f1002b = Uri.parse("https://support.google.com/nexus/topic/6012822");
    /* renamed from: c */
    public static final Uri f1003c = Uri.parse("http://www.google.com/policies/privacy/");
    /* renamed from: d */
    public static final Uri f1004d = Uri.parse("http://www.google.com/policies/terms/");
    /* renamed from: e */
    public final String f1005e;
    /* renamed from: f */
    public final Context f1006f;
    /* renamed from: g */
    public final Activity f1007g;

    public axi(Activity activity) {
        this.f1007g = activity;
        this.f1006f = activity.getApplicationContext();
        this.f1005e = activity.getPackageName();
    }

    /* renamed from: a */
    public final void m732a(int i, Exception exception) {
        bli.m863a(f1001a, "Attempting to connect to Google API client to begin feedback flow");
        kow.m13622a(new hji(new hur(this.f1006f).m3486a(hxp.f6792a).m3485a()).m11858a(), new axj(this, i, exception), kpq.f8410a);
    }
}
