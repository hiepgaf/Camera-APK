package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hqq */
public final class hqq {
    /* renamed from: a */
    public static final String f6449a = String.format("content://%s/publicvalue/lens_oem_availability", new Object[]{"com.google.android.googlequicksearchbox.GsaPublicContentProvider"});
    /* renamed from: b */
    public static final String f6450b = String.format("content://%s/publicvalue/stickers_oem_availability", new Object[]{"com.google.vr.apps.ornament.app.lens.StickersAvailabilityProvider"});
    /* renamed from: g */
    private static final hra f6451g;
    /* renamed from: c */
    public final Context f6452c;
    /* renamed from: d */
    public final List f6453d;
    /* renamed from: e */
    public hra f6454e;
    /* renamed from: f */
    public boolean f6455f;
    /* renamed from: h */
    private final PackageManager f6456h;

    static {
        hra hra = new hra();
        f6451g = hra;
        hra.f21617a = "0.1.0";
        f6451g.f21618b = "";
        f6451g.f21619c = -1;
        f6451g.f21620d = -1;
    }

    public hqq(Context context) {
        this(context, context.getPackageManager());
    }

    private hqq(Context context, PackageManager packageManager) {
        this.f6453d = new ArrayList();
        this.f6452c = context;
        this.f6456h = packageManager;
        this.f6455f = false;
        this.f6454e = f6451g.m15934a();
        try {
            PackageInfo packageInfo = this.f6456h.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null) {
                this.f6454e.f21618b = packageInfo.versionName;
            }
        } catch (NameNotFoundException e) {
            Log.e("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        new hqs(this).execute(new Void[0]);
    }

    /* renamed from: a */
    public final void m3286a(hqr hqr) {
        if (this.f6455f) {
            hqr.mo1774a(this.f6454e);
        } else {
            this.f6453d.add(hqr);
        }
    }
}
