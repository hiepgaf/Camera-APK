package p000;

/* compiled from: PG */
/* renamed from: jbs */
final class jbs implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Runnable f7663a;
    /* renamed from: b */
    private final /* synthetic */ jbj f7664b;
    /* renamed from: c */
    private final /* synthetic */ jcc f7665c;
    /* renamed from: d */
    private final /* synthetic */ jbj f7666d;

    jbs(jbj jbj, Runnable runnable, jbj jbj2, jcc jcc) {
        this.f7666d = jbj;
        this.f7663a = runnable;
        this.f7664b = jbj2;
        this.f7665c = jcc;
    }

    public final void run() {
        jbj jbj = this.f7666d;
        Object obj = jbj.f18721a;
        if (obj != null) {
            jbj.m12747a(obj, this.f7663a, this.f7664b);
        } else {
            jbj.m12742a(jbj.f18722b, this.f7663a, this.f7664b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7666d);
        String valueOf2 = String.valueOf(this.f7663a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("thenAlways[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
