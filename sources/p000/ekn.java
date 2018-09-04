package p000;

import android.opengl.GLES20;
import java.nio.ShortBuffer;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ekn */
public final class ekn extends ejn {
    /* renamed from: f */
    public int f15231f = 0;
    /* renamed from: g */
    public int f15232g = 0;
    /* renamed from: h */
    public boolean f15233h = false;
    /* renamed from: i */
    public ShortBuffer f15234i;
    /* renamed from: j */
    public ejq f15235j = null;
    /* renamed from: k */
    public ArrayList f15236k = new ArrayList();
    /* renamed from: l */
    public boolean f15237l = true;
    /* renamed from: m */
    public boolean f15238m = true;

    /* renamed from: b */
    public final void mo1228b(float[] fArr) {
        if (this.f15233h) {
            if (this.f15238m) {
                GLES20.glUseProgram(this.e.f3693d);
                this.e.m1808b(this.a);
                this.e.m1806a(this.b);
                this.e.m1807a(fArr);
                if (this.d.size() > 0) {
                    ((ejo) this.d.get(0)).m1799a();
                }
                this.c.position(0);
                GLES20.glDrawElements(4, this.f15231f, 5123, this.c);
            }
            if (this.f15237l) {
                ejq ejq = this.f15235j;
                if (ejq != null) {
                    GLES20.glUseProgram(ejq.f3693d);
                    this.f15235j.m1808b(this.a);
                    this.f15235j.m1807a(fArr);
                    this.f15234i.position(0);
                    GLES20.glLineWidth(9.0f);
                    GLES20.glDrawElements(2, this.f15232g, 5123, this.f15234i);
                    GLES20.glDrawElements(0, this.f15232g, 5123, this.f15234i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1227a() {
        ArrayList arrayList = this.f15236k;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ejo ejo = (ejo) arrayList.get(i);
                if (ejo != null) {
                    ejo.m1800d();
                    i = i2;
                } else {
                    i = i2;
                }
            }
            this.f15236k.clear();
        }
    }

    /* renamed from: a */
    public final void m9734a(int i) {
        if (this.d.size() != 0) {
            ((ejo) this.d.get(0)).f3688a = i;
        }
    }
}
