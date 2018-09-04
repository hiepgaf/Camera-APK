package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ipj */
public final class ipj extends Thread {
    /* renamed from: a */
    private final /* synthetic */ ior f7285a;

    public ipj(ior ior, String str) {
        this.f7285a = ior;
        super(str);
    }

    public final void run() {
        Log.v("VideoEncoder", "starting");
        boolean z;
        do {
            ior ior = this.f7285a;
            BufferInfo a = ins.m3896a();
            int dequeueOutputBuffer = ior.f18429b.dequeueOutputBuffer(a, 10000);
            if (dequeueOutputBuffer == -1) {
                z = false;
                continue;
            } else if (dequeueOutputBuffer == -3) {
                z = false;
                continue;
            } else if (dequeueOutputBuffer == -2) {
                if (ior.f18431d.m12327a()) {
                    throw new IllegalStateException("format changed twice");
                }
                MediaFormat outputFormat = ior.f18429b.getOutputFormat();
                String valueOf = String.valueOf(outputFormat);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append("VIDEO encoder output format changed: ");
                stringBuilder.append(valueOf);
                Log.d("VideoEncoder", stringBuilder.toString());
                ioo ioo = ior.f18431d;
                synchronized (ioo.f18410c) {
                    if (ioo.f18412e != ipi.READY) {
                        Log.e("MediaMuxerMul", "already started, cannot add audio track.");
                    } else {
                        ioq ioq = ioo.f18414g;
                        if (ioq.f7239a) {
                            ioq.m3972a(ioo.f18408a.addTrack(outputFormat));
                            ioq ioq2 = ioo.f18414g;
                            ioq2.f7242d = outputFormat;
                            dequeueOutputBuffer = ioq2.m3971a();
                            stringBuilder = new StringBuilder(35);
                            stringBuilder.append("Video track getIndex(): ");
                            stringBuilder.append(dequeueOutputBuffer);
                            Log.v("MediaMuxerMul", stringBuilder.toString());
                        } else {
                            Log.e("MediaMuxerMul", "Video track is not supported");
                        }
                    }
                }
                ior.f18431d.m12330c();
                z = false;
                continue;
            } else if (dequeueOutputBuffer < 0) {
                StringBuilder stringBuilder2 = new StringBuilder(63);
                stringBuilder2.append("unexpected result from encoder.dequeueOutputBuffer: ");
                stringBuilder2.append(dequeueOutputBuffer);
                Log.w("VideoEncoder", stringBuilder2.toString());
                z = false;
                continue;
            } else {
                ByteBuffer outputBuffer = ior.f18429b.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer == null) {
                    StringBuilder stringBuilder3 = new StringBuilder(40);
                    stringBuilder3.append("encoderOutputBuffer ");
                    stringBuilder3.append(dequeueOutputBuffer);
                    stringBuilder3.append(" was null");
                    throw new RuntimeException(stringBuilder3.toString());
                }
                if ((a.flags & 2) != 0) {
                    a.size = 0;
                }
                if (a.size != 0) {
                    if (!ior.f18431d.m12327a()) {
                        ior.f18431d.m12324a(500);
                    }
                    outputBuffer.position(a.offset);
                    outputBuffer.limit(a.offset + a.size);
                    ior.f18431d.m12329b(outputBuffer, a);
                }
                ior.f18429b.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (a.presentationTimeUs >= ior.f18436i || (a.flags & 4) != 0) {
                    Log.d("VideoEncoder", "VIDEO End of stream reached");
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            }
        } while (!z);
        Log.v("VideoEncoder", "stopping");
    }
}
