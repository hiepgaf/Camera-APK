package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jxg */
final class jxg extends jxi {
    public jxg(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2060a(DataInputStream dataInputStream) {
        return Float.valueOf(dataInputStream.readFloat());
    }

    /* renamed from: a */
    public final void mo2061a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof Float) {
            dataOutputStream.writeFloat(((Float) obj).floatValue());
            return;
        }
        throw new IOException("Incorrect type for serialization");
    }
}
