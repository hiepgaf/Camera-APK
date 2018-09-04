package com.google.googlex.gcam.androidutils.vecmath;

import android.graphics.Rect;

/* compiled from: PG */
public class Rect2f {
    public final Vector2f origin;
    public final Vector2f size;

    public Rect2f() {
        this.origin = new Vector2f();
        this.size = new Vector2f();
    }

    public Rect2f(float f, float f2) {
        this.origin = new Vector2f();
        this.size = new Vector2f(f, f2);
    }

    public Rect2f(float f, float f2, float f3, float f4) {
        this.origin = new Vector2f(f, f2);
        this.size = new Vector2f(f3, f4);
    }

    public Rect2f(Rect2f rect2f) {
        this.origin = new Vector2f(rect2f.origin());
        this.size = new Vector2f(rect2f.size());
    }

    public Rect2f(Vector2f vector2f, Vector2f vector2f2) {
        this.origin = new Vector2f(vector2f);
        this.size = new Vector2f(vector2f2);
    }

    public Vector4f asOriginAndSize() {
        Vector2f vector2f = this.origin;
        float f = vector2f.f2485x;
        float f2 = vector2f.f2486y;
        Vector2f vector2f2 = this.size;
        return new Vector4f(f, f2, vector2f2.f2485x, vector2f2.f2486y);
    }

    public static Rect2f flipUD(Rect2f rect2f, float f) {
        Rect2f standardized = rect2f.standardized();
        standardized.origin().f2486y = f - standardized.max().f2486y;
        return standardized.standardized();
    }

    public static Rect2f fromPoints(Vector2f vector2f, Vector2f vector2f2) {
        float f = vector2f.f2485x;
        float f2 = vector2f.f2486y;
        return new Rect2f(f, f2, vector2f2.f2485x - f, vector2f2.f2486y - f2).standardized();
    }

    public static Rect2f fromRect(Rect rect) {
        return new Rect2f((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
    }

    public float height() {
        return this.size.f2486y;
    }

    public Vector2f max() {
        Vector2f vector2f = this.origin;
        return VecmathFunctions.max(vector2f, VecmathFunctions.add(vector2f, this.size));
    }

    public Vector2f min() {
        Vector2f vector2f = this.origin;
        return VecmathFunctions.min(vector2f, VecmathFunctions.add(vector2f, this.size));
    }

    public Vector2f origin() {
        return this.origin;
    }

    public Vector2f size() {
        return this.size;
    }

    public Rect2f standardized() {
        float f;
        float f2;
        Vector2f vector2f = this.size;
        float f3 = vector2f.f2485x;
        if (f3 > 0.0f) {
            f = this.origin.f2485x;
        } else {
            f = this.origin.f2485x + f3;
            f3 = -f3;
        }
        float f4 = vector2f.f2486y;
        if (f4 > 0.0f) {
            f2 = this.origin.f2486y;
        } else {
            f2 = this.origin.f2486y + f4;
            f4 = -f4;
        }
        return new Rect2f(f, f2, f3, f4);
    }

    public String toString() {
        Object[] objArr = new Object[4];
        Vector2f vector2f = this.origin;
        objArr[0] = Float.valueOf(vector2f.f2485x);
        objArr[1] = Float.valueOf(vector2f.f2486y);
        vector2f = this.size;
        objArr[2] = Float.valueOf(vector2f.f2485x);
        objArr[3] = Float.valueOf(vector2f.f2486y);
        return String.format("Rect2f: origin = (%f, %f), size = (%f, %f)", objArr);
    }

    public float width() {
        return this.size.f2485x;
    }
}
