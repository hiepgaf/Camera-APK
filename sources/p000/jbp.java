package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbp */
final class jbp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jau f7648a;
    /* renamed from: b */
    private final /* synthetic */ Executor f7649b;
    /* renamed from: c */
    private final /* synthetic */ jbj f7650c;
    /* renamed from: d */
    private final /* synthetic */ jcc f7651d;
    /* renamed from: e */
    private final /* synthetic */ jbj f7652e;

    jbp(jbj jbj, jau jau, Executor executor, jbj jbj2, jcc jcc) {
        this.f7652e = jbj;
        this.f7648a = jau;
        this.f7649b = executor;
        this.f7650c = jbj2;
        this.f7651d = jcc;
    }

    public final void run() {
        jbj jbj = this.f7652e;
        Object obj = jbj.f18721a;
        if (obj != null) {
            jbj.m12749b(obj, this.f7648a, this.f7649b, this.f7650c, this.f7651d);
        } else {
            this.f7650c.m12762a(jbj.f18722b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7652e);
        String valueOf2 = String.valueOf(this.f7648a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("then[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
