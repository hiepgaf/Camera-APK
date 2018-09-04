package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: PG */
/* renamed from: bhs */
public final class bhs extends fiw {
    /* renamed from: d */
    private static final String f10889d = bli.m862a("CdrCamCapCallback");
    /* renamed from: a */
    public final kpw f10890a = kpw.m18056d();
    /* renamed from: b */
    public int f10891b = 0;
    /* renamed from: c */
    public final ConcurrentLinkedQueue f10892c = new ConcurrentLinkedQueue();
    /* renamed from: e */
    private final Surface f10893e;
    /* renamed from: f */
    private final iqt f10894f;
    /* renamed from: g */
    private final fiw f10895g;

    public bhs(Surface surface, iqt iqt, fiw fiw) {
        this.f10893e = surface;
        this.f10894f = iqt;
        this.f10895g = fiw;
    }

    /* renamed from: a */
    public final iqo m7399a(fiw fiw) {
        this.f10892c.add(fiw);
        return new bht(this, fiw);
    }

    /* renamed from: a */
    public final void mo455a(Surface surface, long j) {
        if (surface == this.f10893e) {
            this.f10891b++;
        }
    }

    public final void a_(iwp iwp) {
        if (!this.f10890a.isDone()) {
            this.f10890a.mo3557a(null);
        }
        Rect rect = (Rect) iwp.mo3143a(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            this.f10894f.mo348a(rect);
        }
        this.f10895g.a_(iwp);
        Iterator it = this.f10892c.iterator();
        while (it.hasNext()) {
            ((fiw) it.next()).a_(iwp);
        }
    }

    /* renamed from: a */
    public final void mo456a(iwm iwm) {
        String str = f10889d;
        String valueOf = String.valueOf(iwm);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("onCaptureFailed ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
    }
}
