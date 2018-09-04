package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kul */
final class kul {
    /* renamed from: a */
    public static final boolean f8583a = kul.m5334d();
    /* renamed from: b */
    public static final boolean f8584b = kul.m5330c();
    /* renamed from: c */
    public static final boolean f8585c = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
    /* renamed from: d */
    private static final Logger f8586d = Logger.getLogger(kul.class.getName());
    /* renamed from: e */
    private static final Unsafe f8587e = kul.m5314a();
    /* renamed from: f */
    private static final Class f8588f = kqs.f8427a;
    /* renamed from: g */
    private static final boolean f8589g = kul.m5331c(Long.TYPE);
    /* renamed from: h */
    private static final boolean f8590h = kul.m5331c(Integer.TYPE);
    /* renamed from: i */
    private static final kuq f8591i;
    /* renamed from: j */
    private static final long f8592j = ((long) kul.m5311a(byte[].class));

    static {
        Field field = null;
        kuq kuo = f8587e != null ? kqs.m5051a() ? f8589g ? new kuo(f8587e) : f8590h ? new kun(f8587e) : null : new kup(f8587e) : null;
        f8591i = kuo;
        kul.m5311a(boolean[].class);
        kul.m5324b(boolean[].class);
        kul.m5311a(int[].class);
        kul.m5324b(int[].class);
        kul.m5311a(long[].class);
        kul.m5324b(long[].class);
        kul.m5311a(float[].class);
        kul.m5324b(float[].class);
        kul.m5311a(double[].class);
        kul.m5324b(double[].class);
        kul.m5311a(Object[].class);
        kul.m5324b(Object[].class);
        kul.m5312a(kul.m5325b());
        Field a = kul.m5313a(String.class, "value");
        if (a != null && a.getType() == char[].class) {
            field = a;
        }
        kul.m5312a(field);
    }

    private kul() {
    }

    /* renamed from: a */
    private static int m5311a(Class cls) {
        if (f8584b) {
            return f8591i.f8593a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static int m5324b(Class cls) {
        if (f8584b) {
            return f8591i.f8593a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m5325b() {
        Field a;
        if (kqs.m5051a()) {
            a = kul.m5313a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        a = kul.m5313a(Buffer.class, "address");
        return (a == null || a.getType() != Long.TYPE) ? null : a;
    }

    /* renamed from: c */
    private static boolean m5331c(Class cls) {
        if (!kqs.m5051a()) {
            return false;
        }
        try {
            Class cls2 = f8588f;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: a */
    private static Field m5313a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    private static long m5312a(Field field) {
        if (field == null || f8591i == null) {
            return -1;
        }
        return f8591i.f8593a.objectFieldOffset(field);
    }

    /* renamed from: a */
    static boolean m5323a(Object obj, long j) {
        return f8591i.mo2315a(obj, j);
    }

    /* renamed from: b */
    static boolean m5328b(Object obj, long j) {
        return kul.m5333d(obj, j) != (byte) 0;
    }

    /* renamed from: c */
    static boolean m5332c(Object obj, long j) {
        return kul.m5335e(obj, j) != (byte) 0;
    }

    /* renamed from: a */
    static byte m5310a(byte[] bArr, long j) {
        return f8591i.mo2316b(bArr, f8592j + j);
    }

    /* renamed from: d */
    static byte m5333d(Object obj, long j) {
        return (byte) (kul.m5338h(obj, -4 & j) >>> ((int) (((-1 ^ j) & 3) << 3)));
    }

    /* renamed from: e */
    static byte m5335e(Object obj, long j) {
        return (byte) (kul.m5338h(obj, -4 & j) >>> ((int) ((3 & j) << 3)));
    }

    /* renamed from: f */
    static double m5336f(Object obj, long j) {
        return f8591i.mo2317c(obj, j);
    }

    /* renamed from: g */
    static float m5337g(Object obj, long j) {
        return f8591i.mo2318d(obj, j);
    }

    /* renamed from: h */
    static int m5338h(Object obj, long j) {
        return f8591i.m5351e(obj, j);
    }

    /* renamed from: i */
    static long m5339i(Object obj, long j) {
        return f8591i.m5352f(obj, j);
    }

    /* renamed from: j */
    static Object m5340j(Object obj, long j) {
        return f8591i.f8593a.getObject(obj, j);
    }

    /* renamed from: a */
    static Unsafe m5314a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new kum());
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static void m5321a(Object obj, long j, boolean z) {
        f8591i.mo2314a(obj, j, z);
    }

    /* renamed from: b */
    static void m5327b(Object obj, long j, boolean z) {
        kul.m5315a(obj, j, (byte) z);
    }

    /* renamed from: c */
    static void m5329c(Object obj, long j, boolean z) {
        kul.m5326b(obj, j, (byte) z);
    }

    /* renamed from: a */
    static void m5322a(byte[] bArr, long j, byte b) {
        f8591i.mo2311a((Object) bArr, f8592j + j, b);
    }

    /* renamed from: a */
    static void m5315a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        kul.m5318a(obj, j2, ((b & Illuminant.kOther) << i) | (kul.m5338h(obj, j2) & ((Illuminant.kOther << i) ^ -1)));
    }

    /* renamed from: b */
    static void m5326b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        kul.m5318a(obj, j2, ((b & Illuminant.kOther) << i) | (kul.m5338h(obj, j2) & ((Illuminant.kOther << i) ^ -1)));
    }

    /* renamed from: a */
    static void m5316a(Object obj, long j, double d) {
        f8591i.mo2312a(obj, j, d);
    }

    /* renamed from: a */
    static void m5317a(Object obj, long j, float f) {
        f8591i.mo2313a(obj, j, f);
    }

    /* renamed from: a */
    static void m5318a(Object obj, long j, int i) {
        f8591i.m5344a(obj, j, i);
    }

    /* renamed from: a */
    static void m5319a(Object obj, long j, long j2) {
        f8591i.m5345a(obj, j, j2);
    }

    /* renamed from: a */
    static void m5320a(Object obj, long j, Object obj2) {
        f8591i.f8593a.putObject(obj, j, obj2);
    }

    /* renamed from: c */
    private static boolean m5330c() {
        if (f8587e == null) {
            return false;
        }
        try {
            Class cls = f8587e.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (kqs.m5051a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f8586d;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m5334d() {
        if (f8587e == null) {
            return false;
        }
        try {
            Class cls = f8587e.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (kul.m5325b() == null) {
                return false;
            }
            if (kqs.m5051a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f8586d;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
            return false;
        }
    }
}
