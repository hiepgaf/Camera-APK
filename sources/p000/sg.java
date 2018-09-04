package p000;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.ScaleDrawable;

/* compiled from: PG */
/* renamed from: sg */
public final class sg {
    static {
        Rect rect = new Rect();
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }

    /* renamed from: a */
    public static boolean m5806a(Drawable drawable) {
        Drawable drawable2 = drawable;
        while (!(drawable2 instanceof DrawableContainer)) {
            if (!(drawable2 instanceof he)) {
                if (!(drawable2 instanceof nk)) {
                    if (!(drawable2 instanceof ScaleDrawable)) {
                        break;
                    }
                    drawable2 = ((ScaleDrawable) drawable2).getDrawable();
                } else {
                    drawable2 = ((nk) drawable2).f8925d;
                }
            } else {
                drawable2 = ((he) drawable2).m3090a();
            }
        }
        ConstantState constantState = drawable2.getConstantState();
        if (constantState instanceof DrawableContainerState) {
            for (Drawable a : ((DrawableContainerState) constantState).getChildren()) {
                if (!sg.m5806a(a)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    static void m5805a() {
    }

    /* renamed from: a */
    public static Mode m5804a(int i, Mode mode) {
        switch (i) {
            case 3:
                return Mode.SRC_OVER;
            case 5:
                return Mode.SRC_IN;
            case 9:
                return Mode.SRC_ATOP;
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
