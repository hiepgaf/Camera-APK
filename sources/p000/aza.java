package p000;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aza */
public final class aza implements ayx {
    /* renamed from: d */
    private static Integer f10555d;
    /* renamed from: a */
    public final View f10556a;
    /* renamed from: b */
    public final List f10557b;
    /* renamed from: c */
    public aqu f10558c;

    public aza(View view) {
        this.f10557b = new ArrayList();
        this.f10556a = view;
    }

    /* renamed from: a */
    public final void m7193a() {
        ViewTreeObserver viewTreeObserver = this.f10556a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f10558c);
        }
        this.f10558c = null;
        this.f10557b.clear();
    }

    /* renamed from: a */
    private final int m7189a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        i4 = i - i3;
        if (i4 > 0) {
            return i4;
        }
        if (this.f10556a.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = this.f10556a.getContext();
        if (f10555d == null) {
            Display defaultDisplay = ((WindowManager) aqe.m585a((WindowManager) context.getSystemService("window"), "Argument must not be null")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f10555d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f10555d.intValue();
    }

    /* renamed from: b */
    public final int m7194b() {
        int i;
        int paddingBottom = this.f10556a.getPaddingBottom() + this.f10556a.getPaddingTop();
        LayoutParams layoutParams = this.f10556a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return m7189a(this.f10556a.getHeight(), i, paddingBottom);
    }

    /* renamed from: c */
    public final int m7195c() {
        int i;
        int paddingRight = this.f10556a.getPaddingRight() + this.f10556a.getPaddingLeft();
        LayoutParams layoutParams = this.f10556a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return m7189a(this.f10556a.getWidth(), i, paddingRight);
    }

    /* renamed from: a */
    private static boolean m7190a(int i) {
        return i > 0 || i == kvl.UNSET_ENUM_VALUE;
    }

    /* renamed from: a */
    public static boolean m7191a(int i, int i2) {
        return aza.m7190a(i) && aza.m7190a(i2);
    }

    /* renamed from: a */
    public final ayv mo403a(axp axp) {
        return new axy();
    }
}
