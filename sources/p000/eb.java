package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: eb */
final class eb {
    /* renamed from: a */
    public static final Matrix f3482a = new Matrix();
    /* renamed from: b */
    public Paint f3483b;
    /* renamed from: c */
    public Paint f3484c;
    /* renamed from: d */
    public final dz f3485d;
    /* renamed from: e */
    public float f3486e;
    /* renamed from: f */
    public float f3487f;
    /* renamed from: g */
    public float f3488g;
    /* renamed from: h */
    public float f3489h;
    /* renamed from: i */
    public String f3490i;
    /* renamed from: j */
    public final ih f3491j;
    /* renamed from: k */
    private final Path f3492k;
    /* renamed from: l */
    private final Path f3493l;
    /* renamed from: m */
    private final Matrix f3494m;
    /* renamed from: n */
    private PathMeasure f3495n;
    /* renamed from: o */
    private int f3496o;
    /* renamed from: p */
    private int f3497p;

    public eb() {
        this.f3494m = new Matrix();
        this.f3486e = 0.0f;
        this.f3487f = 0.0f;
        this.f3488g = 0.0f;
        this.f3489h = 0.0f;
        this.f3497p = Illuminant.kOther;
        this.f3490i = null;
        this.f3491j = new ih();
        this.f3485d = new dz();
        this.f3492k = new Path();
        this.f3493l = new Path();
    }

    public eb(eb ebVar) {
        this.f3494m = new Matrix();
        this.f3486e = 0.0f;
        this.f3487f = 0.0f;
        this.f3488g = 0.0f;
        this.f3489h = 0.0f;
        this.f3497p = Illuminant.kOther;
        this.f3490i = null;
        this.f3491j = new ih();
        this.f3485d = new dz(ebVar.f3485d, this.f3491j);
        this.f3492k = new Path(ebVar.f3492k);
        this.f3493l = new Path(ebVar.f3493l);
        this.f3486e = ebVar.f3486e;
        this.f3487f = ebVar.f3487f;
        this.f3488g = ebVar.f3488g;
        this.f3489h = ebVar.f3489h;
        this.f3496o = ebVar.f3496o;
        this.f3497p = ebVar.f3497p;
        this.f3490i = ebVar.f3490i;
        String str = ebVar.f3490i;
        if (str != null) {
            this.f3491j.put(str, this);
        }
    }

    /* renamed from: a */
    final void m1743a(dz dzVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        dzVar.f3368a.set(matrix);
        dzVar.f3368a.preConcat(dzVar.f3377j);
        canvas.save();
        for (int i3 = 0; i3 < dzVar.f3369b.size(); i3++) {
            Object obj = dzVar.f3369b.get(i3);
            if (obj instanceof dz) {
                m1743a((dz) obj, dzVar.f3368a, canvas, i, i2, colorFilter);
            } else if (obj instanceof ea) {
                ea eaVar = (ea) obj;
                float f = ((float) i) / this.f3488g;
                float f2 = ((float) i2) / this.f3489h;
                float min = Math.min(f, f2);
                Matrix matrix2 = dzVar.f3368a;
                this.f3494m.set(matrix2);
                this.f3494m.postScale(f, f2);
                float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                double hypot = Math.hypot((double) fArr[0], (double) fArr[1]);
                double hypot2 = Math.hypot((double) fArr[2], (double) fArr[3]);
                f = (fArr[3] * fArr[0]) - (fArr[1] * fArr[2]);
                f2 = Math.max((float) hypot, (float) hypot2);
                if (f2 > 0.0f) {
                    f2 = Math.abs(f) / f2;
                } else {
                    f2 = 0.0f;
                }
                if (f2 != 0.0f) {
                    Path path = this.f3492k;
                    path.reset();
                    qt[] qtVarArr = eaVar.f3433n;
                    if (qtVarArr != null) {
                        qt.m5741a(qtVarArr, path);
                    }
                    path = this.f3492k;
                    this.f3493l.reset();
                    if (eaVar.mo1200a()) {
                        this.f3493l.addPath(path, this.f3494m);
                        canvas.clipPath(this.f3493l);
                    } else {
                        dy dyVar = (dy) eaVar;
                        float f3 = dyVar.f14719h;
                        if (!(f3 == 0.0f && dyVar.f14720i == 1.0f)) {
                            float f4 = dyVar.f14721j;
                            f3 = (f3 + f4) % 1.0f;
                            f4 = (f4 + dyVar.f14720i) % 1.0f;
                            if (this.f3495n == null) {
                                this.f3495n = new PathMeasure();
                            }
                            this.f3495n.setPath(this.f3492k, false);
                            float length = this.f3495n.getLength();
                            f3 *= length;
                            f4 *= length;
                            path.reset();
                            if (f3 > f4) {
                                this.f3495n.getSegment(f3, length, path, true);
                                this.f3495n.getSegment(0.0f, f4, path, true);
                            } else {
                                this.f3495n.getSegment(f3, f4, path, true);
                            }
                            path.rLineTo(0.0f, 0.0f);
                        }
                        this.f3493l.addPath(path, this.f3494m);
                        if (dyVar.f14715d != 0) {
                            FillType fillType;
                            if (this.f3484c == null) {
                                this.f3484c = new Paint();
                                this.f3484c.setStyle(Style.FILL);
                                this.f3484c.setAntiAlias(true);
                            }
                            Paint paint = this.f3484c;
                            paint.setColor(dw.m9482a(dyVar.f14715d, dyVar.f14718g));
                            paint.setColorFilter(colorFilter);
                            Path path2 = this.f3493l;
                            if (dyVar.f14717f != 0) {
                                fillType = FillType.EVEN_ODD;
                            } else {
                                fillType = FillType.WINDING;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(this.f3493l, paint);
                        }
                        if (dyVar.f14713b != 0) {
                            if (this.f3483b == null) {
                                this.f3483b = new Paint();
                                this.f3483b.setStyle(Style.STROKE);
                                this.f3483b.setAntiAlias(true);
                            }
                            Paint paint2 = this.f3483b;
                            Join join = dyVar.f14723l;
                            if (join != null) {
                                paint2.setStrokeJoin(join);
                            }
                            Cap cap = dyVar.f14722k;
                            if (cap != null) {
                                paint2.setStrokeCap(cap);
                            }
                            paint2.setStrokeMiter(dyVar.f14724m);
                            paint2.setColor(dw.m9482a(dyVar.f14713b, dyVar.f14716e));
                            paint2.setColorFilter(colorFilter);
                            paint2.setStrokeWidth(dyVar.f14714c * (f2 * min));
                            canvas.drawPath(this.f3493l, paint2);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public final float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public final int getRootAlpha() {
        return this.f3497p;
    }

    public final void setAlpha(float f) {
        setRootAlpha((int) (255.0f * f));
    }

    public final void setRootAlpha(int i) {
        this.f3497p = i;
    }
}
