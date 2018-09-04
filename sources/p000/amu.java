package p000;

import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* renamed from: amu */
final class amu {
    /* renamed from: a */
    private static final File f539a = new File("/proc/self/fd");
    /* renamed from: d */
    private static volatile amu f540d;
    /* renamed from: b */
    private volatile int f541b;
    /* renamed from: c */
    private volatile boolean f542c = true;

    private amu() {
    }

    /* renamed from: a */
    static amu m356a() {
        if (f540d == null) {
            synchronized (amu.class) {
                if (f540d == null) {
                    f540d = new amu();
                }
            }
        }
        return f540d;
    }

    /* renamed from: b */
    final synchronized boolean m357b() {
        boolean z = false;
        synchronized (this) {
            int i = this.f541b + 1;
            this.f541b = i;
            if (i >= 50) {
                this.f541b = 0;
                i = f539a.list().length;
                if (i < 700) {
                    z = true;
                }
                this.f542c = z;
                if (!this.f542c && Log.isLoggable("Downsampler", 5)) {
                    StringBuilder stringBuilder = new StringBuilder(118);
                    stringBuilder.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                    stringBuilder.append(i);
                    stringBuilder.append(", limit ");
                    stringBuilder.append(700);
                    Log.w("Downsampler", stringBuilder.toString());
                }
            }
            z = this.f542c;
        }
        return z;
    }
}
