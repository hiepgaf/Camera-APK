package com.google.googlex.gcam.androidutils.gles20;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Log;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.googlex.gcam.androidutils.Array2D.F32x4;
import com.google.googlex.gcam.androidutils.Array2D.U8x4;

/* compiled from: PG */
public class GLUtilities {
    public static final String TAG = "GLUtilities";

    public static String getErrorString() {
        switch (GLES20.glGetError()) {
            case 0:
                return "GL_NO_ERROR";
            case DepthmapTask.DEPTH_PROCESSING_LATTICE_HR_MAX_SIZE_PX /*1280*/:
                return "GL_INVALID_ENUM";
            case 1281:
                return "GL_INVALID_VALUE";
            case 1282:
                return "GL_INVALID_OPERATION";
            case 1285:
                return "GL_OUT_OF_MEMORY";
            case 1286:
                return "GL_INVALID_FRAMEBUFFER_OPERATION";
            default:
                return String.format("Error code 0x%x not recognized", new Object[]{Integer.valueOf(GLES20.glGetError())});
        }
    }

    public static int glGetInteger(int i) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(i, iArr, 0);
        return iArr[0];
    }

    public static int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        String valueOf = String.valueOf(GLES20.glGetShaderInfoLog(glCreateShader));
        String str2 = "shader info log: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        Log.d("GLUtilities", valueOf);
        throw new RuntimeException("shader compilation failed!");
    }

    public static String matrix4x4ToString(float[] fArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            stringBuilder.append("[ ");
            for (int i2 = 0; i2 < 4; i2++) {
                stringBuilder.append(fArr[(i2 << 2) + i]);
                stringBuilder.append("\t");
            }
            stringBuilder.append("]\n");
        }
        return stringBuilder.toString();
    }

    public static F32x4 readPixels_f32x4(int i, int i2) {
        return readPixels_f32x4(0, 0, i, i2);
    }

    public static F32x4 readPixels_f32x4(int i, int i2, int i3, int i4) {
        F32x4 f32x4 = new F32x4(i3, i4);
        readPixels_f32x4(i, i2, f32x4);
        return f32x4;
    }

    public static void readPixels_f32x4(int i, int i2, F32x4 f32x4) {
        GLES20.glReadPixels(i, i2, f32x4.width(), f32x4.height(), 6408, 5126, f32x4.buffer());
    }

    public static U8x4 readPixels_u8x4(int i, int i2) {
        return readPixels_u8x4(0, 0, i, i2);
    }

    public static U8x4 readPixels_u8x4(int i, int i2, int i3, int i4) {
        U8x4 u8x4 = new U8x4(i3, i4);
        readPixels_u8x4(i, i2, u8x4);
        return u8x4;
    }

    public static void readPixels_u8x4(int i, int i2, U8x4 u8x4) {
        if (i < 0 || i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder(89);
            stringBuilder.append("readPixels_u8x4 requires a non-negative origin, received: x = ");
            stringBuilder.append(i);
            stringBuilder.append(" y = ");
            stringBuilder.append(i2);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        GLES30.glReadPixels(i, i2, u8x4.width(), u8x4.height(), 6408, 5121, u8x4.buffer());
    }

    public static void setViewport(int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }
}
