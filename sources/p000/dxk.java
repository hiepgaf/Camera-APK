package p000;

import android.graphics.Point;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: dxk */
final class dxk implements Comparator {
    dxk() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        abw abw = (abw) obj2;
        Point point = ((abw) obj).f178a;
        int i = point.x;
        Point point2 = abw.f178a;
        if (i != point2.x) {
            return point2.x - point.x;
        }
        return point2.y - point.y;
    }
}
