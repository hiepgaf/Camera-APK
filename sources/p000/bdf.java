package p000;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: bdf */
public final class bdf {
    /* renamed from: a */
    private static final byte[] f1082a = new byte[]{(byte) 33, (byte) -1, (byte) 11, (byte) 88, (byte) 77, (byte) 80, (byte) 32, (byte) 68, (byte) 97, (byte) 116, (byte) 97, (byte) 88, (byte) 77, (byte) 80};

    /* renamed from: a */
    public static void m800a(byte[] bArr, OutputStream outputStream, wd wdVar) {
        xk xkVar = new xk();
        xkVar.m14528f();
        try {
            byte[] a = we.m6121a(wdVar, xkVar);
            try {
                outputStream.write(bArr, 0, bArr.length - 1);
                outputStream.write(f1082a);
                outputStream.write(a);
                a = new byte[258];
                a[0] = (byte) 1;
                for (int i = 0; i < 256; i++) {
                    a[i + 1] = (byte) (255 - i);
                }
                a[257] = (byte) 0;
                outputStream.write(a);
                outputStream.write(59);
            } finally {
                outputStream.close();
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static void m801b(byte[] bArr, OutputStream outputStream, wd wdVar) {
        ern.m2042a(new ByteArrayInputStream(bArr), outputStream, wdVar);
    }
}
