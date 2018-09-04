package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.ListPreference;
import android.preference.SwitchPreference;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.settings.ManagedSwitchPreference;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dzt */
public final class dzt {
    /* renamed from: i */
    private static final String f3408i = bli.m862a("CamSetActHelper");
    /* renamed from: a */
    public final hjf f3409a;
    /* renamed from: b */
    public final eac f3410b;
    /* renamed from: c */
    public final NumberFormat f3411c;
    /* renamed from: d */
    public final bvx f3412d;
    /* renamed from: e */
    public final fxe f3413e;
    /* renamed from: f */
    public final Set f3414f;
    /* renamed from: g */
    public final irs f3415g;
    /* renamed from: h */
    public List f3416h = null;
    /* renamed from: j */
    private final bmb f3417j;
    /* renamed from: k */
    private final fbn f3418k;
    /* renamed from: l */
    private final bkw f3419l;
    /* renamed from: m */
    private final cbu f3420m;
    /* renamed from: n */
    private final ikd f3421n;
    /* renamed from: o */
    private final kbg f3422o;
    /* renamed from: p */
    private final Set f3423p;
    /* renamed from: q */
    private final Set f3424q;
    /* renamed from: r */
    private final ilp f3425r;
    /* renamed from: s */
    private List f3426s = null;
    /* renamed from: t */
    private kfr f3427t = null;

    static {
        bsk bsk = new bsk("camera.developer.enable");
    }

    public dzt(bmb bmb, fbn fbn, bkw bkw, bsn bsn, cbu cbu, hjf hjf, eac eac, NumberFormat numberFormat, bvx bvx, ikd ikd, fxe fxe, kbg kbg, Set set, Set set2, Set set3, ilp ilp, irs irs, ilp ilp2, ilp ilp3) {
        this.f3417j = bmb;
        this.f3418k = fbn;
        this.f3419l = bkw;
        this.f3420m = cbu;
        this.f3409a = hjf;
        this.f3410b = eac;
        this.f3411c = numberFormat;
        this.f3412d = bvx;
        this.f3421n = ikd;
        this.f3413e = fxe;
        this.f3422o = kbg;
        this.f3423p = set;
        this.f3424q = set2;
        this.f3425r = ilp;
        this.f3415g = irs;
        this.f3414f = set3;
    }

    /* renamed from: a */
    public final List m1710a() {
        return (List) jri.m13139a(this.f3426s, (Object) "Call initialize before getting keysToRemove");
    }

    /* renamed from: b */
    public final kfr m1712b() {
        return (kfr) jri.m13139a(this.f3427t, (Object) "Call initialize before getting preferencesToAdd");
    }

    /* renamed from: a */
    public final void m1711a(Context context) {
        int i;
        int i2 = 1;
        if (!this.f3419l.m856h()) {
            i = 0;
        } else if (this.f3417j.m883a()) {
            i = 0;
        } else {
            i = 1;
        }
        boolean f = this.f3419l.m854f();
        int i3 = 0;
        for (iut iut : iut.values()) {
            if (this.f3418k.mo1349c(iut)) {
                ffc b = this.f3418k.m10176b(this.f3418k.mo1346b(iut));
                if (i3 != 0) {
                    i3 = 1;
                } else if (b.mo1911A()) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            }
        }
        this.f3426s = new ArrayList(10);
        this.f3416h = new ArrayList(10);
        if (i == 0) {
            this.f3426s.add("pref_category_smartburst");
            this.f3426s.add("pref_smartburst_classicburst");
        } else if (f) {
            this.f3426s.add("pref_smartburst_classicburst");
        }
        if (this.f3409a.m3195c() || this.f3409a.m3196d()) {
            this.f3416h.add(this.f3425r.mo2859a(new dzu(this), this.f3421n));
        } else {
            this.f3426s.add("pref_camera_hdrplus_option_available_key");
        }
        this.f3426s.add("pref_camera_raw_output_option_available_key");
        this.f3426s.add("pref_category_developer");
        if (i3 == 0) {
            this.f3426s.add("pref_video_stabilization_key");
        }
        if (!erz.m2096a(context, this.f3420m.m1101b(), this.f3420m.m1100a())) {
            this.f3426s.add("pref_lightcycle_quality_key");
        }
        if (!this.f3418k.mo1345a()) {
            this.f3426s.add("pref_camera_sounds_key");
        }
        PackageManager packageManager = context.getPackageManager();
        if (!(packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) || packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_FINE_LOCATION", context.getPackageName()))) {
            i2 = 0;
        }
        if (i2 != 0) {
            this.f3426s.add("pref_camera_recordlocation_key");
        }
        this.f3427t = kec.m18025q();
        if (this.f3422o.mo2084b()) {
            kbg a = ((cdc) this.f3422o.mo2081a()).m1109a();
            if (a.mo2084b()) {
                SwitchPreference switchPreference = (SwitchPreference) a.mo2081a();
                switchPreference.setOrder(2);
                ManagedSwitchPreference a2 = ManagedSwitchPreference.m1287a(context, switchPreference);
                a2.setLayoutResource(R.layout.preference_with_margin);
                this.f3427t.mo2100a("pref_category_general", a2);
            }
        }
        for (gpc gpc : this.f3423p) {
            if (((String) gpc.m2703d().get(0)).equals("PhotoResolution")) {
                ListPreference listPreference = new ListPreference(context);
                listPreference.setTitle(gpc.m2706g());
                listPreference.setEntries(gpc.m2701b());
                listPreference.setEntryValues(gpc.m2702c());
                listPreference.setKey(gpc.m2705f());
                listPreference.setDefaultValue(gpc.m2700a());
                listPreference.setIcon(gpc.m2704e());
                listPreference.setLayoutResource(R.layout.preference_with_margin);
                listPreference.setOrder(3);
                this.f3427t.mo2100a("pref_category_resolution_camera", listPreference);
            }
        }
        for (gpd gpd : this.f3424q) {
            if (((String) gpd.m2708b().get(0)).equals("Advanced")) {
                SwitchPreference switchPreference2 = new SwitchPreference(context);
                switchPreference2.setTitle(gpd.m2711e());
                switchPreference2.setSummary(gpd.m2710d());
                switchPreference2.setKey(gpd.m2709c());
                switchPreference2.setDefaultValue(gpd.m2707a());
                a2 = ManagedSwitchPreference.m1287a(context, switchPreference2);
                a2.setLayoutResource(R.layout.preference_with_margin);
                this.f3427t.mo2100a("pref_category_advanced", a2);
            }
        }
        String str = f3408i;
        String valueOf = String.valueOf(this.f3426s);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
        stringBuilder.append("Keys to remove from CameraSettings: ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
    }
}
