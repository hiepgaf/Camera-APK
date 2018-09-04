package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ixi */
public final class ixi implements ixm {
    /* renamed from: a */
    public final NavigableMap f18646a;
    /* renamed from: b */
    public final HashSet f18647b = new HashSet();
    /* renamed from: c */
    private final int f18648c = 8;

    public ixi(iqc iqc) {
        this.f18646a = khb.m4868a(ion.m3949a(new TreeMap(), 8, new ixj(this, iqc)), null);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo1953a(long j, Object obj) {
        iqo iqo = (iqo) this.f18646a.put(Long.valueOf(j), (iqo) obj);
        if (iqo != null) {
            iqo.close();
        }
    }

    /* renamed from: a */
    public final int mo1951a() {
        return this.f18648c;
    }

    /* renamed from: a */
    final /* synthetic */ Long m12640a(iqc iqc, Set set) {
        Long l;
        synchronized (this.f18646a) {
            l = (Long) iqc.mo1899a(khb.m4873a(set, this.f18647b));
        }
        return l;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1952a(long j) {
        return (iqo) this.f18646a.get(Long.valueOf(j));
    }

    /* renamed from: b */
    public final List mo1955b() {
        return khb.m4895c(this.f18646a.values());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo1956c() {
        Entry firstEntry = this.f18646a.firstEntry();
        return firstEntry != null ? (iqo) firstEntry.getValue() : null;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo1957d() {
        Entry lastEntry = this.f18646a.lastEntry();
        return lastEntry != null ? (iqo) lastEntry.getValue() : null;
    }

    /* renamed from: e */
    public final /* synthetic */ Collection mo1958e() {
        return m12636h();
    }

    /* renamed from: h */
    private final List m12636h() {
        List arrayList = new ArrayList();
        synchronized (this.f18646a) {
            while (!this.f18646a.isEmpty()) {
                arrayList.add((iqo) this.f18646a.pollFirstEntry().getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo1959f() {
        Entry pollFirstEntry = this.f18646a.pollFirstEntry();
        return pollFirstEntry != null ? (iqo) pollFirstEntry.getValue() : null;
    }

    /* renamed from: i */
    private final Set m12637i() {
        Set a;
        synchronized (this.f18646a) {
            a = khb.m4873a(this.f18646a.navigableKeySet(), this.f18647b);
        }
        return a;
    }

    /* renamed from: a */
    public final iqo m12639a(iqc iqc) {
        synchronized (this.f18646a) {
            Set i = m12637i();
            if (i.isEmpty()) {
                return null;
            }
            long longValue = ((Long) iqc.mo1899a(i)).longValue();
            HashSet hashSet = this.f18647b;
            Long valueOf = Long.valueOf(longValue);
            hashSet.add(valueOf);
            iqo iqo = (iqo) this.f18646a.get(valueOf);
            return iqo;
        }
    }

    /* renamed from: a */
    public final boolean mo1954a(int i) {
        return false;
    }

    /* renamed from: g */
    public final int mo1960g() {
        return this.f18646a.size();
    }
}
