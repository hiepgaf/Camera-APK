package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.Camera.Area;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dwj */
final class dwj extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ dwd f3322a;

    dwj(dwd dwd) {
        this.f3322a = dwd;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        dwd dwd = this.f3322a;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (dwd.f23066w == go.af) {
            gwv gwv = dwd.f23061r;
            if (gwv.f17494f) {
                int i = gwv.f17493e;
                if (i != 2) {
                    if (gwv.f17499k != null && (i == 1 || i == 3 || i == 4)) {
                        gwv.m11626a();
                    }
                    if (!(gwv.f17506r.width() == 0 || gwv.f17506r.height() == 0)) {
                        if (gwv.f17495g) {
                            if (gwv.f17499k == null) {
                                gwv.f17499k = new ArrayList();
                                gwv.f17499k.add(new Area(new Rect(), 1));
                            }
                            ((Area) gwv.f17499k.get(0)).rect = gwv.m11625a(rawX, rawY, (int) (((float) Math.min(gwv.f17506r.width(), gwv.f17506r.height())) * gwv.f17489c));
                        }
                        if (gwv.f17496h) {
                            if (gwv.f17500l == null) {
                                gwv.f17500l = new ArrayList();
                                gwv.f17500l.add(new Area(new Rect(), 1));
                            }
                            ((Area) gwv.f17500l.get(0)).rect = gwv.m11625a(rawX, rawY, (int) (((float) Math.min(gwv.f17506r.width(), gwv.f17506r.height())) * gwv.f17490d));
                        }
                        float f = (float) rawX;
                        float f2 = (float) rawY;
                        kow.m13622a(gwv.f17505q.mo2788a(new PointF(f, f2)).mo1735b(), new haj(gwv), iel.m3714a());
                        gwv.f17507s = new hin(f, f2, (float) gwv.f17506r.width(), (float) gwv.f17506r.height());
                        gwv.f17508t = System.currentTimeMillis();
                        gwv.f17503o.mo3416u();
                        gwv.f17503o.mo3414s();
                        if (gwv.f17495g) {
                            gwv.m11627a(1);
                        } else {
                            gwv.f17502n.removeMessages(0);
                            gwv.f17502n.sendEmptyMessageDelayed(0, (long) gwv.f17488b);
                        }
                    }
                }
            }
        }
        return true;
    }
}
