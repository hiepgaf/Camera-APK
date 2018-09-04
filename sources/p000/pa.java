package p000;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* renamed from: pa */
final class pa extends ov implements VisibilityListener {
    /* renamed from: c */
    private jg f22515c;

    public pa(oz ozVar, Context context, ActionProvider actionProvider) {
        super(ozVar, actionProvider);
    }

    /* renamed from: b */
    public final boolean mo3311b() {
        return this.b.isVisible();
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        jg jgVar = this.f22515c;
        if (jgVar != null) {
            jgVar.f7795a.f19512d.m14264j();
        }
    }

    /* renamed from: a */
    public final View mo3309a(MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    /* renamed from: e */
    public final boolean mo3312e() {
        return this.b.overridesItemVisibility();
    }

    /* renamed from: a */
    public final void mo3310a(jg jgVar) {
        this.f22515c = jgVar;
        this.b.setVisibilityListener(this);
    }
}
