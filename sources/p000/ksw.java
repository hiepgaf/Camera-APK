package p000;

/* compiled from: PG */
/* renamed from: ksw */
final class ksw implements ktd {
    /* renamed from: a */
    private ktd[] f19282a;

    ksw(ktd... ktdArr) {
        this.f19282a = ktdArr;
    }

    /* renamed from: a */
    public final boolean mo2285a(Class cls) {
        for (ktd a : this.f19282a) {
            if (a.mo2285a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ktc mo2286b(Class cls) {
        for (ktd ktd : this.f19282a) {
            if (ktd.mo2285a(cls)) {
                return ktd.mo2286b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        String str = "No factory is available for message type: ";
        throw new UnsupportedOperationException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
