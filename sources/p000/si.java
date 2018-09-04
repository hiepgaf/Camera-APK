package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: si */
final class si extends nk {
    /* renamed from: a */
    public boolean f19563a = true;

    si(Drawable drawable) {
        super(drawable);
    }

    public final void draw(Canvas canvas) {
        if (this.f19563a) {
            super.draw(canvas);
        }
    }

    public final void setHotspot(float f, float f2) {
        if (this.f19563a) {
            super.setHotspot(f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f19563a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public final boolean setState(int[] iArr) {
        return this.f19563a ? super.setState(iArr) : false;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.f19563a ? super.setVisible(z, z2) : false;
    }
}
