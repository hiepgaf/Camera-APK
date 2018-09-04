package p000;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Deque;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: evb */
public final class evb implements eux {
    /* renamed from: a */
    public final Object f15593a = new Object();
    /* renamed from: b */
    public final kpw f15594b = kpw.m18056d();
    /* renamed from: c */
    public final evm f15595c;
    /* renamed from: d */
    public final Handler f15596d;
    /* renamed from: e */
    public final Deque f15597e = new ArrayDeque();
    /* renamed from: f */
    public volatile jgb f15598f;
    /* renamed from: g */
    public boolean f15599g = false;
    /* renamed from: h */
    public boolean f15600h = false;
    /* renamed from: i */
    private eva f15601i;
    /* renamed from: j */
    private euz f15602j;
    /* renamed from: k */
    private final MediaFormat f15603k;
    /* renamed from: l */
    private final etf f15604l;

    /* renamed from: a */
    private static /* synthetic */ void m9972a(Throwable th, iwz iwz) {
        if (th != null) {
            try {
                iwz.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        iwz.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m9973a(Throwable th, jfx jfx) {
        if (th != null) {
            try {
                jfx.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        jfx.close();
    }

    public evb(MediaFormat mediaFormat, etf etf, evm evm, iuw iuw, Handler handler) {
        this.f15603k = mediaFormat;
        this.f15604l = etf;
        this.f15595c = evm;
        this.f15596d = handler;
    }

    public final void close() {
        if (this.f15598f != null) {
            this.f15594b.mo1985a(new evf(this), kpq.f8410a);
        } else {
            this.f15596d.getLooper().quitSafely();
        }
    }

    /* renamed from: d */
    private final void m9974d() {
        this.f15600h = false;
        this.f15601i.m2142a();
    }

    /* renamed from: a */
    public final void mo1297a(jgd jgd, euz euz, eva eva) {
        this.f15601i = eva;
        this.f15602j = euz;
        this.f15598f = jgd.m4461a(this.f15603k).mo1994a(this.f15596d).mo1995a(new evj(this)).mo1993a();
    }

    /* renamed from: b */
    public final void mo1298b() {
        this.f15596d.post(new eve(this));
    }

    /* renamed from: c */
    public final void mo1299c() {
        this.f15596d.post(new evc(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m9975a() {
        /*
        r13 = this;
        r1 = 1;
        r12 = 0;
        r0 = java.lang.Thread.currentThread();
        r2 = r0.getId();
        r0 = r13.f15596d;
        r0 = r0.getLooper();
        r0 = r0.getThread();
        r4 = r0.getId();
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r0 = "VideoTrackSampler";
        r2 = "Sampling video on a non-video-encoder thread";
        p000.bli.m873e(r0, r2);
    L_0x0023:
        r2 = r13.f15593a;
        monitor-enter(r2);
        r0 = r13.f15598f;	 Catch:{ all -> 0x015f }
        r3 = r13.f15602j;	 Catch:{ all -> 0x015f }
        if (r0 == 0) goto L_0x0032;
    L_0x002c:
        if (r3 == 0) goto L_0x0032;
    L_0x002e:
        r0 = r13.f15600h;	 Catch:{ all -> 0x015f }
        if (r0 != 0) goto L_0x0034;
    L_0x0032:
        monitor-exit(r2);	 Catch:{ all -> 0x015f }
    L_0x0033:
        return;
    L_0x0034:
        monitor-exit(r2);	 Catch:{ all -> 0x015f }
        r0 = r13.f15597e;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0033;
    L_0x003d:
        r0 = r13.f15604l;
        r0 = r0.f4216a;
        r0 = r0.mo1317c();
        r0 = (p000.iwz) r0;
        if (r0 != 0) goto L_0x005d;
    L_0x0049:
        r1 = r13.f15599g;	 Catch:{ all -> 0x00e9 }
        if (r1 == 0) goto L_0x0057;
    L_0x004d:
        r13.m9974d();	 Catch:{ all -> 0x00e9 }
        r1 = r13.f15594b;	 Catch:{ all -> 0x00e9 }
        r2 = p000.izg.f7590a;	 Catch:{ all -> 0x00e9 }
        r1.mo3557a(r2);	 Catch:{ all -> 0x00e9 }
    L_0x0057:
        if (r0 == 0) goto L_0x0033;
    L_0x0059:
        p000.evb.m9972a(r12, r0);
        goto L_0x0033;
    L_0x005d:
        r4 = r0.mo2719f();	 Catch:{ all -> 0x00e9 }
        r2 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ all -> 0x00e9 }
        r6 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x00e9 }
        r6 = r2.convert(r4, r6);	 Catch:{ all -> 0x00e9 }
        r2 = r3.mo1309b(r6);	 Catch:{ all -> 0x00e9 }
        r3 = p000.euy.ENCODE;	 Catch:{ all -> 0x00e9 }
        r3 = r2.equals(r3);	 Catch:{ all -> 0x00e9 }
        if (r3 != 0) goto L_0x007e;
    L_0x0075:
        r3 = p000.euy.ENCODE_AND_PAUSE;	 Catch:{ all -> 0x00e9 }
        r3 = r2.equals(r3);	 Catch:{ all -> 0x00e9 }
        if (r3 != 0) goto L_0x007e;
    L_0x007d:
        r1 = 0;
    L_0x007e:
        if (r1 == 0) goto L_0x0140;
    L_0x0080:
        r1 = new evg;	 Catch:{ all -> 0x00e9 }
        r1.<init>(r6);	 Catch:{ all -> 0x00e9 }
        r1 = r13.f15597e;	 Catch:{ all -> 0x00e9 }
        r1 = r1.pollFirst();	 Catch:{ all -> 0x00e9 }
        r1 = (p000.evl) r1;	 Catch:{ all -> 0x00e9 }
        r3 = "Got no input buffers after checking emptiness; is someone else removing them???";
        r1 = p000.jri.m13139a(r1, r3);	 Catch:{ all -> 0x00e9 }
        r1 = (p000.evl) r1;	 Catch:{ all -> 0x00e9 }
        r3 = r1.m2143a();	 Catch:{ all -> 0x00e9 }
        r8 = new itv;	 Catch:{ all -> 0x0137 }
        r1 = r3.mo1990a();	 Catch:{ all -> 0x0137 }
        r1 = (android.media.Image) r1;	 Catch:{ all -> 0x0137 }
        r8.<init>(r1);	 Catch:{ all -> 0x0137 }
        p000.iuw.m4258a(r0, r8);	 Catch:{ all -> 0x0137 }
        r3.mo1991a(r6);	 Catch:{ all -> 0x0137 }
        r1 = r13.f15595c;	 Catch:{ all -> 0x0137 }
        if (r1 != 0) goto L_0x00f2;
    L_0x00ae:
        r1 = "VideoTrackSampler";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0137 }
        r5 = 46;
        r4.<init>(r5);	 Catch:{ all -> 0x0137 }
        r5 = "actually encoding a frame ";
        r4.append(r5);	 Catch:{ all -> 0x0137 }
        r4.append(r6);	 Catch:{ all -> 0x0137 }
        r4 = r4.toString();	 Catch:{ all -> 0x0137 }
        p000.bli.m863a(r1, r4);	 Catch:{ all -> 0x0137 }
        if (r3 == 0) goto L_0x00cc;
    L_0x00c8:
        r1 = 0;
        p000.evb.m9973a(r1, r3);	 Catch:{ all -> 0x00e9 }
    L_0x00cc:
        r1 = p000.euy.ENCODE_AND_PAUSE;	 Catch:{ all -> 0x00e9 }
        r1 = r2.equals(r1);	 Catch:{ all -> 0x00e9 }
        if (r1 == 0) goto L_0x00de;
    L_0x00d4:
        r13.m9974d();	 Catch:{ all -> 0x00e9 }
    L_0x00d7:
        if (r0 == 0) goto L_0x0033;
    L_0x00d9:
        p000.evb.m9972a(r12, r0);
        goto L_0x0033;
    L_0x00de:
        r1 = r13.f15596d;	 Catch:{ all -> 0x00e9 }
        r2 = new evh;	 Catch:{ all -> 0x00e9 }
        r2.<init>(r13);	 Catch:{ all -> 0x00e9 }
        r1.post(r2);	 Catch:{ all -> 0x00e9 }
        goto L_0x00d7;
    L_0x00e9:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00eb }
    L_0x00eb:
        r2 = move-exception;
        if (r0 == 0) goto L_0x00f1;
    L_0x00ee:
        p000.evb.m9972a(r1, r0);
    L_0x00f1:
        throw r2;
    L_0x00f2:
        r8 = r1.f4274b;	 Catch:{ all -> 0x0137 }
        r9 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ all -> 0x0137 }
        r10 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x0137 }
        r10 = r9.convert(r4, r10);	 Catch:{ all -> 0x0137 }
        r9 = new euk;	 Catch:{ all -> 0x0137 }
        r9.<init>(r10);	 Catch:{ all -> 0x0137 }
        r9 = r8.f15563a;	 Catch:{ all -> 0x0137 }
        if (r9 == 0) goto L_0x0122;
    L_0x0105:
        r9 = r8.f15564b;	 Catch:{ all -> 0x0137 }
        if (r9 == 0) goto L_0x0122;
    L_0x0109:
        p000.eto.m2112a();	 Catch:{ all -> 0x0137 }
        r9 = r8.f15563a;	 Catch:{ all -> 0x0137 }
        r4 = r9.m9985a(r4, r10);	 Catch:{ all -> 0x0137 }
        p000.eto.m2112a();	 Catch:{ all -> 0x0137 }
        p000.eto.m2115d();	 Catch:{ all -> 0x0137 }
        r5 = new eul;	 Catch:{ all -> 0x0137 }
        r5.<init>(r8);	 Catch:{ all -> 0x0137 }
        r8 = r8.f15565c;	 Catch:{ all -> 0x0137 }
        p000.kow.m13622a(r4, r5, r8);	 Catch:{ all -> 0x0137 }
    L_0x0122:
        r4 = r1.f4275c;	 Catch:{ all -> 0x0137 }
        r4 = r4.mo2084b();	 Catch:{ all -> 0x0137 }
        if (r4 == 0) goto L_0x00ae;
    L_0x012a:
        r1 = r1.f4275c;	 Catch:{ all -> 0x0137 }
        r1 = r1.mo2081a();	 Catch:{ all -> 0x0137 }
        r1 = (p000.ets) r1;	 Catch:{ all -> 0x0137 }
        r1.m9926a();	 Catch:{ all -> 0x0137 }
        goto L_0x00ae;
    L_0x0137:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0139 }
    L_0x0139:
        r2 = move-exception;
        if (r3 == 0) goto L_0x013f;
    L_0x013c:
        p000.evb.m9973a(r1, r3);	 Catch:{ all -> 0x00e9 }
    L_0x013f:
        throw r2;	 Catch:{ all -> 0x00e9 }
    L_0x0140:
        r1 = "VideoTrackSampler";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e9 }
        r4 = 46;
        r3.<init>(r4);	 Catch:{ all -> 0x00e9 }
        r4 = "Dropping starting frame <";
        r3.append(r4);	 Catch:{ all -> 0x00e9 }
        r3.append(r6);	 Catch:{ all -> 0x00e9 }
        r4 = ">";
        r3.append(r4);	 Catch:{ all -> 0x00e9 }
        r3 = r3.toString();	 Catch:{ all -> 0x00e9 }
        p000.bli.m863a(r1, r3);	 Catch:{ all -> 0x00e9 }
        goto L_0x00cc;
    L_0x015f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x015f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: evb.a():void");
    }
}
