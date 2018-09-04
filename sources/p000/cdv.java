package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.legacy.app.activity.TrampolineActivity;

/* compiled from: PG */
/* renamed from: cdv */
public final class cdv extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        bli.m869c(TrampolineActivity.f2307a, "Screen off received, shutting down trampoline");
        TrampolineActivity.m1237a();
    }
}
