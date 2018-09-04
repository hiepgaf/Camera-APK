package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cqs */
public final class cqs extends cpy {
    /* renamed from: a */
    private static final String f20783a = bli.m862a("VideoItem");
    /* renamed from: j */
    private static final ers f20784j = new exb().m10030a(ert.CAN_SHARE).m10030a(ert.CAN_PLAY).m10030a(ert.CAN_DELETE).m10030a(ert.CAN_SWIPE_AWAY).m10030a(ert.HAS_DETAILED_CAPTURE_INFO).m10030a(ert.IS_VIDEO).m10036d();
    /* renamed from: k */
    private final cqx f20785k;
    /* renamed from: l */
    private iqp f20786l;

    public cqs(Context context, cqb cqb, cqv cqv, cqx cqx) {
        super(context, cqb, cqv, f20784j);
        this.f20785k = cqx;
    }

    /* renamed from: a */
    public final View mo1041a(kbg kbg, hfz hfz, boolean z, cpx cpx) {
        View view;
        cqu cqu;
        View view2;
        if (kbg.mo2084b()) {
            View view3 = (View) kbg.mo2081a();
            view = view3;
            cqu e = cqs.m15171e(view3);
        } else {
            Object obj = null;
            view = null;
        }
        if (e == null) {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.filmstrip_video, null);
            inflate.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(go.ao - 1));
            cqu cqu2 = new cqu((ImageView) inflate.findViewById(R.id.video_view), (ImageView) inflate.findViewById(R.id.play_button));
            inflate.setTag(R.id.mediadata_tag_target, cqu2);
            cqu = cqu2;
            view2 = inflate;
        } else {
            view2 = view;
            cqu = e;
        }
        if (cqu == null) {
            bli.m873e(f20783a, "getView called with a view that is not compatible with VideoItem.");
        } else {
            cqu.f2573b.setOnClickListener(new cqt(this, cpx));
            view2.setContentDescription(this.c.getResources().getString(R.string.video_date_content_description, new Object[]{b.format(((cqv) this.e).f4153f)}));
        }
        this.i.mo3557a(cqu.f2572a);
        mo1046c(view2);
        return view2;
    }

    /* renamed from: a */
    public final boolean mo1029a() {
        ContentResolver contentResolver = this.c.getContentResolver();
        Uri uri = cqr.f2568a;
        long j = ((cqv) this.e).f4149b;
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("_id=");
        stringBuilder.append(j);
        return super.mo1029a() || contentResolver.delete(uri, stringBuilder.toString(), null) > 0;
    }

    /* renamed from: a */
    public final hio mo1042a(int i, int i2) {
        try {
            return new hio(kbg.m4744b((Bitmap) this.d.m1399a().m119a(this.d.m1400a(cpy.m8601a(this.e), mo1034h())).m120a(((cqv) this.e).f4155h).m121a((int) kvl.UNSET_ENUM_VALUE, (int) kvl.UNSET_ENUM_VALUE).get()));
        } catch (InterruptedException e) {
            bli.m866b(f20783a, "Fails to generate thumbnail");
            return new hio(kau.f19138a);
        } catch (ExecutionException e2) {
            bli.m866b(f20783a, "Fails to generate thumbnail");
            return new hio(kau.f19138a);
        }
    }

    /* renamed from: b */
    private final int m15169b() {
        int i = this.f.f4114b.f4118d;
        if (i > 0) {
            return i;
        }
        return ((cqv) this.e).m2079g().f7330b;
    }

    /* renamed from: d */
    private final int m15170d() {
        int i = this.f.f4114b.f4117c;
        if (i > 0) {
            return i;
        }
        return ((cqv) this.e).m2079g().f7329a;
    }

    /* renamed from: h */
    public final iqp mo1034h() {
        int b;
        int d;
        if (m15172n()) {
            b = m15169b();
        } else {
            b = m15170d();
        }
        if (m15172n()) {
            d = m15170d();
        } else {
            d = m15169b();
        }
        iqp iqp = this.f20786l;
        if (iqp != null && b == iqp.f7329a) {
            if (d != iqp.f7330b) {
            }
            return this.f20786l;
        }
        this.f20786l = new iqp(b, d);
        return this.f20786l;
    }

    /* renamed from: e */
    public final int mo1048e() {
        return go.ao;
    }

    /* renamed from: j */
    public final kbg mo1036j() {
        kbg j = super.mo1036j();
        if (j.mo2084b()) {
            ((cqd) j.mo2081a()).m1405a(8, cqd.m1402a(this.c, TimeUnit.MILLISECONDS.toSeconds(((cqv) this.e).f12541a)));
        }
        return j;
    }

    /* renamed from: e */
    private static cqu m15171e(View view) {
        Object tag = view.getTag(R.id.mediadata_tag_target);
        return (tag == null || !(tag instanceof cqu)) ? null : (cqu) tag;
    }

    /* renamed from: n */
    private final boolean m15172n() {
        String str = this.f12516f.f4114b.f4116b;
        if ("90".equals(str) || "270".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1027a(View view) {
        super.mo1027a(view);
        cqu e = cqs.m15171e(view);
        if (e != null) {
            acc.m100b(this.c).m6282a(e.f2572a);
        }
    }

    /* renamed from: c */
    public final err mo1045c() {
        return this.f20785k.m8670a(((cqv) this.e).f4155h);
    }

    /* renamed from: b */
    public final void mo1044b(View view) {
    }

    /* renamed from: c */
    public final void mo1046c(View view) {
        cqu e = cqs.m15171e(view);
        if (e != null) {
            this.d.m1399a().m119a(this.d.m1400a(cpy.m8601a(this.e), mo1034h())).m120a(((cqv) this.e).f4155h).m123a(e.f2572a).mo2628a();
        }
    }

    /* renamed from: a */
    public final void mo1043a(View view, Bitmap bitmap) {
        cqu e = cqs.m15171e(view);
        if (e != null) {
            this.d.m1399a().m119a(this.d.m1400a(cpy.m8601a(this.e), mo1034h())).m119a(new aqg().m604a(new BitmapDrawable(this.c.getResources(), bitmap))).m120a(((cqv) this.e).f4155h).m123a(e.f2572a).mo2628a();
        }
    }

    /* renamed from: d */
    public final void mo1047d(View view) {
        cqu e = cqs.m15171e(view);
        if (e != null) {
            this.d.m1399a().m119a(this.d.m1400a(cpy.m8601a(this.e), mo1034h())).m120a(((cqv) this.e).f4155h).m123a(e.f2572a);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(((cqv) this.e).toString());
        String str = "VideoItem: ";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
