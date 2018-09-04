package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Window;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: heu */
public final class heu {
    /* renamed from: a */
    public static final String f6129a = bli.m862a("CameraUiInflater");
    /* renamed from: b */
    public final Window f6130b;
    /* renamed from: c */
    public final hkh f6131c;
    /* renamed from: d */
    public final Activity f6132d;
    /* renamed from: e */
    public final LayoutInflater f6133e = this.f6132d.getLayoutInflater();

    public heu(Activity activity, hkh hkh, Window window) {
        this.f6132d = activity;
        this.f6131c = hkh;
        this.f6130b = window;
    }

    /* renamed from: a */
    public static void m3100a(Window window) {
        window.getDecorView().setSystemUiVisibility(1797);
    }
}
