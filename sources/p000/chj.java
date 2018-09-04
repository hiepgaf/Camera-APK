package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.RectF;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.SurfaceTextureStreamer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.pipeline.Pipeline;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: chj */
final class chj implements chh {
    /* renamed from: a */
    public static final String f11961a = bli.m862a("BurstCntrImpl");
    /* renamed from: y */
    private static final RectF f11962y = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    /* renamed from: A */
    private final AtomicBoolean f11963A = new AtomicBoolean(false);
    /* renamed from: B */
    private final AtomicBoolean f11964B = new AtomicBoolean(false);
    /* renamed from: C */
    private final jsi f11965C;
    /* renamed from: D */
    private final jsi f11966D;
    /* renamed from: E */
    private final Pipeline f11967E;
    /* renamed from: F */
    private final jwa f11968F;
    /* renamed from: G */
    private final SurfaceTextureStreamer f11969G;
    /* renamed from: H */
    private final MffContext f11970H;
    /* renamed from: I */
    private volatile long f11971I;
    /* renamed from: J */
    private final agw f11972J = new ahe(52428800);
    /* renamed from: b */
    public final Context f11973b;
    /* renamed from: c */
    public final cjn f11974c;
    /* renamed from: d */
    public final gkr f11975d;
    /* renamed from: e */
    public final gln f11976e;
    /* renamed from: f */
    public final gev f11977f;
    /* renamed from: g */
    public final kpk f11978g;
    /* renamed from: h */
    public final grw f11979h;
    /* renamed from: i */
    public final ckw f11980i;
    /* renamed from: j */
    public final jmr f11981j;
    /* renamed from: k */
    public final boolean f11982k;
    /* renamed from: l */
    public final ird f11983l;
    /* renamed from: m */
    public volatile boolean f11984m = false;
    /* renamed from: n */
    public final int f11985n;
    /* renamed from: o */
    public final chi f11986o;
    /* renamed from: p */
    public final jyt f11987p;
    /* renamed from: q */
    public final jqo f11988q;
    /* renamed from: r */
    public final AtomicReference f11989r = new AtomicReference();
    /* renamed from: s */
    public final UUID f11990s;
    /* renamed from: t */
    public volatile boolean f11991t = true;
    /* renamed from: u */
    public final AtomicReference f11992u = new AtomicReference();
    /* renamed from: v */
    public final gsp f11993v;
    /* renamed from: w */
    public final irs f11994w;
    /* renamed from: x */
    public final glj f11995x;
    /* renamed from: z */
    private final AtomicBoolean f11996z = new AtomicBoolean(false);

    /* renamed from: a */
    static /* synthetic */ void m8194a(Throwable th, kae kae) {
        if (th != null) {
            try {
                kae.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        kae.close();
    }

    /* renamed from: a */
    static /* synthetic */ void m8195a(Throwable th, kaf kaf) {
        if (th != null) {
            try {
                kaf.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        kaf.close();
    }

    public chj(Context context, jmr jmr, kpk kpk, bcy bcy, chi chi, cjn cjn, gkr gkr, gln gln, gev gev, grw grw, SurfaceTextureStreamer surfaceTextureStreamer, boolean z, gsp gsp, UUID uuid, ird ird, irs irs, glj glj) {
        jqo jrk;
        ird.mo1903a("BurstControllerImpl#constructor");
        this.f11983l = ird;
        this.f11973b = context;
        this.f11981j = jmr;
        this.f11978g = kpk;
        this.f11974c = cjn;
        this.f11975d = gkr;
        this.f11976e = gln;
        this.f11977f = gev;
        this.f11979h = grw;
        this.f11982k = z;
        this.f11986o = chi;
        this.f11993v = gsp;
        this.f11990s = uuid;
        this.f11994w = irs;
        this.f11995x = glj;
        kow.m13622a(this.f11978g, new chk(this), kpq.f8410a);
        this.f11969G = surfaceTextureStreamer;
        this.f11987p = new jyt(jlo.m4539a(), "camera_sb_");
        jqo jrd = new jrd(this.f11972J);
        if (jlo.m4541c()) {
            jrk = new jrk(jrd);
            this.f11987p.m4701a("bitmap_allocs.csv", jrk);
        } else {
            jrk = jrd;
        }
        this.f11988q = jrk;
        this.f11970H = new MffContext(this.f11973b);
        Object jms = new jms();
        MffContext mffContext = this.f11970H;
        jmr jmr2 = this.f11981j;
        kpk kpk2 = this.f11978g;
        jqo jqo = this.f11988q;
        if (jmr2.m4593a()) {
            mffContext.getApplicationContext();
            jmx.m12981b(jms);
            List arrayList = new ArrayList();
            arrayList.add(new jlv());
            arrayList.add(new jlq());
            arrayList.add(new jls());
            GraphFactory[] graphFactoryArr = (GraphFactory[]) arrayList.toArray(new GraphFactory[arrayList.size()]);
            EnumSet copyOf = EnumSet.copyOf(EnumSet.of(jza.TIMESTAMP, jza.EXPOSURE));
            copyOf.addAll(EnumSet.of(jza.PERCEPTUAL_SHARPNESS, new jza[]{jza.MAX_GRID_SHARPNESS, jza.BRIGHTNESS_MEAN, jza.BRIGHTNESS_VARIANCE, jza.MAX_BLOCK_BRIGHTNESS_MEAN, jza.MIN_BLOCK_BRIGHTNESS_MEAN, jza.MAX_BLOCK_BRIGHTNESS_VARIANCE, jza.MIN_BLOCK_BRIGHTNESS_VARIANCE}));
            copyOf.addAll(EnumSet.of(jza.MOTION_SALIENCY, jza.MOTION_ESTIMATION_SALIENCY, jza.INTERFRAME_HOMOGRAPHY, jza.CAMERA_MOTION));
            copyOf.addAll(EnumSet.of(jza.FACE_COUNT, jza.FACE_IS_SMILING_AGGREGATE_SCORE, jza.FACE_IS_LEFT_EYE_OPEN_AGGREGATE_SCORE, jza.FACE_IS_RIGHT_EYE_OPEN_AGGREGATE_SCORE, jza.FACE_SHARPNESS_AGGREGATE_SCORE));
            copyOf.addAll(EnumSet.of(jza.HUE_SAT_HISTOGRAM, jza.VALUE_HISTOGRAM, jza.VIDEO_PRESENTATION_TIME));
            jmx.m12980a(jms, mffContext, jmr2, graphFactoryArr, surfaceTextureStreamer, kpk2, jqo, copyOf);
        } else {
            boolean z2;
            jri.m13152b(jms);
            if (jmr2 == jmr.FIXED_FPS) {
                z2 = true;
            } else {
                z2 = false;
            }
            jri.m13143a(z2);
            jms.f7928c = false;
            jms.m4599b(jwa.class, "FixedFPSModeFrameDropper").m4601a(new jnd());
            jms.m4599b(jvx.class, "default").m4601a(new jne());
            jms.m4599b(jwa.class, "default").m4601a(new jnf());
            jms.m4599b(jwa.class, "med-res-acquisition-pipeline").m4601a(new jng());
            jms.f7928c = true;
            jmx.m12980a(jms, mffContext, jmr2, new GraphFactory[0], surfaceTextureStreamer, kpk2, jqo, EnumSet.of(jza.TIMESTAMP));
        }
        if (jlo.m4541c()) {
            jyt jyt = this.f11987p;
            jms.m4597a(VideoFrameProvider.class, new jyc(jyt));
            jms.m4597a(jtv.class, new jyj(jyt.m4702b("live_framescores.csv")));
            jms.m4597a(jwa.class, new jyk(jyt.m4699a("frame_dropper_events.csv")));
            jms.m4597a(jtn.class, new jyl(jyt.m4702b("live_features.csv")));
            jms.m4599b(jrj.class, "default").m4601a(new jym(jyt));
            jms.m4599b(jsi.class, "low-res-acquisition-pipeline").m4601a(new jyn());
            jms.m4599b(jsi.class, "med-res-acquisition-pipeline").m4601a(new jyo());
            jms.m4599b(jsh.class, "default").m4601a(new jyp());
            jms.m4599b(FeatureTable.class, "default").m4601a(new jyq(jyt));
            jms.m4597a(FeatureTable.class, new jyd(jyt.m4699a("feature_additions.csv")));
            jyt.m4701a("capture_config.txt", jms.m4596a());
        }
        this.f11965C = (jsi) jms.m4595a(jsi.class, "low-res-acquisition-pipeline");
        RectF rectF = f11962y;
        this.f11965C.m16335a(rectF);
        this.f11966D = (jsi) jms.m4595a(jsi.class, "med-res-acquisition-pipeline");
        this.f11966D.m16335a(rectF);
        this.f11967E = (Pipeline) jms.m4595a(jsl.class, "default");
        this.f11985n = chi.f1989c;
        this.f11968F = (jwa) jms.m4595a(jwa.class, "default");
        this.f11980i = new ckw(bcy);
        ird.mo1904b();
    }

    public final synchronized void close() {
        if (this.f11963A.get()) {
            bli.m863a(f11961a, "close");
            this.f11983l.mo1903a("BurstControllerImpl#close");
            m8196c();
            this.f11970H.release();
            this.f11983l.mo1904b();
        } else {
            throw new RuntimeException("Burst was never stopped before closing.");
        }
    }

    /* renamed from: c */
    private final void m8196c() {
        if (!this.f11964B.getAndSet(true)) {
            jrg jrg = (jrg) this.f11992u.getAndSet(null);
            if (jrg != null) {
                jrg.close();
            }
            try {
                this.f11972J.mo60a();
                this.f11987p.m4700a();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: d */
    private final void m8197d() {
        if (!this.f11996z.get()) {
            throw new RuntimeException("Stopping burst that was not started yet.");
        } else if (this.f11963A.getAndSet(true)) {
            throw new RuntimeException("Stopping burst twice.");
        }
    }

    /* renamed from: a */
    public final void mo686a(kpk kpk, dpu dpu) {
        this.f11983l.mo1903a("BurstControllerImpl#processBurstResults");
        Executor a = khx.m4940a();
        jli.m12940a(kpk).mo1973a(a, new chm(this, dpu)).mo1981b(a, new chl(this)).mo1980a(izw.f18704a);
        this.f11983l.mo1904b();
    }

    /* renamed from: a */
    public final synchronized jwa mo685a() {
        if (this.f11996z.getAndSet(true)) {
            throw new RuntimeException("Burst was already started");
        }
        this.f11983l.mo1903a("BurstControllerImpl#startAnalysis");
        this.f11969G.start();
        this.f11980i.m8311a();
        this.f11971I = System.nanoTime();
        Executor d = cht.m1133d();
        jli.m12936a(jli.m12936a(this.f11965C.process(), this.f11966D.process()).mo1973a(d, new chn()), this.f11967E.process()).mo1973a(d, new chp(this, d)).mo1981b(d, new cho(this)).mo1980a(izw.f18704a);
        bli.m871d(cig.f2026a, "onBurstStarted");
        this.f11983l.mo1904b();
        return this.f11968F;
    }

    /* renamed from: e */
    private final void m8198e() {
        bli.m863a(f11961a, "Stopping analysis.");
        this.f11983l.mo1903a("BurstControllerImpl#stop");
        this.f11967E.stop();
        this.f11969G.stop();
        this.f11965C.stop();
        this.f11966D.stop();
        this.f11983l.mo1904b();
    }

    /* renamed from: b */
    public final synchronized void m8202b() {
        bli.m863a(f11961a, "stopAndCancel");
        this.f11983l.mo1903a("BurstControllerImpl#stopAndCancel");
        m8197d();
        this.f11991t = false;
        m8198e();
        this.f11983l.mo1904b();
    }

    /* renamed from: a */
    public final synchronized void m8200a(jrg jrg, dpu dpu) {
        try {
            this.f11983l.mo1903a("BurstControllerImpl#stopAndPopulateResults");
            m8197d();
            try {
                kae jzy = new jzy(jqk.m13097b((AutoCloseable) jrg));
                try {
                    jrg jrg2 = (jrg) this.f11992u.getAndSet(jrg);
                    if (jrg2 != null) {
                        jrg2.close();
                        m8196c();
                        throw new IllegalStateException("Trying to capture images when existing burst session is running.");
                    }
                    this.f11989r.set(dpu);
                    int f = jrg.m13136f();
                    float convert = (float) TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f11971I, TimeUnit.NANOSECONDS);
                    klx klx = this.f11979h.f5655a;
                    klx.f22417a = convert;
                    klx.f22418b = f;
                    m8198e();
                    jzy.mo3190d();
                    chj.m8194a(null, jzy);
                    this.f11983l.mo1904b();
                } catch (Throwable th) {
                    chj.m8194a(th, jzy);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f11983l.mo1904b();
                throw th2;
            }
        } catch (Throwable th22) {
            throw th22;
        }
    }
}
