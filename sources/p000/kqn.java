package p000;

import android.app.Activity;
import android.app.KeyguardManager.KeyguardDismissCallback;
import android.util.Log;
import com.google.lens.sdk.LensApi;

/* compiled from: PG */
/* renamed from: kqn */
public final class kqn extends KeyguardDismissCallback {
    /* renamed from: a */
    private final /* synthetic */ Activity f8425a;
    /* renamed from: b */
    private final /* synthetic */ LensApi f8426b;

    public kqn(LensApi lensApi, Activity activity) {
        this.f8426b = lensApi;
        this.f8425a = activity;
    }

    public final void onDismissCancelled() {
        Log.d("LensApi", "Keyguard dismiss cancelled");
    }

    public final void onDismissError() {
        Log.e("LensApi", "Error dismissing keyguard");
    }

    public final void onDismissSucceeded() {
        Log.d("LensApi", "Keyguard successfully dismissed");
        this.f8426b.m1386a(this.f8425a);
    }
}
