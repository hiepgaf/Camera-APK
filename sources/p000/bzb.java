package p000;

import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BackgroundAeResultsCallback;

/* compiled from: PG */
/* renamed from: bzb */
final class bzb extends BackgroundAeResultsCallback {
    /* renamed from: a */
    private final /* synthetic */ byy f11521a;

    bzb(byy byy) {
        this.f11521a = byy;
    }

    public final void Run(AeResults aeResults) {
        if (aeResults != null && aeResults.getValid()) {
            this.f11521a.f1725f.mo348a(new AeResults(aeResults));
        } else if (aeResults == null) {
            bli.m873e(byy.f1720a, "AeResults from HdrPlusSession is null!");
        } else {
            bli.m863a(byy.f1720a, "AeResults from HdrPlusSession is invalid.");
        }
    }
}
