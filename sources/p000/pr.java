package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

/* compiled from: PG */
/* renamed from: pr */
public final class pr extends Drawable {
    /* renamed from: a */
    private final ActionBarContainer f9035a;

    public pr(ActionBarContainer actionBarContainer) {
        this.f9035a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f9035a;
        Drawable drawable;
        if (actionBarContainer.f633e) {
            drawable = actionBarContainer.f632d;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        drawable = actionBarContainer.f630b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        actionBarContainer = this.f9035a;
        Drawable drawable2 = actionBarContainer.f631c;
        if (drawable2 != null && actionBarContainer.f634f) {
            drawable2.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f9035a;
        Drawable drawable;
        if (actionBarContainer.f633e) {
            drawable = actionBarContainer.f632d;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        drawable = actionBarContainer.f630b;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
