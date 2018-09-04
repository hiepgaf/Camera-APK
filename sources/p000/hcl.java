package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: hcl */
public final class hcl {
    /* renamed from: a */
    public final Object f5977a = new Object();
    /* renamed from: b */
    public final SimpleOnGestureListener f5978b;
    /* renamed from: c */
    public final long f5979c;
    /* renamed from: d */
    public final Handler f5980d;
    /* renamed from: e */
    public final boolean f5981e;
    /* renamed from: f */
    public MotionEvent f5982f = null;
    /* renamed from: g */
    public final Runnable f5983g = new hcm(this);

    public hcl(SimpleOnGestureListener simpleOnGestureListener) {
        this.f5978b = simpleOnGestureListener;
        this.f5979c = 350;
        this.f5980d = new Handler(Looper.getMainLooper());
        this.f5981e = true;
    }
}
