package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: jkw */
public final class jkw implements jla {
    /* renamed from: a */
    private final jlc f18901a = new jlc();
    /* renamed from: b */
    private final jwa f18902b;
    /* renamed from: c */
    private final jqt f18903c;
    /* renamed from: d */
    private final int f18904d;

    public jkw(jwa jwa, jqt jqt, int i) {
        boolean z;
        jri.m13152b((Object) jwa);
        jri.m13152b((Object) jqt);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Invalid max size.");
        this.f18902b = jwa;
        this.f18903c = jqt;
        this.f18904d = i;
    }

    /* renamed from: a */
    public final void mo2017a() {
        this.f18901a.m12932a(this.f18902b.mo3186a(), new HashSet(this.f18901a.m12935d()), this.f18903c);
        this.f18901a.m12934c();
    }

    /* renamed from: a */
    private final synchronized void m12914a(FrameImage2D frameImage2D) {
        jri.m13152b((Object) frameImage2D);
        long timestamp = frameImage2D.getTimestamp();
        jlc jlc = this.f18901a;
        jlc.m12933b();
        if (jlc.f18921a.indexOfKey(timestamp) >= 0) {
            StringBuilder stringBuilder = new StringBuilder(73);
            stringBuilder.append("Encountered duplicate frame with timestamp, ignoring:");
            stringBuilder.append(timestamp);
            Log.w("BurstAcquisitionBuffer", stringBuilder.toString());
        } else {
            jlc = this.f18901a;
            jlc.m12933b();
            int size = jlc.f18921a.size();
            int i = this.f18904d;
            if (size == i) {
                long d = this.f18902b.mo3189d();
                if (d != timestamp) {
                    this.f18901a.m12929a(d);
                    this.f18902b.mo2034a(d);
                }
            } else if (size > i) {
                throw new IllegalStateException("Store has more frames than inserted!");
            }
            this.f18901a.m12930a(frameImage2D);
            this.f18902b.mo2035b(timestamp);
        }
    }
}
