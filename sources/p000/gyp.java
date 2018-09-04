package p000;

import android.app.KeyguardManager.KeyguardDismissCallback;

/* compiled from: PG */
/* renamed from: gyp */
final class gyp extends KeyguardDismissCallback {
    /* renamed from: a */
    private final /* synthetic */ kpw f5812a;
    /* renamed from: b */
    private final /* synthetic */ gyl f5813b;

    gyp(gyl gyl, kpw kpw) {
        this.f5813b = gyl;
        this.f5812a = kpw;
    }

    public final void onDismissCancelled() {
        bli.m863a(gyl.f5803a, "Keyguard dismiss cancelled");
        this.f5812a.mo3557a(Boolean.valueOf(false));
    }

    public final void onDismissError() {
        bli.m866b(gyl.f5803a, "Error dismissing keyguard");
        this.f5812a.mo3557a(Boolean.valueOf(false));
    }

    public final void onDismissSucceeded() {
        bli.m863a(gyl.f5803a, "Keyguard successfully dismissed");
        gyl gyl = this.f5813b;
        gyl.f5806d.launchLensActivity(gyl.f5804b);
        this.f5812a.mo3557a(Boolean.valueOf(true));
    }
}
