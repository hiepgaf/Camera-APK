package p000;

/* compiled from: PG */
/* renamed from: jbo */
final class jbo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ izi f7643a;
    /* renamed from: b */
    private final /* synthetic */ jbj f7644b;
    /* renamed from: c */
    private final /* synthetic */ jcc f7645c;
    /* renamed from: d */
    private final /* synthetic */ izi f7646d;
    /* renamed from: e */
    private final /* synthetic */ jbj f7647e;

    jbo(jbj jbj, izi izi, jbj jbj2, jcc jcc, izi izi2) {
        this.f7647e = jbj;
        this.f7643a = izi;
        this.f7644b = jbj2;
        this.f7645c = jcc;
        this.f7646d = izi2;
    }

    public final void run() {
        jbj jbj = this.f7647e;
        Object obj = jbj.f18721a;
        if (obj != null) {
            jbj.m12744a(obj, this.f7643a, this.f7644b);
        } else {
            jbj.m12739a(jbj.f18722b, this.f7646d, this.f7644b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7647e);
        String valueOf2 = String.valueOf(this.f7643a);
        String valueOf3 = String.valueOf(this.f7646d);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 8) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("then[");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
