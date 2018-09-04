package com.google.googlex.gcam.androidutils.gles31;

import android.opengl.GLES31;
import android.text.TextUtils;
import com.google.googlex.gcam.androidutils.vecmath.Matrix4f;
import com.google.googlex.gcam.androidutils.vecmath.VecmathUtilities;
import com.google.googlex.gcam.androidutils.vecmath.Vector2i;
import com.google.googlex.gcam.androidutils.vecmath.Vector3i;
import com.google.googlex.gcam.androidutils.vecmath.Vector4f;
import com.google.googlex.gcam.androidutils.vecmath.Vector4i;
import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
public class GLSeparableProgram implements Closeable {
    public final int id;

    /* compiled from: PG */
    public final class ShaderTypes {
        public static final int COMPUTE_SHADER = 37305;
        public static final int FRAGMENT_SHADER = 35632;
        public static final int VERTEX_SHADER = 35633;

        private ShaderTypes(GLSeparableProgram gLSeparableProgram) {
        }
    }

    public GLSeparableProgram(int i, String str) {
        this(i, new String[]{str});
    }

    public GLSeparableProgram(int i, String[] strArr) {
        int glCreateShader = GLES31.glCreateShader(i);
        if (glCreateShader == 0) {
            throw new UnsupportedOperationException("Could not create GL shader.");
        }
        int glCreateProgram = GLES31.glCreateProgram();
        if (glCreateProgram == 0) {
            GLES31.glDeleteShader(glCreateShader);
            throw new UnsupportedOperationException("Could not create GL program.");
        }
        GLES31.glShaderSource(glCreateShader, TextUtils.join("\n", strArr));
        GLES31.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES31.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        String glGetShaderInfoLog;
        String valueOf;
        if (iArr[0] != 1) {
            glGetShaderInfoLog = GLES31.glGetShaderInfoLog(glCreateShader);
            GLES31.glDeleteShader(glCreateShader);
            GLES31.glDeleteProgram(glCreateProgram);
            valueOf = String.valueOf(glGetShaderInfoLog);
            glGetShaderInfoLog = "Failed to compile program. Info log = ";
            if (valueOf.length() == 0) {
                valueOf = new String(glGetShaderInfoLog);
            } else {
                valueOf = glGetShaderInfoLog.concat(valueOf);
            }
            throw new IllegalArgumentException(valueOf);
        }
        GLES31.glProgramParameteri(glCreateProgram, 33368, 1);
        GLES31.glAttachShader(glCreateProgram, glCreateShader);
        GLES31.glLinkProgram(glCreateProgram);
        GLES31.glDetachShader(glCreateProgram, glCreateShader);
        GLES31.glDeleteShader(glCreateShader);
        int[] iArr2 = new int[1];
        GLES31.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] != 1) {
            valueOf = String.valueOf(GLES31.glGetProgramInfoLog(glCreateProgram));
            glGetShaderInfoLog = "Failed to link program. Info log = ";
            if (valueOf.length() == 0) {
                valueOf = new String(glGetShaderInfoLog);
            } else {
                valueOf = glGetShaderInfoLog.concat(valueOf);
            }
            throw new IllegalArgumentException(valueOf);
        }
        this.id = glCreateProgram;
    }

    public void close() {
        GLES31.glDeleteProgram(this.id);
    }

    public int getUniformLocation(String str) {
        return GLES31.glGetUniformLocation(this.id, str);
    }

    public int id() {
        return this.id;
    }

    public String infoLog() {
        return GLES31.glGetProgramInfoLog(this.id);
    }

    public void setUniform1f(String str, float f) {
        GLES31.glProgramUniform1f(this.id, getUniformLocation(str), f);
    }

    public void setUniform1i(String str, int i) {
        GLES31.glProgramUniform1i(this.id, getUniformLocation(str), i);
    }

    public void setUniform2f(String str, float f, float f2) {
        GLES31.glProgramUniform2f(this.id, getUniformLocation(str), f, f2);
    }

    public void setUniform2i(String str, int i, int i2) {
        GLES31.glProgramUniform2i(this.id, getUniformLocation(str), i, i2);
    }

    public void setUniform2i(String str, Vector2i vector2i) {
        setUniform2i(str, vector2i.f2487x, vector2i.f2488y);
    }

    public void setUniform3f(String str, float f, float f2, float f3) {
        GLES31.glProgramUniform3f(this.id, getUniformLocation(str), f, f2, f3);
    }

    public void setUniform3i(String str, int i, int i2, int i3) {
        GLES31.glProgramUniform3i(this.id, getUniformLocation(str), i, i2, i3);
    }

    public void setUniform3i(String str, Vector3i vector3i) {
        setUniform3i(str, vector3i.f2492x, vector3i.f2493y, vector3i.f2494z);
    }

    public void setUniform4f(String str, float f, float f2, float f3, float f4) {
        GLES31.glProgramUniform4f(this.id, getUniformLocation(str), f, f2, f3, f4);
    }

    public void setUniform4f(String str, Vector4f vector4f) {
        GLES31.glProgramUniform4f(this.id, getUniformLocation(str), vector4f.f2500x, vector4f.f2501y, vector4f.f2502z, vector4f.f2499w);
    }

    public void setUniform4fArray(String str, List list) {
        setUniform4fArray(str, VecmathUtilities.vector4fListToFloatArray(list));
    }

    public void setUniform4fArray(String str, float[] fArr) {
        GLES31.glProgramUniform4fv(this.id, getUniformLocation(str), fArr.length >> 2, fArr, 0);
    }

    public void setUniform4i(String str, int i, int i2, int i3, int i4) {
        GLES31.glProgramUniform4i(this.id, getUniformLocation(str), i, i2, i3, i4);
    }

    public void setUniform4i(String str, Vector4i vector4i) {
        setUniform4i(str, vector4i.f2504x, vector4i.f2505y, vector4i.f2506z, vector4i.f2503w);
    }

    public void setUniformBool(String str, boolean z) {
        GLES31.glProgramUniform1i(this.id, getUniformLocation(str), z);
    }

    public void setUniformMatrix4f(String str, Matrix4f matrix4f) {
        setUniformMatrix4fv(str, 1, false, matrix4f.toFloatArray(), 0);
    }

    public void setUniformMatrix4f(String str, boolean z, float[] fArr) {
        setUniformMatrix4fv(str, 1, z, fArr, 0);
    }

    public void setUniformMatrix4f(String str, float[] fArr) {
        setUniformMatrix4fv(str, 1, false, fArr, 0);
    }

    public void setUniformMatrix4fArray(String str, List list) {
        String str2 = str;
        setUniformMatrix4fv(str2, list.size(), false, VecmathUtilities.matrix4fListToFloatArray(list), 0);
    }

    public void setUniformMatrix4fv(String str, int i, boolean z, float[] fArr, int i2) {
        if (z) {
            throw new RuntimeException("GLES says rowMajor must be false!");
        }
        GLES31.glProgramUniformMatrix4fv(this.id, getUniformLocation(str), i, z, fArr, i2);
    }
}
