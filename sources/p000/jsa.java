package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionStatistics;
import java.util.List;

/* compiled from: PG */
/* renamed from: jsa */
public final class jsa implements jry {
    /* renamed from: a */
    private final FeatureTable f18994a;
    /* renamed from: b */
    private final jrg f18995b;
    /* renamed from: c */
    private final Object f18996c = new Object();
    /* renamed from: d */
    private boolean f18997d;
    /* renamed from: e */
    private boolean f18998e;

    public jsa(FeatureTable featureTable, jrg jrg) {
        jri.m13152b((Object) featureTable);
        jri.m13152b((Object) jrg);
        this.f18994a = featureTable;
        this.f18995b = jrg;
        this.f18997d = false;
    }

    /* renamed from: a */
    public final jxa mo2043a(long j, Bitmap bitmap) {
        jxa a;
        jri.m13152b((Object) bitmap);
        jkz rowIterator = this.f18994a.getRowIterator(this.f18994a.getEarliestTimestamp());
        float f = 0.0f;
        while (rowIterator.m4528a()) {
            jky jky = (jky) rowIterator.next();
            float value = jky.m4525a(jza.MOTION_SALIENCY).getValue();
            if (jky.m4527b() > j) {
                break;
            }
            f += value;
        }
        jkz rowIterator2 = this.f18994a.getRowIterator(Math.max(this.f18994a.getEarliestTimestamp(), -1000000000 + j));
        float f2 = 0.0f;
        while (rowIterator2.m4528a()) {
            jky = (jky) rowIterator2.next();
            if (jky.m4527b() > 1000000000 + j) {
                break;
            }
            f2 = jky.m4525a(jza.MOTION_SALIENCY).getValue() + f2;
        }
        float f3 = f2 / 60.000004f;
        synchronized (this.f18996c) {
            if (!this.f18997d) {
                boolean z;
                List d = this.f18995b.m13134d();
                MotionStatistics cumulativeMotionStatistics = MotionStatistics.getCumulativeMotionStatistics(this.f18994a, ((Long) d.get(0)).longValue(), ((Long) d.get(d.size() - 1)).longValue(), 0.1f, 0.15f, 0.15f);
                if (cumulativeMotionStatistics.isMovementTooLarge()) {
                    z = true;
                } else if (cumulativeMotionStatistics.hasTooManyInvalidFrames()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f18998e = z;
                this.f18997d = true;
            }
            a = new jxa().m4666a(jxa.f8060q, Float.valueOf(f)).m4666a(jxa.f8061r, Float.valueOf(f3)).m4666a(jxa.f8062s, Boolean.valueOf(this.f18998e));
        }
        return a;
    }

    public final String toString() {
        return "MotionMetadataExtractor";
    }
}
