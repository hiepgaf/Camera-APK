package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbl */
final class jbl implements jau {
    /* renamed from: a */
    private final /* synthetic */ jlf f18725a;
    /* renamed from: b */
    private final /* synthetic */ jbj f18726b;

    jbl(jbj jbj, jlf jlf) {
        this.f18726b = jbj;
        this.f18725a = jlf;
    }

    /* renamed from: a */
    public final jaq mo716a(Object obj, Executor executor) {
        return this.f18725a.m4534a().mo1973a(executor, ion.m3941a(obj));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18726b);
        String valueOf2 = String.valueOf(this.f18725a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("thenAlways[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
