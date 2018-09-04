package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jtn */
public abstract class jtn implements jtv {
    /* renamed from: a */
    public final FeatureTable f19040a;

    public jtn(FeatureTable featureTable) {
        this.f19040a = featureTable;
    }

    /* renamed from: a */
    public abstract jzf mo3178a(long j, jky jky);

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        return mo3178a(j, this.f19040a.getRowForTimestamp(j));
    }

    /* renamed from: b */
    public final void mo2051b(long j) {
    }

    /* renamed from: c */
    public final void mo2052c(long j) {
    }

    /* renamed from: a */
    public final void mo2050a() {
    }

    public String toString() {
        return "FeatureTableFrameScorer";
    }
}
