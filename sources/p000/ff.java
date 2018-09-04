package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ff */
final class ff implements OnAttachStateChangeListener, OnPreDrawListener {
    /* renamed from: a */
    public ViewGroup f4521a;
    /* renamed from: b */
    private ex f4522b;

    ff(ex exVar, ViewGroup viewGroup) {
        this.f4522b = exVar;
        this.f4521a = viewGroup;
    }

    public final boolean onPreDraw() {
        m2271a();
        if (!fe.f4494b.remove(this.f4521a)) {
            return true;
        }
        ArrayList arrayList;
        int size;
        ih a = fe.m2266a();
        ArrayList arrayList2 = (ArrayList) a.get(this.f4521a);
        if (arrayList2 == null) {
            arrayList = new ArrayList();
            a.put(this.f4521a, arrayList);
            arrayList2 = arrayList;
            arrayList = null;
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.add(this.f4522b);
        this.f4522b.mo1366a(new fg(this, a));
        this.f4522b.m2156a(this.f4521a, false);
        if (arrayList != null) {
            size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((ex) arrayList.get(i)).mo1380e(this.f4521a);
                i = i2;
            }
        }
        ex exVar = this.f4522b;
        View view = this.f4521a;
        exVar.f4312j = new ArrayList();
        exVar.f4313k = new ArrayList();
        fm fmVar = exVar.f4308f;
        fm fmVar2 = exVar.f4309g;
        ih ihVar = new ih(fmVar.f4617a);
        ih ihVar2 = new ih(fmVar2.f4617a);
        int i3 = 0;
        while (true) {
            int[] iArr = exVar.f4311i;
            int size2;
            fl flVar;
            if (i3 < iArr.length) {
                View view2;
                View view3;
                int size3;
                int i4;
                fl flVar2;
                fl flVar3;
                switch (iArr[i3]) {
                    case 1:
                        for (size2 = ihVar.size() - 1; size2 >= 0; size2--) {
                            view2 = (View) ihVar.m4356b(size2);
                            if (view2 != null && exVar.m2169b(view2)) {
                                flVar = (fl) ihVar2.remove(view2);
                                if (flVar != null) {
                                    view3 = flVar.f4608b;
                                    if (view3 != null && exVar.m2169b(view3)) {
                                        exVar.f4312j.add((fl) ihVar.mo2635c(size2));
                                        exVar.f4313k.add(flVar);
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        ih ihVar3 = fmVar.f4620d;
                        ih ihVar4 = fmVar2.f4620d;
                        size3 = ihVar3.size();
                        for (i4 = 0; i4 < size3; i4++) {
                            view2 = (View) ihVar3.m4358d(i4);
                            if (view2 != null && exVar.m2169b(view2)) {
                                view3 = (View) ihVar4.get(ihVar3.m4356b(i4));
                                if (view3 != null && exVar.m2169b(view3)) {
                                    flVar2 = (fl) ihVar.get(view2);
                                    flVar3 = (fl) ihVar2.get(view3);
                                    if (!(flVar2 == null || flVar3 == null)) {
                                        exVar.f4312j.add(flVar2);
                                        exVar.f4313k.add(flVar3);
                                        ihVar.remove(view2);
                                        ihVar2.remove(view3);
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        SparseArray sparseArray = fmVar.f4618b;
                        SparseArray sparseArray2 = fmVar2.f4618b;
                        size3 = sparseArray.size();
                        for (i4 = 0; i4 < size3; i4++) {
                            view2 = (View) sparseArray.valueAt(i4);
                            if (view2 != null && exVar.m2169b(view2)) {
                                view3 = (View) sparseArray2.get(sparseArray.keyAt(i4));
                                if (view3 != null && exVar.m2169b(view3)) {
                                    flVar2 = (fl) ihVar.get(view2);
                                    flVar3 = (fl) ihVar2.get(view3);
                                    if (!(flVar2 == null || flVar3 == null)) {
                                        exVar.f4312j.add(flVar2);
                                        exVar.f4313k.add(flVar3);
                                        ihVar.remove(view2);
                                        ihVar2.remove(view3);
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        in inVar = fmVar.f4619c;
                        in inVar2 = fmVar2.f4619c;
                        size3 = inVar.m3871c();
                        for (i4 = 0; i4 < size3; i4++) {
                            View view4 = (View) inVar.m3868b(i4);
                            if (view4 != null && exVar.m2169b(view4)) {
                                Object obj;
                                i2 = il.m3810a(inVar2.f7119c, inVar2.f7121e, inVar.m3864a(i4));
                                if (i2 < 0) {
                                    obj = null;
                                } else if (inVar2.f7120d[i2] != in.f7117a) {
                                    obj = inVar2.f7120d[i2];
                                } else {
                                    obj = null;
                                }
                                view2 = (View) obj;
                                if (view2 != null && exVar.m2169b(view2)) {
                                    fl flVar4 = (fl) ihVar.get(view4);
                                    flVar2 = (fl) ihVar2.get(view2);
                                    if (!(flVar4 == null || flVar2 == null)) {
                                        exVar.f4312j.add(flVar4);
                                        exVar.f4313k.add(flVar2);
                                        ihVar.remove(view4);
                                        ihVar2.remove(view2);
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        break;
                }
                i3++;
            } else {
                for (size = 0; size < ihVar.size(); size++) {
                    flVar = (fl) ihVar.m4358d(size);
                    if (exVar.m2169b(flVar.f4608b)) {
                        exVar.f4312j.add(flVar);
                        exVar.f4313k.add(null);
                    }
                }
                for (size = 0; size < ihVar2.size(); size++) {
                    flVar = (fl) ihVar2.m4358d(size);
                    if (exVar.m2169b(flVar.f4608b)) {
                        exVar.f4313k.add(flVar);
                        exVar.f4312j.add(null);
                    }
                }
                ih d = ex.m2147d();
                i2 = d.size();
                ga a2 = fo.m2350a(view);
                for (size2 = i2 - 1; size2 >= 0; size2--) {
                    Animator animator = (Animator) d.m4356b(size2);
                    if (animator != null) {
                        fa faVar = (fa) d.get(animator);
                        if (!(faVar == null || faVar.f4396a == null || !a2.equals(faVar.f4399d))) {
                            Object obj2;
                            fl flVar5 = faVar.f4398c;
                            View view5 = faVar.f4396a;
                            fl b = exVar.m2167b(view5, true);
                            fl a3 = exVar.m2153a(view5, true);
                            if (b == null && a3 == null) {
                                obj2 = null;
                            } else if (faVar.f4400e.mo1425a(flVar5, a3)) {
                                obj2 = 1;
                            } else {
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                if (animator.isRunning() || animator.isStarted()) {
                                    animator.cancel();
                                } else {
                                    d.remove(animator);
                                }
                            }
                        }
                    }
                }
                exVar.mo1368a(view, exVar.f4308f, exVar.f4309g, exVar.f4312j, exVar.f4313k);
                exVar.mo1379e();
                return true;
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        m2271a();
        fe.f4494b.remove(this.f4521a);
        ArrayList arrayList = (ArrayList) fe.m2266a().get(this.f4521a);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((ex) arrayList.get(i)).mo1380e(this.f4521a);
                i = i2;
            }
        }
        this.f4522b.m2161a(true);
    }

    /* renamed from: a */
    private final void m2271a() {
        this.f4521a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f4521a.removeOnAttachStateChangeListener(this);
    }
}
