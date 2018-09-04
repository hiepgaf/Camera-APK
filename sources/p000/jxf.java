package p000;

import com.google.android.libraries.smartburst.utils.FloatArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jxf */
final class jxf extends jxi {
    public jxf(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2060a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        FloatArray floatArray = new FloatArray(readInt);
        for (int i = 0; i < readInt; i++) {
            floatArray.add(dataInputStream.readFloat());
        }
        return floatArray;
    }

    /* renamed from: a */
    public final void mo2061a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof FloatArray) {
            FloatArray floatArray = (FloatArray) obj;
            dataOutputStream.writeInt(floatArray.size());
            Iterator it = floatArray.iterator();
            while (it.hasNext()) {
                dataOutputStream.writeFloat(((Float) it.next()).floatValue());
            }
            return;
        }
        throw new IOException("Incorrect type for serialization");
    }
}
