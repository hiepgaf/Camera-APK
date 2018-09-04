package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import java.io.Closeable;

/* compiled from: PG */
public class GLSamplerObject implements Closeable {
    public final int id;

    /* compiled from: PG */
    public final class CompareFunctions {
        public static final int ALWAYS = 519;
        public static final int EQUAL = 514;
        public static final int GEQUAL = 518;
        public static final int GREATER = 516;
        public static final int LEQUAL = 515;
        public static final int LESS = 513;
        public static final int NEVER = 512;
        public static final int NOTEQUAL = 517;

        private CompareFunctions() {
        }
    }

    /* compiled from: PG */
    public final class CompareModes {
        public static final int COMPARE_REF_TO_TEXTURE = 34894;
        public static final int NONE = 0;

        private CompareModes() {
        }
    }

    /* compiled from: PG */
    public final class FilterModes {
        public static final int LINEAR = 9729;
        public static final int LINEAR_MIPMAP_LINEAR = 9987;
        public static final int NEAREST = 9728;
        public static final int NEAREST_MIPMAP_LINEAR = 9986;
        public static final int NEAREST_MIPMAP_NEAREST = 9984;

        private FilterModes() {
        }
    }

    /* compiled from: PG */
    public final class WrapAxes {
        /* renamed from: R */
        public static final int f2482R = 32882;
        /* renamed from: S */
        public static final int f2483S = 10242;
        /* renamed from: T */
        public static final int f2484T = 10243;

        private WrapAxes() {
        }
    }

    /* compiled from: PG */
    public final class WrapModes {
        public static final int CLAMP_TO_EDGE = 33071;
        public static final int MIRRORED_REPEAT = 33648;
        public static final int REPEAT = 10497;

        private WrapModes() {
        }
    }

    public GLSamplerObject() {
        int[] iArr = new int[1];
        GLES30.glGenSamplers(1, iArr, 0);
        this.id = iArr[0];
    }

    public void bind(int i) {
        GLES30.glBindSampler(i, this.id);
    }

    public void close() {
        GLES30.glDeleteSamplers(1, new int[]{this.id}, 0);
    }

    public int id() {
        return this.id;
    }

    public void setAllWrapModes(int i) {
        setWrapMode(WrapAxes.f2483S, i);
        setWrapMode(WrapAxes.f2484T, i);
        setWrapMode(WrapAxes.f2482R, i);
    }

    public void setCompareFunction(int i) {
        GLES30.glSamplerParameteri(this.id, 34893, i);
    }

    public void setCompareMode(int i) {
        GLES30.glSamplerParameteri(this.id, 34892, i);
    }

    public void setMagFilter(int i) {
        GLES30.glSamplerParameteri(this.id, 10240, i);
    }

    public void setMaxLod(float f) {
        GLES30.glSamplerParameterf(this.id, 33083, f);
    }

    public void setMinFilter(int i) {
        GLES30.glSamplerParameteri(this.id, 10241, i);
    }

    public void setMinLod(float f) {
        GLES30.glSamplerParameterf(this.id, 33082, f);
    }

    public void setMinMagFilters(int i) {
        setMinFilter(i);
        setMagFilter(i);
    }

    public void setMinMagFilters(int i, int i2) {
        setMinFilter(i);
        setMagFilter(i2);
    }

    public void setWrapMode(int i, int i2) {
        GLES30.glSamplerParameteri(this.id, i, i2);
    }

    public void setWrapMode(int i, int i2, int i3) {
        setWrapMode(WrapAxes.f2483S, i);
        setWrapMode(WrapAxes.f2484T, i2);
        setWrapMode(WrapAxes.f2482R, i3);
    }

    public static void unbind(int i) {
        GLES30.glBindSampler(i, 0);
    }
}
