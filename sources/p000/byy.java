package p000;

import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BackgroundAeResultsCallback;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.MemoryStateCallback;
import com.google.googlex.gcam.SimpleCallback;
import com.google.googlex.gcam.hdrplus.MapImageProxyReleaseCallback;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: byy */
final class byy {
    /* renamed from: a */
    public static final String f1720a = bli.m862a("HdrPlusState");
    /* renamed from: b */
    public final InitParams f1721b;
    /* renamed from: c */
    public final ConcurrentMap f1722c = new ConcurrentHashMap();
    /* renamed from: d */
    public final ilb f1723d;
    /* renamed from: e */
    public final ilb f1724e;
    /* renamed from: f */
    public final ilb f1725f;
    /* renamed from: g */
    private final MapImageProxyReleaseCallback f1726g = new MapImageProxyReleaseCallback();
    /* renamed from: h */
    private final MemoryStateCallback f1727h;
    /* renamed from: i */
    private final SimpleCallback f1728i;
    /* renamed from: j */
    private final BackgroundAeResultsCallback f1729j;

    byy(bkw bkw, era era, bxg bxg, fgw fgw, bku bku) {
        boolean z;
        boolean z2 = false;
        Object valueOf = Long.valueOf(0);
        this.f1723d = new ilb(valueOf);
        this.f1724e = new ilb(valueOf);
        this.f1727h = new byz(this);
        this.f1728i = new bza(this);
        this.f1725f = new ilb(new AeResults());
        this.f1729j = new bzb(this);
        int a = ije.m3772a(bkw.f1255a, "camera:gcam_thread_count", hjg.m3199a());
        if (a > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "threadCount %d is not a valid value.");
        InitParams initParams = new InitParams();
        initParams.setThread_count(a);
        if (bku == bku.ENG) {
            z2 = true;
        }
        initParams.setAllow_unknown_devices(z2);
        initParams.setTuning_locked(true);
        initParams.setMax_full_metering_sweep_frames(bxe.m1031a(fgw, bkw));
        initParams.setMin_payload_frames(bxg.f1692g);
        initParams.setMax_payload_frames(bxg.f1693h);
        initParams.setMax_zsl_frames(bxg.f1694i);
        bsn bsn = bxg.f1691a.f1307a;
        initParams.setMemory_callback(this.f1727h);
        initParams.setFinish_queue_empty_callback(this.f1728i);
        initParams.setBackground_ae_results_callback(this.f1729j);
        initParams.setImage_release_callback(this.f1726g);
        this.f1721b = initParams;
        era.m2029a(new eqx(eqv.HDR_PLUS, this.f1723d, this.f1724e));
    }

    /* renamed from: a */
    final long m1076a(iwz iwz) {
        return this.f1726g.put(iwz);
    }
}
