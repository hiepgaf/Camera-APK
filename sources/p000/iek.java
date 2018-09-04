package p000;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: iek */
public final class iek {
    /* renamed from: a */
    public final Set f6976a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static ieg m3711a(Object obj, Looper looper, String str) {
        htl.m3432b(obj, (Object) "Listener must not be null");
        htl.m3432b((Object) looper, (Object) "Looper must not be null");
        htl.m3432b((Object) str, (Object) "Listener type must not be null");
        return new ieg(looper, obj, str);
    }
}
