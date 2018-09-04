package p000;

/* renamed from: ims */
final /* synthetic */ class ims implements iqt {
    /* renamed from: a */
    private final imr f18370a;
    /* renamed from: b */
    private final iqt f18371b;

    ims(imr imr, iqt iqt) {
        this.f18370a = imr;
        this.f18371b = iqt;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        imr imr = this.f18370a;
        iqt iqt = this.f18371b;
        imq imq = imr.f21752a;
        if (obj == null) {
            String valueOf = String.valueOf(imq.f21750a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
            stringBuilder.append("Input: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" returned a null value");
            throw new NullPointerException(stringBuilder.toString());
        }
        Object b = imq.mo3397b(obj);
        if (b == null) {
            String valueOf2 = String.valueOf(obj);
            valueOf = imq.getClass().getName();
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf2).length() + 58) + String.valueOf(valueOf).length());
            stringBuilder2.append("Transforming input value: ");
            stringBuilder2.append(valueOf2);
            stringBuilder2.append(" resulted in a null output for: ");
            stringBuilder2.append(valueOf);
            throw new NullPointerException(stringBuilder2.toString());
        }
        iqt.mo348a(b);
    }
}
