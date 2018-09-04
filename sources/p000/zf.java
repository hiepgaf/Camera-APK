package p000;

import android.hardware.Camera;
import android.hardware.Camera.ErrorCallback;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: zf */
final class zf extends abu implements ErrorCallback {
    /* renamed from: a */
    private zs f19767a;
    /* renamed from: b */
    private Camera f19768b;
    /* renamed from: c */
    private int f19769c = -1;
    /* renamed from: d */
    private zh f19770d;
    /* renamed from: e */
    private int f19771e = 0;
    /* renamed from: f */
    private final /* synthetic */ yo f19772f;

    zf(yo yoVar, zs zsVar, Looper looper) {
        this.f19772f = yoVar;
        super(looper);
        this.f19767a = zsVar;
    }

    public final void handleMessage(android.os.Message r12) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:zf.handleMessage(android.os.Message):void. bs: [B:4:0x0037, B:11:0x006f, B:113:0x037c]
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
        r11 = this;
        r7 = -1;
        r2 = 0;
        r9 = 1;
        r4 = 0;
        super.handleMessage(r12);
        r3 = r11.f19772f;
        r3 = r3.f19748e;
        r3 = r3.m78c();
        if (r3 != 0) goto L_0x04c6;
    L_0x0011:
        r3 = p000.yo.f19743a;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "handleMessage - action = '";
        r5.append(r6);
        r6 = r12.what;
        r6 = p000.tz.m5876a(r6);
        r5.append(r6);
        r6 = "'";
        r5.append(r6);
        r5 = r5.toString();
        p000.abx.m90d(r3, r5);
        r10 = r12.what;
        switch(r10) {
            case 1: goto L_0x0436;
            case 2: goto L_0x0416;
            case 3: goto L_0x03ee;
            case 4: goto L_0x03df;
            case 5: goto L_0x03d0;
            case 101: goto L_0x03bb;
            case 102: goto L_0x03ab;
            case 103: goto L_0x03a4;
            case 104: goto L_0x0399;
            case 105: goto L_0x038e;
            case 106: goto L_0x037c;
            case 107: goto L_0x0371;
            case 108: goto L_0x0366;
            case 201: goto L_0x034d;
            case 202: goto L_0x033e;
            case 203: goto L_0x0337;
            case 204: goto L_0x01c6;
            case 301: goto L_0x018f;
            case 302: goto L_0x017a;
            case 303: goto L_0x0163;
            case 304: goto L_0x0158;
            case 305: goto L_0x0150;
            case 461: goto L_0x0145;
            case 462: goto L_0x013e;
            case 463: goto L_0x0137;
            case 501: goto L_0x012b;
            case 502: goto L_0x00f6;
            case 503: goto L_0x00da;
            case 601: goto L_0x0053;
            default: goto L_0x0037;
        };
    L_0x0037:
        r2 = p000.yo.f19743a;	 Catch:{ RuntimeException -> 0x006e }
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x006e }
        r3.<init>();	 Catch:{ RuntimeException -> 0x006e }
        r4 = "Invalid CameraProxy message=";	 Catch:{ RuntimeException -> 0x006e }
        r3.append(r4);	 Catch:{ RuntimeException -> 0x006e }
        r4 = r12.what;	 Catch:{ RuntimeException -> 0x006e }
        r3.append(r4);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x006e }
        p000.abx.m87b(r2, r3);	 Catch:{ RuntimeException -> 0x006e }
    L_0x004f:
        p000.aaw.m27a(r12);
    L_0x0052:
        return;
    L_0x0053:
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19748e;	 Catch:{ RuntimeException -> 0x006e }
        r3 = 8;	 Catch:{ RuntimeException -> 0x006e }
        r2.m75a(r3);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (p000.zg) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r4 = r2.f9573a;	 Catch:{ RuntimeException -> 0x006e }
        r5 = r2.f9574b;	 Catch:{ RuntimeException -> 0x006e }
        r6 = r2.f9575c;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f9576d;	 Catch:{ RuntimeException -> 0x006e }
        r3.takePicture(r4, r5, r6, r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;
    L_0x006e:
        r2 = move-exception;
        r3 = r11.f19772f;	 Catch:{ all -> 0x00f1 }
        r3 = r3.f19748e;	 Catch:{ all -> 0x00f1 }
        r4 = r3.m74a();	 Catch:{ all -> 0x00f1 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f1 }
        r3.<init>();	 Catch:{ all -> 0x00f1 }
        r5 = "CameraAction[";	 Catch:{ all -> 0x00f1 }
        r3.append(r5);	 Catch:{ all -> 0x00f1 }
        r5 = p000.tz.m5876a(r10);	 Catch:{ all -> 0x00f1 }
        r3.append(r5);	 Catch:{ all -> 0x00f1 }
        r5 = "] at CameraState[";	 Catch:{ all -> 0x00f1 }
        r3.append(r5);	 Catch:{ all -> 0x00f1 }
        r3.append(r4);	 Catch:{ all -> 0x00f1 }
        r5 = "]";	 Catch:{ all -> 0x00f1 }
        r3.append(r5);	 Catch:{ all -> 0x00f1 }
        r3 = r3.toString();	 Catch:{ all -> 0x00f1 }
        r5 = p000.yo.f19743a;	 Catch:{ all -> 0x00f1 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f1 }
        r6.<init>();	 Catch:{ all -> 0x00f1 }
        r7 = "RuntimeException during ";	 Catch:{ all -> 0x00f1 }
        r6.append(r7);	 Catch:{ all -> 0x00f1 }
        r6.append(r3);	 Catch:{ all -> 0x00f1 }
        r3 = r6.toString();	 Catch:{ all -> 0x00f1 }
        p000.abx.m85a(r5, r3, r2);	 Catch:{ all -> 0x00f1 }
        r3 = r11.f19772f;	 Catch:{ all -> 0x00f1 }
        r3 = r3.f19748e;	 Catch:{ all -> 0x00f1 }
        r3.m76b();	 Catch:{ all -> 0x00f1 }
        r3 = r11.f19768b;	 Catch:{ all -> 0x00f1 }
        if (r3 != 0) goto L_0x04f9;	 Catch:{ all -> 0x00f1 }
    L_0x00ba:
        r3 = r12.what;	 Catch:{ all -> 0x00f1 }
        if (r3 != r9) goto L_0x050a;	 Catch:{ all -> 0x00f1 }
    L_0x00be:
        r3 = r11.f19768b;	 Catch:{ all -> 0x00f1 }
        if (r3 != 0) goto L_0x050a;	 Catch:{ all -> 0x00f1 }
    L_0x00c2:
        r3 = r12.arg1;	 Catch:{ all -> 0x00f1 }
        r2 = r12.obj;	 Catch:{ all -> 0x00f1 }
        if (r2 == 0) goto L_0x00d5;	 Catch:{ all -> 0x00f1 }
    L_0x00c8:
        r2 = r12.obj;	 Catch:{ all -> 0x00f1 }
        r2 = (p000.zy) r2;	 Catch:{ all -> 0x00f1 }
        r4 = r12.arg1;	 Catch:{ all -> 0x00f1 }
        r3 = r11.m82b(r3);	 Catch:{ all -> 0x00f1 }
        r2.mo673a(r4, r3);	 Catch:{ all -> 0x00f1 }
    L_0x00d5:
        p000.aaw.m27a(r12);
        goto L_0x0052;
    L_0x00da:
        r2 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.m6252a();	 Catch:{ RuntimeException -> 0x006e }
        r3 = r12.arg1;	 Catch:{ RuntimeException -> 0x006e }
        r2.setRotation(r3);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r3.setParameters(r2);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r2.m6253b();	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;
    L_0x00f1:
        r2 = move-exception;
        p000.aaw.m27a(r12);
        throw r2;
    L_0x00f6:
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r4 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r4 = r4.f19745b;	 Catch:{ RuntimeException -> 0x006e }
        r5 = r12.arg1;	 Catch:{ RuntimeException -> 0x006e }
        r6 = 1;	 Catch:{ RuntimeException -> 0x006e }
        r4 = r4.m54a(r5, r6);	 Catch:{ RuntimeException -> 0x006e }
        r3.setDisplayOrientation(r4);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.m6252a();	 Catch:{ RuntimeException -> 0x006e }
        r4 = r12.arg2;	 Catch:{ RuntimeException -> 0x006e }
        if (r4 > 0) goto L_0x011f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0110:
        r3.setRotation(r2);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.setParameters(r3);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r2.m6253b();	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x011f:
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19745b;	 Catch:{ RuntimeException -> 0x006e }
        r4 = r12.arg1;	 Catch:{ RuntimeException -> 0x006e }
        r5 = 0;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.m54a(r4, r5);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x0110;	 Catch:{ RuntimeException -> 0x006e }
    L_0x012b:
        r3 = r12.arg1;	 Catch:{ RuntimeException -> 0x006e }
        if (r3 != r9) goto L_0x0130;	 Catch:{ RuntimeException -> 0x006e }
    L_0x012f:
        r2 = r9;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0130:
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r3.enableShutterSound(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0137:
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.stopFaceDetection();	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x013e:
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.startFaceDetection();	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0145:
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (android.hardware.Camera.FaceDetectionListener) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r3.setFaceDetectionListener(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0150:
        r2 = r11.f19771e;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2 + -1;	 Catch:{ RuntimeException -> 0x006e }
        r11.f19771e = r2;	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0158:
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (android.hardware.Camera.OnZoomChangeListener) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3.setZoomChangeListener(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0163:
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (android.hardware.Camera.AutoFocusMoveCallback) r2;	 Catch:{ RuntimeException -> 0x016e }
        r3.setAutoFocusMoveCallback(r2);	 Catch:{ RuntimeException -> 0x016e }
        goto L_0x004f;
    L_0x016e:
        r2 = move-exception;
        r3 = p000.yo.f19743a;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.getMessage();	 Catch:{ RuntimeException -> 0x006e }
        p000.abx.m91e(r3, r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x017a:
        r2 = r11.f19771e;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2 + 1;	 Catch:{ RuntimeException -> 0x006e }
        r11.f19771e = r2;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.cancelAutoFocus();	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19748e;	 Catch:{ RuntimeException -> 0x006e }
        r3 = 2;	 Catch:{ RuntimeException -> 0x006e }
        r2.m75a(r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x018f:
        r2 = r11.f19771e;	 Catch:{ RuntimeException -> 0x006e }
        if (r2 <= 0) goto L_0x01b2;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0193:
        r2 = p000.yo.f19743a;	 Catch:{ RuntimeException -> 0x006e }
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x006e }
        r3.<init>();	 Catch:{ RuntimeException -> 0x006e }
        r4 = "handleMessage - Ignored AUTO_FOCUS because there was ";	 Catch:{ RuntimeException -> 0x006e }
        r3.append(r4);	 Catch:{ RuntimeException -> 0x006e }
        r4 = r11.f19771e;	 Catch:{ RuntimeException -> 0x006e }
        r3.append(r4);	 Catch:{ RuntimeException -> 0x006e }
        r4 = " pending CANCEL_AUTO_FOCUS messages";	 Catch:{ RuntimeException -> 0x006e }
        r3.append(r4);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x006e }
        p000.abx.m90d(r2, r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x01b2:
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19748e;	 Catch:{ RuntimeException -> 0x006e }
        r3 = 16;	 Catch:{ RuntimeException -> 0x006e }
        r2.m75a(r3);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (android.hardware.Camera.AutoFocusCallback) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3.autoFocus(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x01c6:
        r2 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r5 = r2.m6252a();	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (p000.abo) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.f19746c;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.f69w;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r2.m68b();	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.f178a;	 Catch:{ RuntimeException -> 0x006e }
        r6 = r3.x;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.y;	 Catch:{ RuntimeException -> 0x006e }
        r5.setPictureSize(r6, r3);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r2.m70c();	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.f178a;	 Catch:{ RuntimeException -> 0x006e }
        r6 = r3.x;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.y;	 Catch:{ RuntimeException -> 0x006e }
        r5.setPreviewSize(r6, r3);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r2.f143i;	 Catch:{ RuntimeException -> 0x006e }
        if (r3 == r7) goto L_0x032e;	 Catch:{ RuntimeException -> 0x006e }
    L_0x01f4:
        r5.setPreviewFrameRate(r3);	 Catch:{ RuntimeException -> 0x006e }
    L_0x01f7:
        r3 = r2.f145k;	 Catch:{ RuntimeException -> 0x006e }
        r5.setPreviewFormat(r3);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r2.f146l;	 Catch:{ RuntimeException -> 0x006e }
        r5.setJpegQuality(r3);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.f19746c;	 Catch:{ RuntimeException -> 0x006e }
        r6 = p000.aba.ZOOM;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.m32a(r6);	 Catch:{ RuntimeException -> 0x006e }
        if (r3 != 0) goto L_0x030a;	 Catch:{ RuntimeException -> 0x006e }
    L_0x020d:
        r3 = r2.f149o;	 Catch:{ RuntimeException -> 0x006e }
        r5.setExposureCompensation(r3);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.f19746c;	 Catch:{ RuntimeException -> 0x006e }
        r6 = p000.aba.AUTO_EXPOSURE_LOCK;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.m32a(r6);	 Catch:{ RuntimeException -> 0x006e }
        if (r3 == 0) goto L_0x0223;	 Catch:{ RuntimeException -> 0x006e }
    L_0x021e:
        r3 = r2.f155u;	 Catch:{ RuntimeException -> 0x006e }
        r5.setAutoExposureLock(r3);	 Catch:{ RuntimeException -> 0x006e }
    L_0x0223:
        r3 = r2.f151q;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.name();	 Catch:{ RuntimeException -> 0x006e }
        r3 = p000.abe.m49d(r3);	 Catch:{ RuntimeException -> 0x006e }
        r5.setFocusMode(r3);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.f19746c;	 Catch:{ RuntimeException -> 0x006e }
        r6 = p000.aba.AUTO_WHITE_BALANCE_LOCK;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.m32a(r6);	 Catch:{ RuntimeException -> 0x006e }
        if (r3 == 0) goto L_0x0241;	 Catch:{ RuntimeException -> 0x006e }
    L_0x023c:
        r3 = r2.f156v;	 Catch:{ RuntimeException -> 0x006e }
        r5.setAutoWhiteBalanceLock(r3);	 Catch:{ RuntimeException -> 0x006e }
    L_0x0241:
        r3 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.f19746c;	 Catch:{ RuntimeException -> 0x006e }
        r6 = p000.aba.FOCUS_AREA;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.m32a(r6);	 Catch:{ RuntimeException -> 0x006e }
        if (r3 == 0) goto L_0x025e;	 Catch:{ RuntimeException -> 0x006e }
    L_0x024d:
        r3 = r2.m71d();	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.size();	 Catch:{ RuntimeException -> 0x006e }
        if (r3 == 0) goto L_0x0304;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0257:
        r3 = r2.m71d();	 Catch:{ RuntimeException -> 0x006e }
        r5.setFocusAreas(r3);	 Catch:{ RuntimeException -> 0x006e }
    L_0x025e:
        r3 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.f19746c;	 Catch:{ RuntimeException -> 0x006e }
        r6 = p000.aba.METERING_AREA;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.m32a(r6);	 Catch:{ RuntimeException -> 0x006e }
        if (r3 == 0) goto L_0x027b;	 Catch:{ RuntimeException -> 0x006e }
    L_0x026a:
        r3 = r2.m72e();	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.size();	 Catch:{ RuntimeException -> 0x006e }
        if (r3 == 0) goto L_0x02fe;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0274:
        r3 = r2.m72e();	 Catch:{ RuntimeException -> 0x006e }
        r5.setMeteringAreas(r3);	 Catch:{ RuntimeException -> 0x006e }
    L_0x027b:
        r3 = r2.f150p;	 Catch:{ RuntimeException -> 0x006e }
        r6 = p000.abb.NO_FLASH;	 Catch:{ RuntimeException -> 0x006e }
        if (r3 != r6) goto L_0x02f0;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0281:
        r3 = r2.f152r;	 Catch:{ RuntimeException -> 0x006e }
        r6 = p000.abd.NO_SCENE_MODE;	 Catch:{ RuntimeException -> 0x006e }
        if (r3 != r6) goto L_0x02e0;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0287:
        r3 = r2.f157w;	 Catch:{ RuntimeException -> 0x006e }
        r5.setRecordingHint(r3);	 Catch:{ RuntimeException -> 0x006e }
        r6 = r2.f159y;	 Catch:{ RuntimeException -> 0x006e }
        if (r6 == 0) goto L_0x02de;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0290:
        r3 = new abw;	 Catch:{ RuntimeException -> 0x006e }
        r3.<init>(r6);	 Catch:{ RuntimeException -> 0x006e }
    L_0x0295:
        if (r3 != 0) goto L_0x02d4;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0297:
        r3 = r2.f147m;	 Catch:{ RuntimeException -> 0x006e }
        r5.setPictureFormat(r3);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f158x;	 Catch:{ RuntimeException -> 0x006e }
        if (r2 == 0) goto L_0x02a5;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02a0:
        r4 = new abp;	 Catch:{ RuntimeException -> 0x006e }
        r4.<init>(r2);	 Catch:{ RuntimeException -> 0x006e }
    L_0x02a5:
        if (r4 != 0) goto L_0x02b6;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02a7:
        r5.removeGpsData();	 Catch:{ RuntimeException -> 0x006e }
    L_0x02aa:
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.setParameters(r5);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r2.m6253b();	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02b6:
        r2 = r4.f163d;	 Catch:{ RuntimeException -> 0x006e }
        r5.setGpsTimestamp(r2);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r4.f164e;	 Catch:{ RuntimeException -> 0x006e }
        if (r2 == 0) goto L_0x02aa;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02bf:
        r2 = r4.f162c;	 Catch:{ RuntimeException -> 0x006e }
        r5.setGpsAltitude(r2);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r4.f160a;	 Catch:{ RuntimeException -> 0x006e }
        r5.setGpsLatitude(r2);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r4.f161b;	 Catch:{ RuntimeException -> 0x006e }
        r5.setGpsLongitude(r2);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r4.f164e;	 Catch:{ RuntimeException -> 0x006e }
        r5.setGpsProcessingMethod(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x02aa;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02d4:
        r3 = r3.f178a;	 Catch:{ RuntimeException -> 0x006e }
        r6 = r3.x;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.y;	 Catch:{ RuntimeException -> 0x006e }
        r5.setJpegThumbnailSize(r6, r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x0297;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02de:
        r3 = r4;	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x0295;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02e0:
        r3 = r2.f152r;	 Catch:{ RuntimeException -> 0x006e }
        if (r3 == 0) goto L_0x0287;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02e4:
        r3 = r3.name();	 Catch:{ RuntimeException -> 0x006e }
        r3 = p000.abe.m49d(r3);	 Catch:{ RuntimeException -> 0x006e }
        r5.setSceneMode(r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x0287;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02f0:
        r3 = r2.f150p;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.name();	 Catch:{ RuntimeException -> 0x006e }
        r3 = p000.abe.m49d(r3);	 Catch:{ RuntimeException -> 0x006e }
        r5.setFlashMode(r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x0281;	 Catch:{ RuntimeException -> 0x006e }
    L_0x02fe:
        r3 = 0;	 Catch:{ RuntimeException -> 0x006e }
        r5.setMeteringAreas(r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x027b;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0304:
        r3 = 0;	 Catch:{ RuntimeException -> 0x006e }
        r5.setFocusAreas(r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x025e;	 Catch:{ RuntimeException -> 0x006e }
    L_0x030a:
        r3 = r2.f148n;	 Catch:{ RuntimeException -> 0x006e }
        r6 = r5.getZoomRatios();	 Catch:{ RuntimeException -> 0x006e }
        r7 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3 * r7;	 Catch:{ RuntimeException -> 0x006e }
        r3 = (int) r3;	 Catch:{ RuntimeException -> 0x006e }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ RuntimeException -> 0x006e }
        r3 = java.util.Collections.binarySearch(r6, r3);	 Catch:{ RuntimeException -> 0x006e }
        if (r3 >= 0) goto L_0x0329;	 Catch:{ RuntimeException -> 0x006e }
    L_0x031e:
        r3 = r3 + 1;	 Catch:{ RuntimeException -> 0x006e }
        r3 = -r3;	 Catch:{ RuntimeException -> 0x006e }
        r6 = r6.size();	 Catch:{ RuntimeException -> 0x006e }
        if (r3 != r6) goto L_0x0329;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0327:
        r3 = r3 + -1;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0329:
        r5.setZoom(r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x020d;	 Catch:{ RuntimeException -> 0x006e }
    L_0x032e:
        r3 = r2.f141g;	 Catch:{ RuntimeException -> 0x006e }
        r6 = r2.f142h;	 Catch:{ RuntimeException -> 0x006e }
        r5.setPreviewFpsRange(r3, r6);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x01f7;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0337:
        r2 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r2.m6253b();	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x033e:
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (android.hardware.Camera.Parameters[]) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.m6252a();	 Catch:{ RuntimeException -> 0x006e }
        r4 = 0;	 Catch:{ RuntimeException -> 0x006e }
        r2[r4] = r3;	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x034d:
        r2 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r2.m6252a();	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (java.lang.String) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3.unflatten(r2);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.setParameters(r3);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r2.m6253b();	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0366:
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (android.hardware.Camera.PreviewCallback) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3.setOneShotPreviewCallback(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0371:
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (android.hardware.Camera.PreviewCallback) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3.setPreviewCallback(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;
    L_0x037c:
        r3 = r11.f19768b;	 Catch:{ IOException -> 0x0387 }
        r2 = r12.obj;	 Catch:{ IOException -> 0x0387 }
        r2 = (android.view.SurfaceHolder) r2;	 Catch:{ IOException -> 0x0387 }
        r3.setPreviewDisplay(r2);	 Catch:{ IOException -> 0x0387 }
        goto L_0x004f;
    L_0x0387:
        r2 = move-exception;
        r3 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x006e }
        r3.<init>(r2);	 Catch:{ RuntimeException -> 0x006e }
        throw r3;	 Catch:{ RuntimeException -> 0x006e }
    L_0x038e:
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (byte[]) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3.addCallbackBuffer(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0399:
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (android.hardware.Camera.PreviewCallback) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3.setPreviewCallbackWithBuffer(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x03a4:
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.stopPreview();	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x03ab:
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r2 = (p000.aau) r2;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r3.startPreview();	 Catch:{ RuntimeException -> 0x006e }
        if (r2 == 0) goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x03b6:
        r2.mo4a();	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x03bb:
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19768b;	 Catch:{ IOException -> 0x03c6 }
        r2 = (android.graphics.SurfaceTexture) r2;	 Catch:{ IOException -> 0x03c6 }
        r3.setPreviewTexture(r2);	 Catch:{ IOException -> 0x03c6 }
        goto L_0x004f;
    L_0x03c6:
        r2 = move-exception;
        r3 = p000.yo.f19743a;	 Catch:{ RuntimeException -> 0x006e }
        r4 = "Could not set preview texture";	 Catch:{ RuntimeException -> 0x006e }
        p000.abx.m85a(r3, r4, r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x03d0:
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.lock();	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19748e;	 Catch:{ RuntimeException -> 0x006e }
        r3 = 2;	 Catch:{ RuntimeException -> 0x006e }
        r2.m75a(r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x03df:
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.unlock();	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19748e;	 Catch:{ RuntimeException -> 0x006e }
        r3 = 4;	 Catch:{ RuntimeException -> 0x006e }
        r2.m75a(r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x03ee:
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r0 = r2;	 Catch:{ RuntimeException -> 0x006e }
        r0 = (p000.zz) r0;	 Catch:{ RuntimeException -> 0x006e }
        r8 = r0;	 Catch:{ RuntimeException -> 0x006e }
        r5 = r12.arg1;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19768b;	 Catch:{ IOException -> 0x04e9 }
        r2.reconnect();	 Catch:{ IOException -> 0x04e9 }
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19748e;	 Catch:{ RuntimeException -> 0x006e }
        r3 = 2;	 Catch:{ RuntimeException -> 0x006e }
        r2.m75a(r3);	 Catch:{ RuntimeException -> 0x006e }
        if (r8 == 0) goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0405:
        r2 = new yu;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r6 = r3.f19745b;	 Catch:{ RuntimeException -> 0x006e }
        r7 = r3.f19746c;	 Catch:{ RuntimeException -> 0x006e }
        r4 = r3;	 Catch:{ RuntimeException -> 0x006e }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x006e }
        r8.mo674a(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0416:
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        if (r2 == 0) goto L_0x042d;	 Catch:{ RuntimeException -> 0x006e }
    L_0x041a:
        r2.release();	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19748e;	 Catch:{ RuntimeException -> 0x006e }
        r3 = 1;	 Catch:{ RuntimeException -> 0x006e }
        r2.m75a(r3);	 Catch:{ RuntimeException -> 0x006e }
        r2 = 0;	 Catch:{ RuntimeException -> 0x006e }
        r11.f19768b = r2;	 Catch:{ RuntimeException -> 0x006e }
        r2 = -1;	 Catch:{ RuntimeException -> 0x006e }
        r11.f19769c = r2;	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x042d:
        r2 = p000.yo.f19743a;	 Catch:{ RuntimeException -> 0x006e }
        r3 = "Releasing camera without any camera opened.";	 Catch:{ RuntimeException -> 0x006e }
        p000.abx.m91e(r2, r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0436:
        r2 = r12.obj;	 Catch:{ RuntimeException -> 0x006e }
        r0 = r2;	 Catch:{ RuntimeException -> 0x006e }
        r0 = (p000.zy) r0;	 Catch:{ RuntimeException -> 0x006e }
        r8 = r0;	 Catch:{ RuntimeException -> 0x006e }
        r5 = r12.arg1;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19748e;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.m74a();	 Catch:{ RuntimeException -> 0x006e }
        if (r2 == r9) goto L_0x0451;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0448:
        r2 = r11.m82b(r5);	 Catch:{ RuntimeException -> 0x006e }
        r8.mo678b(r5, r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0451:
        r2 = p000.yo.f19743a;	 Catch:{ RuntimeException -> 0x006e }
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x006e }
        r3.<init>();	 Catch:{ RuntimeException -> 0x006e }
        r4 = "Opening camera ";	 Catch:{ RuntimeException -> 0x006e }
        r3.append(r4);	 Catch:{ RuntimeException -> 0x006e }
        r3.append(r5);	 Catch:{ RuntimeException -> 0x006e }
        r4 = " with camera1 API";	 Catch:{ RuntimeException -> 0x006e }
        r3.append(r4);	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x006e }
        p000.abx.m89c(r2, r3);	 Catch:{ RuntimeException -> 0x006e }
        r2 = android.hardware.Camera.open(r5);	 Catch:{ RuntimeException -> 0x006e }
        r11.f19768b = r2;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        if (r2 == 0) goto L_0x04bb;	 Catch:{ RuntimeException -> 0x006e }
    L_0x0476:
        r11.f19769c = r5;	 Catch:{ RuntimeException -> 0x006e }
        r3 = new zh;	 Catch:{ RuntimeException -> 0x006e }
        r3.<init>(r2);	 Catch:{ RuntimeException -> 0x006e }
        r11.f19770d = r3;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r3 = p000.ys.m14588b();	 Catch:{ RuntimeException -> 0x006e }
        r3 = r3.mo2550a(r5);	 Catch:{ RuntimeException -> 0x006e }
        r2.f19745b = r3;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r3 = new zo;	 Catch:{ RuntimeException -> 0x006e }
        r4 = r11.f19770d;	 Catch:{ RuntimeException -> 0x006e }
        r4 = r4.m6252a();	 Catch:{ RuntimeException -> 0x006e }
        r3.<init>(r4);	 Catch:{ RuntimeException -> 0x006e }
        r2.f19746c = r3;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19768b;	 Catch:{ RuntimeException -> 0x006e }
        r2.setErrorCallback(r11);	 Catch:{ RuntimeException -> 0x006e }
        r2 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r2 = r2.f19748e;	 Catch:{ RuntimeException -> 0x006e }
        r3 = 2;	 Catch:{ RuntimeException -> 0x006e }
        r2.m75a(r3);	 Catch:{ RuntimeException -> 0x006e }
        if (r8 == 0) goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x04a9:
        r2 = new yu;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19772f;	 Catch:{ RuntimeException -> 0x006e }
        r4 = r11.f19767a;	 Catch:{ RuntimeException -> 0x006e }
        r6 = r3.f19745b;	 Catch:{ RuntimeException -> 0x006e }
        r7 = r3.f19746c;	 Catch:{ RuntimeException -> 0x006e }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x006e }
        r8.mo674a(r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x04bb:
        if (r8 == 0) goto L_0x004f;	 Catch:{ RuntimeException -> 0x006e }
    L_0x04bd:
        r2 = r11.m82b(r5);	 Catch:{ RuntimeException -> 0x006e }
        r8.mo673a(r5, r2);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;
    L_0x04c6:
        r2 = p000.yo.f19743a;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Skip handleMessage - action = '";
        r3.append(r4);
        r4 = r12.what;
        r4 = p000.tz.m5876a(r4);
        r3.append(r4);
        r4 = "'";
        r3.append(r4);
        r3 = r3.toString();
        p000.abx.m90d(r2, r3);
        goto L_0x0052;
    L_0x04e9:
        r2 = move-exception;
        if (r8 == 0) goto L_0x004f;
    L_0x04ec:
        r2 = r11.f19767a;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.f19769c;	 Catch:{ RuntimeException -> 0x006e }
        r3 = r11.m82b(r3);	 Catch:{ RuntimeException -> 0x006e }
        r8.mo676a(r2, r3);	 Catch:{ RuntimeException -> 0x006e }
        goto L_0x004f;
    L_0x04f9:
        r3 = p000.yo.f19743a;	 Catch:{ all -> 0x00f1 }
        r5 = "Release camera since mCamera is not null.";	 Catch:{ all -> 0x00f1 }
        p000.abx.m89c(r3, r5);	 Catch:{ all -> 0x00f1 }
        r3 = r11.f19768b;	 Catch:{ Exception -> 0x051b }
        r3.release();	 Catch:{ Exception -> 0x051b }
        r3 = 0;
        r11.f19768b = r3;	 Catch:{ all -> 0x00f1 }
        goto L_0x00ba;	 Catch:{ all -> 0x00f1 }
    L_0x050a:
        r3 = r11.f19767a;	 Catch:{ all -> 0x00f1 }
        r3 = r3.mo2544b();	 Catch:{ all -> 0x00f1 }
        r5 = r11.f19769c;	 Catch:{ all -> 0x00f1 }
        r5 = r11.m82b(r5);	 Catch:{ all -> 0x00f1 }
        r3.mo2580a(r2, r5, r10, r4);	 Catch:{ all -> 0x00f1 }
        goto L_0x00d5;
    L_0x051b:
        r3 = move-exception;
        r5 = p000.yo.f19743a;	 Catch:{ all -> 0x0528 }
        r6 = "Fail when calling Camera.release().";	 Catch:{ all -> 0x0528 }
        p000.abx.m85a(r5, r6, r3);	 Catch:{ all -> 0x0528 }
        r3 = 0;
        r11.f19768b = r3;	 Catch:{ all -> 0x00f1 }
        goto L_0x00ba;	 Catch:{ all -> 0x00f1 }
    L_0x0528:
        r2 = move-exception;	 Catch:{ all -> 0x00f1 }
        r3 = 0;	 Catch:{ all -> 0x00f1 }
        r11.f19768b = r3;	 Catch:{ all -> 0x00f1 }
        throw r2;	 Catch:{ all -> 0x00f1 }
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.handleMessage(android.os.Message):void");
    }

    public final void onError(int i, Camera camera) {
        this.f19772f.f19750g.mo2578a(i);
        if (i == 100) {
            this.f19772f.f19750g.mo2580a(new RuntimeException("Media server died."), m82b(this.f19769c), ((Integer) this.f176r.peekLast()).intValue(), this.f19772f.f19748e.m74a());
        }
    }
}
