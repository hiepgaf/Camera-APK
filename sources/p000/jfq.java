package p000;

import android.media.AudioFormat;

/* compiled from: PG */
/* renamed from: jfq */
final class jfq {
    /* renamed from: a */
    public final Object f7771a;
    /* renamed from: b */
    public long f7772b;
    /* renamed from: c */
    private final long f7773c;
    /* renamed from: d */
    private final int f7774d;
    /* renamed from: e */
    private final int f7775e;

    public jfq(AudioFormat audioFormat) {
        int i;
        this.f7773c = 1000000000 / ((long) audioFormat.getSampleRate());
        this.f7775e = audioFormat.getChannelCount();
        switch (audioFormat.getEncoding()) {
            case 1:
            case 2:
            case 13:
                i = 2;
                break;
            case 3:
                i = 1;
                break;
            case 4:
                i = 4;
                break;
            default:
                String valueOf = String.valueOf(audioFormat);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                stringBuilder.append("Bad audio format ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f7774d = i;
        this.f7771a = new Object();
        this.f7772b = 0;
    }
}
