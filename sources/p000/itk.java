package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.List;

/* compiled from: PG */
/* renamed from: itk */
public final class itk implements iwg {
    /* renamed from: a */
    private final CameraCaptureSession f21769a;

    itk(CameraCaptureSession cameraCaptureSession) {
        this.f21769a = cameraCaptureSession;
    }

    /* renamed from: a */
    public final void mo2980a() {
        Throwable e;
        try {
            this.f21769a.abortCaptures();
        } catch (IllegalStateException e2) {
            e = e2;
            throw new iwf(e);
        } catch (SecurityException e3) {
            e = e3;
            throw new iwf(e);
        }
    }

    /* renamed from: a */
    public final int mo2979a(List list, iwh iwh, Handler handler) {
        Throwable e;
        try {
            return this.f21769a.captureBurst(ion.m3963b(list), new itl(iwh), handler);
        } catch (IllegalStateException e2) {
            e = e2;
            throw new iwf(e);
        } catch (SecurityException e3) {
            e = e3;
            throw new iwf(e);
        }
    }

    public final void close() {
        this.f21769a.close();
    }

    /* renamed from: a */
    public final void mo2981a(List list) {
        hsx.m3353a(this.f21769a, ion.m3963b(list));
    }

    /* renamed from: b */
    public final iwl mo2983b() {
        CameraDevice device = this.f21769a.getDevice();
        itt itt = new itt();
        return new itn(device);
    }

    /* renamed from: c */
    public final Surface mo2984c() {
        return this.f21769a.getInputSurface();
    }

    /* renamed from: b */
    public final int mo2982b(List list, iwh iwh, Handler handler) {
        Throwable e;
        try {
            return this.f21769a.setRepeatingBurst(ion.m3963b(list), new itl(iwh), handler);
        } catch (IllegalStateException e2) {
            e = e2;
            throw new iwf(e);
        } catch (SecurityException e3) {
            e = e3;
            throw new iwf(e);
        }
    }

    /* renamed from: d */
    public final void mo2985d() {
        Throwable e;
        try {
            this.f21769a.stopRepeating();
        } catch (IllegalStateException e2) {
            e = e2;
            throw new iwf(e);
        } catch (SecurityException e3) {
            e = e3;
            throw new iwf(e);
        }
    }
}
