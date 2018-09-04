package p000;

import android.annotation.TargetApi;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: coh */
final class coh {
    /* renamed from: a */
    public final Executor f2229a;
    /* renamed from: b */
    public final izi f2230b = new coi();
    /* renamed from: c */
    private final UUID f2231c;
    /* renamed from: d */
    private final List f2232d;
    /* renamed from: e */
    private final dpu f2233e;
    /* renamed from: f */
    private final cny f2234f;

    coh(List list, UUID uuid, dpu dpu, Executor executor, cny cny) {
        this.f2232d = list;
        this.f2233e = dpu;
        this.f2231c = uuid;
        this.f2229a = executor;
        this.f2234f = cny;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final java.util.List m1213a(p000.jrg r15, p000.ipz r16, int r17) {
        /*
        r14 = this;
        r9 = new java.util.ArrayList;
        r2 = r15.m13136f();
        r9.<init>(r2);
        r2 = r15.m13135e();
        r10 = r2.iterator();
    L_0x0011:
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x0118;
    L_0x0017:
        r2 = r10.next();
        r2 = (java.lang.Long) r2;
        r2 = r2.longValue();
        r2 = r15.m13127a(r2);	 Catch:{ jra -> 0x0052 }
        r2 = p000.jli.m12951c(r2);	 Catch:{ jra -> 0x0052 }
        r0 = r2;
        r0 = (p000.kah) r0;	 Catch:{ jra -> 0x0052 }
        r8 = r0;
        r2 = r8.mo3191e();	 Catch:{ all -> 0x0049 }
        r2 = (p000.ckn) r2;	 Catch:{ all -> 0x0049 }
        r2 = r2.f12109b;	 Catch:{ all -> 0x0049 }
        if (r2 == 0) goto L_0x0081;
    L_0x0037:
        r2 = r8.mo3191e();	 Catch:{ all -> 0x0049 }
        r2 = (p000.ckn) r2;	 Catch:{ all -> 0x0049 }
        r3 = r2.f12109b;	 Catch:{ all -> 0x0049 }
        if (r3 != 0) goto L_0x0054;
    L_0x0041:
        r2 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0049 }
        r3 = "Attempting to get disk image, which is in memory!";
        r2.<init>(r3);	 Catch:{ all -> 0x0049 }
        throw r2;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x004b }
    L_0x004b:
        r3 = move-exception;
        if (r8 == 0) goto L_0x0051;
    L_0x004e:
        r8.close();	 Catch:{ all -> 0x0112 }
    L_0x0051:
        throw r3;	 Catch:{ jra -> 0x0052 }
    L_0x0052:
        r2 = move-exception;
        goto L_0x0011;
    L_0x0054:
        r2 = r3.f1995b;	 Catch:{ all -> 0x0049 }
        r2 = p000.kow.m13625c(r2);	 Catch:{ all -> 0x0049 }
        r2 = (java.io.File) r2;	 Catch:{ all -> 0x0049 }
        r2 = p000.cny.m1205a(r2);	 Catch:{ all -> 0x0049 }
        r4 = r3.f1994a;	 Catch:{ all -> 0x0049 }
        r3 = new cok;	 Catch:{ all -> 0x0049 }
        r6 = new kab;	 Catch:{ all -> 0x0049 }
        r2 = p000.jqk.m13097b(r2);	 Catch:{ all -> 0x0049 }
        r6.<init>(r2);	 Catch:{ all -> 0x0049 }
        r2 = p000.jqk.m13089a(r6);	 Catch:{ all -> 0x0049 }
        r3.<init>(r2, r4);	 Catch:{ all -> 0x0049 }
        r2 = p000.jli.m12948b(r3);	 Catch:{ all -> 0x0049 }
    L_0x0078:
        r9.add(r2);	 Catch:{ all -> 0x0049 }
        if (r8 == 0) goto L_0x0011;
    L_0x007d:
        r8.close();	 Catch:{ jra -> 0x0052 }
        goto L_0x0011;
    L_0x0081:
        r2 = r8.mo3190d();	 Catch:{ all -> 0x0049 }
        r2 = (p000.ckn) r2;	 Catch:{ all -> 0x0049 }
        r3 = r2.f12108a;	 Catch:{ all -> 0x0049 }
        if (r3 != 0) goto L_0x0093;
    L_0x008b:
        r2 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0049 }
        r3 = "Attempting to get memory image, which is on disk!";
        r2.<init>(r3);	 Catch:{ all -> 0x0049 }
        throw r2;	 Catch:{ all -> 0x0049 }
    L_0x0093:
        r2 = r3.mo2715b();	 Catch:{ all -> 0x0049 }
        r0 = r16;
        r4 = r0.m4022a(r2);	 Catch:{ all -> 0x0049 }
        r6 = r3.mo2719f();	 Catch:{ all -> 0x0049 }
        r2 = r14.f2232d;	 Catch:{ all -> 0x0049 }
        r11 = r2.iterator();	 Catch:{ all -> 0x0049 }
    L_0x00a7:
        r2 = r11.hasNext();	 Catch:{ all -> 0x0049 }
        if (r2 != 0) goto L_0x00cb;
    L_0x00ad:
        r2 = new java.util.NoSuchElementException;	 Catch:{ all -> 0x0049 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r4 = 56;
        r3.<init>(r4);	 Catch:{ all -> 0x0049 }
        r4 = "StackFrame for timestamp ";
        r3.append(r4);	 Catch:{ all -> 0x0049 }
        r3.append(r6);	 Catch:{ all -> 0x0049 }
        r4 = " not found.";
        r3.append(r4);	 Catch:{ all -> 0x0049 }
        r3 = r3.toString();	 Catch:{ all -> 0x0049 }
        r2.<init>(r3);	 Catch:{ all -> 0x0049 }
        throw r2;	 Catch:{ all -> 0x0049 }
    L_0x00cb:
        r2 = r11.next();	 Catch:{ all -> 0x0049 }
        r0 = r2;
        r0 = (p000.coq) r0;	 Catch:{ all -> 0x0049 }
        r5 = r0;
        r12 = r5.f2519a;	 Catch:{ all -> 0x0049 }
        r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r2 != 0) goto L_0x00a7;
    L_0x00d9:
        r11 = new bdb;	 Catch:{ all -> 0x0049 }
        r2 = r14.f2231c;	 Catch:{ all -> 0x0049 }
        r6 = r5.f2523e;	 Catch:{ all -> 0x0049 }
        r11.<init>(r2, r6);	 Catch:{ all -> 0x0049 }
        r2 = r14.f2233e;	 Catch:{ all -> 0x0049 }
        r6 = r5.f2521c;	 Catch:{ all -> 0x0049 }
        r7 = new coj;	 Catch:{ all -> 0x0049 }
        r12 = r5.f2526h;	 Catch:{ all -> 0x0049 }
        r5 = r5.f2525g;	 Catch:{ all -> 0x0049 }
        r13 = r14.f2234f;	 Catch:{ all -> 0x0049 }
        r7.<init>(r12, r11, r5, r13);	 Catch:{ all -> 0x0049 }
        r5 = r17;
        r2 = r2.m1667a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0049 }
        r2 = p000.jli.m12940a(r2);	 Catch:{ all -> 0x0049 }
        r4 = r3.mo2719f();	 Catch:{ all -> 0x0049 }
        r3 = r14.f2229a;	 Catch:{ all -> 0x0049 }
        p000.jri.m13152b(r2);	 Catch:{ all -> 0x0049 }
        p000.jri.m13152b(r3);	 Catch:{ all -> 0x0049 }
        r6 = new col;	 Catch:{ all -> 0x0049 }
        r6.<init>(r4);	 Catch:{ all -> 0x0049 }
        r2 = r2.mo1973a(r3, r6);	 Catch:{ all -> 0x0049 }
        goto L_0x0078;
    L_0x0112:
        r4 = move-exception;
        p000.kqg.m5044a(r2, r4);	 Catch:{ jra -> 0x0052 }
        goto L_0x0051;
    L_0x0118:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: coh.a(jrg, ipz, int):java.util.List");
    }
}
