package com.google.googlex.gcam.androidutils.gles31;

import android.opengl.GLES31;
import com.google.googlex.gcam.androidutils.Array2D.F32x1;
import com.google.googlex.gcam.androidutils.Array2D.F32x4;
import com.google.googlex.gcam.androidutils.Array2D.U16x1;
import com.google.googlex.gcam.androidutils.Array2D.U32x4;
import com.google.googlex.gcam.androidutils.Array2D.U8x1;
import com.google.googlex.gcam.androidutils.Array2D.U8x4;
import com.google.googlex.gcam.androidutils.vecmath.Vector2i;
import java.nio.Buffer;

/* compiled from: PG */
public class GLTexture2D extends GLTexture {
    public final int height;
    public final int width;

    public GLTexture2D(int i, int i2, int i3) {
        super(3553, i3);
        this.width = i;
        this.height = i2;
        bind();
        GLES31.glTexStorage2D(3553, 1, i3, i, i2);
        unbind();
    }

    public GLTexture2D(Vector2i vector2i, int i) {
        this(vector2i.f2487x, vector2i.f2488y, i);
    }

    public static GLTexture2D createIfNullOrMismatched(GLTexture2D gLTexture2D, Vector2i vector2i, int i) {
        if (gLTexture2D == null) {
            return new GLTexture2D(vector2i, i);
        }
        if (gLTexture2D.size().equals(vector2i) && gLTexture2D.internalFormat() == i) {
            return gLTexture2D;
        }
        gLTexture2D.close();
        return new GLTexture2D(vector2i, i);
    }

    public int height() {
        return this.height;
    }

    public Vector2i size() {
        return new Vector2i(this.width, this.height);
    }

    public int width() {
        return this.width;
    }

    private void writeSubImage(int i, int i2, int i3, int i4, int i5, int i6, Buffer buffer) {
        GLES31.glTexSubImage2D(target(), 0, i, i2, i3, i4, i5, i6, buffer);
    }

    public void writeSubImage(int i, int i2, int i3, int i4, int i5, F32x1 f32x1) {
        writeSubImage(i, i2, i3, i4, i5, 5126, f32x1.buffer());
    }

    public void writeSubImage(int i, int i2, int i3, int i4, int i5, F32x4 f32x4) {
        writeSubImage(i, i2, i3, i4, i5, 5126, f32x4.buffer());
    }

    public void writeSubImage(int i, int i2, int i3, int i4, int i5, U16x1 u16x1) {
        writeSubImage(i, i2, i3, i4, i5, 5123, u16x1.buffer());
    }

    public void writeSubImage(int i, int i2, int i3, int i4, int i5, U32x4 u32x4) {
        writeSubImage(i, i2, i3, i4, i5, 5125, u32x4.buffer());
    }

    public void writeSubImage(int i, int i2, int i3, int i4, int i5, U8x1 u8x1) {
        writeSubImage(i, i2, i3, i4, i5, 5121, u8x1.buffer());
    }

    public void writeSubImage(int i, int i2, int i3, int i4, int i5, U8x4 u8x4) {
        writeSubImage(i, i2, i3, i4, i5, 5121, u8x4.buffer());
    }

    public void writeSubImage(int i, int i2, int i3, int i4, F32x1 f32x1) {
        writeSubImage(i, i2, i3, i4, 6403, f32x1);
    }

    public void writeSubImage(int i, int i2, int i3, int i4, F32x4 f32x4) {
        writeSubImage(i, i2, i3, i4, 6408, f32x4);
    }

    public void writeSubImage(int i, int i2, int i3, int i4, U8x1 u8x1) {
        writeSubImage(i, i2, i3, i4, 6403, u8x1);
    }

    public void writeSubImage(int i, int i2, int i3, int i4, U8x4 u8x4) {
        writeSubImage(i, i2, i3, i4, 6408, u8x4);
    }

    public void writeSubImageInteger(int i, int i2, int i3, int i4, U16x1 u16x1) {
        writeSubImage(i, i2, i3, i4, 36244, u16x1);
    }

    public void writeSubImageInteger(int i, int i2, int i3, int i4, U32x4 u32x4) {
        writeSubImage(i, i2, i3, i4, 36249, u32x4);
    }

    public void writeSubImageInteger(int i, int i2, int i3, int i4, U8x1 u8x1) {
        writeSubImage(i, i2, i3, i4, 36244, u8x1);
    }

    public void writeSubImageInteger(int i, int i2, int i3, int i4, U8x4 u8x4) {
        writeSubImage(i, i2, i3, i4, 36249, u8x4);
    }
}
