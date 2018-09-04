package p000;

import android.media.AudioManager;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iou */
public final class iou implements iqo {
    /* renamed from: a */
    public final inm f18456a;
    /* renamed from: b */
    public final inp f18457b;
    /* renamed from: c */
    public final Handler f18458c;
    /* renamed from: d */
    public final ilp f18459d;
    /* renamed from: e */
    public final kbg f18460e;
    /* renamed from: f */
    public final gtf f18461f;
    /* renamed from: g */
    public final bja f18462g;
    /* renamed from: h */
    public final int f18463h;
    /* renamed from: i */
    public final kbg f18464i;
    /* renamed from: j */
    public final ird f18465j;
    /* renamed from: k */
    public final kbg f18466k;
    /* renamed from: l */
    public int f18467l;
    /* renamed from: m */
    public File f18468m;
    /* renamed from: n */
    public final ing f18469n;
    /* renamed from: o */
    public kbg f18470o;
    /* renamed from: p */
    public final AudioManager f18471p;
    /* renamed from: q */
    public final iov f18472q;
    /* renamed from: r */
    public final kpm f18473r;
    /* renamed from: s */
    private final Executor f18474s;
    /* renamed from: t */
    private final guf f18475t;
    /* renamed from: u */
    private final Object f18476u = new Object();
    /* renamed from: v */
    private boolean f18477v = false;

    public iou(ilp ilp, AudioManager audioManager, bkm bkm, inm inm, inp inp, Executor executor, Handler handler, ing ing, ilp ilp2, kbg kbg, boolean z, guf guf, gtf gtf, bja bja, int i, kbg kbg2, kbg kbg3, ird ird) {
        this.f18471p = audioManager;
        this.f18456a = inm;
        this.f18457b = inp;
        this.f18474s = executor;
        this.f18458c = handler;
        this.f18459d = ilp2;
        this.f18460e = kbg;
        this.f18475t = guf;
        this.f18461f = gtf;
        this.f18462g = bja;
        this.f18463h = i;
        this.f18464i = kbg3;
        this.f18466k = kbg2;
        this.f18465j = ird;
        this.f18469n = ing;
        if (z) {
            this.f18470o = kbg.m4745c(MediaCodec.createPersistentInputSurface());
        } else {
            this.f18470o = kau.f19138a;
        }
        this.f18472q = new iov(bkm, ilp);
        boolean b = this.f18470o.mo2084b();
        StringBuilder stringBuilder = new StringBuilder(63);
        stringBuilder.append("persistent surface requested=");
        stringBuilder.append(z);
        stringBuilder.append(" and actually available=");
        stringBuilder.append(b);
        bli.m863a("VideoRecPreImp2", stringBuilder.toString());
        this.f18473r = khx.m4941a(iel.m3715a("VidMedCod", 2));
    }

    public final void close() {
        synchronized (this.f18476u) {
            if (this.f18477v) {
                bli.m866b("VideoRecPreImp2", "close twice!");
                return;
            }
            bli.m863a("VideoRecPreImp2", "close");
            this.f18477v = true;
            if (this.f18466k.mo2084b()) {
                bli.m863a("VideoRecPreImp2", "Close video intent file descriptor.");
                try {
                    ((ParcelFileDescriptor) this.f18466k.mo2081a()).close();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    stringBuilder.append("Error on closing intentFileDescriptor: ");
                    stringBuilder.append(valueOf);
                    bli.m866b("VideoRecPreImp2", stringBuilder.toString());
                }
            }
            if (this.f18470o.mo2084b()) {
                bli.m863a("VideoRecPreImp2", "Persistent surface is now closed.");
                ((Surface) this.f18470o.mo2081a()).release();
            }
            this.f18472q.close();
            this.f18473r.shutdown();
        }
    }

    /* renamed from: a */
    public final kpk m12341a() {
        return kny.m18046a(this.f18475t.mo1650a(true), new bkr(this), this.f18474s);
    }
}
