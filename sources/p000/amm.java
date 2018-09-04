package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: amm */
public final class amm {
    /* renamed from: a */
    public static final adm f528a = adm.m169a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", adg.f326d);
    /* renamed from: b */
    public static final adm f529b = adm.m168a("com.bumtpech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
    /* renamed from: c */
    public static final amo f530c = new amn();
    /* renamed from: d */
    private static final adm f531d = adm.m169a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.valueOf(false));
    /* renamed from: e */
    private static final Queue f532e = arq.m652a(0);
    /* renamed from: f */
    private final agw f533f;
    /* renamed from: g */
    private final DisplayMetrics f534g;
    /* renamed from: h */
    private final agu f535h;
    /* renamed from: i */
    private final List f536i;
    /* renamed from: j */
    private final amu f537j = amu.m356a();

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));
    }

    public amm(List list, DisplayMetrics displayMetrics, agw agw, agu agu) {
        this.f536i = list;
        this.f534g = (DisplayMetrics) aqe.m585a((Object) displayMetrics, "Argument must not be null");
        this.f533f = (agw) aqe.m585a((Object) agw, "Argument must not be null");
        this.f535h = (agu) aqe.m585a((Object) agu, "Argument must not be null");
    }

    /* renamed from: a */
    public final agn m351a(InputStream inputStream, int i, int i2, adp adp, amo amo) {
        Object obj;
        int i3;
        int i4;
        int a;
        int i5;
        int i6;
        float min;
        int ceil;
        int a2;
        boolean hasAlpha;
        Config config;
        Bitmap a3;
        aqe.m588a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        Object obj2 = (byte[]) this.f535h.m258a(65536, byte[].class);
        Options c = amm.m349c();
        c.inTempStorage = obj2;
        adg adg = (adg) adp.m6303a(f528a);
        amf amf = (amf) adp.m6303a(amf.f527f);
        boolean booleanValue = ((Boolean) adp.m6303a(f531d)).booleanValue();
        if (adp.m6303a(f529b) != null) {
            if (((Boolean) adp.m6303a(f529b)).booleanValue()) {
                obj = 1;
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        if (adg == adg.PREFER_ARGB_8888_DISALLOW_HARDWARE) {
            obj = null;
        }
        try {
            Object obj3;
            Object obj4;
            long a4 = arm.m630a();
            int[] b = amm.m348b(inputStream, c, amo, this.f533f);
            i3 = b[0];
            i4 = b[1];
            String str = c.outMimeType;
            if (i3 == -1) {
                obj3 = null;
            } else if (i4 == -1) {
                obj3 = null;
            } else {
                obj3 = obj;
            }
            int a5 = adk.m162a(this.f536i, inputStream, this.f535h);
            a = anb.m363a(a5);
            boolean b2 = anb.m370b(a5);
            if (i == Integer.MIN_VALUE) {
                i5 = i3;
            } else {
                i5 = i;
            }
            if (i2 == Integer.MIN_VALUE) {
                i6 = i4;
            } else {
                i6 = i2;
            }
            ImageType b3 = adk.m163b(this.f536i, inputStream, this.f535h);
            agw agw = this.f533f;
            String valueOf;
            if (i3 > 0 && i4 > 0) {
                float a6;
                if (a == 90 || a == MediaDecoder.ROTATE_90_LEFT) {
                    a6 = amf.mo112a(i4, i3, i5, i6);
                } else {
                    a6 = amf.mo112a(i3, i4, i5, i6);
                }
                if (a6 <= 0.0f) {
                    valueOf = String.valueOf(amf);
                    r8 = new StringBuilder(String.valueOf(valueOf).length() + 118);
                    r8.append("Cannot scale with factor: ");
                    r8.append(a6);
                    r8.append(" from: ");
                    r8.append(valueOf);
                    r8.append(", source: [");
                    r8.append(i3);
                    r8.append("x");
                    r8.append(i4);
                    r8.append("], target: [");
                    r8.append(i5);
                    r8.append("x");
                    r8.append(i6);
                    r8.append("]");
                    throw new IllegalArgumentException(r8.toString());
                }
                int a7 = amf.mo113a();
                if (a7 == 0) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                int i7;
                float f = (float) i3;
                float f2 = (float) i4;
                a = i3 / ((int) (((double) (a6 * f)) + 0.5d));
                int i8 = i4 / ((int) (((double) (a6 * f2)) + 0.5d));
                if (a7 == go.f5569g) {
                    a = Math.max(a, i8);
                } else {
                    a = Math.min(a, i8);
                }
                a = Math.max(1, Integer.highestOneBit(a));
                if (a7 != go.f5569g) {
                    a7 = a;
                } else if (((float) a) < 1.0f / a6) {
                    a7 = a + a;
                } else {
                    a7 = a;
                }
                c.inSampleSize = a7;
                if (b3 == ImageType.JPEG) {
                    min = (float) Math.min(a7, 8);
                    ceil = (int) Math.ceil((double) (f / min));
                    a = (int) Math.ceil((double) (f2 / min));
                    i7 = a7 / 8;
                    if (i7 > 0) {
                        ceil /= i7;
                        a /= i7;
                    }
                } else if (b3 == ImageType.PNG || b3 == ImageType.PNG_A) {
                    min = (float) a7;
                    ceil = (int) Math.floor((double) (f / min));
                    a = (int) Math.floor((double) (f2 / min));
                } else if (b3 == ImageType.WEBP || b3 == ImageType.WEBP_A) {
                    if (VERSION.SDK_INT >= 24) {
                        min = (float) a7;
                        ceil = Math.round(f / min);
                        a = Math.round(f2 / min);
                    } else {
                        min = (float) a7;
                        ceil = (int) Math.floor((double) (f / min));
                        a = (int) Math.floor((double) (f2 / min));
                    }
                } else if (i3 % a7 == 0 && i4 % a7 == 0) {
                    ceil = i3 / a7;
                    a = i4 / a7;
                } else {
                    int[] b4 = amm.m348b(inputStream, c, amo, agw);
                    ceil = b4[0];
                    a = b4[1];
                }
                double a8 = (double) amf.mo112a(ceil, a, i5, i6);
                if (VERSION.SDK_INT >= 19) {
                    a2 = amm.m341a(a8);
                    i7 = (int) ((((double) a2) * a8) + 0.5d);
                    c.inTargetDensity = (int) (((a8 / ((double) (((float) i7) / ((float) a2)))) * ((double) i7)) + 0.5d);
                    c.inDensity = amm.m341a(a8);
                }
                if (amm.m345a(c)) {
                    c.inScaled = true;
                } else {
                    c.inTargetDensity = 0;
                    c.inDensity = 0;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    a2 = c.inTargetDensity;
                    i7 = c.inDensity;
                    StringBuilder stringBuilder = new StringBuilder(309);
                    stringBuilder.append("Calculate scaling, source: [");
                    stringBuilder.append(i3);
                    stringBuilder.append("x");
                    stringBuilder.append(i4);
                    stringBuilder.append("], target: [");
                    stringBuilder.append(i5);
                    stringBuilder.append("x");
                    stringBuilder.append(i6);
                    stringBuilder.append("], power of two scaled: [");
                    stringBuilder.append(ceil);
                    stringBuilder.append("x");
                    stringBuilder.append(a);
                    stringBuilder.append("], exact scale factor: ");
                    stringBuilder.append(a6);
                    stringBuilder.append(", power of 2 sample size: ");
                    stringBuilder.append(a7);
                    stringBuilder.append(", adjusted scale factor: ");
                    stringBuilder.append(a8);
                    stringBuilder.append(", target density: ");
                    stringBuilder.append(a2);
                    stringBuilder.append(", density: ");
                    stringBuilder.append(i7);
                    Log.v("Downsampler", stringBuilder.toString());
                }
            } else if (Log.isLoggable("Downsampler", 3)) {
                valueOf = String.valueOf(b3);
                r8 = new StringBuilder(String.valueOf(valueOf).length() + 74);
                r8.append("Unable to determine dimensions for: ");
                r8.append(valueOf);
                r8.append(" with target [");
                r8.append(i5);
                r8.append("x");
                r8.append(i6);
                r8.append("]");
                Log.d("Downsampler", r8.toString());
            }
            amu amu = this.f537j;
            if (obj3 == null) {
                obj4 = null;
            } else if (adg == adg.PREFER_ARGB_8888_DISALLOW_HARDWARE) {
                obj4 = null;
            } else if (b2) {
                obj4 = null;
            } else {
                obj4 = i5 >= 128 ? i6 >= 128 ? amu.m357b() ? 1 : null : null : null;
                if (obj4 != null) {
                    c.inPreferredConfig = Config.HARDWARE;
                    c.inMutable = false;
                }
            }
            if (obj4 == null) {
                if (adg == adg.PREFER_ARGB_8888 || adg == adg.PREFER_ARGB_8888_DISALLOW_HARDWARE) {
                    c.inPreferredConfig = Config.ARGB_8888;
                } else {
                    hasAlpha = adk.m163b(this.f536i, inputStream, this.f535h).hasAlpha();
                    if (hasAlpha) {
                        config = Config.ARGB_8888;
                    } else {
                        config = Config.RGB_565;
                    }
                    c.inPreferredConfig = config;
                    if (c.inPreferredConfig == Config.RGB_565) {
                        c.inDither = true;
                    }
                }
            }
        } catch (Throwable e) {
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder stringBuilder2;
                String valueOf2 = String.valueOf(adg);
                stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 72);
                stringBuilder2.append("Cannot determine whether the image has alpha or not from header, format ");
                stringBuilder2.append(valueOf2);
                Log.d("Downsampler", stringBuilder2.toString(), e);
                hasAlpha = false;
            } else {
                hasAlpha = false;
            }
        } catch (Throwable th) {
            amm.m346b(c);
            this.f535h.m262a(obj2);
        }
        a2 = VERSION.SDK_INT;
        Object obj5;
        if (a2 < 19) {
            obj5 = null;
        } else {
            obj5 = 1;
        }
        if (c.inSampleSize == 1 || r5 != null) {
            if (i3 < 0 || i4 < 0 || !booleanValue || a2 < 19) {
                if (amm.m345a(c)) {
                    min = ((float) c.inTargetDensity) / ((float) c.inDensity);
                } else {
                    min = 1.0f;
                }
                ceil = c.inSampleSize;
                float f3 = (float) ceil;
                double ceil2 = Math.ceil((double) (((float) i3) / f3));
                double ceil3 = Math.ceil((double) (((float) i4) / f3));
                a2 = Math.round(((float) ((int) ceil2)) * min);
                int round = Math.round(((float) ((int) ceil3)) * min);
                if (Log.isLoggable("Downsampler", 2)) {
                    i6 = c.inTargetDensity;
                    i5 = c.inDensity;
                    StringBuilder stringBuilder3 = new StringBuilder(192);
                    stringBuilder3.append("Calculated target [");
                    stringBuilder3.append(a2);
                    stringBuilder3.append("x");
                    stringBuilder3.append(round);
                    stringBuilder3.append("] for source [");
                    stringBuilder3.append(i3);
                    stringBuilder3.append("x");
                    stringBuilder3.append(i4);
                    stringBuilder3.append("], sampleSize: ");
                    stringBuilder3.append(ceil);
                    stringBuilder3.append(", targetDensity: ");
                    stringBuilder3.append(i6);
                    stringBuilder3.append(", density: ");
                    stringBuilder3.append(i5);
                    stringBuilder3.append(", density multiplier: ");
                    stringBuilder3.append(min);
                    Log.v("Downsampler", stringBuilder3.toString());
                    a = a2;
                    a2 = round;
                } else {
                    a = a2;
                    a2 = round;
                }
            } else {
                a2 = i6;
                a = i5;
            }
            if (a > 0 && a2 > 0) {
                agw agw2 = this.f533f;
                if (c.inPreferredConfig != Config.HARDWARE) {
                    config = c.outConfig;
                    if (config == null) {
                        config = c.inPreferredConfig;
                    }
                    c.inBitmap = agw2.mo64b(a, a2, config);
                }
            }
        }
        Bitmap a9 = amm.m342a(inputStream, c, amo, this.f533f);
        amo.mo115a(this.f533f, a9);
        if (Log.isLoggable("Downsampler", 2)) {
            valueOf2 = amm.m343a(a9);
            String a10 = amm.m343a(c.inBitmap);
            ceil = c.inSampleSize;
            i6 = c.inDensity;
            i5 = c.inTargetDensity;
            String name = Thread.currentThread().getName();
            double a11 = arm.m629a(a4);
            StringBuilder stringBuilder4 = new StringBuilder((((String.valueOf(valueOf2).length() + 208) + String.valueOf(str).length()) + String.valueOf(a10).length()) + String.valueOf(name).length());
            stringBuilder4.append("Decoded ");
            stringBuilder4.append(valueOf2);
            stringBuilder4.append(" from [");
            stringBuilder4.append(i3);
            stringBuilder4.append("x");
            stringBuilder4.append(i4);
            stringBuilder4.append("] ");
            stringBuilder4.append(str);
            stringBuilder4.append(" with inBitmap ");
            stringBuilder4.append(a10);
            stringBuilder4.append(" for [");
            stringBuilder4.append(i);
            stringBuilder4.append("x");
            stringBuilder4.append(i2);
            stringBuilder4.append("], sample size: ");
            stringBuilder4.append(ceil);
            stringBuilder4.append(", density: ");
            stringBuilder4.append(i6);
            stringBuilder4.append(", target density: ");
            stringBuilder4.append(i5);
            stringBuilder4.append(", thread: ");
            stringBuilder4.append(name);
            stringBuilder4.append(", duration: ");
            stringBuilder4.append(a11);
            Log.v("Downsampler", stringBuilder4.toString());
        }
        if (a9 != null) {
            a9.setDensity(this.f534g.densityDpi);
            a3 = anb.m365a(this.f533f, a9, a5);
            if (!a9.equals(a3)) {
                this.f533f.mo63a(a9);
            }
        } else {
            a3 = null;
        }
        agn a12 = alv.m6617a(a3, this.f533f);
        amm.m346b(c);
        this.f535h.m262a(obj2);
        return a12;
    }

    /* renamed from: a */
    private static Bitmap m342a(InputStream inputStream, Options options, amo amo, agw agw) {
        Bitmap decodeStream;
        Throwable iOException;
        if (options.inJustDecodeBounds) {
            inputStream.mark(10485760);
        } else {
            amo.mo114a();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        anb.f549a.lock();
        try {
            decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            anb.f549a.unlock();
            if (options.inJustDecodeBounds) {
                inputStream.reset();
            }
        } catch (IOException e) {
            throw iOException;
        } catch (Throwable e2) {
            String a = amm.m343a(options.inBitmap);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 99) + String.valueOf(a).length());
            stringBuilder.append("Exception decoding bitmap, outWidth: ");
            stringBuilder.append(i);
            stringBuilder.append(", outHeight: ");
            stringBuilder.append(i2);
            stringBuilder.append(", outMimeType: ");
            stringBuilder.append(str);
            stringBuilder.append(", inBitmap: ");
            stringBuilder.append(a);
            iOException = new IOException(stringBuilder.toString(), e2);
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
            }
            if (options.inBitmap != null) {
                inputStream.reset();
                agw.mo63a(options.inBitmap);
                options.inBitmap = null;
                decodeStream = amm.m342a(inputStream, options, amo, agw);
                anb.f549a.unlock();
            } else {
                throw iOException;
            }
        } catch (Throwable th) {
            anb.f549a.unlock();
        }
        return decodeStream;
    }

    @TargetApi(19)
    /* renamed from: a */
    private static String m343a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int allocationByteCount = bitmap.getAllocationByteCount();
        StringBuilder stringBuilder = new StringBuilder(14);
        stringBuilder.append(" (");
        stringBuilder.append(allocationByteCount);
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String valueOf = String.valueOf(bitmap.getConfig());
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(stringBuilder2).length());
        stringBuilder3.append("[");
        stringBuilder3.append(width);
        stringBuilder3.append("x");
        stringBuilder3.append(height);
        stringBuilder3.append("] ");
        stringBuilder3.append(valueOf);
        stringBuilder3.append(stringBuilder2);
        return stringBuilder3.toString();
    }

    /* renamed from: c */
    private static synchronized Options m349c() {
        Options options;
        synchronized (amm.class) {
            synchronized (f532e) {
                options = (Options) f532e.poll();
            }
            if (options == null) {
                options = new Options();
                amm.m350c(options);
            }
        }
        return options;
    }

    /* renamed from: a */
    private static int m341a(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(2.147483647E9d * d);
    }

    /* renamed from: b */
    private static int[] m348b(InputStream inputStream, Options options, amo amo, agw agw) {
        options.inJustDecodeBounds = true;
        amm.m342a(inputStream, options, amo, agw);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    public static boolean m344a() {
        return true;
    }

    /* renamed from: b */
    public static boolean m347b() {
        return true;
    }

    /* renamed from: a */
    private static boolean m345a(Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    /* renamed from: b */
    private static void m346b(Options options) {
        amm.m350c(options);
        synchronized (f532e) {
            f532e.offer(options);
        }
    }

    /* renamed from: c */
    private static void m350c(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}
