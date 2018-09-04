package p000;

import android.view.ViewStub;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.burstchip.BurstChip;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cjq */
public final class cjq implements bcy {
    /* renamed from: a */
    public static final String f12094a = bli.m862a("CamAppBurstLPCont");
    /* renamed from: b */
    public volatile ViewStub f12095b;
    /* renamed from: c */
    public kpw f12096c = kpw.m18056d();
    /* renamed from: d */
    public volatile RoundedThumbnailView f12097d;
    /* renamed from: e */
    private final AtomicBoolean f12098e = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized void mo696a() {
        if (this.f12098e.compareAndSet(true, false)) {
            m8269a(cjw.f12104a);
            this.f12097d.post(new cjx(this));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m8262a(BurstChip burstChip) {
        burstChip.m1220a();
        burstChip.f2258o.start();
    }

    /* renamed from: a */
    static final /* synthetic */ void m8260a(int i, BurstChip burstChip) {
        burstChip.m1221a(String.valueOf(i));
        burstChip.requestLayout();
        burstChip.invalidate();
    }

    /* renamed from: a */
    static final /* synthetic */ void m8263a(String str, BurstChip burstChip) {
        burstChip.m1222b();
        burstChip.m1221a(str);
        burstChip.f2257n.start();
    }

    /* renamed from: a */
    static final /* synthetic */ void m8264a(boolean z, BurstChip burstChip) {
        if (z) {
            burstChip.m1220a();
            burstChip.f2253j = Math.round(burstChip.f2249f);
            burstChip.f2254k = Math.round(burstChip.f2249f);
            burstChip.f2259p.start();
            return;
        }
        burstChip.m1220a();
        burstChip.f2255l.start();
    }

    /* renamed from: b */
    static final /* synthetic */ void m8266b(BurstChip burstChip) {
        burstChip.m1220a();
        burstChip.f2256m.start();
    }

    /* renamed from: a */
    public final void mo697a(int i) {
        m8269a(new cjt(i));
    }

    /* renamed from: b */
    public final synchronized void mo699b() {
        mo700b(0);
    }

    /* renamed from: b */
    public final synchronized void mo700b(int i) {
        m8269a(new cjv(this, hci.m11748a(R.plurals.burst_chip, i, Integer.valueOf(i))));
    }

    /* renamed from: a */
    public final void mo698a(boolean z) {
        if (this.f12098e.compareAndSet(false, true)) {
            m8269a(new cjr(z));
            RoundedThumbnailView roundedThumbnailView = (RoundedThumbnailView) jri.m13152b(this.f12097d);
            roundedThumbnailView.post(new cjs(roundedThumbnailView));
        }
    }

    /* renamed from: c */
    public final synchronized void mo701c() {
        if (this.f12098e.compareAndSet(true, false)) {
            m8269a(cju.f12101a);
        }
    }

    /* renamed from: a */
    final void m8269a(ckd ckd) {
        if (!this.f12096c.isDone()) {
            this.f12095b.post(new cka(this));
        }
        kow.m13622a(this.f12096c, new ckb(ckd), kpq.f8410a);
    }
}
