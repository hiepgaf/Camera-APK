package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: itn */
public final class itn implements iwl {
    /* renamed from: a */
    private final CameraDevice f21770a;

    public itn(CameraDevice cameraDevice) {
        this.f21770a = cameraDevice;
    }

    public final void close() {
        this.f21770a.close();
    }

    /* renamed from: a */
    public final iwn mo2986a(int i) {
        Throwable e;
        try {
            return new iwn(this.f21770a.createCaptureRequest(i));
        } catch (IllegalStateException e2) {
            e = e2;
            throw new isr(e);
        } catch (CameraAccessException e3) {
            e = e3;
            throw new isr(e);
        } catch (SecurityException e4) {
            e = e4;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final void mo2989a(iwu iwu) {
        Throwable e;
        try {
            List kfh;
            int d = iwu.mo1948d();
            List b = iwu.mo1946b();
            kaw kaw = ito.f18576a;
            if (b instanceof RandomAccess) {
                kfh = new kfh(b, kaw);
            } else {
                kfh = new kfj(b, kaw);
            }
            SessionConfiguration sessionConfiguration = new SessionConfiguration(d, kfh, iwu.mo1945a(), itt.m4209a(iwu.mo1949e()));
            if (iwu.mo1947c() != null) {
                sessionConfiguration.setSessionParameters((CaptureRequest) ion.m3945a(iwu.mo1947c()));
            }
            this.f21770a.createCaptureSession(sessionConfiguration);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final void mo2990a(List list, iwi iwi, Handler handler) {
        Throwable e;
        try {
            this.f21770a.createCaptureSession(list, itt.m4209a(iwi), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: b */
    public final void mo2993b(List list, iwi iwi, Handler handler) {
        Throwable e;
        try {
            this.f21770a.createCaptureSessionByOutputConfigurations(ion.m3963b(list), itt.m4209a(iwi), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final void mo2991a(List list, iwk iwk, Handler handler) {
        Throwable e;
        try {
            this.f21770a.createConstrainedHighSpeedCaptureSession(list, new itu(iwk), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final iwn mo2987a(iwp iwp) {
        Throwable e;
        try {
            return new iwn(this.f21770a.createReprocessCaptureRequest((TotalCaptureResult) ion.m3945a((iwe) iwp)));
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        }
    }

    /* renamed from: a */
    public final void mo2988a(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler) {
        Throwable e;
        try {
            this.f21770a.createReprocessableCaptureSession(inputConfiguration, list, itt.m4209a(iwi), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }

    /* renamed from: b */
    public final void mo2992b(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler) {
        Throwable e;
        try {
            this.f21770a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, ion.m3963b(list), itt.m4209a(iwi), handler);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new isr(e);
        } catch (IllegalStateException e3) {
            e = e3;
            throw new isr(e);
        } catch (CameraAccessException e4) {
            e = e4;
            throw new isr(e);
        } catch (SecurityException e5) {
            e = e5;
            throw new isr(e);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            throw new isr(e);
        }
    }
}
