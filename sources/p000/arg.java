package p000;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: arg */
public final class arg {
    static {
        AtomicReference atomicReference = new AtomicReference();
    }

    /* renamed from: a */
    public static ByteBuffer m622a(File file) {
        FileChannel channel;
        Throwable th;
        RandomAccessFile randomAccessFile = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            } else if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            } else {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile2.getChannel();
                    try {
                        ByteBuffer load = channel.map(MapMode.READ_ONLY, 0, length).load();
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException e) {
                            }
                        }
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e2) {
                        }
                        return load;
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = randomAccessFile2;
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException e3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException e4) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    channel = null;
                    randomAccessFile = randomAccessFile2;
                    if (channel != null) {
                        channel.close();
                    }
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th32) {
            th = th32;
            channel = null;
            if (channel != null) {
                channel.close();
            }
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m624a(ByteBuffer byteBuffer) {
        ari ari = null;
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            ari = new ari(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        if (ari != null && ari.f907a == 0 && ari.f908b == ari.f909c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: a */
    public static void m623a(ByteBuffer byteBuffer, File file) {
        Throwable th;
        FileChannel fileChannel;
        RandomAccessFile randomAccessFile = null;
        byteBuffer.position(0);
        try {
            FileChannel channel;
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile2.getChannel();
            } catch (Throwable th2) {
                RandomAccessFile randomAccessFile3 = randomAccessFile;
                randomAccessFile = randomAccessFile2;
                th = th2;
                Object obj = randomAccessFile3;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException e) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e2) {
                    }
                }
                throw th;
            }
            try {
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile2.close();
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException e3) {
                    }
                }
                try {
                    randomAccessFile2.close();
                } catch (IOException e4) {
                }
            } catch (Throwable th22) {
                FileChannel fileChannel2 = channel;
                randomAccessFile = randomAccessFile2;
                th = th22;
                fileChannel = fileChannel2;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th222) {
            th = th222;
            fileChannel = randomAccessFile;
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static InputStream m625b(ByteBuffer byteBuffer) {
        return new arh(byteBuffer);
    }
}
