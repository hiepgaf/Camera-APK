package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: hzj */
public final class hzj {
    /* renamed from: a */
    public static final huh f6839a = new huh("Help.API", f6842d, f6841c);
    /* renamed from: b */
    public static final hzh f6840b = new hyn();
    /* renamed from: c */
    private static final hum f6841c = new hum((byte) 0);
    /* renamed from: d */
    private static final huk f6842d = new hzk();
    /* renamed from: e */
    private static final Executor f6843e = Executors.newSingleThreadExecutor();

    @TargetApi(11)
    /* renamed from: a */
    public static void m3592a(huq huq, hzn hzn) {
        new hzl(huq, hzn).executeOnExecutor(f6843e, new Void[0]);
    }
}
