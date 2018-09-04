package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;

/* renamed from: hzb */
public final class hzb implements Runnable {
    /* renamed from: a */
    public final huq f6830a;
    /* renamed from: b */
    public final GoogleHelp f6831b;
    /* renamed from: c */
    private final long f6832c;

    public hzb(huq huq, GoogleHelp googleHelp, File file, long j) {
        this.f6830a = huq;
        this.f6831b = googleHelp;
        this.f6832c = j;
    }

    public final void run() {
        Bundle bundle = new Bundle(1);
        try {
            new hyk().m3587a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.");
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            hzj.m3592a(this.f6830a, new hzc(this, null, bundle, this.f6832c));
        }
    }
}
