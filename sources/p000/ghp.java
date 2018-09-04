package p000;

import android.util.Log;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* compiled from: PG */
/* renamed from: ghp */
public final class ghp implements gho {
    /* renamed from: a */
    private final ghz f16916a = new ghl(this.f16917b);
    /* renamed from: b */
    private final ght f16917b = new ghi();

    /* renamed from: b */
    public final void mo1486b() {
        this.f16916a.mo2699c();
        boolean z = this.f16916a.f23239e;
        boolean z2 = this.f16917b.f23235e;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", visible=");
        stringBuilder.append(z2);
        Log.d("ProgressCont", stringBuilder.toString());
    }

    /* renamed from: c */
    public final void mo1487c() {
        this.f16916a.mo3447O();
        boolean z = this.f16916a.f23239e;
        boolean z2 = this.f16917b.f23235e;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", visible=");
        stringBuilder.append(z2);
        Log.d("ProgressCont", stringBuilder.toString());
    }

    /* renamed from: d */
    public final void mo1488d() {
        this.f16917b.mo2701e();
        boolean z = this.f16916a.f23239e;
        boolean z2 = this.f16917b.f23235e;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", visible=");
        stringBuilder.append(z2);
        Log.d("ProgressCont", stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo1485a(ProgressOverlay progressOverlay) {
        this.f16916a.mo3564a(progressOverlay);
        this.f16917b.mo3563a(this.f16916a, progressOverlay);
        this.f16916a.mo1562a();
    }

    /* renamed from: e */
    public final void mo1489e() {
        this.f16917b.y_();
        boolean z = this.f16916a.f23239e;
        boolean z2 = this.f16917b.f23235e;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", visible=");
        stringBuilder.append(z2);
        Log.d("ProgressCont", stringBuilder.toString());
    }
}
