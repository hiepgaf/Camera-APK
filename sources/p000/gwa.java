package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView.Callback;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gwa */
final class gwa implements eok, eol, gvt {
    /* renamed from: a */
    public final awk f17452a;
    /* renamed from: b */
    public final List f17453b = new ArrayList();
    /* renamed from: c */
    public boolean f17454c = true;
    /* renamed from: d */
    private final RoundedThumbnailView f17455d;
    /* renamed from: e */
    private final Callback f17456e = new gwc(this);
    /* renamed from: f */
    private boolean f17457f = false;

    gwa(het het, awk awk) {
        this.f17452a = awk;
        this.f17455d = het.f6127g;
        this.f17455d.setCallback(this.f17456e);
        this.f17455d.setEnabled(true);
        mo1659a(hip.SECURE);
    }

    /* renamed from: a */
    public final iqo mo1656a(gvu gvu) {
        this.f17453b.add(gvu);
        return new gwb(this, gvu);
    }

    /* renamed from: a */
    public final void mo1657a() {
    }

    /* renamed from: j */
    public final void mo382j() {
        this.f17455d.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo1661a(boolean z) {
        this.f17457f = z;
    }

    /* renamed from: a */
    public final void mo1659a(hip hip) {
        this.f17455d.setThumbnail(this.f17455d.getDefaultThumbnail(hip), 0);
    }

    /* renamed from: b */
    public final void mo1662b() {
        this.f17454c = true;
        this.f17455d.setEnabled(true);
        mo1659a(hip.SECURE);
    }

    /* renamed from: a */
    public final void mo1660a(String str) {
        if (!this.f17457f && this.f17455d.getVisibility() == 0) {
            this.f17455d.startRevealThumbnailAnimation(str);
        }
    }

    /* renamed from: a */
    public final void mo1658a(Bitmap bitmap, int i) {
        this.f17454c = false;
        this.f17455d.setEnabled(true);
        this.f17455d.setThumbnail(bitmap, i);
    }
}
