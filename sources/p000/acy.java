package p000;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* renamed from: acy */
final class acy extends ByteArrayOutputStream {
    /* renamed from: a */
    private final /* synthetic */ acx f288a;

    acy(acx acx, int i) {
        this.f288a = acx;
        super(i);
    }

    public final String toString() {
        int i;
        if (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) {
            i = this.count;
        } else {
            i = this.count - 1;
        }
        try {
            return new String(this.buf, 0, i, this.f288a.f283a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
