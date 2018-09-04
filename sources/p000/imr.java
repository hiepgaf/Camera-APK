package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imr */
final class imr implements ilp {
    /* renamed from: a */
    public final /* synthetic */ imq f21752a;
    /* renamed from: b */
    private final /* synthetic */ ilp f21753b;

    imr(imq imq, ilp ilp) {
        this.f21752a = imq;
        this.f21753b = ilp;
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        return this.f21753b.mo2859a(new ims(this, iqt), executor);
    }

    /* renamed from: b */
    public final Object mo2860b() {
        imq imq = this.f21752a;
        Object b = this.f21753b.mo2860b();
        if (b == null) {
            String valueOf = String.valueOf(imq.f21750a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
            stringBuilder.append("Input: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" returned a null value");
            throw new NullPointerException(stringBuilder.toString());
        }
        Object b2 = imq.mo3397b(b);
        if (b2 != null) {
            return b2;
        }
        String valueOf2 = String.valueOf(b);
        valueOf = imq.getClass().getName();
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf2).length() + 58) + String.valueOf(valueOf).length());
        stringBuilder2.append("Transforming input value: ");
        stringBuilder2.append(valueOf2);
        stringBuilder2.append(" resulted in a null output for: ");
        stringBuilder2.append(valueOf);
        throw new NullPointerException(stringBuilder2.toString());
    }
}
