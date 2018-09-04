package p000;

import android.util.Log;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: aiz */
final class aiz implements adw {
    /* renamed from: a */
    private final File f9821a;

    aiz(File file) {
        this.f9821a = file;
    }

    /* renamed from: b */
    public final void mo25b() {
    }

    /* renamed from: c */
    public final void mo26c() {
    }

    /* renamed from: a */
    public final Class mo33a() {
        return ByteBuffer.class;
    }

    /* renamed from: d */
    public final adf mo27d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo24a(acg acg, adx adx) {
        try {
            adx.mo37a(arg.m622a(this.f9821a));
        } catch (Exception e) {
            if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
            }
            adx.mo36a(e);
        }
    }
}
