package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: eww */
public final class eww implements kwk {
    /* renamed from: a */
    public static final eww f15693a = new eww();

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 2);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", 128000);
        createAudioFormat.setInteger("max-input-size", ewz.f4299a);
        createAudioFormat.setInteger("oo.muxer.force_sequential", 1);
        return (MediaFormat) ktm.m13963a(createAudioFormat, "Cannot return null from a non-@Nullable @Provides method");
    }
}
