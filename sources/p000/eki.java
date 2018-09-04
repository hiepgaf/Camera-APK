package p000;

import android.content.Context;
import android.graphics.BitmapFactory.Options;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.Matrix;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* renamed from: eki */
public class eki implements Renderer {
    /* renamed from: A */
    public int f3754A = PhotoSphereMessageOverlay.f2380a;
    /* renamed from: B */
    public ekv f3755B = null;
    /* renamed from: C */
    public boolean f3756C = false;
    /* renamed from: D */
    public int f3757D = 0;
    /* renamed from: E */
    public int f3758E = 0;
    /* renamed from: F */
    public byte[] f3759F = null;
    /* renamed from: G */
    public boolean f3760G = false;
    /* renamed from: H */
    public eld f3761H;
    /* renamed from: I */
    public ejy f3762I;
    /* renamed from: J */
    private final ekr f3763J;
    /* renamed from: K */
    private final float[] f3764K = new float[16];
    /* renamed from: L */
    private final float[] f3765L = new float[16];
    /* renamed from: M */
    private final float[] f3766M = new float[16];
    /* renamed from: N */
    private final float[] f3767N = new float[16];
    /* renamed from: O */
    private final float[] f3768O = new float[16];
    /* renamed from: P */
    private final float[] f3769P = new float[16];
    /* renamed from: Q */
    private final float[] f3770Q = new float[16];
    /* renamed from: R */
    private final float[] f3771R = new float[16];
    /* renamed from: S */
    private float[] f3772S = new float[16];
    /* renamed from: T */
    private float f3773T = 60.0f;
    /* renamed from: U */
    private float f3774U = 100.0f;
    /* renamed from: V */
    private float f3775V = 100.0f;
    /* renamed from: W */
    private int f3776W = 120;
    /* renamed from: X */
    private int f3777X = 80;
    /* renamed from: Y */
    private boolean f3778Y = false;
    /* renamed from: Z */
    private int f3779Z;
    /* renamed from: a */
    public ejn f3780a;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private boolean ae = false;
    private boolean af = false;
    private int ag = 0;
    private boolean ah = false;
    private final ArrayList ai = new ArrayList();
    private gci aj;
    private boolean ak = false;
    private eky al;
    private eky am;
    private final eju an = new eju();
    private boolean ao = false;
    private long ap = 0;
    private boolean aq = false;
    private double ar = 0.0d;
    private double as = 0.0d;
    private final Vector at = new Vector();
    private final Context au;
    private int av = 0;
    private float aw = -1.0f;
    private HashMap ax = new HashMap();
    /* renamed from: b */
    public final ekn f3781b = new ekn();
    /* renamed from: c */
    public eko f3782c;
    /* renamed from: d */
    public final ekt f3783d;
    /* renamed from: e */
    public final PhotoSphereMessageOverlay f3784e;
    /* renamed from: f */
    public ejm f3785f;
    /* renamed from: g */
    public ejm f3786g;
    /* renamed from: h */
    public eks f3787h;
    /* renamed from: i */
    public ejr f3788i;
    /* renamed from: j */
    public elh f3789j;
    /* renamed from: k */
    public elk f3790k;
    /* renamed from: l */
    public ejs f3791l;
    /* renamed from: m */
    public eli f3792m;
    /* renamed from: n */
    public boolean f3793n = false;
    /* renamed from: o */
    public boolean f3794o = false;
    /* renamed from: p */
    public boolean f3795p = true;
    /* renamed from: q */
    public int f3796q;
    /* renamed from: r */
    public int f3797r;
    /* renamed from: s */
    public boolean f3798s = false;
    /* renamed from: t */
    public boolean f3799t = false;
    /* renamed from: u */
    public boolean f3800u = false;
    /* renamed from: v */
    public boolean f3801v = false;
    /* renamed from: w */
    public int f3802w = go.ag;
    /* renamed from: x */
    public boolean f3803x = false;
    /* renamed from: y */
    public boolean f3804y = false;
    /* renamed from: z */
    public boolean f3805z = false;

    static {
        eki.class.getSimpleName();
    }

    public eki(Context context, ekr ekr, PhotoSphereMessageOverlay photoSphereMessageOverlay, gci gci) {
        this.au = context;
        this.f3763J = ekr;
        this.f3784e = photoSphereMessageOverlay;
        this.aj = gci;
        this.f3783d = new ekt(this.au);
    }

    /* renamed from: a */
    public final void m1835a(float f) {
        m1838b(f);
        this.f3773T = this.f3774U;
        this.f3793n = false;
    }

    /* renamed from: b */
    private static eky m1831b(int i) {
        if (i == go.ah) {
            return new ela(true);
        }
        if (i == go.ai) {
            return new ela(false);
        }
        if (i == go.ag) {
            return new ekz();
        }
        if (i == go.ak) {
            return new ekx();
        }
        return i == go.aj ? new elb() : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r21) {
        /*
        r20 = this;
        r0 = r20;
        r2 = r0.f3794o;
        if (r2 == 0) goto L_0x000c;
    L_0x0006:
        r0 = r20;
        r2 = r0.f3800u;
        if (r2 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r20;
        r2 = r0.ab;
        if (r2 == 0) goto L_0x000c;
    L_0x0013:
        r2 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        android.opengl.GLES20.glClear(r2);
        r0 = r20;
        r2 = r0.f3794o;
        if (r2 == 0) goto L_0x000c;
    L_0x001e:
        r0 = r20;
        r2 = r0.f3800u;
        if (r2 != 0) goto L_0x000c;
    L_0x0024:
        r2 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1311j();
        if (r2 == 0) goto L_0x000c;
    L_0x002a:
        r0 = r20;
        r2 = r0.ae;
        if (r2 == 0) goto L_0x0a52;
    L_0x0030:
        r0 = r20;
        r2 = r0.f3798s;
        if (r2 != 0) goto L_0x0050;
    L_0x0036:
        r0 = r20;
        r2 = r0.f3756C;
        if (r2 == 0) goto L_0x0050;
    L_0x003c:
        r0 = r20;
        r2 = r0.f3802w;
        r3 = p000.go.ag;
        if (r2 != r3) goto L_0x0a4a;
    L_0x0044:
        r0 = r20;
        r2 = r0.f3803x;
        if (r2 != 0) goto L_0x0a4a;
    L_0x004a:
        r2 = 1;
        r0 = r20;
        r0.m1830a(r2);
    L_0x0050:
        r0 = r20;
        r2 = r0.f3761H;
        r3 = r2.f3901b;
        if (r3 == 0) goto L_0x0076;
    L_0x0058:
        r0 = r20;
        r3 = r0.f3795p;
        if (r3 == 0) goto L_0x09f4;
    L_0x005e:
        r4 = 0;
        r2.m1856a(r4);
    L_0x0063:
        r0 = r20;
        r2 = r0.f3761H;
        r2 = r2.m1858b();
        r0 = r20;
        r0.f3772S = r2;
        r0 = r20;
        r2 = r0.f3772S;
        com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1304c(r2);
    L_0x0076:
        r0 = r20;
        r2 = r0.f3760G;
        if (r2 == 0) goto L_0x0083;
    L_0x007c:
        r0 = r20;
        r2 = r0.f3797r;
        com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1303c(r2);
    L_0x0083:
        r0 = r20;
        r2 = r0.ag;
        if (r2 <= 0) goto L_0x041d;
    L_0x0089:
        r0 = r20;
        r10 = r0.f3797r;
        r2 = 3042; // 0xbe2 float:4.263E-42 double:1.503E-320;
        android.opengl.GLES20.glEnable(r2);
        r2 = 770; // 0x302 float:1.079E-42 double:3.804E-321;
        r3 = 771; // 0x303 float:1.08E-42 double:3.81E-321;
        android.opengl.GLES20.glBlendFunc(r2, r3);
        r0 = r20;
        r2 = r0.ab;
        r2 = (float) r2;
        r0 = r20;
        r3 = r0.ac;
        r3 = (float) r3;
        r3 = r2 / r3;
        r0 = r20;
        r2 = r0.f3775V;
        r0 = r20;
        r4 = r0.an;
        r4 = r4.m1809a();
        r0 = r20;
        r6 = r0.f3802w;
        r7 = p000.go.ag;
        if (r6 == r7) goto L_0x00c9;
    L_0x00b9:
        r0 = r20;
        r2 = r0.ak;
        if (r2 == 0) goto L_0x09e4;
    L_0x00bf:
        r0 = r20;
        r2 = r0.f3775V;
        r6 = (double) r2;
        r8 = 4625759767262920704; // 0x4032000000000000 float:0.0 double:18.0;
        r4 = r4 * r8;
        r4 = r4 + r6;
        r2 = (float) r4;
    L_0x00c9:
        r4 = (double) r2;
        r6 = 4645040803167600640; // 0x4076800000000000 float:0.0 double:360.0;
        r4 = r4 / r6;
        r6 = 4614256656552045848; // 0x400921fb54442d18 float:3.37028055E12 double:3.141592653589793;
        r4 = r4 * r6;
        r4 = java.lang.Math.tan(r4);
        r2 = (float) r4;
        r4 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r7 = r2 * r4;
        r5 = r7 * r3;
        r0 = r20;
        r2 = r0.f3766M;
        r3 = 0;
        r4 = -r5;
        r6 = -r7;
        r8 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r9 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        android.opengl.Matrix.frustumM(r2, r3, r4, r5, r6, r7, r8, r9);
        r0 = r20;
        r2 = r0.f3767N;
        r3 = 0;
        android.opengl.Matrix.setIdentityM(r2, r3);
        r0 = r20;
        r2 = r0.aj;
        r2 = r2.mo1448f();
        r4 = r2.m4041a();
        r0 = r20;
        r2 = r0.f3761H;
        r5 = r2.f3914o;
        r0 = r20;
        r2 = r0.f3767N;
        r3 = 0;
        r4 = (float) r4;
        r4 = r4 - r5;
        r5 = 0;
        r6 = 0;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.opengl.Matrix.rotateM(r2, r3, r4, r5, r6, r7);
        r0 = r20;
        r2 = r0.f3764K;
        r3 = 0;
        r0 = r20;
        r4 = r0.f3766M;
        r5 = 0;
        r0 = r20;
        r6 = r0.f3767N;
        r7 = 0;
        android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7);
        r0 = r20;
        r2 = r0.f3778Y;
        if (r2 != 0) goto L_0x0295;
    L_0x0131:
        r0 = r20;
        r2 = r0.f3769P;
        r3 = 0;
        r4 = 0;
        r0 = r20;
        r5 = r0.ab;
        r5 = (float) r5;
        r6 = 0;
        r0 = r20;
        r7 = r0.ac;
        r7 = (float) r7;
        r8 = -1035468800; // 0xffffffffc2480000 float:-50.0 double:NaN;
        r9 = 1112014848; // 0x42480000 float:50.0 double:5.49408334E-315;
        android.opengl.Matrix.orthoM(r2, r3, r4, r5, r6, r7, r8, r9);
        r0 = r20;
        r2 = r0.ab;
        r2 = r2 * 31;
        r0 = r20;
        r3 = r0.ac;
        r2 = r2 + r3;
        r3 = java.lang.Integer.valueOf(r2);
        r0 = r20;
        r2 = r0.ax;
        r2 = r2.get(r3);
        r2 = (p000.eks) r2;
        if (r2 == 0) goto L_0x0993;
    L_0x0164:
        r0 = r20;
        r0.f3787h = r2;
    L_0x0168:
        r0 = r20;
        r3 = r0.f3783d;
        r0 = r20;
        r4 = r0.ab;
        r0 = r20;
        r5 = r0.ac;
        r0 = r20;
        r6 = r0.f3787h;
        r2 = new android.graphics.BitmapFactory$Options;
        r2.<init>();
        r7 = 0;
        r2.inScaled = r7;
        r7 = r3.f3835c;
        r7 = r7.getResources();
        r8 = 2130837806; // 0x7f02012e float:1.7280576E38 double:1.052773757E-314;
        r2 = android.graphics.BitmapFactory.decodeResource(r7, r8, r2);
        if (r2 == 0) goto L_0x0192;
    L_0x018f:
        r2.recycle();
    L_0x0192:
        r2 = new ejt;
        r2.<init>();
        r3.f3837e = r2;
        r2 = r3.f3837e;
        r7 = r3.f3835c;
        r8 = 2130837806; // 0x7f02012e float:1.7280576E38 double:1.052773757E-314;
        r9 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2.m9721a(r7, r8, r9);
        r2 = new ejt;
        r2.<init>();
        r3.f3838f = r2;
        r2 = r3.f3838f;
        r7 = r3.f3835c;
        r8 = 2130837805; // 0x7f02012d float:1.7280574E38 double:1.0527737563E-314;
        r9 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2.m9721a(r7, r8, r9);
        r2 = new elj;	 Catch:{ ejp -> 0x0abd }
        r2.<init>();	 Catch:{ ejp -> 0x0abd }
        r3.f3839g = r2;	 Catch:{ ejp -> 0x0abd }
        r2 = new eli;	 Catch:{ ejp -> 0x0abd }
        r2.<init>();	 Catch:{ ejp -> 0x0abd }
        r3.f3840h = r2;	 Catch:{ ejp -> 0x0abd }
    L_0x01c6:
        r2 = r3.f3837e;
        r7 = r3.f3839g;
        r2.f3685e = r7;
        r2 = r3.f3838f;
        r2.f3685e = r7;
        r2 = (float) r4;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r4;
        r3.f3845m = r2;
        r2 = (float) r5;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r4;
        r3.f3846n = r2;
        r2 = r3.f3855w;
        r4 = 0;
        android.opengl.Matrix.setIdentityM(r2, r4);
        r3.f3856x = r6;
        r0 = r20;
        r2 = r0.f3783d;
        r0 = r20;
        r3 = r0.f3761H;
        r2.f3849q = r3;
        r0 = r20;
        r2 = r0.au;
        r3 = new android.graphics.BitmapFactory$Options;
        r3.<init>();
        r4 = 0;
        r3.inScaled = r4;
        r4 = 1;
        r3.inJustDecodeBounds = r4;
        r2 = r2.getResources();
        r4 = 2130837645; // 0x7f02008d float:1.728025E38 double:1.0527736773E-314;
        android.graphics.BitmapFactory.decodeResource(r2, r4, r3);
        r2 = new abw;
        r4 = r3.outWidth;
        r3 = r3.outHeight;
        r2.<init>(r4, r3);
        r2 = r2.f178a;
        r2 = r2.y;
        r2 = (float) r2;
        r3 = 1062836634; // 0x3f59999a float:0.85 double:5.25111068E-315;
        r2 = r2 * r3;
        r2 = (int) r2;
        r0 = r20;
        r3 = r0.ac;
        r3 = r3 / 2;
        r0 = r20;
        r4 = r0.ab;
        r4 = r4 / 2;
        r4 = (float) r4;
        r5 = new android.graphics.PointF;
        r6 = r3 + r2;
        r6 = (float) r6;
        r5.<init>(r4, r6);
        r6 = new android.graphics.PointF;
        r2 = r3 - r2;
        r2 = (float) r2;
        r6.<init>(r4, r2);
        r2 = new ejm;
        r2.<init>();
        r0 = r20;
        r0.f3785f = r2;
        r2 = new ejm;
        r2.<init>();
        r0 = r20;
        r0.f3786g = r2;
        r0 = r20;
        r2 = r0.f3785f;
        r0 = r20;
        r3 = r0.au;
        r4 = 2130837804; // 0x7f02012c float:1.7280572E38 double:1.052773756E-314;
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2.m9721a(r3, r4, r7);
        r0 = r20;
        r2 = r0.f3786g;
        r0 = r20;
        r3 = r0.au;
        r4 = 2130837803; // 0x7f02012b float:1.728057E38 double:1.0527737553E-314;
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2.m9721a(r3, r4, r7);
        r0 = r20;
        r2 = r0.f3785f;
        r2.m15629a(r5);
        r0 = r20;
        r2 = r0.f3786g;
        r2.m15629a(r6);
        r2 = new eli;	 Catch:{ ejp -> 0x0ac5 }
        r2.<init>();	 Catch:{ ejp -> 0x0ac5 }
        r0 = r20;
        r0.f3792m = r2;	 Catch:{ ejp -> 0x0ac5 }
    L_0x0280:
        r0 = r20;
        r2 = r0.f3785f;
        r0 = r20;
        r3 = r0.f3792m;
        r2.f3685e = r3;
        r0 = r20;
        r2 = r0.f3786g;
        r2.f3685e = r3;
        r2 = 1;
        r0 = r20;
        r0.f3778Y = r2;
    L_0x0295:
        r0 = r20;
        r2 = r0.f3781b;
        r3 = 1;
        r2.f15237l = r3;
        r0 = r20;
        r3 = r0.f3760G;
        if (r3 == 0) goto L_0x098e;
    L_0x02a2:
        r3 = 1;
        r2.f15238m = r3;
    L_0x02a5:
        r0 = r20;
        r2 = r0.av;
        r3 = 3;
        if (r2 <= r3) goto L_0x098b;
    L_0x02ac:
        r2 = 1;
    L_0x02ad:
        r0 = r20;
        r3 = r0.f3782c;
        r3 = r3.f15239f;
        r3 = r3.size();
        if (r3 == 0) goto L_0x0983;
    L_0x02b9:
        r3 = 0;
    L_0x02ba:
        r0 = r20;
        r0.f3760G = r3;
        r0 = r20;
        r3 = r0.f3760G;
        if (r3 != 0) goto L_0x02cb;
    L_0x02c4:
        r0 = r20;
        r3 = r0.f3781b;
        r4 = 0;
        r3.f15238m = r4;
    L_0x02cb:
        r0 = r20;
        r3 = r0.f3781b;
        r3.f15237l = r2;
        r3.m9734a(r10);
        r0 = r20;
        r3 = r0.f3763J;
        r0 = r20;
        r2 = r0.f3782c;
        r2 = r2.f15239f;
        r2 = r2.size();
        if (r2 <= 0) goto L_0x0980;
    L_0x02e4:
        r0 = r20;
        r2 = r0.f3762I;
        r2 = r2.f3712D;
        r2 = r2.f3705b;
        if (r2 != 0) goto L_0x097d;
    L_0x02ee:
        r2 = 1;
    L_0x02ef:
        r4 = r3.f3823a;
        if (r2 == r4) goto L_0x02f5;
    L_0x02f3:
        r3.f3823a = r2;
    L_0x02f5:
        r2 = 0;
        r3 = 0;
        r0 = r20;
        r4 = r0.f3779Z;
        r0 = r20;
        r5 = r0.aa;
        android.opengl.GLES20.glViewport(r2, r3, r4, r5);
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        android.opengl.GLES20.glClear(r2);
        r2 = 2929; // 0xb71 float:4.104E-42 double:1.447E-320;
        android.opengl.GLES20.glEnable(r2);
        r0 = r20;
        r2 = r0.f3768O;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r4 = r0.f3767N;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r6 = r0.f3772S;	 Catch:{ ejp -> 0x0417 }
        r3 = 0;
        r5 = 0;
        r7 = 0;
        android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3764K;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r4 = r0.f3766M;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r6 = r0.f3768O;	 Catch:{ ejp -> 0x0417 }
        r3 = 0;
        r5 = 0;
        r7 = 0;
        android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7);	 Catch:{ ejp -> 0x0417 }
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        android.opengl.GLES20.glLineWidth(r2);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3780a;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r3 = r0.f3764K;	 Catch:{ ejp -> 0x0417 }
        r2.mo1228b(r3);	 Catch:{ ejp -> 0x0417 }
        r2 = 2929; // 0xb71 float:4.104E-42 double:1.447E-320;
        android.opengl.GLES20.glDisable(r2);	 Catch:{ ejp -> 0x0417 }
        r2 = 3042; // 0xbe2 float:4.263E-42 double:1.503E-320;
        android.opengl.GLES20.glEnable(r2);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3782c;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r3 = r0.f3764K;	 Catch:{ ejp -> 0x0417 }
        r2.mo3019a(r3);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3767N;	 Catch:{ ejp -> 0x0417 }
        r3 = 0;
        android.opengl.Matrix.setIdentityM(r2, r3);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.aj;	 Catch:{ ejp -> 0x0417 }
        r2 = r2.mo1448f();	 Catch:{ ejp -> 0x0417 }
        r2 = r2.m4041a();	 Catch:{ ejp -> 0x0417 }
        r2 = (float) r2;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r3 = r0.f3761H;	 Catch:{ ejp -> 0x0417 }
        r3 = r3.f3914o;	 Catch:{ ejp -> 0x0417 }
        r4 = r2 - r3;
        r0 = r20;
        r2 = r0.f3767N;	 Catch:{ ejp -> 0x0417 }
        r3 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.opengl.Matrix.rotateM(r2, r3, r4, r5, r6, r7);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3767N;	 Catch:{ ejp -> 0x0417 }
        r3 = 0;
        r4 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = 0;
        r7 = 0;
        android.opengl.Matrix.rotateM(r2, r3, r4, r5, r6, r7);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3765L;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r4 = r0.f3766M;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r6 = r0.f3767N;	 Catch:{ ejp -> 0x0417 }
        r3 = 0;
        r5 = 0;
        r7 = 0;
        android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3791l;	 Catch:{ ejp -> 0x0417 }
        r3 = p000.ejd.f3653d;	 Catch:{ ejp -> 0x0417 }
        r2.m9717b(r3);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3793n;	 Catch:{ ejp -> 0x0417 }
        if (r2 == 0) goto L_0x0975;
    L_0x03ad:
        r0 = r20;
        r2 = r0.f3795p;	 Catch:{ ejp -> 0x0417 }
        if (r2 != 0) goto L_0x0956;
    L_0x03b3:
        r0 = r20;
        r14 = r0.f3783d;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3772S;	 Catch:{ ejp -> 0x0417 }
        r14.f3844l = r2;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r4 = r0.f3764K;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r15 = r0.f3769P;	 Catch:{ ejp -> 0x0417 }
        r16 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1309h();	 Catch:{ ejp -> 0x0417 }
        if (r16 < 0) goto L_0x0951;
    L_0x03cb:
        r2 = r14.f3847o;	 Catch:{ ejp -> 0x0417 }
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = r3 - r2;
        r5 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r3 = r3 * r5;
        r2 = r2 + r3;
        r14.f3847o = r2;	 Catch:{ ejp -> 0x0417 }
    L_0x03d7:
        r2 = r14.f3849q;	 Catch:{ ejp -> 0x0417 }
        r2 = r2.f3916q;	 Catch:{ ejp -> 0x0417 }
        r2 = (double) r2;	 Catch:{ ejp -> 0x0417 }
        r2 = java.lang.Math.sqrt(r2);	 Catch:{ ejp -> 0x0417 }
        r2 = (float) r2;	 Catch:{ ejp -> 0x0417 }
        r3 = 1060288706; // 0x3f32b8c2 float:0.6981317 double:5.238522243E-315;
        r2 = java.lang.Math.min(r2, r3);	 Catch:{ ejp -> 0x0417 }
        r3 = 1043511490; // 0x3e32b8c2 float:0.17453292 double:5.155631782E-315;
        r2 = java.lang.Math.max(r2, r3);	 Catch:{ ejp -> 0x0417 }
        r3 = -1103972158; // 0xffffffffbe32b8c2 float:-0.17453292 double:NaN;
        r2 = r2 + r3;
        r3 = 1057360530; // 0x3f060a92 float:0.5235988 double:5.22405513E-315;
        r2 = r2 / r3;
        r3 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        r2 = r2 * r3;
        r3 = 1076887552; // 0x40300000 float:2.75 double:5.32053144E-315;
        r2 = r2 + r3;
        r3 = 1016003125; // 0x3c8efa35 float:0.017453292 double:5.0197224E-315;
        r2 = r2 * r3;
        r3 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.f2376a;	 Catch:{ ejp -> 0x0417 }
        monitor-enter(r3);	 Catch:{ ejp -> 0x0417 }
        r5 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.f2377b;	 Catch:{ all -> 0x0414 }
        r5 = r5.booleanValue();	 Catch:{ all -> 0x0414 }
        if (r5 != 0) goto L_0x0457;
    L_0x040c:
        r2 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0414 }
        r4 = "State is not ready.";
        r2.<init>(r4);	 Catch:{ all -> 0x0414 }
        throw r2;	 Catch:{ all -> 0x0414 }
    L_0x0414:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0414 }
        throw r2;	 Catch:{ ejp -> 0x0417 }
    L_0x0417:
        r2 = move-exception;
        r3 = p000.kqg.f8420a;
        r3.mo2210b(r2);
    L_0x041d:
        r0 = r20;
        r2 = r0.f3797r;
        r0 = r20;
        r3 = r0.f3796q;
        r0 = r20;
        r0.f3797r = r3;
        r0 = r20;
        r0.f3796q = r2;
        r0 = r20;
        r2 = r0.ag;
        r2 = r2 + 1;
        r0 = r20;
        r0.ag = r2;
        r0 = r20;
        r2 = r0.ag;
        if (r2 != 0) goto L_0x0444;
    L_0x043d:
        r2 = java.util.Calendar.getInstance();
        r2.getTimeInMillis();
    L_0x0444:
        r0 = r20;
        r2 = r0.ag;
        r3 = r2 % 30;
        if (r3 != 0) goto L_0x000c;
    L_0x044c:
        if (r2 == 0) goto L_0x000c;
    L_0x044e:
        r2 = java.util.Calendar.getInstance();
        r2.getTimeInMillis();
        goto L_0x000c;
    L_0x0457:
        com.google.android.apps.lightcycle.panorama.LightCycleNative.SetTargetHitAngleRadians(r2);	 Catch:{ all -> 0x0414 }
        monitor-exit(r3);	 Catch:{ all -> 0x0414 }
        r17 = new ejk;	 Catch:{ ejp -> 0x0417 }
        r2 = r14.f3844l;	 Catch:{ ejp -> 0x0417 }
        r3 = 2;
        r3 = r2[r3];	 Catch:{ ejp -> 0x0417 }
        r3 = -r3;
        r5 = 6;
        r5 = r2[r5];	 Catch:{ ejp -> 0x0417 }
        r5 = -r5;
        r6 = 10;
        r2 = r2[r6];	 Catch:{ ejp -> 0x0417 }
        r2 = -r2;
        r0 = r17;
        r0.<init>(r3, r5, r2);	 Catch:{ ejp -> 0x0417 }
        r2 = 1;
        r3 = 771; // 0x303 float:1.08E-42 double:3.81E-321;
        android.opengl.GLES20.glBlendFunc(r2, r3);	 Catch:{ ejp -> 0x0417 }
        r2 = r14.f3839g;	 Catch:{ ejp -> 0x0417 }
        r2 = r2.f3693d;	 Catch:{ ejp -> 0x0417 }
        android.opengl.GLES20.glUseProgram(r2);	 Catch:{ ejp -> 0x0417 }
        r2 = r14.f3839g;	 Catch:{ ejp -> 0x0417 }
        r2 = r2.f15274e;	 Catch:{ ejp -> 0x0417 }
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.opengl.GLES20.glUniform1f(r2, r3);	 Catch:{ ejp -> 0x0417 }
        r2 = r14.f3839g;	 Catch:{ ejp -> 0x0417 }
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.m9746a(r3);	 Catch:{ ejp -> 0x0417 }
        r0 = r14.f3836d;	 Catch:{ ejp -> 0x0573 }
        r18 = r0;
        monitor-enter(r18);	 Catch:{ ejp -> 0x0573 }
        r2 = r14.f3836d;	 Catch:{ all -> 0x0570 }
        r2 = r2.entrySet();	 Catch:{ all -> 0x0570 }
        r19 = r2.iterator();	 Catch:{ all -> 0x0570 }
    L_0x049d:
        r2 = r19.hasNext();	 Catch:{ all -> 0x0570 }
        if (r2 == 0) goto L_0x0785;
    L_0x04a3:
        r2 = r19.next();	 Catch:{ all -> 0x0570 }
        r0 = r2;
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0570 }
        r13 = r0;
        r6 = r13.getValue();	 Catch:{ all -> 0x0570 }
        r6 = (float[]) r6;	 Catch:{ all -> 0x0570 }
        r2 = r14.f3843k;	 Catch:{ all -> 0x0570 }
        r3 = 0;
        r5 = 0;
        r7 = 0;
        android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0570 }
        r7 = r14.f3842j;	 Catch:{ all -> 0x0570 }
        r9 = r14.f3843k;	 Catch:{ all -> 0x0570 }
        r11 = r14.f3841i;	 Catch:{ all -> 0x0570 }
        r8 = 0;
        r10 = 0;
        r12 = 0;
        android.opengl.Matrix.multiplyMV(r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0570 }
        r2 = r14.f3850r;	 Catch:{ all -> 0x0570 }
        r3 = new ejk;	 Catch:{ all -> 0x0570 }
        r5 = 8;
        r5 = r6[r5];	 Catch:{ all -> 0x0570 }
        r5 = -r5;
        r7 = 9;
        r7 = r6[r7];	 Catch:{ all -> 0x0570 }
        r7 = -r7;
        r8 = 10;
        r6 = r6[r8];	 Catch:{ all -> 0x0570 }
        r6 = -r6;
        r3.<init>(r5, r7, r6);	 Catch:{ all -> 0x0570 }
        r5 = r3.f3675a;	 Catch:{ all -> 0x0570 }
        r0 = r17;
        r6 = r0.f3675a;	 Catch:{ all -> 0x0570 }
        r5 = r5 * r6;
        r6 = r3.f3676b;	 Catch:{ all -> 0x0570 }
        r0 = r17;
        r7 = r0.f3676b;	 Catch:{ all -> 0x0570 }
        r6 = r6 * r7;
        r5 = r5 + r6;
        r3 = r3.f3677c;	 Catch:{ all -> 0x0570 }
        r0 = r17;
        r6 = r0.f3677c;	 Catch:{ all -> 0x0570 }
        r3 = r3 * r6;
        r3 = r3 + r5;
        r6 = (double) r3;	 Catch:{ all -> 0x0570 }
        r6 = java.lang.Math.acos(r6);	 Catch:{ all -> 0x0570 }
        r3 = (float) r6;	 Catch:{ all -> 0x0570 }
        r5 = p000.ekt.f3834b;	 Catch:{ all -> 0x0570 }
        r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r5 >= 0) goto L_0x0758;
    L_0x04fe:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.f3857a = r3;	 Catch:{ all -> 0x0570 }
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.f3858b = r3;	 Catch:{ all -> 0x0570 }
    L_0x0506:
        r2 = r14.f3848p;	 Catch:{ all -> 0x0570 }
        if (r2 != 0) goto L_0x0754;
    L_0x050a:
        r2 = r14.f3850r;	 Catch:{ all -> 0x0570 }
        r3 = r2.f3857a;	 Catch:{ all -> 0x0570 }
    L_0x050e:
        r2 = r14.f3850r;	 Catch:{ all -> 0x0570 }
        r2 = r2.f3858b;	 Catch:{ all -> 0x0570 }
        r5 = r14.f3836d;	 Catch:{ all -> 0x0570 }
        r5 = r5.size();	 Catch:{ all -> 0x0570 }
        r6 = 1;
        if (r5 != r6) goto L_0x06da;
    L_0x051b:
        r2 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        r3 = java.lang.Math.max(r2, r3);	 Catch:{ all -> 0x0570 }
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = r3;
        r3 = r2;
    L_0x0525:
        r2 = r14.f3842j;	 Catch:{ all -> 0x0570 }
        r6 = 3;
        r6 = r2[r6];	 Catch:{ all -> 0x0570 }
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 < 0) goto L_0x049d;
    L_0x052f:
        p000.ekt.m1842b(r2);	 Catch:{ all -> 0x0570 }
        r2 = r14.f3842j;	 Catch:{ all -> 0x0570 }
        r6 = 0;
        r6 = r2[r6];	 Catch:{ all -> 0x0570 }
        r7 = r14.f3845m;	 Catch:{ all -> 0x0570 }
        r6 = r6 * r7;
        r6 = r6 + r7;
        r7 = 1;
        r2 = r2[r7];	 Catch:{ all -> 0x0570 }
        r7 = r14.f3846n;	 Catch:{ all -> 0x0570 }
        r2 = r2 * r7;
        r7 = r7 + r2;
        r2 = r13.getKey();	 Catch:{ all -> 0x0570 }
        r2 = (java.lang.Integer) r2;	 Catch:{ all -> 0x0570 }
        r2 = r2.intValue();	 Catch:{ all -> 0x0570 }
        r0 = r16;
        if (r2 != r0) goto L_0x06ce;
    L_0x0550:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r2 - r5;
        r8 = r14.f3839g;	 Catch:{ all -> 0x0570 }
        r8.m9746a(r5);	 Catch:{ all -> 0x0570 }
        r5 = r14.f3838f;	 Catch:{ all -> 0x0570 }
        r5.m9720a(r15, r6, r7, r3);	 Catch:{ all -> 0x0570 }
        r5 = r14.f3839g;	 Catch:{ all -> 0x0570 }
        r5.m9746a(r2);	 Catch:{ all -> 0x0570 }
        r2 = r14.f3837e;	 Catch:{ all -> 0x0570 }
        r2.m9720a(r15, r6, r7, r3);	 Catch:{ all -> 0x0570 }
        r2 = r14.f3839g;	 Catch:{ all -> 0x0570 }
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.m9746a(r3);	 Catch:{ all -> 0x0570 }
        goto L_0x049d;
    L_0x0570:
        r2 = move-exception;
        monitor-exit(r18);	 Catch:{ all -> 0x0570 }
        throw r2;	 Catch:{ ejp -> 0x0573 }
    L_0x0573:
        r2 = move-exception;
        r3 = p000.kqg.f8420a;	 Catch:{ ejp -> 0x0417 }
        r3.mo2210b(r2);	 Catch:{ ejp -> 0x0417 }
    L_0x0579:
        r2 = 770; // 0x302 float:1.079E-42 double:3.804E-321;
        r3 = 771; // 0x303 float:1.08E-42 double:3.81E-321;
        android.opengl.GLES20.glBlendFunc(r2, r3);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3802w;	 Catch:{ ejp -> 0x0417 }
        r3 = p000.go.ag;	 Catch:{ ejp -> 0x0417 }
        if (r2 == r3) goto L_0x05d9;
    L_0x0588:
        r0 = r20;
        r2 = r0.f3803x;	 Catch:{ ejp -> 0x0417 }
        if (r2 != 0) goto L_0x05d9;
    L_0x058e:
        r0 = r20;
        r2 = r0.an;	 Catch:{ ejp -> 0x0417 }
        r8 = r2.m1809a();	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3765L;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r4 = r0.f3766M;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r6 = r0.f3767N;	 Catch:{ ejp -> 0x0417 }
        r3 = 0;
        r5 = 0;
        r7 = 0;
        android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.ak;	 Catch:{ ejp -> 0x0417 }
        if (r2 == 0) goto L_0x082b;
    L_0x05ae:
        r0 = r20;
        r2 = r0.al;	 Catch:{ ejp -> 0x0417 }
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = (float) r8;	 Catch:{ ejp -> 0x0417 }
        r3 = r3 - r4;
        r0 = r20;
        r4 = r0.f3783d;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r5 = r0.f3769P;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r6 = r0.ab;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r7 = r0.ac;	 Catch:{ ejp -> 0x0417 }
        r2.mo1229a(r3, r4, r5, r6, r7);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.an;	 Catch:{ ejp -> 0x0417 }
        r3 = r2.f3694a;	 Catch:{ ejp -> 0x0417 }
        if (r3 == 0) goto L_0x05d9;
    L_0x05d1:
        r2.m1810b();	 Catch:{ ejp -> 0x0417 }
        r2 = 0;
        r0 = r20;
        r0.ak = r2;	 Catch:{ ejp -> 0x0417 }
    L_0x05d9:
        r2 = 3042; // 0xbe2 float:4.263E-42 double:1.503E-320;
        android.opengl.GLES20.glDisable(r2);	 Catch:{ ejp -> 0x0417 }
        r2 = 2929; // 0xb71 float:4.104E-42 double:1.447E-320;
        android.opengl.GLES20.glDisable(r2);	 Catch:{ ejp -> 0x0417 }
        r2 = 770; // 0x302 float:1.079E-42 double:3.804E-321;
        r3 = 771; // 0x303 float:1.08E-42 double:3.81E-321;
        android.opengl.GLES20.glBlendFunc(r2, r3);	 Catch:{ ejp -> 0x0417 }
        r2 = 2929; // 0xb71 float:4.104E-42 double:1.447E-320;
        android.opengl.GLES20.glDisable(r2);	 Catch:{ ejp -> 0x0417 }
        r2 = 3042; // 0xbe2 float:4.263E-42 double:1.503E-320;
        android.opengl.GLES20.glEnable(r2);	 Catch:{ ejp -> 0x0417 }
        r3 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1305d();	 Catch:{ ejp -> 0x0417 }
        if (r3 != 0) goto L_0x0674;
    L_0x05fa:
        r0 = r20;
        r2 = r0.aq;	 Catch:{ ejp -> 0x0417 }
        if (r2 != 0) goto L_0x0610;
    L_0x0600:
        r2 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1313l();	 Catch:{ ejp -> 0x0417 }
        if (r2 == 0) goto L_0x0610;
    L_0x0606:
        r2 = 1;
        r0 = r20;
        r0.aq = r2;	 Catch:{ ejp -> 0x0417 }
        r2 = 0;
        r0 = r20;
        r0.ao = r2;	 Catch:{ ejp -> 0x0417 }
    L_0x0610:
        r0 = r20;
        r2 = r0.aq;	 Catch:{ ejp -> 0x0417 }
        if (r2 == 0) goto L_0x062e;
    L_0x0616:
        r2 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1313l();	 Catch:{ ejp -> 0x0417 }
        if (r2 != 0) goto L_0x062e;
    L_0x061c:
        r2 = 0;
        r0 = r20;
        r0.aq = r2;	 Catch:{ ejp -> 0x0417 }
        r2 = 1;
        r0 = r20;
        r0.ao = r2;	 Catch:{ ejp -> 0x0417 }
        r4 = android.os.SystemClock.elapsedRealtimeNanos();	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r0.ap = r4;	 Catch:{ ejp -> 0x0417 }
    L_0x062e:
        r0 = r20;
        r2 = r0.ao;	 Catch:{ ejp -> 0x0417 }
        if (r2 == 0) goto L_0x0674;
    L_0x0634:
        r4 = android.os.SystemClock.elapsedRealtimeNanos();	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r6 = r0.ap;	 Catch:{ ejp -> 0x0417 }
        r4 = r4 - r6;
        r4 = (double) r4;	 Catch:{ ejp -> 0x0417 }
        r6 = 4741671816366391296; // 0x41cdcd6500000000 float:0.0 double:1.0E9;
        r4 = r4 / r6;
        r6 = 4598175219545276416; // 0x3fd0000000000000 float:0.0 double:0.25;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x0674;
    L_0x064a:
        r2 = 0;
        r0 = r20;
        r0.ao = r2;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r4 = r0.f3784e;	 Catch:{ ejp -> 0x0417 }
        r5 = com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay.f2382c;	 Catch:{ ejp -> 0x0417 }
        r2 = 2131624293; // 0x7f0e0165 float:1.8875762E38 double:1.053162333E-314;
        r2 = r4.findViewById(r2);	 Catch:{ ejp -> 0x0417 }
        r2 = (android.widget.TextView) r2;	 Catch:{ ejp -> 0x0417 }
        r6 = r4.f2383d;	 Catch:{ ejp -> 0x0417 }
        r7 = new elx;	 Catch:{ ejp -> 0x0417 }
        r7.<init>(r2, r5);	 Catch:{ ejp -> 0x0417 }
        r6.post(r7);	 Catch:{ ejp -> 0x0417 }
        r4 = r4.f2383d;	 Catch:{ ejp -> 0x0417 }
        r5 = new ely;	 Catch:{ ejp -> 0x0417 }
        r5.<init>(r2);	 Catch:{ ejp -> 0x0417 }
        r6 = 750; // 0x2ee float:1.051E-42 double:3.705E-321;
        r4.postDelayed(r5, r6);	 Catch:{ ejp -> 0x0417 }
    L_0x0674:
        r0 = r20;
        r2 = r0.f3802w;	 Catch:{ ejp -> 0x0417 }
        r4 = p000.go.ah;	 Catch:{ ejp -> 0x0417 }
        if (r2 == r4) goto L_0x0828;
    L_0x067c:
        r0 = r20;
        r2 = r0.f3802w;	 Catch:{ ejp -> 0x0417 }
        r4 = p000.go.ai;	 Catch:{ ejp -> 0x0417 }
        if (r2 == r4) goto L_0x0825;
    L_0x0684:
        r0 = r20;
        r2 = r0.f3802w;	 Catch:{ ejp -> 0x0417 }
        r4 = p000.go.aj;	 Catch:{ ejp -> 0x0417 }
        if (r2 == r4) goto L_0x0822;
    L_0x068c:
        r2 = 0;
    L_0x068d:
        r0 = r20;
        r4 = r0.f3795p;	 Catch:{ ejp -> 0x0417 }
        if (r4 == 0) goto L_0x06b8;
    L_0x0693:
        if (r2 != 0) goto L_0x06b8;
    L_0x0695:
        r0 = r20;
        r2 = r0.f3769P;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r4 = r0.f3761H;	 Catch:{ ejp -> 0x0417 }
        r4 = r4.m1858b();	 Catch:{ ejp -> 0x0417 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ ejp -> 0x0417 }
        r4 = -r4;
        r5 = 3042; // 0xbe2 float:4.263E-42 double:1.503E-320;
        android.opengl.GLES20.glEnable(r5);	 Catch:{ ejp -> 0x0417 }
        r5 = 1051900098; // 0x3eb2b8c2 float:0.34906584 double:5.197077013E-315;
        r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r5 > 0) goto L_0x0807;
    L_0x06b1:
        r5 = -1095583550; // 0xffffffffbeb2b8c2 float:-0.34906584 double:NaN;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 < 0) goto L_0x07e4;
    L_0x06b8:
        if (r3 == 0) goto L_0x07d4;
    L_0x06ba:
        r2 = -1;
        if (r3 != r2) goto L_0x07d1;
    L_0x06bd:
        r2 = 1;
    L_0x06be:
        r0 = r20;
        r3 = r0.f3784e;	 Catch:{ ejp -> 0x0417 }
        r4 = r3.f2383d;	 Catch:{ ejp -> 0x0417 }
        r5 = new elz;	 Catch:{ ejp -> 0x0417 }
        r5.<init>(r3, r2);	 Catch:{ ejp -> 0x0417 }
        r4.post(r5);	 Catch:{ ejp -> 0x0417 }
        goto L_0x041d;
    L_0x06ce:
        r2 = r14.f3839g;	 Catch:{ all -> 0x0570 }
        r2.m9746a(r5);	 Catch:{ all -> 0x0570 }
        r2 = r14.f3837e;	 Catch:{ all -> 0x0570 }
        r2.m9720a(r15, r6, r7, r3);	 Catch:{ all -> 0x0570 }
        goto L_0x049d;
    L_0x06da:
        r5 = r14.f3851s;	 Catch:{ all -> 0x0570 }
        if (r5 == 0) goto L_0x0750;
    L_0x06de:
        r5 = r14.f3848p;	 Catch:{ all -> 0x0570 }
        if (r5 != 0) goto L_0x074c;
    L_0x06e2:
        r5 = r14.f3853u;	 Catch:{ all -> 0x0570 }
        r3 = java.lang.Math.max(r5, r3);	 Catch:{ all -> 0x0570 }
        r5 = r14.f3852t;	 Catch:{ all -> 0x0570 }
        if (r5 == 0) goto L_0x0743;
    L_0x06ec:
        r5 = r14.f3853u;	 Catch:{ all -> 0x0570 }
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = r6 - r5;
        r7 = 1008981770; // 0x3c23d70a float:0.01 double:4.9850323E-315;
        r6 = r6 * r7;
        r5 = r5 + r6;
        r14.f3853u = r5;	 Catch:{ all -> 0x0570 }
        r5 = r14.f3853u;	 Catch:{ all -> 0x0570 }
        r6 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x070f;
    L_0x0701:
        r6 = r14.f3854v;	 Catch:{ all -> 0x0570 }
        r8 = 0;
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 != 0) goto L_0x0726;
    L_0x0709:
        r6 = android.os.SystemClock.elapsedRealtimeNanos();	 Catch:{ all -> 0x0570 }
        r14.f3854v = r6;	 Catch:{ all -> 0x0570 }
    L_0x070f:
        r5 = r14.f3853u;	 Catch:{ all -> 0x0570 }
        r6 = 1008981770; // 0x3c23d70a float:0.01 double:4.9850323E-315;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x0722;
    L_0x0718:
        r5 = 0;
        r14.f3853u = r5;	 Catch:{ all -> 0x0570 }
        r5 = 0;
        r14.f3851s = r5;	 Catch:{ all -> 0x0570 }
        r5 = r3;
        r3 = r2;
        goto L_0x0525;
    L_0x0722:
        r5 = r3;
        r3 = r2;
        goto L_0x0525;
    L_0x0726:
        r6 = android.os.SystemClock.elapsedRealtimeNanos();	 Catch:{ all -> 0x0570 }
        r8 = r14.f3854v;	 Catch:{ all -> 0x0570 }
        r6 = r6 - r8;
        r6 = (double) r6;	 Catch:{ all -> 0x0570 }
        r8 = 4741671816366391296; // 0x41cdcd6500000000 float:0.0 double:1.0E9;
        r6 = r6 / r8;
        r8 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 <= 0) goto L_0x073d;
    L_0x073a:
        r5 = 0;
        r14.f3852t = r5;	 Catch:{ all -> 0x0570 }
    L_0x073d:
        r5 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r14.f3853u = r5;	 Catch:{ all -> 0x0570 }
        goto L_0x070f;
    L_0x0743:
        r5 = r14.f3853u;	 Catch:{ all -> 0x0570 }
        r6 = 1065101558; // 0x3f7c28f6 float:0.985 double:5.26230089E-315;
        r5 = r5 * r6;
        r14.f3853u = r5;	 Catch:{ all -> 0x0570 }
        goto L_0x070f;
    L_0x074c:
        r5 = r3;
        r3 = r2;
        goto L_0x0525;
    L_0x0750:
        r5 = r3;
        r3 = r2;
        goto L_0x0525;
    L_0x0754:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x050e;
    L_0x0758:
        r5 = p000.ekt.f3833a;	 Catch:{ all -> 0x0570 }
        r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r5 >= 0) goto L_0x077b;
    L_0x075e:
        r5 = p000.ekt.f3833a;	 Catch:{ all -> 0x0570 }
        r6 = p000.ekt.f3834b;	 Catch:{ all -> 0x0570 }
        r7 = p000.ekt.f3834b;	 Catch:{ all -> 0x0570 }
        r3 = r3 - r7;
        r5 = r5 - r6;
        r3 = r3 / r5;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = r5 - r3;
        r5 = 0;
        r5 = r5 + r3;
        r2.f3857a = r5;	 Catch:{ all -> 0x0570 }
        r5 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r3 = r3 * r5;
        r5 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        r3 = r3 + r5;
        r2.f3858b = r3;	 Catch:{ all -> 0x0570 }
        goto L_0x0506;
    L_0x077b:
        r3 = 0;
        r2.f3857a = r3;	 Catch:{ all -> 0x0570 }
        r3 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        r2.f3858b = r3;	 Catch:{ all -> 0x0570 }
        goto L_0x0506;
    L_0x0785:
        monitor-exit(r18);	 Catch:{ all -> 0x0570 }
        r3 = r14.f3856x;	 Catch:{ ejp -> 0x0573 }
        if (r3 == 0) goto L_0x0579;
    L_0x078a:
        r2 = r3.f3832i;	 Catch:{ ejp -> 0x0573 }
        if (r2 == 0) goto L_0x0579;
    L_0x078e:
        r2 = r3.f3830g;	 Catch:{ ejp -> 0x0573 }
        if (r2 != 0) goto L_0x08c2;
    L_0x0792:
        r2 = 3042; // 0xbe2 float:4.263E-42 double:1.503E-320;
        android.opengl.GLES20.glEnable(r2);	 Catch:{ ejp -> 0x0573 }
        r2 = r3.f3827d;	 Catch:{ ejp -> 0x0573 }
        r2 = r2.f3693d;	 Catch:{ ejp -> 0x0573 }
        android.opengl.GLES20.glUseProgram(r2);	 Catch:{ ejp -> 0x0573 }
        r2 = r3.f3830g;	 Catch:{ ejp -> 0x0573 }
        if (r2 != 0) goto L_0x08b2;
    L_0x07a2:
        r2 = 770; // 0x302 float:1.079E-42 double:3.804E-321;
        r4 = 771; // 0x303 float:1.08E-42 double:3.81E-321;
        android.opengl.GLES20.glBlendFunc(r2, r4);	 Catch:{ ejp -> 0x0573 }
        r2 = r3.f3827d;	 Catch:{ ejp -> 0x0573 }
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2.m9745a(r4);	 Catch:{ ejp -> 0x0573 }
    L_0x07b0:
        r2 = r3.f3824a;	 Catch:{ ejp -> 0x0573 }
        r4 = r3.f3829f;	 Catch:{ ejp -> 0x0573 }
        r2 = r2.get(r4);	 Catch:{ ejp -> 0x0573 }
        r0 = r2;
        r0 = (p000.ejt) r0;	 Catch:{ ejp -> 0x0573 }
        r9 = r0;
        r2 = r3.f3828e;	 Catch:{ ejp -> 0x0573 }
        r3 = r2.x;	 Catch:{ ejp -> 0x0573 }
        r3 = (float) r3;	 Catch:{ ejp -> 0x0573 }
        r2 = r2.y;	 Catch:{ ejp -> 0x0573 }
        r4 = (float) r2;	 Catch:{ ejp -> 0x0573 }
        r2 = r9.f15216l;	 Catch:{ ejp -> 0x0573 }
        if (r2 != 0) goto L_0x0845;
    L_0x07c8:
        r2 = p000.ejt.f15210f;	 Catch:{ ejp -> 0x0573 }
        r3 = "Sprite not initialized.";
        p000.bli.m866b(r2, r3);	 Catch:{ ejp -> 0x0573 }
        goto L_0x0579;
    L_0x07d1:
        r2 = 0;
        goto L_0x06be;
    L_0x07d4:
        r0 = r20;
        r2 = r0.f3784e;	 Catch:{ ejp -> 0x0417 }
        r3 = r2.f2383d;	 Catch:{ ejp -> 0x0417 }
        r4 = new ema;	 Catch:{ ejp -> 0x0417 }
        r4.<init>(r2);	 Catch:{ ejp -> 0x0417 }
        r3.post(r4);	 Catch:{ ejp -> 0x0417 }
        goto L_0x041d;
    L_0x07e4:
        r0 = r20;
        r4 = r0.f3792m;	 Catch:{ ejp -> 0x07ff }
        r4 = r4.f3693d;	 Catch:{ ejp -> 0x07ff }
        android.opengl.GLES20.glUseProgram(r4);	 Catch:{ ejp -> 0x07ff }
        r0 = r20;
        r4 = r0.f3792m;	 Catch:{ ejp -> 0x07ff }
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4.m9745a(r5);	 Catch:{ ejp -> 0x07ff }
        r0 = r20;
        r4 = r0.f3785f;	 Catch:{ ejp -> 0x07ff }
        r4.mo3019a(r2);	 Catch:{ ejp -> 0x07ff }
        goto L_0x06b8;
    L_0x07ff:
        r2 = move-exception;
        r4 = p000.kqg.f8420a;	 Catch:{ ejp -> 0x0417 }
        r4.mo2210b(r2);	 Catch:{ ejp -> 0x0417 }
        goto L_0x06b8;
    L_0x0807:
        r0 = r20;
        r5 = r0.f3792m;	 Catch:{ ejp -> 0x07ff }
        r5 = r5.f3693d;	 Catch:{ ejp -> 0x07ff }
        android.opengl.GLES20.glUseProgram(r5);	 Catch:{ ejp -> 0x07ff }
        r0 = r20;
        r5 = r0.f3792m;	 Catch:{ ejp -> 0x07ff }
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r5.m9745a(r6);	 Catch:{ ejp -> 0x07ff }
        r0 = r20;
        r5 = r0.f3786g;	 Catch:{ ejp -> 0x07ff }
        r5.mo3019a(r2);	 Catch:{ ejp -> 0x07ff }
        goto L_0x06b1;
    L_0x0822:
        r2 = 1;
        goto L_0x068d;
    L_0x0825:
        r2 = 1;
        goto L_0x068d;
    L_0x0828:
        r2 = 1;
        goto L_0x068d;
    L_0x082b:
        r0 = r20;
        r2 = r0.am;	 Catch:{ ejp -> 0x0417 }
        r3 = (float) r8;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r4 = r0.f3783d;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r5 = r0.f3769P;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r6 = r0.ab;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r7 = r0.ac;	 Catch:{ ejp -> 0x0417 }
        r2.mo1229a(r3, r4, r5, r6, r7);	 Catch:{ ejp -> 0x0417 }
        goto L_0x05d9;
    L_0x0845:
        r2 = r9.e;	 Catch:{ ejp -> 0x0573 }
        if (r2 == 0) goto L_0x0579;
    L_0x0849:
        r2 = r9.e;	 Catch:{ ejp -> 0x0573 }
        r2 = r2.f3693d;	 Catch:{ ejp -> 0x0573 }
        android.opengl.GLES20.glUseProgram(r2);	 Catch:{ ejp -> 0x0573 }
        r2 = r9.a;	 Catch:{ ejp -> 0x0573 }
        r5 = 0;
        r2.position(r5);	 Catch:{ ejp -> 0x0573 }
        r2 = r9.b;	 Catch:{ ejp -> 0x0573 }
        r5 = 0;
        r2.position(r5);	 Catch:{ ejp -> 0x0573 }
        r2 = r9.e;	 Catch:{ ejp -> 0x0573 }
        r5 = r9.a;	 Catch:{ ejp -> 0x0573 }
        r2.m1808b(r5);	 Catch:{ ejp -> 0x0573 }
        r2 = r9.e;	 Catch:{ ejp -> 0x0573 }
        r5 = r9.b;	 Catch:{ ejp -> 0x0573 }
        r2.m1806a(r5);	 Catch:{ ejp -> 0x0573 }
        r2 = r9.f15214j;	 Catch:{ ejp -> 0x0573 }
        r5 = r9.f15212h;	 Catch:{ ejp -> 0x0573 }
        r6 = r3 + r5;
        r7 = r9.f15213i;	 Catch:{ ejp -> 0x0573 }
        r3 = 0;
        r5 = 0;
        r7 = r7 + r4;
        r8 = 0;
        r4 = r15;
        android.opengl.Matrix.translateM(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ ejp -> 0x0573 }
        r2 = r9.f15214j;	 Catch:{ ejp -> 0x0573 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.opengl.Matrix.rotateM(r2, r3, r4, r5, r6, r7);	 Catch:{ ejp -> 0x0573 }
        r2 = r9.e;	 Catch:{ ejp -> 0x0573 }
        r3 = r9.f15214j;	 Catch:{ ejp -> 0x0573 }
        r2.m1807a(r3);	 Catch:{ ejp -> 0x0573 }
        r2 = r9.d;	 Catch:{ ejp -> 0x0573 }
        r2 = r2.size();	 Catch:{ ejp -> 0x0573 }
        if (r2 == 0) goto L_0x0579;
    L_0x0894:
        r2 = r9.d;	 Catch:{ ejp -> 0x0573 }
        r3 = 0;
        r2 = r2.get(r3);	 Catch:{ ejp -> 0x0573 }
        r2 = (p000.ejo) r2;	 Catch:{ ejp -> 0x0573 }
        r2.m1799a();	 Catch:{ ejp -> 0x0573 }
        r2 = r9.c;	 Catch:{ ejp -> 0x0573 }
        r3 = 0;
        r2.position(r3);	 Catch:{ ejp -> 0x0573 }
        r2 = r9.f15215k;	 Catch:{ ejp -> 0x0573 }
        r3 = r9.c;	 Catch:{ ejp -> 0x0573 }
        r4 = 4;
        r5 = 5123; // 0x1403 float:7.179E-42 double:2.531E-320;
        android.opengl.GLES20.glDrawElements(r4, r2, r5, r3);	 Catch:{ ejp -> 0x0573 }
        goto L_0x0579;
    L_0x08b2:
        r2 = 1;
        r4 = 771; // 0x303 float:1.08E-42 double:3.81E-321;
        android.opengl.GLES20.glBlendFunc(r2, r4);	 Catch:{ ejp -> 0x0573 }
        r2 = r3.f3827d;	 Catch:{ ejp -> 0x0573 }
        r4 = 1067030938; // 0x3f99999a float:1.2 double:5.271833295E-315;
        r2.m9745a(r4);	 Catch:{ ejp -> 0x0573 }
        goto L_0x07b0;
    L_0x08c2:
        r4 = android.os.SystemClock.elapsedRealtimeNanos();	 Catch:{ ejp -> 0x0573 }
        r6 = r3.f3826c;	 Catch:{ ejp -> 0x0573 }
        r4 = r4 - r6;
        r4 = (double) r4;	 Catch:{ ejp -> 0x0573 }
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r4 = r4 / r6;
        r2 = (int) r4;	 Catch:{ ejp -> 0x0573 }
        r4 = (long) r2;	 Catch:{ ejp -> 0x0573 }
        r6 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r4 = r4 / r6;
        r2 = (int) r4;	 Catch:{ ejp -> 0x0573 }
        r2 = r2 + 1;
        r3.f3829f = r2;	 Catch:{ ejp -> 0x0573 }
        r2 = r3.f3829f;	 Catch:{ ejp -> 0x0573 }
        r4 = r3.f3824a;	 Catch:{ ejp -> 0x0573 }
        r4 = r4.size();	 Catch:{ ejp -> 0x0573 }
        r4 = r4 + -1;
        if (r2 < r4) goto L_0x0792;
    L_0x08e6:
        r2 = 0;
        r3.f3830g = r2;	 Catch:{ ejp -> 0x0573 }
        r2 = 1;
        r3.f3831h = r2;	 Catch:{ ejp -> 0x0573 }
        r4 = android.os.SystemClock.elapsedRealtimeNanos();	 Catch:{ ejp -> 0x0573 }
        r6 = r3.f3826c;	 Catch:{ ejp -> 0x0573 }
        r2 = r3.f3825b;	 Catch:{ ejp -> 0x0573 }
        r8 = r2.f3912m;	 Catch:{ ejp -> 0x0573 }
        r2 = r2.m1857a();	 Catch:{ ejp -> 0x0573 }
        r4 = r4 - r6;
        r4 = (double) r4;	 Catch:{ ejp -> 0x0573 }
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r4 = r4 / r6;
        r4 = (int) r4;	 Catch:{ ejp -> 0x0573 }
        r2 = com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1297a(r2, r8, r4);	 Catch:{ ejp -> 0x0573 }
        r4 = 0;
        r4 = r2[r4];	 Catch:{ ejp -> 0x0573 }
        r5 = 1;
        r5 = r2[r5];	 Catch:{ ejp -> 0x0573 }
        r6 = 2;
        r6 = r2[r6];	 Catch:{ ejp -> 0x0573 }
        r7 = new java.lang.StringBuilder;	 Catch:{ ejp -> 0x0573 }
        r8 = 56;
        r7.<init>(r8);	 Catch:{ ejp -> 0x0573 }
        r8 = "Bias : ";
        r7.append(r8);	 Catch:{ ejp -> 0x0573 }
        r7.append(r4);	 Catch:{ ejp -> 0x0573 }
        r4 = ", ";
        r7.append(r4);	 Catch:{ ejp -> 0x0573 }
        r7.append(r5);	 Catch:{ ejp -> 0x0573 }
        r4 = ", ";
        r7.append(r4);	 Catch:{ ejp -> 0x0573 }
        r7.append(r6);	 Catch:{ ejp -> 0x0573 }
        r4 = r3.f3825b;	 Catch:{ ejp -> 0x0573 }
        r4 = r4.f3911l;	 Catch:{ ejp -> 0x0573 }
        r5 = 0;
        r5 = r2[r5];	 Catch:{ ejp -> 0x0573 }
        r6 = 0;
        r4[r6] = r5;	 Catch:{ ejp -> 0x0573 }
        r5 = 1;
        r5 = r2[r5];	 Catch:{ ejp -> 0x0573 }
        r6 = 1;
        r4[r6] = r5;	 Catch:{ ejp -> 0x0573 }
        r5 = 2;
        r2 = r2[r5];	 Catch:{ ejp -> 0x0573 }
        r5 = 2;
        r4[r5] = r2;	 Catch:{ ejp -> 0x0573 }
        r2 = r3.f3824a;	 Catch:{ ejp -> 0x0573 }
        r2 = r2.size();	 Catch:{ ejp -> 0x0573 }
        r2 = r2 + -1;
        r3.f3829f = r2;	 Catch:{ ejp -> 0x0573 }
        goto L_0x0792;
    L_0x0951:
        r2 = 0;
        r14.f3847o = r2;	 Catch:{ ejp -> 0x0417 }
        goto L_0x03d7;
    L_0x0956:
        r0 = r20;
        r2 = r0.f3790k;	 Catch:{ ejp -> 0x0417 }
        r2 = r2.f3693d;	 Catch:{ ejp -> 0x0417 }
        android.opengl.GLES20.glUseProgram(r2);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3790k;	 Catch:{ ejp -> 0x0417 }
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.m9747a(r3);	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r2 = r0.f3781b;	 Catch:{ ejp -> 0x0417 }
        r0 = r20;
        r3 = r0.f3765L;	 Catch:{ ejp -> 0x0417 }
        r2.mo3019a(r3);	 Catch:{ ejp -> 0x0417 }
        goto L_0x03b3;
    L_0x0975:
        r0 = r20;
        r2 = r0.ad;	 Catch:{ ejp -> 0x0417 }
        if (r2 != 0) goto L_0x0956;
    L_0x097b:
        goto L_0x03ad;
    L_0x097d:
        r2 = 0;
        goto L_0x02ef;
    L_0x0980:
        r2 = 0;
        goto L_0x02ef;
    L_0x0983:
        if (r2 == 0) goto L_0x0988;
    L_0x0985:
        r3 = 1;
        goto L_0x02ba;
    L_0x0988:
        r3 = 0;
        goto L_0x02ba;
    L_0x098b:
        r2 = 0;
        goto L_0x02ad;
    L_0x098e:
        r3 = 0;
        r2.f15238m = r3;
        goto L_0x02a5;
    L_0x0993:
        r2 = new eks;
        r0 = r20;
        r4 = r0.au;
        r0 = r20;
        r5 = r0.f3761H;
        r0 = r20;
        r6 = r0.ab;
        r0 = r20;
        r7 = r0.ac;
        r2.<init>(r4, r5, r6, r7);
        r0 = r20;
        r0.f3787h = r2;
        r0 = r20;
        r2 = r0.ax;
        r0 = r20;
        r4 = r0.f3787h;
        r2.put(r3, r4);
        r2 = new eks;
        r0 = r20;
        r3 = r0.au;
        r0 = r20;
        r4 = r0.f3761H;
        r0 = r20;
        r5 = r0.ac;
        r0 = r20;
        r6 = r0.ab;
        r2.<init>(r3, r4, r5, r6);
        r0 = r20;
        r3 = r0.ax;
        r0 = r20;
        r4 = r0.ac;
        r4 = r4 * 31;
        r0 = r20;
        r5 = r0.ab;
        r4 = r4 + r5;
        r4 = java.lang.Integer.valueOf(r4);
        r3.put(r4, r2);
        goto L_0x0168;
    L_0x09e4:
        r0 = r20;
        r2 = r0.f3775V;
        r6 = (double) r2;
        r8 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r4 = r8 - r4;
        r8 = 4625759767262920704; // 0x4032000000000000 float:0.0 double:18.0;
        r4 = r4 * r8;
        r4 = r4 + r6;
        r2 = (float) r4;
        goto L_0x00c9;
    L_0x09f4:
        r0 = r20;
        r2 = r0.ar;
        r4 = 0;
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x0063;
    L_0x09fe:
        r2 = java.lang.Math.abs(r2);
        r0 = r20;
        r4 = r0.as;
        r4 = java.lang.Math.abs(r4);
        r4 = r4 + r4;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x0a29;
    L_0x0a0f:
        r0 = r20;
        r2 = r0.f3761H;
        r3 = r2.f3913n;
        r4 = r3.m1850a();
        r0 = r20;
        r6 = r0.ar;
        r4 = r4 + r6;
        r2.m1856a(r4);
        r2 = 0;
        r0 = r20;
        r0.ar = r2;
        goto L_0x0063;
    L_0x0a29:
        r0 = r20;
        r2 = r0.f3761H;
        r3 = r2.f3913n;
        r4 = r3.m1850a();
        r0 = r20;
        r6 = r0.as;
        r4 = r4 + r6;
        r2.m1856a(r4);
        r0 = r20;
        r2 = r0.ar;
        r0 = r20;
        r4 = r0.as;
        r2 = r2 - r4;
        r0 = r20;
        r0.ar = r2;
        goto L_0x0063;
    L_0x0a4a:
        r2 = 0;
        r0 = r20;
        r0.m1830a(r2);
        goto L_0x0050;
    L_0x0a52:
        p000.ejo.m1798c();
        r3 = p000.ejo.m1798c();
        r0 = r20;
        r2 = r0.f3757D;
        r0 = r20;
        r4 = r0.f3758E;
        com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1293a(r3, r2, r4);
        r0 = r20;
        r2 = r0.f3781b;
        r4 = r2.d;
        r4.clear();
        r4 = new ejo;
        r4.<init>();
        r5 = r2.f15236k;
        r5.add(r4);
        r5 = r2.d;
        r6 = 0;
        r5.add(r6, r4);
        r2 = r2.d;
        r4 = 0;
        r2 = r2.get(r4);
        r2 = (p000.ejo) r2;
        r2.f3688a = r3;
        r2 = 1;
        r0 = r20;
        r0.ae = r2;
        r2 = p000.ejo.m1797b();
        r0 = r20;
        r0.f3797r = r2;
        r0 = r20;
        r2 = r0.f3797r;
        r0 = r20;
        r3 = r0.f3757D;
        r0 = r20;
        r4 = r0.f3758E;
        com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1293a(r2, r3, r4);
        r2 = p000.ejo.m1797b();
        r0 = r20;
        r0.f3796q = r2;
        r0 = r20;
        r2 = r0.f3796q;
        r0 = r20;
        r3 = r0.f3757D;
        r0 = r20;
        r4 = r0.f3758E;
        com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle.m1293a(r2, r3, r4);
        goto L_0x0030;
    L_0x0abd:
        r2 = move-exception;
        r7 = p000.kqg.f8420a;
        r7.mo2210b(r2);
        goto L_0x01c6;
    L_0x0ac5:
        r2 = move-exception;
        r3 = p000.kqg.f8420a;
        r3.mo2210b(r2);
        goto L_0x0280;
        */
        throw new UnsupportedOperationException("Method not decompiled: eki.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (i != this.ab || i2 != this.ac) {
            this.ab = i;
            this.ac = i2;
            this.f3779Z = this.ab;
            this.aa = this.ac;
            this.f3778Y = false;
            this.f3756C = false;
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            if (this.aw < 0.0f) {
                this.aw = this.f3762I.m1820a();
            }
            this.f3774U = eki.m1828a(this.aw, 1.7f);
            this.f3776W = (int) eki.m1828a(this.aw, 2.5f);
            this.f3777X = (int) eki.m1828a(this.aw, 1.1f);
            float f = this.f3774U;
            this.f3773T = f;
            this.f3775V = m1832c(f);
            this.f3788i = new ejr();
            this.f3791l = new ejs();
            this.f3789j = new elh();
            this.f3790k = new elk();
            this.f3791l.m9717b(ejd.f3651b);
            this.f3782c = new eko(this.f3781b);
            new Options().inScaled = false;
            this.f3780a = new ekl();
            ejn ejn = this.f3781b;
            ejn.f3685e = this.f3790k;
            ejn.f15235j = this.f3791l;
            if (this.f3760G) {
                ejn.f15238m = true;
                ejn.f15237l = true;
            }
            Matrix.setIdentityM(this.f3770Q, 0);
            float[] fArr = this.f3770Q;
            fArr[0] = 0.0f;
            fArr[1] = -1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            Matrix.setIdentityM(this.f3772S, 0);
            GLES20.glClearColor(ejd.f3652c[0], ejd.f3652c[1], ejd.f3652c[2], ejd.f3652c[3]);
            this.f3794o = true;
            boolean z = this.f3805z;
            if (z) {
                this.f3784e.m1323a(z, 0);
            }
            Matrix.setIdentityM(this.f3771R, 0);
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
        this.f3756C = false;
    }

    /* renamed from: a */
    private final synchronized void m1830a(boolean z) {
        boolean z2 = true;
        synchronized (this) {
            eks eks = this.f3787h;
            if (eks != null && this.f3794o) {
                boolean z3;
                ekv ekv = this.f3755B;
                byte[] bArr = this.f3759F;
                int i = this.f3757D;
                int i2 = this.f3758E;
                if (!eks.f3831h) {
                    z3 = false;
                } else if (this.f3762I.f3746v) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bArr != null) {
                    ekv.f3861c = LightCycle.m1296a(bArr, i, i2, z3);
                    if (ekv.f3861c[0] == -1.0f) {
                        z2 = false;
                    }
                    ekv.f3859a = z2;
                    ekv.f3860b = LightCycle.m1318q();
                }
                this.av++;
                if (!z) {
                    int c;
                    z2 = this.f3755B.f3859a;
                    this.ad = z2;
                    this.ah = LightCycle.m1312k();
                    ekv ekv2 = this.f3755B;
                    if (ekv2.f3860b && z2 && !this.f3801v) {
                        float[] fArr = ekv2.f3861c;
                        c = this.f3782c.m9739c(fArr);
                        String a = LightCycle.m1289a(fArr);
                        int size = this.f3782c.f15239f.size() - 1;
                        ejy ejy = this.f3762I;
                        if (!ejy.f3744t && ejy.f3746v) {
                            ejy.f3716H.add(a);
                            ejy.f3744t = true;
                            new eka(ejy).execute(new Void[0]);
                            ejy.f3715G.add(fArr);
                            Vector vector = ejy.f3738n;
                            vector.setSize(Math.max(size + 1, vector.size()));
                            ejy.f3738n.set(size, Integer.valueOf(c));
                        }
                        this.f3782c.m9737a(size, false);
                        this.ai.add(Integer.valueOf(size));
                        this.f3798s = true;
                        m1833c();
                        this.f3795p = false;
                        this.f3784e.m1321a();
                        this.aq = false;
                        this.ao = false;
                    }
                    if (this.f3799t) {
                        if (this.ai.size() > 0) {
                            int intValue = ((Integer) this.ai.get(0)).intValue();
                            this.ai.remove(0);
                            this.f3782c.m9737a(intValue, true);
                        }
                        this.f3783d.m1843a();
                        this.f3784e.m1323a(this.f3805z, this.f3762I.f3739o);
                        this.f3799t = false;
                    }
                    if (!this.f3787h.f3831h) {
                        z2 = LightCycle.m1319r();
                        c = LightCycle.m1305d();
                        if (!this.f3804y && !this.f3787h.f3830g && z2 && c == 0) {
                            ejy ejy2 = this.f3762I;
                            if (ejy2.f3746v) {
                                this.f3804y = true;
                                eje eje = ejy2.f3727c;
                                zw ekj = new ekj(this);
                                if (eje.f3660e) {
                                    abo i3 = eje.f3657b.mo2571i();
                                    i3.f151q = abc.AUTO;
                                    eje.f3657b.mo2562a(i3);
                                    eje.f3657b.mo2558a(eje.f3656a, ekj);
                                } else {
                                    ekj.mo1199a(true, null);
                                }
                                if (this.f3801v) {
                                    this.f3787h.m1840a();
                                }
                            }
                        }
                        eks = this.f3787h;
                        if (eks.f3830g && (!z2 || ((z2 && this.ah) || c != 0))) {
                            eks.m1840a();
                        }
                        if (this.f3801v) {
                            this.f3787h.m1840a();
                        }
                    }
                    this.f3756C = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1834a() {
        m1835a(this.f3774U / this.f3773T);
    }

    /* renamed from: c */
    private final float m1832c(float f) {
        int i = this.ab;
        if (i >= this.ac) {
            return f;
        }
        double tan = Math.tan(Math.toRadians((double) f) / 2.0d);
        double d = ((double) i) / (tan + tan);
        d = Math.atan(((double) this.ac) / (d + d));
        return (float) Math.toDegrees(d + d);
    }

    /* renamed from: a */
    private static float m1828a(float f, float f2) {
        return (float) (Math.atan(((double) f2) * Math.tan(((((double) f) * 0.5d) / 180.0d) * 3.141592653589793d)) * 114.59155902616465d);
    }

    /* renamed from: a */
    public final void m1836a(int i) {
        int i2 = this.f3802w;
        this.f3802w = i;
        this.f3805z = false;
        this.f3754A = PhotoSphereMessageOverlay.f2380a;
        switch (i - 1) {
            case 0:
                this.f3754A = PhotoSphereMessageOverlay.f2380a;
                this.f3783d.m1844a(0);
                break;
            case 1:
                this.f3754A = PhotoSphereMessageOverlay.f2381b;
                this.f3784e.m1321a();
                this.f3783d.m1844a(1);
                this.ak = true;
                this.an.m1810b();
                break;
            case 2:
                this.f3754A = PhotoSphereMessageOverlay.f2381b;
                this.f3784e.m1321a();
                this.f3783d.m1844a(2);
                this.ak = true;
                this.an.m1810b();
                break;
            case 3:
                this.f3754A = PhotoSphereMessageOverlay.f2381b;
                this.f3784e.m1321a();
                this.f3783d.m1844a(3);
                this.ak = true;
                this.an.m1810b();
                break;
            case 4:
                this.f3754A = PhotoSphereMessageOverlay.f2380a;
                this.f3784e.m1321a();
                this.f3783d.m1844a(4);
                this.ak = true;
                this.an.m1810b();
                break;
            case 5:
                this.f3784e.m1323a(this.f3805z, this.f3762I.f3739o);
                this.f3805z = true;
                break;
        }
        this.al = eki.m1831b(i2);
        this.am = eki.m1831b(i);
    }

    /* renamed from: b */
    public final synchronized void m1837b() {
        int size = this.f3782c.f15239f.size();
        eko eko = this.f3782c;
        synchronized (eko.f15239f) {
            if (eko.f15239f.size() > 0) {
                Vector vector = eko.f15239f;
                vector.removeElementAt(vector.size() - 1);
            }
        }
        while (this.at.size() > size) {
            vector = this.at;
            vector.removeElementAt(vector.size() - 1);
        }
        if (this.at.size() == size) {
            this.ar -= ((Double) this.at.lastElement()).doubleValue();
            this.as = this.ar / 45.0d;
            Vector vector2 = this.at;
            vector2.removeElementAt(vector2.size() - 1);
        }
        m1833c();
        Thread ekk = new ekk(this);
        ekk.start();
        try {
            ekk.join();
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }

    /* renamed from: c */
    private final void m1833c() {
        this.f3782c.f15239f.size();
        this.f3782c.f15239f.size();
    }

    /* renamed from: b */
    public final void m1838b(float f) {
        this.f3774U = this.f3773T / f;
        this.f3774U = Math.min(this.f3774U, (float) this.f3776W);
        this.f3774U = Math.max(this.f3774U, (float) this.f3777X);
        this.f3775V = m1832c(this.f3774U);
    }
}
