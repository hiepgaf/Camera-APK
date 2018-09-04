package p000;

import android.support.design.behavior.SwipeDismissBehavior;
import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* renamed from: bg */
public final class bg extends lr {
    /* renamed from: a */
    private int f10767a;
    /* renamed from: b */
    private int f10768b = -1;
    /* renamed from: c */
    private final /* synthetic */ SwipeDismissBehavior f10769c;

    public bg(SwipeDismissBehavior swipeDismissBehavior) {
        this.f10769c = swipeDismissBehavior;
    }

    /* renamed from: a */
    public final int mo429a(View view, int i) {
        int i2;
        int width;
        if (jm.m4576j(view) != 1) {
            Object obj = null;
        } else {
            i2 = 1;
        }
        int i3 = this.f10769c.f9905b;
        if (i3 == 0) {
            if (obj != null) {
                width = this.f10767a - view.getWidth();
                i2 = this.f10767a;
            } else {
                width = this.f10767a;
                i2 = view.getWidth() + width;
            }
        } else if (i3 != 1) {
            width = this.f10767a - view.getWidth();
            i2 = this.f10767a + view.getWidth();
        } else if (obj != null) {
            width = this.f10767a;
            i2 = view.getWidth() + width;
        } else {
            width = this.f10767a - view.getWidth();
            i2 = this.f10767a;
        }
        return Math.min(Math.max(width, i), i2);
    }

    /* renamed from: b */
    public final int mo432b(View view, int i) {
        return view.getTop();
    }

    /* renamed from: a */
    public final int mo428a(View view) {
        return view.getWidth();
    }

    /* renamed from: c */
    public final void mo433c(View view, int i) {
        this.f10768b = i;
        this.f10767a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: a */
    public final void mo430a(int i) {
    }

    /* renamed from: d */
    public final void mo434d(View view, int i) {
        float width = ((float) this.f10767a) + (((float) view.getWidth()) * this.f10769c.f9907d);
        float width2 = ((float) this.f10767a) + (((float) view.getWidth()) * this.f10769c.f9908e);
        float f = (float) i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.m6676a(1.0f - ((f - width) / (width2 - width))));
        }
    }

    /* renamed from: a */
    public final void mo431a(View view, float f, float f2) {
        int j;
        boolean z;
        int i;
        boolean z2 = false;
        this.f10768b = -1;
        int width = view.getWidth();
        int i2;
        if (f != 0.0f) {
            j = jm.m4576j(view);
            i2 = this.f10769c.f9905b;
            if (i2 == 2) {
                z = true;
            } else if (i2 == 0) {
                if (j != 1) {
                    if (f > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (f < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i2 != 1) {
                z = false;
            } else if (j != 1) {
                if (f < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (f > 0.0f) {
                z = true;
            } else {
                z = false;
            }
        } else {
            j = view.getLeft();
            i2 = this.f10767a;
            if (Math.abs(j - i2) >= Math.round(((float) view.getWidth()) * this.f10769c.f9906c)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            int left = view.getLeft();
            j = this.f10767a;
            if (left < j) {
                left = j - width;
            } else {
                left = j + width;
            }
            i = left;
            z2 = true;
        } else {
            i = this.f10767a;
        }
        if (this.f10769c.f9904a.m5534b(i, view.getTop())) {
            jm.m4556a(view, new bi(this.f10769c, view, z2));
        } else if (!z2) {
        }
    }

    /* renamed from: e */
    public final boolean mo435e(View view, int i) {
        return this.f10768b == -1 && this.f10769c.mo2593a(view);
    }
}
