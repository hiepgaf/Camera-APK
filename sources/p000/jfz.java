package p000;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jfz */
public class jfz implements jga {
    /* renamed from: a */
    private jhf f21843a;
    /* renamed from: b */
    private volatile boolean f21844b = false;

    public jfz(jhf jhf) {
        this.f21843a = jhf;
    }

    /* renamed from: a */
    public final kpk mo1997a() {
        this.f21843a.close();
        return kow.m13617a((Object) jfz.class);
    }

    /* renamed from: b */
    public final void mo1998b() {
    }

    /* renamed from: a */
    public final void mo3167a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        boolean z = this.f21844b;
        this.f21843a.mo1295a(byteBuffer, bufferInfo);
    }
}
