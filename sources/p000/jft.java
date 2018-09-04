package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.util.Log;

/* compiled from: PG */
/* renamed from: jft */
public final class jft extends Callback {
    /* renamed from: a */
    public final /* synthetic */ jfw f7776a;

    jft(jfw jfw) {
        this.f7776a = jfw;
    }

    /* renamed from: a */
    public final void m4452a(BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0) {
            this.f7776a.f7781a.flush();
            this.f7776a.f7785e.clear();
            this.f7776a.f7782b.set(3);
            if (this.f7776a.f7788h.get()) {
                this.f7776a.f7792l.mo1302a(go.bQ);
            } else {
                this.f7776a.f7792l.mo1302a(go.bP);
            }
            if (this.f7776a.f7788h.getAndSet(false)) {
                this.f7776a.m4455b();
            }
        }
    }

    public final void onError(MediaCodec mediaCodec, CodecException codecException) {
        String valueOf = String.valueOf(codecException);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
        stringBuilder.append("Error occurred while processing data: ");
        stringBuilder.append(valueOf);
        Log.w("AsynchMediaCodec", stringBuilder.toString());
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        if (this.f7776a.f7787g.getAndSet(false)) {
            this.f7776a.m4454a(i);
        } else {
            this.f7776a.f7785e.addLast(Integer.valueOf(i));
        }
        jfw jfw = this.f7776a;
        jfw.f7792l.mo1305a(jfw);
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
        boolean z = this.f7776a.f7789i.get();
        if ((bufferInfo.flags & 2) != 0) {
            bufferInfo.size = 0;
        }
        if (bufferInfo.size <= 0 || z) {
            mediaCodec.releaseOutputBuffer(i, false);
            m4452a(bufferInfo);
            return;
        }
        this.f7776a.f7792l.mo1304a(bufferInfo);
        this.f7776a.f7791k.mo2001a(new jho(this, mediaCodec, mediaCodec.getOutputBuffer(i), bufferInfo, i));
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f7776a.f7791k.mo2000a(mediaFormat);
    }
}
