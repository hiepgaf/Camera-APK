package p000;

/* compiled from: PG */
/* renamed from: bmb */
public final class bmb {
    /* renamed from: A */
    public static final bsb f1272A = new bsb("camera.enable_lkcnry");
    /* renamed from: B */
    public static final bsb f1273B = new bsb("camera.artemis");
    /* renamed from: C */
    public static final bsb f1274C = new bsb("camera.use_photos");
    /* renamed from: D */
    public static final bsb f1275D = new bsb("camera.diet_burst");
    /* renamed from: E */
    public static final bsa f1276E = new bsa("camera.auto_fps");
    /* renamed from: F */
    public static final bsb f1277F = new bsb("camerairis.enable_iris");
    /* renamed from: G */
    public static final bsb f1278G = new bsb("camera.use_smarts_api");
    /* renamed from: H */
    public static final bsb f1279H = new bsb("camera.iris_use_pb");
    /* renamed from: c */
    public static final bsa f1280c = new bsa("camera.onscreen_log");
    /* renamed from: d */
    public static final bsa f1281d = new bsa("camera.onscreen_logcat");
    /* renamed from: e */
    public static final bsa f1282e = new bsa("camera.syshealth_info");
    /* renamed from: f */
    public static final bsa f1283f = new bsa("camera.faceboxes");
    /* renamed from: g */
    public static final bsq f1284g = new bsq("camera.use_perf_logger", false);
    /* renamed from: h */
    public static final bsa f1285h = new bsa("camera.af.debug.show");
    /* renamed from: i */
    public static final bsa f1286i = new bsa("camera.op.nes");
    /* renamed from: j */
    public static final bsa f1287j = new bsa("camera.hwhdr_inapp");
    /* renamed from: k */
    public static final bsk f1288k = new bsk("camera.hwhdr_intent");
    /* renamed from: l */
    public static final bsb f1289l = new bsb("camera.enable_pd");
    /* renamed from: m */
    public static final bsb f1290m = new bsb("camera.enable_pd_blur");
    /* renamed from: n */
    public static final bsb f1291n = new bsb("cameraprogress_overlay");
    /* renamed from: o */
    public static final bsa f1292o = new bsa("camera.enable_micro_he");
    /* renamed from: p */
    public static final bsa f1293p = new bsa("camera.mv_verbose");
    /* renamed from: q */
    public static final bsa f1294q = new bsa("camera.micro_no_trim");
    /* renamed from: r */
    public static final bsa f1295r = new bsa("camera.micro_audio");
    /* renamed from: s */
    public static final bsa f1296s = new bsa("camera.micro_trimtoast");
    /* renamed from: t */
    public static final bsb f1297t = new bsb("camera.micro_motion");
    /* renamed from: u */
    public static final bsb f1298u = new bsb("camera.micro_tooltip");
    /* renamed from: v */
    public static final bsk f1299v = new bsk("camera.micro_tone_map");
    /* renamed from: w */
    public static final bsa f1300w = new bsa("camera.mts_4k");
    /* renamed from: x */
    public static final bsb f1301x = new bsb("camera.mts_1fr");
    /* renamed from: y */
    public static final bsa f1302y = new bsa("camera.micro_longpress");
    /* renamed from: z */
    public static final bsa f1303z = new bsa("camera.mts_simple");
    /* renamed from: I */
    public final bsq f1304I = new bsq("camera.enable_micro", this.f1305J.m855g());
    /* renamed from: J */
    public final bkw f1305J;
    /* renamed from: K */
    private final bul f1306K;
    /* renamed from: a */
    public final bsn f1307a;
    /* renamed from: b */
    public hjf f1308b;

    static {
        bsa bsa = new bsa("camera.use_local_logger");
        bsa = new bsa("camera.af.ring.hide");
        bsb bsb = new bsb("camera.flash.ind");
        bsa = new bsa("camera.elmyra_assist");
        bsa = new bsa("camera.elmyra_lens");
        bsa = new bsa("camera.optbar.hdr");
        bsa = new bsa("camera.finish_use_cpu");
    }

    public bmb(bsn bsn, hjf hjf, bul bul, bkw bkw) {
        this.f1307a = bsn;
        this.f1308b = hjf;
        this.f1306K = bul;
        this.f1305J = bkw;
        bsk bsk = new bsk("camera.raw_mode");
        bsc bsc = new bsc("camera.chk_anim_trnstns");
    }

    /* renamed from: a */
    public final boolean m883a() {
        return this.f1305J.m855g();
    }

    /* renamed from: b */
    public final boolean m884b() {
        if (this.f1305J.m855g() && this.f1306K.m995a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m885c() {
        hjf hjf = this.f1308b;
        boolean z = !hjf.m3195c() ? hjf.m3196d() : true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m886d() {
        return this.f1305J.m855g() && this.f1307a.m954a(this.f1304I);
    }
}
