package p000;

import android.graphics.Point;
import android.view.WindowManager;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

/* compiled from: PG */
/* renamed from: hci */
public class hci implements hch {
    /* renamed from: a */
    public static hec m11747a() {
        return hee.f6087a;
    }

    /* renamed from: a */
    public static hec m11749a(int i, Object... objArr) {
        if (i < 0) {
            return hci.m11747a();
        }
        return new heg(i, objArr);
    }

    /* renamed from: a */
    public static hec m11748a(int i, int i2, Object... objArr) {
        if (i < 0) {
            return hci.m11747a();
        }
        return new hef(i, i2, objArr);
    }

    /* renamed from: a */
    public static void m11751a(MainActivityLayout mainActivityLayout, gye gye) {
        mainActivityLayout.f12348d = gye;
    }

    /* renamed from: a */
    public static boolean m11752a(hec hec) {
        return hec == hci.m11747a();
    }

    public void onShutterButtonClick() {
    }

    public void onShutterButtonLongPressRelease() {
    }

    public void onShutterButtonLongPressed() {
    }

    public void onShutterButtonPressedStateChanged(boolean z) {
    }

    public void onShutterTouch(hin hin) {
    }

    /* renamed from: a */
    public static heq m11750a(cbu cbu, bkw bkw) {
        Point point = new Point(0, 0);
        ((WindowManager) cbu.m1099a(cbu.f1837a, "window")).getDefaultDisplay().getSize(point);
        return new heq(new iqp(point.x, point.y), bkw);
    }
}
