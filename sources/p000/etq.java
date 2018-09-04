package p000;

import android.media.MediaCodec.BufferInfo;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: etq */
final /* synthetic */ class etq implements Runnable {
    /* renamed from: a */
    private final etp f4226a;
    /* renamed from: b */
    private final kpk f4227b;
    /* renamed from: c */
    private final jhf f4228c;

    etq(etp etp, kpk kpk, jhf jhf) {
        this.f4226a = etp;
        this.f4227b = kpk;
        this.f4228c = jhf;
    }

    public final void run() {
        etp etp = this.f4226a;
        Future future = this.f4227b;
        jhf jhf = this.f4228c;
        long j = -1;
        for (Long l : (List) kow.m13625c(future)) {
            if (l != null) {
                long longValue;
                if (j < 0 || l.longValue() < j) {
                    longValue = l.longValue();
                } else {
                    longValue = j;
                }
                j = longValue;
            }
        }
        j = Math.max(j, 0);
        etp.f15524b.mo3557a(Long.valueOf(j));
        if (etp.f15523a < j) {
            Log.e("AddMetaTrackMuxer", String.format("A shutter timestamp (%d) with value less than the starting timestamp (%d) was selected. Overwriting timestamp with starting timestamp.", new Object[]{Long.valueOf(etp.f15523a), r1}));
        }
        long max = Math.max(j, etp.f15523a);
        byte[] a = etp.m9920a(j, max, (kbg) kow.m13625c(etp.f15525c));
        BufferInfo bufferInfo = new BufferInfo();
        bufferInfo.size = a.length;
        bufferInfo.presentationTimeUs = max;
        jhf.mo1295a(ByteBuffer.wrap(a), bufferInfo);
        jhf.close();
    }
}
