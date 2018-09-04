package p000;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.List;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: ciq */
public final class ciq implements chu {
    /* renamed from: a */
    private static /* synthetic */ void m8222a(Throwable th, kae kae) {
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static p000.com m8220a(p000.jmr r35, p000.jrg r36, p000.jrg r37, com.google.android.libraries.smartburst.buffers.FeatureTable r38, p000.jrg r39, android.content.Context r40, p000.jqo r41, p000.grw r42, java.util.UUID r43, p000.dpu r44, p000.kpk r45, p000.gkr r46, p000.gln r47, p000.cjn r48, int r49, boolean r50, p000.jyt r51, java.util.concurrent.ExecutorService r52, boolean r53, p000.gsp r54, p000.ird r55, p000.irs r56, p000.glj r57) {
        /*
        r1 = "PostProcessingTaskFactory#createPostProcessingTask";
        r0 = r55;
        r0.mo1903a(r1);
        r1 = p000.jqk.m13097b(r36);	 Catch:{ all -> 0x0127 }
        r32 = new jzy;	 Catch:{ all -> 0x0127 }
        r0 = r32;
        r0.<init>(r1);	 Catch:{ all -> 0x0127 }
        r1 = p000.jqk.m13097b(r37);	 Catch:{ all -> 0x012c }
        r33 = new jzy;	 Catch:{ all -> 0x012c }
        r0 = r33;
        r0.<init>(r1);	 Catch:{ all -> 0x012c }
        r1 = p000.jqk.m13097b(r39);	 Catch:{ all -> 0x0135 }
        r34 = new jzy;	 Catch:{ all -> 0x0135 }
        r0 = r34;
        r0.<init>(r1);	 Catch:{ all -> 0x0135 }
        r1 = new jms;	 Catch:{ all -> 0x013e }
        r1.<init>();	 Catch:{ all -> 0x013e }
        r2 = r35.m4593a();	 Catch:{ all -> 0x013e }
        if (r2 == 0) goto L_0x0122;
    L_0x0033:
        r4 = p000.jiu.f7856a;	 Catch:{ all -> 0x013e }
    L_0x0035:
        r2 = r40;
        r3 = r35;
        r5 = r52;
        r6 = r41;
        p000.jqk.m13093a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x013e }
        r9 = p000.kow.m13625c(r45);	 Catch:{ all -> 0x013e }
        r9 = (java.io.File) r9;	 Catch:{ all -> 0x013e }
        r2 = p000.jrg.class;
        r3 = "default";
        r2 = r1.m4599b(r2, r3);	 Catch:{ all -> 0x013e }
        r3 = new jql;	 Catch:{ all -> 0x013e }
        r0 = r36;
        r3.<init>(r0);	 Catch:{ all -> 0x013e }
        r2.m4601a(r3);	 Catch:{ all -> 0x013e }
        r2 = com.google.android.libraries.smartburst.buffers.FeatureTable.class;
        r3 = "default";
        r2 = r1.m4599b(r2, r3);	 Catch:{ all -> 0x013e }
        r3 = new jqm;	 Catch:{ all -> 0x013e }
        r0 = r38;
        r3.<init>(r0);	 Catch:{ all -> 0x013e }
        r2.m4601a(r3);	 Catch:{ all -> 0x013e }
        if (r50 == 0) goto L_0x0071;
    L_0x006c:
        r0 = r51;
        p000.jqk.m13094a(r1, r0);	 Catch:{ all -> 0x013e }
    L_0x0071:
        r2 = p000.jmr.FIXED_FPS;	 Catch:{ all -> 0x013e }
        r0 = r35;
        if (r0 != r2) goto L_0x00b8;
    L_0x0077:
        r1 = new cod;	 Catch:{ all -> 0x013e }
        r2 = r34.mo3190d();	 Catch:{ all -> 0x013e }
        r2 = (p000.jrg) r2;	 Catch:{ all -> 0x013e }
        r7 = r32.mo3190d();	 Catch:{ all -> 0x013e }
        r7 = (p000.jrg) r7;	 Catch:{ all -> 0x013e }
        r8 = r33.mo3190d();	 Catch:{ all -> 0x013e }
        r8 = (p000.jrg) r8;	 Catch:{ all -> 0x013e }
        r3 = r49;
        r4 = r48;
        r5 = r46;
        r6 = r47;
        r10 = r41;
        r11 = r42;
        r12 = r52;
        r13 = r44;
        r14 = r43;
        r15 = r54;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x013e }
        r2 = 0;
        r0 = r34;
        p000.ciq.m8222a(r2, r0);	 Catch:{ all -> 0x0135 }
        r2 = 0;
        r0 = r33;
        p000.ciq.m8222a(r2, r0);	 Catch:{ all -> 0x012c }
        r2 = 0;
        r0 = r32;
        p000.ciq.m8222a(r2, r0);	 Catch:{ all -> 0x0127 }
        r55.mo1904b();
    L_0x00b7:
        return r1;
    L_0x00b8:
        r2 = p000.jsb.class;
        r3 = "default";
        r11 = r1.m4595a(r2, r3);	 Catch:{ all -> 0x013e }
        r11 = (p000.jsb) r11;	 Catch:{ all -> 0x013e }
        r2 = p000.jjd.class;
        r3 = "default";
        r13 = r1.m4595a(r2, r3);	 Catch:{ all -> 0x013e }
        r13 = (p000.jjd) r13;	 Catch:{ all -> 0x013e }
        r2 = p000.jsw.class;
        r3 = "default";
        r12 = r1.m4595a(r2, r3);	 Catch:{ all -> 0x013e }
        r12 = (p000.jsw) r12;	 Catch:{ all -> 0x013e }
        r10 = new cnq;	 Catch:{ all -> 0x013e }
        r14 = r34.mo3190d();	 Catch:{ all -> 0x013e }
        r14 = (p000.jrg) r14;	 Catch:{ all -> 0x013e }
        r19 = r32.mo3190d();	 Catch:{ all -> 0x013e }
        r19 = (p000.jrg) r19;	 Catch:{ all -> 0x013e }
        r20 = r33.mo3190d();	 Catch:{ all -> 0x013e }
        r20 = (p000.jrg) r20;	 Catch:{ all -> 0x013e }
        r15 = r49;
        r16 = r48;
        r17 = r46;
        r18 = r47;
        r21 = r9;
        r22 = r41;
        r23 = r42;
        r24 = r52;
        r25 = r44;
        r26 = r43;
        r27 = r53;
        r28 = r54;
        r29 = r55;
        r30 = r56;
        r31 = r57;
        r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);	 Catch:{ all -> 0x013e }
        r1 = 0;
        r0 = r34;
        p000.ciq.m8222a(r1, r0);	 Catch:{ all -> 0x0135 }
        r1 = 0;
        r0 = r33;
        p000.ciq.m8222a(r1, r0);	 Catch:{ all -> 0x012c }
        r1 = 0;
        r0 = r32;
        p000.ciq.m8222a(r1, r0);	 Catch:{ all -> 0x0127 }
        r55.mo1904b();
        r1 = r10;
        goto L_0x00b7;
    L_0x0122:
        r2 = 0;
        r4 = new java.lang.String[r2];	 Catch:{ all -> 0x013e }
        goto L_0x0035;
    L_0x0127:
        r1 = move-exception;
        r55.mo1904b();
        throw r1;
    L_0x012c:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x012e }
    L_0x012e:
        r2 = move-exception;
        r0 = r32;
        p000.ciq.m8222a(r1, r0);	 Catch:{ all -> 0x0127 }
        throw r2;	 Catch:{ all -> 0x0127 }
    L_0x0135:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0137 }
    L_0x0137:
        r2 = move-exception;
        r0 = r33;
        p000.ciq.m8222a(r1, r0);	 Catch:{ all -> 0x012c }
        throw r2;	 Catch:{ all -> 0x012c }
    L_0x013e:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0140 }
    L_0x0140:
        r2 = move-exception;
        r0 = r34;
        p000.ciq.m8222a(r1, r0);	 Catch:{ all -> 0x0135 }
        throw r2;	 Catch:{ all -> 0x0135 }
        */
        throw new UnsupportedOperationException("Method not decompiled: ciq.a(jmr, jrg, jrg, com.google.android.libraries.smartburst.buffers.FeatureTable, jrg, android.content.Context, jqo, grw, java.util.UUID, dpu, kpk, gkr, gln, cjn, int, boolean, jyt, java.util.concurrent.ExecutorService, boolean, gsp, ird, irs, glj):com");
    }

    /* renamed from: a */
    public final Surface mo688a() {
        return null;
    }

    /* renamed from: a */
    public final void mo691a(SurfaceTexture surfaceTexture, List list, fyy fyy) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    /* renamed from: b */
    public final ilp mo693b() {
        return ilq.m3818a(Boolean.valueOf(true));
    }

    /* renamed from: a */
    static ilp m8221a(ilp ilp, fbr fbr) {
        return new civ(ilp, fbr);
    }

    /* renamed from: c */
    public final void mo694c() {
    }

    /* renamed from: a */
    public final void mo692a(chv chv) {
    }

    /* renamed from: a */
    public final kpk mo690a(chw chw, gks gks, gln gln, iqm iqm, iut iut, int i, bcy bcy, cjo cjo, iqp iqp) {
        return kow.m13617a(Boolean.FALSE);
    }

    /* renamed from: a */
    public final kpk mo689a(chw chw) {
        return kow.m13617a(Boolean.FALSE);
    }
}
