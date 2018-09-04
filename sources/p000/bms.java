package p000;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bms */
public final class bms implements kwk {
    /* renamed from: a */
    private final kwk f11033a;
    /* renamed from: b */
    private final kwk f11034b;
    /* renamed from: c */
    private final kwk f11035c;
    /* renamed from: d */
    private final kwk f11036d;

    public bms(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11033a = kwk;
        this.f11034b = kwk2;
        this.f11035c = kwk3;
        this.f11036d = kwk4;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11033a;
        kwk kwk2 = this.f11034b;
        kwk kwk3 = this.f11035c;
        kwk kwk4 = this.f11036d;
        CameraManager cameraManager = (CameraManager) kwk.mo345a();
        irs irs = (irs) kwk2.mo345a();
        kwk3.mo345a();
        return new bmp(cameraManager, irs, (Executor) kwk4.mo345a());
    }
}
