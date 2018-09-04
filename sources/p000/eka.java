package p000;

import android.hardware.SensorManager;
import android.location.Location;
import android.os.AsyncTask;
import java.util.List;

/* compiled from: PG */
/* renamed from: eka */
final class eka extends AsyncTask {
    /* renamed from: a */
    public final /* synthetic */ ejy f3751a;

    eka(ejy ejy) {
        this.f3751a = ejy;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m1827a();
    }

    /* renamed from: a */
    private final Void m1827a() {
        ejy ejy = this.f3751a;
        if (!ejy.f3746v) {
            return null;
        }
        aah aah = ejy.f3727c.f3657b;
        if (aah == null) {
            return null;
        }
        aah.mo2564b(ejy.f3719K, null);
        aah.mo2556a(this.f3751a.f3719K, null);
        ejy = this.f3751a;
        ejy.f3734j = (double) ((float) (Math.asin((double) (-ejy.f3732h.m1858b()[6])) * 57.29577951308232d));
        ejy = this.f3751a;
        if (ejy.f3739o == 0) {
            ejy.f3733i = ejy.f3734j;
        }
        Object obj = this.f3751a.f3749y ? !ejv.m1814a(Math.abs(ejy.f3734j - ejy.f3733i)) ? this.f3751a.f3718J ? 1 : null : 1 : null;
        if (obj != null) {
            bli.m863a(ejy.f3708a, "Auto-focusing.");
            ejy = this.f3751a;
            ejy.f3735k = false;
            ejy.f3736l = 0;
            ejy.f3737m.drainPermits();
            for (int i = 0; i < 3; i++) {
                ejy ejy2 = this.f3751a;
                if (ejy2.f3735k) {
                    break;
                }
                aah.mo2558a(ejy2.f3719K, new ekb(this, aah));
                try {
                    this.f3751a.f3737m.acquire();
                } catch (InterruptedException e) {
                    bli.m871d(ejy.f3708a, "mFocusRetrySemaphore.acquire() InterruptedException ");
                }
            }
        } else {
            ejy = this.f3751a;
            aah.mo2557a(ejy.f3719K, ejy.f3722N, ejy.f3721M, ejy.f3723O);
            List list = ejy.f3714F;
            long currentTimeMillis = System.currentTimeMillis();
            Location d = ejy.f3743s.mo1244d();
            eld eld = ejy.f3732h;
            float[] fArr = new float[16];
            ejk ejk = eld.f3905f;
            SensorManager.getRotationMatrix(fArr, null, new float[]{ejk.f3675a, ejk.f3676b, ejk.f3677c}, eld.f3908i);
            float[] fArr2 = new float[16];
            SensorManager.remapCoordinateSystem(fArr, 1, 3, fArr2);
            fArr = new float[3];
            SensorManager.getOrientation(fArr2, fArr);
            list.add(new emf(currentTimeMillis, d, (int) (((double) (fArr[0] * 180.0f)) / 3.141592653589793d)));
            ejy.f3718J = false;
        }
        return null;
    }
}
