package p000;

import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: uj */
public final class uj {
    /* renamed from: a */
    public int f9320a;
    /* renamed from: b */
    public int f9321b;
    /* renamed from: c */
    public int[] f9322c;
    /* renamed from: d */
    public int f9323d;

    /* renamed from: a */
    public final void m5987a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        } else {
            int i3 = this.f9323d;
            i3 += i3;
            Object obj = this.f9322c;
            if (obj == null) {
                this.f9322c = new int[4];
                Arrays.fill(this.f9322c, -1);
            } else {
                int length = obj.length;
                if (i3 >= length) {
                    this.f9322c = new int[(i3 + i3)];
                    System.arraycopy(obj, 0, this.f9322c, 0, length);
                }
            }
            int[] iArr = this.f9322c;
            iArr[i3] = i;
            iArr[i3 + 1] = i2;
            this.f9323d++;
        }
    }

    /* renamed from: a */
    final void m5986a() {
        int[] iArr = this.f9322c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f9323d = 0;
    }

    /* renamed from: a */
    final void m5988a(RecyclerView recyclerView, boolean z) {
        this.f9323d = 0;
        int[] iArr = this.f9322c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        ug ugVar = recyclerView.f683k;
        if (recyclerView.f682j != null && ugVar != null && ugVar.f9313k) {
            if (z) {
                if (!recyclerView.f677e.m5848b()) {
                    ugVar.mo2464a(recyclerView.f682j.mo728a(), this);
                }
            } else if (!recyclerView.m473j()) {
                ugVar.mo2463a(this.f9320a, this.f9321b, recyclerView.f656A, this);
            }
            int i = this.f9323d;
            if (i > ugVar.f9314l) {
                ugVar.f9314l = i;
                ugVar.f9315m = z;
                recyclerView.f676d.m6008d();
            }
        }
    }

    /* renamed from: a */
    final boolean m5989a(int i) {
        if (this.f9322c == null) {
            return false;
        }
        int i2 = this.f9323d;
        int i3 = i2 + i2;
        for (i2 = 0; i2 < i3; i2 += 2) {
            if (this.f9322c[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
