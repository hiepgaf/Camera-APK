package p000;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fe */
public final class fe {
    /* renamed from: a */
    public static ex f4493a = new fh((byte) 0);
    /* renamed from: b */
    public static ArrayList f4494b = new ArrayList();
    /* renamed from: c */
    private static ThreadLocal f4495c = new ThreadLocal();

    /* renamed from: a */
    static ih m2266a() {
        ih ihVar;
        WeakReference weakReference = (WeakReference) f4495c.get();
        if (weakReference != null) {
            ihVar = (ih) weakReference.get();
            if (ihVar != null) {
                return ihVar;
            }
        }
        ihVar = new ih();
        f4495c.set(new WeakReference(ihVar));
        return ihVar;
    }

    /* renamed from: a */
    static void m2267a(ViewGroup viewGroup, ex exVar) {
        if (exVar != null && viewGroup != null) {
            Object ffVar = new ff(exVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(ffVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(ffVar);
        }
    }
}
