package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView.Callback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gvv */
final class gvv implements eok, eol, gvt {
    /* renamed from: a */
    public static final String f17434a = bli.m862a("IndicatorCtrl");
    /* renamed from: b */
    public final List f17435b = new ArrayList();
    /* renamed from: c */
    private final RoundedThumbnailView f17436c;
    /* renamed from: d */
    private final Callback f17437d = new gvx(this);
    /* renamed from: e */
    private boolean f17438e = false;
    /* renamed from: f */
    private final boolean f17439f;
    /* renamed from: g */
    private final awr f17440g;
    /* renamed from: h */
    private final gst f17441h;
    /* renamed from: i */
    private final ikd f17442i;

    gvv(het het, boolean z, awr awr, gst gst, ikd ikd) {
        this.f17436c = het.f6127g;
        this.f17436c.setCallback(this.f17437d);
        this.f17439f = z;
        this.f17440g = awr;
        this.f17441h = gst;
        this.f17442i = ikd;
    }

    /* renamed from: a */
    public final iqo mo1656a(gvu gvu) {
        this.f17435b.add(gvu);
        return new gvw(this, gvu);
    }

    /* renamed from: a */
    public final void mo1657a() {
        if (!awl.m714b(this.f17440g) && !this.f17439f) {
            Executor executor;
            kpk a = this.f17441h.m2800a();
            if (a.isDone()) {
                executor = kpq.f8410a;
            } else {
                executor = this.f17442i;
            }
            kow.m13622a(a, new gvy(this), executor);
        }
    }

    /* renamed from: j */
    public final void mo382j() {
        this.f17436c.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo1661a(boolean z) {
        this.f17438e = z;
    }

    /* renamed from: a */
    public final void mo1659a(hip hip) {
        this.f17436c.setThumbnail(this.f17436c.getDefaultThumbnail(hip), 0);
    }

    /* renamed from: b */
    public final void mo1662b() {
        this.f17436c.setEnabled(false);
        mo1659a(hip.PLACEHOLDER);
    }

    /* renamed from: a */
    public final void mo1660a(String str) {
        if (!this.f17438e && this.f17436c.getVisibility() == 0) {
            this.f17436c.startRevealThumbnailAnimation(str);
        }
    }

    /* renamed from: a */
    public final void mo1658a(Bitmap bitmap, int i) {
        this.f17436c.setVisibility(0);
        this.f17436c.setEnabled(true);
        this.f17436c.setThumbnail(bitmap, i);
    }
}
