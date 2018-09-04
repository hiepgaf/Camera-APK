package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: god */
public class god {
    /* renamed from: a */
    public final /* synthetic */ glf f5589a;

    /* renamed from: a */
    public synchronized void m2650a() {
        this.f5589a.f21525k = this.f5589a.f21525k + 1;
        glf glf = this.f5589a;
        if (glf.f21522h != glk.STARTED) {
            glf.m15823b("Ignoring updateStackedProgressMessage. CaptureSession is not started.");
        } else {
            glf.mo2871a(hci.m11749a((int) R.string.burst_process_x_of_y_items, Integer.valueOf(glf.f21525k), Integer.valueOf(glf.f21524j.size())));
            glf.mo2875b((int) ((((float) glf.f21525k) * 100.0f) / ((float) glf.f21524j.size())));
        }
        god god = this.f5589a.f21526l;
    }

    /* renamed from: b */
    public synchronized void m2651b() {
        this.f5589a.f21525k = this.f5589a.f21525k + 1;
        glf glf = this.f5589a;
        if (glf.f21522h != glk.STARTED) {
            glf.m15823b("Ignoring updateStackedProgressMessage. CaptureSession is not started.");
        } else {
            glf.mo2871a(hci.m11749a((int) R.string.burst_process_x_of_y_items, Integer.valueOf(glf.f21525k), Integer.valueOf(glf.f21524j.size())));
            glf.mo2875b((int) ((((float) glf.f21525k) * 100.0f) / ((float) glf.f21524j.size())));
        }
        god god = this.f5589a.f21526l;
    }

    /* renamed from: c */
    public synchronized void m2652c() {
        god god = this.f5589a.f21526l;
    }

    god(glf glf) {
        this.f5589a = glf;
    }
}
