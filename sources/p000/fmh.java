package p000;

import android.annotation.TargetApi;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: fmh */
final class fmh implements bbf {
    /* renamed from: a */
    private final fjl f21380a;

    fmh(fjl fjl) {
        this.f21380a = fjl;
    }

    public final void close() {
        this.f21380a.close();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private final p000.fkp m15705d() {
        /*
        r6 = this;
        r1 = 1;
        r0 = r6.f21380a;
        r0 = r0.mo2649a();
        r0 = (p000.fjj) r0;
        r2 = r0.mo3041a();	 Catch:{ all -> 0x004d }
        if (r2 != 0) goto L_0x0028;
    L_0x000f:
        r1 = new fkp;	 Catch:{ all -> 0x004d }
        r2 = new iux;	 Catch:{ all -> 0x004d }
        r4 = r0.mo3044e();	 Catch:{ all -> 0x004d }
        r2.<init>(r4);	 Catch:{ all -> 0x004d }
        r3 = r0.mo3043d();	 Catch:{ all -> 0x004d }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x0026;
    L_0x0023:
        r0.close();
    L_0x0026:
        r0 = r1;
    L_0x0027:
        return r0;
    L_0x0028:
        r2 = r0.mo3041a();	 Catch:{ all -> 0x004d }
        if (r2 != r1) goto L_0x004b;
    L_0x002e:
        p000.jri.m13153b(r1);	 Catch:{ all -> 0x004d }
        r2 = new fkp;	 Catch:{ all -> 0x004d }
        r1 = r0.mo3045f();	 Catch:{ all -> 0x004d }
        r1 = p000.jri.m13152b(r1);	 Catch:{ all -> 0x004d }
        r1 = (p000.iwz) r1;	 Catch:{ all -> 0x004d }
        r3 = r0.mo3043d();	 Catch:{ all -> 0x004d }
        r2.<init>(r1, r3);	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x0049;
    L_0x0046:
        r0.close();
    L_0x0049:
        r0 = r2;
        goto L_0x0027;
    L_0x004b:
        r1 = 0;
        goto L_0x002e;
    L_0x004d:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x004f }
    L_0x004f:
        r2 = move-exception;
        if (r0 == 0) goto L_0x0055;
    L_0x0052:
        r0.close();	 Catch:{ all -> 0x0056 }
    L_0x0055:
        throw r2;
    L_0x0056:
        r0 = move-exception;
        p000.kqg.m5044a(r1, r0);
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: fmh.d():fkp");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2649a() {
        return m15705d();
    }

    /* renamed from: b */
    public final boolean mo2650b() {
        return this.f21380a.mo2650b();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo2651c() {
        boolean z = true;
        fjj fjj = (fjj) this.f21380a.mo2651c();
        if (fjj == null) {
            return null;
        }
        if (fjj.mo3041a() == 0) {
            fjj.close();
            return null;
        }
        if (fjj.mo3041a() != 1) {
            z = false;
        }
        jri.m13153b(z);
        return new fkp((iwz) jri.m13152b(fjj.mo3045f()), fjj.mo3043d());
    }
}
