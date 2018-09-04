package p000;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: nr */
public final class nr extends nn implements oq {
    /* renamed from: a */
    private Context f19431a;
    /* renamed from: d */
    private ActionBarContextView f19432d;
    /* renamed from: e */
    private no f19433e;
    /* renamed from: f */
    private WeakReference f19434f;
    /* renamed from: g */
    private boolean f19435g;
    /* renamed from: h */
    private op f19436h;

    public nr(Context context, ActionBarContextView actionBarContextView, no noVar) {
        this.f19431a = context;
        this.f19432d = actionBarContextView;
        this.f19433e = noVar;
        op opVar = new op(actionBarContextView.getContext());
        this.f19436h = opVar;
        this.f19436h.mo3313a((oq) this);
    }

    /* renamed from: b */
    public final void mo2400b() {
        if (!this.f19435g) {
            this.f19435g = true;
            this.f19432d.sendAccessibilityEvent(32);
            this.f19433e.mo2355a(this);
        }
    }

    /* renamed from: c */
    public final View mo2403c() {
        WeakReference weakReference = this.f19434f;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    /* renamed from: d */
    public final Menu mo2404d() {
        return this.f19436h;
    }

    /* renamed from: e */
    public final MenuInflater mo2405e() {
        return new nu(this.f19432d.getContext());
    }

    /* renamed from: f */
    public final CharSequence mo2406f() {
        return this.f19432d.f10034g;
    }

    /* renamed from: g */
    public final CharSequence mo2407g() {
        return this.f19432d.f10033f;
    }

    /* renamed from: h */
    public final void mo2408h() {
        this.f19433e.mo2358b(this, this.f19436h);
    }

    /* renamed from: i */
    public final boolean mo2409i() {
        return this.f19432d.f10036i;
    }

    /* renamed from: a */
    public final boolean mo2337a(op opVar, MenuItem menuItem) {
        return this.f19433e.mo2357a((nn) this, menuItem);
    }

    /* renamed from: m */
    public final void mo2352m() {
        mo2408h();
        this.f19432d.mo287a();
    }

    /* renamed from: a */
    public final void mo2397a(View view) {
        WeakReference weakReference;
        this.f19432d.m6788a(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f19434f = weakReference;
    }

    /* renamed from: a */
    public final void mo2396a(int i) {
        mo2398a(this.f19431a.getString(i));
    }

    /* renamed from: a */
    public final void mo2398a(CharSequence charSequence) {
        this.f19432d.m6789a(charSequence);
    }

    /* renamed from: b */
    public final void mo2401b(int i) {
        mo2402b(this.f19431a.getString(i));
    }

    /* renamed from: b */
    public final void mo2402b(CharSequence charSequence) {
        this.f19432d.m6794b(charSequence);
    }

    /* renamed from: a */
    public final void mo2399a(boolean z) {
        super.mo2399a(z);
        this.f19432d.m6791a(z);
    }
}
