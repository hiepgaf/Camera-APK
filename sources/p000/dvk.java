package p000;

import android.os.Handler;
import android.view.Surface;
import com.google.android.apps.camera.stats.CameraCaptureSessionInstrumentationSession;
import java.util.List;

/* compiled from: PG */
/* renamed from: dvk */
public final class dvk implements iwg {
    /* renamed from: a */
    private final iwg f21187a;
    /* renamed from: b */
    private final CameraCaptureSessionInstrumentationSession f21188b;

    public dvk(iwg iwg, CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession) {
        this.f21187a = iwg;
        this.f21188b = cameraCaptureSessionInstrumentationSession;
    }

    /* renamed from: a */
    public final void mo2980a() {
        this.f21187a.mo2980a();
    }

    /* renamed from: a */
    public final int mo2979a(List list, iwh iwh, Handler handler) {
        this.f21188b.m8422b();
        return this.f21187a.mo2979a(list, new dvl(iwh, this.f21188b), handler);
    }

    public final void close() {
        this.f21187a.close();
    }

    /* renamed from: a */
    public final void mo2981a(List list) {
        this.f21187a.mo2981a(list);
    }

    /* renamed from: b */
    public final iwl mo2983b() {
        return this.f21187a.mo2983b();
    }

    /* renamed from: c */
    public final Surface mo2984c() {
        return this.f21187a.mo2984c();
    }

    /* renamed from: b */
    public final int mo2982b(List list, iwh iwh, Handler handler) {
        this.f21188b.m8422b();
        return this.f21187a.mo2982b(list, new dvl(iwh, this.f21188b), handler);
    }

    /* renamed from: d */
    public final void mo2985d() {
        this.f21187a.mo2985d();
    }
}
