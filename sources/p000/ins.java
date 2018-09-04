package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.util.Log;

/* compiled from: PG */
/* renamed from: ins */
public final class ins {
    /* renamed from: a */
    public static BufferInfo m3896a() {
        return new BufferInfo();
    }

    /* renamed from: a */
    public static MediaCodec m3897a(inu inu) {
        String a = inu.mo1898a();
        String valueOf = String.valueOf(a);
        String str = "create mediaCodec for";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        Log.d("MediaCodecFac", valueOf);
        try {
            return MediaCodec.createEncoderByType(a);
        } catch (Throwable e) {
            throw new adj("fail to create media codec", inu, e);
        }
    }
}
