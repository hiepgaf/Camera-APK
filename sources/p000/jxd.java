package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jxd */
final class jxd extends jxi {
    public jxd(String str) {
        super(str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo2060a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        List arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            ByteBuffer allocateDirect;
            int readInt2 = dataInputStream.readInt();
            if (dataInputStream.readBoolean()) {
                allocateDirect = ByteBuffer.allocateDirect(readInt2);
            } else {
                allocateDirect = ByteBuffer.allocate(readInt2);
            }
            for (int i2 = 0; i2 < readInt2; i2++) {
                allocateDirect.put(dataInputStream.readByte());
            }
            allocateDirect.rewind();
            arrayList.add(allocateDirect);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo2061a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof List) {
            List<ByteBuffer> list = (List) obj;
            if (list.size() <= 0 || (list.get(0) instanceof ByteBuffer)) {
                dataOutputStream.writeInt(list.size());
                for (ByteBuffer byteBuffer : list) {
                    byteBuffer.rewind();
                    dataOutputStream.writeInt(byteBuffer.remaining());
                    dataOutputStream.writeBoolean(byteBuffer.isDirect());
                    while (byteBuffer.hasRemaining()) {
                        dataOutputStream.writeByte(byteBuffer.get());
                    }
                }
                return;
            }
            throw new IOException("Incorrect type for serialization");
        }
        throw new IOException("Incorrect type for serialization");
    }
}
