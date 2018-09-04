package com.google.googlex.gcam.androidutils.gles31;

import android.opengl.GLES31;
import com.google.googlex.gcam.androidutils.gles30.GLUtilities;
import java.io.Closeable;

/* compiled from: PG */
public class GLTexture implements Closeable {
    public int id;
    public final int internalFormat;
    public final int target;

    /* compiled from: PG */
    public final class ImageFormats {
        public static final int ALPHA = 6406;
        public static final int BLUE = 6405;
        public static final int DEPTH_COMPONENT = 6402;
        public static final int DEPTH_STENCIL = 34041;
        public static final int GREEN = 6404;
        public static final int RED = 6403;
        public static final int RED_INTEGER = 36244;
        public static final int RG = 33319;
        public static final int RGB = 6407;
        public static final int RGBA = 6408;
        public static final int RGBA_INTEGER = 36249;
        public static final int RGB_INTEGER = 36248;
        public static final int RG_INTEGER = 33320;
        public static final int STENCIL_INDEX = 6401;

        private ImageFormats(GLTexture gLTexture) {
        }
    }

    /* compiled from: PG */
    public final class InternalFormats {
        public static final int EXTERNAL_OES = -1;
        public static final int R16F = 33325;
        public static final int R16I = 33331;
        public static final int R16UI = 33332;
        public static final int R32F = 33326;
        public static final int R32I = 33333;
        public static final int R32UI = 33334;
        public static final int R8 = 33321;
        public static final int R8I = 33329;
        public static final int R8UI = 33330;
        public static final int R8_SNORM = 36756;
        public static final int RG16F = 33327;
        public static final int RG16I = 33337;
        public static final int RG16UI = 33338;
        public static final int RG32F = 33328;
        public static final int RG32I = 33339;
        public static final int RG32UI = 33340;
        public static final int RG8 = 33323;
        public static final int RG8I = 33335;
        public static final int RG8UI = 33336;
        public static final int RG8_SNORM = 36757;
        public static final int RGB16F = 34843;
        public static final int RGB16I = 36233;
        public static final int RGB16UI = 36215;
        public static final int RGB32F = 34837;
        public static final int RGB32I = 36227;
        public static final int RGB32UI = 36209;
        public static final int RGB8 = 32849;
        public static final int RGB8I = 36239;
        public static final int RGB8UI = 36221;
        public static final int RGB8_SNORM = 36758;
        public static final int RGBA16F = 34842;
        public static final int RGBA16I = 36232;
        public static final int RGBA16UI = 36214;
        public static final int RGBA32F = 34836;
        public static final int RGBA32I = 36226;
        public static final int RGBA32UI = 36208;
        public static final int RGBA8 = 32856;
        public static final int RGBA8I = 36238;
        public static final int RGBA8UI = 36220;
        public static final int RGBA8_SNORM = 36759;
        public static final int SRGB8 = 35905;
        public static final int SRGB8_ALPHA8 = 35907;

        private InternalFormats() {
        }
    }

    /* compiled from: PG */
    public final class PixelTypes {
        public static final int BYTE = 5120;
        public static final int FLOAT = 5126;
        public static final int FLOAT_32_UNSIGNED_INT_24_8_REV = 36269;
        public static final int HALF_FLOAT = 5131;
        public static final int INT = 5124;
        public static final int SHORT = 5122;
        public static final int UNSIGNED_BYTE = 5121;
        public static final int UNSIGNED_INT = 5125;
        public static final int UNSIGNED_INT_10F_11F_11F_REV = 35899;
        public static final int UNSIGNED_INT_24_8 = 34042;
        public static final int UNSIGNED_INT_2_10_10_10_REV = 33640;
        public static final int UNSIGNED_INT_5_9_9_9_REV = 35902;
        public static final int UNSIGNED_SHORT = 5123;
        public static final int UNSIGNED_SHORT_4_4_4_4 = 32819;
        public static final int UNSIGNED_SHORT_5_5_5_1 = 32820;
        public static final int UNSIGNED_SHORT_5_6_5 = 33635;

        private PixelTypes(GLTexture gLTexture) {
        }
    }

    GLTexture(int i, int i2) {
        this.target = i;
        this.internalFormat = i2;
        int[] iArr = new int[1];
        GLES31.glGenTextures(1, iArr, 0);
        this.id = iArr[0];
    }

    public void bind() {
        GLES31.glBindTexture(this.target, this.id);
    }

    public void close() {
        GLES31.glDeleteTextures(1, new int[]{this.id}, 0);
        this.id = 0;
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
        GLES31.glBindTexture(this.target, 0);
    }

    public static void unbindImageUnit(int i) {
        GLES31.glBindImageTexture(i, 0, 0, true, 0, 35002, 32856);
    }
}
