package p000;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* renamed from: eja */
public final class eja implements hus, hut, huy {
    /* renamed from: a */
    public static final String f15197a = bli.m862a("PhotoSphereHelper");
    /* renamed from: b */
    public hji f15198b;
    /* renamed from: c */
    public kpk f15199c;
    /* renamed from: d */
    public int f15200d = 1;
    /* renamed from: e */
    public final cfh f15201e;
    /* renamed from: f */
    private final Activity f15202f;
    /* renamed from: g */
    private final irs f15203g;

    public eja(cfh cfh, Activity activity, irs irs) {
        this.f15201e = cfh;
        this.f15202f = activity;
        this.f15203g = irs;
    }

    /* renamed from: a */
    public final void mo1225a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo1226a(ConnectionResult connectionResult) {
        String str = f15197a;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Connection failed: ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
        if (connectionResult.f20458b != 19 && connectionResult.m15093a()) {
            try {
                Activity activity = this.f15202f;
                if (connectionResult.m15093a()) {
                    activity.startIntentSenderForResult(connectionResult.f20459c.getIntentSender(), 9000, null, 0, 0, 0);
                }
            } catch (Throwable e) {
                bli.m867b(f15197a, "Could not start resolution", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo1224a(int i) {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo386a(hux hux) {
        ift ift = (ift) hux;
        if (ift.f18293a.m15096b()) {
            Intent intent = ift.f18294b;
            if (intent != null) {
                intent.addFlags(65536);
                this.f15201e.mo2749b(intent);
                return;
            }
            return;
        }
        String str = f15197a;
        String valueOf = String.valueOf(ift);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
        stringBuilder.append("Could not load panorama info: ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void m9711a(Activity activity, Uri uri) {
        if (this.f15200d != 0) {
            String str = f15197a;
            int i = this.f15200d;
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Play Services not Available: ");
            stringBuilder.append(i);
            bli.m866b(str, stringBuilder.toString());
            hud.m11986a(this.f15200d, activity).show();
        } else if (this.f15198b == null) {
            bli.m866b(f15197a, "PanoramaClient must not be null after startup");
            throw new IllegalStateException("PanoramaClient must not be null after startup");
        } else {
            kpk kpk = this.f15199c;
            if (kpk == null) {
                bli.m863a(f15197a, "PanoramaClient not available.");
            } else {
                kow.m13622a(kpk, new ejc(this, uri), kpq.f8410a);
            }
        }
    }
}
