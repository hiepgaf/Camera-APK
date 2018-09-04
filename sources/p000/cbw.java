package p000;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* renamed from: cbw */
public class cbw {
    /* renamed from: a */
    public final Application f1838a;
    /* renamed from: b */
    public final Context f1839b;

    private cbw(Application application, Context context) {
        jri.m13152b((Object) application);
        jri.m13152b((Object) context);
        this.f1838a = application;
        this.f1839b = context;
    }

    /* renamed from: a */
    public static cbw m1102a(Application application) {
        return new cbw(application, application.getApplicationContext());
    }
}
