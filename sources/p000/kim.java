package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: kim */
public final class kim implements DataInput {
    /* renamed from: a */
    private final DataInput f8315a;

    public kim(ByteArrayInputStream byteArrayInputStream) {
        this.f8315a = new DataInputStream(byteArrayInputStream);
    }

    public final boolean readBoolean() {
        try {
            return this.f8315a.readBoolean();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final byte readByte() {
        try {
            return this.f8315a.readByte();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final char readChar() {
        try {
            return this.f8315a.readChar();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final double readDouble() {
        try {
            return this.f8315a.readDouble();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final float readFloat() {
        try {
            return this.f8315a.readFloat();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final void readFully(byte[] bArr) {
        try {
            this.f8315a.readFully(bArr);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        try {
            this.f8315a.readFully(bArr, i, i2);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final int readInt() {
        try {
            return this.f8315a.readInt();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final String readLine() {
        try {
            return this.f8315a.readLine();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final long readLong() {
        try {
            return this.f8315a.readLong();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final short readShort() {
        try {
            return this.f8315a.readShort();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final String readUTF() {
        try {
            return this.f8315a.readUTF();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final int readUnsignedByte() {
        try {
            return this.f8315a.readUnsignedByte();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final int readUnsignedShort() {
        try {
            return this.f8315a.readUnsignedShort();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final int skipBytes(int i) {
        try {
            return this.f8315a.skipBytes(i);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
