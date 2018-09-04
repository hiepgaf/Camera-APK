package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;

/* compiled from: PG */
/* renamed from: yh */
final class yh extends StateCallback {
    /* renamed from: a */
    private final /* synthetic */ ye f9536a;

    yh(ye yeVar) {
        this.f9536a = yeVar;
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        aby aby = xq.f19682a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Camera device '");
        stringBuilder.append(this.f9536a.f19710b);
        stringBuilder.append("' was disconnected");
        abx.m91e(aby, stringBuilder.toString());
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        aby aby = xq.f19682a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Camera device '");
        stringBuilder.append(this.f9536a.f19710b);
        stringBuilder.append("' encountered error code '");
        stringBuilder.append(i);
        stringBuilder.append('\'');
        abx.m87b(aby, stringBuilder.toString());
        ye yeVar = this.f9536a;
        zy zyVar = yeVar.f19709a;
        if (zyVar != null) {
            int i2 = yeVar.f19710b;
            zyVar.mo673a(i2, yeVar.m82b(i2));
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        ye yeVar = this.f9536a;
        yeVar.f19712d = cameraDevice;
        if (yeVar.f19709a != null) {
            try {
                boolean z;
                CameraCharacteristics cameraCharacteristics = yeVar.f19725q.f19686e.getCameraCharacteristics(yeVar.f19711c);
                abh a = this.f9536a.f19725q.mo2542a().mo2550a(this.f9536a.f19710b);
                ye yeVar2 = this.f9536a;
                xq xqVar = yeVar2.f19725q;
                yeVar2.f19713e = new xt(xqVar, xqVar, yeVar2.f19710b, a, cameraCharacteristics);
                this.f9536a.f19714f = new aca();
                this.f9536a.f19715g = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                ye yeVar3 = this.f9536a;
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                yeVar3.f19716h = z;
                this.f9536a.m14566a(2);
                yeVar = this.f9536a;
                yeVar.f19709a.mo674a(yeVar.f19713e);
            } catch (CameraAccessException e) {
                yeVar = this.f9536a;
                zy zyVar = yeVar.f19709a;
                int i = yeVar.f19710b;
                zyVar.mo673a(i, yeVar.m82b(i));
            }
        }
    }
}
