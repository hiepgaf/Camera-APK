package p000;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.media.SoundPool.Builder;

/* compiled from: PG */
/* renamed from: gqc */
public final class gqc implements kwk {
    /* renamed from: a */
    public static final gqc f17221a = new gqc();

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (SoundPool) ktm.m13963a(new Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).setFlags(1).setLegacyStreamType(1).build()).setMaxStreams(3).build(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
