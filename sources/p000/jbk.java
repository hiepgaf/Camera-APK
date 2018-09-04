package p000;

/* compiled from: PG */
/* renamed from: jbk */
final class jbk implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ izi f7637a;
    /* renamed from: b */
    private final /* synthetic */ jbj f7638b;
    /* renamed from: c */
    private final /* synthetic */ jcc f7639c;
    /* renamed from: d */
    private final /* synthetic */ jbj f7640d;

    jbk(jbj jbj, izi izi, jbj jbj2, jcc jcc) {
        this.f7640d = jbj;
        this.f7637a = izi;
        this.f7638b = jbj2;
        this.f7639c = jcc;
    }

    public final void run() {
        jbj jbj = this.f7640d;
        Object obj = jbj.f18721a;
        if (obj != null) {
            jbj.m12744a(obj, this.f7637a, this.f7638b);
        } else {
            this.f7638b.m12762a(jbj.f18722b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7640d);
        String valueOf2 = String.valueOf(this.f7637a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("then[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
