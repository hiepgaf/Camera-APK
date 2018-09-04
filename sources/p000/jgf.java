package p000;

import android.media.MediaFormat;

/* renamed from: jgf */
final /* synthetic */ class jgf implements kaw {
    /* renamed from: a */
    private final MediaFormat f18770a;

    jgf(MediaFormat mediaFormat) {
        this.f18770a = mediaFormat;
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        MediaFormat mediaFormat = this.f18770a;
        MediaFormat mediaFormat2 = (MediaFormat) obj;
        if (mediaFormat2 != null) {
            jcc.m4403a("oo.muxer.drop_initial_non_keyframes", mediaFormat, mediaFormat2);
            jcc.m4403a("oo.muxer.force_sequential", mediaFormat, mediaFormat2);
        }
        return mediaFormat2;
    }
}
