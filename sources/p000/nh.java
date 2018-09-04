package p000;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: nh */
public final class nh extends nn implements oq {
    /* renamed from: a */
    public final op f19426a;
    /* renamed from: d */
    private final Context f19427d;
    /* renamed from: e */
    private no f19428e;
    /* renamed from: f */
    private WeakReference f19429f;
    /* renamed from: g */
    private final /* synthetic */ ne f19430g;

    public nh(ne neVar, Context context, no noVar) {
        this.f19430g = neVar;
        this.f19427d = context;
        this.f19428e = noVar;
        op opVar = new op(context);
        this.f19426a = opVar;
        this.f19426a.mo3313a((oq) this);
    }

    /* renamed from: a */
    public final boolean m14170a() {
        this.f19426a.m14266l();
        try {
            boolean a = this.f19428e.mo2356a((nn) this, this.f19426a);
            return a;
        } finally {
            this.f19426a.m14265k();
        }
    }

    /* renamed from: b */
    public final void mo2400b() {
        ne neVar = this.f19430g;
        if (neVar.f19408g == this) {
            if (ne.m14143a(neVar.f19412k, neVar.f19413l, false)) {
                this.f19428e.mo2355a(this);
            } else {
                neVar = this.f19430g;
                neVar.f19409h = this;
                neVar.f19410i = this.f19428e;
            }
            this.f19428e = null;
            this.f19430g.m14158e(false);
            ActionBarContextView actionBarContextView = this.f19430g.f19406e;
            if (actionBarContextView.f10035h == null) {
                actionBarContextView.m6793b();
            }
            this.f19430g.f19405d.f9146a.sendAccessibilityEvent(32);
            neVar = this.f19430g;
            neVar.f19403b.m6804a(neVar.f19415n);
            this.f19430g.f19408g = null;
        }
    }

    /* renamed from: c */
    public final View mo2403c() {
        WeakReference weakReference = this.f19429f;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    /* renamed from: d */
    public final Menu mo2404d() {
        return this.f19426a;
    }

    /* renamed from: e */
    public final MenuInflater mo2405e() {
        return new nu(this.f19427d);
    }

    /* renamed from: f */
    public final CharSequence mo2406f() {
        return this.f19430g.f19406e.f10034g;
    }

    /* renamed from: g */
    public final CharSequence mo2407g() {
        return this.f19430g.f19406e.f10033f;
    }

    /* renamed from: h */
    public final void mo2408h() {
        if (this.f19430g.f19408g == this) {
            this.f19426a.m14266l();
            try {
                this.f19428e.mo2358b(this, this.f19426a);
            } finally {
                this.f19426a.m14265k();
            }
        }
    }

    /* renamed from: i */
    public final boolean mo2409i() {
        return this.f19430g.f19406e.f10036i;
    }

    /* renamed from: a */
    public final boolean mo2337a(op opVar, MenuItem menuItem) {
        no noVar = this.f19428e;
        return noVar != null ? noVar.mo2357a((nn) this, menuItem) : false;
    }

    /* renamed from: m */
    public final void mo2352m() {
        if (this.f19428e != null) {
            mo2408h();
            this.f19430g.f19406e.mo287a();
        }
    }

    /* renamed from: a */
    public final void mo2397a(View view) {
        this.f19430g.f19406e.m6788a(view);
        this.f19429f = new WeakReference(view);
    }

    /* renamed from: a */
    public final void mo2396a(int i) {
        mo2398a(this.f19430g.f19402a.getResources().getString(i));
    }

    /* renamed from: a */
    public final void mo2398a(CharSequence charSequence) {
        this.f19430g.f19406e.m6789a(charSequence);
    }

    /* renamed from: b */
    public final void mo2401b(int i) {
        mo2402b(this.f19430g.f19402a.getResources().getString(i));
    }

    /* renamed from: b */
    public final void mo2402b(CharSequence charSequence) {
        this.f19430g.f19406e.m6794b(charSequence);
    }

    /* renamed from: a */
    public final void mo2399a(boolean z) {
        super.mo2399a(z);
        this.f19430g.f19406e.m6791a(z);
    }
}
