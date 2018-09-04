package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: jgb */
public final class jgb implements jgg {
    /* renamed from: a */
    public final jfw f18765a;
    /* renamed from: b */
    public final kpk f18766b;

    jgb(MediaFormat mediaFormat, jhf jhf, jgk jgk, Handler handler) {
        jfu jfu = new jfu(mediaFormat);
        jfu.f7778b = handler;
        this.f18765a = new jfw(MediaCodec.createEncoderByType(jfu.f7777a.getString("mime")), jfu.f7777a, null, false, jfu.f7778b);
        jfw jfw = this.f18765a;
        if (jfw.f7790j.get()) {
            throw new IllegalStateException("Not allowed to update the listener after start.");
        }
        jfw.f7792l = jgk;
        jhm jhp = new jhp(jhf);
        jfw jfw2 = this.f18765a;
        if (jfw2.f7790j.get()) {
            throw new IllegalStateException("Not allowed to update the frame processor after start.");
        }
        jfw2.f7791k = jhp;
        this.f18766b = jhp.mo1999a();
    }

    /* renamed from: a */
    public final kpk mo1997a() {
        jfw jfw = this.f18765a;
        if (!jfw.f7788h.getAndSet(true)) {
            switch (jfw.f7782b.get()) {
                case 1:
                    if (jfw.f7784d == null) {
                        int a = jfw.m4453a();
                        if (a < 0 && jfw.f7782b.get() == 1) {
                            jfw.f7787g.set(true);
                            break;
                        }
                        jfw.m4454a(a);
                        break;
                    }
                    jfw.m4454a(0);
                    break;
                    break;
                case 3:
                case 4:
                    jfw.m4455b();
                    break;
            }
        }
        return jfw.f7786f;
    }

    /* renamed from: b */
    public final void mo1998b() {
        jfw jfw = this.f18765a;
        jfw.f7781a.start();
        jfw.f7790j.set(true);
        jfw.f7782b.set(1);
        jfw.f7792l.mo1301a();
    }
}
