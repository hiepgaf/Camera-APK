package p000;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: iqx */
public final class iqx {
    /* renamed from: a */
    private final long f7339a = TimeUnit.NANOSECONDS.convert(3000, TimeUnit.MILLISECONDS);
    /* renamed from: b */
    private final iqz f7340b;
    /* renamed from: c */
    private final String f7341c;
    /* renamed from: d */
    private long f7342d;
    /* renamed from: e */
    private int f7343e;
    /* renamed from: f */
    private int f7344f;

    public iqx(iqz iqz, String str) {
        this.f7340b = iqz;
        this.f7341c = str;
    }

    /* renamed from: a */
    public final synchronized void m4059a() {
        this.f7343e++;
        this.f7344f++;
        long nanoTime = System.nanoTime();
        long j = this.f7342d;
        nanoTime -= j;
        if (j == 0) {
            this.f7343e = 0;
            this.f7342d = System.nanoTime();
        } else if (nanoTime >= this.f7339a) {
            iqz iqz = this.f7340b;
            String str = this.f7341c;
            int i = this.f7343e;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 37);
            stringBuilder.append(str);
            stringBuilder.append(" per second: ");
            stringBuilder.append(((double) i) / (((double) nanoTime) / 1.0E9d));
            iqz.mo514b(stringBuilder.toString());
            this.f7343e = 0;
            this.f7342d = System.nanoTime();
        }
    }
}
