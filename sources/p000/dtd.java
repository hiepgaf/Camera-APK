package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.params.Face;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.FrameRequestVector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: dtd */
final class dtd {
    /* renamed from: a */
    private final ird f3303a;
    /* renamed from: b */
    private final iqz f3304b;
    /* renamed from: c */
    private final bym f3305c;
    /* renamed from: d */
    private final bya f3306d;

    /* renamed from: a */
    private static /* synthetic */ void m1680a(Throwable th, fko fko) {
        if (th != null) {
            try {
                fko.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fko.close();
    }

    dtd(ird ird, ira ira, bym bym, bya bya) {
        this.f3303a = ird;
        this.f3305c = bym;
        this.f3306d = bya;
        this.f3304b = ira.mo511a("HdrPBurstTkr");
    }

    /* renamed from: a */
    private final void m1679a(byx byx, int i, int i2, iwp iwp) {
        iqz iqz = this.f3304b;
        int i3 = byx.f1718a;
        StringBuilder stringBuilder = new StringBuilder(73);
        stringBuilder.append("Marking frame ");
        stringBuilder.append(i + 1);
        stringBuilder.append(" of ");
        stringBuilder.append(i2);
        stringBuilder.append(" as invalid for shot ");
        stringBuilder.append(i3);
        stringBuilder.append(".");
        iqz.mo520f(stringBuilder.toString());
        this.f3305c.mo615a(byx, i, iwp, null, null, null);
    }

    /* renamed from: a */
    private final iwp m1677a(byx byx, int i, int i2, fko fko, HashMap hashMap, Face[] faceArr) {
        fkp fkp;
        Throwable e;
        ird ird = this.f3303a;
        int i3 = i + 1;
        StringBuilder stringBuilder = new StringBuilder(29);
        stringBuilder.append("Frame");
        stringBuilder.append(i3);
        stringBuilder.append("of");
        stringBuilder.append(i2);
        ird.mo1903a(stringBuilder.toString());
        try {
            fkp = (fkp) fko.mo2649a();
            try {
                Object h = fkp.m17318h();
                jri.m13152b(h);
                iwp iwp = (iwp) h.get();
                if (fkp.m17319i()) {
                    this.f3305c.mo615a(byx, i, iwp, (iwz) fkp, (fkp) hashMap.remove(Long.valueOf(fkp.mo2719f())), faceArr);
                    this.f3304b.mo518d(String.format(null, "Acquired frame %d of %d for shot %d at time %d.", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(byx.f1718a), Long.valueOf(fkp.mo2719f())}));
                } else {
                    fkp.close();
                    this.f3304b.mo520f(String.format(null, "Payload frame %d of %d for shot %d at time %d did not contain a valid image! Marking frame as invalid.", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(byx.f1718a), Long.valueOf(fkp.mo2719f())}));
                    this.f3305c.mo615a(byx, i, iwp, null, null, null);
                }
                this.f3303a.mo1904b();
                return iwp;
            } catch (ExecutionException e2) {
                e = e2;
                try {
                    this.f3304b.mo515b(String.format(null, "Could not acquire frame %d of %d for shot %d!", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(byx.f1718a)}), e);
                    fkp.close();
                    throw new isr(e);
                } catch (Throwable th) {
                    this.f3303a.mo1904b();
                }
            } catch (InterruptedException e3) {
                e = e3;
                this.f3304b.mo515b(String.format(null, "Could not acquire frame %d of %d for shot %d!", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(byx.f1718a)}), e);
                if (fkp != null) {
                    fkp.close();
                }
                throw e;
            }
        } catch (ExecutionException e4) {
            e = e4;
            fkp = null;
            this.f3304b.mo515b(String.format(null, "Could not acquire frame %d of %d for shot %d!", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(byx.f1718a)}), e);
            fkp.close();
            throw new isr(e);
        } catch (InterruptedException e5) {
            e = e5;
            fkp = null;
            this.f3304b.mo515b(String.format(null, "Could not acquire frame %d of %d for shot %d!", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(byx.f1718a)}), e);
            if (fkp != null) {
                fkp.close();
            }
            throw e;
        }
    }

    /* renamed from: a */
    private final HashMap m1678a(fko fko, int i) {
        fkp fkp;
        HashMap hashMap = new HashMap();
        this.f3303a.mo1903a("HdrPlus#pdDataPayload");
        for (int i2 = 0; i2 < i; i2++) {
            try {
                fkp = (fkp) fko.mo2649a();
                try {
                    if (fkp.m17319i()) {
                        hashMap.put(Long.valueOf(fkp.mo2719f()), fkp);
                    } else {
                        fkp.close();
                    }
                } catch (isr e) {
                    if (fkp == null) {
                        fkp.close();
                    }
                } catch (InterruptedException e2) {
                    if (fkp == null) {
                        fkp.close();
                    }
                }
            } catch (isr e3) {
                fkp = null;
                if (fkp == null) {
                    fkp.close();
                }
            } catch (InterruptedException e4) {
                fkp = null;
                if (fkp == null) {
                    fkp.close();
                }
            }
        }
        this.f3303a.mo1904b();
        return hashMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final com.google.googlex.gcam.BurstSpec m1682a(p000.byx r7, p000.fio r8, p000.fmg r9, p000.fhh r10) {
        /*
        r6 = this;
        r0 = r6.f3303a;
        r1 = r7.f1718a;
        r2 = new java.lang.StringBuilder;
        r3 = 26;
        r2.<init>(r3);
        r3 = "HdrPlusMetering";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.mo1903a(r1);
        r0 = r6.f3305c;
        r0 = r0.mo611a(r7);
        r2 = r0.getFrame_requests();
        r0 = r2.size();
        r0 = (int) r0;
        r1 = r6.f3304b;
        r3 = new java.lang.StringBuilder;
        r4 = 40;
        r3.<init>(r4);
        r4 = "Metering burst frame count = ";
        r3.append(r4);
        r3.append(r0);
        r3 = r3.toString();
        r1.mo514b(r3);
        r4 = r9.m2336a(r0);	 Catch:{ all -> 0x0057 }
        r0 = r6;
        r1 = r7;
        r3 = r8;
        r5 = r10;
        r0 = r0.m1676a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x005e }
        r1 = 0;
        p000.dtd.m1680a(r1, r4);	 Catch:{ all -> 0x0057 }
        r1 = r6.f3303a;
        r1.mo1904b();
        return r0;
    L_0x0057:
        r0 = move-exception;
        r1 = r6.f3303a;
        r1.mo1904b();
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0060 }
    L_0x0060:
        r1 = move-exception;
        p000.dtd.m1680a(r0, r4);	 Catch:{ all -> 0x0057 }
        throw r1;	 Catch:{ all -> 0x0057 }
        */
        throw new UnsupportedOperationException("Method not decompiled: dtd.a(byx, fio, fmg, fhh):com.google.googlex.gcam.BurstSpec");
    }

    /* renamed from: a */
    private final BurstSpec m1676a(byx byx, FrameRequestVector frameRequestVector, fio fio, fko fko, fhh fhh) {
        iqz iqz;
        StringBuilder stringBuilder;
        fio.m2304a((fhy) fko);
        int size = (int) frameRequestVector.size();
        List arrayList = new ArrayList(size);
        List arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            iqz iqz2 = this.f3304b;
            StringBuilder stringBuilder2 = new StringBuilder(51);
            stringBuilder2.append("Adding frame ");
            stringBuilder2.append(i + 1);
            stringBuilder2.append(" of ");
            stringBuilder2.append(size);
            stringBuilder2.append(" to request.");
            iqz2.mo519e(stringBuilder2.toString());
            fiw fwn = new fwn();
            FrameRequest frameRequest = frameRequestVector.get(i);
            fio fio2 = new fio(fio);
            this.f3306d.m1053a(fio2, frameRequest);
            fio2.m2307a(fwn);
            arrayList2.add(fio2.m2301a());
            this.f3304b.mo519e("Adding metadata future to list.");
            arrayList.add(fwn.f16576a);
            this.f3304b.mo519e("Done adding metadata future to list");
        }
        this.f3304b.mo514b(String.format(null, "Submitting an HDR+ metering burst of %d frames for shot %d", new Object[]{Integer.valueOf(size), Integer.valueOf(byx.f1718a)}));
        fhh.mo1381a(arrayList2, fiv.NON_REPEATING);
        int i2 = 0;
        while (i2 < size) {
            ird ird = this.f3303a;
            int i3 = i2 + 1;
            StringBuilder stringBuilder3 = new StringBuilder(37);
            stringBuilder3.append("MeteringFrame");
            stringBuilder3.append(i3);
            stringBuilder3.append("of");
            stringBuilder3.append(size);
            ird.mo1903a(stringBuilder3.toString());
            try {
                iwp iwp = (iwp) ((kpk) arrayList.get(i2)).get();
                fkp fkp = (fkp) fko.mo2649a();
                if (fkp.m17319i()) {
                    this.f3305c.mo614a(byx, i2, iwp, fkp);
                    this.f3304b.mo518d(String.format(null, "Acquired metering frame %d of %d for shot %d.", new Object[]{Integer.valueOf(i3), Integer.valueOf(size), Integer.valueOf(byx.f1718a)}));
                } else {
                    this.f3304b.mo520f(String.format(null, "Metering frame %d of %d for shot %d did not contain an image! Marking frame as invalid.", new Object[]{Integer.valueOf(i3), Integer.valueOf(size), Integer.valueOf(byx.f1718a)}));
                    fkp.close();
                    this.f3305c.mo614a(byx, i2, iwp, null);
                }
                this.f3303a.mo1904b();
                i2++;
            } catch (Throwable e) {
                iqz = this.f3304b;
                stringBuilder = new StringBuilder(60);
                stringBuilder.append("Could not acquire metering frame ");
                stringBuilder.append(i3);
                stringBuilder.append(" of ");
                stringBuilder.append(size);
                stringBuilder.append("!");
                iqz.mo515b(stringBuilder.toString(), e);
                this.f3303a.mo1904b();
                throw new isr(e.getMessage());
            } catch (Throwable e2) {
                iqz = this.f3304b;
                stringBuilder = new StringBuilder(60);
                stringBuilder.append("Could not acquire metering frame ");
                stringBuilder.append(i3);
                stringBuilder.append(" of ");
                stringBuilder.append(size);
                stringBuilder.append("!");
                iqz.mo515b(stringBuilder.toString(), e2);
                this.f3303a.mo1904b();
                throw e2;
            }
        }
        return this.f3305c.mo618b(byx);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final boolean m1683a(p000.byx r14, com.google.googlex.gcam.BurstSpec r15, p000.fvz r16, p000.fio r17, p000.fmg r18, p000.kbg r19, p000.fhh r20, p000.iqo r21, p000.grg r22, p000.dug r23) {
        /*
        r13 = this;
        r2 = r13.f3303a;
        r3 = r14.f1718a;
        r4 = new java.lang.StringBuilder;
        r5 = 25;
        r4.<init>(r5);
        r5 = "HdrPlusPayload";
        r4.append(r5);
        r4.append(r3);
        r3 = r4.toString();
        r2.mo1903a(r3);
        r4 = r15.getFrame_requests();
        r2 = r4.size();
        r3 = (int) r2;
        if (r23 == 0) goto L_0x00b8;
    L_0x0025:
        r0 = r23;
        r2 = r0.f14553b;
        if (r2 == 0) goto L_0x00b5;
    L_0x002b:
        r5 = android.hardware.camera2.CaptureResult.STATISTICS_FACES;
        r2 = r2.mo3143a(r5);
        r2 = (android.hardware.camera2.params.Face[]) r2;
        r12 = r2;
    L_0x0034:
        r0 = r18;
        r7 = p000.fds.m10245a(r0, r3);	 Catch:{ all -> 0x00bb }
        r2 = r19.mo2084b();	 Catch:{ all -> 0x00c2 }
        if (r2 == 0) goto L_0x00b3;
    L_0x0040:
        r2 = r19.mo2081a();	 Catch:{ all -> 0x00c2 }
        r2 = (p000.fmg) r2;	 Catch:{ all -> 0x00c2 }
        r8 = p000.fds.m10245a(r2, r3);	 Catch:{ all -> 0x00c2 }
    L_0x004a:
        if (r7 == 0) goto L_0x0054;
    L_0x004c:
        r2 = r19.mo2084b();	 Catch:{ all -> 0x00cb }
        if (r2 == 0) goto L_0x0087;
    L_0x0052:
        if (r8 != 0) goto L_0x0087;
    L_0x0054:
        r2 = r13.f3304b;	 Catch:{ all -> 0x00cb }
        r3 = "Failed to allocate at least %d frames for shot %d's payload requests.";
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00cb }
        r5 = 2;
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x00cb }
        r6 = 0;
        r4[r6] = r5;	 Catch:{ all -> 0x00cb }
        r5 = r14.f1718a;	 Catch:{ all -> 0x00cb }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x00cb }
        r6 = 1;
        r4[r6] = r5;	 Catch:{ all -> 0x00cb }
        r5 = 0;
        r3 = java.lang.String.format(r5, r3, r4);	 Catch:{ all -> 0x00cb }
        r2.mo516c(r3);	 Catch:{ all -> 0x00cb }
        if (r8 == 0) goto L_0x007a;
    L_0x0076:
        r2 = 0;
        p000.dtd.m1680a(r2, r8);	 Catch:{ all -> 0x00c2 }
    L_0x007a:
        if (r7 == 0) goto L_0x0080;
    L_0x007c:
        r2 = 0;
        p000.dtd.m1680a(r2, r7);	 Catch:{ all -> 0x00bb }
    L_0x0080:
        r2 = r13.f3303a;
        r2.mo1904b();
        r2 = 0;
    L_0x0086:
        return r2;
    L_0x0087:
        r2 = r13.f3305c;	 Catch:{ all -> 0x00cb }
        r2.mo616a(r14, r15);	 Catch:{ all -> 0x00cb }
        r6 = new fio;	 Catch:{ all -> 0x00cb }
        r0 = r17;
        r6.<init>(r0);	 Catch:{ all -> 0x00cb }
        r2 = r13;
        r3 = r14;
        r5 = r16;
        r9 = r20;
        r10 = r21;
        r11 = r22;
        r2 = r2.m1681a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x00cb }
        if (r8 == 0) goto L_0x00a7;
    L_0x00a3:
        r3 = 0;
        p000.dtd.m1680a(r3, r8);	 Catch:{ all -> 0x00c2 }
    L_0x00a7:
        if (r7 == 0) goto L_0x00ad;
    L_0x00a9:
        r3 = 0;
        p000.dtd.m1680a(r3, r7);	 Catch:{ all -> 0x00bb }
    L_0x00ad:
        r3 = r13.f3303a;
        r3.mo1904b();
        goto L_0x0086;
    L_0x00b3:
        r8 = 0;
        goto L_0x004a;
    L_0x00b5:
        r12 = 0;
        goto L_0x0034;
    L_0x00b8:
        r12 = 0;
        goto L_0x0034;
    L_0x00bb:
        r2 = move-exception;
        r3 = r13.f3303a;
        r3.mo1904b();
        throw r2;
    L_0x00c2:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00c4 }
    L_0x00c4:
        r3 = move-exception;
        if (r7 == 0) goto L_0x00ca;
    L_0x00c7:
        p000.dtd.m1680a(r2, r7);	 Catch:{ all -> 0x00bb }
    L_0x00ca:
        throw r3;	 Catch:{ all -> 0x00bb }
    L_0x00cb:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00cd }
    L_0x00cd:
        r3 = move-exception;
        if (r8 == 0) goto L_0x00d3;
    L_0x00d0:
        p000.dtd.m1680a(r2, r8);	 Catch:{ all -> 0x00c2 }
    L_0x00d3:
        throw r3;	 Catch:{ all -> 0x00c2 }
        */
        throw new UnsupportedOperationException("Method not decompiled: dtd.a(byx, com.google.googlex.gcam.BurstSpec, fvz, fio, fmg, kbg, fhh, iqo, grg, dug):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final boolean m1681a(p000.byx r15, com.google.googlex.gcam.FrameRequestVector r16, p000.fvz r17, p000.fio r18, p000.fko r19, p000.fko r20, p000.fhh r21, p000.iqo r22, p000.grg r23, android.hardware.camera2.params.Face[] r24) {
        /*
        r14 = this;
        r2 = r16.size();
        r5 = (int) r2;
        r2 = r19.mo3443d();
        r10 = java.lang.Math.min(r5, r2);
        r18.m2304a(r19);
        if (r20 == 0) goto L_0x0019;
    L_0x0012:
        r0 = r18;
        r1 = r20;
        r0.m2304a(r1);
    L_0x0019:
        r0 = r17;
        r2 = r0.f4747c;
        r3 = 1;
        r2 = r2.getAndSet(r3);
        r2 = r2 ^ 1;
        p000.jri.m13153b(r2);
        r0 = r17;
        r2 = r0.f4746b;
        r3 = new fvu;
        r0 = r17;
        r3.<init>(r0);
        r2.execute(r3);
        r2 = new fvw;
        r0 = r17;
        r3 = r0.f4745a;
        r3 = r3.f4446b;
        r0 = r17;
        r4 = r0.f4746b;
        r0 = r17;
        r2.<init>(r0, r3, r4, r10);
        r2 = p000.fds.m10249b(r2);
        r0 = r18;
        r0.m2307a(r2);
        r2 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT;
        r3 = 0;
        r3 = java.lang.Integer.valueOf(r3);
        r0 = r18;
        r0.m2303a(r2, r3);
        r2 = 0;
        r0 = r16;
        r2 = r0.get(r2);
        r7 = r2.getDesired_exposure_time_ms();
        r4 = r2.getDesired_analog_gain();
        r3 = r2.getDesired_digital_gain();
        r6 = r14.f3306d;
        r0 = r18;
        r6.m1053a(r0, r2);
        r2 = new fio;
        r0 = r18;
        r2.<init>(r0);
        r11 = new java.util.ArrayList;
        r11.<init>(r10);
        r2 = r2.m2301a();
        r11.add(r2);
        r2 = 1;
        r9 = r2;
        r2 = r3;
    L_0x008b:
        if (r9 >= r10) goto L_0x00cc;
    L_0x008d:
        r0 = r16;
        r12 = r0.get(r9);
        r8 = r12.getDesired_exposure_time_ms();
        r6 = r12.getDesired_analog_gain();
        r3 = r12.getDesired_digital_gain();
        r13 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1));
        if (r13 != 0) goto L_0x00ab;
    L_0x00a3:
        r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r13 != 0) goto L_0x00ab;
    L_0x00a7:
        r13 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1));
        if (r13 == 0) goto L_0x00c9;
    L_0x00ab:
        r2 = r14.f3306d;
        r0 = r18;
        r2.m1053a(r0, r12);
        r2 = r3;
        r4 = r8;
        r3 = r6;
    L_0x00b5:
        r6 = new fio;
        r0 = r18;
        r6.<init>(r0);
        r6 = r6.m2301a();
        r11.add(r6);
        r6 = r9 + 1;
        r9 = r6;
        r7 = r4;
        r4 = r3;
        goto L_0x008b;
    L_0x00c9:
        r3 = r4;
        r4 = r7;
        goto L_0x00b5;
    L_0x00cc:
        r2 = r14.f3304b;	 Catch:{ isr -> 0x0209 }
        r3 = r15.f1718a;	 Catch:{ isr -> 0x0209 }
        r4 = new java.lang.StringBuilder;	 Catch:{ isr -> 0x0209 }
        r6 = 75;
        r4.<init>(r6);	 Catch:{ isr -> 0x0209 }
        r6 = "Submitting an HDR+ payload burst of ";
        r4.append(r6);	 Catch:{ isr -> 0x0209 }
        r4.append(r10);	 Catch:{ isr -> 0x0209 }
        r6 = " frames for shot ";
        r4.append(r6);	 Catch:{ isr -> 0x0209 }
        r4.append(r3);	 Catch:{ isr -> 0x0209 }
        r3 = r4.toString();	 Catch:{ isr -> 0x0209 }
        r2.mo514b(r3);	 Catch:{ isr -> 0x0209 }
        r2 = p000.fiv.NON_REPEATING;	 Catch:{ isr -> 0x0209 }
        r0 = r21;
        r0.mo1381a(r11, r2);	 Catch:{ isr -> 0x0209 }
        r22.close();
        r7 = new java.util.HashMap;
        r7.<init>();
        r2 = r14.f3303a;	 Catch:{ isr -> 0x0225, InterruptedException -> 0x03a9, all -> 0x03a7 }
        r3 = "HdrPlus#payload";
        r2.mo1903a(r3);	 Catch:{ isr -> 0x0225, InterruptedException -> 0x03a9, all -> 0x03a7 }
        if (r20 == 0) goto L_0x0205;
    L_0x0106:
        r0 = r20;
        r7 = r14.m1678a(r0, r10);	 Catch:{ isr -> 0x0225, InterruptedException -> 0x03a9, all -> 0x03a7 }
        r9 = 0;
        r4 = 0;
    L_0x010e:
        if (r4 >= r10) goto L_0x0125;
    L_0x0110:
        r2 = r14;
        r3 = r15;
        r6 = r19;
        r8 = r24;
        r2 = r2.m1677a(r3, r4, r5, r6, r7, r8);	 Catch:{ isr -> 0x0352, InterruptedException -> 0x039d, all -> 0x0338 }
        if (r4 != 0) goto L_0x0121;
    L_0x011c:
        r0 = r23;
        r0.mo1517a(r2);	 Catch:{ isr -> 0x039f, InterruptedException -> 0x03a2, all -> 0x0338 }
    L_0x0121:
        r4 = r4 + 1;
        r9 = r2;
        goto L_0x010e;
    L_0x0125:
        if (r4 >= r5) goto L_0x012f;
    L_0x0127:
        if (r9 == 0) goto L_0x012f;
    L_0x0129:
        r14.m1679a(r15, r4, r5, r9);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r4 = r4 + 1;
        goto L_0x0125;
    L_0x012f:
        r2 = r14.f3303a;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r3 = "HdrPlus#endPayload";
        r2.mo1905b(r3);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2 = r14.f3305c;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2 = r2.mo621c(r15);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        if (r2 == 0) goto L_0x01ce;
    L_0x013e:
        r2 = r14.f3304b;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r3 = "EndPayloadFrames succeeded for shot %d.";
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = r15.f1718a;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r11 = 0;
        r6[r11] = r8;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = 0;
        r3 = java.lang.String.format(r8, r3, r6);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2.mo518d(r3);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2 = r14.f3305c;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r3 = r15.f1718a;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2 = r2.mo619b(r3);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        if (r2 == 0) goto L_0x0197;
    L_0x0160:
        r2 = r14.f3304b;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r3 = "EndShotCapture succeeded for shot %d.";
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = r15.f1718a;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r11 = 0;
        r6[r11] = r8;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = 0;
        r3 = java.lang.String.format(r8, r3, r6);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2.mo518d(r3);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2 = r7.values();
        r3 = r2.iterator();
    L_0x0180:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x0190;
    L_0x0186:
        r2 = r3.next();
        r2 = (p000.fkp) r2;
        r2.close();
        goto L_0x0180;
    L_0x0190:
        r2 = r14.f3303a;
        r2.mo1904b();
        r2 = 1;
    L_0x0196:
        return r2;
    L_0x0197:
        r2 = r14.f3304b;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r3 = "EndShotCapture failed for shot %d.";
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = r15.f1718a;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r11 = 0;
        r6[r11] = r8;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = 0;
        r3 = java.lang.String.format(r8, r3, r6);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2.mo518d(r3);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2 = r7.values();
        r3 = r2.iterator();
    L_0x01b7:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x01c7;
    L_0x01bd:
        r2 = r3.next();
        r2 = (p000.fkp) r2;
        r2.close();
        goto L_0x01b7;
    L_0x01c7:
        r2 = r14.f3303a;
        r2.mo1904b();
        r2 = 0;
        goto L_0x0196;
    L_0x01ce:
        r2 = r14.f3304b;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r3 = "EndPayloadFrames failed for shot %d.";
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = r15.f1718a;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r11 = 0;
        r6[r11] = r8;	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r8 = 0;
        r3 = java.lang.String.format(r8, r3, r6);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2.mo516c(r3);	 Catch:{ isr -> 0x0356, InterruptedException -> 0x03a5, all -> 0x0338 }
        r2 = r7.values();
        r3 = r2.iterator();
    L_0x01ee:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x01fe;
    L_0x01f4:
        r2 = r3.next();
        r2 = (p000.fkp) r2;
        r2.close();
        goto L_0x01ee;
    L_0x01fe:
        r2 = r14.f3303a;
        r2.mo1904b();
        r2 = 0;
        goto L_0x0196;
    L_0x0205:
        r9 = 0;
        r4 = 0;
        goto L_0x010e;
    L_0x0209:
        r2 = move-exception;
        r2 = r14.f3304b;
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r5 = r15.f1718a;
        r5 = java.lang.Integer.valueOf(r5);
        r3[r4] = r5;
        r4 = 0;
        r5 = "Failed to submit frame requests for shot %d.";
        r3 = java.lang.String.format(r4, r5, r3);
        r2.mo516c(r3);
        r2 = 0;
        goto L_0x0196;
    L_0x0225:
        r2 = move-exception;
    L_0x0226:
        r2 = 0;
        r4 = 0;
    L_0x0228:
        if (r2 == 0) goto L_0x035a;
    L_0x022a:
        r3 = r14.f3303a;	 Catch:{ all -> 0x0394 }
        r6 = "HdrPlus#recoverPayload";
        r3.mo1905b(r6);	 Catch:{ all -> 0x0394 }
        r3 = r14.f3304b;	 Catch:{ all -> 0x0394 }
        r6 = r15.f1718a;	 Catch:{ all -> 0x0394 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0394 }
        r9 = 88;
        r8.<init>(r9);	 Catch:{ all -> 0x0394 }
        r9 = "Attempting to recover HDR+ burst ";
        r8.append(r9);	 Catch:{ all -> 0x0394 }
        r8.append(r6);	 Catch:{ all -> 0x0394 }
        r6 = " by supplying null for the remaining frames.";
        r8.append(r6);	 Catch:{ all -> 0x0394 }
        r6 = r8.toString();	 Catch:{ all -> 0x0394 }
        r3.mo520f(r6);	 Catch:{ all -> 0x0394 }
    L_0x0250:
        if (r4 >= r10) goto L_0x0258;
    L_0x0252:
        r14.m1679a(r15, r4, r5, r2);	 Catch:{ all -> 0x0394 }
        r4 = r4 + 1;
        goto L_0x0250;
    L_0x0258:
        r2 = r14.f3305c;	 Catch:{ all -> 0x0394 }
        r2 = r2.mo621c(r15);	 Catch:{ all -> 0x0394 }
        if (r2 == 0) goto L_0x02f9;
    L_0x0260:
        r2 = r14.f3304b;	 Catch:{ all -> 0x0394 }
        r3 = r15.f1718a;	 Catch:{ all -> 0x0394 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0394 }
        r5 = 48;
        r4.<init>(r5);	 Catch:{ all -> 0x0394 }
        r5 = "Payload recovery succeeded for shot ";
        r4.append(r5);	 Catch:{ all -> 0x0394 }
        r4.append(r3);	 Catch:{ all -> 0x0394 }
        r3 = ".";
        r4.append(r3);	 Catch:{ all -> 0x0394 }
        r3 = r4.toString();	 Catch:{ all -> 0x0394 }
        r2.mo520f(r3);	 Catch:{ all -> 0x0394 }
        r2 = r14.f3305c;	 Catch:{ all -> 0x0394 }
        r3 = r15.f1718a;	 Catch:{ all -> 0x0394 }
        r2 = r2.mo619b(r3);	 Catch:{ all -> 0x0394 }
        if (r2 == 0) goto L_0x02c1;
    L_0x0289:
        r2 = r14.f3304b;	 Catch:{ all -> 0x0394 }
        r3 = "EndShotCapture succeeded for shot %d.";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0394 }
        r5 = r15.f1718a;	 Catch:{ all -> 0x0394 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0394 }
        r6 = 0;
        r4[r6] = r5;	 Catch:{ all -> 0x0394 }
        r5 = 0;
        r3 = java.lang.String.format(r5, r3, r4);	 Catch:{ all -> 0x0394 }
        r2.mo518d(r3);	 Catch:{ all -> 0x0394 }
        r2 = r7.values();
        r3 = r2.iterator();
    L_0x02a9:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x02b9;
    L_0x02af:
        r2 = r3.next();
        r2 = (p000.fkp) r2;
        r2.close();
        goto L_0x02a9;
    L_0x02b9:
        r2 = r14.f3303a;
        r2.mo1904b();
        r2 = 1;
        goto L_0x0196;
    L_0x02c1:
        r2 = r14.f3304b;	 Catch:{ all -> 0x0394 }
        r3 = "EndShotCapture failed for shot %d.";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0394 }
        r5 = r15.f1718a;	 Catch:{ all -> 0x0394 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0394 }
        r6 = 0;
        r4[r6] = r5;	 Catch:{ all -> 0x0394 }
        r5 = 0;
        r3 = java.lang.String.format(r5, r3, r4);	 Catch:{ all -> 0x0394 }
        r2.mo518d(r3);	 Catch:{ all -> 0x0394 }
        r2 = r7.values();
        r3 = r2.iterator();
    L_0x02e1:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x02f1;
    L_0x02e7:
        r2 = r3.next();
        r2 = (p000.fkp) r2;
        r2.close();
        goto L_0x02e1;
    L_0x02f1:
        r2 = r14.f3303a;
        r2.mo1904b();
        r2 = 0;
        goto L_0x0196;
    L_0x02f9:
        r2 = r14.f3304b;	 Catch:{ all -> 0x0394 }
        r3 = r15.f1718a;	 Catch:{ all -> 0x0394 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0394 }
        r5 = 45;
        r4.<init>(r5);	 Catch:{ all -> 0x0394 }
        r5 = "Payload recovery failed for shot ";
        r4.append(r5);	 Catch:{ all -> 0x0394 }
        r4.append(r3);	 Catch:{ all -> 0x0394 }
        r3 = "!";
        r4.append(r3);	 Catch:{ all -> 0x0394 }
        r3 = r4.toString();	 Catch:{ all -> 0x0394 }
        r2.mo516c(r3);	 Catch:{ all -> 0x0394 }
        r2 = r7.values();
        r3 = r2.iterator();
    L_0x0320:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x0330;
    L_0x0326:
        r2 = r3.next();
        r2 = (p000.fkp) r2;
        r2.close();
        goto L_0x0320;
    L_0x0330:
        r2 = r14.f3303a;
        r2.mo1904b();
        r2 = 0;
        goto L_0x0196;
    L_0x0338:
        r2 = move-exception;
    L_0x0339:
        r3 = r2;
    L_0x033a:
        r2 = r7.values();
        r4 = r2.iterator();
    L_0x0342:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x0397;
    L_0x0348:
        r2 = r4.next();
        r2 = (p000.fkp) r2;
        r2.close();
        goto L_0x0342;
    L_0x0352:
        r2 = move-exception;
    L_0x0353:
        r2 = r9;
        goto L_0x0228;
    L_0x0356:
        r2 = move-exception;
    L_0x0357:
        r2 = r9;
        goto L_0x0228;
    L_0x035a:
        r2 = r14.f3304b;	 Catch:{ all -> 0x0394 }
        r3 = r15.f1718a;	 Catch:{ all -> 0x0394 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0394 }
        r5 = 67;
        r4.<init>(r5);	 Catch:{ all -> 0x0394 }
        r5 = "Failed to receive any frames. Aborting capture for shot ";
        r4.append(r5);	 Catch:{ all -> 0x0394 }
        r4.append(r3);	 Catch:{ all -> 0x0394 }
        r3 = r4.toString();	 Catch:{ all -> 0x0394 }
        r2.mo516c(r3);	 Catch:{ all -> 0x0394 }
        r2 = r7.values();
        r3 = r2.iterator();
    L_0x037c:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x038c;
    L_0x0382:
        r2 = r3.next();
        r2 = (p000.fkp) r2;
        r2.close();
        goto L_0x037c;
    L_0x038c:
        r2 = r14.f3303a;
        r2.mo1904b();
        r2 = 0;
        goto L_0x0196;
    L_0x0394:
        r2 = move-exception;
        r3 = r2;
        goto L_0x033a;
    L_0x0397:
        r2 = r14.f3303a;
        r2.mo1904b();
        throw r3;
    L_0x039d:
        r2 = move-exception;
        goto L_0x0353;
    L_0x039f:
        r3 = move-exception;
        goto L_0x0228;
    L_0x03a2:
        r3 = move-exception;
        goto L_0x0228;
    L_0x03a5:
        r2 = move-exception;
        goto L_0x0357;
    L_0x03a7:
        r2 = move-exception;
        goto L_0x0339;
    L_0x03a9:
        r2 = move-exception;
        goto L_0x0226;
        */
        throw new UnsupportedOperationException("Method not decompiled: dtd.a(byx, com.google.googlex.gcam.FrameRequestVector, fvz, fio, fko, fko, fhh, iqo, grg, android.hardware.camera2.params.Face[]):boolean");
    }
}
