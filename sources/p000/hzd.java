package p000;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Collections;

/* renamed from: hzd */
public final class hzd implements Runnable {
    /* renamed from: a */
    public final huq f6833a;
    /* renamed from: b */
    public final GoogleHelp f6834b;
    /* renamed from: c */
    private final long f6835c;

    public hzd(huq huq, GoogleHelp googleHelp, long j) {
        this.f6833a = huq;
        this.f6834b = googleHelp;
        this.f6835c = j;
    }

    public final void run() {
        try {
            new hyk().m3587a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.");
            hzj.m3592a(this.f6833a, new hze(this, htl.m3396a(Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"))), this.f6835c));
        }
    }
}
