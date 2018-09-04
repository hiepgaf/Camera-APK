package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: dfi */
final class dfi implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ des f3030a;

    dfi(des des) {
        this.f3030a = des;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ejy ejy = this.f3030a.f22836v;
        if (ejy == null || !ejy.f3745u) {
            return false;
        }
        switch (motionEvent.getAction() & Illuminant.kOther) {
            case 0:
                break;
            case 2:
                if (!ejy.f3729e) {
                    return true;
                }
                if (motionEvent.getPointerCount() > 1) {
                    ejy.f3731g = ejy.m1819a(motionEvent);
                    float f = ejy.f3731g;
                    float f2 = ejy.f3730f;
                    eki eki = ejy.f3726b;
                    eki.m1838b(f / f2);
                    eki.f3793n = true;
                    break;
                }
                return true;
            case 5:
                ejy.f3730f = ejy.m1819a(motionEvent);
                ejy.f3729e = true;
                break;
            case 6:
                ejy.f3729e = false;
                ejy.f3726b.m1835a(ejy.f3731g / ejy.f3730f);
                break;
            default:
                return false;
        }
        return true;
    }
}
