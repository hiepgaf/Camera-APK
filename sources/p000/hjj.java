package p000;

import android.util.Log;
import java.util.TimerTask;

/* compiled from: PG */
/* renamed from: hjj */
final class hjj extends TimerTask {
    /* renamed from: a */
    private final /* synthetic */ hji f6270a;

    hjj(hji hji) {
        this.f6270a = hji;
    }

    public final void run() {
        Log.e("CAM_GApiClientPxy", "Timeout connecting to GoogleApiClient");
        ((kpw) jri.m13152b(this.f6270a.f17907b)).m17780a(new IllegalStateException("Fail to connect, timeout"));
    }
}
