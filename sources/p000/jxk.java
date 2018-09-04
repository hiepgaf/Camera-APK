package p000;

import android.graphics.RectF;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jxk */
final class jxk extends jxi {
    public jxk(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2060a(DataInputStream dataInputStream) {
        return new RectF(dataInputStream.readFloat(), dataInputStream.readFloat(), dataInputStream.readFloat(), dataInputStream.readFloat());
    }

    /* renamed from: a */
    public final void mo2061a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof RectF) {
            RectF rectF = (RectF) obj;
            dataOutputStream.writeFloat(rectF.left);
            dataOutputStream.writeFloat(rectF.top);
            dataOutputStream.writeFloat(rectF.right);
            dataOutputStream.writeFloat(rectF.bottom);
            return;
        }
        throw new IOException("Incorrect type for serialization");
    }
}
