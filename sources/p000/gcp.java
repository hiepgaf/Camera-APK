package p000;

import android.util.ArraySet;
import com.google.googlex.gcam.GcamSwigLoader;
import com.google.googlex.gcam.GoudaSwigWrapper;
import com.google.googlex.gcam.JniUtilsJniLoader;
import com.google.googlex.gcam.image.ImageJniLoader;
import com.google.googlex.gcam.imageproc.ImageProcJniLoader;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: gcp */
public final class gcp {
    static {
        GcamSwigLoader.initialize();
        JniUtilsJniLoader.initialize();
        ImageJniLoader.initialize();
        ImageProcJniLoader.initialize();
    }

    /* renamed from: a */
    public static gds m2484a(gcv gcv) {
        return gcv;
    }

    /* renamed from: a */
    public static Executor m2485a(ikd ikd) {
        return new ikh(ikd, Executors.newSingleThreadExecutor(iel.m3721c("GoudaProc", 0)));
    }

    /* renamed from: a */
    public static fov m2483a() {
        return new fov(1);
    }

    /* renamed from: b */
    public static GoudaSwigWrapper m2486b() {
        return new GoudaSwigWrapper();
    }

    /* renamed from: c */
    public static Set m2487c() {
        Set arraySet = new ArraySet();
        arraySet.add(gdp.f5093c);
        arraySet.add(gdp.f5091a);
        arraySet.add(gdp.f5092b);
        arraySet.add(gdp.f5094d);
        arraySet.add(gdp.f5095e);
        return arraySet;
    }
}
