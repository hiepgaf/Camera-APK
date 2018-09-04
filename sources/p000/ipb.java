package p000;

import android.media.MediaCodec.BufferInfo;
import java.util.Collections;

/* renamed from: ipb */
public final /* synthetic */ class ipb implements Runnable {
    /* renamed from: a */
    private final ioo f7272a;
    /* renamed from: b */
    private final BufferInfo f7273b;

    public ipb(ioo ioo, BufferInfo bufferInfo) {
        this.f7272a = ioo;
        this.f7273b = bufferInfo;
    }

    public final void run() {
        ioo ioo = this.f7272a;
        BufferInfo bufferInfo = this.f7273b;
        for (iop a : Collections.unmodifiableCollection(ioo.f18411d)) {
            a.mo2660a(bufferInfo.presentationTimeUs, (long) bufferInfo.size);
        }
    }
}
