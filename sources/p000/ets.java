package p000;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Handler;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: ets */
public final class ets implements eux {
    /* renamed from: a */
    private final MediaFormat f15532a;
    /* renamed from: b */
    private final Handler f15533b;
    /* renamed from: c */
    private final exb f15534c;
    /* renamed from: d */
    private etu f15535d;

    public ets(MediaFormat mediaFormat, exb exb, Handler handler) {
        this.f15532a = mediaFormat;
        this.f15533b = handler;
        this.f15534c = exb;
    }

    public final void close() {
        this.f15533b.getLooper().quitSafely();
    }

    /* renamed from: a */
    public final synchronized void mo1297a(jgd jgd, euz euz, eva eva) {
        boolean z;
        if (this.f15535d == null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Trying to initialize more than one time");
        this.f15535d = new etu(jgd.m4461a(this.f15532a).mo1994a(this.f15533b).mo1995a(new ett()).mo1993a(), euz, eva);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized boolean m9926a() {
        /*
        r6 = this;
        r0 = 0;
        r5 = 0;
        monitor-enter(r6);
        r2 = r6.f15535d;	 Catch:{ all -> 0x001c }
        p000.jri.m13152b(r2);	 Catch:{ all -> 0x001c }
        r1 = r2.f4229a;	 Catch:{ all -> 0x001c }
        if (r1 != 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r6);
        return r5;
    L_0x000e:
        r1 = r1.f18765a;	 Catch:{ all -> 0x001c }
        r3 = r1.f7784d;	 Catch:{ all -> 0x001c }
        if (r3 == 0) goto L_0x001f;
    L_0x0014:
        r0 = new java.lang.AssertionError;	 Catch:{ all -> 0x001c }
        r1 = "MediaCodec configured to use input surface. Should not be requesting for a byte buffer";
        r0.<init>(r1);	 Catch:{ all -> 0x001c }
        throw r0;	 Catch:{ all -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x001f:
        r3 = r1.m4453a();	 Catch:{ all -> 0x001c }
        if (r3 >= 0) goto L_0x002e;
    L_0x0025:
        r1 = r0;
    L_0x0026:
        if (r1 != 0) goto L_0x003f;
    L_0x0028:
        if (r1 == 0) goto L_0x000c;
    L_0x002a:
        r1.close();	 Catch:{ all -> 0x001c }
        goto L_0x000c;
    L_0x002e:
        r4 = r1.f7781a;	 Catch:{ all -> 0x001c }
        r4 = r4.getInputBuffer(r3);	 Catch:{ all -> 0x001c }
        if (r4 != 0) goto L_0x0038;
    L_0x0036:
        r1 = r0;
        goto L_0x0026;
    L_0x0038:
        r0 = new jfr;	 Catch:{ all -> 0x001c }
        r0.<init>(r1, r4, r3);	 Catch:{ all -> 0x001c }
        r1 = r0;
        goto L_0x0026;
    L_0x003f:
        r0 = r2.f4230b;	 Catch:{ all -> 0x0049 }
        r0 = r6.f15534c;	 Catch:{ all -> 0x0049 }
        r0 = new java.lang.NoSuchMethodError;	 Catch:{ all -> 0x0049 }
        r0.<init>();	 Catch:{ all -> 0x0049 }
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004b }
    L_0x004b:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0051;
    L_0x004e:
        r1.close();	 Catch:{ all -> 0x0052 }
    L_0x0051:
        throw r2;	 Catch:{ all -> 0x001c }
    L_0x0052:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);	 Catch:{ all -> 0x001c }
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: ets.a():boolean");
    }

    /* renamed from: b */
    public final void mo1298b() {
    }

    /* renamed from: c */
    public final synchronized void mo1299c() {
        Object obj = this.f15535d;
        jri.m13152b(obj);
        obj.f4231c.m2142a();
    }
}
