package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.Face;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.faceboxes.FaceView;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: czp */
public final class czp implements iqt {
    /* renamed from: a */
    private final AccessibilityManager f12948a;
    /* renamed from: b */
    private final brp f12949b;
    /* renamed from: c */
    private final bqq f12950c;
    /* renamed from: d */
    private final ffc f12951d;
    /* renamed from: e */
    private final cwc f12952e;
    /* renamed from: f */
    private final gci f12953f;
    /* renamed from: g */
    private final boolean f12954g = true;
    /* renamed from: h */
    private final boolean f12955h = false;

    static {
        bsb bsb = new bsb("camera.faceannouncer");
    }

    public czp(AccessibilityManager accessibilityManager, bqq bqq, ffc ffc, gci gci, cwc cwc, brp brp, boolean z, int i) {
        this.f12948a = (AccessibilityManager) ktm.m13962a((Object) accessibilityManager);
        this.f12950c = (bqq) ktm.m13962a((Object) bqq);
        this.f12951d = (ffc) ktm.m13962a((Object) ffc);
        this.f12953f = (gci) ktm.m13962a((Object) gci);
        this.f12952e = (cwc) ktm.m13962a((Object) cwc);
        this.f12949b = (brp) ktm.m13962a((Object) brp);
    }

    /* renamed from: a */
    public final void m8906a(boolean z) {
        FaceView faceView = this.f12949b.f1487a;
        faceView.f2290b = z;
        faceView.m1233c();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        fvj fvj = (fvj) obj;
        if (this.f12954g && this.f12948a.isEnabled()) {
            Object obj2;
            Object obj3;
            int i;
            Object obj4;
            Object obj5;
            Face[] faceArr = fvj.f4732a;
            if (faceArr == null) {
                obj2 = new gic[0];
            } else {
                obj3 = new gic[faceArr.length];
                for (i = 0; i < faceArr.length; i++) {
                    obj3[i] = new gic(faceArr[i].getBounds(), faceArr[i].getScore());
                }
                obj2 = obj3;
            }
            bqq bqq = this.f12950c;
            obj3 = (Rect) this.f12951d.mo1913a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            int o = this.f12951d.mo1933o();
            int i2 = this.f12953f.mo1441a().f7326e;
            int intValue = ((Integer) this.f12951d.mo1913a(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue();
            iut iut = this.f12952e.f2816b;
            iut iut2 = iut.FRONT;
            boolean z = o == 0 ? true : o == 90 ? true : o == MediaDecoder.ROTATE_180 ? true : o == MediaDecoder.ROTATE_90_LEFT;
            jri.m13145a(z, "Invalid sensor orientation: %d", o);
            if (i2 == 0) {
                z = true;
            } else if (i2 == 90) {
                z = true;
            } else if (i2 == MediaDecoder.ROTATE_180) {
                z = true;
            } else if (i2 != MediaDecoder.ROTATE_90_LEFT) {
                z = false;
            } else {
                z = true;
            }
            jri.m13145a(z, "Invalid device orientation: %d", i2);
            gic[] gicArr = (gic[]) jri.m13152b(obj2);
            long a = bqq.f1456d.mo1736a();
            long j = bqq.f1458f;
            if (j == -1) {
                obj4 = 1;
            } else if (a - j <= 3000) {
                obj4 = null;
            } else {
                obj4 = 1;
            }
            int length = gicArr.length;
            if (length > 0) {
                obj5 = 1;
            } else if (length == bqq.f1459g) {
                obj5 = null;
            } else {
                obj5 = 1;
            }
            if (obj4 == null) {
                obj5 = null;
            } else if (obj5 != null) {
                bqq.f1459g = length;
                bqq.f1458f = a;
                obj5 = 1;
            } else {
                obj5 = null;
            }
            if (obj5 != null) {
                gicArr = (gic[]) jri.m13152b(obj2);
                Rect rect = (Rect) jri.m13152b(obj3);
                int length2 = gicArr.length;
                if (length2 == 1) {
                    String string;
                    View view = bqq.f1455c;
                    Context context = bqq.f1454b;
                    Object[] objArr = new Object[3];
                    objArr[0] = Integer.valueOf(length2);
                    gic gic = gicArr[0];
                    int centerX = gic.f5202a.centerX();
                    length2 = gic.f5202a.centerY();
                    length = rect.width();
                    int height = rect.height();
                    int i3 = (i2 + o) % 360;
                    if (iut == iut2 && o % MediaDecoder.ROTATE_180 == 0) {
                        centerX = length - centerX;
                    } else if (iut == iut2 && o % MediaDecoder.ROTATE_180 != 0) {
                        length2 = height - length2;
                    }
                    String str = bqq.f1453a;
                    StringBuilder stringBuilder = new StringBuilder(31);
                    stringBuilder.append("Sensor orientation: ");
                    stringBuilder.append(o);
                    bli.m863a(str, stringBuilder.toString());
                    str = bqq.f1453a;
                    stringBuilder = new StringBuilder(31);
                    stringBuilder.append("Device orientation: ");
                    stringBuilder.append(i2);
                    bli.m863a(str, stringBuilder.toString());
                    switch (i3) {
                        case 0:
                            centerX = bqq.m942a(centerX, length, 3);
                            length2 = bqq.m942a(length2, height, 3);
                            break;
                        case 90:
                            o = bqq.m942a(height - length2, height, 3);
                            length2 = bqq.m942a(centerX, length, 3);
                            centerX = o;
                            break;
                        case MediaDecoder.ROTATE_180 /*180*/:
                            centerX = bqq.m942a(length - centerX, length, 3);
                            length2 = bqq.m942a(height - length2, height, 3);
                            break;
                        case MediaDecoder.ROTATE_90_LEFT /*270*/:
                            o = bqq.m942a(length2, height, 3);
                            length2 = bqq.m942a(length - centerX, length, 3);
                            centerX = o;
                            break;
                        default:
                            StringBuilder stringBuilder2 = new StringBuilder(90);
                            stringBuilder2.append("Invalid sensor rotation. Display orientation: ");
                            stringBuilder2.append(i2);
                            stringBuilder2.append(", Sensor orientation: ");
                            stringBuilder2.append(o);
                            throw new IllegalStateException(stringBuilder2.toString());
                    }
                    objArr[1] = bqq.f1454b.getString(bqq.f1457e[length2][centerX]);
                    float width = (float) gicArr[0].f5202a.width();
                    float width2 = (float) rect.width();
                    if (width2 == 0.0f || width / width2 < 0.05f) {
                        string = bqq.f1454b.getString(R.string.face_size_tiny);
                    } else {
                        i = (bqq.m942a((int) width, (int) width2, 10) * 10) + 10;
                        String str2;
                        if (i < 50) {
                            obj3 = "";
                            if (i >= 30 && iut == iut2) {
                                string = String.valueOf(bqq.f1454b.getString(R.string.face_in_selfie_range));
                                str2 = ". ";
                                obj3 = string.length() == 0 ? new String(str2) : str2.concat(string);
                            }
                        } else {
                            string = String.valueOf(bqq.f1454b.getString(R.string.face_very_close));
                            str2 = ". ";
                            obj3 = string.length() == 0 ? new String(str2) : str2.concat(string);
                        }
                        String valueOf = String.valueOf(bqq.f1454b.getString(R.string.face_size_percent_screen, new Object[]{Integer.valueOf(i)}));
                        string = String.valueOf(obj3);
                        string = string.length() == 0 ? new String(valueOf) : valueOf.concat(string);
                    }
                    objArr[2] = string;
                    view.announceForAccessibility(context.getString(R.string.detailed_face_announcement, objArr));
                } else if (length2 == intValue) {
                    bqq.f1455c.announceForAccessibility(bqq.f1454b.getString(R.string.max_face_announcement, new Object[]{Integer.valueOf(length2)}));
                } else {
                    bqq.f1455c.announceForAccessibility(bqq.f1454b.getResources().getQuantityString(R.plurals.number_of_faces_announcement, length2, new Object[]{Integer.valueOf(length2)}));
                }
            }
        }
        if (this.f12955h) {
            brp brp = this.f12949b;
            Face[] faceArr2 = fvj.f4732a;
            if (faceArr2 != null) {
                FaceView faceView = brp.f1487a;
                RectF rectF = new RectF(fvj.f4733b);
                if (!rectF.equals(faceView.f2293e) || faceView.f2291c == null) {
                    faceView.f2293e = rectF;
                    faceView.m1233c();
                }
                FaceView faceView2 = brp.f1487a;
                faceView2.f2292d = faceArr2;
                faceView2.m1232b();
            }
        }
    }

    /* renamed from: a */
    public final void m8904a(iqp iqp) {
        brp brp = this.f12949b;
        int i = iqp.f7329a;
        int i2 = iqp.f7330b;
        FaceView faceView = brp.f1487a;
        if (faceView.f2294f != i || faceView.f2295g != i2 || faceView.f2291c == null) {
            faceView.f2294f = i;
            faceView.f2295g = i2;
            faceView.m1233c();
        }
    }
}
