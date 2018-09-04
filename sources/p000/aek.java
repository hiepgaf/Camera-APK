package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: aek */
public abstract class aek implements adw {
    /* renamed from: a */
    private final Uri f9649a;
    /* renamed from: b */
    private final ContentResolver f9650b;
    /* renamed from: c */
    private Object f9651c;

    public aek(ContentResolver contentResolver, Uri uri) {
        this.f9650b = contentResolver;
        this.f9649a = uri;
    }

    /* renamed from: a */
    protected abstract Object mo2584a(Uri uri, ContentResolver contentResolver);

    /* renamed from: a */
    protected abstract void mo2585a(Object obj);

    /* renamed from: b */
    public final void mo25b() {
    }

    /* renamed from: c */
    public final void mo26c() {
        Object obj = this.f9651c;
        if (obj != null) {
            try {
                mo2585a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: d */
    public final adf mo27d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo24a(acg acg, adx adx) {
        try {
            this.f9651c = mo2584a(this.f9649a, this.f9650b);
            adx.mo37a(this.f9651c);
        } catch (Exception e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            adx.mo36a(e);
        }
    }
}
