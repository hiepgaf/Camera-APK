package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.widget.PhotoItemView;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@TargetApi(4)
/* compiled from: PG */
/* renamed from: cql */
public final class cql extends cpy {
    /* renamed from: j */
    private static final String f20775j = bli.m862a("PhotoItem");
    /* renamed from: k */
    private static final ers f20776k = new exb().m10030a(ert.CAN_SHARE).m10030a(ert.CAN_DELETE).m10030a(ert.CAN_SWIPE_AWAY).m10030a(ert.CAN_ZOOM_IN_PLACE).m10030a(ert.HAS_DETAILED_CAPTURE_INFO).m10030a(ert.IS_IMAGE).m10030a(ert.IS_ANIMATION).m10036d();
    /* renamed from: l */
    private static final ers f20777l = new exb().m10030a(ert.CAN_EDIT).m10030a(ert.CAN_SHARE).m10030a(ert.CAN_DELETE).m10030a(ert.CAN_SWIPE_AWAY).m10030a(ert.CAN_ZOOM_IN_PLACE).m10030a(ert.HAS_DETAILED_CAPTURE_INFO).m10030a(ert.IS_IMAGE).m10036d();
    /* renamed from: m */
    private static final ers f20778m = new exb().m10030a(ert.IS_RENDERING).m10030a(ert.CAN_DELETE).m10036d();
    /* renamed from: n */
    private static final ers f20779n = new exb().m10030a(ert.IS_RENDERING).m10036d();
    /* renamed from: a */
    public kbg f20780a;
    /* renamed from: o */
    private final cqm f20781o;
    /* renamed from: p */
    private final gsp f20782p;

    public cql(Context context, cqb cqb, eru eru, cqm cqm, gsp gsp) {
        ers ers;
        if (eru.f4156i) {
            if (eru.f4160m) {
                ers = f20778m;
            } else {
                ers = f20779n;
            }
        } else if (ixx.m4332a(eru.f4151d) == ixx.GIF) {
            ers = f20776k;
        } else {
            ers = f20777l;
        }
        super(context, cqb, eru, ers);
        this.f20780a = kau.f19138a;
        this.f20781o = (cqm) jri.m13152b((Object) cqm);
        this.f20782p = (gsp) jri.m13152b((Object) gsp);
    }

    /* renamed from: a */
    public final View mo1041a(kbg kbg, hfz hfz, boolean z, cpx cpx) {
        View view;
        View view2;
        if (kbg.mo2084b()) {
            view = (View) kbg.mo2081a();
            if (view instanceof PhotoItemView) {
                view = (PhotoItemView) view;
            } else {
                bli.m873e(f20775j, "getView was called with a view that is not an ImageView!");
                view = null;
            }
        } else {
            view = null;
        }
        if (view == null) {
            view = (PhotoItemView) LayoutInflater.from(this.c).inflate(R.layout.photo_item_view, null, false);
            view.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(go.an - 1));
            view2 = view;
        } else {
            view2 = view;
        }
        mo1046c(view2);
        ImageView a = view2.m1339a();
        if (this.f12517g.m2076e()) {
            a.setContentDescription(this.c.getResources().getString(R.string.media_processing_content_description));
        } else {
            int i;
            erj erj = this.f12516f.f4114b;
            if (erj.f4120f) {
                i = R.string.panorama_date_content_description;
            } else if (erj.f4121g) {
                i = R.string.panorama_date_content_description;
            } else {
                i = !erj.f4122h ? erj.f4123i ? R.string.refocus_date_content_description : R.string.photo_date_content_description : R.string.photosphere_date_content_description;
            }
            a.setContentDescription(this.c.getResources().getString(i, new Object[]{b.format(this.e.f4153f)}));
        }
        this.i.mo3557a(view2.m1339a());
        if (view2.f2443a == null) {
            view2.f2443a = (ImageView) view2.findViewById(R.id.photo_sphere_center_badge);
        }
        ImageView imageView = view2.f2443a;
        if (this.f.f4114b.f4122h) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        return view2;
    }

    /* renamed from: a */
    public final boolean mo1029a() {
        ContentResolver contentResolver = this.c.getContentResolver();
        Uri uri = cqk.f2564a;
        long j = this.e.f4149b;
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("_id=");
        stringBuilder.append(j);
        return super.mo1029a() || contentResolver.delete(uri, stringBuilder.toString(), null) > 0;
    }

    /* renamed from: a */
    public final hio mo1042a(int i, int i2) {
        String str;
        String valueOf;
        eru eru = this.f12515e;
        if (this.f12517g.m2076e()) {
            kbg c = this.f20782p.mo1644c(eru.f4155h);
            if (c.mo2084b()) {
                return new hio(kbg.m4744b(hid.m3168a(((anq) c.mo2081a()).m6850f())));
            }
            return new hio(kau.f19138a);
        }
        try {
            InputStream fileInputStream = new FileInputStream(eru.f4154g);
            int i3 = eru.m2079g().f7329a;
            int i4 = eru.m2079g().f7330b;
            int i5 = eru.f4158k;
            Point a = hjg.m3202a(i3, i4, i5, i, i2);
            if (i5 % MediaDecoder.ROTATE_180 != 0) {
                i3 = a.x;
                a.x = a.y;
                a.y = i3;
            }
            Bitmap a2 = cpz.m1396a(fileInputStream, eru.m2079g().f7329a, eru.m2079g().f7330b, (int) (((float) a.x) * 0.7f), (int) (((double) a.y) * 0.7d), eru.f4158k);
            try {
                fileInputStream.close();
            } catch (IOException e) {
                str = f20775j;
                valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("Failed to close the stream.");
                stringBuilder.append(valueOf);
                bli.m866b(str, stringBuilder.toString());
            }
            return new hio(kbg.m4744b(a2));
        } catch (FileNotFoundException e2) {
            String str2 = f20775j;
            valueOf = String.valueOf(eru.f4154g);
            str = "File not found:";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            bli.m866b(str2, valueOf);
            return new hio(kau.f19138a);
        }
    }

    /* renamed from: e */
    public final int mo1048e() {
        return go.an;
    }

    /* renamed from: j */
    public final kbg mo1036j() {
        kbg j = super.mo1036j();
        if (j.mo2084b()) {
            cqd cqd = (cqd) j.mo2081a();
            if (ixx.m4332a(this.e.f4151d) == ixx.JPEG) {
                cqd.m1404a(cqd, this.e.f4154g);
            }
        }
        return j;
    }

    /* renamed from: a */
    public static eru m15155a(Uri uri, iqp iqp, long j, boolean z, kbg kbg) {
        Date date = new Date(j);
        erv erv = (erv) ((erv) new erv(uri).m2081a(date)).m2083b(date);
        erv.f4171i = iqp;
        erv = (erv) ((erv) erv.mo1051c()).m2085d();
        erv.f4173k = z;
        erv = (erv) erv.mo1051c();
        if (kbg.mo2084b()) {
            erv.m2080a(((Long) kbg.mo2081a()).longValue());
        }
        return erv.mo1050b();
    }

    /* renamed from: a */
    public final boolean mo1030a(cfh cfh, cre cre) {
        if (!this.f.f4114b.f4122h) {
            return false;
        }
        cfh.mo2738a(this.e.f4155h);
        return true;
    }

    /* renamed from: a */
    public final void mo1027a(View view) {
        super.mo1027a(view);
        acc.m100b(this.c).m6282a(view);
        if (this.f20780a.mo2084b()) {
            this.f20780a = kau.f19138a;
        }
    }

    /* renamed from: c */
    public final err mo1045c() {
        if (!this.f12517g.m2076e()) {
            return this.f20781o.m8618a(this.e.f4155h);
        }
        if (this.f20782p.mo1646e(this.e.f4155h) != null) {
            return this.f20781o.m8619a(this.e.f4155h, this.e.f4160m, kbg.m4745c(Long.valueOf(this.e.f4149b)));
        }
        bli.m873e(f20775j, "Cannot refresh item, session does not exist.");
        return this;
    }

    /* renamed from: b */
    public final void mo1044b(View view) {
        if (!(view instanceof PhotoItemView)) {
            bli.m873e(f20775j, "renderFullRes was called with an object that is not an ImageView!");
        } else if (this.f12517g.m2076e()) {
            cpy.m8602a(this.e.f4155h, ((PhotoItemView) view).m1339a(), this.f20782p);
        } else {
            Object obj = this.e.f4155h;
            iqp g = this.e.m2079g();
            cqb cqb = this.d;
            adl a = cpy.m8601a(this.e);
            g = cqb.m1397a(g, (double) cqb.f2554d, cqb.m1398c());
            acj a2 = this.d.m1401b().m119a(new aqg().m598a(a).m607b(cqb.f2549a).m611e().m608b(g.f7329a, g.f7330b).m609c());
            a2.f238c = m15154a((Uri) obj);
            a2.m120a(obj).m123a(((PhotoItemView) view).m1339a());
        }
    }

    /* renamed from: a */
    private final acj m15154a(Uri uri) {
        aqg aqg;
        aqg a = this.d.m1400a(cpy.m8601a(this.e), this.h);
        if (this.e == null) {
            aqg = a;
        } else if (ixx.m4332a(this.e.f4151d) == ixx.GIF) {
            aqg = a.m610d();
        } else {
            aqg = a;
        }
        if (this.f20780a.mo2084b()) {
            aqg.m604a(((anq) this.f20780a.mo2081a()).m6850f());
            return this.d.m1401b().m119a(aqg).m120a((Object) uri);
        }
        acj a2 = this.d.m1401b().m119a(aqg);
        a2.f238c = m15156b(uri);
        return a2.m120a((Object) uri);
    }

    /* renamed from: c */
    public final void mo1046c(View view) {
        if (!(view instanceof PhotoItemView)) {
            bli.m873e(f20775j, "renderThumbnail was called with an object that is not an ImageView!");
        } else if (this.f12517g.m2076e()) {
            cpy.m8602a(this.e.f4155h, ((PhotoItemView) view).m1339a(), this.f20782p);
        } else {
            m15154a(this.e.f4155h).m123a(((PhotoItemView) view).m1339a());
        }
    }

    /* renamed from: a */
    public final void mo1043a(View view, Bitmap bitmap) {
    }

    /* renamed from: d */
    public final void mo1047d(View view) {
        if (!(view instanceof PhotoItemView)) {
            bli.m873e(f20775j, "renderTiny was called with an object that is not an ImageView!");
        } else if (this.f12517g.m2076e()) {
            cpy.m8602a(this.e.f4155h, ((PhotoItemView) view).m1339a(), this.f20782p);
        } else {
            m15156b(this.e.f4155h).m123a(((PhotoItemView) view).m1339a());
        }
    }

    /* renamed from: b */
    private final acj m15156b(Uri uri) {
        cqb cqb = this.d;
        adl a = cpy.m8601a(this.e);
        iqp a2 = cqb.m1397a(cqb.f2552b, (double) cqb.f2553c, cqb.m1398c());
        return this.d.m1401b().m119a(new aqg().m598a(a).m607b(cqb.f2549a).m611e().m608b(a2.f7329a, a2.f7330b).m609c()).m120a((Object) uri);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e.toString());
        String str = "PhotoItem: ";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
