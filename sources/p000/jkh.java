package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jkh */
final class jkh extends anq {
    /* renamed from: b */
    private final List f21872b;
    /* renamed from: c */
    private final int f21873c;

    jkh(Context context, List list, int i) {
        Drawable animationDrawable = new AnimationDrawable();
        Resources resources = context.getResources();
        for (jqr jqr : list) {
            Drawable bitmapDrawable = new BitmapDrawable(resources, (Bitmap) jqr.mo3191e());
            bitmapDrawable.setTargetDensity(((Bitmap) jqr.mo3191e()).getDensity());
            animationDrawable.addFrame(bitmapDrawable, i);
        }
        super(animationDrawable);
        this.f21872b = new ArrayList(list);
        int i2 = 0;
        for (jqr jqr2 : list) {
            i2 = jqr2.mo3499c() + i2;
        }
        this.f21873c = i2;
    }

    /* renamed from: c */
    public final Class mo56c() {
        return AnimationDrawable.class;
    }

    /* renamed from: d */
    public final int mo57d() {
        return this.f21873c;
    }

    /* renamed from: e */
    public final void mo58e() {
        for (jqr close : this.f21872b) {
            close.close();
        }
        this.f21872b.clear();
    }
}
