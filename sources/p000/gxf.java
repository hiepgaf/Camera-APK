package p000;

import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: gxf */
public final class gxf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ RectF f5747a;
    /* renamed from: b */
    private final /* synthetic */ gxc f5748b;

    public gxf(gxc gxc, RectF rectF) {
        this.f5748b = gxc;
        this.f5747a = rectF;
    }

    public final void run() {
        String str = gxc.f5737a;
        String valueOf = String.valueOf(this.f5747a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("configurePreviewDimensions(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        bli.m871d(str, stringBuilder.toString());
        this.f5748b.f5738b.mo1666a();
    }
}
