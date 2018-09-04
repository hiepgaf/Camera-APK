package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: PG */
/* renamed from: anz */
final class anz extends ConstantState {
    /* renamed from: a */
    public final aod f796a;

    anz(aod aod) {
        this.f796a = aod;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return new any(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return newDrawable();
    }
}
