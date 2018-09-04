package p000;

import android.support.v7.widget.RecyclerView;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: st */
final class st implements Comparator {
    st() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        uu uuVar = (uu) obj;
        uu uuVar2 = (uu) obj2;
        RecyclerView recyclerView = uuVar.f9345d;
        if (recyclerView != null) {
            i = 0;
        } else {
            i = 1;
        }
        if (uuVar2.f9345d != null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (i == i2) {
            boolean z = uuVar.f9342a;
            if (z == uuVar2.f9342a) {
                int i3 = uuVar2.f9343b - uuVar.f9343b;
                if (i3 != 0) {
                    return i3;
                }
                i3 = uuVar.f9344c - uuVar2.f9344c;
                if (i3 == 0) {
                    return 0;
                }
                return i3;
            } else if (z) {
                return -1;
            } else {
                return 1;
            }
        } else if (recyclerView == null) {
            return 1;
        } else {
            return -1;
        }
    }
}
