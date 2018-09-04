package com.google.android.libraries.smartburst.filterpacks.video;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.Closeable;

/* compiled from: PG */
public class GLSurface implements Closeable {
    public boolean mClosed = false;
    public InputSurface mInputSurface;
    public OutputSurface mOutputSurface;
    public TextureRender mTextureRender;

    /* compiled from: PG */
    public class Builder {
        public boolean mAttachToSurface;
        public boolean mEncoderOnly;
        public GLSurface mGLSurface;
        public MediaFormat mMediaFormat;
        public Surface mSurface;

        private Builder() {
            this.mEncoderOnly = false;
            this.mAttachToSurface = true;
        }

        public GLSurface getOrBuild() {
            GLSurface gLSurface = this.mGLSurface;
            if (gLSurface != null) {
                return gLSurface;
            }
            Surface surface = this.mSurface;
            if (surface == null) {
                MediaFormat mediaFormat = this.mMediaFormat;
                if (mediaFormat != null) {
                    this.mGLSurface = GLSurface.newInstanceForOutputOnly(mediaFormat);
                    return this.mGLSurface;
                }
                throw new IllegalStateException("Builder missing inputs. Requires at least surface or format be specified.");
            } else if (this.mEncoderOnly) {
                this.mGLSurface = GLSurface.newInstanceForInputOnly(surface, this.mAttachToSurface);
                return this.mGLSurface;
            } else {
                this.mGLSurface = GLSurface.newInstanceForInputOutput(surface);
                return this.mGLSurface;
            }
        }

        public void reset() {
            GLSurface gLSurface = this.mGLSurface;
            if (gLSurface != null) {
                gLSurface.close();
            }
            this.mGLSurface = null;
            this.mMediaFormat = null;
            this.mSurface = null;
        }

        public Builder setDirectSurface(boolean z) {
            this.mAttachToSurface = z ^ 1;
            return this;
        }

        public Builder setEncoderOnly(boolean z) {
            this.mEncoderOnly = true;
            return this;
        }

        public Builder setFormat(MediaFormat mediaFormat) {
            this.mMediaFormat = mediaFormat;
            return this;
        }

        public Builder setSurface(Surface surface) {
            this.mSurface = surface;
            return this;
        }
    }

    private GLSurface(InputSurface inputSurface, OutputSurface outputSurface) {
        this.mInputSurface = inputSurface;
        this.mOutputSurface = outputSurface;
    }

    public void awaitNewImage() {
        this.mOutputSurface.awaitNewImage();
    }

    public void close() {
        if (!this.mClosed) {
            this.mClosed = true;
            OutputSurface outputSurface = this.mOutputSurface;
            if (outputSurface != null) {
                outputSurface.release();
                this.mOutputSurface = null;
            }
            InputSurface inputSurface = this.mInputSurface;
            if (inputSurface != null) {
                inputSurface.release();
                this.mInputSurface = null;
            }
        }
    }

    public void drawImage() {
        TextureRender textureRender = this.mTextureRender;
        if (textureRender != null) {
            textureRender.drawFrame();
        } else {
            this.mOutputSurface.drawImage();
        }
    }

    public Surface getInputSurface() {
        return this.mInputSurface.getSurface();
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mOutputSurface.getSurfaceTexture();
    }

    public void makeCurrent() {
        InputSurface inputSurface = this.mInputSurface;
        if (inputSurface != null) {
            inputSurface.makeCurrent();
        } else {
            this.mOutputSurface.makeCurrent();
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private static GLSurface newInstanceForInputOnly(Surface surface, boolean z) {
        InputSurface inputSurface = new InputSurface(surface, z);
        TextureRender textureRender = new TextureRender(false);
        textureRender.initialize();
        GLSurface gLSurface = new GLSurface(inputSurface, null);
        gLSurface.mTextureRender = textureRender;
        return gLSurface;
    }

    private static GLSurface newInstanceForInputOutput(Surface surface) {
        InputSurface inputSurface = new InputSurface(surface, true);
        inputSurface.makeCurrent();
        return new GLSurface(inputSurface, new OutputSurface());
    }

    private static GLSurface newInstanceForOutputOnly(MediaFormat mediaFormat) {
        return new GLSurface(null, new OutputSurface(mediaFormat.getInteger("width"), mediaFormat.getInteger("height")));
    }

    public void setAffineTransform(int i, int i2, int i3, int i4) {
        this.mTextureRender.setAffineTransform(i, i2, i3, i4);
    }

    public void setPresentationTimeNs(long j) {
        this.mInputSurface.setPresentationTime(j);
    }

    public void setSourceTexture(int i) {
        TextureRender textureRender = this.mTextureRender;
        if (textureRender == null) {
            throw new IllegalStateException("Not configured for encoder only.");
        }
        textureRender.setSourceTexture(i);
    }

    public Surface surfaceForDecoderOutput() {
        return this.mOutputSurface.getSurface();
    }

    public void swapBuffers() {
        this.mInputSurface.swapBuffers();
    }
}
