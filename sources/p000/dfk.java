package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: dfk */
final class dfk implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ kpw f3031a;
    /* renamed from: b */
    private final /* synthetic */ des f3032b;

    dfk(des des, kpw kpw) {
        this.f3032b = des;
        this.f3031a = kpw;
    }

    public final void run() {
        int i = 0;
        eki eki = this.f3032b.f22834t;
        if (eki != null) {
            ejo ejo;
            eki.f3794o = false;
            eko eko = eki.f3782c;
            if (eko != null) {
                eko.mo1227a();
            }
            GLES20.glDeleteTextures(2, new int[]{eki.f3797r, eki.f3796q}, 0);
            ekn ekn = eki.f3781b;
            if (ekn.d.size() > 0) {
                ejo = (ejo) ekn.d.get(0);
            } else {
                ejo = null;
            }
            if (ejo != null) {
                ejo.m1800d();
            }
            ejq ejq = eki.f3788i;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3693d);
            }
            ejq = eki.f3789j;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3693d);
            }
            ejq = eki.f3790k;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3693d);
            }
            ejq = eki.f3791l;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3693d);
            }
            ejq = eki.f3792m;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3693d);
            }
            ejn ejn = eki.f3780a;
            if (ejn != null) {
                ejn.mo1227a();
            }
            eks eks = eki.f3787h;
            if (eks != null) {
                while (i < eks.f3824a.size()) {
                    if (eks.f3824a.get(i) != null) {
                        ((ejt) eks.f3824a.get(i)).mo1227a();
                    }
                    i++;
                }
                ejq = eks.f3827d;
                if (ejq != null) {
                    GLES20.glDeleteProgram(ejq.f3693d);
                }
            }
            ejm ejm = eki.f3785f;
            if (ejm != null) {
                ejm.mo1227a();
            }
            if (eki.f3786g != null) {
                eki.f3785f.mo1227a();
            }
            ekt ekt = eki.f3783d;
            if (ekt != null) {
                ejq ejq2 = ekt.f3839g;
                if (ejq2 != null) {
                    GLES20.glDeleteProgram(ejq2.f3693d);
                }
                ejq2 = ekt.f3840h;
                if (ejq2 != null) {
                    GLES20.glDeleteProgram(ejq2.f3693d);
                }
                ejt ejt = ekt.f3837e;
                if (ejt != null) {
                    ejt.mo1227a();
                }
                ejt ejt2 = ekt.f3838f;
                if (ejt2 != null) {
                    ejt2.mo1227a();
                }
            }
            ekn = eki.f3781b;
            if (ekn != null) {
                ekn.mo1227a();
            }
            this.f3032b.f22834t = null;
            this.f3031a.mo3557a(null);
        }
    }
}
