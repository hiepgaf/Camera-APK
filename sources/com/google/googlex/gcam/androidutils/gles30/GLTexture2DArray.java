package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import com.google.googlex.gcam.androidutils.Array2D.U8x4;
import com.google.googlex.gcam.androidutils.vecmath.Vector2i;
import com.google.googlex.gcam.androidutils.vecmath.Vector3i;

/* compiled from: PG */
public class GLTexture2DArray extends GLTexture {
    public final int height;
    public final int nLayers;
    public final int width;

    public GLTexture2DArray(int i, int i2, int i3, int i4) {
        super(35866, i4);
        this.width = i;
        this.height = i2;
        this.nLayers = i3;
        bind();
        GLES30.glTexStorage3D(35866, 1, i4, i, i2, i3);
        unbind();
    }

    public GLTexture2DArray(Vector2i vector2i, int i, int i2) {
        this(vector2i.f2487x, vector2i.f2488y, i, i2);
    }

    public GLTexture2DArray(Vector3i vector3i, int i) {
        this(vector3i.f2492x, vector3i.f2493y, vector3i.f2494z, i);
    }

    public static GLTexture2DArray createIfNullOrMismatched(GLTexture2DArray gLTexture2DArray, Vector2i vector2i, int i, int i2) {
        if (gLTexture2DArray == null) {
            return new GLTexture2DArray(vector2i, i, i2);
        }
        if (gLTexture2DArray.sizeXY().equals(vector2i) && gLTexture2DArray.internalFormat() == i2) {
            return gLTexture2DArray;
        }
        gLTexture2DArray.close();
        return new GLTexture2DArray(vector2i, i, i2);
    }

    public int height() {
        return this.height;
    }

    public int numLayers() {
        return this.nLayers;
    }

    public void setLayer(int i, U8x4 u8x4) {
        GLES30.glTexSubImage3D(35866, 0, 0, 0, i, this.width, this.height, 1, 6408, 5121, u8x4.buffer());
    }

    public Vector3i size() {
        return new Vector3i(this.width, this.height, this.nLayers);
    }

    public Vector2i sizeXY() {
        return new Vector2i(this.width, this.height);
    }

    public int width() {
        return this.width;
    }
}
