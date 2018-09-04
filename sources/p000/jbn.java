package p000;

/* compiled from: PG */
/* renamed from: jbn */
final class jbn implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ izh f7641a;
    /* renamed from: b */
    private final /* synthetic */ jbj f7642b;

    jbn(jbj jbj, izh izh) {
        this.f7642b = jbj;
        this.f7641a = izh;
    }

    public final void run() {
        jbj jbj = this.f7642b;
        if (jbj.f18721a == null) {
            this.f7641a.mo1972a(jbj.f18722b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7642b);
        String valueOf2 = String.valueOf(this.f7641a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("finallyHandleException[");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
