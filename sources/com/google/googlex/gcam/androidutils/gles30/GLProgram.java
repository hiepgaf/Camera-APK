package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import com.google.googlex.gcam.androidutils.vecmath.Matrix4f;
import com.google.googlex.gcam.androidutils.vecmath.VecmathUtilities;
import com.google.googlex.gcam.androidutils.vecmath.Vector2i;
import com.google.googlex.gcam.androidutils.vecmath.Vector3i;
import com.google.googlex.gcam.androidutils.vecmath.Vector4f;
import com.google.googlex.gcam.androidutils.vecmath.Vector4i;
import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
public class GLProgram implements Closeable {
    public static final String TAG = "GLProgram";
    public final int id = GLES30.glCreateProgram();

    public void attachShader(GLShader gLShader) {
        GLES30.glAttachShader(this.id, gLShader.getId());
    }

    public void close() {
        GLES30.glDeleteProgram(this.id);
    }

    public static GLProgram fromVertexAndFragmentShaders(GLShader gLShader, GLShader gLShader2) {
        GLProgram gLProgram = new GLProgram();
        gLProgram.attachShader(gLShader);
        gLProgram.attachShader(gLShader2);
        gLProgram.link();
        return gLProgram;
    }

    public int getAttributeLocation(String str) {
        return GLES30.glGetAttribLocation(this.id, str);
    }

    public int getId() {
        return this.id;
    }

    public int getUniformLocation(String str) {
        return GLES30.glGetUniformLocation(this.id, str);
    }

    public String infoLog() {
        return GLES30.glGetProgramInfoLog(this.id);
    }

    public void link() {
        GLES30.glLinkProgram(this.id);
        int[] iArr = new int[1];
        GLES30.glGetProgramiv(this.id, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(infoLog());
            String str = "Failed to link program. Info log = ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new IllegalArgumentException(valueOf);
        }
    }

    public void setUniform1f(String str, float f) {
        GLES30.glUniform1f(getUniformLocation(str), f);
    }

    public void setUniform1i(String str, int i) {
        GLES30.glUniform1i(getUniformLocation(str), i);
    }

    public void setUniform2f(String str, float f, float f2) {
        GLES30.glUniform2f(getUniformLocation(str), f, f2);
    }

    public void setUniform2i(String str, int i, int i2) {
        GLES30.glUniform2i(getUniformLocation(str), i, i2);
    }

    public void setUniform2i(String str, Vector2i vector2i) {
        setUniform2i(str, vector2i.f2487x, vector2i.f2488y);
    }

    public void setUniform3f(String str, float f, float f2, float f3) {
        GLES30.glUniform3f(getUniformLocation(str), f, f2, f3);
    }

    public void setUniform3i(String str, int i, int i2, int i3) {
        GLES30.glUniform3i(getUniformLocation(str), i, i2, i3);
    }

    public void setUniform3i(String str, Vector3i vector3i) {
        setUniform3i(str, vector3i.f2492x, vector3i.f2493y, vector3i.f2494z);
    }

    public void setUniform4f(String str, float f, float f2, float f3, float f4) {
        GLES30.glUniform4f(getUniformLocation(str), f, f2, f3, f4);
    }

    public void setUniform4f(String str, Vector4f vector4f) {
        GLES30.glUniform4f(getUniformLocation(str), vector4f.f2500x, vector4f.f2501y, vector4f.f2502z, vector4f.f2499w);
    }

    public void setUniform4fArray(String str, List list) {
        setUniform4fArray(str, VecmathUtilities.vector4fListToFloatArray(list));
    }

    public void setUniform4fArray(String str, float[] fArr) {
        GLES30.glUniform4fv(getUniformLocation(str), fArr.length >> 2, fArr, 0);
    }

    public void setUniform4i(String str, int i, int i2, int i3, int i4) {
        GLES30.glUniform4i(getUniformLocation(str), i, i2, i3, i4);
    }

    public void setUniform4i(String str, Vector4i vector4i) {
        setUniform4i(str, vector4i.f2504x, vector4i.f2505y, vector4i.f2506z, vector4i.f2503w);
    }

    public void setUniformBool(String str, boolean z) {
        GLES30.glUniform1i(getUniformLocation(str), z);
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
        GLES30.glUniformMatrix4fv(getUniformLocation(str), i, z, fArr, i2);
    }

    public static void unuseAll() {
        GLES30.glUseProgram(0);
    }

    public void use() {
        GLES30.glUseProgram(this.id);
    }
}
