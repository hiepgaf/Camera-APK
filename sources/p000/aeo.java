package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: aeo */
public final class aeo implements adw {
    /* renamed from: a */
    private final Uri f9652a;
    /* renamed from: b */
    private final aes f9653b;
    /* renamed from: c */
    private InputStream f9654c;

    private aeo(Uri uri, aes aes) {
        this.f9652a = uri;
        this.f9653b = aes;
    }

    /* renamed from: a */
    public static aeo m6335a(Context context, Uri uri, aer aer) {
        return new aeo(uri, new aes(acc.m98a(context).f190d.m111a(), aer, acc.m98a(context).f191e, context.getContentResolver(), (byte) 0));
    }

    /* renamed from: b */
    public final void mo25b() {
    }

    /* renamed from: c */
    public final void mo26c() {
        InputStream inputStream = this.f9654c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final Class mo33a() {
        return InputStream.class;
    }

    /* renamed from: d */
    public final adf mo27d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo24a(acg acg, adx adx) {
        try {
            int a;
            InputStream aed;
            InputStream b = this.f9653b.m195b(this.f9652a);
            if (b != null) {
                a = this.f9653b.m194a(this.f9652a);
            } else {
                a = -1;
            }
            if (a != -1) {
                aed = new aed(b, a);
            } else {
                aed = b;
            }
            this.f9654c = aed;
            adx.mo37a(this.f9654c);
        } catch (Exception e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            adx.mo36a(e);
        }
    }
}
