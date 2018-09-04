package p000;

import android.os.Looper;

/* renamed from: hvc */
public final class hvc {
    /* renamed from: a */
    public hzv f6712a;
    /* renamed from: b */
    private Looper f6713b;

    /* renamed from: a */
    public final hvb m3499a() {
        if (this.f6712a == null) {
            this.f6712a = new hzv();
        }
        if (this.f6713b == null) {
            if (Looper.myLooper() == null) {
                this.f6713b = Looper.getMainLooper();
            } else {
                this.f6713b = Looper.myLooper();
            }
        }
        return new hvb(this.f6712a, this.f6713b);
    }
}
