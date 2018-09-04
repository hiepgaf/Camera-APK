package android.support.design.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.support.design.behavior.SwipeDismissBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;
import p000.cw;
import p000.cy;
import p000.da;
import p000.dc;

/* compiled from: PG */
public class BaseTransientBottomBar {

    /* compiled from: PG */
    public class Behavior extends SwipeDismissBehavior {
        /* renamed from: f */
        private final cy f19800f = new cy(this);

        /* renamed from: a */
        public final boolean mo2593a(View view) {
            return view instanceof da;
        }

        /* renamed from: a */
        public final boolean mo119a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    if (coordinatorLayout.m6735a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        synchronized (dc.m1574a().f2983a) {
                        }
                        break;
                    }
                    break;
                case 1:
                case 3:
                    synchronized (dc.m1574a().f2983a) {
                    }
                    break;
            }
            return super.mo119a(coordinatorLayout, view, motionEvent);
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper(), new cw());
    }

    /* renamed from: a */
    public static void m372a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public static void m373b() {
        throw new NoSuchMethodError();
    }
}
