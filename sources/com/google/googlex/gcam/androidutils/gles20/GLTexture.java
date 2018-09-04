package com.google.googlex.gcam.androidutils.gles20;

import android.opengl.GLES20;

/* compiled from: PG */
public class GLTexture implements AutoCloseable {
    public final int id;
    public final int internalFormat;
    public final int target;

    GLTexture(int i, int i2) {
        this.target = i;
        this.internalFormat = i2;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.id = iArr[0];
    }

    public void bind() {
        GLES20.glBindTexture(this.target, this.id);
    }

    public void close() {
        GLES20.glDeleteTextures(1, new int[]{this.id}, 0);
    }

    public int id() {
        return this.id;
    }

    public int internalFormat() {
        return this.internalFormat;
    }

    public static int maxCombinedTextureImageUnits() {
        return GLUtilities.glGetInteger(35661);
    }

    public int target() {
        return this.target;
    }

    public void unbind() {
        GLES20.glBindTexture(this.target, 0);
    }
}
