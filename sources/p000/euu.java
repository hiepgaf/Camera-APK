package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;

/* renamed from: euu */
final /* synthetic */ class euu implements kbn {
    /* renamed from: a */
    private final BufferInfo f15590a;
    /* renamed from: b */
    private final MediaFormat f15591b;

    euu(BufferInfo bufferInfo, MediaFormat mediaFormat) {
        this.f15590a = bufferInfo;
        this.f15591b = mediaFormat;
    }

    /* renamed from: b */
    public final Object mo605b() {
        BufferInfo bufferInfo = this.f15590a;
        MediaFormat mediaFormat = this.f15591b;
        return String.format("muxer writing <%d> %s", new Object[]{Long.valueOf(bufferInfo.presentationTimeUs), mediaFormat.getString("mime")});
    }
}
