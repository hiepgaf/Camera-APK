package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* compiled from: PG */
/* renamed from: kvd */
public final class kvd {
    /* renamed from: a */
    public final ByteBuffer f8643a;

    private kvd(ByteBuffer byteBuffer) {
        this.f8643a = byteBuffer;
        this.f8643a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private kvd(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m5415a(int i, int i2) {
        return kvd.m5423b(i << 3) + kvd.m5414a(i2);
    }

    /* renamed from: a */
    public static int m5414a(int i) {
        return i >= 0 ? kvd.m5423b(i) : 10;
    }

    /* renamed from: a */
    public static int m5416a(int i, long j) {
        return kvd.m5423b(i << 3) + kvd.m5419a(j);
    }

    /* renamed from: a */
    public static int m5418a(int i, kvl kvl) {
        int b = kvd.m5423b(i << 3);
        int serializedSize = kvl.getSerializedSize();
        return b + (serializedSize + kvd.m5423b(serializedSize));
    }

    /* renamed from: b */
    public static int m5423b(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (-268435456 & i) == 0 ? 4 : 5;
    }

    /* renamed from: a */
    public static int m5419a(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    /* renamed from: a */
    public static int m5417a(int i, String str) {
        int b = kvd.m5423b(i << 3);
        int a = kvd.m5420a((CharSequence) str);
        return b + (a + kvd.m5423b(a));
    }

    /* renamed from: b */
    public static int m5424b(long j) {
        return kvd.m5423b(8) + kvd.m5419a(j);
    }

    /* renamed from: a */
    private static void m5422a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i = 0;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                int i2;
                byte[] array = byteBuffer.array();
                r2 = byteBuffer.position() + byteBuffer.arrayOffset();
                r1 = byteBuffer.remaining();
                int length = charSequence.length();
                int i3 = r2 + r1;
                r1 = 0;
                while (r1 < length) {
                    i = r1 + r2;
                    if (i >= i3) {
                        break;
                    }
                    r3 = charSequence.charAt(r1);
                    if (r3 >= '') {
                        break;
                    }
                    array[i] = (byte) r3;
                    r1++;
                }
                if (r1 == length) {
                    i2 = r2 + length;
                } else {
                    i2 = r2 + r1;
                    while (r1 < length) {
                        char charAt = charSequence.charAt(r1);
                        if (charAt < '' && i2 < i3) {
                            i = i2 + 1;
                            array[i2] = (byte) charAt;
                        } else if (charAt >= 'ࠀ' || i2 > i3 - 2) {
                            int i4;
                            StringBuilder stringBuilder;
                            if (charAt >= '?') {
                                if (charAt > '?') {
                                }
                                if (i2 > i3 - 4) {
                                    r2 = r1 + 1;
                                    if (r2 == charSequence.length()) {
                                        r0 = charSequence.charAt(r2);
                                        if (!Character.isSurrogatePair(charAt, r0)) {
                                            r1 = Character.toCodePoint(charAt, r0);
                                            i = i2 + 1;
                                            array[i2] = (byte) ((r1 >>> 18) | 240);
                                            i2 = i + 1;
                                            array[i] = (byte) (((r1 >>> 12) & 63) | 128);
                                            i4 = i2 + 1;
                                            array[i2] = (byte) (((r1 >>> 6) & 63) | 128);
                                            i = i4 + 1;
                                            array[i4] = (byte) ((r1 & 63) | 128);
                                            r1 = r2;
                                        }
                                    } else {
                                        r2 = r1;
                                    }
                                    stringBuilder = new StringBuilder(39);
                                    stringBuilder.append("Unpaired surrogate at index ");
                                    stringBuilder.append(r2 - 1);
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                }
                                stringBuilder = new StringBuilder(37);
                                stringBuilder.append("Failed writing ");
                                stringBuilder.append(charAt);
                                stringBuilder.append(" at index ");
                                stringBuilder.append(i2);
                                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                            }
                            if (i2 <= i3 - 3) {
                                i = i2 + 1;
                                array[i2] = (byte) ((charAt >>> 12) | 480);
                                r2 = i + 1;
                                array[i] = (byte) (((charAt >>> 6) & 63) | 128);
                                i = r2 + 1;
                                array[r2] = (byte) ((charAt & 63) | 128);
                            }
                            if (i2 > i3 - 4) {
                                stringBuilder = new StringBuilder(37);
                                stringBuilder.append("Failed writing ");
                                stringBuilder.append(charAt);
                                stringBuilder.append(" at index ");
                                stringBuilder.append(i2);
                                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                            }
                            r2 = r1 + 1;
                            if (r2 == charSequence.length()) {
                                r2 = r1;
                            } else {
                                r0 = charSequence.charAt(r2);
                                if (!Character.isSurrogatePair(charAt, r0)) {
                                    r1 = Character.toCodePoint(charAt, r0);
                                    i = i2 + 1;
                                    array[i2] = (byte) ((r1 >>> 18) | 240);
                                    i2 = i + 1;
                                    array[i] = (byte) (((r1 >>> 12) & 63) | 128);
                                    i4 = i2 + 1;
                                    array[i2] = (byte) (((r1 >>> 6) & 63) | 128);
                                    i = i4 + 1;
                                    array[i4] = (byte) ((r1 & 63) | 128);
                                    r1 = r2;
                                }
                            }
                            stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(r2 - 1);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else {
                            r2 = i2 + 1;
                            array[i2] = (byte) ((charAt >>> 6) | 960);
                            i = r2 + 1;
                            array[r2] = (byte) ((charAt & 63) | 128);
                        }
                        r1++;
                        i2 = i;
                    }
                }
                byteBuffer.position(i2 - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            r2 = charSequence.length();
            while (i < r2) {
                r3 = charSequence.charAt(i);
                if (r3 < '') {
                    byteBuffer.put((byte) r3);
                } else if (r3 < 'ࠀ') {
                    byteBuffer.put((byte) ((r3 >>> 6) | 960));
                    byteBuffer.put((byte) ((r3 & 63) | 128));
                } else if (r3 < '?' || r3 > '?') {
                    byteBuffer.put((byte) ((r3 >>> 12) | 480));
                    byteBuffer.put((byte) (((r3 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((r3 & 63) | 128));
                } else {
                    r1 = i + 1;
                    if (r1 != charSequence.length()) {
                        r0 = charSequence.charAt(r1);
                        if (Character.isSurrogatePair(r3, r0)) {
                            i = Character.toCodePoint(r3, r0);
                            byteBuffer.put((byte) ((i >>> 18) | 240));
                            byteBuffer.put((byte) (((i >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((i >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((i & 63) | 128));
                            i = r1;
                        }
                    } else {
                        r1 = i;
                    }
                    StringBuilder stringBuilder2 = new StringBuilder(39);
                    stringBuilder2.append("Unpaired surrogate at index ");
                    stringBuilder2.append(r1 - 1);
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private static int m5420a(CharSequence charSequence) {
        int i;
        int i2 = 0;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length) {
            if (charSequence.charAt(i3) >= '') {
                i = length;
                break;
            }
            i3++;
        }
        i = length;
        while (i3 < length) {
            StringBuilder stringBuilder;
            char charAt = charSequence.charAt(i3);
            if (charAt < 'ࠀ') {
                i += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 'ࠀ') {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (charAt2 >= '?' && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                stringBuilder = new StringBuilder(39);
                                stringBuilder.append("Unpaired surrogate at index ");
                                stringBuilder.append(i3);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i2 += i;
                if (i2 < length) {
                    return i2;
                }
                stringBuilder = new StringBuilder(54);
                stringBuilder.append("UTF-8 length does not fit in int: ");
                stringBuilder.append(((long) i2) + 4294967296L);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        i2 = i;
        if (i2 < length) {
            return i2;
        }
        stringBuilder = new StringBuilder(54);
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(((long) i2) + 4294967296L);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static kvd m5421a(byte[] bArr, int i, int i2) {
        return new kvd(bArr, i, i2);
    }

    /* renamed from: a */
    public final void m5429a(int i, boolean z) {
        m5436c(i, 0);
        if (this.f8643a.hasRemaining()) {
            this.f8643a.put(z);
            return;
        }
        throw new kve(this.f8643a.position(), this.f8643a.limit());
    }

    /* renamed from: a */
    public final void m5428a(int i, float f) {
        m5436c(i, 5);
        m5427a(f);
    }

    /* renamed from: a */
    public final void m5427a(float f) {
        m5438d(Float.floatToIntBits(f));
    }

    /* renamed from: b */
    public final void m5431b(int i, int i2) {
        m5436c(i, 0);
        m5435c(i2);
    }

    /* renamed from: c */
    public final void m5435c(int i) {
        if (i >= 0) {
            m5439e(i);
        } else {
            m5425d((long) i);
        }
    }

    /* renamed from: b */
    public final void m5432b(int i, long j) {
        m5436c(i, 0);
        m5425d(j);
    }

    /* renamed from: b */
    public final void m5434b(int i, kvl kvl) {
        m5436c(i, 2);
        m5439e(kvl.getCachedSize());
        kvl.writeTo(this);
    }

    /* renamed from: f */
    private final void m5426f(int i) {
        byte b = (byte) i;
        if (this.f8643a.hasRemaining()) {
            this.f8643a.put(b);
            return;
        }
        throw new kve(this.f8643a.position(), this.f8643a.limit());
    }

    /* renamed from: a */
    public final void m5430a(byte[] bArr) {
        int length = bArr.length;
        if (this.f8643a.remaining() >= length) {
            this.f8643a.put(bArr, 0, length);
            return;
        }
        throw new kve(this.f8643a.position(), this.f8643a.limit());
    }

    /* renamed from: d */
    public final void m5438d(int i) {
        if (this.f8643a.remaining() < 4) {
            throw new kve(this.f8643a.position(), this.f8643a.limit());
        }
        this.f8643a.putInt(i);
    }

    /* renamed from: e */
    public final void m5439e(int i) {
        while ((i & -128) != 0) {
            m5426f((i & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
            i >>>= 7;
        }
        m5426f(i);
    }

    /* renamed from: d */
    private final void m5425d(long j) {
        while ((-128 & j) != 0) {
            m5426f((((int) j) & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
            j >>>= 7;
        }
        m5426f((int) j);
    }

    /* renamed from: b */
    public final void m5433b(int i, String str) {
        m5436c(i, 2);
        try {
            int b = kvd.m5423b(str.length());
            if (b == kvd.m5423b(str.length() * 3)) {
                int position = this.f8643a.position();
                if (this.f8643a.remaining() < b) {
                    throw new kve(b + position, this.f8643a.limit());
                }
                this.f8643a.position(position + b);
                kvd.m5422a((CharSequence) str, this.f8643a);
                int position2 = this.f8643a.position();
                this.f8643a.position(position);
                m5439e((position2 - position) - b);
                this.f8643a.position(position2);
                return;
            }
            m5439e(kvd.m5420a((CharSequence) str));
            kvd.m5422a((CharSequence) str, this.f8643a);
        } catch (Throwable e) {
            kve kve = new kve(this.f8643a.position(), this.f8643a.limit());
            kve.initCause(e);
            throw kve;
        }
    }

    /* renamed from: c */
    public final void m5436c(int i, int i2) {
        m5439e((i << 3) | i2);
    }

    /* renamed from: c */
    public final void m5437c(long j) {
        m5436c(1, 0);
        m5425d(j);
    }
}
