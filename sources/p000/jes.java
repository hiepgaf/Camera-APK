package p000;

import android.opengl.GLES20;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jes */
final class jes implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jer f7751a;

    jes(jer jer) {
        this.f7751a = jer;
    }

    /* renamed from: a */
    private final jfc m4435a() {
        jfc jfc = new jfc(GLES20.glCreateProgram());
        try {
            for (jhs c : this.f7751a.f7749a) {
                GLES20.glAttachShader(jfc.e, ((jfd) ((jff) c.mo3495c()).mo3492c()).f23395e);
            }
            GLES20.glLinkProgram(jfc.e);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(jfc.e, 35714, iArr, 0);
            if (iArr[0] == 0) {
                throw new bpm(GLES20.glGetProgramInfoLog(jfc.e));
            }
            for (jhs c2 : this.f7751a.f7749a) {
                GLES20.glDetachShader(jfc.e, ((jfd) ((jff) c2.mo3495c()).mo3492c()).f23395e);
            }
            this.f7751a.f7749a.close();
            return jfc;
        } catch (Exception e) {
            jfc.close();
            throw e;
        } catch (Throwable th) {
            this.f7751a.f7749a.close();
        }
    }

    public final /* synthetic */ Object call() {
        return m4435a();
    }
}
