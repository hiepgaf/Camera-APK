package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: tb */
final class tb {
    /* renamed from: a */
    public tt f9254a;
    /* renamed from: b */
    public int f9255b;
    /* renamed from: c */
    public int f9256c;
    /* renamed from: d */
    public boolean f9257d;
    /* renamed from: e */
    public boolean f9258e;

    tb() {
        m5831b();
    }

    /* renamed from: a */
    final void m5829a() {
        int b;
        if (this.f9257d) {
            b = this.f9254a.m5854b();
        } else {
            b = this.f9254a.m5862f();
        }
        this.f9256c = b;
    }

    /* renamed from: a */
    public final void m5830a(View view, int i) {
        if (this.f9257d) {
            this.f9256c = this.f9254a.m5852a(view) + this.f9254a.m5865h();
        } else {
            this.f9256c = this.f9254a.m5859d(view);
        }
        this.f9255b = i;
    }

    /* renamed from: b */
    public final void m5832b(View view, int i) {
        int h = this.f9254a.m5865h();
        if (h >= 0) {
            m5830a(view, i);
            return;
        }
        this.f9255b = i;
        int b;
        if (this.f9257d) {
            h = (this.f9254a.m5854b() - h) - this.f9254a.m5852a(view);
            this.f9256c = this.f9254a.m5854b() - h;
            if (h > 0) {
                b = this.f9254a.m5855b(view);
                int i2 = this.f9256c;
                int f = this.f9254a.m5862f();
                b = (i2 - b) - (Math.min(this.f9254a.m5859d(view) - f, 0) + f);
                if (b < 0) {
                    this.f9256c = Math.min(h, -b) + this.f9256c;
                    return;
                }
                return;
            }
            return;
        }
        b = this.f9254a.m5859d(view);
        i2 = b - this.f9254a.m5862f();
        this.f9256c = b;
        if (i2 > 0) {
            f = this.f9254a.m5855b(view);
            int b2 = this.f9254a.m5854b();
            h = (this.f9254a.m5854b() - Math.min(0, (b2 - h) - this.f9254a.m5852a(view))) - (b + f);
            if (h < 0) {
                this.f9256c -= Math.min(i2, -h);
            }
        }
    }

    /* renamed from: b */
    final void m5831b() {
        this.f9255b = -1;
        this.f9256c = kvl.UNSET_ENUM_VALUE;
        this.f9257d = false;
        this.f9258e = false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnchorInfo{mPosition=");
        stringBuilder.append(this.f9255b);
        stringBuilder.append(", mCoordinate=");
        stringBuilder.append(this.f9256c);
        stringBuilder.append(", mLayoutFromEnd=");
        stringBuilder.append(this.f9257d);
        stringBuilder.append(", mValid=");
        stringBuilder.append(this.f9258e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
