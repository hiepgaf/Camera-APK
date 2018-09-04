package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;
import java.nio.ByteBuffer;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: ioy */
public final class ioy extends Thread {
    /* renamed from: a */
    private final /* synthetic */ iow f7261a;

    public ioy(iow iow, String str) {
        this.f7261a = iow;
        super(str);
    }

    public final void run() {
        Log.v("AudioEncoder", "starting");
        boolean z;
        do {
            iow iow = this.f7261a;
            BufferInfo a = ins.m3896a();
            int dequeueOutputBuffer = iow.f18489d.dequeueOutputBuffer(a, 10000);
            if (dequeueOutputBuffer == -1) {
                z = false;
                continue;
            } else if (dequeueOutputBuffer == -2) {
                if (iow.f18490e.m12327a()) {
                    throw new IllegalStateException("format changed twice");
                }
                MediaFormat outputFormat = iow.f18489d.getOutputFormat();
                String valueOf = String.valueOf(outputFormat);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append("Audio encoder output format changed: ");
                stringBuilder.append(valueOf);
                Log.w("AudioEncoder", stringBuilder.toString());
                r1 = iow.f18490e;
                synchronized (r1.f18410c) {
                    if (r1.f18412e != ipi.READY) {
                        Log.e("MediaMuxerMul", "already started, cannot add audio track.");
                    } else {
                        ioq ioq = r1.f18413f;
                        if (ioq.f7239a) {
                            ioq.m3972a(r1.f18408a.addTrack(outputFormat));
                            ioq ioq2 = r1.f18413f;
                            ioq2.f7242d = outputFormat;
                            int a2 = ioq2.m3971a();
                            stringBuilder = new StringBuilder(35);
                            stringBuilder.append("Audio track getIndex(): ");
                            stringBuilder.append(a2);
                            Log.v("MediaMuxerMul", stringBuilder.toString());
                        } else {
                            Log.e("MediaMuxerMul", "Audio track is not supported");
                        }
                    }
                }
                iow.f18490e.m12330c();
                z = false;
                continue;
            } else if (dequeueOutputBuffer != -3) {
                if ((a.flags & 2) != 0) {
                    a.size = 0;
                }
                if (a.size != 0) {
                    Queue queue = iow.f18492g;
                    long j = a.presentationTimeUs;
                    while (!queue.isEmpty()) {
                        kge kge = (kge) jri.m13152b((kge) queue.peek());
                        if (kge.m13501b(Long.valueOf(j))) {
                            z = true;
                            break;
                        } else if (kge.f19198a != kdq.f19179b && ((Long) kge.f19198a.mo2123a()).longValue() > j) {
                            z = false;
                            break;
                        } else {
                            String valueOf2 = String.valueOf(kge);
                            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                            stringBuilder2.append("remove a time range ");
                            stringBuilder2.append(valueOf2);
                            Log.d("AudioEncoder", stringBuilder2.toString());
                            queue.poll();
                        }
                    }
                    z = false;
                    if (!z) {
                        if (!iow.f18490e.m12327a()) {
                            iow.f18490e.m12324a((long) ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS);
                        }
                        ByteBuffer outputBuffer = iow.f18489d.getOutputBuffer(dequeueOutputBuffer);
                        outputBuffer.position(a.offset);
                        outputBuffer.limit(a.offset + a.size);
                        r1 = iow.f18490e;
                        j = (iow.f18493h - a.presentationTimeUs) / 1000;
                        if (j < 0) {
                            Log.e("MediaMuxerMul", "The duration of record cannot be shorter than existing one.");
                        } else {
                            iol iol = r1.f18416i;
                            iol.f7238d = j + iol.f7238d;
                        }
                        a.presentationTimeUs -= iow.f18495j;
                        j = iow.f18496k;
                        if (j < a.presentationTimeUs) {
                            iow.f18496k = a.presentationTimeUs;
                            iow.f18490e.m12326a(outputBuffer, a);
                        } else {
                            StringBuilder stringBuilder3 = new StringBuilder(49);
                            stringBuilder3.append("Ignore frame at ");
                            stringBuilder3.append(j);
                            stringBuilder3.append(" after resume");
                            Log.i("AudioEncoder", stringBuilder3.toString());
                        }
                    }
                }
                iow.f18489d.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (a.presentationTimeUs >= iow.f18494i) {
                    z = true;
                    continue;
                } else if ((a.flags & 4) == 0) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            } else {
                z = false;
                continue;
            }
        } while (!z);
        Log.v("AudioEncoder", "stopping");
    }
}
