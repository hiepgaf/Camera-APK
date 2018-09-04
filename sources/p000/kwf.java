package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kwf */
public final class kwf implements kwk {
    /* renamed from: a */
    public static final kwk f19322a = kwd.m14019a(Collections.emptySet());
    /* renamed from: b */
    private final List f19323b;
    /* renamed from: c */
    private final List f19324c;

    kwf(List list, List list2) {
        this.f19323b = list;
        this.f19324c = list2;
    }

    /* renamed from: a */
    public static kwg m14021a(int i, int i2) {
        return new kwg(i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        int i;
        int i2 = 0;
        int size = this.f19323b.size();
        List arrayList = new ArrayList(this.f19324c.size());
        int size2 = this.f19324c.size();
        int i3 = size;
        for (i = 0; i < size2; i++) {
            Collection collection = (Collection) ((kwk) this.f19324c.get(i)).mo345a();
            i3 += collection.size();
            arrayList.add(collection);
        }
        size = i3 < 3 ? i3 + 1 : i3 < 1073741824 ? (int) ((((float) i3) / 0.75f) + 1.0f) : LfuScheduler.MAX_PRIORITY;
        Set hashSet = new HashSet(size);
        i3 = this.f19323b.size();
        for (i = 0; i < i3; i++) {
            hashSet.add(ktm.m13962a(((kwk) this.f19323b.get(i)).mo345a()));
        }
        i = arrayList.size();
        while (i2 < i) {
            for (Object a : (Collection) arrayList.get(i2)) {
                hashSet.add(ktm.m13962a(a));
            }
            i2++;
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
