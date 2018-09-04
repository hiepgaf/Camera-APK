package p000;

/* compiled from: PG */
/* renamed from: dir */
final class dir implements kov {
    /* renamed from: a */
    private final /* synthetic */ hkv f13420a;
    /* renamed from: b */
    private final /* synthetic */ boolean f13421b;
    /* renamed from: c */
    private final /* synthetic */ din f13422c;

    dir(din din, hkv hkv, boolean z) {
        this.f13422c = din;
        this.f13420a = hkv;
        this.f13421b = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo349a(java.lang.Throwable r8) {
        /*
        r7 = this;
        r1 = p000.din.f21031a;
        r2 = "CamcorderDevice#createCaptureSession onFailure";
        p000.bli.m867b(r1, r2, r8);
        r1 = r7.f13422c;
        r2 = r1.f21040I;
        monitor-enter(r2);
        r1 = r7.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r1.f21041J;	 Catch:{ all -> 0x0041 }
        r3 = p000.dis.CLOSED;	 Catch:{ all -> 0x0041 }
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0041 }
        if (r1 == 0) goto L_0x0021;
    L_0x0018:
        r1 = p000.din.f21031a;	 Catch:{ all -> 0x0041 }
        r3 = "Abort the video startup sequence. (state=CLOSED)";
        p000.bli.m869c(r1, r3);	 Catch:{ all -> 0x0041 }
        monitor-exit(r2);	 Catch:{ all -> 0x0041 }
    L_0x0020:
        return;
    L_0x0021:
        r1 = r7.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r1.f21066n;	 Catch:{ all -> 0x0041 }
        r1.close();	 Catch:{ all -> 0x0041 }
        r1 = r7.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r1.f21041J;	 Catch:{ all -> 0x0041 }
        r3 = p000.dis.CREATING_SESSION;	 Catch:{ all -> 0x0041 }
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0041 }
        p000.jri.m13143a(r1);	 Catch:{ all -> 0x0041 }
        r1 = r7.f13422c;	 Catch:{ all -> 0x0041 }
        r3 = p000.dis.NO_SESSION;	 Catch:{ all -> 0x0041 }
        r1.f21041J = r3;	 Catch:{ all -> 0x0041 }
        r1 = r8 instanceof p000.isg;	 Catch:{ all -> 0x0041 }
        if (r1 != 0) goto L_0x0044;
    L_0x003f:
        monitor-exit(r2);	 Catch:{ all -> 0x0041 }
        goto L_0x0020;
    L_0x0041:
        r1 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0041 }
        throw r1;
    L_0x0044:
        r3 = p000.din.f21031a;	 Catch:{ all -> 0x0041 }
        r1 = r7.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r1.f21078z;	 Catch:{ all -> 0x0041 }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0041 }
        r0 = r8;
        r0 = (p000.isg) r0;	 Catch:{ all -> 0x0041 }
        r1 = r0;
        r1 = r1.f7387a;	 Catch:{ all -> 0x0041 }
        r5 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0041 }
        r5 = r5.length();	 Catch:{ all -> 0x0041 }
        r5 = r5 + 52;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0041 }
        r6.<init>(r5);	 Catch:{ all -> 0x0041 }
        r5 = "Camera device ";
        r6.append(r5);	 Catch:{ all -> 0x0041 }
        r6.append(r4);	 Catch:{ all -> 0x0041 }
        r4 = " has experienced an error: ";
        r6.append(r4);	 Catch:{ all -> 0x0041 }
        r6.append(r1);	 Catch:{ all -> 0x0041 }
        r1 = r6.toString();	 Catch:{ all -> 0x0041 }
        p000.bli.m866b(r3, r1);	 Catch:{ all -> 0x0041 }
        r1 = r7.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r1.f21045N;	 Catch:{ all -> 0x0041 }
        r1.mo2693a(r8);	 Catch:{ all -> 0x0041 }
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: dir.a(java.lang.Throwable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void b_(java.lang.Object r28) {
        /*
        r27 = this;
        r28 = (p000.kbg) r28;
        r0 = r27;
        r1 = r0.f13422c;
        r0 = r1.f21040I;
        r25 = r0;
        monitor-enter(r25);
        r1 = r28.mo2084b();	 Catch:{ all -> 0x0041 }
        if (r1 != 0) goto L_0x001a;
    L_0x0011:
        r1 = p000.din.f21031a;	 Catch:{ all -> 0x0041 }
        r2 = "CamcorderCaptureSession-creation task was aborted with non-fatal reasons.";
        p000.bli.m866b(r1, r2);	 Catch:{ all -> 0x0041 }
        monitor-exit(r25);	 Catch:{ all -> 0x0041 }
    L_0x0019:
        return;
    L_0x001a:
        r1 = p000.din.f21031a;	 Catch:{ all -> 0x0041 }
        r2 = "CamcorderCaptureSession-creation task is done successfully.";
        p000.bli.m869c(r1, r2);	 Catch:{ all -> 0x0041 }
        r2 = r28.mo2081a();	 Catch:{ all -> 0x0041 }
        r2 = (p000.bdy) r2;	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r1 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r1.f21041J;	 Catch:{ all -> 0x0041 }
        r3 = p000.dis.CLOSED;	 Catch:{ all -> 0x0041 }
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0041 }
        if (r1 == 0) goto L_0x0044;
    L_0x0035:
        r1 = p000.din.f21031a;	 Catch:{ all -> 0x0041 }
        r3 = "Abort the video startup sequence. (state=CLOSED)";
        p000.bli.m869c(r1, r3);	 Catch:{ all -> 0x0041 }
        r2.close();	 Catch:{ all -> 0x0041 }
        monitor-exit(r25);	 Catch:{ all -> 0x0041 }
        goto L_0x0019;
    L_0x0041:
        r1 = move-exception;
        monitor-exit(r25);	 Catch:{ all -> 0x0041 }
        throw r1;
    L_0x0044:
        r0 = r27;
        r1 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r1.f21076x;	 Catch:{ all -> 0x0041 }
        r1 = r1.m3875c();	 Catch:{ all -> 0x0041 }
        if (r1 != 0) goto L_0x0192;
    L_0x0050:
        r1 = 0;
    L_0x0051:
        r0 = r27;
        r3 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r4 = r3.f21069q;	 Catch:{ all -> 0x0041 }
        r3 = r3.f21054b;	 Catch:{ all -> 0x0041 }
        r3 = r3.f1113a;	 Catch:{ all -> 0x0041 }
        r4.mo3017a(r1, r3);	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r3 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r3 = r3.f21038G;	 Catch:{ all -> 0x0041 }
        r3.f4995m = r1;	 Catch:{ all -> 0x0041 }
        r1 = r3.f4985c;	 Catch:{ all -> 0x0041 }
        r1 = r1.mo2860b();	 Catch:{ all -> 0x0041 }
        r1 = (p000.hhx) r1;	 Catch:{ all -> 0x0041 }
        r3.m2460a(r1);	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r1 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r1.f21041J;	 Catch:{ all -> 0x0041 }
        r3 = p000.dis.CREATING_SESSION;	 Catch:{ all -> 0x0041 }
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0041 }
        p000.jri.m13143a(r1);	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r1 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r3 = p000.dis.SESSION_ACTIVE;	 Catch:{ all -> 0x0041 }
        r1.f21041J = r3;	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r1 = r0.f13420a;	 Catch:{ all -> 0x0041 }
        r1 = r1.f6321g;	 Catch:{ all -> 0x0041 }
        r1.m9623o();	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r1 = r0.f13420a;	 Catch:{ all -> 0x0041 }
        r1 = r1.f6321g;	 Catch:{ all -> 0x0041 }
        r1.m9617g();	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r1 = r0.f13420a;	 Catch:{ all -> 0x0041 }
        r3 = 0;
        r1.m3242e(r3);	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r4 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r4.f21073u;	 Catch:{ all -> 0x0041 }
        r3 = r4.f21054b;	 Catch:{ all -> 0x0041 }
        r3 = r3.f1113a;	 Catch:{ all -> 0x0041 }
        r4 = r4.f21055c;	 Catch:{ all -> 0x0041 }
        r4 = r4.mo2681b();	 Catch:{ all -> 0x0041 }
        r5 = p000.kau.f19138a;	 Catch:{ all -> 0x0041 }
        r6 = 0;
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x0041 }
        r6 = p000.ilq.m3818a(r6);	 Catch:{ all -> 0x0041 }
        r22 = r1.mo354a(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r0 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r26 = r0;
        r1 = new dix;	 Catch:{ all -> 0x0041 }
        r0 = r26;
        r3 = r0.f21057e;	 Catch:{ all -> 0x0041 }
        r0 = r26;
        r4 = r0.f21060h;	 Catch:{ all -> 0x0041 }
        r0 = r26;
        r5 = r0.f21058f;	 Catch:{ all -> 0x0041 }
        r6 = r26.f21046O;	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r8 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r7 = r8.f21059g;	 Catch:{ all -> 0x0041 }
        r8 = r8.f21047P;	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r0 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r18 = r0;
        r0 = r18;
        r9 = r0.f21061i;	 Catch:{ all -> 0x0041 }
        r0 = r18;
        r10 = r0.f21062j;	 Catch:{ all -> 0x0041 }
        r0 = r18;
        r11 = r0.f21063k;	 Catch:{ all -> 0x0041 }
        r0 = r18;
        r12 = r0.f21064l;	 Catch:{ all -> 0x0041 }
        r0 = r18;
        r13 = r0.f21065m;	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r14 = r0.f13420a;	 Catch:{ all -> 0x0041 }
        r0 = r18;
        r15 = r0.f21066n;	 Catch:{ all -> 0x0041 }
        r0 = r18;
        r0 = r0.f21067o;	 Catch:{ all -> 0x0041 }
        r16 = r0;
        r0 = r18;
        r0 = r0.f21068p;	 Catch:{ all -> 0x0041 }
        r17 = r0;
        r18 = r18.f21048Q;	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r0 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r24 = r0;
        r0 = r24;
        r0 = r0.f21070r;	 Catch:{ all -> 0x0041 }
        r19 = r0;
        r0 = r24;
        r0 = r0.f21071s;	 Catch:{ all -> 0x0041 }
        r20 = r0;
        r0 = r24;
        r0 = r0.f21072t;	 Catch:{ all -> 0x0041 }
        r21 = r0;
        r0 = r24;
        r0 = r0.f21074v;	 Catch:{ all -> 0x0041 }
        r23 = r0;
        r0 = r24;
        r0 = r0.f21043L;	 Catch:{ all -> 0x0041 }
        r24 = r0;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ all -> 0x0041 }
        r0 = r26;
        r0.f21042K = r1;	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r1 = r0.f13420a;	 Catch:{ all -> 0x0041 }
        r1 = r1.f6321g;	 Catch:{ all -> 0x0041 }
        r2 = 1;
        r1.m9611c(r2);	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r1 = r0.f13420a;	 Catch:{ all -> 0x0041 }
        p000.ebd.m9598i();	 Catch:{ all -> 0x0041 }
        r2 = r1.f6321g;	 Catch:{ all -> 0x0041 }
        r2.m9618h();	 Catch:{ all -> 0x0041 }
        r2 = r1.f6321g;	 Catch:{ all -> 0x0041 }
        r2.m9609c();	 Catch:{ all -> 0x0041 }
        r2 = r1.f6319e;	 Catch:{ all -> 0x0041 }
        r3 = 1;
        r2.setClickable(r3);	 Catch:{ all -> 0x0041 }
        r2 = r1.f6322h;	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x0182;
    L_0x0165:
        r2 = r2.isShowing();	 Catch:{ all -> 0x0041 }
        if (r2 != 0) goto L_0x0182;
    L_0x016b:
        r2 = r1.f6322h;	 Catch:{ all -> 0x0041 }
        r2.show();	 Catch:{ all -> 0x0041 }
        r1 = r1.f6322h;	 Catch:{ all -> 0x0041 }
        r2 = 16908299; // 0x102000b float:2.387726E-38 double:8.3538097E-317;
        r1 = r1.findViewById(r2);	 Catch:{ all -> 0x0041 }
        r1 = (android.widget.TextView) r1;	 Catch:{ all -> 0x0041 }
        r2 = android.text.method.LinkMovementMethod.getInstance();	 Catch:{ all -> 0x0041 }
        r1.setMovementMethod(r2);	 Catch:{ all -> 0x0041 }
    L_0x0182:
        r0 = r27;
        r1 = r0.f13421b;	 Catch:{ all -> 0x0041 }
        if (r1 == 0) goto L_0x018f;
    L_0x0188:
        r0 = r27;
        r1 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r1.mo2968c();	 Catch:{ all -> 0x0041 }
    L_0x018f:
        monitor-exit(r25);	 Catch:{ all -> 0x0041 }
        goto L_0x0019;
    L_0x0192:
        r0 = r27;
        r1 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r1 = r1.f21054b;	 Catch:{ all -> 0x0041 }
        r3 = p000.inc.FPS_60;	 Catch:{ all -> 0x0041 }
        r0 = r27;
        r4 = r0.f13422c;	 Catch:{ all -> 0x0041 }
        r4 = r4.f21077y;	 Catch:{ all -> 0x0041 }
        r1 = r1.m805a(r3, r4);	 Catch:{ all -> 0x0041 }
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: dir.b_(java.lang.Object):void");
    }
}
