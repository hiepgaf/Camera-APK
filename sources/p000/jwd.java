package p000;

import com.google.android.libraries.smartburst.filterpacks.face.FaceUtils;
import com.google.android.vision.face.Face;
import java.util.List;

/* compiled from: PG */
/* renamed from: jwd */
public final class jwd implements jwb {
    /* renamed from: a */
    private final jxm f19077a;

    public jwd(jxm jxm) {
        aqe.m585a((Object) jxm, "Argument must not be null");
        this.f19077a = jxm;
    }

    /* renamed from: a */
    public final boolean mo2057a(long j) {
        for (Face face : (List) this.f19077a.m4672a(j).m4665a(jxa.f8046c)) {
            if (FaceUtils.hasAllLandmarks(face) && FaceUtils.hasAllProbabilities(face)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "HasValidFaceFrameFilter";
    }
}
