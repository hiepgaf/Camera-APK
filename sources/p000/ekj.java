package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: ekj */
final class ekj implements zw {
    /* renamed from: a */
    private final /* synthetic */ eki f15228a;

    ekj(eki eki) {
        this.f15228a = eki;
    }

    /* renamed from: a */
    public final void mo1199a(boolean z, aah aah) {
        eks eks = this.f15228a.f3787h;
        eld eld = eks.f3825b;
        if (eld != null) {
            eld.m1859c();
            eks.f3825b.m1857a();
            eks.f3826c = SystemClock.elapsedRealtimeNanos();
            LightCycle.m1291a(eks.f3825b.f3914o);
            eks.f3830g = true;
            eks.f3831h = false;
        }
        this.f15228a.f3804y = false;
    }
}
