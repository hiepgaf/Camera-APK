package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jxl */
final class jxl extends jxi {
    public jxl(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2060a(DataInputStream dataInputStream) {
        return jzp.m4713a(dataInputStream.readInt(), dataInputStream.readInt());
    }

    /* renamed from: a */
    public final void mo2061a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof jzp) {
            jzp jzp = (jzp) obj;
            dataOutputStream.writeInt(jzp.f8149a);
            dataOutputStream.writeInt(jzp.f8150b);
            return;
        }
        throw new IOException("Incorrect type for serialization");
    }
}
