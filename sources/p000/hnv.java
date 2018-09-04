package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: hnv */
final class hnv extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ hnu f6405a;

    hnv(hnu hnu) {
        this.f6405a = hnu;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.f6405a.f6391h.mo1653a();
        hnj hnj = (hnj) this.f6405a.f6394k.mo2130a().get(this.f6405a.f6395l.mo2860b());
        if (hnj == null) {
            return false;
        }
        if (hnj == hnj.SWITCH_CAMERA && !hnu.f6384a) {
            return true;
        }
        hnk hnk = this.f6405a.f6393j;
        String str = hhs.f17872a;
        String valueOf = String.valueOf(hnj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
        stringBuilder.append("DoubleTapListener onDoubleTap ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        if (hnj == hnj.ZOOM) {
            hnk.f6379a.mo1761f();
        } else if (hnj == hnj.SWITCH_CAMERA) {
            hnk.f6380b.switchCamera();
        } else if (hnj == hnj.NONE) {
            bli.m863a(hhs.f17872a, "DoubleTapListener onDoubleTap event ignored.");
        } else {
            String valueOf2 = String.valueOf(hnj);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            stringBuilder2.append("Invalid double tap action option ");
            stringBuilder2.append(valueOf2);
            throw new IllegalStateException(stringBuilder2.toString());
        }
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        hnl hnl = this.f6405a.f6389f;
        if (Math.abs(f) > Math.abs(f2)) {
            return hnl.f6381a.m2941a(f, false);
        }
        return hnl.f6381a.m2941a(f2, true);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        hnu hnu = this.f6405a;
        hnu.f6398o = true;
        hnu.f6391h.mo1653a();
        hnu = this.f6405a;
        hnp hnp = hnu.f6390g;
        hnu.m3259a(motionEvent);
        hnp.mo2641d();
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f6405a.f6390g.mo1747c();
        hnu hnu = this.f6405a;
        switch (hnu.f6396m - 1) {
            case 0:
                if (hnu.f6401r > 0) {
                    return false;
                }
                boolean z;
                hnu.f6399p += f;
                hnu.f6400q += f2;
                float f3 = hnu.f6399p;
                if (f3 > 40.0f) {
                    z = true;
                } else if ((-f3) <= 40.0f) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    hnu.f6387d.m11908a(f3);
                    this.f6405a.f6396m = go.bE;
                    return true;
                }
                f3 = hnu.f6400q;
                if (f3 > 40.0f) {
                    z = true;
                } else if ((-f3) <= 40.0f) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                hnu.f6388e.m11917a(f3);
                this.f6405a.f6396m = go.bF;
                return true;
            case 1:
                hnu.f6387d.m11908a(f);
                return true;
            case 2:
                hnu.f6388e.m11917a(f2);
                return true;
            default:
                throw new IllegalStateException("Unknown scrolling state");
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        hnu hnu = this.f6405a;
        return hnu.f6391h.mo1654a(hnu.m3259a(motionEvent));
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        hnu hnu = this.f6405a;
        return hnu.f6391h.mo1655b(hnu.m3259a(motionEvent));
    }
}
