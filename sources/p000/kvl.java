package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kvl */
public abstract class kvl {
    public static final int UNSET_ENUM_VALUE = Integer.MIN_VALUE;
    public volatile int cachedSize = -1;

    public abstract kvl mergeFrom(kvc kvc);

    public kvl clone() {
        return (kvl) super.clone();
    }

    public static final kvl cloneUsingSerialization(kvl kvl) {
        try {
            return kvl.mergeFrom((kvl) kvl.getClass().getConstructor(new Class[0]).newInstance(new Object[0]), kvl.toByteArray(kvl));
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (Throwable e2) {
            throw new IllegalStateException(e2);
        } catch (Throwable e22) {
            throw new IllegalStateException(e22);
        } catch (Throwable e222) {
            throw new IllegalStateException(e222);
        } catch (Throwable e2222) {
            throw new IllegalStateException(e2222);
        }
    }

    public int computeSerializedSize() {
        return 0;
    }

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int computeSerializedSize = computeSerializedSize();
        this.cachedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public static final kvl mergeFrom(kvl kvl, byte[] bArr) {
        return kvl.mergeFrom(kvl, bArr, 0, bArr.length);
    }

    public static final kvl mergeFrom(kvl kvl, byte[] bArr, int i, int i2) {
        try {
            kvc a = kvc.m5393a(bArr, i, i2);
            kvl.mergeFrom(a);
            a.m5398a(0);
            return kvl;
        } catch (kvk e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final boolean messageNanoEquals(kvl kvl, kvl kvl2) {
        if (kvl == kvl2) {
            return true;
        }
        if (kvl == null || kvl2 == null || kvl.getClass() != kvl2.getClass()) {
            return false;
        }
        int serializedSize = kvl.getSerializedSize();
        if (kvl2.getSerializedSize() != serializedSize) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        kvl.toByteArray(kvl, bArr, 0, serializedSize);
        kvl.toByteArray(kvl2, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final byte[] toByteArray(kvl kvl) {
        byte[] bArr = new byte[kvl.getSerializedSize()];
        kvl.toByteArray(kvl, bArr, 0, bArr.length);
        return bArr;
    }

    public static final void toByteArray(kvl kvl, byte[] bArr, int i, int i2) {
        try {
            kvd a = kvd.m5421a(bArr, i, i2);
            kvl.writeTo(a);
            if (a.f8643a.remaining() != 0) {
                throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(a.f8643a.remaining())}));
            }
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return ktm.m13966a(this);
    }

    public void writeTo(kvd kvd) {
    }
}
