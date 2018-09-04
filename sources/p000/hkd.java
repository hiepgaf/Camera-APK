package p000;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hkd */
public final class hkd {
    /* renamed from: a */
    public static String m3220a(long j) {
        long toMinutes = TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j));
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j));
        if (TimeUnit.MILLISECONDS.toHours(j) > 0) {
            return String.format("%02d:%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(toMinutes), Long.valueOf(toSeconds)});
        }
        return String.format("%02d:%02d", new Object[]{Long.valueOf(toMinutes), Long.valueOf(toSeconds)});
    }
}
