package p000;

import android.app.Activity;
import android.graphics.RectF;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

@Deprecated
/* compiled from: PG */
/* renamed from: gyi */
public final class gyi implements hik {
    /* renamed from: a */
    public final Activity f17564a;
    /* renamed from: b */
    private final MainActivityLayout f17565b;

    static {
        bli.m862a("CaptLayoutHelper");
    }

    public gyi(Activity activity) {
        this.f17564a = activity;
        this.f17565b = (MainActivityLayout) activity.findViewById(R.id.activity_root_view);
    }

    /* renamed from: a */
    public final RectF mo1696a() {
        return new RectF(((gxy) jqk.m13102c((gxy) this.f17565b.f12348d.mo605b())).mo1688a().mo1679e());
    }

    /* renamed from: a */
    public final void m11679a(int i, int i2, boolean z) {
        this.f17565b.m8438a(i, i2, z);
    }
}
