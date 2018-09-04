package p000;

import android.annotation.TargetApi;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: gbv */
public final class gbv {
    /* renamed from: a */
    public final List f5041a = new ArrayList();
    /* renamed from: b */
    public final gbx f5042b;
    /* renamed from: c */
    public final ikd f5043c;
    /* renamed from: d */
    public final Object f5044d = new Object();
    /* renamed from: e */
    public iqm f5045e = iqm.CLOCKWISE_0;
    /* renamed from: f */
    public iqz f5046f;
    /* renamed from: g */
    public int f5047g;

    public gbv(ikd ikd, Context context, ira ira) {
        this.f5043c = ikd;
        this.f5042b = new gbx(this, context);
        this.f5046f = ira.mo511a("DeviceOrientation");
    }

    /* renamed from: a */
    public final void m2467a(gbw gbw) {
        if (!this.f5041a.contains(gbw)) {
            this.f5041a.add(gbw);
        }
    }

    /* renamed from: b */
    public final void m2468b(gbw gbw) {
        if (!this.f5041a.remove(gbw)) {
            this.f5046f.mo519e("Removing non-existing listener.");
        }
    }
}
