package p000;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: icf */
public final class icf implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    /* renamed from: a */
    public static final icf f6930a = new icf();
    /* renamed from: b */
    public final AtomicBoolean f6931b = new AtomicBoolean();
    /* renamed from: c */
    public final AtomicBoolean f6932c = new AtomicBoolean();
    /* renamed from: d */
    public final ArrayList f6933d = new ArrayList();
    /* renamed from: e */
    public boolean f6934e = false;

    private icf() {
    }

    /* renamed from: a */
    private final void m3668a(boolean z) {
        synchronized (f6930a) {
            Iterator it = this.f6933d.iterator();
            while (it.hasNext()) {
                icg icg = (icg) it.next();
                icg.f6935a.f6953h.sendMessage(icg.f6935a.f6953h.obtainMessage(1, Boolean.valueOf(z)));
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f6931b.compareAndSet(true, false);
        this.f6932c.set(true);
        if (compareAndSet) {
            m3668a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f6931b.compareAndSet(true, false);
        this.f6932c.set(true);
        if (compareAndSet) {
            m3668a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f6931b.compareAndSet(false, true)) {
            this.f6932c.set(true);
            m3668a(true);
        }
    }
}
