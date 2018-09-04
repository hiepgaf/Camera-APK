package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: apf */
public final class apf implements Callback {
    /* renamed from: e */
    private static final apg f826e = new apg();
    /* renamed from: a */
    private volatile acm f827a;
    /* renamed from: b */
    private final Map f828b = new HashMap();
    /* renamed from: c */
    private final Map f829c = new HashMap();
    /* renamed from: d */
    private final Handler f830d;

    public apf(apg apg) {
        ih ihVar = new ih();
        ihVar = new ih();
        Bundle bundle = new Bundle();
        this.f830d = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    /* renamed from: a */
    public static void m537a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: a */
    public final acm m539a(Context context) {
        if (this.f827a == null) {
            synchronized (this) {
                if (this.f827a == null) {
                    this.f827a = apg.m542a(acc.m98a(context.getApplicationContext()), new aot(), new aoz(), context.getApplicationContext());
                }
            }
        }
        return this.f827a;
    }

    /* renamed from: a */
    public final apd m540a(FragmentManager fragmentManager, boolean z) {
        apd apd = (apd) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (apd == null) {
            apd = (apd) this.f828b.get(fragmentManager);
            if (apd == null) {
                apd = new apd();
                apd.f823d = null;
                if (z) {
                    apd.f820a.m6883b();
                }
                this.f828b.put(fragmentManager, apd);
                fragmentManager.beginTransaction().add(apd, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f830d.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return apd;
    }

    /* renamed from: a */
    public final apj m541a(android.support.v4.app.FragmentManager fragmentManager, boolean z) {
        apj apj = (apj) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (apj == null) {
            apj = (apj) this.f829c.get(fragmentManager);
            if (apj == null) {
                apj = new apj();
                apj.f19810d = null;
                if (z) {
                    apj.f19807a.m6883b();
                }
                this.f829c.put(fragmentManager, apj);
                fragmentManager.beginTransaction().add((Fragment) apj, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f830d.obtainMessage(2, fragmentManager).sendToTarget();
            }
        }
        return apj;
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        Object obj = null;
        switch (message.what) {
            case 1:
                FragmentManager fragmentManager = (FragmentManager) message.obj;
                obj = this.f828b.remove(fragmentManager);
                FragmentManager fragmentManager2 = fragmentManager;
                z = true;
                break;
            case 2:
                android.support.v4.app.FragmentManager fragmentManager3 = (android.support.v4.app.FragmentManager) message.obj;
                obj = this.f829c.remove(fragmentManager3);
                android.support.v4.app.FragmentManager fragmentManager4 = fragmentManager3;
                z = true;
                break;
            default:
                z = false;
                Object obj2 = null;
                break;
        }
        if (z && r2 == null && Log.isLoggable("RMRetriever", 5)) {
            String valueOf = String.valueOf(obj2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
            stringBuilder.append("Failed to remove expected request manager fragment, manager: ");
            stringBuilder.append(valueOf);
            Log.w("RMRetriever", stringBuilder.toString());
        }
        return z;
    }

    /* renamed from: b */
    static boolean m538b(Activity activity) {
        return activity.isFinishing() ^ 1;
    }
}
