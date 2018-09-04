package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jlg */
final class jlg {
    /* renamed from: a */
    public final DataInputStream f7911a;

    jlg(ByteArrayInputStream byteArrayInputStream) {
        this.f7911a = new DataInputStream(byteArrayInputStream);
    }

    /* renamed from: a */
    public final int m4535a(int i, int i2) {
        int readInt = this.f7911a.readInt();
        if (readInt >= i && readInt <= i2) {
            return readInt;
        }
        StringBuilder stringBuilder = new StringBuilder(92);
        stringBuilder.append("Unexpected value read from stream: ");
        stringBuilder.append(readInt);
        stringBuilder.append(" (must be between ");
        stringBuilder.append(i);
        stringBuilder.append(" and ");
        stringBuilder.append(i2);
        stringBuilder.append("!");
        throw new IOException(stringBuilder.toString());
    }
}
