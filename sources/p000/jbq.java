package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbq */
final class jbq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ jau f7653a;
    /* renamed from: b */
    private final /* synthetic */ Executor f7654b;
    /* renamed from: c */
    private final /* synthetic */ jbj f7655c;
    /* renamed from: d */
    private final /* synthetic */ jcc f7656d;
    /* renamed from: e */
    private final /* synthetic */ jau f7657e;
    /* renamed from: f */
    private final /* synthetic */ jbj f7658f;

    jbq(jbj jbj, jau jau, Executor executor, jbj jbj2, jcc jcc, jau jau2) {
        this.f7658f = jbj;
        this.f7653a = jau;
        this.f7654b = executor;
        this.f7655c = jbj2;
        this.f7656d = jcc;
        this.f7657e = jau2;
    }

    public final void run() {
        jbj jbj = this.f7658f;
        Object obj = jbj.f18721a;
        if (obj != null) {
            jbj.m12749b(obj, this.f7653a, this.f7654b, this.f7655c, this.f7656d);
            return;
        }
        jar jar = jbj.f18722b;
        jau jau = this.f7657e;
        Executor executor = this.f7654b;
        jbj jbj2 = this.f7655c;
        try {
            jau.mo716a(jar, executor).mo1974a(kpq.f8410a, new jbx(jbj2), new jbw(jbj2, this.f7656d)).mo1980a(izw.f18704a);
        } catch (jar jar2) {
            jbj2.m12762a(jar2);
        } catch (Throwable th) {
            jbj2.m12762a(jar.m4390a(th));
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7658f);
        String valueOf2 = String.valueOf(this.f7653a);
        String valueOf3 = String.valueOf(this.f7657e);
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
