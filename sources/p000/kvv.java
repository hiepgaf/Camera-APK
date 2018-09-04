package p000;

/* compiled from: PG */
/* renamed from: kvv */
final class kvv implements Runnable {
    /* renamed from: a */
    private kvt f8712a;
    /* renamed from: b */
    private int f8713b;
    /* renamed from: c */
    private int f8714c;
    /* renamed from: d */
    private final /* synthetic */ kvr f8715d;

    kvv(kvr kvr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f8715d = kvr;
        kvr.f8676c = go.ci;
        this.f8712a = new kvt(kvr.f8680g);
        kvr.f8675b.getValues(kvr.f8679f);
        float[] fArr = kvr.f8679f;
        int i7 = (int) fArr[2];
        int i8 = (int) fArr[5];
        float d = kvr.m5471d();
        int i9 = kvr.f8682i;
        if (d <= ((float) i9)) {
            i3 = i7;
            i4 = i7;
        } else {
            i4 = i9 - ((int) kvr.m5471d());
            i3 = 0;
        }
        d = kvr.m5470c();
        i9 = kvr.f8683j;
        if (d <= ((float) i9)) {
            i5 = i8;
            i6 = i8;
        } else {
            i6 = i9 - ((int) kvr.m5470c());
            i5 = 0;
        }
        this.f8712a.f8701a.fling(i7, i8, i, i2, i4, i3, i6, i5);
        this.f8713b = i7;
        this.f8714c = i8;
    }

    /* renamed from: a */
    public final void m5473a() {
        if (this.f8712a != null) {
            this.f8715d.f8676c = go.cf;
            this.f8712a.f8701a.forceFinished(true);
        }
    }

    public final void run() {
        if (this.f8712a.f8701a.isFinished()) {
            this.f8712a = null;
            return;
        }
        kvt kvt = this.f8712a;
        kvt.f8701a.computeScrollOffset();
        if (kvt.f8701a.computeScrollOffset()) {
            int currX = this.f8712a.f8701a.getCurrX();
            int currY = this.f8712a.f8701a.getCurrY();
            int i = this.f8713b;
            int i2 = this.f8714c;
            this.f8713b = currX;
            this.f8714c = currY;
            this.f8715d.f8675b.postTranslate((float) (currX - i), (float) (currY - i2));
            this.f8715d.m5469b();
            kvr kvr = this.f8715d;
            kvr.setImageMatrix(kvr.f8675b);
            this.f8715d.postOnAnimation(this);
        }
    }
}
