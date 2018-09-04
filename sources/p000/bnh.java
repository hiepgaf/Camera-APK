package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: bnh */
final class bnh {
    /* renamed from: a */
    public final gkr f1337a;
    /* renamed from: b */
    public final UUID f1338b;
    /* renamed from: c */
    public final long f1339c;
    /* renamed from: d */
    public final iqm f1340d;
    /* renamed from: e */
    public final AtomicInteger f1341e = new AtomicInteger(0);
    /* renamed from: f */
    public final AtomicInteger f1342f = new AtomicInteger(0);
    /* renamed from: g */
    public final AtomicInteger f1343g = new AtomicInteger(0);
    /* renamed from: h */
    public final bnx f1344h;
    /* renamed from: i */
    public final BurstSessionStatistics f1345i;
    /* renamed from: j */
    public final iqp f1346j;
    /* renamed from: k */
    public volatile Bitmap f1347k = null;

    bnh(gkr gkr, UUID uuid, long j, iqm iqm, bnx bnx, BurstSessionStatistics burstSessionStatistics, iqp iqp) {
        this.f1337a = gkr;
        this.f1338b = uuid;
        this.f1339c = j;
        this.f1340d = iqm;
        this.f1344h = bnx;
        this.f1345i = burstSessionStatistics;
        this.f1346j = iqp;
    }
}
