package com.google.common.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import p000.jri;
import p000.khx;
import p000.kim;
import p000.kin;
import p000.kio;
import p000.kir;
import p000.kis;

/* compiled from: PG */
public final class ByteStreams {
    public static final int BUFFER_SIZE = 8192;
    public static final int MAX_ARRAY_LEN = 2147483639;
    public static final OutputStream NULL_OUTPUT_STREAM = new kir();
    public static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    public static final int ZERO_COPY_CHUNK_SIZE = 524288;

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Deque deque, int i) {
        Object obj = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr = (byte[]) deque.removeFirst();
            int min = Math.min(i2, bArr.length);
            System.arraycopy(bArr, 0, obj, i - i2, min);
            i2 -= min;
        }
        return obj;
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        jri.m13152b((Object) inputStream);
        jri.m13152b((Object) outputStream);
        byte[] createBuffer = createBuffer();
        long j = 0;
        while (true) {
            int read = inputStream.read(createBuffer);
            if (read == -1) {
                return j;
            }
            outputStream.write(createBuffer, 0, read);
            j += (long) read;
        }
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) {
        jri.m13152b((Object) readableByteChannel);
        jri.m13152b((Object) writableByteChannel);
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long position = fileChannel.position();
            long j = position;
            while (true) {
                long transferTo = fileChannel.transferTo(j, 524288, writableByteChannel);
                j += transferTo;
                fileChannel.position(j);
                if (transferTo <= 0 && j >= fileChannel.size()) {
                    return j - position;
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(createBuffer());
            long j2 = 0;
            while (readableByteChannel.read(wrap) != -1) {
                wrap.flip();
                while (wrap.hasRemaining()) {
                    j2 += (long) writableByteChannel.write(wrap);
                }
                wrap.clear();
            }
            return j2;
        }
    }

    static byte[] createBuffer() {
        return new byte[8192];
    }

    public static long exhaust(InputStream inputStream) {
        byte[] createBuffer = createBuffer();
        long j = 0;
        while (true) {
            long read = (long) inputStream.read(createBuffer);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public static InputStream limit(InputStream inputStream, long j) {
        return new kis(inputStream, j);
    }

    public static kim newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new kim((ByteArrayInputStream) jri.m13152b((Object) byteArrayInputStream));
    }

    public static kim newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    public static kim newDataInput(byte[] bArr, int i) {
        int length = bArr.length;
        jri.m13151b(i, length);
        return newDataInput(new ByteArrayInputStream(bArr, i, length - i));
    }

    public static kin newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static kin newDataOutput(int i) {
        if (i >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", new Object[]{Integer.valueOf(i)}));
    }

    public static kin newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new kin((ByteArrayOutputStream) jri.m13152b((Object) byteArrayOutputStream));
    }

    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) {
        jri.m13152b((Object) inputStream);
        jri.m13152b((Object) bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    public static Object readBytes(InputStream inputStream, kio kio) {
        jri.m13152b((Object) inputStream);
        jri.m13152b((Object) kio);
        byte[] createBuffer = createBuffer();
        while (inputStream.read(createBuffer) != -1) {
            if (!kio.m4958b()) {
                break;
            }
        }
        return kio.m4957a();
    }

    public static void readFully(InputStream inputStream, byte[] bArr) {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) {
        int read = read(inputStream, bArr, i, i2);
        if (read != i2) {
            StringBuilder stringBuilder = new StringBuilder(81);
            stringBuilder.append("reached end of stream after reading ");
            stringBuilder.append(read);
            stringBuilder.append(" bytes; ");
            stringBuilder.append(i2);
            stringBuilder.append(" bytes expected");
            throw new EOFException(stringBuilder.toString());
        }
    }

    public static void skipFully(InputStream inputStream, long j) {
        long skipUpTo = skipUpTo(inputStream, j);
        if (skipUpTo < j) {
            StringBuilder stringBuilder = new StringBuilder(100);
            stringBuilder.append("reached end of stream after skipping ");
            stringBuilder.append(skipUpTo);
            stringBuilder.append(" bytes; ");
            stringBuilder.append(j);
            stringBuilder.append(" bytes expected");
            throw new EOFException(stringBuilder.toString());
        }
    }

    private static long skipSafely(InputStream inputStream, long j) {
        int available = inputStream.available();
        return available != 0 ? inputStream.skip(Math.min((long) available, j)) : 0;
    }

    static long skipUpTo(InputStream inputStream, long j) {
        byte[] createBuffer = createBuffer();
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            long skipSafely = skipSafely(inputStream, j3);
            if (skipSafely == 0) {
                skipSafely = (long) inputStream.read(createBuffer, 0, (int) Math.min(j3, (long) createBuffer.length));
                if (skipSafely == -1) {
                    break;
                }
            }
            j2 = skipSafely + j2;
        }
        return j2;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        jri.m13152b((Object) inputStream);
        return toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] toByteArray(InputStream inputStream, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13147a(z, "expectedSize (%s) must be non-negative", j);
        if (j > 2147483639) {
            StringBuilder stringBuilder = new StringBuilder(62);
            stringBuilder.append(j);
            stringBuilder.append(" bytes is too large to fit in a byte array");
            throw new OutOfMemoryError(stringBuilder.toString());
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        if (inputStream.read() == -1) {
            return bArr;
        }
        Deque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i2});
        return toByteArrayInternal(inputStream, arrayDeque, bArr.length + 1);
    }

    private static byte[] toByteArrayInternal(InputStream inputStream, Deque deque, int i) {
        int i2 = 8192;
        int i3 = i;
        while (i3 < MAX_ARRAY_LEN) {
            Object obj = new byte[Math.min(i2, MAX_ARRAY_LEN - i3)];
            deque.add(obj);
            int i4 = 0;
            while (true) {
                int length = obj.length;
                if (i4 >= length) {
                    break;
                }
                length = inputStream.read(obj, i4, length - i4);
                if (length == -1) {
                    return combineBuffers(deque, i3);
                }
                i4 += length;
                i3 += length;
            }
            long j = (long) i2;
            i2 = khx.m4934a(j + j);
        }
        if (inputStream.read() == -1) {
            return combineBuffers(deque, MAX_ARRAY_LEN);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
