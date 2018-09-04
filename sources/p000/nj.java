package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: nj */
public final class nj {
    static {
        ThreadLocal threadLocal = new ThreadLocal();
        WeakHashMap weakHashMap = new WeakHashMap(0);
        Object obj = new Object();
    }

    /* renamed from: a */
    public static ColorStateList m5619a(Context context, int i) {
        return context.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m5620b(Context context, int i) {
        return qq.m5725a().m5732a(context, i, false);
    }
}
