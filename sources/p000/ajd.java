package p000;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ajd */
final class ajd implements adw {
    /* renamed from: a */
    private final String f9823a;
    /* renamed from: b */
    private final ajc f9824b;
    /* renamed from: c */
    private Object f9825c;

    ajd(String str, ajc ajc) {
        this.f9823a = str;
        this.f9824b = ajc;
    }

    /* renamed from: b */
    public final void mo25b() {
    }

    /* renamed from: c */
    public final void mo26c() {
        try {
            ((InputStream) this.f9825c).close();
        } catch (IOException e) {
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
            String str = this.f9823a;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                } else if (str.substring(0, indexOf).endsWith(";base64")) {
                    this.f9825c = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    adx.mo37a(this.f9825c);
                    return;
                } else {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
            }
            throw new IllegalArgumentException("Not a valid image data URL.");
        } catch (Exception e) {
            adx.mo36a(e);
        }
    }
}
