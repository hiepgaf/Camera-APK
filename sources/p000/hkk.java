package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hkk */
public final class hkk {
    /* renamed from: a */
    public static final String f6290a = bli.m862a("Vid2ActiveCdrRecSes");
    /* renamed from: b */
    public final bfr f6291b;
    /* renamed from: c */
    public final ikd f6292c;
    /* renamed from: d */
    public final hke f6293d;
    /* renamed from: e */
    public final hkv f6294e;
    /* renamed from: f */
    public final List f6295f = Collections.synchronizedList(new ArrayList());
    /* renamed from: g */
    public final Object f6296g = new Object();
    /* renamed from: h */
    public final Runnable f6297h = new hkm(this);
    /* renamed from: i */
    public final hkw f6298i;
    /* renamed from: j */
    public int f6299j = go.bz;
    /* renamed from: k */
    private final gpn f6300k;
    /* renamed from: l */
    private final gxz f6301l;
    /* renamed from: m */
    private final ScheduledExecutorService f6302m = iel.m3723e("Video2SchEx", 1);
    /* renamed from: n */
    private final Executor f6303n = new bbv("Video2DelEx", VideoProviderSource.TIMESTAMP_FILTER_SIZE);
    /* renamed from: o */
    private final ScheduledFuture f6304o;
    /* renamed from: p */
    private final gtx f6305p;

    public hkk(ikd ikd, hke hke, gpn gpn, gtx gtx, bfr bfr, hkv hkv, gxz gxz, hkw hkw) {
        this.f6291b = bfr;
        this.f6292c = ikd;
        this.f6293d = hke;
        this.f6294e = hkv;
        this.f6300k = gpn;
        this.f6301l = gxz;
        this.f6298i = hkw;
        this.f6305p = gtx;
        this.f6304o = this.f6302m.scheduleAtFixedRate(new hkn(this), 0, 1, TimeUnit.SECONDS);
        gtx.m2827a(30000, new hkl(this));
    }

    /* renamed from: a */
    public final boolean m3229a() {
        synchronized (this.f6296g) {
            if (this.f6299j == go.bz) {
                this.f6291b.mo2674h();
                this.f6299j = go.bA;
                this.f6300k.mo1548a(R.raw.video_pause);
                gxz gxz = this.f6301l;
                gxz.f5786c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                gxz.f5786c.setText(gxz.f5785b.getString(R.string.video_recording_paused_indicator, new Object[]{hkd.m3220a(gxz.f5784a)}));
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m3230b() {
        synchronized (this.f6296g) {
            if (this.f6299j != go.bA) {
                return false;
            }
            this.f6300k.mo1548a(R.raw.video_start);
            this.f6303n.execute(new hkr(this));
            return true;
        }
    }

    /* renamed from: a */
    public final kpk m3228a(boolean z) {
        kpk a;
        synchronized (this.f6296g) {
            String str = f6290a;
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("stopRecording: shouldShutdown=");
            stringBuilder.append(z);
            bli.m863a(str, stringBuilder.toString());
            if (this.f6299j == go.bC || this.f6299j == go.bB) {
                a = kow.m13618a(new IllegalStateException("state is not RECORDING"));
            } else {
                this.f6299j = go.bB;
                this.f6305p.m2826a();
                this.f6304o.cancel(true);
                this.f6302m.shutdown();
                if (z) {
                    a = this.f6291b.mo2676j();
                } else {
                    a = this.f6291b.mo2677k();
                }
                a = kny.m18045a(a, new hko(this), kpq.f8410a);
            }
        }
        return a;
    }
}
