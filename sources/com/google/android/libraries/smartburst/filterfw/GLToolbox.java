package com.google.android.libraries.smartburst.filterfw;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Looper;
import com.google.android.libraries.smartburst.filterfw.util.Trace;
import com.google.googlex.gcam.androidutils.gles30.GLBufferObject.Target;
import com.google.googlex.gcam.androidutils.gles30.GLBufferObject.Usage;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapAxes;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapModes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class GLToolbox {
    public static void allocateTexturePixels(int i, int i2, int i3, int i4) {
        setTexturePixels(i, i2, null, i3, i4);
    }

    private static void assertNonUiThread(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
            stringBuilder.append("Attempting to perform GL operation '");
            stringBuilder.append(str);
            stringBuilder.append("' on UI thread!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void attachTextureToFbo(int i, int i2) {
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        checkGlError("glFramebufferTexture2D");
    }

    public static int attachedTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGetFramebufferAttachmentParameteriv(36160, 36064, 36049, iArr, 0);
        checkGlError("glGetFramebufferAttachmentParameteriv");
        return iArr[0];
    }

    public static void checkGlError(String str) {
        List arrayList = new ArrayList();
        for (int glGetError = GLES20.glGetError(); glGetError != 0; glGetError = GLES20.glGetError()) {
            arrayList.add(Integer.toHexString(glGetError));
        }
        if (!arrayList.isEmpty()) {
            String valueOf = String.valueOf(arrayList);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 33) + String.valueOf(valueOf).length());
            stringBuilder.append("GL Operation '");
            stringBuilder.append(str);
            stringBuilder.append("' caused error(s) ");
            stringBuilder.append(valueOf);
            stringBuilder.append("!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void deleteFbo(int i) {
        int[] iArr = new int[]{i};
        assertNonUiThread("glDeleteFramebuffers");
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        checkGlError("glDeleteFramebuffers");
    }

    public static void deleteTexture(int i) {
        int[] iArr = new int[]{i};
        assertNonUiThread("glDeleteTextures");
        GLES20.glDeleteTextures(1, iArr, 0);
        checkGlError("glDeleteTextures");
    }

    public static void deleteVbo(int i) {
        GLES20.glDeleteBuffers(1, new int[]{i}, 0);
        checkGlError("glDeleteBuffers");
    }

    public static int generateFbo() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError("glGenFramebuffers");
        return iArr[0];
    }

    public static int generateTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError("glGenTextures");
        return iArr[0];
    }

    public static int generateVbo() {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        checkGlError("glGenBuffers");
        return iArr[0];
    }

    public static boolean isTexture(int i) {
        return GLES20.glIsTexture(i);
    }

    public static boolean isVbo(int i) {
        return GLES20.glIsBuffer(i);
    }

    public static void readFbo(int i, ByteBuffer byteBuffer, int i2, int i3) {
        Trace.beginSection("readFbo");
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, byteBuffer);
        checkGlError("glReadPixels");
        Trace.endSection();
    }

    public static void readTarget(RenderTarget renderTarget, ByteBuffer byteBuffer, int i, int i2) {
        Trace.beginSection("readTarget");
        renderTarget.focus();
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, byteBuffer);
        checkGlError("glReadPixels");
        Trace.endSection();
    }

    public static void setDefaultTexParams() {
        GLES20.glTexParameteri(3553, 10240, FilterModes.LINEAR);
        GLES20.glTexParameteri(3553, 10241, FilterModes.LINEAR);
        GLES20.glTexParameteri(3553, WrapAxes.f2483S, WrapModes.CLAMP_TO_EDGE);
        GLES20.glTexParameteri(3553, WrapAxes.f2484T, WrapModes.CLAMP_TO_EDGE);
        checkGlError("glTexParameteri");
    }

    public static void setTexturePixels(int i, int i2, Bitmap bitmap) {
        GLES20.glBindTexture(i2, i);
        GLUtils.texImage2D(i2, 0, bitmap, 0);
        checkGlError("glTexImage2D");
        setDefaultTexParams();
    }

    public static void setTexturePixels(int i, int i2, ByteBuffer byteBuffer, int i3, int i4) {
        GLES20.glBindTexture(i2, i);
        GLES20.glTexImage2D(i2, 0, 6408, i3, i4, 0, 6408, 5121, byteBuffer);
        checkGlError("glTexImage2D");
        setDefaultTexParams();
    }

    public static void setVboData(int i, ByteBuffer byteBuffer) {
        GLES20.glBindBuffer(Target.ARRAY_BUFFER, i);
        GLES20.glBufferData(Target.ARRAY_BUFFER, byteBuffer.remaining(), byteBuffer, Usage.STATIC_DRAW);
        checkGlError("glBufferData");
    }

    public static void setVboFloats(int i, float[] fArr) {
        setVboData(i, ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()));
    }

    public static int textureNone() {
        return 0;
    }

    public static int vboNone() {
        return 0;
    }
}
