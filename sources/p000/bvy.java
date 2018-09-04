package p000;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bvy */
public final class bvy implements bvs {
    /* renamed from: a */
    private final kwk f11357a;

    public bvy(kwk kwk) {
        this.f11357a = kwk;
    }

    /* renamed from: a */
    public final ByteArrayOutputStream mo592a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f11357a.mo345a();
        Buffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(array.length);
            dataOutputStream.writeInt(bitmap.getWidth());
            dataOutputStream.writeInt(bitmap.getHeight());
            dataOutputStream.writeUTF(bitmap.getConfig().toString());
            dataOutputStream.write(array);
            dataOutputStream.close();
            return byteArrayOutputStream;
        } catch (Throwable e) {
            throw new IOException("Could not write into ByteArrayOutputStream", e);
        } catch (Throwable th) {
            dataOutputStream.close();
        }
    }
}
