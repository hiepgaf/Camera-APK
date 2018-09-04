package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jpo */
final class jpo implements jnp {
    jpo() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        FeatureTable featureTable = (FeatureTable) jms.m4595a(FeatureTable.class, "default");
        jve jve = new jve(featureTable);
        jwq jwq = (jwq) jms.m4595a(jwq.class, "chroma_histogram_frame_distance_metric");
        jva jva = new jva(jwq, new jvr(0.2f, 0.4f));
        jva jva2 = new jva(jwq, new jvr(0.7f, 1.0f));
        jva jva3 = new jva(new jwq(new jww(jza.TIMESTAMP, new jwk()), featureTable), new jvr(200.0f, 2000.0f));
        r0 = new jum[2];
        r0[0] = new jvc(jve, jva, jva3);
        r0[1] = jva2;
        return new jvi(new jvj(jus.m16346a(r0)));
    }
}
