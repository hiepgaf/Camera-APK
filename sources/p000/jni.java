package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jni */
final class jni implements jnp {
    jni() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        FeatureTable featureTable = (FeatureTable) jms.m4595a(FeatureTable.class, "default");
        return jtw.m13212b().m4642a(featureTable, jza.MOTION_SALIENCY, 0.75f).m4642a(featureTable, jza.FACE_COUNT, 0.05f).m4642a(featureTable, jza.FACE_IS_LEFT_EYE_OPEN_AGGREGATE_SCORE, 0.05f).m4642a(featureTable, jza.FACE_IS_RIGHT_EYE_OPEN_AGGREGATE_SCORE, 0.05f).m4642a(featureTable, jza.FACE_IS_SMILING_AGGREGATE_SCORE, 0.1f).m4643a((jtv) jms.m4595a(jtv.class, "camera_motion_score"), 0.0f).m4641a();
    }
}
