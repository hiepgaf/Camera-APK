package p000;

/* compiled from: PG */
/* renamed from: jof */
final class jof implements jnp {
    jof() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        jxm jxm = (jxm) jms.m4595a(jxm.class, "default");
        jwq jwq = (jwq) jms.m4595a(jwq.class, "chroma_histogram_frame_distance_metric");
        jtv jtv = (jtv) jms.m4595a(jtv.class, "post_proc_quality_metric");
        return juf.m13235a((juk) jms.m4595a(juk.class, "image_sharpness_filter"), (juk) jms.m4595a(juk.class, "face_quality_filter"), new juu(jxm, jtv, jwq), new jvo(2));
    }
}
