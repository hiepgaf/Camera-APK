package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.Closeable;
import java.io.File;

/* compiled from: PG */
/* renamed from: jrc */
final class jrc implements izi {
    /* renamed from: a */
    private final /* synthetic */ long f18968a;
    /* renamed from: b */
    private final /* synthetic */ Bitmap f18969b;

    jrc(long j, Bitmap bitmap) {
        this.f18968a = j;
        this.f18969b = bitmap;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        Closeable a;
        Throwable th;
        File file = new File((File) obj, jxr.m4677a(this.f18968a));
        Object obj2 = this.f18969b;
        jri.m13152b((Object) file);
        jri.m13152b(obj2);
        try {
            a = jqk.m13077a(file);
            try {
                obj2.compress(CompressFormat.JPEG, 100, a);
                kit.m4964a(a, false);
                return jqk.m13088a(new jqz(file));
            } catch (Throwable th2) {
                th = th2;
                kit.m4964a(a, false);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            kit.m4964a(a, false);
            throw th;
        }
    }
}
