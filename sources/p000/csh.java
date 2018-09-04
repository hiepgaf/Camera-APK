package p000;

import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: csh */
public final class csh {
    /* renamed from: a */
    public static final String f2639a = bli.m862a("FilmstripController");
    /* renamed from: b */
    public final kwa f2640b;
    /* renamed from: c */
    public final hfz f2641c;
    /* renamed from: d */
    public final Context f2642d;
    /* renamed from: e */
    public final boolean f2643e;
    /* renamed from: f */
    public final gsp f2644f;
    /* renamed from: g */
    public final gev f2645g;
    /* renamed from: h */
    public final gln f2646h;
    /* renamed from: i */
    public final FragmentManager f2647i;
    /* renamed from: j */
    public final irs f2648j;
    /* renamed from: k */
    public final glj f2649k;
    /* renamed from: l */
    private final csl f2650l;
    /* renamed from: m */
    private final bag f2651m;
    /* renamed from: n */
    private final csf f2652n;
    /* renamed from: o */
    private final gst f2653o;

    public csh(csl csl, hfz hfz, boolean z, Context context, FragmentManager fragmentManager, bag bag, csf csf, gst gst, kwa kwa, gsp gsp, gev gev, gln gln, irs irs, glj glj) {
        this.f2647i = fragmentManager;
        this.f2650l = (csl) jri.m13152b((Object) csl);
        this.f2641c = (hfz) jri.m13152b((Object) hfz);
        this.f2642d = (Context) jri.m13152b((Object) context);
        this.f2651m = (bag) jri.m13152b((Object) bag);
        this.f2652n = csf;
        this.f2643e = z;
        this.f2653o = (gst) jri.m13152b((Object) gst);
        this.f2640b = (kwa) jri.m13152b((Object) kwa);
        this.f2644f = (gsp) jri.m13152b((Object) gsp);
        this.f2645g = (gev) jri.m13152b((Object) gev);
        this.f2646h = (gln) jri.m13152b((Object) gln);
        this.f2648j = irs;
        this.f2649k = glj;
    }

    /* renamed from: a */
    public final Bitmap m1457a() {
        Throwable e;
        kpk a = this.f2653o.m2800a();
        if (a.isDone()) {
            try {
                gss gss = (gss) a.get();
                if (gss != null) {
                    Bitmap bitmap = gss.f5670a;
                    if (!(bitmap == null || bitmap.isRecycled())) {
                        return gss.f5670a;
                    }
                }
            } catch (ExecutionException e2) {
                e = e2;
                bli.m874e(f2639a, "getCaptureIndicatorBitmapOrNull() failed to get bitmap from capture indicator cache.", e);
                return null;
            } catch (InterruptedException e3) {
                e = e3;
                bli.m874e(f2639a, "getCaptureIndicatorBitmapOrNull() failed to get bitmap from capture indicator cache.", e);
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m1458a(cre cre) {
        gkr b = this.f2651m.f1041a.mo1506b(cre.mo1066e().mo1033g().f4155h);
        if (b != null) {
            b.mo2877d();
        } else {
            this.f2641c.mo1014b(cre);
            csl csl = this.f2650l;
            if (csl.f12612e) {
                csl.m8708a();
            }
            bli.m871d(csl.f12608a, "Showing undo deletion bar");
            csl.f12612e = true;
            csl.f12611d.setOnTouchListener(new csn(csl));
            csl.f12610c.setClickable(true);
            csl.f12610c.setAlpha(0.0f);
            csl.f12610c.setVisibility(0);
            csl.f12610c.animate().setDuration(200).alpha(1.0f).setListener(null).start();
        }
        int d = this.f2641c.mo1019d();
        if (d == 0 || (d == 1 && this.f2643e)) {
            this.f2652n.mo2734N();
        }
    }
}
