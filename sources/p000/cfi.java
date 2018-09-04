package p000;

/* compiled from: PG */
/* renamed from: cfi */
final class cfi implements gqd {
    /* renamed from: a */
    private final fbn f11816a;
    /* renamed from: b */
    private final ird f11817b;

    cfi(fbn fbn, ird ird) {
        this.f11816a = fbn;
        this.f11817b = ird;
    }

    public final void run() {
        this.f11817b.mo1903a("#cacheDeviceInfo");
        for (iur b : this.f11816a.mo1347b()) {
            this.f11816a.m10176b(b).mo1935q();
        }
        this.f11817b.mo1904b();
    }
}
