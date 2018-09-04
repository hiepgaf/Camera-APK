package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: esd */
public class esd implements etc {
    /* renamed from: a */
    public static final String f15443a = bli.m862a("MVCtrlImpl");
    /* renamed from: b */
    public final Executor f15444b;
    /* renamed from: c */
    public final gsi f15445c;
    /* renamed from: d */
    public final gsl f15446d;
    /* renamed from: e */
    public final euh f15447e;
    /* renamed from: f */
    public final Map f15448f = new ConcurrentHashMap();
    /* renamed from: g */
    public final Object f15449g = new Object();
    /* renamed from: h */
    public volatile ezj f15450h = ezj.TRIMMING_MODE_AUTO;
    /* renamed from: i */
    public long f15451i;
    /* renamed from: j */
    public long f15452j = Long.MAX_VALUE;
    /* renamed from: k */
    public List f15453k = new ArrayList();
    /* renamed from: l */
    public volatile eth f15454l = null;
    /* renamed from: m */
    private final Executor f15455m;
    /* renamed from: n */
    private final gtf f15456n;
    /* renamed from: o */
    private final Context f15457o;
    /* renamed from: p */
    private final ikd f15458p;
    /* renamed from: q */
    private final ilp f15459q;
    /* renamed from: r */
    private volatile esu f15460r = null;

    public esd(Executor executor, Executor executor2, gsi gsi, gsl gsl, gtf gtf, Context context, euh euh, ikd ikd, ilp ilp) {
        this.f15447e = euh;
        this.f15445c = gsi;
        this.f15446d = gsl;
        this.f15456n = gtf;
        this.f15457o = context;
        this.f15444b = (Executor) jri.m13152b((Object) executor);
        this.f15455m = (Executor) jri.m13152b((Object) executor2);
        this.f15458p = ikd;
        this.f15459q = ilp;
    }

    /* renamed from: a */
    public final void mo1282a(esu esu) {
        this.f15460r = esu;
    }

    /* renamed from: a */
    public final synchronized void mo1283a(eth eth) {
        if (this.f15454l == null) {
            this.f15454l = eth;
        } else {
            bli.m873e(f15443a, "Cannot attach UI controller when already attached!");
        }
    }

    /* renamed from: b */
    public final void mo1287b(esu esu) {
        if (esu != this.f15460r) {
            bli.m873e(f15443a, "Detaching perOneCamera resources that were not up to date");
        }
        esu.f4211a.mo1307a();
        this.f15460r = null;
        synchronized (this.f15449g) {
            this.f15451i = 0;
        }
    }

    /* renamed from: b */
    public final synchronized void mo1288b(eth eth) {
        if (this.f15454l == eth) {
            this.f15454l = null;
        } else {
            bli.m873e(f15443a, "Cannot detach UI controller. Values mismatch.");
        }
    }

    /* renamed from: a */
    public final kpk mo1278a(Uri uri, InputStream inputStream, kbg kbg, String str, String str2, grg grg) {
        eto.m2112a();
        File a = this.f15456n.m2811a(str, ixx.JPEG);
        File a2 = this.f15456n.m2811a(str2, ixx.JPEG);
        String str3 = f15443a;
        String valueOf = String.valueOf(uri);
        String valueOf2 = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length());
        stringBuilder.append("Finishing microvideo for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" as ");
        stringBuilder.append(valueOf2);
        bli.m863a(str3, stringBuilder.toString());
        eso eso = (eso) this.f15448f.remove(uri);
        if (eso == null) {
            str3 = f15443a;
            valueOf = String.valueOf(uri);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder2.append("No in-flight session found for ");
            stringBuilder2.append(valueOf);
            bli.m863a(str3, stringBuilder2.toString());
            try {
                grg.mo1523b(this.f15445c.mo1613a(a2, inputStream, kbg));
                return kow.m13617a((Object) a2);
            } catch (Throwable e) {
                return kow.m13618a(e);
            }
        }
        str3 = f15443a;
        valueOf = String.valueOf(uri);
        StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf).length() + 17);
        stringBuilder3.append("finishMicrovideo ");
        stringBuilder3.append(valueOf);
        bli.m863a(str3, stringBuilder3.toString());
        File a3 = this.f15456n.m2810a(str2);
        try {
            InputStream a4 = esw.m2097a(this.f15445c, this.f15446d, inputStream, a3, kbg);
            kpk d = kpw.m18056d();
            eso.f4205a.f15558e.mo1985a(new esi(eso, d), kpq.f8410a);
            kpk a5 = ezu.m2204a(kny.m18045a(d, new esj(this, eso, a3, a2, grg, a, kbg, a4), this.f15455m), 15000, new Handler(Looper.getMainLooper()));
            a5.mo1985a(new esk(this, eso, grg), this.f15444b);
            a5 = kni.m18040a(a5, Throwable.class, new esl(this, grg, eso, a3, a2, str2), this.f15444b);
            a5.mo1985a(new esm(this, a3, eso), this.f15444b);
            return a5;
        } catch (Throwable e2) {
            return kow.m13618a(e2);
        }
    }

    /* renamed from: a */
    public final kbg mo1277a(long j) {
        if (this.f15460r == null) {
            return kau.f19138a;
        }
        iwz iwz = (iwz) this.f15460r.f4213c.mo1313a(j);
        if (iwz != null) {
            return kbg.m4744b(iwz);
        }
        return kau.f19138a;
    }

    /* renamed from: a */
    public final boolean mo1286a() {
        return this.f15460r != null;
    }

    /* renamed from: b */
    public final synchronized boolean mo1289b() {
        boolean z;
        gon a = gon.m2661a(((Integer) this.f15459q.mo2860b()).intValue());
        z = a == gon.MICRO_AUTO || a == gon.MICRO_ON;
        return z;
    }

    /* renamed from: a */
    final /* synthetic */ File m9877a(grg grg, eso eso, File file, File file2, String str, Throwable th) {
        bli.m867b(f15443a, "Error while saving microvideo: ", th);
        klg klg = new klg();
        klg.f22349e = false;
        klg.f22351g = esd.m9873b(eso.f4210f);
        grg.mo1519a(klg);
        try {
            this.f15446d.mo1617a(file, file2);
            String str2 = f15443a;
            String str3 = "Saved fallback image to: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m863a(str2, valueOf);
            return file2;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m9872a(eso eso, kpw kpw) {
        if (eso.f4205a.f15558e.isCancelled()) {
            kpw.mo3557a((Object) esd.class);
        } else {
            kpw.mo3616b(eso.f4205a.f15558e);
        }
    }

    /* renamed from: a */
    final /* synthetic */ java.io.File m9876a(p000.eso r9, java.io.File r10, java.io.File r11, p000.grg r12, java.io.File r13, p000.kbg r14, java.io.InputStream r15) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:esd.a(eso, java.io.File, java.io.File, grg, java.io.File, kbg, java.io.InputStream):java.io.File. bs: [B:1:0x0002, B:31:0x010b]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
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
        r8 = this;
        if (r9 != 0) goto L_0x0011;
    L_0x0002:
        r0 = new java.lang.AssertionError;	 Catch:{ IOException -> 0x000a }
        r1 = "inFlightSession should not be null";	 Catch:{ IOException -> 0x000a }
        r0.<init>(r1);	 Catch:{ IOException -> 0x000a }
        throw r0;	 Catch:{ IOException -> 0x000a }
    L_0x000a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0011:
        r0 = r9.f4205a;	 Catch:{ IOException -> 0x000a }
        r0 = r0.f15558e;	 Catch:{ IOException -> 0x000a }
        r0 = r0.isCancelled();	 Catch:{ IOException -> 0x000a }
        if (r0 == 0) goto L_0x005b;	 Catch:{ IOException -> 0x000a }
    L_0x001b:
        r0 = r8.f15446d;	 Catch:{ IOException -> 0x000a }
        r0.mo1617a(r10, r11);	 Catch:{ IOException -> 0x000a }
        r0 = f15443a;	 Catch:{ IOException -> 0x000a }
        r1 = java.lang.String.valueOf(r11);	 Catch:{ IOException -> 0x000a }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x000a }
        r2 = r2.length();	 Catch:{ IOException -> 0x000a }
        r2 = r2 + 50;	 Catch:{ IOException -> 0x000a }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x000a }
        r3.<init>(r2);	 Catch:{ IOException -> 0x000a }
        r2 = "Microvideo cancelled, moving tmp file into place: ";	 Catch:{ IOException -> 0x000a }
        r3.append(r2);	 Catch:{ IOException -> 0x000a }
        r3.append(r1);	 Catch:{ IOException -> 0x000a }
        r1 = r3.toString();	 Catch:{ IOException -> 0x000a }
        p000.bli.m863a(r0, r1);	 Catch:{ IOException -> 0x000a }
        r0 = new klg;	 Catch:{ IOException -> 0x000a }
        r0.<init>();	 Catch:{ IOException -> 0x000a }
        r1 = 0;	 Catch:{ IOException -> 0x000a }
        r0.f22349e = r1;	 Catch:{ IOException -> 0x000a }
        r1 = 1;	 Catch:{ IOException -> 0x000a }
        r0.f22350f = r1;	 Catch:{ IOException -> 0x000a }
        r1 = r9.f4210f;	 Catch:{ IOException -> 0x000a }
        r1 = p000.esd.m9873b(r1);	 Catch:{ IOException -> 0x000a }
        r0.f22351g = r1;	 Catch:{ IOException -> 0x000a }
        r12.mo1519a(r0);	 Catch:{ IOException -> 0x000a }
    L_0x005a:
        return r11;	 Catch:{ IOException -> 0x000a }
    L_0x005b:
        r0 = r8.f15445c;	 Catch:{ IOException -> 0x000a }
        r3 = r0.mo1615b(r13);	 Catch:{ IOException -> 0x000a }
        r0 = r14.mo2084b();	 Catch:{ all -> 0x0108 }
        if (r0 == 0) goto L_0x0105;	 Catch:{ all -> 0x0108 }
    L_0x0067:
        r0 = r14.mo2081a();	 Catch:{ all -> 0x0108 }
        r0 = (com.google.android.libraries.camera.exif.ExifInterface) r0;	 Catch:{ all -> 0x0108 }
        r0 = r0.m8481a(r3);	 Catch:{ all -> 0x0108 }
        r2 = r0;	 Catch:{ all -> 0x0108 }
    L_0x0072:
        r4 = r9.f4206b;	 Catch:{ all -> 0x0108 }
        r0 = r9.f4205a;	 Catch:{ all -> 0x0108 }
        r6 = r0.f15559f;	 Catch:{ Exception -> 0x010f }
        r0 = r0.f15560g;	 Catch:{ Exception -> 0x010f }
        r0 = p000.kow.m13623b(r0);	 Catch:{ Exception -> 0x010f }
        r0 = (java.lang.Long) r0;	 Catch:{ Exception -> 0x010f }
        r0 = r0.longValue();	 Catch:{ Exception -> 0x010f }
        r0 = r6 - r0;	 Catch:{ Exception -> 0x010f }
        r6 = 0;	 Catch:{ Exception -> 0x010f }
        r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));	 Catch:{ Exception -> 0x010f }
        if (r5 >= 0) goto L_0x00a5;	 Catch:{ Exception -> 0x010f }
    L_0x008c:
        r0 = f15443a;	 Catch:{ Exception -> 0x010f }
        r1 = "Negative shutter presentation timestamp detected (%d). Resetting to 0.";	 Catch:{ Exception -> 0x010f }
        r5 = 1;	 Catch:{ Exception -> 0x010f }
        r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x010f }
        r6 = 0;	 Catch:{ Exception -> 0x010f }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x010f }
        r7 = 0;	 Catch:{ Exception -> 0x010f }
        r5[r7] = r6;	 Catch:{ Exception -> 0x010f }
        r1 = java.lang.String.format(r1, r5);	 Catch:{ Exception -> 0x010f }
        p000.bli.m866b(r0, r1);	 Catch:{ Exception -> 0x010f }
        r0 = 0;	 Catch:{ Exception -> 0x010f }
    L_0x00a5:
        r5 = new iyy;	 Catch:{ Exception -> 0x010f }
        r5.<init>();	 Catch:{ Exception -> 0x010f }
        r5 = r5.mo1970b();	 Catch:{ Exception -> 0x010f }
        r0 = r5.mo1968a(r0);	 Catch:{ Exception -> 0x010f }
        r0 = r0.mo1969a(r15);	 Catch:{ Exception -> 0x010f }
        r0 = r0.mo1967a(r2);	 Catch:{ Exception -> 0x010f }
        r0 = r0.m12682a(r4);	 Catch:{ Exception -> 0x010f }
        r0 = r0.m12686a();	 Catch:{ Exception -> 0x010f }
        r0.call();	 Catch:{ Exception -> 0x010f }
        r3.close();	 Catch:{ IOException -> 0x000a }
        r0 = f15443a;	 Catch:{ IOException -> 0x000a }
        r1 = java.lang.String.valueOf(r13);	 Catch:{ IOException -> 0x000a }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x000a }
        r2 = r2.length();	 Catch:{ IOException -> 0x000a }
        r2 = r2 + 33;	 Catch:{ IOException -> 0x000a }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x000a }
        r3.<init>(r2);	 Catch:{ IOException -> 0x000a }
        r2 = "Successfully saved microvideo to ";	 Catch:{ IOException -> 0x000a }
        r3.append(r2);	 Catch:{ IOException -> 0x000a }
        r3.append(r1);	 Catch:{ IOException -> 0x000a }
        r1 = r3.toString();	 Catch:{ IOException -> 0x000a }
        p000.bli.m863a(r0, r1);	 Catch:{ IOException -> 0x000a }
        r0 = r13.length();	 Catch:{ IOException -> 0x000a }
        r12.mo1523b(r0);	 Catch:{ IOException -> 0x000a }
        p000.eto.m2112a();	 Catch:{ IOException -> 0x000a }
        p000.eto.m2115d();	 Catch:{ IOException -> 0x000a }
        p000.eto.m2115d();	 Catch:{ IOException -> 0x000a }
        p000.eto.m2115d();	 Catch:{ IOException -> 0x000a }
        p000.eto.m2115d();	 Catch:{ IOException -> 0x000a }
        r11 = r13;
        goto L_0x005a;
    L_0x0105:
        r2 = r3;
        goto L_0x0072;
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x010a }
    L_0x010a:
        r1 = move-exception;
        r3.close();	 Catch:{ all -> 0x0116 }
    L_0x010e:
        throw r1;	 Catch:{ IOException -> 0x000a }
    L_0x010f:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0108 }
        r1.<init>(r0);	 Catch:{ all -> 0x0108 }
        throw r1;	 Catch:{ all -> 0x0108 }
    L_0x0116:
        r2 = move-exception;
        p000.kqg.m5044a(r0, r2);	 Catch:{ IOException -> 0x000a }
        goto L_0x010e;
        */
        throw new UnsupportedOperationException("Method not decompiled: esd.a(eso, java.io.File, java.io.File, grg, java.io.File, kbg, java.io.InputStream):java.io.File");
    }

    /* renamed from: c */
    public final /* synthetic */ String m9891c() {
        String stringBuilder;
        synchronized (this.f15449g) {
            long j = this.f15451i;
            StringBuilder stringBuilder2 = new StringBuilder(74);
            stringBuilder2.append("current latest frame when notifyPossibleStart CROSS <");
            stringBuilder2.append(j);
            stringBuilder2.append(">");
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    /* renamed from: c */
    static final /* synthetic */ void m9874c(eth eth) {
        if (eth != null) {
            eth.mo3025b();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ String m9892d() {
        String stringBuilder;
        synchronized (this.f15449g) {
            long j = this.f15451i;
            StringBuilder stringBuilder2 = new StringBuilder(63);
            stringBuilder2.append("current latest frame when trimming CROSS <");
            stringBuilder2.append(j);
            stringBuilder2.append(">");
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    /* renamed from: e */
    static final /* synthetic */ void m9875e() {
        eto.m2112a();
        eto.m2115d();
    }

    /* renamed from: a */
    public final synchronized void mo1280a(Uri uri) {
        eso eso = (eso) this.f15448f.remove(uri);
        if (eso != null) {
            eso.f4205a.mo1290a();
            eso.f4205a.f15558e.mo1985a(new esh(this, eso), this.f15444b);
        }
        String str = f15443a;
        String valueOf = String.valueOf(uri.getPath());
        String str2 = "Cancellation ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m863a(str, valueOf);
    }

    /* renamed from: a */
    public final synchronized void mo1281a(Uri uri, int i, kpk kpk) {
        esu esu = this.f15460r;
        if (esu == null) {
            bli.m873e(f15443a, "Encoding not configured. Abandoning microvideo start.");
        } else {
            bli.m863a(f15443a, "notifyPossibleStart HLINE");
            if (mo1289b()) {
                long j;
                etd etd = new etd(this);
                eto.f4224a.clear();
                eto.f4225b.clear();
                eto.m2112a();
                this.f15458p.execute(new ese(this.f15454l));
                File file = new File(this.f15457o.getCacheDir(), String.valueOf(uri.getPath()).concat(".mp4"));
                synchronized (this.f15449g) {
                    j = this.f15451i;
                    this.f15453k.add(Long.valueOf(j));
                }
                this.f15444b.execute(new esg(this, esu, j, file, i, kpk, uri));
            }
        }
    }

    /* renamed from: a */
    public final void mo1279a(long j, esu esu) {
        if (this.f15460r != null && this.f15460r == esu) {
            synchronized (this.f15449g) {
                long convert = TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS);
                if (convert < this.f15451i) {
                    String str = f15443a;
                    long j2 = this.f15451i;
                    StringBuilder stringBuilder = new StringBuilder(75);
                    stringBuilder.append("Out of order timestamp ");
                    stringBuilder.append(convert);
                    stringBuilder.append(" came after ");
                    stringBuilder.append(j2);
                    bli.m866b(str, stringBuilder.toString());
                }
                this.f15451i = Math.max(this.f15451i, convert);
                esu esu2 = this.f15460r;
                if (esu2 != null && this.f15453k.isEmpty()) {
                    esu2.f4211a.mo1308a(this.f15451i - 1500000);
                }
                if (this.f15452j < this.f15451i) {
                    this.f15452j = Long.MAX_VALUE;
                    new ikd().execute(new esn(this));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1285a(boolean z) {
        esu esu = this.f15460r;
        if (esu != null) {
            esu.f4214d.m2135a(z);
        }
    }

    /* renamed from: a */
    public final void mo1284a(ezj ezj) {
        this.f15450h = ezj;
    }

    /* renamed from: b */
    static int m9873b(ezj ezj) {
        switch (ezj.ordinal()) {
            case 0:
                return 2;
            case 1:
                return 3;
            default:
                String valueOf = String.valueOf(ezj);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                stringBuilder.append("Unknown trimming mode: ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
        }
    }
}
