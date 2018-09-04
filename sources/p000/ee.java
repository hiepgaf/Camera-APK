package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: ee */
public final class ee extends ex {
    /* renamed from: p */
    private static final String[] f15044p = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    /* renamed from: q */
    private static final Property f15045q = new eg(PointF.class, "topLeft");
    /* renamed from: r */
    private static final Property f15046r = new eh(PointF.class, "bottomRight");
    /* renamed from: s */
    private static final Property f15047s = new ei(PointF.class, "bottomRight");
    /* renamed from: t */
    private static final Property f15048t = new ej(PointF.class, "topLeft");
    /* renamed from: u */
    private static final Property f15049u = new ek(PointF.class, "position");

    static {
        ef efVar = new ef(PointF.class, "boundsOrigin");
        ev evVar = new ev();
    }

    /* renamed from: a */
    public final void mo1221a(fl flVar) {
        ee.m9679d(flVar);
    }

    /* renamed from: b */
    public final void mo1223b(fl flVar) {
        ee.m9679d(flVar);
    }

    /* renamed from: d */
    private static void m9679d(fl flVar) {
        View view = flVar.f4608b;
        if (jm.m4590x(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            flVar.f4607a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            flVar.f4607a.put("android:changeBounds:parent", flVar.f4608b.getParent());
        }
    }

    /* renamed from: a */
    public final Animator mo1220a(ViewGroup viewGroup, fl flVar, fl flVar2) {
        if (flVar == null || flVar2 == null) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) flVar2.f4607a.get("android:changeBounds:parent");
        if (((ViewGroup) flVar.f4607a.get("android:changeBounds:parent")) == null || viewGroup2 == null) {
            return null;
        }
        int i;
        int i2;
        Object enVar;
        ObjectAnimator a;
        ObjectAnimator a2;
        Animator animatorSet;
        Animator animator;
        ViewGroup viewGroup3;
        Object obj = flVar2.f4608b;
        Rect rect = (Rect) flVar.f4607a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) flVar2.f4607a.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        rect = (Rect) flVar.f4607a.get("android:changeBounds:clip");
        rect2 = (Rect) flVar2.f4607a.get("android:changeBounds:clip");
        if (i11 != 0) {
            if (i12 == 0) {
            }
            i = i3 != i4 ? i5 == i6 ? 1 : 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i++;
            }
            if (rect == null || rect.equals(rect2)) {
                if (rect == null) {
                    i2 = i;
                } else if (rect2 == null) {
                    i2 = i;
                }
                if (i2 > 0) {
                    return null;
                }
                fo.m2354a(obj, i3, i5, i7, i9);
                if (i2 == 2) {
                    if (i11 == i13 || i12 != i14) {
                        enVar = new en(obj);
                        a = df.m1587a(enVar, f15045q, eu.m2116a((float) i3, (float) i5, (float) i4, (float) i6));
                        a2 = df.m1587a(enVar, f15046r, eu.m2116a((float) i7, (float) i9, (float) i8, (float) i10));
                        animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new el());
                        animator = animatorSet;
                    } else {
                        animator = df.m1587a(obj, f15049u, eu.m2116a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                } else if (i3 == i4 || i5 != i6) {
                    animator = df.m1587a(obj, f15048t, eu.m2116a((float) i3, (float) i5, (float) i4, (float) i6));
                } else {
                    animator = df.m1587a(obj, f15047s, eu.m2116a((float) i7, (float) i9, (float) i8, (float) i10));
                }
                if (obj.getParent() instanceof ViewGroup) {
                    return animator;
                }
                viewGroup3 = (ViewGroup) obj.getParent();
                df.m1602a(viewGroup3, true);
                mo1366a(new em(viewGroup3));
                return animator;
            }
            i2 = i + 1;
            if (i2 > 0) {
                return null;
            }
            fo.m2354a(obj, i3, i5, i7, i9);
            if (i2 == 2) {
                if (i3 == i4) {
                }
                animator = df.m1587a(obj, f15048t, eu.m2116a((float) i3, (float) i5, (float) i4, (float) i6));
            } else {
                if (i11 == i13) {
                }
                enVar = new en(obj);
                a = df.m1587a(enVar, f15045q, eu.m2116a((float) i3, (float) i5, (float) i4, (float) i6));
                a2 = df.m1587a(enVar, f15046r, eu.m2116a((float) i7, (float) i9, (float) i8, (float) i10));
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a, a2});
                animatorSet.addListener(new el());
                animator = animatorSet;
            }
            if (obj.getParent() instanceof ViewGroup) {
                return animator;
            }
            viewGroup3 = (ViewGroup) obj.getParent();
            df.m1602a(viewGroup3, true);
            mo1366a(new em(viewGroup3));
            return animator;
        }
        if (i13 != 0) {
            if (i14 == 0) {
                i = 0;
            }
            if (i3 != i4) {
            }
            if (i7 != i8) {
            }
            i++;
        } else {
            i = 0;
        }
        if (rect == null) {
            i2 = i;
        } else {
            if (rect2 == null) {
                i2 = i;
            }
            i2 = i + 1;
        }
        if (i2 > 0) {
            return null;
        }
        fo.m2354a(obj, i3, i5, i7, i9);
        if (i2 == 2) {
            if (i11 == i13) {
            }
            enVar = new en(obj);
            a = df.m1587a(enVar, f15045q, eu.m2116a((float) i3, (float) i5, (float) i4, (float) i6));
            a2 = df.m1587a(enVar, f15046r, eu.m2116a((float) i7, (float) i9, (float) i8, (float) i10));
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{a, a2});
            animatorSet.addListener(new el());
            animator = animatorSet;
        } else {
            if (i3 == i4) {
            }
            animator = df.m1587a(obj, f15048t, eu.m2116a((float) i3, (float) i5, (float) i4, (float) i6));
        }
        if (obj.getParent() instanceof ViewGroup) {
            return animator;
        }
        viewGroup3 = (ViewGroup) obj.getParent();
        df.m1602a(viewGroup3, true);
        mo1366a(new em(viewGroup3));
        return animator;
    }

    /* renamed from: a */
    public final String[] mo1222a() {
        return f15044p;
    }
}
