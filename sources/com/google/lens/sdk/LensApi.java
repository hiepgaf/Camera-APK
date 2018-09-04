package com.google.lens.sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.util.Log;
import p000.hhz;
import p000.hqq;
import p000.hqt;
import p000.hqu;
import p000.hqw;
import p000.kqn;
import p000.ksx;
import p000.ksy;

/* compiled from: PG */
public class LensApi {
    /* renamed from: a */
    private final Context f2511a;
    /* renamed from: b */
    private final hqq f2512b;
    /* renamed from: c */
    private final hqw f2513c;

    @Keep
    /* compiled from: PG */
    public interface LensAvailabilityCallback {
        /* renamed from: a */
        void mo1697a(@LensAvailabilityStatus int i);
    }

    @Keep
    /* compiled from: PG */
    public @interface LensAvailabilityStatus {
    }

    @Keep
    /* compiled from: PG */
    public @interface LensFeature {
    }

    static {
        Uri.parse("googleapp://lens");
    }

    @Keep
    public LensApi(Context context) {
        this.f2511a = context;
        this.f2512b = new hqq(context);
        this.f2513c = new hqw(context, this.f2512b);
    }

    @Keep
    public void checkArStickersAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f2512b.m3286a(new ksy(lensAvailabilityCallback, 1));
    }

    @Keep
    public void checkLensAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        ((KeyguardManager) this.f2511a.getSystemService("keyguard")).isKeyguardLocked();
        this.f2512b.m3286a(new ksy(lensAvailabilityCallback, 0));
    }

    @Keep
    public void checkPostCaptureAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        hqw hqw = this.f2513c;
        hqu ksx = new ksx(lensAvailabilityCallback);
        hhz.m3157a();
        hqu hqt = new hqt(hqw, ksx);
        hhz.m3157a();
        if (hqw.f6461b.mo3104d()) {
            hqt.mo1773a(true);
        } else if (hqw.f6461b.mo3103c()) {
            hqt.mo1773a(false);
        } else {
            hqw.f6460a.add(hqt);
        }
    }

    @Keep
    public void launchLensActivity(Activity activity) {
        KeyguardManager keyguardManager = (KeyguardManager) activity.getSystemService("keyguard");
        if (keyguardManager.isKeyguardLocked()) {
            keyguardManager.requestDismissKeyguard(activity, new kqn(this, activity));
        } else {
            m1386a(activity);
        }
    }

    @Keep
    public void launchLensActivity(Activity activity, @LensFeature int i) {
        switch (i) {
            case 0:
                launchLensActivity(activity);
                return;
            case 1:
                if (this.f2512b.f6454e.f21620d == 0) {
                    Intent intent = new Intent();
                    intent.setClassName("com.google.ar.lens", "com.google.vr.apps.ornament.app.MainActivity");
                    activity.startActivity(intent);
                    return;
                }
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder(34);
                stringBuilder.append("Invalid lens activity: ");
                stringBuilder.append(i);
                Log.w("LensApi", stringBuilder.toString());
                return;
        }
    }

    @Keep
    public boolean launchLensActivityWithBitmap(Activity activity, Bitmap bitmap) {
        if (!this.f2513c.m3300b()) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("bitmap", bitmap);
        if (!this.f2513c.m3299a(bundle)) {
            Log.i("LensApi", "Failed to inject image.");
        } else if (!this.f2513c.m3302d()) {
            Log.e("LensApi", "Failed to start lens.");
        }
        return true;
    }

    @LensAvailabilityStatus
    /* renamed from: a */
    public static int m1384a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                return i;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("Internal error code: ");
                stringBuilder.append(i);
                Log.d("LensApi", stringBuilder.toString());
                return 1;
        }
    }

    @Keep
    public void onPause() {
        hqw hqw = this.f2513c;
        hhz.m3157a();
        hqw.f6461b.mo3106f();
    }

    @Keep
    public void onResume() {
        hqw hqw = this.f2513c;
        hhz.m3157a();
        hqw.f6461b.mo3098a();
    }

    /* renamed from: a */
    public final void m1386a(Activity activity) {
        if (this.f2513c.m3301c()) {
            Log.i("LensApi", "Lens is pre-warmed.");
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("googleapp://lens"));
        activity.startActivityForResult(intent, 0);
    }
}
