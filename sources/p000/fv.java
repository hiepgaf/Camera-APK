package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: fv */
public class fv extends ex {
    /* renamed from: q */
    private static final String[] f16552q = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    /* renamed from: p */
    public int f16553p = 3;

    /* renamed from: a */
    public final void mo1221a(fl flVar) {
        fv.m10793d(flVar);
    }

    /* renamed from: b */
    public void mo1223b(fl flVar) {
        fv.m10793d(flVar);
    }

    /* renamed from: d */
    private static void m10793d(fl flVar) {
        flVar.f4607a.put("android:visibility:visibility", Integer.valueOf(flVar.f4608b.getVisibility()));
        flVar.f4607a.put("android:visibility:parent", flVar.f4608b.getParent());
        Object obj = new int[2];
        flVar.f4608b.getLocationOnScreen(obj);
        flVar.f4607a.put("android:visibility:screenLocation", obj);
    }

    /* renamed from: a */
    public final Animator mo1220a(ViewGroup viewGroup, fl flVar, fl flVar2) {
        fy b = fv.m10792b(flVar, flVar2);
        if (!b.f4811a) {
            return null;
        }
        if (b.f4815e == null && b.f4816f == null) {
            return null;
        }
        View view;
        if (!b.f4812b) {
            int i = b.f4814d;
            if ((this.f16553p & 2) != 2) {
                return null;
            }
            View view2;
            int visibility;
            Animator b2;
            AnimatorListenerAdapter fxVar;
            if (flVar != null) {
                view2 = flVar.f4608b;
            } else {
                view2 = null;
            }
            if (flVar2 != null) {
                view = flVar2.f4608b;
            } else {
                view = null;
            }
            if (view != null && view.getParent() != null) {
                if (i == 4) {
                    view2 = null;
                } else if (view2 != view) {
                    view = fk.m2331a(viewGroup, view2, (View) view2.getParent());
                } else {
                    view2 = null;
                }
                if (view2 == null) {
                }
                if (view != null) {
                    return null;
                }
                visibility = view.getVisibility();
                fo.m2353a(view, 0);
                b2 = mo3021b(view, flVar);
                if (b2 != null) {
                    fo.m2353a(view, visibility);
                    return b2;
                }
                fxVar = new fx(view, i);
                b2.addListener(fxVar);
                df.m1597a(b2, fxVar);
                mo1366a((fc) fxVar);
                return b2;
            } else if (view == null) {
                if (view2 == null) {
                    view = null;
                } else if (view2.getParent() == null) {
                    view = null;
                    if (view2 == null && flVar != null) {
                        int[] iArr = (int[]) flVar.f4607a.get("android:visibility:screenLocation");
                        int i2 = iArr[0];
                        r0 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view2.offsetLeftAndRight((i2 - iArr2[0]) - view2.getLeft());
                        view2.offsetTopAndBottom((r0 - iArr2[1]) - view2.getTop());
                        fn a = df.m1595a(viewGroup);
                        a.f4632a.add(view2);
                        b2 = mo3021b(view2, flVar);
                        if (b2 == null) {
                            a.m2346a(view2);
                            return b2;
                        }
                        b2.addListener(new fw(a, view2));
                        return b2;
                    } else if (view != null) {
                        return null;
                    } else {
                        visibility = view.getVisibility();
                        fo.m2353a(view, 0);
                        b2 = mo3021b(view, flVar);
                        if (b2 != null) {
                            fxVar = new fx(view, i);
                            b2.addListener(fxVar);
                            df.m1597a(b2, fxVar);
                            mo1366a((fc) fxVar);
                            return b2;
                        }
                        fo.m2353a(view, visibility);
                        return b2;
                    }
                } else if (view2.getParent() instanceof View) {
                    view = (View) view2.getParent();
                    if (!fv.m10792b(m2167b(view, true), m2153a(view, true)).f4811a) {
                        view = fk.m2331a(viewGroup, view2, view);
                    } else if (view.getParent() == null) {
                        r0 = view.getId();
                        if (r0 == -1) {
                            view = null;
                        } else if (viewGroup.findViewById(r0) != null) {
                            view = null;
                        } else {
                            view = null;
                        }
                    } else {
                        view = null;
                    }
                } else {
                    view = null;
                }
            }
            view2 = view;
            view = null;
            if (view2 == null) {
            }
            if (view != null) {
                return null;
            }
            visibility = view.getVisibility();
            fo.m2353a(view, 0);
            b2 = mo3021b(view, flVar);
            if (b2 != null) {
                fxVar = new fx(view, i);
                b2.addListener(fxVar);
                df.m1597a(b2, fxVar);
                mo1366a((fc) fxVar);
                return b2;
            }
            fo.m2353a(view, visibility);
            return b2;
        } else if ((this.f16553p & 1) != 1 || flVar2 == null) {
            return null;
        } else {
            if (flVar == null) {
                view = (View) flVar2.f4608b.getParent();
                if (fv.m10792b(m2153a(view, false), m2167b(view, false)).f4811a) {
                    return null;
                }
            }
            return mo3020a(flVar2.f4608b, flVar);
        }
    }

    /* renamed from: a */
    public final String[] mo1222a() {
        return f16552q;
    }

    /* renamed from: b */
    private static fy m10792b(fl flVar, fl flVar2) {
        fy fyVar = new fy();
        fyVar.f4811a = false;
        fyVar.f4812b = false;
        if (flVar == null || !flVar.f4607a.containsKey("android:visibility:visibility")) {
            fyVar.f4813c = -1;
            fyVar.f4815e = null;
        } else {
            fyVar.f4813c = ((Integer) flVar.f4607a.get("android:visibility:visibility")).intValue();
            fyVar.f4815e = (ViewGroup) flVar.f4607a.get("android:visibility:parent");
        }
        if (flVar2 == null || !flVar2.f4607a.containsKey("android:visibility:visibility")) {
            fyVar.f4814d = -1;
            fyVar.f4816f = null;
        } else {
            fyVar.f4814d = ((Integer) flVar2.f4607a.get("android:visibility:visibility")).intValue();
            fyVar.f4816f = (ViewGroup) flVar2.f4607a.get("android:visibility:parent");
        }
        if (flVar != null && flVar2 != null) {
            int i = fyVar.f4813c;
            int i2 = fyVar.f4814d;
            if (i == i2 && fyVar.f4815e == fyVar.f4816f) {
                return fyVar;
            }
            if (i != i2) {
                if (i == 0) {
                    fyVar.f4812b = false;
                    fyVar.f4811a = true;
                } else if (i2 == 0) {
                    fyVar.f4812b = true;
                    fyVar.f4811a = true;
                }
            } else if (fyVar.f4816f == null) {
                fyVar.f4812b = false;
                fyVar.f4811a = true;
            } else if (fyVar.f4815e == null) {
                fyVar.f4812b = true;
                fyVar.f4811a = true;
            }
        } else if (flVar == null && fyVar.f4814d == 0) {
            fyVar.f4812b = true;
            fyVar.f4811a = true;
        } else if (flVar2 == null && fyVar.f4813c == 0) {
            fyVar.f4812b = false;
            fyVar.f4811a = true;
        }
        return fyVar;
    }

    /* renamed from: a */
    public final boolean mo1425a(fl flVar, fl flVar2) {
        if (flVar == null && flVar2 == null) {
            return false;
        }
        if (flVar != null && flVar2 != null && flVar2.f4607a.containsKey("android:visibility:visibility") != flVar.f4607a.containsKey("android:visibility:visibility")) {
            return false;
        }
        fy b = fv.m10792b(flVar, flVar2);
        if (!b.f4811a) {
            return false;
        }
        if (b.f4813c == 0) {
            return true;
        }
        if (b.f4814d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Animator mo3020a(View view, fl flVar) {
        return null;
    }

    /* renamed from: b */
    public Animator mo3021b(View view, fl flVar) {
        return null;
    }
}
