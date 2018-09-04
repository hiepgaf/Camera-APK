package p000;

import android.util.Range;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bik */
public final class bik implements bij {
    /* renamed from: a */
    private static final Range f10936a = new Range(Integer.valueOf(7), Integer.valueOf(30));

    /* renamed from: a */
    public final kbg mo458a(List list) {
        if (list.contains(f10936a)) {
            return kbg.m4745c(f10936a);
        }
        Object linkedList = new LinkedList();
        for (Range range : list) {
            if (!((Integer) range.getUpper()).equals(range.getLower())) {
                linkedList.add(range);
            }
        }
        if (linkedList.isEmpty()) {
            return kau.f19138a;
        }
        Collections.sort(linkedList, new bil());
        return kbg.m4745c((Range) linkedList.getLast());
    }

    /* renamed from: a */
    public final boolean mo459a(iut iut) {
        return iut == iut.FRONT;
    }
}
