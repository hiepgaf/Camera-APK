package p000;

import com.google.android.libraries.smartburst.filterpacks.motion.HomographyTransform;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jxh */
final class jxh extends jxi {
    public jxh(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2060a(DataInputStream dataInputStream) {
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = dataInputStream.readFloat();
        }
        return HomographyTransform.createHomographyTransform(fArr);
    }

    /* renamed from: a */
    public final void mo2061a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof HomographyTransform) {
            float[] toArray = ((HomographyTransform) obj).toArray();
            for (int i = 0; i < 9; i++) {
                dataOutputStream.writeFloat(toArray[i]);
            }
            return;
        }
        throw new IOException("Incorrect type for serialization");
    }
}
