package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gid */
public final class gid implements iqo, Comparable {
    /* renamed from: a */
    public final long f16923a;
    /* renamed from: b */
    public final long f16924b;
    /* renamed from: c */
    public final long f16925c;
    /* renamed from: d */
    public final int f16926d;
    /* renamed from: e */
    public final float f16927e;
    /* renamed from: f */
    public final float f16928f;
    /* renamed from: g */
    public final int f16929g;
    /* renamed from: h */
    public final long f16930h;
    /* renamed from: i */
    public final Rect f16931i;
    /* renamed from: j */
    public final float f16932j;
    /* renamed from: k */
    private final iwp f16933k;
    /* renamed from: l */
    private final int f16934l;
    /* renamed from: m */
    private final int f16935m;
    /* renamed from: n */
    private final int f16936n;
    /* renamed from: o */
    private final gic[] f16937o;
    /* renamed from: p */
    private final int f16938p;
    /* renamed from: q */
    private final Rect f16939q;

    public gid(iwp iwp, int i, Rect rect) {
        int length;
        this.f16933k = iwp;
        Long l = (Long) this.f16933k.mo3143a(CaptureResult.SENSOR_TIMESTAMP);
        Long valueOf = Long.valueOf(0);
        if (l == null) {
            l = valueOf;
        }
        this.f16923a = l.longValue();
        l = (Long) this.f16933k.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l == null) {
            l = valueOf;
        }
        this.f16924b = l.longValue();
        l = (Long) this.f16933k.mo3143a(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW);
        if (l == null) {
            l = valueOf;
        }
        this.f16925c = l.longValue();
        Integer num = (Integer) this.f16933k.mo3143a(CaptureResult.SENSOR_SENSITIVITY);
        Integer valueOf2 = Integer.valueOf(0);
        if (num == null) {
            num = valueOf2;
        }
        this.f16926d = num.intValue();
        Float f = (Float) this.f16933k.mo3143a(CaptureResult.LENS_FOCAL_LENGTH);
        Float valueOf3 = Float.valueOf(0.0f);
        if (f == null) {
            f = valueOf3;
        }
        this.f16927e = f.floatValue();
        f = (Float) this.f16933k.mo3143a(CaptureResult.LENS_FOCUS_DISTANCE);
        if (f != null) {
            valueOf3 = f;
        }
        this.f16928f = valueOf3.floatValue();
        num = (Integer) this.f16933k.mo3143a(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            num = valueOf2;
        }
        this.f16929g = num.intValue();
        num = (Integer) this.f16933k.mo3143a(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            num = valueOf2;
        }
        this.f16934l = num.intValue();
        num = (Integer) this.f16933k.mo3143a(CaptureResult.CONTROL_AWB_STATE);
        if (num != null) {
            valueOf2 = num;
        }
        this.f16935m = valueOf2.intValue();
        num = (Integer) this.f16933k.mo3143a(CaptureResult.LENS_STATE);
        valueOf2 = Integer.valueOf(1);
        if (num == null) {
            num = valueOf2;
        }
        this.f16936n = num.intValue();
        this.f16931i = (Rect) this.f16933k.mo3143a(CaptureResult.SCALER_CROP_REGION);
        if (hsz.f6614h != null) {
            l = (Long) this.f16933k.mo3143a(hsz.f6614h);
            if (l != null) {
                valueOf = l;
            }
            this.f16930h = valueOf.longValue();
        } else {
            this.f16930h = -1;
        }
        if (hsz.f6605B != null) {
            f = (Float) this.f16933k.mo3143a(hsz.f6605B);
            Float valueOf4 = Float.valueOf(1.0f);
            if (f == null) {
                f = valueOf4;
            }
            this.f16932j = f.floatValue();
        } else {
            this.f16932j = 1.0f;
        }
        this.f16938p = i;
        Rect rect2 = new Rect();
        if (rect == null) {
            rect = rect2;
        }
        this.f16939q = rect;
        Face[] faceArr = (Face[]) this.f16933k.mo3143a(CaptureResult.STATISTICS_FACES);
        if (faceArr != null) {
            length = faceArr.length;
        } else {
            length = 0;
        }
        this.f16937o = new gic[length];
        for (int i2 = 0; i2 < length; i2++) {
            Rect rect3;
            Point point;
            gic[] gicArr = this.f16937o;
            gic a = gic.m2562a(faceArr[i2]);
            Rect rect4 = a.f5202a;
            Point point2 = a.f5204c;
            Point point3 = a.f5205d;
            Point point4 = a.f5206e;
            if (rect4 != null) {
                rect3 = new Rect(m11097a(rect4.left), m11099b(rect4.top), m11097a(rect4.right), m11099b(rect4.bottom));
            } else {
                rect3 = null;
            }
            int i3 = a.f5203b;
            if (point2 == null) {
                point2 = null;
            } else {
                point2 = m11098a(a.f5204c);
            }
            if (point3 == null) {
                point3 = null;
            } else {
                point3 = m11098a(a.f5205d);
            }
            if (point4 == null) {
                point = null;
            } else {
                point = m11098a(a.f5206e);
            }
            gicArr[i2] = new gic(rect3, i3, point2, point3, point);
        }
    }

    public final void close() {
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return (this.f16923a > ((gid) obj).f16923a ? 1 : (this.f16923a == ((gid) obj).f16923a ? 0 : -1));
    }

    /* renamed from: a */
    private final Point m11098a(Point point) {
        return new Point(m11097a(point.x), m11099b(point.y));
    }

    /* renamed from: a */
    private final int m11097a(int i) {
        return ((i - this.f16931i.left) * this.f16939q.width()) / this.f16931i.width();
    }

    /* renamed from: b */
    private final int m11099b(int i) {
        return ((i - this.f16931i.top) * this.f16939q.height()) / this.f16931i.height();
    }

    public final String toString() {
        long j = this.f16923a;
        long j2 = this.f16924b;
        long j3 = this.f16925c;
        float f = this.f16927e;
        int i = this.f16926d;
        float f2 = this.f16928f;
        int i2 = this.f16929g;
        int i3 = this.f16934l;
        int i4 = this.f16935m;
        int i5 = this.f16936n;
        String valueOf = String.valueOf(this.f16931i);
        long j4 = this.f16930h;
        float f3 = this.f16932j;
        String arrays = Arrays.toString(this.f16937o);
        int i6 = this.f16938p;
        String valueOf2 = String.valueOf(this.f16939q);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 447) + String.valueOf(arrays).length()) + String.valueOf(valueOf2).length());
        stringBuilder.append("CameraMetadata{, timestampNs=");
        stringBuilder.append(j);
        stringBuilder.append(", exposureTime=");
        stringBuilder.append(j2);
        stringBuilder.append(", rollingShutterTime=");
        stringBuilder.append(j3);
        stringBuilder.append(", focalLength=");
        stringBuilder.append(f);
        stringBuilder.append(", sensorSensitivity=");
        stringBuilder.append(i);
        stringBuilder.append(", focusDistance=");
        stringBuilder.append(f2);
        stringBuilder.append(", aFStatus=");
        stringBuilder.append(i2);
        stringBuilder.append(", aEStatus=");
        stringBuilder.append(i3);
        stringBuilder.append(", aWBStatus=");
        stringBuilder.append(i4);
        stringBuilder.append(", lensStatus=");
        stringBuilder.append(i5);
        stringBuilder.append(", cropRegion=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", mTimestampBootime=");
        stringBuilder.append(j4);
        stringBuilder.append(", subjectMotion=");
        stringBuilder.append(f3);
        stringBuilder.append(", faces=");
        stringBuilder.append(arrays);
        stringBuilder.append(", rotationDegrees=");
        stringBuilder.append(i6);
        stringBuilder.append(", activeArraySize=");
        stringBuilder.append(valueOf2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
