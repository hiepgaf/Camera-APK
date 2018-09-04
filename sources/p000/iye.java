package p000;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.util.Size;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: iye */
public final class iye implements iyc {
    /* renamed from: a */
    public static final float[] f18664a = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    /* renamed from: s */
    private static final float[] f18665s = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
    /* renamed from: t */
    private static final float[] f18666t = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -0.9f, -1.0f, -0.9f, 1.0f, -0.9f, 1.0f, -1.0f};
    /* renamed from: u */
    private static final float[] f18667u = new float[]{-1.0f, 0.9f, 1.0f, 0.9f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.9f};
    /* renamed from: v */
    private static final float[] f18668v = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    /* renamed from: A */
    private final jfk f18669A;
    /* renamed from: B */
    private final kpk f18670B;
    /* renamed from: C */
    private final izs f18671C;
    /* renamed from: b */
    public final jdo f18672b;
    /* renamed from: c */
    public final jfk f18673c;
    /* renamed from: d */
    public final jeq f18674d;
    /* renamed from: e */
    public final jek f18675e;
    /* renamed from: f */
    public SurfaceTexture f18676f;
    /* renamed from: g */
    public final iyd f18677g;
    /* renamed from: h */
    public final ird f18678h;
    /* renamed from: i */
    public final jfh f18679i;
    /* renamed from: j */
    public final jdk f18680j;
    /* renamed from: k */
    public final jfh f18681k;
    /* renamed from: l */
    public final jdk f18682l;
    /* renamed from: m */
    public final Object f18683m = new Object();
    /* renamed from: n */
    public volatile kbg f18684n = kau.f19138a;
    /* renamed from: o */
    public volatile jfo f18685o;
    /* renamed from: p */
    public volatile iqm f18686p = iqm.CLOCKWISE_0;
    /* renamed from: q */
    public volatile ken f18687q = ken.m13464e();
    /* renamed from: r */
    public boolean f18688r = false;
    /* renamed from: w */
    private final Executor f18689w;
    /* renamed from: x */
    private final jeq f18690x;
    /* renamed from: y */
    private final jeq f18691y;
    /* renamed from: z */
    private final jfk f18692z;

    private iye(jdo jdo, ExecutorService executorService, jfk jfk, jeq jeq, jeq jeq2, jek jek, izv izv, jfh jfh, jdk jdk, jfh jfh2, jdk jdk2, iyd iyd, ird ird, boolean z) {
        this.f18672b = jdo;
        this.f18689w = executorService;
        this.f18675e = jek;
        this.f18679i = jfh;
        this.f18680j = jdk;
        this.f18681k = jfh2;
        this.f18682l = jdk2;
        this.f18690x = jeq;
        this.f18674d = jeq2;
        this.f18673c = jfk;
        this.f18677g = iyd;
        this.f18678h = ird;
        Object[] objArr = new izr[4];
        objArr[0] = jdk;
        objArr[1] = jdk2;
        objArr[2] = jdo;
        executorService.getClass();
        objArr[3] = new iyf(executorService);
        this.f18671C = ion.m3965c(khb.m4864a(objArr));
        OnFrameAvailableListener iyg = new iyg(this);
        kpk d = kpw.m18056d();
        jek.f23392a.execute(new iyi(this, jek, izv, iyg, d));
        this.f18670B = d;
        if (z) {
            boolean z2;
            this.f18691y = jeq.m17960a(jdo).m4434a(jcc.m4399a(jff.m17968a(jdo, 35633, "attribute vec2 aPosition;\nvoid main() {\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}"))).m4434a(jcc.m4399a(jff.m17968a(jdo, 35632, "precision mediump float;\nuniform vec4 uColor;\nvoid main() {\n    gl_FragColor = uColor;\n}"))).m4433a();
            float[] fArr = f18666t;
            int length = fArr.length;
            if (((length & 1) ^ 1) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            jri.m13143a(z2);
            this.f18692z = jfk.m16252a(jdo, new jfm(length >> 1, jci.f7709i, fArr));
            fArr = f18667u;
            length = fArr.length;
            if (((length & 1) ^ 1) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            jri.m13143a(z2);
            this.f18669A = jfk.m16252a(jdo, new jfm(length >> 1, jci.f7709i, fArr));
            return;
        }
        this.f18691y = null;
        this.f18669A = null;
        this.f18692z = null;
    }

    public final void close() {
        synchronized (this.f18683m) {
            if (this.f18688r) {
                return;
            }
            this.f18688r = true;
            if (this.f18684n.mo2084b()) {
                ((jdk) this.f18684n.mo2081a()).close();
                this.f18684n = kau.f19138a;
            }
            kpk kpk = this.f18670B;
            if (kpk == null || kpk.isDone()) {
                ((Surface) this.f18670B.get()).release();
            } else {
                this.f18670B.cancel(true);
            }
            this.f18671C.close();
        }
    }

    /* renamed from: a */
    public static iye m12672a(Size size, iyd iyd, ird ird, boolean z) {
        boolean z2;
        int i;
        ird.mo1903a("VFEP.create");
        izv a = izu.m4367a(size.getWidth(), size.getHeight());
        Object newSingleThreadExecutor = Executors.newSingleThreadExecutor(iyj.f7555a);
        jdo a2 = jdx.m4421a(jdx.m4420a(newSingleThreadExecutor, new jdg(new jdd(izu.m4367a(1, 1))), jfj.f7758b));
        jek jek = new jek(a2, jdv.m17630a(a2, new jel(a2, new jdd(a))));
        jdc jdd = new jdd(a);
        ize a3 = jfh.m17969a(a2, jdd);
        jdk a4 = jdk.m17948a(jcc.m4399a(a3));
        ize a5 = jfh.m17969a(a2, jdd);
        jdk a6 = jdk.m17948a(jcc.m4399a(a5));
        jeq a7 = jeq.m17960a(a2).m4434a(jcc.m4399a(jff.m17968a(a2, 35633, "attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}"))).m4434a(jcc.m4399a(jff.m17968a(a2, 35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(uImgTex, texCoord);\n}"))).m4433a();
        jeq a8 = jeq.m17960a(a2).m4434a(jcc.m4399a(jff.m17968a(a2, 35633, "attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}"))).m4434a(jcc.m4399a(jff.m17968a(a2, 35632, "precision mediump float;\nuniform sampler2D uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n    gl_FragColor = texture2D(uImgTex, texCoord);\n}"))).m4433a();
        jfl[] jflArr = new jfl[2];
        float[] fArr = f18665s;
        int length = fArr.length;
        if (((length & 1) ^ 1) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        jri.m13143a(z2);
        jflArr[0] = new jfm(length >> 1, jci.f7709i, fArr);
        fArr = f18668v;
        length = fArr.length;
        if (((length & 1) ^ 1) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        jri.m13143a(z2);
        jflArr[1] = new jfm(length >> 1, jci.f7709i, fArr);
        length = jflArr[0].f7762a;
        jcg[] jcgArr = new jcg[2];
        int[] iArr = new int[2];
        int i2 = 0;
        for (i = 0; i < 2; i++) {
            jfl jfl = jflArr[i];
            int a9 = jfl.f7763b.mo3164a();
            int i3 = jfl.f7764c;
            i2 += (a9 * i3) * length;
            jcgArr[i] = jfl.f7763b;
            iArr[i] = i3;
        }
        ByteBuffer order = ByteBuffer.allocateDirect(i2 / 8).order(ByteOrder.nativeOrder());
        for (i2 = 0; i2 < 2; i2++) {
            jfl jfl2 = jflArr[i2];
            for (i = 0; i < length; i++) {
                jfl2.mo1989a(i, order);
            }
        }
        order.rewind();
        iye iye = new iye(a2, newSingleThreadExecutor, new jfk(jdi.m17947a(a2, order), jcgArr, iArr, length), a7, a8, jek, a, a3, a4, a5, a6, iyd, ird, false);
        ird.mo1904b();
        return iye;
    }

    /* renamed from: a */
    final void m12678a(jdk jdk) {
        jeq jeq = this.f18691y;
        if (jeq != null) {
            jdz a = jdz.m4423a((jfk) jqk.m13102c(this.f18669A)).m4428a(jeq).m4424a("uColor", 0.0f, 1.0f).m4425a("aPosition", 0);
            a.f7736h = false;
            a.m4427a(jdk);
            a = jdz.m4423a((jfk) jqk.m13102c(this.f18692z)).m4428a(jeq).m4424a("uColor", 1.0f, 0.0f).m4425a("aPosition", 0);
            a.f7736h = false;
            a.m4427a(jdk);
        }
    }

    /* renamed from: a */
    final void m12679a(jek jek, float[] fArr, jdk jdk) {
        boolean z;
        jdz a = jdz.m4423a(this.f18673c).m4428a(this.f18690x);
        if (jek.f23392a == a.f7732d.f23392a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        a.f7735g.put("uImgTex", jek);
        jdz a2 = a.m4426a("uTransform", fArr).m4425a("aPosition", 0).m4425a("aTexCoord", 1);
        a2.f7736h = false;
        a2.m4427a(jdk);
    }

    /* renamed from: a */
    public final kpk mo1962a() {
        kpk kpk;
        synchronized (this.f18683m) {
            jri.m13154b(this.f18688r ^ 1, (Object) "Tried to get input surface after ViewfinderEffectsPipeline is closed");
            kpk = this.f18670B;
        }
        return kpk;
    }

    /* renamed from: b */
    final int m12680b() {
        int ordinal;
        synchronized (this.f18683m) {
            ordinal = this.f18686p.ordinal();
        }
        return ordinal;
    }

    /* renamed from: a */
    public final void mo1964a(iqm iqm) {
        synchronized (this.f18683m) {
            this.f18686p = iqm;
        }
    }

    /* renamed from: a */
    public final void mo1963a(Surface surface, Size size) {
        jri.m13139a((Object) surface, (Object) "Output surface cannot be null");
        jri.m13139a((Object) size, (Object) "Output size cannot be null");
        this.f18689w.execute(new iyk(this, surface, size));
    }

    /* renamed from: a */
    public final void mo1965a(List list) {
        this.f18687q = ken.m13458a((Collection) list);
    }
}
