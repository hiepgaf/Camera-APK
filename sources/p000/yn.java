package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera.Area;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Range;
import android.util.Size;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: yn */
public final class yn extends abo {
    /* renamed from: a */
    public static final aby f19738a = new aby("AndCam2Set");
    /* renamed from: A */
    private final Rect f19739A;
    /* renamed from: b */
    public final aca f19740b;
    /* renamed from: c */
    public final Rect f19741c;
    /* renamed from: z */
    private final Builder f19742z;

    public yn(CameraDevice cameraDevice, Rect rect, abw abw, abw abw2) {
        if (cameraDevice == null) {
            throw new NullPointerException("camera must not be null");
        } else if (rect == null) {
            throw new NullPointerException("activeArray must not be null");
        } else {
            abb abb;
            boolean z;
            this.f19742z = cameraDevice.createCaptureRequest(1);
            this.f19740b = new aca();
            this.f19739A = rect;
            this.f19741c = new Rect(0, 0, rect.width(), rect.height());
            this.f = false;
            Range range = (Range) this.f19742z.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
            if (range != null) {
                m66a(((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue());
            }
            m69b(abw);
            m67a(abw2);
            this.l = ((Byte) m14573b(CaptureRequest.JPEG_QUALITY, Byte.valueOf((byte) 0))).byteValue();
            this.n = 1.0f;
            Key key = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            Integer valueOf = Integer.valueOf(0);
            this.o = ((Integer) m14573b(key, valueOf)).intValue();
            Integer num = (Integer) this.f19742z.get(CaptureRequest.CONTROL_AE_MODE);
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        abb = abb.OFF;
                        break;
                    case 2:
                        abb = abb.AUTO;
                        break;
                    case 3:
                        if (((Integer) this.f19742z.get(CaptureRequest.FLASH_MODE)).intValue() != 2) {
                            abb = abb.ON;
                            break;
                        } else {
                            abb = abb.TORCH;
                            break;
                        }
                    case 4:
                        abb = abb.RED_EYE;
                        break;
                    default:
                        abb = null;
                        break;
                }
            }
            abb = null;
            this.p = abb;
            num = (Integer) this.f19742z.get(CaptureRequest.CONTROL_AF_MODE);
            if (num != null) {
                this.q = ym.m14569a(num.intValue());
            }
            num = (Integer) this.f19742z.get(CaptureRequest.CONTROL_SCENE_MODE);
            if (num != null) {
                this.r = ym.m14570b(num.intValue());
            }
            num = (Integer) this.f19742z.get(CaptureRequest.CONTROL_AWB_MODE);
            if (num != null) {
                this.s = ym.m14571c(num.intValue());
            }
            if (((Integer) m14573b(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, valueOf)).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.t = z;
            key = CaptureRequest.CONTROL_AE_LOCK;
            Boolean valueOf2 = Boolean.valueOf(false);
            this.u = ((Boolean) m14573b(key, valueOf2)).booleanValue();
            this.v = ((Boolean) m14573b(CaptureRequest.CONTROL_AWB_LOCK, valueOf2)).booleanValue();
            Size size = (Size) this.f19742z.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
            if (size != null) {
                this.y = new abw(size.getWidth(), size.getHeight());
            }
        }
    }

    private yn(yn ynVar) {
        super(ynVar);
        this.f19742z = ynVar.f19742z;
        this.f19740b = new aca(ynVar.f19740b);
        this.f19739A = ynVar.f19739A;
        this.f19741c = new Rect(ynVar.f19741c);
    }

    /* renamed from: a */
    public final abo mo2576a() {
        return new yn(this);
    }

    /* renamed from: a */
    final MeteringRectangle[] m14577a(List list) {
        if (list.size() <= 0) {
            return null;
        }
        MeteringRectangle[] meteringRectangleArr = new MeteringRectangle[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Area area = (Area) list.get(i);
            Rect rect = area.rect;
            int i2 = rect.left;
            int i3 = rect.top;
            int i4 = rect.right;
            int i5 = rect.bottom;
            Rect rect2 = this.f19741c;
            i2 = yn.m14572a(((double) rect2.width()) * (((double) (i2 + 1000)) / 2000.0d), this.f19741c.width() - 1) + rect2.left;
            rect2 = this.f19741c;
            i3 = yn.m14572a(((double) rect2.height()) * (((double) (i3 + 1000)) / 2000.0d), this.f19741c.height() - 1) + rect2.top;
            rect2 = this.f19741c;
            int i6 = rect2.left;
            i4 = yn.m14572a(((double) rect2.width()) * (((double) (i4 + 1000)) / 2000.0d), this.f19741c.width() - 1);
            rect2 = this.f19741c;
            meteringRectangleArr[i] = new MeteringRectangle(i2, i3, (i4 + i6) - i2, (yn.m14572a(((double) rect2.height()) * (((double) (i5 + 1000)) / 2000.0d), this.f19741c.height() - 1) + rect2.top) - i3, area.weight);
        }
        return meteringRectangleArr;
    }

    /* renamed from: b */
    private final Object m14573b(Key key, Object obj) {
        Object obj2 = this.f19742z.get(key);
        if (obj2 != null) {
            return obj2;
        }
        this.f19742z.set(key, obj);
        return obj;
    }

    /* renamed from: a */
    public final void mo2577a(float f) {
        float height;
        float f2;
        super.mo2577a(f);
        this.f19741c.set(0, 0, yn.m14572a((double) (((float) this.f19739A.width()) / this.n), this.f19739A.width()), yn.m14572a((double) (((float) this.f19739A.height()) / this.n), this.f19739A.height()));
        this.f19741c.offsetTo((this.f19739A.width() - this.f19741c.width()) / 2, (this.f19739A.height() - this.f19741c.height()) / 2);
        Rect rect = this.f19741c;
        abw abw = this.j;
        int width = rect.width();
        int height2 = rect.height();
        Point point = abw.f178a;
        float f3 = ((float) point.x) / ((float) point.y);
        if (f3 < ((float) width) / ((float) height2)) {
            height = (float) rect.height();
            f2 = height * f3;
        } else {
            f2 = (float) rect.width();
            height = f2 / f3;
        }
        Matrix matrix = new Matrix();
        RectF rectF = new RectF(0.0f, 0.0f, f2, height);
        matrix.setTranslate(rect.exactCenterX(), rect.exactCenterY());
        matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
        matrix.mapRect(rectF);
        rectF.roundOut(new Rect());
    }

    /* renamed from: a */
    private static int m14572a(double d, int i) {
        return (int) Math.min(Math.max(d, 0.0d), (double) i);
    }

    /* renamed from: a */
    final void m14576a(Key key, Object obj) {
        boolean z;
        aca aca = this.f19740b;
        if (key == CaptureRequest.CONTROL_AE_REGIONS) {
            if (this.d.size() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (key == CaptureRequest.CONTROL_AF_REGIONS) {
            if (this.e.size() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (key == CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE) {
            Range range = (Range) this.f19742z.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
            if (this.g == 0 && this.h == 0) {
                z = true;
            } else if (range == null) {
                z = false;
            } else if (this.g != ((Integer) range.getLower()).intValue()) {
                z = false;
            } else if (this.h == ((Integer) range.getUpper()).intValue()) {
                z = true;
            } else {
                z = false;
            }
        } else if (key == CaptureRequest.JPEG_QUALITY) {
            z = Objects.equals(Byte.valueOf(this.l), this.f19742z.get(CaptureRequest.JPEG_QUALITY));
        } else if (key == CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION) {
            z = Objects.equals(Integer.valueOf(this.o), this.f19742z.get(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        } else if (key == CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE) {
            Integer num = (Integer) this.f19742z.get(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
            if (num != null && this.t && num.intValue() == 1) {
                z = true;
            } else if (this.t) {
                z = false;
            } else if (num.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (key == CaptureRequest.CONTROL_AE_LOCK) {
            z = Objects.equals(Boolean.valueOf(this.u), this.f19742z.get(CaptureRequest.CONTROL_AE_LOCK));
        } else if (key == CaptureRequest.CONTROL_AWB_LOCK) {
            z = Objects.equals(Boolean.valueOf(this.v), this.f19742z.get(CaptureRequest.CONTROL_AWB_LOCK));
        } else if (key != CaptureRequest.JPEG_THUMBNAIL_SIZE) {
            abx.m91e(f19738a, "Settings implementation checked default of unhandled option key");
            z = true;
        } else if (this.y != null) {
            Size size = (Size) this.f19742z.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
            if (this.y.f178a.x == 0 && this.y.f178a.y == 0) {
                z = true;
            } else if (size == null) {
                z = false;
            } else if (this.y.f178a.x != size.getWidth()) {
                z = false;
            } else if (this.y.f178a.y == size.getHeight()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            obj = null;
        }
        aca.m96b(key, obj);
    }
}
