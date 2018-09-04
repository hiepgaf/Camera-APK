package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jwi */
public final class jwi implements jwa {
    /* renamed from: a */
    private final Set f21991a = new HashSet();
    /* renamed from: b */
    private final jtv f21992b;

    public jwi(jtv jtv) {
        this.f21992b = jtv;
    }

    /* renamed from: e */
    private final synchronized HashSet m16415e() {
        return new HashSet(this.f21991a);
    }

    /* renamed from: a */
    public final /* synthetic */ Set mo3186a() {
        return m16415e();
    }

    /* renamed from: a */
    public final synchronized void mo2034a(long j) {
        this.f21991a.remove(Long.valueOf(j));
        this.f21992b.mo2051b(j);
    }

    /* renamed from: b */
    public final synchronized void mo2035b(long j) {
        this.f21991a.add(Long.valueOf(j));
        this.f21992b.mo2052c(j);
    }

    /* renamed from: b */
    public final synchronized kbg mo3187b() {
        return kau.f19138a;
    }

    /* renamed from: c */
    public final synchronized void mo3188c() {
        this.f21991a.clear();
        this.f21992b.mo2050a();
    }

    /* renamed from: d */
    public final synchronized long mo3189d() {
        long j;
        if (this.f21991a.isEmpty()) {
            throw new IllegalStateException("Summary is empty!");
        }
        float f = Float.MAX_VALUE;
        j = -1;
        for (Long longValue : this.f21991a) {
            long longValue2 = longValue.longValue();
            float a = this.f21992b.mo2049a(longValue2).mo2076a();
            if (a >= f) {
                longValue2 = j;
            }
            if (a >= f) {
                a = f;
            }
            j = longValue2;
            f = a;
        }
        return j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21992b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("ScoredFrameDropper[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
