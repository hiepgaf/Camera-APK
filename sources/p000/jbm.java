package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbm */
final class jbm implements jau {
    /* renamed from: a */
    private final /* synthetic */ jlf f18727a;
    /* renamed from: b */
    private final /* synthetic */ jbj f18728b;

    jbm(jbj jbj, jlf jlf) {
        this.f18728b = jbj;
        this.f18727a = jlf;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo716a(Object obj, Executor executor) {
        Throwable th = (jar) obj;
        return this.f18727a.m4534a().mo1974a(executor, ion.m3959b(th), ion.m3942a(th));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18728b);
        String valueOf2 = String.valueOf(this.f18727a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("thenAlways[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
