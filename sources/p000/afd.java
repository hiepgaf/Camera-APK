package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: afd */
public final class afd implements afb, ary, Comparable, Runnable {
    /* renamed from: A */
    private Object f9670A;
    /* renamed from: B */
    private adf f9671B;
    /* renamed from: C */
    private adw f9672C;
    /* renamed from: D */
    private volatile boolean f9673D;
    /* renamed from: a */
    public final afc f9674a = new afc();
    /* renamed from: b */
    public final afg f9675b;
    /* renamed from: c */
    public final aff f9676c = new aff();
    /* renamed from: d */
    public final afh f9677d = new afh();
    /* renamed from: e */
    public ace f9678e;
    /* renamed from: f */
    public adl f9679f;
    /* renamed from: g */
    public acg f9680g;
    /* renamed from: h */
    public agc f9681h;
    /* renamed from: i */
    public int f9682i;
    /* renamed from: j */
    public int f9683j;
    /* renamed from: k */
    public afm f9684k;
    /* renamed from: l */
    public adp f9685l;
    /* renamed from: m */
    public afe f9686m;
    /* renamed from: n */
    public int f9687n;
    /* renamed from: o */
    public afi f9688o;
    /* renamed from: p */
    public boolean f9689p;
    /* renamed from: q */
    public adl f9690q;
    /* renamed from: r */
    public volatile afa f9691r;
    /* renamed from: s */
    public volatile boolean f9692s;
    /* renamed from: t */
    private final List f9693t = new ArrayList();
    /* renamed from: u */
    private final asa f9694u = asa.m667a();
    /* renamed from: v */
    private final iw f9695v;
    /* renamed from: w */
    private afj f9696w;
    /* renamed from: x */
    private long f9697x;
    /* renamed from: y */
    private Thread f9698y;
    /* renamed from: z */
    private adl f9699z;

    afd(afg afg, iw iwVar) {
        this.f9675b = afg;
        this.f9695v = iwVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x000e in list [B:6:0x000b]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/224100622.run(Unknown Source)
*/
        /*
        r7 = this;
        r1 = r7.f9672C;
        r0 = r7.f9692s;	 Catch:{ all -> 0x003f, all -> 0x008c }
        if (r0 == 0) goto L_0x000f;	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x0006:
        r7.m6354f();	 Catch:{ all -> 0x003f, all -> 0x008c }
        if (r1 == 0) goto L_0x000e;
    L_0x000b:
        r1.mo26c();
    L_0x000e:
        return;
    L_0x000f:
        r0 = r7.f9688o;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r0 = r0.ordinal();	 Catch:{ all -> 0x003f, all -> 0x008c }
        switch(r0) {
            case 0: goto L_0x00a1;
            case 1: goto L_0x009d;
            case 2: goto L_0x0093;
            default: goto L_0x0018;
        };	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x0018:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r2 = r7.f9688o;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r3 = r3.length();	 Catch:{ all -> 0x003f, all -> 0x008c }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r3 = r3 + 25;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r4.<init>(r3);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r3 = "Unrecognized run reason: ";	 Catch:{ all -> 0x003f, all -> 0x008c }
        r4.append(r3);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r4.append(r2);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r2 = r4.toString();	 Catch:{ all -> 0x003f, all -> 0x008c }
        r0.<init>(r2);	 Catch:{ all -> 0x003f, all -> 0x008c }
        throw r0;	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x003f:
        r0 = move-exception;
        r2 = "DecodeJob";	 Catch:{ all -> 0x003f, all -> 0x008c }
        r3 = 3;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ all -> 0x003f, all -> 0x008c }
        if (r2 == 0) goto L_0x0079;	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x0049:
        r2 = "DecodeJob";	 Catch:{ all -> 0x003f, all -> 0x008c }
        r3 = r7.f9692s;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r4 = r7.f9696w;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r5 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r5 = r5.length();	 Catch:{ all -> 0x003f, all -> 0x008c }
        r5 = r5 + 57;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r6.<init>(r5);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r5 = "DecodeJob threw unexpectedly, isCancelled: ";	 Catch:{ all -> 0x003f, all -> 0x008c }
        r6.append(r5);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r6.append(r3);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r3 = ", stage: ";	 Catch:{ all -> 0x003f, all -> 0x008c }
        r6.append(r3);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r6.append(r4);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r3 = r6.toString();	 Catch:{ all -> 0x003f, all -> 0x008c }
        android.util.Log.d(r2, r3, r0);	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x0079:
        r2 = r7.f9696w;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r3 = p000.afj.ENCODE;	 Catch:{ all -> 0x003f, all -> 0x008c }
        if (r2 == r3) goto L_0x0087;	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x007f:
        r2 = r7.f9693t;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r2.add(r0);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r7.m6354f();	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x0087:
        r2 = r7.f9692s;	 Catch:{ all -> 0x003f, all -> 0x008c }
        if (r2 != 0) goto L_0x00b3;	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x008b:
        throw r0;	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0092;
    L_0x008f:
        r1.mo26c();
    L_0x0092:
        throw r0;
    L_0x0093:
        r7.m6352d();	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x0096:
        if (r1 == 0) goto L_0x000e;
    L_0x0098:
        r1.mo26c();
        goto L_0x000e;
    L_0x009d:
        r7.m6355g();	 Catch:{ all -> 0x003f, all -> 0x008c }
        goto L_0x0096;	 Catch:{ all -> 0x003f, all -> 0x008c }
    L_0x00a1:
        r0 = p000.afj.INITIALIZE;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r0 = r7.m6357a(r0);	 Catch:{ all -> 0x003f, all -> 0x008c }
        r7.f9696w = r0;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r0 = r7.m6353e();	 Catch:{ all -> 0x003f, all -> 0x008c }
        r7.f9691r = r0;	 Catch:{ all -> 0x003f, all -> 0x008c }
        r7.m6355g();	 Catch:{ all -> 0x003f, all -> 0x008c }
        goto L_0x0096;
    L_0x00b3:
        if (r1 == 0) goto L_0x000e;
    L_0x00b5:
        r1.mo26c();
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: afd.run():void");
    }

    public final /* synthetic */ int compareTo(Object obj) {
        afd afd = (afd) obj;
        int ordinal = this.f9680g.ordinal() - afd.f9680g.ordinal();
        if (ordinal == 0) {
            return this.f9687n - afd.f9687n;
        }
        return ordinal;
    }

    /* renamed from: a */
    private final agn m6349a(adw adw, Object obj, adf adf) {
        agn agn = null;
        if (obj != null) {
            try {
                long a = arm.m630a();
                agn = m6350a(obj, adf, this.f9674a.m204a(obj.getClass()));
                if (Log.isLoggable("DecodeJob", 2)) {
                    String valueOf = String.valueOf(agn);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15);
                    stringBuilder.append("Decoded result ");
                    stringBuilder.append(valueOf);
                    m6351a(stringBuilder.toString(), a, null);
                }
                adw.mo26c();
            } catch (Throwable th) {
                adw.mo26c();
            }
        } else {
            adw.mo26c();
        }
        return agn;
    }

    /* renamed from: d */
    private final void m6352d() {
        agn a;
        aff aff;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f9697x;
            String valueOf = String.valueOf(this.f9670A);
            String valueOf2 = String.valueOf(this.f9690q);
            String valueOf3 = String.valueOf(this.f9672C);
            int length = String.valueOf(valueOf).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 30) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
            stringBuilder.append("data: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", cache key: ");
            stringBuilder.append(valueOf2);
            stringBuilder.append(", fetcher: ");
            stringBuilder.append(valueOf3);
            m6351a("Retrieved data", j, stringBuilder.toString());
        }
        try {
            a = m6349a(this.f9672C, this.f9670A, this.f9671B);
        } catch (agg e) {
            e.m237a(this.f9699z, this.f9671B, null);
            this.f9693t.add(e);
            a = null;
        }
        if (a != null) {
            agl a2;
            adf adf = this.f9671B;
            if (a instanceof agi) {
                ((agi) a).mo103a();
            }
            if (this.f9676c.m213a()) {
                a2 = agl.m6406a(a);
                a = a2;
            } else {
                a2 = null;
            }
            m6356h();
            this.f9686m.mo54a(a, adf);
            this.f9696w = afj.ENCODE;
            try {
                if (this.f9676c.m213a()) {
                    aff = this.f9676c;
                    this.f9675b.m214a().mo80a(aff.f386a, new aho(aff.f387b, aff.f388c, this.f9685l));
                    aff.f388c.m6412f();
                }
                if (a2 != null) {
                    a2.m6412f();
                }
                if (this.f9677d.m216a()) {
                    m6361b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.m6412f();
                }
            }
        } else {
            m6355g();
        }
    }

    /* renamed from: e */
    private final afa m6353e() {
        switch (this.f9696w.ordinal()) {
            case 1:
                return new ago(this.f9674a, this);
            case 2:
                return new aey(this.f9674a, this);
            case 3:
                return new ags(this.f9674a, this);
            case 5:
                return null;
            default:
                String valueOf = String.valueOf(this.f9696w);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("Unrecognized stage: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final afj m6357a(afj afj) {
        switch (afj.ordinal()) {
            case 0:
                if (this.f9684k.mo46b()) {
                    return afj.RESOURCE_CACHE;
                }
                return m6357a(afj.RESOURCE_CACHE);
            case 1:
                if (this.f9684k.mo43a()) {
                    return afj.DATA_CACHE;
                }
                return m6357a(afj.DATA_CACHE);
            case 2:
                return !this.f9689p ? afj.SOURCE : afj.FINISHED;
            case 3:
            case 5:
                return afj.FINISHED;
            default:
                String valueOf = String.valueOf(afj);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("Unrecognized stage: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final asa mo39a() {
        return this.f9694u;
    }

    /* renamed from: a */
    private final void m6351a(String str, long j, String str2) {
        String valueOf;
        String str3;
        double a = arm.m629a(j);
        String valueOf2 = String.valueOf(this.f9681h);
        if (str2 != null) {
            valueOf = String.valueOf(str2);
            str3 = ", ";
            valueOf = valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
        } else {
            valueOf = "";
        }
        str3 = Thread.currentThread().getName();
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 50) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(a);
        stringBuilder.append(", load key: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(valueOf);
        stringBuilder.append(", thread: ");
        stringBuilder.append(str3);
        Log.v("DecodeJob", stringBuilder.toString());
    }

    /* renamed from: f */
    private final void m6354f() {
        m6356h();
        this.f9686m.mo53a(new agg("Failed to load resource", new ArrayList(this.f9693t)));
        if (this.f9677d.m217b()) {
            m6361b();
        }
    }

    /* renamed from: a */
    public final void mo40a(adl adl, Exception exception, adw adw, adf adf) {
        adw.mo26c();
        agg agg = new agg("Fetching data failed", (Throwable) exception);
        agg.m237a(adl, adf, adw.mo33a());
        this.f9693t.add(agg);
        if (Thread.currentThread() != this.f9698y) {
            this.f9688o = afi.SWITCH_TO_SOURCE_SERVICE;
            this.f9686m.mo52a(this);
            return;
        }
        m6355g();
    }

    /* renamed from: a */
    public final void mo41a(adl adl, Object obj, adw adw, adf adf, adl adl2) {
        this.f9690q = adl;
        this.f9670A = obj;
        this.f9672C = adw;
        this.f9671B = adf;
        this.f9699z = adl2;
        if (Thread.currentThread() != this.f9698y) {
            this.f9688o = afi.DECODE_DATA;
            this.f9686m.mo52a(this);
            return;
        }
        m6352d();
    }

    /* renamed from: b */
    final void m6361b() {
        this.f9677d.m219d();
        aff aff = this.f9676c;
        aff.f386a = null;
        aff.f387b = null;
        aff.f388c = null;
        afc afc = this.f9674a;
        afc.f370c = null;
        afc.f371d = null;
        afc.f381n = null;
        afc.f374g = null;
        afc.f378k = null;
        afc.f376i = null;
        afc.f382o = null;
        afc.f377j = null;
        afc.f383p = null;
        afc.f368a.clear();
        afc.f379l = false;
        afc.f369b.clear();
        afc.f380m = false;
        this.f9673D = false;
        this.f9678e = null;
        this.f9679f = null;
        this.f9685l = null;
        this.f9680g = null;
        this.f9681h = null;
        this.f9686m = null;
        this.f9696w = null;
        this.f9691r = null;
        this.f9698y = null;
        this.f9690q = null;
        this.f9670A = null;
        this.f9671B = null;
        this.f9672C = null;
        this.f9697x = 0;
        this.f9692s = false;
        this.f9693t.clear();
        this.f9695v.mo342a(this);
    }

    /* renamed from: c */
    public final void mo42c() {
        this.f9688o = afi.SWITCH_TO_SOURCE_SERVICE;
        this.f9686m.mo52a(this);
    }

    /* renamed from: g */
    private final void m6355g() {
        this.f9698y = Thread.currentThread();
        this.f9697x = arm.m630a();
        boolean z = false;
        while (!this.f9692s && this.f9691r != null) {
            z = this.f9691r.mo38b();
            if (z) {
                break;
            }
            this.f9696w = m6357a(this.f9696w);
            this.f9691r = m6353e();
            if (this.f9696w == afj.SOURCE) {
                mo42c();
                return;
            }
        }
        if ((this.f9696w == afj.FINISHED || this.f9692s) && !r0) {
            m6354f();
        }
    }

    /* renamed from: a */
    private final agn m6350a(Object obj, adf adf, agk agk) {
        adp adp = this.f9685l;
        if (adp.m6303a(amm.f529b) == null && (adf == adf.RESOURCE_DISK_CACHE || this.f9674a.f385r)) {
            adp = new adp();
            adp.m6304a(this.f9685l);
            adp.m6302a(amm.f529b, Boolean.valueOf(true));
        }
        ady a = this.f9678e.f211d.f228c.m187a(obj);
        try {
            agn a2 = agk.m243a(a, adp, this.f9682i, this.f9683j, new afl(this, adf));
            return a2;
        } finally {
            a.mo31a();
        }
    }

    /* renamed from: h */
    private final void m6356h() {
        this.f9694u.mo344b();
        if (this.f9673D) {
            throw new IllegalStateException("Already notified");
        }
        this.f9673D = true;
    }
}
