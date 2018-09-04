package p000;

import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jgu */
final class jgu implements jhf {
    /* renamed from: a */
    public final jhe f18775a;
    /* renamed from: b */
    public final Set f18776b = new LinkedHashSet();
    /* renamed from: c */
    public final Set f18777c = new HashSet();
    /* renamed from: d */
    public final kpw f18778d = kpw.m18056d();
    /* renamed from: e */
    private final /* synthetic */ jgp f18779e;

    jgu(jgp jgp, jhe jhe) {
        this.f18779e = jgp;
        this.f18775a = jhe;
    }

    public final void close() {
        this.f18778d.mo3616b(kny.m18045a(kow.m13617a((Object) this), new jgv(this), this.f18779e.f21847b));
    }

    /* renamed from: a */
    final /* synthetic */ Class m12831a() {
        synchronized (this.f18779e.f21846a) {
            for (jhl jhl : this.f18777c) {
                ((jhf) jhl.f7835a).close();
            }
        }
        return jgp.class;
    }

    /* renamed from: a */
    public final void mo1295a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        jgy a = jgy.m4477a(byteBuffer, bufferInfo);
        synchronized (this.f18779e.f21846a) {
            this.f18776b.add(a);
            for (jhl a2 : this.f18777c) {
                this.f18779e.m16263a(a2, a);
            }
        }
    }
}
