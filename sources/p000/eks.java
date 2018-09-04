package p000;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: eks */
public final class eks {
    /* renamed from: a */
    public ArrayList f3824a;
    /* renamed from: b */
    public eld f3825b;
    /* renamed from: c */
    public long f3826c;
    /* renamed from: d */
    public eli f3827d;
    /* renamed from: e */
    public Point f3828e;
    /* renamed from: f */
    public int f3829f = 0;
    /* renamed from: g */
    public boolean f3830g = false;
    /* renamed from: h */
    public boolean f3831h = false;
    /* renamed from: i */
    public boolean f3832i = false;

    public eks(Context context, eld eld, int i, int i2) {
        try {
            this.f3827d = new eli();
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
        if (this.f3824a == null) {
            this.f3824a = new ArrayList();
        }
        int[] iArr = new int[]{R.drawable.focus_quadrant_4, R.drawable.focus_quadrant_1, R.drawable.focus_quadrant_2, R.drawable.focus_quadrant_3, R.drawable.focus_quadrant_4};
        this.f3824a.clear();
        for (int i3 = 0; i3 < 5; i3++) {
            this.f3824a.add(i3, new ejt());
            ((ejt) this.f3824a.get(i3)).m9721a(context, iArr[i3], 4.0f);
            ((ejt) this.f3824a.get(i3)).f3685e = this.f3827d;
        }
        this.f3825b = eld;
        this.f3828e = new Point((i / 2) - (((ejt) this.f3824a.get(0)).f15211g.x / 2), (i2 / 2) - (((ejt) this.f3824a.get(0)).f15211g.y / 2));
        this.f3831h = false;
        this.f3830g = false;
        this.f3832i = true;
    }

    /* renamed from: a */
    public final void m1840a() {
        this.f3829f = 0;
        if (this.f3830g) {
            eld eld = this.f3825b;
            LightCycle.m1297a(eld.m1857a(), eld.f3912m, (int) (((double) (SystemClock.elapsedRealtimeNanos() - this.f3826c)) / 1000000.0d));
            this.f3830g = false;
        }
    }
}
