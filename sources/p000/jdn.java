package p000;

import android.opengl.GLES30;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jdn */
final class jdn implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jhs f7724a;

    jdn(jhs jhs) {
        this.f7724a = jhs;
    }

    public final /* synthetic */ Object call() {
        jhs jhs = this.f7724a;
        int[] iArr = new int[1];
        GLES30.glGenFramebuffers(1, iArr, 0);
        int i = iArr[0];
        jfh jfh = (jfh) jhs.mo3495c();
        GLES30.glBindFramebuffer(36160, i);
        GLES30.glFramebufferTexture2D(36160, 36064, ((jfb) jfh.mo3492c()).mo3587e(), ((jfb) jfh.mo3492c()).mo3493i(), 0);
        jeu jeu = (jeu) jfh.f23392a.mo3491f().mo3492c();
        return new jey(jeu.mo3580h(), jeu.mo3578f(), jeu.mo3583l(), jeu.mo3577e(), jeu.mo3576d(), i, jfh.m17970b(), jeu, i, jhs);
    }

    public final String toString() {
        return "GLRawCanvases.createForTexture";
    }
}
