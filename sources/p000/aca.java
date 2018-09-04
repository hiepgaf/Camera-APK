package p000;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: aca */
public final class aca {
    /* renamed from: a */
    public final Map f183a;
    /* renamed from: b */
    public long f184b;

    public aca() {
        this.f183a = new HashMap();
        this.f184b = 0;
    }

    public aca(aca aca) {
        if (aca == null) {
            throw new NullPointerException("Tried to copy null Camera2RequestSettingsSet");
        }
        this.f183a = new HashMap(aca.f183a);
        this.f184b = aca.f184b;
    }

    /* renamed from: a */
    public final CaptureRequest m94a(CameraDevice cameraDevice, int i, Surface... surfaceArr) {
        if (cameraDevice == null) {
            throw new NullPointerException("Tried to create request using null CameraDevice");
        }
        Builder createCaptureRequest = cameraDevice.createCaptureRequest(i);
        for (Key key : this.f183a.keySet()) {
            Object a = m93a(key);
            if (a != null) {
                createCaptureRequest.set(key, a);
            }
        }
        for (Surface surface : surfaceArr) {
            if (surface == null) {
                throw new NullPointerException("Tried to add null Surface as request target");
            }
            createCaptureRequest.addTarget(surface);
        }
        return createCaptureRequest.build();
    }

    /* renamed from: a */
    private final Object m93a(Key key) {
        if (key != null) {
            return this.f183a.get(key);
        }
        throw new NullPointerException("Received a null key");
    }

    /* renamed from: a */
    public final boolean m95a(Key key, Object obj) {
        return Objects.equals(m93a(key), obj);
    }

    /* renamed from: b */
    public final boolean m96b(Key key, Object obj) {
        if (key == null) {
            throw new NullPointerException("Received a null key");
        }
        Object a = m93a(key);
        if (this.f183a.containsKey(key) && Objects.equals(obj, a)) {
            return false;
        }
        this.f183a.put(key, obj);
        this.f184b++;
        return true;
    }
}
