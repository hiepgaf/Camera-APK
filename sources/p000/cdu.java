package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.legacy.app.activity.TrampolineActivity;

/* compiled from: PG */
/* renamed from: cdu */
public final class cdu extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ TrampolineActivity f1856a;

    public cdu(TrampolineActivity trampolineActivity) {
        this.f1856a = trampolineActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f1856a.m1238a(context);
    }
}
