package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: PG */
/* renamed from: anq */
public abstract class anq implements agi, agn {
    /* renamed from: a */
    public final Drawable f10094a;

    public anq(Drawable drawable) {
        this.f10094a = (Drawable) aqe.m585a((Object) drawable, "Argument must not be null");
    }

    /* renamed from: f */
    public final Drawable m6850f() {
        ConstantState constantState = this.f10094a.getConstantState();
        if (constantState == null) {
            return this.f10094a;
        }
        return constantState.newDrawable();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo55b() {
        return m6850f();
    }

    /* renamed from: a */
    public void mo103a() {
        Drawable drawable = this.f10094a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof any) {
            ((any) drawable).m6869b().prepareToDraw();
        }
    }
}
