package p000;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jfr */
public final class jfr implements jfx {
    /* renamed from: a */
    private long f18751a = 0;
    /* renamed from: b */
    private final /* synthetic */ ByteBuffer f18752b;
    /* renamed from: c */
    private final /* synthetic */ int f18753c;
    /* renamed from: d */
    private final /* synthetic */ jfw f18754d;

    public jfr(jfw jfw, ByteBuffer byteBuffer, int i) {
        this.f18754d = jfw;
        this.f18752b = byteBuffer;
        this.f18753c = i;
    }

    public final void close() {
        this.f18754d.f7781a.queueInputBuffer(this.f18753c, 0, this.f18752b.position(), this.f18751a, 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1990a() {
        return this.f18752b;
    }

    /* renamed from: a */
    public final void mo1991a(long j) {
        this.f18751a = j;
    }
}
