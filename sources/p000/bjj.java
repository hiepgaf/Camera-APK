package p000;

/* compiled from: PG */
/* renamed from: bjj */
public final class bjj implements bji {
    /* renamed from: a */
    private static final String f10957a = bli.m862a("CdrMediaRecPauseRsm");
    /* renamed from: b */
    private final biw f10958b;

    public bjj(biw biw) {
        this.f10958b = biw;
    }

    /* renamed from: a */
    public final void mo504a() {
        try {
            this.f10958b.mo468g();
        } catch (ipu e) {
            String str = f10957a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
            stringBuilder.append("Failed when calling MediaRecorder#pause: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public final void mo505b() {
        try {
            this.f10958b.mo469h();
        } catch (ipu e) {
            String str = f10957a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
            stringBuilder.append("Failed when calling MediaRecorder#resume: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
        }
    }
}
