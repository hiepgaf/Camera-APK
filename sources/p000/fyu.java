package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fyu */
public final class fyu {
    /* renamed from: a */
    public static final String f4829a = bli.m862a("CamTimeWaiter");

    /* renamed from: a */
    public static boolean m2422a(long j, fim fim, fip fip) {
        Object fyv = new fyv(j);
        new fio(fim).m2307a(fds.m10251c(fyv));
        fip.mo1381a(Arrays.asList(new fim[]{r1.m2301a()}), fiv.REPEATING);
        try {
            return ((Boolean) fyv.f16651a.get()).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
