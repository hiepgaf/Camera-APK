package com.google.android.apps.refocus.image;

/* compiled from: PG */
public class ColorImage {
    public byte[] data;
    public int format;
    public int height;
    public int width;

    /* compiled from: PG */
    public class Format {
        public static final int IMAGE_FORMAT_JPEG = 256;
        public static final int IMAGE_FORMAT_NV21 = 17;
        public static final int JPEG = 256;
        public static final int RGBA_8888 = 1;
        public static final int RGB_888 = 2;
        public static final int UNDEFINED = -1;
        public static final int YUV_NV21 = 17;

        public static int fromImageFormat(int i) {
            if (i == 17) {
                return 17;
            }
            if (i == 256) {
                return 256;
            }
            return -1;
        }
    }

    public ColorImage(int i, int i2, int i3, byte[] bArr) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
        this.format = i3;
    }

    public byte[] getBuffer() {
        return this.data;
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBuffer(byte[] bArr) {
        this.data = bArr;
    }

    public boolean swapBuffers(ColorImage colorImage) {
        if (colorImage == null || colorImage.format != this.format || colorImage.width != this.width || colorImage.height != this.height) {
            return false;
        }
        byte[] bArr = this.data;
        this.data = colorImage.data;
        colorImage.data = bArr;
        return true;
    }
}
