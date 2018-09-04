package p000;

import android.hardware.camera2.CameraAccessException;

/* compiled from: PG */
/* renamed from: bjp */
final class bjp implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ kpw f1207a;
    /* renamed from: b */
    public final /* synthetic */ bjo f1208b;
    /* renamed from: c */
    private final /* synthetic */ bhj f1209c;

    bjp(bjo bjo, bhj bhj, kpw kpw) {
        this.f1208b = bjo;
        this.f1209c = bhj;
        this.f1207a = kpw;
    }

    public final void run() {
        Object e;
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        try {
            this.f1209c.m7381a();
        } catch (CameraAccessException e2) {
            e = e2;
            str = bjo.f10962a;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
            stringBuilder.append("Failed when call CameraCaptureSession#abortCaptures: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            this.f1208b.f10963b.execute(new bjq(this));
        } catch (iwf e3) {
            e = e3;
            str = bjo.f10962a;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
            stringBuilder.append("Failed when call CameraCaptureSession#abortCaptures: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            this.f1208b.f10963b.execute(new bjq(this));
        }
        this.f1208b.f10963b.execute(new bjq(this));
    }
}
