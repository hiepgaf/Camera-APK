package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: ayf */
final class ayf implements kaw {
    ayf() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        Iterable iterable = (List) obj;
        if (iterable == null || iterable.size() == 0) {
            return Integer.valueOf(0);
        }
        return Integer.valueOf(Math.max(((Integer) kgc.f19196a.mo2160b(iterable)).intValue(), 0));
    }
}
