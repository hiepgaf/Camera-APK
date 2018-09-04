package p000;

import android.app.Activity;
import android.content.Context;
import android.view.Display;

/* compiled from: PG */
/* renamed from: hir */
public enum hir {
    PORTRAIT,
    LANDSCAPE,
    REVERSE_LANDSCAPE,
    REVERSE_PORTRAIT;

    /* renamed from: a */
    public static hir m3181a(int i, boolean z, int i2, int i3) {
        if (i2 < i3 || z) {
            return PORTRAIT;
        }
        if (i == 0 || i == 1) {
            return LANDSCAPE;
        }
        if (i == 2 || i == 3) {
            return REVERSE_LANDSCAPE;
        }
        throw new IllegalStateException("Reverse portrait not supported");
    }

    /* renamed from: a */
    public static hir m3182a(Display display, Context context, int i, int i2) {
        return hir.m3181a(display.getRotation(), ((Activity) context).isInMultiWindowMode(), i, i2);
    }
}
