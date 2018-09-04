package p000;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Collections;

/* renamed from: hzf */
public final class hzf implements Runnable {
    /* renamed from: a */
    public final huq f6836a;
    /* renamed from: b */
    public final GoogleHelp f6837b;
    /* renamed from: c */
    private final long f6838c;

    public hzf(huq huq, GoogleHelp googleHelp, long j) {
        this.f6836a = huq;
        this.f6837b = googleHelp;
        this.f6838c = j;
    }

    public final void run() {
        try {
            new hyk().m3587a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetAsyncHelpPsd", "Failed to get async help psd.");
            hzj.m3592a(this.f6836a, new hzg(this, htl.m3396a(Collections.singletonList(Pair.create("gms:googlehelp:async_help_psd_failure", "exception"))), this.f6838c));
        }
    }
}
