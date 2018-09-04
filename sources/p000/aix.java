package p000;

import android.util.Log;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: aix */
public final class aix implements adi {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo94a(Object obj, File file, adp adp) {
        return aix.m6504a((ByteBuffer) obj, file);
    }

    /* renamed from: a */
    private static boolean m6504a(ByteBuffer byteBuffer, File file) {
        try {
            arg.m623a(byteBuffer, file);
            return true;
        } catch (Throwable e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }
}
