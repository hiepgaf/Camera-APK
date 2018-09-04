package p000;

import android.os.Looper;

/* compiled from: PG */
/* renamed from: ike */
final class ike extends ThreadLocal {
    ike() {
    }

    protected final /* synthetic */ Object initialValue() {
        return Boolean.valueOf(Looper.getMainLooper().isCurrentThread());
    }
}
