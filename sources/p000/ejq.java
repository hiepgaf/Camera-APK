package p000;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* renamed from: ejq */
public class ejq {
    /* renamed from: a */
    public int f3690a = -1;
    /* renamed from: b */
    public int f3691b = -1;
    /* renamed from: c */
    public int f3692c = -1;
    /* renamed from: d */
    public int f3693d;

    /* renamed from: a */
    public static int m1803a(String str, String str2) {
        int c = ejq.m1805c(35633, str);
        int c2 = ejq.m1805c(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            throw new ejp("Unable to create program");
        }
        GLES20.glAttachShader(glCreateProgram, c);
        ejp.m1801a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, c2);
        ejp.m1801a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glDeleteProgram(glCreateProgram);
            throw new ejp("Could not link program", GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        GLES20.glDeleteShader(c);
        GLES20.glDeleteShader(c2);
        return glCreateProgram;
    }

    /* renamed from: a */
    public static int m1802a(int i, String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (glGetAttribLocation == -1) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 25);
            stringBuilder.append("Unable to find ");
            stringBuilder.append(str);
            stringBuilder.append(" in shader");
            throw new ejp(stringBuilder.toString());
        }
        String valueOf = String.valueOf(str);
        String str2 = "glGetAttribLocation ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        ejp.m1801a(valueOf);
        return glGetAttribLocation;
    }

    /* renamed from: b */
    public static int m1804b(int i, String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (glGetUniformLocation == -1) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 25);
            stringBuilder.append("Unable to find ");
            stringBuilder.append(str);
            stringBuilder.append(" in shader");
            throw new ejp(stringBuilder.toString());
        }
        String valueOf = String.valueOf(str);
        String str2 = "glGetUniformLocation ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        ejp.m1801a(valueOf);
        return glGetUniformLocation;
    }

    /* renamed from: c */
    private static int m1805c(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            throw new ejp("Unable to create shader");
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("Unable to compile shader ");
        stringBuilder.append(i);
        throw new ejp(stringBuilder.toString(), glGetShaderInfoLog);
    }

    /* renamed from: a */
    public final void m1806a(FloatBuffer floatBuffer) {
        int i = this.f3691b;
        if (i >= 0) {
            GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f3691b);
        }
    }

    /* renamed from: a */
    public final void m1807a(float[] fArr) {
        int i = this.f3692c;
        if (i >= 0) {
            GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
        }
    }

    /* renamed from: b */
    public final void m1808b(FloatBuffer floatBuffer) {
        int i = this.f3690a;
        if (i >= 0) {
            GLES20.glVertexAttribPointer(i, 3, 5126, false, 12, floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f3690a);
        }
    }
}
