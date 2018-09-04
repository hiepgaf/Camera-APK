package com.google.googlex.gcam.androidutils.gles20;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.view.Surface;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;
import com.google.googlex.gcam.androidutils.vecmath.Vector2i;

/* compiled from: PG */
public class GLTextureOESExternal extends GLTexture {
    public final int height;
    public final Surface surface;
    public final SurfaceTexture surfaceTexture;
    public final int width;

    public GLTextureOESExternal(int i, int i2) {
        this(i, i2, null);
    }

    public GLTextureOESExternal(int i, int i2, OnFrameAvailableListener onFrameAvailableListener) {
        super(36197, -1);
        this.width = i;
        this.height = i2;
        GLES20.glActiveTexture(33984);
        bind();
        GLES20.glTexParameteri(36197, 10241, FilterModes.NEAREST);
        GLES20.glTexParameteri(36197, 10240, FilterModes.NEAREST);
        this.surfaceTexture = new SurfaceTexture(id());
        this.surfaceTexture.setDefaultBufferSize(i, i2);
        setListener(onFrameAvailableListener);
        this.surface = new Surface(this.surfaceTexture);
        unbind();
    }

    public GLTextureOESExternal(Vector2i vector2i) {
        this(vector2i.f2487x, vector2i.f2488y);
    }

    public GLTextureOESExternal(Vector2i vector2i, OnFrameAvailableListener onFrameAvailableListener) {
        this(vector2i.f2487x, vector2i.f2488y, onFrameAvailableListener);
    }

    public int height() {
        return this.height;
    }

    public static int numTextureUnitsNeeded() {
        return GLUtilities.glGetInteger(36200);
    }

    public void setListener(OnFrameAvailableListener onFrameAvailableListener) {
        this.surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener);
    }

    public Vector2i size() {
        return new Vector2i(this.width, this.height);
    }

    public Surface surface() {
        return this.surface;
    }

    public SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }

    public void updateContents() {
        this.surfaceTexture.updateTexImage();
    }

    public int width() {
        return this.width;
    }
}
