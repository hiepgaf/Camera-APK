package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: PG */
/* renamed from: ns */
public final class ns extends ActionMode {
    /* renamed from: a */
    public final nn f8941a;
    /* renamed from: b */
    private final Context f8942b;

    public ns(Context context, nn nnVar) {
        this.f8942b = context;
        this.f8941a = nnVar;
    }

    public final void finish() {
        this.f8941a.mo2400b();
    }

    public final View getCustomView() {
        return this.f8941a.mo2403c();
    }

    public final Menu getMenu() {
        return ha.m2960a(this.f8942b, (hf) this.f8941a.mo2404d());
    }

    public final MenuInflater getMenuInflater() {
        return this.f8941a.mo2405e();
    }

    public final CharSequence getSubtitle() {
        return this.f8941a.mo2406f();
    }

    public final Object getTag() {
        return this.f8941a.f8935b;
    }

    public final CharSequence getTitle() {
        return this.f8941a.mo2407g();
    }

    public final boolean getTitleOptionalHint() {
        return this.f8941a.f8936c;
    }

    public final void invalidate() {
        this.f8941a.mo2408h();
    }

    public final boolean isTitleOptional() {
        return this.f8941a.mo2409i();
    }

    public final void setCustomView(View view) {
        this.f8941a.mo2397a(view);
    }

    public final void setSubtitle(int i) {
        this.f8941a.mo2396a(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f8941a.mo2398a(charSequence);
    }

    public final void setTag(Object obj) {
        this.f8941a.f8935b = obj;
    }

    public final void setTitle(int i) {
        this.f8941a.mo2401b(i);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f8941a.mo2402b(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f8941a.mo2399a(z);
    }
}
