package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jsm */
final class jsm implements jzt {
    /* renamed from: a */
    private final /* synthetic */ jsl f19014a;

    jsm(jsl jsl) {
        this.f19014a = jsl;
    }

    /* renamed from: a */
    public final void mo2045a(Exception exception) {
        Log.d("FeatureExtractionPipeline", "onError");
        this.f19014a.m13179a();
        this.f19014a.f19011b.m12762a(jar.m4390a(exception));
    }

    /* renamed from: a */
    public final void mo2044a() {
        Log.d("FeatureExtractionPipeline", "Started");
    }

    /* renamed from: b */
    public final void mo2046b() {
        Log.d("FeatureExtractionPipeline", "onStopped");
        this.f19014a.m13179a();
        jsl jsl = this.f19014a;
        jsl.f19011b.m12763a(jsl.f19010a);
    }
}
