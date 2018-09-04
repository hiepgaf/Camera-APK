package p000;

import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jtr */
final class jtr implements jwc {
    /* renamed from: a */
    private final /* synthetic */ jtq f19046a;

    jtr(jtq jtq) {
        this.f19046a = jtq;
    }

    /* renamed from: a */
    public final void mo2034a(long j) {
        synchronized (this.f19046a.f19043c) {
            TreeSet treeSet = this.f19046a.f19041a;
            Long valueOf = Long.valueOf(j);
            treeSet.remove(valueOf);
            if (this.f19046a.f19042b.size() == 20) {
                treeSet = this.f19046a.f19042b;
                treeSet.remove(treeSet.first());
            }
            this.f19046a.f19042b.add(valueOf);
        }
    }

    /* renamed from: b */
    public final void mo2035b(long j) {
        synchronized (this.f19046a.f19043c) {
            TreeSet treeSet = this.f19046a.f19042b;
            Long valueOf = Long.valueOf(j);
            if (!treeSet.contains(valueOf)) {
                this.f19046a.f19041a.add(valueOf);
            }
        }
    }
}
