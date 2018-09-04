package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import com.google.googlex.gcam.androidutils.vecmath.Vector3i;

/* compiled from: PG */
public class GLTexture3D extends GLTexture {
    public final int depth;
    public final int height;
    public final int width;

    public GLTexture3D(int i, int i2, int i3, int i4) {
        super(32879, i4);
        this.width = i;
        this.height = i2;
        this.depth = i3;
        bind();
        GLES30.glTexStorage3D(32879, 1, i4, i, i2, i3);
        unbind();
    }

    public GLTexture3D(Vector3i vector3i, int i) {
        this(vector3i.f2492x, vector3i.f2493y, vector3i.f2494z, i);
    }

    public static GLTexture3D createIfNullOrMismatched(GLTexture3D gLTexture3D, Vector3i vector3i, int i) {
        if (gLTexture3D == null) {
            return new GLTexture3D(vector3i, i);
        }
        if (gLTexture3D.size().equals(vector3i) && gLTexture3D.internalFormat() == i) {
            return gLTexture3D;
        }
        gLTexture3D.close();
        return new GLTexture3D(vector3i, i);
    }

    public int depth() {
        return this.depth;
    }

    public int height() {
        return this.height;
    }

    public Vector3i size() {
        return new Vector3i(this.width, this.height, this.depth);
    }

    public int width() {
        return this.width;
    }
}
