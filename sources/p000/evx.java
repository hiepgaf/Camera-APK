package p000;

import android.media.AudioFormat;
import android.media.AudioRecord.Builder;

/* compiled from: PG */
/* renamed from: evx */
public final class evx implements kwk {
    /* renamed from: a */
    public static final evx f15622a = new evx();

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Builder audioFormat = new Builder().setAudioSource(1).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(44100).setChannelMask(12).build());
        int i = ewz.f4299a;
        return (jfp) ktm.m13963a(new jfp(audioFormat.setBufferSizeInBytes(i + i).build()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
