package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* compiled from: PG */
/* renamed from: nk */
public class nk extends Drawable implements Callback {
    /* renamed from: d */
    public Drawable f8925d;

    public nk(Drawable drawable) {
        Drawable drawable2 = this.f8925d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8925d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f8925d.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f8925d.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f8925d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f8925d.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f8925d.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f8925d.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f8925d.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f8925d.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f8925d.getPadding(rect);
    }

    public int[] getState() {
        return this.f8925d.getState();
    }

    public Region getTransparentRegion() {
        return this.f8925d.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f8925d.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.f8925d.isStateful();
    }

    public void jumpToCurrentState() {
        this.f8925d.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f8925d.setBounds(rect);
    }

    protected boolean onLevelChange(int i) {
        return this.f8925d.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f8925d.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f8925d.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f8925d.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8925d.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f8925d.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f8925d.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.f8925d.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        ha.m2969a(this.f8925d, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f8925d.setState(iArr);
    }

    public void setTint(int i) {
        this.f8925d.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f8925d.setTintList(colorStateList);
    }

    public void setTintMode(Mode mode) {
        this.f8925d.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f8925d.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
