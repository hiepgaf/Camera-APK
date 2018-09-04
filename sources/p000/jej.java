package p000;

import android.opengl.EGL14;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;

/* compiled from: PG */
/* renamed from: jej */
final class jej implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Runnable f7742a;

    jej(Runnable runnable) {
        this.f7742a = runnable;
    }

    public final void run() {
        this.f7742a.run();
        String obj = this.f7742a.toString();
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            String eGLErrorString = GLUtils.getEGLErrorString(eglGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 37) + String.valueOf(eGLErrorString).length());
            stringBuilder.append("Executing EGL task '");
            stringBuilder.append(obj);
            stringBuilder.append("' caused error: ");
            stringBuilder.append(eGLErrorString);
            stringBuilder.append("!");
            throw new RuntimeException(stringBuilder.toString());
        }
        obj = this.f7742a.toString();
        eglGetError = GLES30.glGetError();
        if (eglGetError != 0) {
            eGLErrorString = GLU.gluErrorString(eglGetError);
            stringBuilder = new StringBuilder((String.valueOf(obj).length() + 35) + String.valueOf(eGLErrorString).length());
            stringBuilder.append("Executing GL task '");
            stringBuilder.append(obj);
            stringBuilder.append("' caused error ");
            stringBuilder.append(eGLErrorString);
            stringBuilder.append("!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final String toString() {
        String obj = this.f7742a.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 10);
        stringBuilder.append("checked [");
        stringBuilder.append(obj);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
