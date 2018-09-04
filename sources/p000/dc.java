package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: dc */
public final class dc {
    /* renamed from: c */
    private static dc f2982c;
    /* renamed from: a */
    public final Object f2983a = new Object();
    /* renamed from: b */
    public final Handler f2984b = new Handler(Looper.getMainLooper(), new dd(this));

    private dc() {
    }

    /* renamed from: a */
    public static dc m1574a() {
        if (f2982c == null) {
            f2982c = new dc();
        }
        return f2982c;
    }
}
