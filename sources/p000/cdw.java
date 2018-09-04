package p000;

import com.google.android.apps.camera.legacy.app.activity.TrampolineActivity;

/* compiled from: PG */
/* renamed from: cdw */
public final class cdw implements iqo {
    /* renamed from: a */
    private final /* synthetic */ TrampolineActivity f11721a;

    public cdw(TrampolineActivity trampolineActivity) {
        this.f11721a = trampolineActivity;
    }

    public final void close() {
        TrampolineActivity trampolineActivity = this.f11721a;
        trampolineActivity.unregisterReceiver(trampolineActivity.f2310b);
    }
}
