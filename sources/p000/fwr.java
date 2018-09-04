package p000;

/* renamed from: fwr */
public final /* synthetic */ class fwr implements iqt {
    /* renamed from: a */
    private final iqz f16582a;

    public fwr(iqz iqz) {
        this.f16582a = iqz;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        iqz iqz = this.f16582a;
        String valueOf = String.valueOf((Boolean) obj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
        stringBuilder.append("ImageCaptureCommand Availability = ");
        stringBuilder.append(valueOf);
        iqz.mo514b(stringBuilder.toString());
    }
}
