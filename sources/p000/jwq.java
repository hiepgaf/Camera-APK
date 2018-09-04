package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jwq */
public class jwq {
    /* renamed from: a */
    private final jwp f8040a;
    /* renamed from: b */
    private final FeatureTable f8041b;

    public jwq(jwp jwp, FeatureTable featureTable) {
        this.f8040a = jwp;
        this.f8041b = featureTable;
    }

    /* renamed from: a */
    public final float m4658a(long j, long j2) {
        return this.f8040a.mo2059a(this.f8041b.getRowForTimestamp(j), this.f8041b.getRowForTimestamp(j2));
    }
}
