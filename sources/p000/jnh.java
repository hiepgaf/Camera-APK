package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jnh */
final class jnh implements jnp {
    jnh() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        jtv jtv = (jtv) jms.m4595a(jtv.class, "camera_motion_score");
        jtj a = jti.m13195a(new jtm((FeatureTable) jms.m4595a(FeatureTable.class, "default")));
        a.f7965e = 0.027535f;
        a.f7963c = new float[]{0.047074f, 0.586649f, 0.718397f};
        a.f7964d = new float[]{0.16063f, 0.185991f, 0.138192f};
        a.f7962b = new float[]{-0.006965f, 0.961603f, 0.274355f};
        return a.m4630a(jtv).m4632a(jza.PERCEPTUAL_SHARPNESS).m4632a(jza.MAX_GRID_SHARPNESS).m4628a();
    }
}
