package p000;

import android.app.AlertDialog;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: hkv */
public class hkv {
    /* renamed from: a */
    public final gvt f6315a;
    /* renamed from: b */
    public final String f6316b;
    /* renamed from: c */
    public final gtl f6317c;
    /* renamed from: d */
    public final eij f6318d;
    /* renamed from: e */
    public final BottomBarController f6319e;
    /* renamed from: f */
    public final gxz f6320f;
    /* renamed from: g */
    public ebd f6321g;
    /* renamed from: h */
    public AlertDialog f6322h;
    /* renamed from: i */
    private final View f6323i;
    /* renamed from: j */
    private final Resources f6324j;
    /* renamed from: k */
    private final TextView f6325k = ((TextView) this.f6323i.findViewById(R.id.recording_time));
    /* renamed from: l */
    private final how f6326l;

    public hkv(gvt gvt, View view, Resources resources, LayoutInflater layoutInflater, gtl gtl, eij eij, BottomBarController bottomBarController, gxz gxz, how how) {
        this.f6323i = view;
        this.f6324j = resources;
        this.f6315a = gvt;
        this.f6318d = eij;
        this.f6319e = bottomBarController;
        this.f6320f = gxz;
        this.f6326l = how;
        ViewGroup viewGroup = (ViewGroup) this.f6323i.findViewById(R.id.root_module_layout);
        viewGroup.removeAllViews();
        layoutInflater.inflate(R.layout.video_module, viewGroup, true);
        gxz.m2907a(this.f6325k);
        this.f6316b = this.f6324j.getString(R.string.video_accessibility_peek);
        this.f6317c = gtl;
    }

    /* renamed from: a */
    public OnClickListener mo1156a() {
        return new djw(this);
    }

    /* renamed from: e */
    private final OnDismissListener m3232e() {
        return new djy(this);
    }

    /* renamed from: b */
    public OnClickListener mo1158b() {
        return new djx(this);
    }

    /* renamed from: a */
    public final void m3234a(inc inc) {
        this.f6326l.mo1754a(kbg.m4744b(inc));
    }

    /* renamed from: b */
    public final void m3237b(boolean z) {
        this.f6321g.m9611c(false);
        if (z) {
            this.f6322h = this.f6317c.mo1630d(mo1158b());
            this.f6322h.getWindow().setLayout(-1, -1);
            this.f6322h.setOnDismissListener(m3232e());
            return;
        }
        this.f6322h = this.f6317c.mo1631e(mo1158b());
        m3240d();
    }

    /* renamed from: c */
    public final void m3239c(boolean z) {
        this.f6318d.mo1560A();
        m3242e(z);
    }

    /* renamed from: a */
    public void mo1157a(boolean z) {
        this.f6321g.m9608b(z);
        if (z) {
            this.f6321g.m9613d(false);
        }
    }

    /* renamed from: d */
    public final void m3241d(boolean z) {
        this.f6319e.setSnapshotButtonClickEnabled(z);
    }

    /* renamed from: e */
    public final void m3242e(boolean z) {
        mo1157a(true);
        this.f6315a.mo1661a(false);
        this.f6320f.m2908a(z);
        this.f6321g.m9623o();
    }

    /* renamed from: d */
    public final void m3240d() {
        this.f6322h.setOnDismissListener(m3232e());
        if (!this.f6322h.isShowing()) {
            this.f6322h.show();
            ((TextView) this.f6322h.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: c */
    public void mo1159c() {
        this.f6321g.m9610c(hhx.VIDEO);
    }
}
