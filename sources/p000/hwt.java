package p000;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: hwt */
public final class hwt {
    /* renamed from: a */
    private static final Object f6787a = new Object();
    /* renamed from: b */
    private static hwt f6788b;

    private hwt() {
    }

    /* renamed from: a */
    public static hwt m3567a() {
        synchronized (f6787a) {
            if (f6788b == null) {
                f6788b = new hwt();
            }
        }
        return f6788b;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public static void m3568a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: a */
    public static boolean m3569a(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        return component != null ? htl.m3425a(context, component.getPackageName()) : false;
    }

    /* renamed from: b */
    public static void m3570b() {
    }

    /* renamed from: c */
    public static void m3571c() {
    }
}
