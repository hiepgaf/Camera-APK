package p000;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: eze */
public final class eze implements ezi {
    /* renamed from: a */
    public final String mo1321a() {
        return "crop region";
    }

    /* renamed from: a */
    public final boolean mo1322a(gid gid, gid gid2) {
        Rect rect = gid.f16931i;
        Rect rect2 = gid2.f16931i;
        if (rect == null || rect2 == null || ((float) Math.hypot((double) (rect.width() - rect2.width()), (double) (rect.height() - rect2.height()))) > 1.0E-6f) {
            return true;
        }
        return false;
    }
}
