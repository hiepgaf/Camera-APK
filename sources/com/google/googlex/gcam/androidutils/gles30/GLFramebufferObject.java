package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import com.google.googlex.gcam.androidutils.vecmath.Vector4f;
import com.google.googlex.gcam.androidutils.vecmath.Vector4i;
import java.io.Closeable;

/* compiled from: PG */
public class GLFramebufferObject implements Closeable {
    public int id;

    /* compiled from: PG */
    public final class BlitBits {
        public static final int COLOR_BUFFER_BIT = 16384;
        public static final int DEPTH_BUFFER_BIT = 256;
        public static final int STENCIL_BUFFER_BIT = 1024;

        private BlitBits() {
        }
    }

    public GLFramebufferObject() {
        int[] iArr = new int[1];
        GLES30.glGenFramebuffers(1, iArr, 0);
        this.id = iArr[0];
    }

    public void attachAsDraw(int i, GLTexture2D gLTexture2D) {
        GLES30.glFramebufferTexture2D(36009, 36064 + i, 3553, gLTexture2D.id(), 0);
    }

    public void attachAsRead(int i, GLTexture2D gLTexture2D) {
        GLES30.glFramebufferTexture2D(36008, 36064 + i, 3553, gLTexture2D.id(), 0);
    }

    public void attachLayerAsDraw(int i, GLTexture2DArray gLTexture2DArray, int i2) {
        GLES30.glFramebufferTextureLayer(36009, 36064 + i, gLTexture2DArray.id(), 0, i2);
    }

    public void attachLayerAsRead(int i, GLTexture2DArray gLTexture2DArray, int i2) {
        GLES30.glFramebufferTextureLayer(36008, 36064 + i, gLTexture2DArray.id(), 0, i2);
    }

    public void bindAsDraw() {
        GLES30.glBindFramebuffer(36009, this.id);
    }

    public void bindAsDrawAndRead() {
        GLES30.glBindFramebuffer(36160, this.id);
    }

    public void bindAsRead() {
        GLES30.glBindFramebuffer(36008, this.id);
    }

    public static void blit(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        GLES30.glBlitFramebuffer(i, i2, i + i3, i2 + i4, i5, i6, i5 + i7, i6 + i8, i9, i10);
    }

    public void clearColorFixedPoint(int i, Vector4f vector4f) {
        clearColorFixedPoint(i, new float[]{vector4f.f2500x, vector4f.f2501y, vector4f.f2502z, vector4f.f2499w});
    }

    public void clearColorFixedPoint(int i, float[] fArr) {
        GLES30.glClearBufferfv(6144, i, fArr, 0);
    }

    public void clearColorFloat(int i, Vector4f vector4f) {
        clearColorFloat(i, new float[]{vector4f.f2500x, vector4f.f2501y, vector4f.f2502z, vector4f.f2499w});
    }

    public void clearColorFloat(int i, float[] fArr) {
        GLES30.glClearBufferfv(6144, i, fArr, 0);
    }

    public void clearColorSignedInteger(int i, Vector4i vector4i) {
        clearColorSignedInteger(i, new int[]{vector4i.f2504x, vector4i.f2505y, vector4i.f2506z, vector4i.f2503w});
    }

    public void clearColorSignedInteger(int i, int[] iArr) {
        GLES30.glClearBufferiv(6144, i, iArr, 0);
    }

    public void clearColorUnsignedInteger(int i, Vector4i vector4i) {
        clearColorUnsignedInteger(i, new int[]{vector4i.f2504x, vector4i.f2505y, vector4i.f2506z, vector4i.f2503w});
    }

    public void clearColorUnsignedInteger(int i, int[] iArr) {
        GLES30.glClearBufferuiv(6144, i, iArr, 0);
    }

    public void clearDepth(float f) {
        GLES30.glClearBufferfv(6145, 0, new float[]{f}, 0);
    }

    public void clearDepthAndStencil(float f, int i) {
        GLES30.glClearBufferfi(34041, 0, f, i);
    }

    public void clearStencil(int i) {
        GLES30.glClearBufferiv(6146, 0, new int[]{i}, 0);
    }

    public void close() {
        GLES30.glDeleteFramebuffers(1, new int[]{this.id}, 0);
        this.id = 0;
    }

    public void detachAsDraw(int i) {
        GLES30.glFramebufferTexture2D(36009, 36064 + i, 3553, 0, 0);
    }

    public void detachAsRead(int i) {
        GLES30.glFramebufferTexture2D(36008, 36064 + i, 3553, 0, 0);
    }

    public int id() {
        return this.id;
    }

    public boolean isComplete() {
        return GLES30.glCheckFramebufferStatus(36160) == 36053;
    }

    public static void unbindAllDraw() {
        GLES30.glBindFramebuffer(36009, 0);
    }

    public static void unbindAllDrawAndRead() {
        GLES30.glBindFramebuffer(36160, 0);
    }

    public static void unbindAllRead() {
        GLES30.glBindFramebuffer(36008, 0);
    }
}
