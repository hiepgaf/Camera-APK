package com.google.android.libraries.smartburst.filterfw;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class TextureSource {
    public boolean mIsAllocated = false;
    public boolean mIsOwner;
    public int mTarget;
    public int mTexId;

    private TextureSource(int i, int i2, boolean z) {
        this.mTexId = i;
        this.mTarget = i2;
        this.mIsOwner = z;
    }

    public void allocate(int i, int i2) {
        GLToolbox.allocateTexturePixels(this.mTexId, this.mTarget, i, i2);
        this.mIsAllocated = true;
    }

    public void allocateWithBitmapPixels(Bitmap bitmap) {
        GLToolbox.setTexturePixels(this.mTexId, this.mTarget, bitmap);
        this.mIsAllocated = true;
    }

    public void allocateWithPixels(ByteBuffer byteBuffer, int i, int i2) {
        GLToolbox.setTexturePixels(this.mTexId, this.mTarget, byteBuffer, i, i2);
        this.mIsAllocated = true;
    }

    public void bind() {
        GLES20.glBindTexture(this.mTarget, this.mTexId);
        GLToolbox.checkGlError("glBindTexture");
    }

    public static TextureSource fromTexture(int i) {
        return new TextureSource(i, 3553, false);
    }

    public static TextureSource fromTexture(int i, int i2) {
        return new TextureSource(i, i2, false);
    }

    public void generateMipmaps() {
        GLES20.glBindTexture(this.mTarget, this.mTexId);
        GLES20.glTexParameteri(this.mTarget, 10241, FilterModes.LINEAR_MIPMAP_LINEAR);
        GLES20.glGenerateMipmap(this.mTarget);
        GLES20.glBindTexture(this.mTarget, 0);
    }

    public int getTarget() {
        return this.mTarget;
    }

    public int getTextureId() {
        return this.mTexId;
    }

    boolean isAllocated() {
        return this.mIsAllocated;
    }

    public static TextureSource newExternalTexture() {
        return new TextureSource(GLToolbox.generateTexture(), 36197, true);
    }

    public static TextureSource newTexture() {
        return new TextureSource(GLToolbox.generateTexture(), 3553, true);
    }

    public void release() {
        if (this.mIsOwner) {
            GLToolbox.deleteTexture(this.mTexId);
        }
        this.mTexId = GLToolbox.textureNone();
    }

    public void setDefaultParams() {
        GLES20.glBindTexture(this.mTarget, this.mTexId);
        GLToolbox.setDefaultTexParams();
        GLES20.glBindTexture(this.mTarget, 0);
    }

    public void setParameter(int i, int i2) {
        GLES20.glBindTexture(this.mTarget, this.mTexId);
        GLES20.glTexParameteri(this.mTarget, i, i2);
        GLES20.glBindTexture(this.mTarget, 0);
    }

    public String toString() {
        int i = this.mTexId;
        int i2 = this.mTarget;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("TextureSource(id=");
        stringBuilder.append(i);
        stringBuilder.append(", target=");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
