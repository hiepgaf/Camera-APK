package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: ama */
public final class ama implements ImageHeaderParser {
    /* renamed from: a */
    private static final byte[] f9889a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    /* renamed from: b */
    private static final int[] f9890b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    private static int m6625a(amd amd, agu agu) {
        int i;
        int i2 = 1;
        short s = (short) 0;
        int i3 = -1;
        int b = amd.mo110b();
        if ((b & 65496) == 65496) {
            i = 1;
        } else if (b == 19789) {
            i = 1;
        } else if (b != 18761) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            long a;
            short c;
            StringBuilder stringBuilder;
            long j;
            do {
                short c2 = amd.mo111c();
                if (c2 == (short) 255) {
                    c = amd.mo111c();
                    if (c != (short) 218) {
                        if (c != (short) 217) {
                            i = amd.mo110b() - 2;
                            if (c == (short) 225) {
                                b = i;
                                break;
                            }
                            j = (long) i;
                            a = amd.mo109a(j);
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                            b = -1;
                        } else {
                            b = -1;
                        }
                    } else {
                        b = -1;
                        break;
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown segmentId=");
                    stringBuilder.append(c2);
                    Log.d("DfltImageHeaderParser", stringBuilder.toString());
                    b = -1;
                } else {
                    b = -1;
                }
            } while (a == j);
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder stringBuilder2 = new StringBuilder(113);
                stringBuilder2.append("Unable to skip enough data, type: ");
                stringBuilder2.append(c);
                stringBuilder2.append(", wanted to skip: ");
                stringBuilder2.append(i);
                stringBuilder2.append(", but actually skipped: ");
                stringBuilder2.append(a);
                Log.d("DfltImageHeaderParser", stringBuilder2.toString());
                b = -1;
            } else {
                b = -1;
            }
            if (b != -1) {
                Object obj = (byte[]) agu.m258a(b, byte[].class);
                try {
                    int a2 = amd.mo108a(obj, b);
                    if (a2 == b) {
                        if (obj == null) {
                            i2 = 0;
                        } else if (b <= f9889a.length) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            for (a2 = 0; a2 < f9889a.length; a2++) {
                                if (obj[a2] != f9889a[a2]) {
                                    i2 = 0;
                                    break;
                                }
                            }
                        }
                        if (i2 != 0) {
                            ByteOrder byteOrder;
                            amc amc = new amc(obj, b);
                            short a3 = amc.m332a(6);
                            switch (a3) {
                                case (short) 18761:
                                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                                    break;
                                case (short) 19789:
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                    break;
                                default:
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        stringBuilder = new StringBuilder(27);
                                        stringBuilder.append("Unknown endianness = ");
                                        stringBuilder.append(a3);
                                        Log.d("DfltImageHeaderParser", stringBuilder.toString());
                                    }
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                    break;
                            }
                            amc.f521a.order(byteOrder);
                            i2 = amc.m333b(10) + 6;
                            c = amc.m332a(i2);
                            while (s < c) {
                                int i4 = (i2 + 2) + (s * 12);
                                short a4 = amc.m332a(i4);
                                if (a4 == (short) 274) {
                                    short a5 = amc.m332a(i4 + 2);
                                    StringBuilder stringBuilder3;
                                    if (a5 > (short) 0 && a5 <= (short) 12) {
                                        int b2 = amc.m333b(i4 + 4);
                                        if (b2 >= 0) {
                                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                StringBuilder stringBuilder4 = new StringBuilder(94);
                                                stringBuilder4.append("Got tagIndex=");
                                                stringBuilder4.append(s);
                                                stringBuilder4.append(" tagType=");
                                                stringBuilder4.append(a4);
                                                stringBuilder4.append(" formatCode=");
                                                stringBuilder4.append(a5);
                                                stringBuilder4.append(" componentCount=");
                                                stringBuilder4.append(b2);
                                                Log.d("DfltImageHeaderParser", stringBuilder4.toString());
                                            }
                                            b2 += f9890b[a5];
                                            if (b2 <= 4) {
                                                i4 += 8;
                                                if (i4 >= 0 && i4 <= amc.f521a.remaining()) {
                                                    if (b2 >= 0 && i4 + b2 <= amc.f521a.remaining()) {
                                                        i3 = amc.m332a(i4);
                                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                        stringBuilder3 = new StringBuilder(59);
                                                        stringBuilder3.append("Illegal number of bytes for TI tag data tagType=");
                                                        stringBuilder3.append(a4);
                                                        Log.d("DfltImageHeaderParser", stringBuilder3.toString());
                                                    }
                                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                    StringBuilder stringBuilder5 = new StringBuilder(54);
                                                    stringBuilder5.append("Illegal tagValueOffset=");
                                                    stringBuilder5.append(i4);
                                                    stringBuilder5.append(" tagType=");
                                                    stringBuilder5.append(a4);
                                                    Log.d("DfltImageHeaderParser", stringBuilder5.toString());
                                                }
                                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                stringBuilder3 = new StringBuilder(71);
                                                stringBuilder3.append("Got byte count > 4, not orientation, continuing, formatCode=");
                                                stringBuilder3.append(a5);
                                                Log.d("DfltImageHeaderParser", stringBuilder3.toString());
                                            }
                                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        stringBuilder3 = new StringBuilder(37);
                                        stringBuilder3.append("Got invalid format code = ");
                                        stringBuilder3.append(a5);
                                        Log.d("DfltImageHeaderParser", stringBuilder3.toString());
                                    }
                                }
                                s++;
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        StringBuilder stringBuilder6 = new StringBuilder(81);
                        stringBuilder6.append("Unable to read exif segment data, length: ");
                        stringBuilder6.append(b);
                        stringBuilder6.append(", actually read: ");
                        stringBuilder6.append(a2);
                        Log.d("DfltImageHeaderParser", stringBuilder6.toString());
                    }
                    agu.m262a(obj);
                } catch (Throwable th) {
                    agu.m262a(obj);
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder stringBuilder7 = new StringBuilder(47);
            stringBuilder7.append("Parser doesn't handle magic number: ");
            stringBuilder7.append(b);
            Log.d("DfltImageHeaderParser", stringBuilder7.toString());
        }
        return i3;
    }

    /* renamed from: a */
    public final int mo104a(InputStream inputStream, agu agu) {
        return ama.m6625a(new ame((InputStream) aqe.m585a((Object) inputStream, "Argument must not be null")), (agu) aqe.m585a((Object) agu, "Argument must not be null"));
    }

    /* renamed from: a */
    private static ImageType m6626a(amd amd) {
        int b = amd.mo110b();
        if (b == 65496) {
            return ImageType.JPEG;
        }
        b = ((b << 16) & -65536) | ((char) amd.mo110b());
        if (b == -1991225785) {
            amd.mo109a(21);
            return amd.mo107a() < 3 ? ImageType.PNG : ImageType.PNG_A;
        } else if ((b >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            if (b != 1380533830) {
                return ImageType.UNKNOWN;
            }
            amd.mo109a(4);
            if ((((amd.mo110b() << 16) & -65536) | ((char) amd.mo110b())) != 1464156752) {
                return ImageType.UNKNOWN;
            }
            b = ((amd.mo110b() << 16) & -65536) | ((char) amd.mo110b());
            if ((b & -256) != 1448097792) {
                return ImageType.UNKNOWN;
            }
            b &= Illuminant.kOther;
            if (b == 88) {
                amd.mo109a(4);
                return (amd.mo107a() & 16) == 0 ? ImageType.WEBP : ImageType.WEBP_A;
            } else if (b != 76) {
                return ImageType.WEBP;
            } else {
                amd.mo109a(4);
                return (amd.mo107a() & 8) == 0 ? ImageType.WEBP : ImageType.WEBP_A;
            }
        }
    }

    /* renamed from: a */
    public final ImageType mo105a(InputStream inputStream) {
        return ama.m6626a(new ame((InputStream) aqe.m585a((Object) inputStream, "Argument must not be null")));
    }

    /* renamed from: a */
    public final ImageType mo106a(ByteBuffer byteBuffer) {
        return ama.m6626a(new amb((ByteBuffer) aqe.m585a((Object) byteBuffer, "Argument must not be null")));
    }
}
