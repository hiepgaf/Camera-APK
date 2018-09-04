package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jnj */
final class jnj implements jnp {
    jnj() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        jtv jtv = (jtv) jms.m4595a(jtv.class, "combined_eyes");
        jtv jtv2 = (jtv) jms.m4595a(jtv.class, "camera_motion_score");
        jtj a = jti.m13195a(new jtm((FeatureTable) jms.m4595a(FeatureTable.class, "default")));
        a.f7965e = 0.009615f;
        a.f7963c = new float[]{0.183983f, 0.092317f, 0.037357f, 0.171591f, 0.217251f, 0.041185f, 0.663748f, 0.764957f};
        a.f7964d = new float[]{0.445112f, 0.212411f, 0.146466f, 0.441349f, 0.204785f, 0.164381f, 0.164444f, 0.11652f};
        a.f7962b = new float[]{0.042788f, -0.19514f, 0.014271f, 0.06167f, 0.07682f, -0.498248f, 0.459787f, 0.054438f, 0.530616f, 0.029619f, -0.063138f, -0.031777f, -0.035284f, -0.171816f, -0.034343f, 0.410111f};
        return a.m4632a(jza.FACE_COUNT).m4632a(jza.FACE_SHARPNESS_AGGREGATE_SCORE).m4632a(jza.FACE_IS_SMILING_AGGREGATE_SCORE).m4630a(jtv).m4632a(jza.MOTION_SALIENCY).m4630a(jtv2).m4632a(jza.PERCEPTUAL_SHARPNESS).m4632a(jza.MAX_GRID_SHARPNESS).m4629a(jto.m4634a(5)).m4629a(jto.m4636a(4, 6, false)).m4629a(jto.m4634a(4)).m4629a(jto.m4636a(3, 1, true)).m4629a(jto.m4636a(3, 4, true)).m4629a(jto.m4635a(6, 0.965829f, 4.771227f)).m4629a(jto.m4634a(7)).m4629a(jto.m4635a(1, 0.577393f, 1.231493f)).m4628a();
    }
}
