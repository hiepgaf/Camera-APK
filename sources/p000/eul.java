package p000;

import android.media.MediaCodec.BufferInfo;
import android.util.Pair;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: eul */
public final class eul implements kov {
    /* renamed from: a */
    private final /* synthetic */ euj f15570a;

    public eul(euj euj) {
        this.f15570a = euj;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m874e("MotionTrackSampler", "Failed to fetch gyro packet.", th);
    }

    public final /* synthetic */ void b_(Object obj) {
        Pair pair = (Pair) obj;
        jga jga = this.f15570a.f15564b;
        if (pair != null && jga != null) {
            jga.mo3167a((ByteBuffer) pair.first, (BufferInfo) pair.second);
        }
    }
}
