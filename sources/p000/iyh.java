package p000;

import android.graphics.SurfaceTexture;

/* renamed from: iyh */
final /* synthetic */ class iyh implements Runnable {
    /* renamed from: a */
    private final iye f7549a;

    iyh(iye iye) {
        this.f7549a = iye;
    }

    public final void run() {
        iye iye = this.f7549a;
        try {
            ird ird = iye.f18678h;
            int b = iye.m12680b();
            StringBuilder stringBuilder = new StringBuilder(27);
            stringBuilder.append("VFEP.process(o=");
            stringBuilder.append(b);
            stringBuilder.append(")");
            ird.mo1903a(stringBuilder.toString());
            SurfaceTexture surfaceTexture = iye.f18676f;
            jek jek = iye.f18675e;
            jdk jdk = (jdk) iye.f18684n.mo2081a();
            synchronized (iye.f18683m) {
                if (iye.f18688r) {
                } else {
                    float f;
                    float f2;
                    surfaceTexture.updateTexImage();
                    iqm iqm = iye.f18686p;
                    float[] fArr = new float[16];
                    iye.f18676f.getTransformMatrix(fArr);
                    switch (iqm.ordinal()) {
                        case 0:
                            f = 1.0f;
                            f2 = 0.0f;
                            break;
                        case 1:
                            f = 0.0f;
                            f2 = 1.0f;
                            break;
                        case 2:
                            f = -1.0f;
                            f2 = 0.0f;
                            break;
                        case 3:
                            f = 0.0f;
                            f2 = -1.0f;
                            break;
                        default:
                            f = 0.0f;
                            f2 = 0.0f;
                            break;
                    }
                    float[] fArr2 = new float[]{f, f2, 0.0f, 0.0f, -f2, f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, ((-0.5f * f) + (0.5f * f2)) + 0.5f, ((f2 * -0.5f) - (f * 0.5f)) + 0.5f, 0.0f, 1.0f};
                    float[] fArr3 = new float[16];
                    for (b = 0; b < 4; b++) {
                        for (int i = 0; i < 4; i++) {
                            float f3 = 0.0f;
                            for (int i2 = 0; i2 < 4; i2++) {
                                f3 += fArr2[(b << 2) + i2] * fArr[(i2 << 2) + i];
                            }
                            fArr3[(b << 2) + i] = f3;
                        }
                    }
                    surfaceTexture.getTimestamp();
                    ken ken = iye.f18687q;
                    if (ken.isEmpty()) {
                        iye.m12679a(jek, fArr3, jdk);
                        iye.m12678a(jdk);
                        jdk.m17949b();
                        iye.f18677g.m4339a(iye.f18686p);
                    } else {
                        iye.m12679a(jek, iye.f18664a, iye.f18680j);
                        jdk.m17949b();
                        jdv jdv = iye.f18679i;
                        jdk jdk2 = iye.f18682l;
                        if (0 < ken.size()) {
                            ken.get(0);
                            throw new RuntimeException("Should never be activated!");
                        }
                        boolean z;
                        jdz a = jdz.m4423a(iye.f18673c).m4428a(iye.f18674d);
                        String str = "uImgTex";
                        if (jdv.f23392a == a.f7732d.f23392a) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jri.m13143a(z);
                        a.f7735g.put(str, jdv);
                        jdz a2 = a.m4426a("uTransform", fArr3).m4425a("aPosition", 0).m4425a("aTexCoord", 1);
                        a2.f7736h = false;
                        a2.m4427a(jdk);
                        iye.m12678a(jdk);
                        jdk.m17949b();
                        iye.f18677g.m4339a(iye.f18686p);
                    }
                }
            }
            iye.f18678h.mo1904b();
        } catch (Throwable th) {
            iye.f18678h.mo1904b();
        }
    }
}
