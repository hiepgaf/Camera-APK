package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Rect2i {
    public final Vector2i origin;
    public final Vector2i size;

    public Rect2i() {
        this.origin = new Vector2i();
        this.size = new Vector2i();
    }

    public Rect2i(int i, int i2) {
        this.origin = new Vector2i();
        this.size = new Vector2i(i, i2);
    }

    public Rect2i(int i, int i2, int i3, int i4) {
        this.origin = new Vector2i(i, i2);
        this.size = new Vector2i(i3, i4);
    }

    public Rect2i(Rect2i rect2i) {
        this.origin = new Vector2i(rect2i.origin());
        this.size = new Vector2i(rect2i.size());
    }

    public Rect2i(Vector2i vector2i, Vector2i vector2i2) {
        this.origin = new Vector2i(vector2i);
        this.size = new Vector2i(vector2i2);
    }

    public Vector4i asOriginAndSize() {
        Vector2i vector2i = this.origin;
        int i = vector2i.f2487x;
        int i2 = vector2i.f2488y;
        Vector2i vector2i2 = this.size;
        return new Vector4i(i, i2, vector2i2.f2487x, vector2i2.f2488y);
    }

    public static Rect2i flipUD(Rect2i rect2i, int i) {
        Rect2i standardized = rect2i.standardized();
        standardized.origin().f2488y = i - standardized.max().f2488y;
        return standardized.standardized();
    }

    public static Rect2i fromPoints(Vector2i vector2i, Vector2i vector2i2) {
        int i = vector2i.f2487x;
        int i2 = vector2i.f2488y;
        return new Rect2i(i, i2, vector2i2.f2487x - i, vector2i2.f2488y - i2).standardized();
    }

    public int height() {
        return this.size.f2488y;
    }

    public Vector2i max() {
        Vector2i vector2i = this.origin;
        return VecmathFunctions.max(vector2i, VecmathFunctions.add(vector2i, this.size));
    }

    public Vector2i min() {
        Vector2i vector2i = this.origin;
        return VecmathFunctions.min(vector2i, VecmathFunctions.add(vector2i, this.size));
    }

    public Vector2i origin() {
        return this.origin;
    }

    public Vector2i size() {
        return this.size;
    }

    public Rect2i standardized() {
        int i;
        int i2;
        Vector2i vector2i = this.size;
        int i3 = vector2i.f2487x;
        if (i3 > 0) {
            i = this.origin.f2487x;
        } else {
            i = this.origin.f2487x + i3;
            i3 = -i3;
        }
        int i4 = vector2i.f2488y;
        if (i4 > 0) {
            i2 = this.origin.f2488y;
        } else {
            i2 = this.origin.f2488y + i4;
            i4 = -i4;
        }
        return new Rect2i(i, i2, i3, i4);
    }

    public String toString() {
        Object[] objArr = new Object[4];
        Vector2i vector2i = this.origin;
        objArr[0] = Integer.valueOf(vector2i.f2487x);
        objArr[1] = Integer.valueOf(vector2i.f2488y);
        vector2i = this.size;
        objArr[2] = Integer.valueOf(vector2i.f2487x);
        objArr[3] = Integer.valueOf(vector2i.f2488y);
        return String.format("Rect2f: origin = (%d, %d), size = (%d, %d)", objArr);
    }

    public int width() {
        return this.size.f2487x;
    }
}
