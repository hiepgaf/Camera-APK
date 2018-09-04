package p000;

/* compiled from: PG */
/* renamed from: jbr */
final class jbr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jbj f7659a;
    /* renamed from: b */
    private final /* synthetic */ izi f7660b;
    /* renamed from: c */
    private final /* synthetic */ jcc f7661c;
    /* renamed from: d */
    private final /* synthetic */ jbj f7662d;

    jbr(jbj jbj, jbj jbj2, izi izi, jcc jcc) {
        this.f7662d = jbj;
        this.f7659a = jbj2;
        this.f7660b = izi;
        this.f7661c = jcc;
    }

    public final void run() {
        jbj jbj = this.f7662d;
        Object obj = jbj.f18721a;
        if (obj != null) {
            this.f7659a.m12763a(obj);
        } else {
            jbj.m12739a(jbj.f18722b, this.f7660b, this.f7659a);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7662d);
        String valueOf2 = String.valueOf(this.f7660b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("thenCatch[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
