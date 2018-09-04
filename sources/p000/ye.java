package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import android.location.Location;
import android.media.ImageReader;
import android.os.Looper;
import android.os.Message;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ye */
final class ye extends abu {
    /* renamed from: a */
    public zy f19709a;
    /* renamed from: b */
    public int f19710b;
    /* renamed from: c */
    public String f19711c;
    /* renamed from: d */
    public CameraDevice f19712d;
    /* renamed from: e */
    public xt f19713e;
    /* renamed from: f */
    public aca f19714f;
    /* renamed from: g */
    public Rect f19715g;
    /* renamed from: h */
    public boolean f19716h;
    /* renamed from: i */
    public CameraCaptureSession f19717i;
    /* renamed from: j */
    public ImageReader f19718j;
    /* renamed from: k */
    public aat f19719k;
    /* renamed from: l */
    public zw f19720l;
    /* renamed from: m */
    public yl f19721m;
    /* renamed from: n */
    public zx f19722n;
    /* renamed from: o */
    public int f19723o = 0;
    /* renamed from: p */
    public yk f19724p = new yj(this);
    /* renamed from: q */
    public final /* synthetic */ xq f19725q;
    /* renamed from: s */
    private int f19726s = 0;
    /* renamed from: t */
    private abw f19727t;
    /* renamed from: u */
    private abw f19728u;
    /* renamed from: v */
    private SurfaceTexture f19729v;
    /* renamed from: w */
    private Surface f19730w;
    /* renamed from: x */
    private StateCallback f19731x = new yh(this);
    /* renamed from: y */
    private CameraCaptureSession.StateCallback f19732y = new yi(this);

    ye(xq xqVar, Looper looper) {
        this.f19725q = xqVar;
        super(looper);
    }

    /* renamed from: a */
    public final abo m14565a() {
        try {
            return new yn(this.f19712d, this.f19715g, this.f19727t, this.f19728u);
        } catch (CameraAccessException e) {
            abx.m87b(xq.f19682a, "Unable to query camera device to build settings representation");
            return null;
        }
    }

    /* renamed from: a */
    final void m14566a(int i) {
        if (this.f19725q.f19684c.m74a() != i) {
            this.f19725q.f19684c.m75a(i);
            if (i < 16) {
                this.f19723o = 0;
                this.f19724p.mo2574a();
            }
        }
    }

    /* renamed from: b */
    private final void m14564b() {
        try {
            this.f19717i.abortCaptures();
            this.f19717i = null;
        } catch (Throwable e) {
            abx.m85a(xq.f19682a, "Failed to close existing camera capture session", e);
        }
        m14566a(4);
    }

    public final void handleMessage(Message message) {
        zy zyVar;
        int i;
        String b;
        xq xqVar;
        int i2 = 0;
        Object obj = null;
        super.handleMessage(message);
        aby aby = xq.f19682a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handleMessage - action = '");
        stringBuilder.append(tz.m5876a(message.what));
        stringBuilder.append("'");
        abx.m90d(aby, stringBuilder.toString());
        int i3 = message.what;
        ImageReader imageReader;
        aca aca;
        CaptureCallback yfVar;
        aca aca2;
        aby aby2;
        StringBuilder stringBuilder2;
        switch (i3) {
            case 1:
            case 3:
                zyVar = (zy) message.obj;
                i = message.arg1;
                if (this.f19725q.f19684c.m74a() <= 1) {
                    this.f19709a = zyVar;
                    this.f19710b = i;
                    this.f19711c = (String) this.f19725q.f19689h.get(this.f19710b);
                    abx.m89c(xq.f19682a, String.format("Opening camera index %d (id %s) with camera2 API", new Object[]{Integer.valueOf(i), this.f19711c}));
                    String str = this.f19711c;
                    if (str != null) {
                        this.f19725q.f19686e.openCamera(str, this.f19731x, this);
                        break;
                    } else {
                        this.f19709a.mo672a(message.arg1);
                        break;
                    }
                }
                zyVar.mo678b(i, m82b(i));
                break;
            case 2:
                if (this.f19725q.f19684c.m74a() == 1) {
                    abx.m91e(xq.f19682a, "Ignoring release at inappropriate time");
                    break;
                }
                if (this.f19717i != null) {
                    m14564b();
                    this.f19717i = null;
                }
                CameraDevice cameraDevice = this.f19712d;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    this.f19712d = null;
                }
                this.f19713e = null;
                this.f19714f = null;
                this.f19715g = null;
                Surface surface = this.f19730w;
                if (surface != null) {
                    surface.release();
                    this.f19730w = null;
                }
                this.f19729v = null;
                imageReader = this.f19718j;
                if (imageReader != null) {
                    imageReader.close();
                    this.f19718j = null;
                }
                this.f19727t = null;
                this.f19728u = null;
                this.f19710b = 0;
                this.f19711c = null;
                m14566a(1);
                break;
            case 101:
                SurfaceTexture surfaceTexture = (SurfaceTexture) message.obj;
                if (this.f19725q.f19684c.m74a() >= 4) {
                    if (surfaceTexture == this.f19729v) {
                        abx.m89c(xq.f19682a, "Optimizing out redundant preview texture setting");
                        break;
                    }
                    if (this.f19717i != null) {
                        m14564b();
                    }
                    this.f19729v = surfaceTexture;
                    Point point = this.f19727t.f178a;
                    surfaceTexture.setDefaultBufferSize(point.x, point.y);
                    Surface surface2 = this.f19730w;
                    if (surface2 != null) {
                        surface2.release();
                    }
                    this.f19730w = new Surface(surfaceTexture);
                    imageReader = this.f19718j;
                    if (imageReader != null) {
                        imageReader.close();
                    }
                    Point point2 = this.f19728u.f178a;
                    this.f19718j = ImageReader.newInstance(point2.x, point2.y, 256, 1);
                    try {
                        this.f19712d.createCaptureSession(Arrays.asList(new Surface[]{this.f19730w, this.f19718j.getSurface()}), this.f19732y, this);
                        break;
                    } catch (Throwable e) {
                        abx.m85a(xq.f19682a, "Failed to create camera capture session", e);
                        break;
                    }
                }
                abx.m91e(xq.f19682a, "Ignoring texture setting at inappropriate time");
                break;
            case 102:
                if (this.f19725q.f19684c.m74a() != 8) {
                    abx.m91e(xq.f19682a, "Refusing to start preview at inappropriate time");
                    break;
                }
                this.f19719k = (aat) message.obj;
                m14566a(16);
                try {
                    this.f19717i.setRepeatingRequest(this.f19714f.m94a(this.f19712d, 1, this.f19730w), this.f19724p, this);
                    break;
                } catch (Throwable e2) {
                    abx.m88b(xq.f19682a, "Unable to start preview", e2);
                    m14566a(8);
                    break;
                }
            case 103:
                if (this.f19725q.f19684c.m74a() < 16) {
                    abx.m91e(xq.f19682a, "Refusing to stop preview at inappropriate time");
                    break;
                }
                this.f19717i.stopRepeating();
                m14566a(8);
                break;
            case 204:
                Object obj2;
                Object valueOf;
                yn ynVar = (yn) message.obj;
                aca aca3 = this.f19714f;
                ynVar.m14576a(CaptureRequest.CONTROL_AE_REGIONS, ynVar.m14577a(ynVar.d));
                ynVar.m14576a(CaptureRequest.CONTROL_AF_REGIONS, ynVar.m14577a(ynVar.e));
                ynVar.m14576a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(ynVar.g), Integer.valueOf(ynVar.h)));
                ynVar.m14576a(CaptureRequest.JPEG_QUALITY, Byte.valueOf(ynVar.l));
                ynVar.f19740b.m96b(CaptureRequest.SCALER_CROP_REGION, ynVar.f19741c);
                ynVar.m14576a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(ynVar.o));
                if (ynVar.p != null) {
                    Integer valueOf2;
                    switch (ynVar.p.ordinal()) {
                        case 1:
                            valueOf2 = Integer.valueOf(2);
                            obj2 = null;
                            break;
                        case 2:
                            valueOf = Integer.valueOf(1);
                            obj2 = Integer.valueOf(0);
                            break;
                        case 3:
                            valueOf = Integer.valueOf(3);
                            obj2 = Integer.valueOf(1);
                            break;
                        case 4:
                            obj2 = Integer.valueOf(2);
                            valueOf = null;
                            break;
                        case 5:
                            valueOf2 = Integer.valueOf(4);
                            obj2 = null;
                            break;
                        default:
                            aby = yn.f19738a;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unable to convert to API 2 flash mode: ");
                            stringBuilder.append(ynVar.p);
                            abx.m91e(aby, stringBuilder.toString());
                            obj2 = null;
                            valueOf = null;
                            break;
                    }
                }
                obj2 = null;
                valueOf = null;
                ynVar.f19740b.m96b(CaptureRequest.CONTROL_AE_MODE, valueOf);
                ynVar.f19740b.m96b(CaptureRequest.FLASH_MODE, obj2);
                if (ynVar.q != null) {
                    switch (ynVar.q.ordinal()) {
                        case 0:
                            obj2 = Integer.valueOf(1);
                            break;
                        case 1:
                            obj2 = Integer.valueOf(4);
                            break;
                        case 2:
                            obj2 = Integer.valueOf(3);
                            break;
                        case 3:
                            obj2 = Integer.valueOf(5);
                            break;
                        case 4:
                            obj2 = Integer.valueOf(0);
                            break;
                        case 6:
                            obj2 = Integer.valueOf(2);
                            break;
                        default:
                            aby = yn.f19738a;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unable to convert to API 2 focus mode: ");
                            stringBuilder.append(ynVar.q);
                            abx.m91e(aby, stringBuilder.toString());
                            obj2 = null;
                            break;
                    }
                }
                obj2 = null;
                ynVar.f19740b.m96b(CaptureRequest.CONTROL_AF_MODE, obj2);
                if (ynVar.r != null) {
                    switch (ynVar.r.ordinal()) {
                        case 1:
                            obj2 = Integer.valueOf(0);
                            break;
                        case 2:
                            obj2 = Integer.valueOf(2);
                            break;
                        case 3:
                            obj2 = Integer.valueOf(16);
                            break;
                        case 4:
                            obj2 = Integer.valueOf(8);
                            break;
                        case 5:
                            obj2 = Integer.valueOf(15);
                            break;
                        case 6:
                            obj2 = Integer.valueOf(12);
                            break;
                        case 7:
                            obj2 = Integer.valueOf(abv.f177a);
                            break;
                        case 8:
                            obj2 = Integer.valueOf(4);
                            break;
                        case 9:
                            obj2 = Integer.valueOf(5);
                            break;
                        case 11:
                            obj2 = Integer.valueOf(14);
                            break;
                        case 12:
                            obj2 = Integer.valueOf(3);
                            break;
                        case 13:
                            obj2 = Integer.valueOf(9);
                            break;
                        case 14:
                            obj2 = Integer.valueOf(13);
                            break;
                        case 15:
                            obj2 = Integer.valueOf(11);
                            break;
                        case 16:
                            obj2 = Integer.valueOf(10);
                            break;
                        case 17:
                            obj2 = Integer.valueOf(7);
                            break;
                        default:
                            aby = yn.f19738a;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unable to convert to API 2 scene mode: ");
                            stringBuilder.append(ynVar.r);
                            abx.m91e(aby, stringBuilder.toString());
                            obj2 = null;
                            break;
                    }
                }
                obj2 = null;
                ynVar.f19740b.m96b(CaptureRequest.CONTROL_SCENE_MODE, obj2);
                if (ynVar.s != null) {
                    switch (ynVar.s.ordinal()) {
                        case 0:
                            obj2 = Integer.valueOf(1);
                            break;
                        case 1:
                            obj2 = Integer.valueOf(6);
                            break;
                        case 2:
                            obj2 = Integer.valueOf(5);
                            break;
                        case 3:
                            obj2 = Integer.valueOf(3);
                            break;
                        case 4:
                            obj2 = Integer.valueOf(2);
                            break;
                        case 5:
                            obj2 = Integer.valueOf(8);
                            break;
                        case 6:
                            obj2 = Integer.valueOf(7);
                            break;
                        case 7:
                            obj2 = Integer.valueOf(4);
                            break;
                        default:
                            aby = yn.f19738a;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unable to convert to API 2 white balance: ");
                            stringBuilder.append(ynVar.s);
                            abx.m91e(aby, stringBuilder.toString());
                            obj2 = null;
                            break;
                    }
                }
                obj2 = null;
                ynVar.f19740b.m96b(CaptureRequest.CONTROL_AWB_MODE, obj2);
                ynVar.m14576a(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(ynVar.t));
                aca = ynVar.f19740b;
                Key key = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
                if (ynVar.t) {
                    obj = Integer.valueOf(0);
                }
                aca.m96b(key, obj);
                ynVar.m14576a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(ynVar.u));
                ynVar.m14576a(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(ynVar.v));
                if (ynVar.x == null || ynVar.x.f164e == null) {
                    ynVar.f19740b.m96b(CaptureRequest.JPEG_GPS_LOCATION, null);
                } else {
                    Location location = new Location(ynVar.x.f164e);
                    location.setTime(ynVar.x.f163d);
                    location.setAltitude(ynVar.x.f162c);
                    location.setLatitude(ynVar.x.f160a);
                    location.setLongitude(ynVar.x.f161b);
                    ynVar.f19740b.m96b(CaptureRequest.JPEG_GPS_LOCATION, location);
                }
                if (ynVar.y != null) {
                    ynVar.m14576a(CaptureRequest.JPEG_THUMBNAIL_SIZE, new Size(ynVar.y.f178a.x, ynVar.y.f178a.y));
                } else {
                    ynVar.m14576a(CaptureRequest.JPEG_THUMBNAIL_SIZE, null);
                }
                aca = ynVar.f19740b;
                if (!(aca == null || aca == aca3)) {
                    aca3.f183a.putAll(aca.f183a);
                    aca3.f184b++;
                }
                this.f19727t = ynVar.m70c();
                this.f19728u = ynVar.m68b();
                if (this.f19725q.f19684c.m74a() < 16) {
                    if (this.f19725q.f19684c.m74a() < 8) {
                        m14566a(4);
                        break;
                    }
                }
                try {
                    this.f19717i.setRepeatingRequest(this.f19714f.m94a(this.f19712d, 1, this.f19730w), this.f19724p, this);
                    break;
                } catch (Throwable e22) {
                    abx.m85a(xq.f19682a, "Failed to apply updated request settings", e22);
                    break;
                }
                break;
            case FrameType.ELEMENT_RGBA8888 /*301*/:
                if (this.f19726s <= 0) {
                    if (this.f19725q.f19684c.m74a() < 16) {
                        abx.m91e(xq.f19682a, "Ignoring attempt to autofocus without preview");
                        break;
                    }
                    yfVar = new yf(this, (zw) message.obj);
                    m14566a(32);
                    aca2 = new aca(this.f19714f);
                    aca2.m96b(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                    try {
                        this.f19717i.capture(aca2.m94a(this.f19712d, 1, this.f19730w), yfVar, this);
                        break;
                    } catch (Throwable e222) {
                        abx.m85a(xq.f19682a, "Unable to lock autofocus", e222);
                        m14566a(16);
                        break;
                    }
                }
                aby2 = xq.f19682a;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("handleMessage - Ignored AUTO_FOCUS because there was ");
                stringBuilder2.append(this.f19726s);
                stringBuilder2.append(" pending CANCEL_AUTO_FOCUS messages");
                abx.m90d(aby2, stringBuilder2.toString());
                break;
            case 302:
                this.f19726s++;
                if (this.f19725q.f19684c.m74a() < 16) {
                    abx.m91e(xq.f19682a, "Ignoring attempt to release focus lock without preview");
                    break;
                }
                m14566a(16);
                aca2 = new aca(this.f19714f);
                aca2.m96b(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                try {
                    this.f19717i.capture(aca2.m94a(this.f19712d, 1, this.f19730w), null, this);
                    break;
                } catch (Throwable e2222) {
                    abx.m85a(xq.f19682a, "Unable to cancel autofocus", e2222);
                    m14566a(32);
                    break;
                }
            case 303:
                this.f19722n = (zx) message.obj;
                break;
            case 305:
                this.f19726s--;
                break;
            case 502:
                aca = this.f19714f;
                Key key2 = CaptureRequest.JPEG_ORIENTATION;
                if (message.arg2 > 0) {
                    i2 = this.f19713e.f19696a.m54a(message.arg1, false);
                }
                aca.m96b(key2, Integer.valueOf(i2));
                break;
            case 503:
                this.f19714f.m96b(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(message.arg1));
                break;
            case 601:
                if (this.f19725q.f19684c.m74a() >= 16) {
                    if (this.f19725q.f19684c.m74a() != 32) {
                        abx.m91e(xq.f19682a, "Taking a (likely blurry) photo without the lens locked");
                    }
                    yl ylVar = (yl) message.obj;
                    if (!this.f19716h && (this.f19723o != 2 || this.f19714f.m95a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(3)) || this.f19714f.m95a(CaptureRequest.FLASH_MODE, Integer.valueOf(1)))) {
                        abx.m89c(xq.f19682a, "Forcing pre-capture autoexposure convergence");
                        yfVar = new yg(this, ylVar);
                        aca2 = new aca(this.f19714f);
                        aca2.m96b(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                        try {
                            this.f19717i.capture(aca2.m94a(this.f19712d, 1, this.f19730w), yfVar, this);
                            break;
                        } catch (Throwable e22222) {
                            abx.m85a(xq.f19682a, "Unable to run autoexposure and perform capture", e22222);
                            break;
                        }
                    }
                    abx.m89c(xq.f19682a, "Skipping pre-capture autoexposure convergence");
                    this.f19718j.setOnImageAvailableListener(ylVar, this);
                    try {
                        this.f19717i.capture(this.f19714f.m94a(this.f19712d, 2, this.f19718j.getSurface()), ylVar, this);
                        break;
                    } catch (Throwable e222222) {
                        abx.m85a(xq.f19682a, "Unable to initiate immediate capture", e222222);
                        break;
                    }
                }
                abx.m87b(xq.f19682a, "Photos may only be taken when a preview is active");
                break;
                break;
            default:
                try {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Unimplemented CameraProxy message=");
                    stringBuilder2.append(message.what);
                    throw new RuntimeException(stringBuilder2.toString());
                } catch (Exception e3) {
                    if (i3 != 2) {
                        CameraDevice cameraDevice2 = this.f19712d;
                        if (cameraDevice2 != null) {
                            cameraDevice2.close();
                            this.f19712d = null;
                            if (e3 instanceof RuntimeException) {
                                b = m82b(Integer.parseInt(this.f19711c));
                                xqVar = this.f19725q;
                                xqVar.f19688g.mo2580a((RuntimeException) e3, b, i3, xqVar.f19684c.m74a());
                            }
                            aaw.m27a(message);
                            return;
                        }
                    }
                    if (this.f19712d == null) {
                        if (i3 == 1) {
                            zyVar = this.f19709a;
                            if (zyVar != null) {
                                i = this.f19710b;
                                zyVar.mo673a(i, m82b(i));
                            }
                        } else {
                            aby2 = xq.f19682a;
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Cannot handle message ");
                            stringBuilder2.append(message.what);
                            stringBuilder2.append(", mCamera is null");
                            abx.m91e(aby2, stringBuilder2.toString());
                        }
                        aaw.m27a(message);
                        return;
                    }
                    if (e3 instanceof RuntimeException) {
                        b = m82b(Integer.parseInt(this.f19711c));
                        xqVar = this.f19725q;
                        xqVar.f19688g.mo2580a((RuntimeException) e3, b, i3, xqVar.f19684c.m74a());
                    }
                    aaw.m27a(message);
                    return;
                } catch (Throwable th) {
                    aaw.m27a(message);
                }
        }
        aaw.m27a(message);
    }
}
