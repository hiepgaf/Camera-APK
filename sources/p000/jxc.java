package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jxc */
final class jxc extends jxi {
    public jxc(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2060a(DataInputStream dataInputStream) {
        return Boolean.valueOf(dataInputStream.readBoolean());
    }

    /* renamed from: a */
    public final void mo2061a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof Boolean) {
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        throw new IOException("Incorrect type for serialization");
    }
}
