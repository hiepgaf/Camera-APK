package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: idy */
final class idy implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f6963a;
    /* renamed from: b */
    private final /* synthetic */ ief f6964b;

    idy(ief ief, ConnectionResult connectionResult) {
        this.f6964b = ief;
        this.f6963a = connectionResult;
    }

    public final void run() {
        this.f6964b.mo1226a(this.f6963a);
    }
}
