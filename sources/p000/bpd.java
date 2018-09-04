package p000;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bpd */
public final class bpd implements bpq, eoj, eok, eol {
    /* renamed from: a */
    public static final String f20131a = bli.m862a("FatalErrorHandler");
    /* renamed from: b */
    public final AtomicBoolean f20132b = new AtomicBoolean(false);
    /* renamed from: c */
    public final AtomicBoolean f20133c = new AtomicBoolean(true);
    /* renamed from: d */
    private final WeakReference f20134d;
    /* renamed from: e */
    private final ikd f20135e;
    /* renamed from: f */
    private final irs f20136f;

    public bpd(WeakReference weakReference, ikd ikd, irs irs) {
        this.f20134d = weakReference;
        this.f20135e = ikd;
        this.f20136f = irs;
    }

    /* renamed from: a */
    final void m14863a(String str) {
        Activity activity = (Activity) this.f20134d.get();
        if (activity != null && !activity.isFinishing()) {
            bli.m866b(f20131a, str);
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo2692a() {
        Throwable exception = new Exception();
        bli.m867b(f20131a, "Handling Camera Disabled Failure:", exception);
        this.f20136f.mo1574a(1, null, -1, -1);
        m14861a(bpl.ERROR_CAMERA_DISABLED, exception, true);
    }

    /* renamed from: a */
    public final void mo2693a(Throwable th) {
        Throwable exception = new Exception(th);
        bpl bpl = bpl.GENERIC_CAMERA_ERROR;
        if (th instanceof isg) {
            bpl = bpl.m931a(((isg) th).f7387a);
        }
        bli.m867b(f20131a, "Handling Camera Open Failure:", exception);
        this.f20136f.mo1574a(2, null, -1, -1);
        m14861a(bpl, exception, false);
    }

    /* renamed from: b */
    public final void mo2694b() {
        Throwable exception = new Exception();
        bli.m867b(f20131a, "Handling Camera Reconnect Failure:", exception);
        this.f20136f.mo1574a(3, null, -1, -1);
        m14861a(bpl.GENERIC_CAMERA_ERROR, exception, false);
    }

    /* renamed from: c */
    public final void mo2695c() {
        Throwable exception = new Exception();
        bli.m867b(f20131a, "Handling Camera Access Failure:", exception);
        this.f20136f.mo1574a(0, null, -1, -1);
        m14861a(bpl.GENERIC_CAMERA_ERROR, exception, false);
    }

    /* renamed from: d */
    public final void mo2696d() {
        Throwable exception = new Exception();
        bli.m867b(f20131a, "Handling MediaRecorder Failure:", exception);
        this.f20136f.mo1604e();
        m14861a(bpl.MEDIA_RECORDER_FAILURE, exception, false);
    }

    /* renamed from: e */
    public final void mo2697e() {
        Throwable exception = new Exception();
        bli.m867b(f20131a, "Handling Media Storage Failure:", exception);
        this.f20136f.mo1611l();
        m14861a(bpl.MEDIA_STORAGE_FAILURE, exception, false);
    }

    /* renamed from: i */
    public final void mo381i() {
        this.f20133c.set(true);
    }

    /* renamed from: j */
    public final void mo382j() {
        this.f20133c.set(false);
        if (this.f20132b.get()) {
            m14863a("Activity received OnStop in a fatal error state. Executing finish()");
        }
    }

    /* renamed from: a */
    private final void m14861a(bpl bpl, Exception exception, boolean z) {
        this.f20132b.compareAndSet(false, bpl.f1393g);
        Activity activity = (Activity) this.f20134d.get();
        if ((z || this.f20133c.get()) && activity != null) {
            this.f20135e.execute(new bpe(this, z, activity, bpl, exception));
        } else if (bpl.f1393g) {
            m14863a("Activity received an error, but was not running. Executing finish()");
        }
    }
}
