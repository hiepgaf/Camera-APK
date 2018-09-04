package p000;

import android.opengl.GLES20;
import android.opengl.GLU;

/* compiled from: PG */
/* renamed from: ejp */
public final class ejp extends Exception {
    /* renamed from: a */
    private static final String f3689a = bli.m862a("OpenGLException");

    public ejp(String str) {
        super(str);
        bli.m867b(f3689a, str, this);
    }

    public ejp(String str, String str2) {
        super(str);
        String str3 = f3689a;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" : ");
        stringBuilder.append(str2);
        bli.m867b(str3, stringBuilder.toString(), this);
    }

    /* renamed from: a */
    public static void m1801a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String gluErrorString = GLU.gluErrorString(glGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(gluErrorString).length());
            stringBuilder.append(str);
            stringBuilder.append(": glError ");
            stringBuilder.append(gluErrorString);
            stringBuilder.append(" ");
            stringBuilder.append(glGetError);
            throw new ejp(stringBuilder.toString());
        }
    }
}
