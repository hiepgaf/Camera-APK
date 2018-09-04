package p000;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jur */
public final class jur extends jul {
    /* renamed from: a */
    private final List f21916a = khb.m4885b();

    /* renamed from: a */
    public final jur m16345a(jul jul) {
        this.f21916a.add(jul);
        return this;
    }

    /* renamed from: a */
    public final Set mo3180a(juh juh) {
        Iterable e = khb.m4903e();
        for (jul a : this.f21916a) {
            e.addAll(a.mo3180a(juh));
        }
        return khb.m4890b(e);
    }

    public final String toString() {
        String a = kaz.m4732a(", ").mo2090a().m4735a(this.f21916a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 34);
        stringBuilder.append("[CompositeSegmentClassifier: { ");
        stringBuilder.append(a);
        stringBuilder.append(" }]");
        return stringBuilder.toString();
    }
}
