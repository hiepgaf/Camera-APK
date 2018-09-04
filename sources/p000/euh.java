package p000;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Set;

/* compiled from: PG */
/* renamed from: euh */
public final class euh {
    /* renamed from: a */
    public static boolean m2131a(bmb bmb, etg etg) {
        if (euh.m2133b(bmb, etg) || bmb.m885c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Handler m2126a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    /* renamed from: b */
    public static boolean m2133b(bmb bmb, etg etg) {
        return bmb.m886d() && etg.f4217a;
    }

    /* renamed from: a */
    public static Set m2128a(Integer num, kwk kwk, bmb bmb, etg etg, ird ird) {
        if (!bmb.m886d() || !etg.f4217a || num.intValue() >= 0) {
            return kgn.f22045a;
        }
        try {
            ird.mo1903a("MICRO_GyroModule#provideRequestTransformer");
            Set a = keu.m13472a(fds.m10239a(ken.m13453a((fiw) kwk.mo345a())));
            return a;
        } finally {
            ird.mo1904b();
        }
    }

    /* renamed from: b */
    public static Set m2132b(Integer num, kwk kwk, bmb bmb, etg etg, ird ird) {
        if (!bmb.m886d() || !etg.f4217a || num.intValue() < 0) {
            return kgn.f22045a;
        }
        try {
            ird.mo1903a("MICRO_GyroModule#provideRequestListener");
            Set a = keu.m13472a((fiw) kwk.mo345a());
            return a;
        } finally {
            ird.mo1904b();
        }
    }

    /* renamed from: a */
    public static Set m2127a(bmb bmb, kwk kwk, kwk kwk2, kwk kwk3, etg etg, ird ird) {
        try {
            Set a;
            ird.mo1903a("MICRO_EncoderModule#providesShutdownTasks");
            if (bmb.m886d()) {
                if (etg.f4217a) {
                    a = keu.m13472a(new ewa(ird, kwk2, kwk3, kwk));
                    ird.mo1904b();
                    return a;
                }
            }
            a = kgn.f22045a;
            return a;
        } finally {
            ird.mo1904b();
        }
    }

    /* renamed from: a */
    public static Set m2129a(kwk kwk, bmb bmb, etg etg, ird ird) {
        try {
            Set a;
            ird.mo1903a("MICRO_GyroModule#providesShutdownTasks");
            if (bmb.m886d()) {
                if (etg.f4217a) {
                    a = keu.m13472a(new ewm(ird, kwk));
                    ird.mo1904b();
                    return a;
                }
            }
            a = kgn.f22045a;
            return a;
        } finally {
            ird.mo1904b();
        }
    }

    /* renamed from: a */
    public static Set m2130a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, bmb bmb, etg etg, ird ird) {
        ezt.f4386a = bmb;
        try {
            Set a;
            ird.mo1903a("MICRO_EncoderModule#providesStartupTasks");
            if (bmb.m886d()) {
                if (etg.f4217a) {
                    a = keu.m13472a(new evz(ird, kwk3, kwk6, kwk, kwk2, kwk4, kwk5));
                    ird.mo1904b();
                    return a;
                }
            }
            a = kgn.f22045a;
            return a;
        } finally {
            ird.mo1904b();
        }
    }

    /* renamed from: a */
    public static long m2125a(long j) {
        return ((500000 + j) / 1000000) * 1000000;
    }
}
