package p000;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dzh */
public final class dzh {
    /* renamed from: a */
    public final int f3381a;
    /* renamed from: b */
    public final int f3382b;
    /* renamed from: c */
    private final gos f3383c;
    /* renamed from: d */
    private final String f3384d;
    /* renamed from: e */
    private final String f3385e = "pref_camera_id_key";
    /* renamed from: f */
    private final int f3386f;

    dzh(Resources resources, gos gos, PackageManager packageManager, String str) {
        Object obj = null;
        this.f3383c = gos;
        this.f3384d = gos.m2671b(str);
        this.f3381a = Integer.parseInt(resources.getString(R.string.pref_camera_id_entry_back_value));
        this.f3382b = Integer.parseInt(resources.getString(R.string.pref_camera_id_entry_front_value));
        for (FeatureInfo featureInfo : packageManager.getSystemAvailableFeatures()) {
            if (featureInfo.name != null && featureInfo.name.equals("org.chromium.arc")) {
                obj = 1;
                break;
            }
        }
        if (obj != null) {
            this.f3386f = Integer.parseInt(resources.getString(R.string.pref_camera_id_default_arc));
        } else {
            this.f3386f = Integer.parseInt(resources.getString(R.string.pref_camera_id_default));
        }
    }

    /* renamed from: a */
    public final iut m1694a() {
        int a = this.f3383c.mo1527a(this.f3384d, this.f3385e, Integer.valueOf(-1));
        int i = this.f3381a;
        if (a == i) {
            return iut.BACK;
        }
        if (a == this.f3382b) {
            return iut.FRONT;
        }
        if (this.f3386f == i) {
            return iut.BACK;
        }
        return iut.FRONT;
    }

    /* renamed from: b */
    public final iut m1696b() {
        int a = this.f3383c.mo1527a("default_scope", "pref_mode_switch_camera_id_key", Integer.valueOf(-1));
        if (a != -1) {
            this.f3383c.mo1545f("default_scope", "pref_mode_switch_camera_id_key");
            this.f3383c.mo1531a(this.f3384d, "pref_camera_id_key", a);
        }
        return m1694a();
    }

    /* renamed from: c */
    public final boolean m1697c() {
        return m1694a() == iut.BACK;
    }

    /* renamed from: a */
    public final void m1695a(int i) {
        this.f3383c.mo1531a(this.f3384d, this.f3385e, i);
    }

    public final String toString() {
        return !m1697c() ? "Front Camera" : "Back Camera";
    }
}
