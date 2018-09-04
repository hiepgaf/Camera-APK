package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.widget.BurstItemView;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: cou */
public final class cou extends cpy {
    /* renamed from: j */
    private static final String f20765j = bli.m862a("BurstItem");
    /* renamed from: k */
    private static final ers f20766k = new exb().m10030a(ert.IS_BURST).m10030a(ert.CAN_DELETE).m10030a(ert.CAN_SWIPE_AWAY).m10036d();
    /* renamed from: l */
    private static final ers f20767l = new exb().m10030a(ert.IS_RENDERING).m10036d();
    /* renamed from: a */
    public kbg f20768a;
    /* renamed from: m */
    private final gev f20769m;
    /* renamed from: n */
    private final gln f20770n;
    /* renamed from: o */
    private final gsp f20771o;

    public cou(gev gev, gln gln, Context context, cqb cqb, cov cov, gsp gsp) {
        ers ers;
        if (cov.m8521d() != 0) {
            ers = f20766k;
        } else {
            ers = f20767l;
        }
        super(context, cqb, cov, ers);
        this.f20768a = kau.f19138a;
        this.f20769m = gev;
        this.f20770n = gln;
        this.f20771o = gsp;
    }

    /* renamed from: a */
    public final View mo1041a(kbg kbg, hfz hfz, boolean z, cpx cpx) {
        View view;
        BurstItemView burstItemView;
        if (kbg.mo2084b()) {
            view = (View) kbg.mo2081a();
            if (view instanceof BurstItemView) {
                view = (BurstItemView) view;
            } else {
                bli.m873e(f20765j, "getView was called with a view that is not an BurstItemView!");
                view = null;
            }
        } else {
            view = null;
        }
        if (view == null) {
            BurstItemView burstItemView2 = (BurstItemView) LayoutInflater.from(this.c).inflate(R.layout.filmstrip_burst, null);
            burstItemView2.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(go.aq - 1));
            burstItemView = burstItemView2;
        } else {
            View view2 = view;
        }
        m15134a(burstItemView);
        if (this.f12517g.m2076e()) {
            burstItemView.setContentDescription(this.c.getResources().getString(R.string.media_processing_content_description));
        } else {
            int d = ((cov) this.e).m8521d();
            burstItemView.setContentDescription(this.c.getResources().getString(R.string.burst_date_content_description, new Object[]{Integer.valueOf(d), b.format(((cov) this.e).f4153f)}));
        }
        this.i.mo3557a(burstItemView.f2437a);
        return burstItemView;
    }

    /* renamed from: a */
    public final boolean mo1029a() {
        for (err a : ((cov) this.e).m8520c()) {
            a.mo1029a();
        }
        File file = new File(((cov) this.e).f4154g);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    if (cov.m8512e(file2) || cov.m8504a(file2) || cov.m8510d(file2) || cov.m8507b(file2)) {
                        file2.delete();
                    }
                } else if (file2.isDirectory() && cov.m8509c(file2)) {
                    for (File delete : file2.listFiles()) {
                        delete.delete();
                    }
                    file2.delete();
                }
            }
        }
        return super.mo1029a();
    }

    /* renamed from: a */
    public final hio mo1042a(int i, int i2) {
        Object a;
        Exception e;
        String str;
        String valueOf;
        String str2;
        err e2 = ((cov) this.e).m8522e();
        if (e2 == null) {
            bli.m869c(f20765j, "Cover item doesnt exist, using storage");
            kbg c = this.f20771o.mo1644c(((cov) this.e).f4155h);
            if (c.mo2084b()) {
                a = hid.m3168a(((anq) c.mo2081a()).m6850f());
            } else {
                bli.m866b(f20765j, "no placeholder in storage either");
                a = null;
            }
        } else {
            try {
                a = hid.m3168a((Drawable) m15135b(e2.mo1033g()).m121a(i, i2).get());
            } catch (InterruptedException e3) {
                e = e3;
                str = f20765j;
                valueOf = String.valueOf(e.getMessage());
                str2 = "Error loading thumbnail: ";
                if (valueOf.length() != 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m866b(str, valueOf);
                a = null;
                return new hio(kbg.m4744b(a));
            } catch (ExecutionException e4) {
                e = e4;
                str = f20765j;
                valueOf = String.valueOf(e.getMessage());
                str2 = "Error loading thumbnail: ";
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                bli.m866b(str, valueOf);
                a = null;
                return new hio(kbg.m4744b(a));
            }
        }
        return new hio(kbg.m4744b(a));
    }

    /* renamed from: b */
    public final cot m15142b() {
        return cov.m8506b(((cov) this.e).m8520c());
    }

    /* renamed from: d */
    public final int m15146d() {
        return ((cov) this.e).m8521d();
    }

    /* renamed from: e */
    public final int mo1048e() {
        return go.aq;
    }

    /* renamed from: a */
    public final boolean mo1030a(cfh cfh, cre cre) {
        if (this.f12517g.m2076e()) {
            return false;
        }
        cfh.mo2741a(cre);
        if (((Activity) cfh.mo2728C().get()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1027a(View view) {
        super.mo1027a(view);
        acc.m100b(this.c).m6282a(view);
        if (this.f20768a.mo2084b()) {
            this.f20768a = kau.f19138a;
        }
    }

    /* renamed from: c */
    public final err mo1045c() {
        if (this.g.m2076e()) {
            return this;
        }
        kbg f = ((cov) this.e).m8523f();
        if (f.mo2084b()) {
            return new cou(this.f20769m, this.f20770n, this.c, this.d, (cov) f.mo2081a(), this.f20771o);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo1044b(View view) {
    }

    /* renamed from: b */
    private final acj m15135b(eru eru) {
        aqg a = this.d.m1400a(cpy.m8601a(eru), this.h);
        if (this.f20768a.mo2084b()) {
            a.m604a(((anq) this.f20768a.mo2081a()).m6850f());
        }
        return this.d.m1401b().m119a(a).m120a(eru.f4155h);
    }

    /* renamed from: c */
    public final void mo1046c(View view) {
        if (view instanceof BurstItemView) {
            m15134a((BurstItemView) view);
        } else {
            bli.m873e(f20765j, "renderThumbnail was called with an object that is not an BurstItemView!");
        }
    }

    /* renamed from: a */
    public final void mo1043a(View view, Bitmap bitmap) {
    }

    /* renamed from: d */
    public final void mo1047d(View view) {
        mo1046c(view);
    }

    /* renamed from: a */
    private final void m15134a(BurstItemView burstItemView) {
        ImageView imageView = burstItemView.f2437a;
        if (imageView == null) {
            bli.m873e(f20765j, "updateView was called with a view that has no burst view!");
            return;
        }
        if (this.f12517g.m2076e()) {
            cpy.m8602a(((cov) this.e).f4155h, imageView, this.f20771o);
        } else {
            err e = ((cov) this.e).m8522e();
            if (e != null) {
                m15135b(e.mo1033g()).m123a(imageView);
            }
        }
        if ((this.f12517g.m2076e() ^ 1) != 0) {
            burstItemView.f2438b.setVisibility(0);
        } else {
            burstItemView.f2438b.setVisibility(8);
        }
    }
}
