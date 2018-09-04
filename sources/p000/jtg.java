package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;

/* compiled from: PG */
/* renamed from: jtg */
public final class jtg extends jtn {
    /* renamed from: b */
    private final float f21907b = 0.2f;

    public jtg(FeatureTable featureTable) {
        super(featureTable);
    }

    /* renamed from: a */
    public final jzf mo3178a(long j, jky jky) {
        float f;
        float[] values = jky.m4525a(jza.CAMERA_MOTION).getValues();
        if (values.length == 2) {
            float f2 = values[0];
            f = values[1];
            f = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
        } else {
            f = 1.0f;
        }
        if (f >= this.f21907b) {
            f = 1.0f;
        }
        return new jzc(f);
    }

    public final String toString() {
        float f = this.f21907b;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("CameraMotionScorer[threshold=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
