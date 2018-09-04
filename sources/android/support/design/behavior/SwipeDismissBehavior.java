package android.support.design.behavior;

import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p000.bg;
import p000.dj;
import p000.lo;
import p000.lr;

/* compiled from: PG */
public class SwipeDismissBehavior extends dj {
    /* renamed from: a */
    public lo f9904a;
    /* renamed from: b */
    public int f9905b = 2;
    /* renamed from: c */
    public float f9906c = 0.5f;
    /* renamed from: d */
    public float f9907d = 0.0f;
    /* renamed from: e */
    public float f9908e = 0.5f;
    /* renamed from: f */
    private boolean f9909f;
    /* renamed from: g */
    private final lr f9910g = new bg(this);

    /* renamed from: a */
    public boolean mo2593a(View view) {
        return true;
    }

    /* renamed from: a */
    public static float m6676a(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    /* renamed from: a */
    public boolean mo119a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f9909f;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f9909f = coordinatorLayout.m6735a(view, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.f9909f;
                break;
            case 1:
            case 3:
                this.f9909f = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (this.f9904a == null) {
            this.f9904a = lo.m5519b((ViewGroup) coordinatorLayout, this.f9910g);
        }
        return this.f9904a.m5535b(motionEvent);
    }

    /* renamed from: b */
    public final boolean mo120b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        lo loVar = this.f9904a;
        if (loVar == null) {
            return false;
        }
        loVar.m5528a(motionEvent);
        return true;
    }
}
