package p000;

/* compiled from: PG */
/* renamed from: ksu */
final class ksu implements kts {
    /* renamed from: b */
    private static final ktd f19280b = new ksv();
    /* renamed from: a */
    private final ktd f19281a;

    public ksu() {
        this(new ksw(krx.f19277a, ksu.m13894a()));
    }

    private ksu(ktd ktd) {
        this.f19281a = (ktd) ksd.m5133a((Object) ktd, "messageInfoFactory");
    }

    /* renamed from: a */
    public final ktr mo2292a(Class cls) {
        ktt.m5241a(cls);
        ktc b = this.f19281a.mo2286b(cls);
        if (b.mo2304c()) {
            if (kry.class.isAssignableFrom(cls)) {
                return kti.m13952a(ktt.f8547c, krq.f8449a, b.mo2302a());
            }
            return kti.m13952a(ktt.f8545a, krq.m5112a(), b.mo2302a());
        } else if (kry.class.isAssignableFrom(cls)) {
            if (ksu.m13895a(b)) {
                return kth.m13918a(b, ktl.f8541b, ksq.f8535b, ktt.f8547c, krq.f8449a, ktb.f8539b);
            }
            return kth.m13918a(b, ktl.f8541b, ksq.f8535b, ktt.f8547c, null, ktb.f8539b);
        } else if (ksu.m13895a(b)) {
            return kth.m13918a(b, ktl.f8540a, ksq.f8534a, ktt.f8545a, krq.m5112a(), ktb.f8538a);
        } else {
            return kth.m13918a(b, ktl.f8540a, ksq.f8534a, ktt.f8546b, null, ktb.f8538a);
        }
    }

    /* renamed from: a */
    private static ktd m13894a() {
        try {
            return (ktd) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return f19280b;
        }
    }

    /* renamed from: a */
    private static boolean m13895a(ktc ktc) {
        return ktc.mo2303b() == go.cb;
    }
}
