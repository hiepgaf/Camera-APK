package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: nx */
public final class nx {
    /* renamed from: a */
    public final ArrayList f8984a = new ArrayList();
    /* renamed from: b */
    public kg f8985b;
    /* renamed from: c */
    public boolean f8986c;
    /* renamed from: d */
    private long f8987d = -1;
    /* renamed from: e */
    private Interpolator f8988e;
    /* renamed from: f */
    private final kh f8989f = new ny(this);

    /* renamed from: a */
    public final void m5655a() {
        if (this.f8986c) {
            ArrayList arrayList = this.f8984a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((kd) arrayList.get(i)).m4772a();
                i = i2;
            }
            this.f8986c = false;
        }
    }

    /* renamed from: a */
    public final nx m5653a(kd kdVar) {
        if (!this.f8986c) {
            this.f8984a.add(kdVar);
        }
        return this;
    }

    /* renamed from: b */
    public final nx m5656b() {
        if (!this.f8986c) {
            this.f8987d = 250;
        }
        return this;
    }

    /* renamed from: a */
    public final nx m5652a(Interpolator interpolator) {
        if (!this.f8986c) {
            this.f8988e = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public final nx m5654a(kg kgVar) {
        if (!this.f8986c) {
            this.f8985b = kgVar;
        }
        return this;
    }

    /* renamed from: c */
    public final void m5657c() {
        if (!this.f8986c) {
            ArrayList arrayList = this.f8984a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                kd kdVar = (kd) arrayList.get(i);
                long j = this.f8987d;
                if (j >= 0) {
                    kdVar.m4769a(j);
                }
                TimeInterpolator timeInterpolator = this.f8988e;
                if (timeInterpolator != null) {
                    View view = (View) kdVar.f8211a.get();
                    if (view != null) {
                        view.animate().setInterpolator(timeInterpolator);
                    }
                }
                if (this.f8985b != null) {
                    kdVar.m4770a(this.f8989f);
                }
                View view2 = (View) kdVar.f8211a.get();
                if (view2 != null) {
                    view2.animate().start();
                    i = i2;
                } else {
                    i = i2;
                }
            }
            this.f8986c = true;
        }
    }
}
