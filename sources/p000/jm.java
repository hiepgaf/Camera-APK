package p000;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: jm */
public final class jm {
    /* renamed from: a */
    private static WeakHashMap f7919a = null;
    /* renamed from: b */
    private static Field f7920b;
    /* renamed from: c */
    private static boolean f7921c = false;

    static {
        AtomicInteger atomicInteger = new AtomicInteger(1);
    }

    /* renamed from: a */
    public static kd m4547a(View view) {
        if (f7919a == null) {
            f7919a = new WeakHashMap();
        }
        kd kdVar = (kd) f7919a.get(view);
        if (kdVar != null) {
            return kdVar;
        }
        kdVar = new kd(view);
        f7919a.put(view, kdVar);
        return kdVar;
    }

    /* renamed from: a */
    public static kj m4548a(View view, kj kjVar) {
        Object obj = (WindowInsets) kj.m4974a(kjVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(obj);
        if (dispatchApplyWindowInsets != obj) {
            obj = new WindowInsets(dispatchApplyWindowInsets);
        }
        return kj.m4975a(obj);
    }

    /* renamed from: a */
    public static boolean m4562a() {
        return false;
    }

    /* renamed from: b */
    public static boolean m4566b() {
        return false;
    }

    /* renamed from: b */
    public static ColorStateList m4563b(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: c */
    public static Mode m4567c(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: d */
    public static Rect m4569d(View view) {
        return view.getClipBounds();
    }

    /* renamed from: e */
    public static Display m4571e(View view) {
        return view.getDisplay();
    }

    /* renamed from: f */
    public static float m4572f(View view) {
        return view.getElevation();
    }

    /* renamed from: g */
    public static boolean m4573g(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: h */
    public static int m4574h(View view) {
        return view.getImportantForAccessibility();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: i */
    public static int m4575i(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: j */
    public static int m4576j(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: k */
    public static int m4577k(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: l */
    public static int m4578l(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: m */
    public static int m4579m(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: n */
    public static int m4580n(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: o */
    public static ViewParent m4581o(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: p */
    public static String m4582p(View view) {
        return view.getTransitionName();
    }

    /* renamed from: q */
    public static int m4583q(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: r */
    public static float m4584r(View view) {
        return view.getZ();
    }

    /* renamed from: s */
    public static boolean m4585s(View view) {
        if (f7921c) {
            return false;
        }
        if (f7920b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7920b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                f7921c = true;
                return false;
            }
        }
        try {
            if (f7920b.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            f7921c = true;
            return false;
        }
    }

    /* renamed from: t */
    public static boolean m4586t(View view) {
        return view.hasOnClickListeners();
    }

    /* renamed from: u */
    public static boolean m4587u(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: v */
    public static boolean m4588v(View view) {
        return view.hasTransientState();
    }

    /* renamed from: w */
    public static boolean m4589w(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: x */
    public static boolean m4590x(View view) {
        return view.isLaidOut();
    }

    /* renamed from: y */
    public static boolean m4591y(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: z */
    public static boolean m4592z(View view) {
        return view.isPaddingRelative();
    }

    /* renamed from: a */
    public static void m4550a(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: b */
    public static void m4565b(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: b */
    public static kj m4564b(View view, kj kjVar) {
        Object obj = (WindowInsets) kj.m4974a(kjVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(obj);
        if (onApplyWindowInsets != obj) {
            obj = new WindowInsets(onApplyWindowInsets);
        }
        return kj.m4975a(obj);
    }

    /* renamed from: A */
    public static void m4542A(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: a */
    public static void m4556a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m4557a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: B */
    public static void m4543B(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: a */
    public static void m4559a(View view, jd jdVar) {
        AccessibilityDelegate accessibilityDelegate;
        if (jdVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = jdVar.f7717b;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: a */
    public static void m4555a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public static void m4552a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: a */
    public static void m4553a(View view, Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: a */
    public static void m4554a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* renamed from: a */
    public static void m4549a(View view, float f) {
        view.setElevation(f);
    }

    @Deprecated
    /* renamed from: C */
    public static void m4544C(View view) {
        view.setFitsSystemWindows(true);
    }

    /* renamed from: a */
    public static void m4561a(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* renamed from: c */
    public static void m4568c(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: D */
    public static void m4545D(View view) {
        view.setImportantForAutofill(8);
    }

    /* renamed from: a */
    public static void m4560a(View view, jk jkVar) {
        if (jkVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new jn(jkVar));
        }
    }

    /* renamed from: a */
    public static void m4551a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: d */
    public static void m4570d(View view, int i) {
        view.setScrollIndicators(i, 3);
    }

    /* renamed from: a */
    public static void m4558a(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: E */
    public static void m4546E(View view) {
        view.stopNestedScroll();
    }
}
