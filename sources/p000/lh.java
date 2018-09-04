package p000;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* renamed from: lh */
final class lh extends lr {
    /* renamed from: a */
    public final int f19337a;
    /* renamed from: b */
    public lo f19338b;
    /* renamed from: c */
    public final /* synthetic */ kz f19339c;
    /* renamed from: d */
    private final Runnable f19340d = new li(this);

    lh(kz kzVar, int i) {
        this.f19339c = kzVar;
        this.f19337a = i;
    }

    /* renamed from: a */
    public final int mo429a(View view, int i) {
        if (this.f19339c.m5498a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f19339c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    /* renamed from: b */
    public final int mo432b(View view, int i) {
        return view.getTop();
    }

    /* renamed from: b */
    final void m14039b() {
        int i = 3;
        if (this.f19337a == 3) {
            i = 5;
        }
        View a = this.f19339c.m5493a(i);
        if (a != null) {
            this.f19339c.m5495a(a);
        }
    }

    /* renamed from: a */
    public final int mo428a(View view) {
        return kz.m5488f(view) ? view.getWidth() : 0;
    }

    /* renamed from: a */
    public final void mo2326a(int i, int i2) {
        View a;
        if ((i & 1) == 1) {
            a = this.f19339c.m5493a(3);
        } else {
            a = this.f19339c.m5493a(5);
        }
        if (a != null && this.f19339c.m5499b(a) == 0) {
            this.f19338b.m5529a(a, i2);
        }
    }

    /* renamed from: c */
    public final void mo2327c() {
        this.f19339c.postDelayed(this.f19340d, 160);
    }

    /* renamed from: c */
    public final void mo433c(View view, int i) {
        ((le) view.getLayoutParams()).f8776c = false;
        m14039b();
    }

    /* renamed from: a */
    public final void mo430a(int i) {
        List list;
        kz kzVar = this.f19339c;
        View view = this.f19338b.f8792j;
        int i2 = kzVar.f8753d.f8783a;
        int i3 = kzVar.f8754e.f8783a;
        i3 = i2 != 1 ? i3 != 1 ? i2 != 2 ? i3 != 2 ? 0 : 2 : 2 : 1 : 1;
        if (view != null && i == 0) {
            float f = ((le) view.getLayoutParams()).f8775b;
            le leVar;
            if (f == 0.0f) {
                leVar = (le) view.getLayoutParams();
                if ((leVar.f8777d & 1) == 1) {
                    leVar.f8777d = 0;
                    list = kzVar.f8757h;
                    if (list != null) {
                        for (i2 = list.size() - 1; i2 >= 0; i2--) {
                            ((ld) kzVar.f8757h.get(i2)).onDrawerClosed(view);
                        }
                    }
                    kzVar.m5497a(view, false);
                    if (kzVar.hasWindowFocus()) {
                        View rootView = kzVar.getRootView();
                        if (rootView != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            } else if (f == 1.0f) {
                leVar = (le) view.getLayoutParams();
                if ((leVar.f8777d & 1) == 0) {
                    leVar.f8777d = 1;
                    list = kzVar.f8757h;
                    if (list != null) {
                        for (i2 = list.size() - 1; i2 >= 0; i2--) {
                            ((ld) kzVar.f8757h.get(i2)).onDrawerOpened(view);
                        }
                    }
                    kzVar.m5497a(view, true);
                    if (kzVar.hasWindowFocus()) {
                        kzVar.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i3 != kzVar.f8755f) {
            kzVar.f8755f = i3;
            list = kzVar.f8757h;
            if (list != null) {
                for (i2 = list.size() - 1; i2 >= 0; i2--) {
                    ((ld) kzVar.f8757h.get(i2)).onDrawerStateChanged(i3);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo434d(View view, int i) {
        float f;
        int width = view.getWidth();
        if (this.f19339c.m5498a(view, 3)) {
            f = ((float) (width + i)) / ((float) width);
        } else {
            f = ((float) (this.f19339c.getWidth() - i)) / ((float) width);
        }
        this.f19339c.m5496a(view, f);
        if (f == 0.0f) {
            width = 4;
        } else {
            width = 0;
        }
        view.setVisibility(width);
        this.f19339c.invalidate();
    }

    /* renamed from: a */
    public final void mo431a(View view, float f, float f2) {
        int i = 0;
        float d = kz.m5485d(view);
        int width = view.getWidth();
        if (!this.f19339c.m5498a(view, 3)) {
            i = this.f19339c.getWidth();
            if (f >= 0.0f) {
                if (f == 0.0f) {
                    if (d <= 0.5f) {
                    }
                }
            }
            i -= width;
        } else if (f <= 0.0f) {
            if (f != 0.0f || d <= 0.5f) {
                i = -width;
            }
        }
        this.f19338b.m5534b(i, view.getTop());
        this.f19339c.invalidate();
    }

    /* renamed from: d */
    public final void m14042d() {
        this.f19339c.removeCallbacks(this.f19340d);
    }

    /* renamed from: e */
    public final boolean mo435e(View view, int i) {
        return kz.m5488f(view) && this.f19339c.m5498a(view, this.f19337a) && this.f19339c.m5499b(view) == 0;
    }
}
