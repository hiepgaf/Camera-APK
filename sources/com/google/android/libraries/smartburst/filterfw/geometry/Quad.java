package com.google.android.libraries.smartburst.filterfw.geometry;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;

@SuppressLint({"FloatMath"})
/* compiled from: PG */
public class Quad {
    public final PointF mBottomLeft;
    public final PointF mBottomRight;
    public final PointF mTopLeft;
    public final PointF mTopRight;

    private Quad(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.mTopLeft = new PointF(f, f2);
        this.mTopRight = new PointF(f3, f4);
        this.mBottomLeft = new PointF(f5, f6);
        this.mBottomRight = new PointF(f7, f8);
    }

    private Quad(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.mTopLeft = pointF;
        this.mTopRight = pointF2;
        this.mBottomLeft = pointF3;
        this.mBottomRight = pointF4;
    }

    private Quad(float[] fArr) {
        this.mTopLeft = new PointF(fArr[0], fArr[1]);
        this.mTopRight = new PointF(fArr[2], fArr[3]);
        this.mBottomLeft = new PointF(fArr[4], fArr[5]);
        this.mBottomRight = new PointF(fArr[6], fArr[7]);
    }

    public float[] asCoords() {
        r0 = new float[8];
        PointF pointF = this.mTopLeft;
        r0[0] = pointF.x;
        r0[1] = pointF.y;
        pointF = this.mTopRight;
        r0[2] = pointF.x;
        r0[3] = pointF.y;
        pointF = this.mBottomLeft;
        r0[4] = pointF.x;
        r0[5] = pointF.y;
        pointF = this.mBottomRight;
        r0[6] = pointF.x;
        r0[7] = pointF.y;
        return r0;
    }

    public PointF bottomLeft() {
        return this.mBottomLeft;
    }

    public PointF bottomRight() {
        return this.mBottomRight;
    }

    public PointF center() {
        PointF pointF = this.mTopLeft;
        float f = pointF.x;
        PointF pointF2 = this.mBottomRight;
        return new PointF((f + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
    }

    public static Quad fromLineAndHeight(PointF pointF, PointF pointF2, float f) {
        PointF pointF3 = new PointF(pointF2.x - pointF.x, pointF2.y - pointF.y);
        float length = pointF3.length();
        PointF pointF4 = new PointF((pointF3.y / length) * f, (pointF3.x / length) * f);
        return new Quad(pointF, pointF2, new PointF(pointF.x - pointF4.x, pointF.y + pointF4.y), new PointF(pointF2.x - pointF4.x, pointF4.y + pointF2.y));
    }

    public static Quad fromRect(float f, float f2, float f3, float f4) {
        float f5 = f + f3;
        float f6 = f2 + f4;
        return new Quad(new PointF(f, f2), new PointF(f5, f2), new PointF(f, f6), new PointF(f5, f6));
    }

    public static Quad fromRect(RectF rectF) {
        return new Quad(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.top), new PointF(rectF.left, rectF.bottom), new PointF(rectF.right, rectF.bottom));
    }

    public static Quad fromRotatedRect(RectF rectF, float f) {
        return fromRect(rectF).rotated(f);
    }

    public static Quad fromTransformedRect(RectF rectF, Matrix matrix) {
        return fromRect(rectF).transformed(matrix);
    }

    public RectF getEnclosingRectF() {
        return new RectF(Math.min(Math.min(this.mTopLeft.x, this.mTopRight.x), Math.min(this.mBottomLeft.x, this.mBottomRight.x)), Math.min(Math.min(this.mTopLeft.y, this.mTopRight.y), Math.min(this.mBottomLeft.y, this.mBottomRight.y)), Math.max(Math.max(this.mTopLeft.x, this.mTopRight.x), Math.max(this.mBottomLeft.x, this.mBottomRight.x)), Math.max(Math.max(this.mTopLeft.y, this.mTopRight.y), Math.max(this.mBottomLeft.y, this.mBottomRight.y)));
    }

    public static Matrix getTransform(Quad quad, Quad quad2) {
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(quad.asCoords(), 0, quad2.asCoords(), 0, 3);
        return matrix;
    }

    public Quad grow(float f) {
        PointF center = center();
        PointF pointF = this.mTopLeft;
        float f2 = pointF.x;
        float f3 = center.x;
        float f4 = center.x;
        float f5 = pointF.y;
        float f6 = center.y;
        float f7 = center.y;
        pointF = this.mTopRight;
        float f8 = pointF.x;
        float f9 = center.x;
        float f10 = center.x;
        float f11 = pointF.y;
        float f12 = center.y;
        float f13 = center.y;
        pointF = this.mBottomLeft;
        float f14 = pointF.x;
        float f15 = center.x;
        float f16 = center.x;
        float f17 = pointF.y;
        float f18 = center.y;
        float f19 = center.y;
        PointF pointF2 = this.mBottomRight;
        return new Quad(((f2 - f3) * f) + f4, ((f5 - f6) * f) + f7, ((f8 - f9) * f) + f10, ((f11 - f12) * f) + f13, ((f14 - f15) * f) + f16, ((f17 - f18) * f) + f19, ((pointF2.x - center.x) * f) + center.x, center.y + ((pointF2.y - center.y) * f));
    }

    private static PointF rotatePoint(PointF pointF, PointF pointF2, float f, float f2) {
        float f3 = pointF.x;
        float f4 = pointF2.x;
        float f5 = pointF.y;
        float f6 = pointF2.y;
        return new PointF((((f3 - f4) * f) - ((f5 - f6) * f2)) + pointF2.x, (((pointF.x - pointF2.x) * f2) + ((pointF.y - pointF2.y) * f)) + pointF2.y);
    }

    public Quad rotated(float f) {
        PointF center = center();
        double d = (double) f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        return new Quad(rotatePoint(topLeft(), center, cos, sin), rotatePoint(topRight(), center, cos, sin), rotatePoint(bottomLeft(), center, cos, sin), rotatePoint(bottomRight(), center, cos, sin));
    }

    public Quad scale(float f) {
        PointF pointF = this.mTopLeft;
        float f2 = pointF.x;
        float f3 = pointF.y;
        pointF = this.mTopRight;
        float f4 = pointF.x;
        float f5 = pointF.y;
        pointF = this.mBottomLeft;
        float f6 = pointF.x;
        float f7 = pointF.y;
        PointF pointF2 = this.mBottomRight;
        return new Quad(f2 * f, f3 * f, f4 * f, f5 * f, f6 * f, f7 * f, pointF2.x * f, pointF2.y * f);
    }

    public Quad scale2(float f, float f2) {
        PointF pointF = this.mTopLeft;
        float f3 = pointF.x;
        float f4 = pointF.y;
        pointF = this.mTopRight;
        float f5 = pointF.x;
        float f6 = pointF.y;
        pointF = this.mBottomLeft;
        float f7 = pointF.x;
        float f8 = pointF.y;
        PointF pointF2 = this.mBottomRight;
        return new Quad(f3 * f, f4 * f2, f5 * f, f6 * f2, f7 * f, f8 * f2, pointF2.x * f, pointF2.y * f2);
    }

    public String toString() {
        PointF pointF = this.mTopLeft;
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = this.mTopRight;
        float f3 = pointF2.x;
        float f4 = pointF2.y;
        PointF pointF3 = this.mBottomLeft;
        float f5 = pointF3.x;
        float f6 = pointF3.y;
        PointF pointF4 = this.mBottomRight;
        float f7 = pointF4.x;
        float f8 = pointF4.y;
        StringBuilder stringBuilder = new StringBuilder(ScriptIntrinsicBLAS.RsBlas_zhemm);
        stringBuilder.append("Quad(");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(", ");
        stringBuilder.append(f3);
        stringBuilder.append(", ");
        stringBuilder.append(f4);
        stringBuilder.append(", ");
        stringBuilder.append(f5);
        stringBuilder.append(", ");
        stringBuilder.append(f6);
        stringBuilder.append(", ");
        stringBuilder.append(f7);
        stringBuilder.append(", ");
        stringBuilder.append(f8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PointF topLeft() {
        return this.mTopLeft;
    }

    public PointF topRight() {
        return this.mTopRight;
    }

    public Quad transformed(Matrix matrix) {
        float[] asCoords = asCoords();
        matrix.mapPoints(asCoords);
        return new Quad(asCoords);
    }

    public static Quad unitQuad() {
        return new Quad(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public PointF xEdge() {
        PointF pointF = this.mTopRight;
        float f = pointF.x;
        PointF pointF2 = this.mTopLeft;
        return new PointF(f - pointF2.x, pointF.y - pointF2.y);
    }

    public PointF yEdge() {
        PointF pointF = this.mBottomLeft;
        float f = pointF.x;
        PointF pointF2 = this.mTopLeft;
        return new PointF(f - pointF2.x, pointF.y - pointF2.y);
    }
}
