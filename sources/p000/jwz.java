package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* renamed from: jwz */
final class jwz extends ByteArrayOutputStream {
    /* renamed from: a */
    private final /* synthetic */ jwy f8043a;

    jwz(jwy jwy) {
        this.f8043a = jwy;
    }

    public final void close() {
        super.close();
        this.f8043a.f19095a.mo3557a(new ByteArrayInputStream(toByteArray()));
    }
}
