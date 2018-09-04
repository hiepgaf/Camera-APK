package p000;

import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* renamed from: aoa */
public final class aoa implements adr {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo94a(Object obj, File file, adp adp) {
        return aoa.m14675a((agn) obj, file);
    }

    /* renamed from: a */
    private static boolean m14675a(agn agn, File file) {
        try {
            arg.m623a(((any) agn.mo55b()).m6868a(), file);
            return true;
        } catch (Throwable e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    /* renamed from: a */
    public final adh mo2592a(adp adp) {
        return adh.SOURCE;
    }
}
