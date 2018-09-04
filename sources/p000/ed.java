package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* renamed from: ed */
final class ed extends ConstantState {
    /* renamed from: a */
    private final ConstantState f3534a;

    public ed(ConstantState constantState) {
        this.f3534a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f3534a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f3534a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        Drawable dwVar = new dw();
        dwVar.a = (VectorDrawable) this.f3534a.newDrawable();
        return dwVar;
    }

    public final Drawable newDrawable(Resources resources) {
        Drawable dwVar = new dw();
        dwVar.a = (VectorDrawable) this.f3534a.newDrawable(resources);
        return dwVar;
    }

    public final Drawable newDrawable(Resources resources, Theme theme) {
        Drawable dwVar = new dw();
        dwVar.a = (VectorDrawable) this.f3534a.newDrawable(resources, theme);
        return dwVar;
    }
}
