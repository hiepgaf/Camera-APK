package p000;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: anp */
public final class anp {
    /* renamed from: a */
    private static volatile boolean f794a = true;

    /* renamed from: a */
    public static Drawable m515a(Context context, Context context2, int i, Theme theme) {
        try {
            if (f794a) {
                Context nqVar;
                if (theme != null) {
                    nqVar = new nq(context2, theme);
                } else {
                    nqVar = context2;
                }
                return nj.m5620b(nqVar, i);
            }
        } catch (NoClassDefFoundError e) {
            f794a = false;
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ge.getDrawable(context2, i);
            }
            throw e2;
        } catch (NotFoundException e3) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return context2.getResources().getDrawable(i, theme);
    }
}
