package com.google.googlex.gcam.androidutils.gles30;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES30;
import android.os.Handler;
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
        super(36197, -1);
        this.width = i;
        this.height = i2;
        GLES30.glActiveTexture(33984);
        bind();
        GLES30.glTexParameteri(36197, 10241, FilterModes.NEAREST);
        GLES30.glTexParameteri(36197, 10240, FilterModes.NEAREST);
        this.surfaceTexture = new SurfaceTexture(id());
        this.surfaceTexture.setDefaultBufferSize(i, i2);
        this.surface = new Surface(this.surfaceTexture);
        unbind();
    }

    public GLTextureOESExternal(int i, int i2, OnFrameAvailableListener onFrameAvailableListener) {
        this(i, i2);
        setListener(onFrameAvailableListener);
    }

    public GLTextureOESExternal(int i, int i2, OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        this(i, i2);
        setListener(onFrameAvailableListener, handler);
    }

    public GLTextureOESExternal(Vector2i vector2i) {
        this(vector2i.f2487x, vector2i.f2488y);
    }

    public GLTextureOESExternal(Vector2i vector2i, OnFrameAvailableListener onFrameAvailableListener) {
        this(vector2i.f2487x, vector2i.f2488y, onFrameAvailableListener);
    }

    public GLTextureOESExternal(Vector2i vector2i, OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        this(vector2i.f2487x, vector2i.f2488y, onFrameAvailableListener, handler);
    }

    public void close() {
        this.surfaceTexture.release();
        super.close();
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

    public void setListener(OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        this.surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
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

    public long timestamp() {
        return this.surfaceTexture.getTimestamp();
    }

    public long updateContents() {
        this.surfaceTexture.updateTexImage();
        return timestamp();
    }

    public int width() {
        return this.width;
    }
}
