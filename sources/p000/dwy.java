package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dwy */
final class dwy extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ dwd f21191a;

    dwy(dwd dwd) {
        this.f21191a = dwd;
    }

    public final void onCameraSwitch(int i) {
        dwd dwd = this.f21191a;
        String str;
        StringBuilder stringBuilder;
        if (dwd.f23054k.mo2730E() || dwd.f23054k.mo2759n().mo680b()) {
            str = dwd.f23020d;
            boolean E = dwd.f23054k.mo2730E();
            boolean b = dwd.f23054k.mo2759n().mo680b();
            stringBuilder = new StringBuilder(82);
            stringBuilder.append("Not switching cameras, appController is stopped: ");
            stringBuilder.append(E);
            stringBuilder.append(" / waiting for camera: ");
            stringBuilder.append(b);
            bli.m863a(str, stringBuilder.toString());
        } else if (i == dwd.f23067x) {
            str = dwd.f23020d;
            int i2 = dwd.f23067x;
            stringBuilder = new StringBuilder(47);
            stringBuilder.append("Not switching cameras, same facing: ");
            stringBuilder.append(i2);
            bli.m873e(str, stringBuilder.toString());
            dwd.f23054k.mo2757l().m9618h();
        } else {
            dwd.f23066w = go.ac;
            dxj dxj = dwd.f23056m;
            if (dxj != null) {
                dxj.m9513c();
            }
            dwd.f23056m = null;
            dwd.f23053j.mo2759n().mo682d(i);
            dwd.f23052i.m1695a(i);
        }
    }
}
