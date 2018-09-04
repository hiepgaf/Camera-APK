package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import java.util.List;

/* renamed from: hzc */
final class hzc implements hzn {
    /* renamed from: a */
    private final /* synthetic */ List f18140a = null;
    /* renamed from: b */
    private final /* synthetic */ Bundle f18141b;
    /* renamed from: c */
    private final /* synthetic */ long f18142c;
    /* renamed from: d */
    private final /* synthetic */ hzb f18143d;

    hzc(hzb hzb, List list, Bundle bundle, long j) {
        this.f18143d = hzb;
        this.f18141b = bundle;
        this.f18142c = j;
    }

    /* renamed from: a */
    public final void mo1788a() {
        Log.w("gH_GetAsyncFeedbackPsbd", "Failed to send async feedback psbd to Help.");
    }

    /* renamed from: b */
    public final huu mo1789b() {
        List list = this.f18140a;
        FeedbackOptions feedbackOptions = new FeedbackOptions(null);
        feedbackOptions.f20566h = list;
        hzh hzh = hzj.f6840b;
        hzb hzb = this.f18143d;
        return hzh.mo1792a(hzb.f6830a, hzb.f6831b, feedbackOptions, this.f18141b, this.f18142c);
    }
}
