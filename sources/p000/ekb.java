package p000;

import android.hardware.SensorManager;
import android.location.Location;
import java.util.List;

/* compiled from: PG */
/* renamed from: ekb */
final class ekb implements zw {
    /* renamed from: a */
    private final /* synthetic */ aah f15222a;
    /* renamed from: b */
    private final /* synthetic */ eka f15223b;

    ekb(eka eka, aah aah) {
        this.f15223b = eka;
        this.f15222a = aah;
    }

    /* renamed from: a */
    public final void mo1199a(boolean z, aah aah) {
        ejy ejy = this.f15223b.f3751a;
        ejy.f3736l++;
        if (ejy.f3735k) {
            bli.m873e(ejy.f3708a, "Past trial succeeded so nothing to do, shouldn't have gotten to this.");
        } else {
            if (!z) {
                if (ejy.f3736l >= 3) {
                }
                if (z) {
                    this.f15223b.f3751a.f3733i = -9990.0d;
                } else {
                    ejy = this.f15223b.f3751a;
                    ejy.f3733i = ejy.f3734j;
                }
                this.f15223b.f3751a.f3735k = z;
            }
            this.f15222a.mo2557a(ejy.f3719K, ejy.f3722N, ejy.f3721M, ejy.f3723O);
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
            if (z) {
                this.f15223b.f3751a.f3733i = -9990.0d;
            } else {
                ejy = this.f15223b.f3751a;
                ejy.f3733i = ejy.f3734j;
            }
            this.f15223b.f3751a.f3735k = z;
        }
        this.f15223b.f3751a.f3737m.release();
    }
}
