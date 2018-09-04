package p000;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ftz */
public final class ftz implements fts {
    /* renamed from: a */
    private static final ken f16524a = ken.m13455a(Integer.valueOf(37), Integer.valueOf(38), Integer.valueOf(32));

    ftz() {
    }

    /* renamed from: a */
    public final void mo1423a(iwz iwz, OutputStream outputStream) {
        try {
            boolean contains = f16524a.contains(Integer.valueOf(iwz.mo2716c()));
            int c = iwz.mo2716c();
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("Unsupported ImageFormat: ");
            stringBuilder.append(c);
            jri.m13144a(contains, stringBuilder.toString());
            ByteBuffer a = ((ixa) iwz.mo2718e().get(0)).mo637a();
            byte[] bArr = new byte[a.capacity()];
            a.get(bArr);
            outputStream.write(bArr);
        } finally {
            iwz.close();
        }
    }
}
