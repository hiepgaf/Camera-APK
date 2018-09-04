package p000;

/* compiled from: PG */
/* renamed from: koy */
final class koy extends knt implements Runnable {
    /* renamed from: e */
    private kpk f23609e;

    koy(kpk kpk) {
        this.f23609e = kpk;
    }

    /* renamed from: a */
    protected final void mo3613a() {
        this.f23609e = null;
    }

    /* renamed from: b */
    protected final String mo3614b() {
        kpk kpk = this.f23609e;
        if (kpk == null) {
            return null;
        }
        String valueOf = String.valueOf(kpk);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
        stringBuilder.append("delegate=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void run() {
        kpk kpk = this.f23609e;
        if (kpk != null) {
            mo3616b(kpk);
        }
    }
}
