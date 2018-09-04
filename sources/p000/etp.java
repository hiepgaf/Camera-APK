package p000;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: etp */
public final class etp implements jgx {
    /* renamed from: a */
    public final long f15523a;
    /* renamed from: b */
    public final kpw f15524b;
    /* renamed from: c */
    public final kpk f15525c;
    /* renamed from: d */
    private final jgx f15526d;
    /* renamed from: e */
    private final MediaFormat f15527e;
    /* renamed from: f */
    private final List f15528f = new ArrayList();
    /* renamed from: g */
    private final Executor f15529g;

    public etp(jgx jgx, long j, kpw kpw, kpk kpk, Executor executor) {
        this.f15526d = jgx;
        this.f15529g = executor;
        this.f15523a = j;
        this.f15524b = kpw;
        this.f15525c = kpk;
        this.f15527e = new MediaFormat();
        this.f15527e.setString("mime", "application/microvideo-image-meta");
    }

    /* renamed from: a */
    public final synchronized jhf mo1292a(jhe jhe) {
        jhf a;
        kpw d;
        a = this.f15526d.mo1292a(jhe);
        d = kpw.m18056d();
        this.f15528f.add(d);
        return new etr(a, d);
    }

    /* renamed from: a */
    static byte[] m9920a(long j, long j2, kbg kbg) {
        iyo iyo = new iyo();
        iyo.f21818a = j2;
        iyo.f21819b = j2 - j;
        if (kbg.mo2084b()) {
            iyo.f21820c = (iyq) kbg.mo2081a();
        }
        byte[] bArr = new byte[iyo.getSerializedSize()];
        try {
            iyo.writeTo(kvd.m5421a(bArr, 0, bArr.length));
        } catch (Throwable e) {
            Log.w("AddMetaTrackMuxer", "Error trying to append meta data.", e);
        }
        return bArr;
    }

    /* renamed from: a */
    public final void mo1293a() {
        kpk a;
        kpk a2;
        jhf a3 = this.f15526d.mo1292a(jhe.m4489a(this.f15527e));
        synchronized (this) {
            a = kow.m13616a(this.f15528f);
        }
        synchronized (this) {
            a2 = kow.m13621a(a, this.f15525c);
        }
        a2.mo1985a(new etq(this, a, a3), this.f15529g);
        this.f15526d.mo1293a();
    }

    /* renamed from: b */
    public final kpk mo1294b() {
        return this.f15526d.mo1294b();
    }
}
