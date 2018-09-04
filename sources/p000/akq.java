package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: akq */
public final class akq implements adi {
    /* renamed from: a */
    private final agu f9861a;

    public akq(agu agu) {
        this.f9861a = agu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo94a(Object obj, File file, adp adp) {
        return m6569a((InputStream) obj, file);
    }

    /* renamed from: a */
    private final boolean m6569a(InputStream inputStream, File file) {
        OutputStream outputStream;
        Throwable th;
        Throwable e;
        OutputStream outputStream2;
        OutputStream outputStream3;
        Object obj = (byte[]) this.f9861a.m258a(65536, byte[].class);
        try {
            OutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(obj);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(obj, 0, read);
                } catch (Throwable e2) {
                    outputStream = fileOutputStream;
                    th = e2;
                    outputStream2 = outputStream;
                } catch (Throwable th2) {
                    e2 = th2;
                    outputStream3 = fileOutputStream;
                }
            }
            fileOutputStream.close();
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
            }
            this.f9861a.m262a(obj);
            return true;
        } catch (Throwable e22) {
            th = e22;
            outputStream2 = null;
            try {
                if (Log.isLoggable("StreamEncoder", 3)) {
                    Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", th);
                }
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e4) {
                    }
                }
                this.f9861a.m262a(obj);
                return false;
            } catch (Throwable th22) {
                outputStream = outputStream2;
                e22 = th22;
                outputStream3 = outputStream;
                if (outputStream3 != null) {
                    try {
                        outputStream3.close();
                    } catch (IOException e5) {
                    }
                }
                this.f9861a.m262a(obj);
                throw e22;
            }
        } catch (Throwable th222) {
            e22 = th222;
            outputStream3 = null;
            if (outputStream3 != null) {
                outputStream3.close();
            }
            this.f9861a.m262a(obj);
            throw e22;
        }
    }
}
