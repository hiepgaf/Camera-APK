package p000;

import java.text.NumberFormat;

/* compiled from: PG */
/* renamed from: hjq */
public final class hjq implements kwk {
    /* renamed from: a */
    public static final hjq f17910a = new hjq();

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        NumberFormat instance = NumberFormat.getInstance();
        instance.setMinimumFractionDigits(1);
        instance.setMaximumFractionDigits(1);
        return (NumberFormat) ktm.m13963a(instance, "Cannot return null from a non-@Nullable @Provides method");
    }
}
