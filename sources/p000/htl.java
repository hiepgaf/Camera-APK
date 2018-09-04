package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.wearable.Asset;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* renamed from: htl */
public class htl {
    /* renamed from: a */
    public static Boolean f6652a;
    /* renamed from: b */
    private static Boolean f6653b;
    /* renamed from: c */
    private static Boolean f6654c;

    private htl(String[] strArr) {
        htl.m3431b((Object) strArr);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
    }

    public htl(String[] strArr, byte b) {
        this(strArr);
    }

    /* renamed from: a */
    public static boolean m3426a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj == null) {
                z = false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static String m3401a(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unknown status code: ");
                stringBuilder.append(i);
                return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static hvi m3398a(Object obj) {
        return new hvi(obj);
    }

    /* renamed from: a */
    public static String[] m3427a(Parcel parcel, int i) {
        int d = htl.m3441d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(d + dataPosition);
        return createStringArray;
    }

    /* renamed from: b */
    public static Object m3431b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: a */
    public static boolean m3425a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (iad.f6871a.m3601a(context).m3599a(str, 0).flags & 2097152) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: b */
    public static int m3430b(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: c */
    public static void m3439c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static Bundle m3396a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    /* renamed from: a */
    public static void m3405a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    /* renamed from: d */
    public static int m3441d(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? i >>> 16 : parcel.readInt();
    }

    /* renamed from: a */
    public static void m3406a(Parcel parcel, int i, byte b) {
        htl.m3434b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m3407a(Parcel parcel, int i, int i2) {
        int d = htl.m3441d(parcel, i);
        if (d != i2) {
            String valueOf = String.valueOf(Integer.toHexString(d));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
            stringBuilder.append("Expected size ");
            stringBuilder.append(i2);
            stringBuilder.append(" got ");
            stringBuilder.append(d);
            stringBuilder.append(" (0x");
            stringBuilder.append(valueOf);
            stringBuilder.append(")");
            throw new aci(stringBuilder.toString(), parcel);
        }
    }

    /* renamed from: a */
    public static void m3408a(Parcel parcel, int i, long j) {
        htl.m3434b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static Parcelable m3397a(Parcel parcel, int i, Creator creator) {
        int d = htl.m3441d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(d + dataPosition);
        return parcelable;
    }

    /* renamed from: a */
    public static void m3414a(Parcel parcel, int i, boolean z) {
        htl.m3434b(parcel, i, 4);
        parcel.writeInt(z);
    }

    /* renamed from: a */
    private static void m3419a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    private static void m3420a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        int modifiers;
        int length;
        String name;
        if (obj instanceof ibr) {
            String name2;
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(htl.m3433b(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class cls = obj.getClass();
            for (Field field : cls.getFields()) {
                modifiers = field.getModifiers();
                name2 = field.getName();
                if (!("cachedSize".equals(name2) || (modifiers & 1) != 1 || (modifiers & 8) == 8 || name2.startsWith("_") || name2.endsWith("_"))) {
                    Class type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        htl.m3420a(name2, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        htl.m3420a(name2, obj2, stringBuffer, stringBuffer2);
                    } else {
                        length = obj2 != null ? Array.getLength(obj2) : 0;
                        for (modifiers = 0; modifiers < length; modifiers++) {
                            htl.m3420a(name2, Array.get(obj2, modifiers), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method name3 : cls.getMethods()) {
                name = name3.getName();
                if (name.startsWith("set")) {
                    String substring = name.substring(3);
                    try {
                        name2 = "has";
                        name = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(name.length() == 0 ? new String(name2) : name2.concat(name), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            try {
                                name2 = "get";
                                name = String.valueOf(substring);
                                htl.m3420a(substring, cls.getMethod(name.length() == 0 ? new String(name2) : name2.concat(name), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            } catch (NoSuchMethodException e) {
                            }
                        }
                    } catch (NoSuchMethodException e2) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        name = htl.m3433b(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(name);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            obj = (String) obj;
            if (!obj.startsWith("http") && obj.length() > 200) {
                obj = String.valueOf(obj.substring(0, 200)).concat("[...]");
            }
            modifiers = obj.length();
            StringBuilder stringBuilder = new StringBuilder(modifiers);
            for (length = 0; length < modifiers; length++) {
                char charAt = obj.charAt(length);
                if (charAt >= ' ' && charAt <= '~' && charAt != '\"' && charAt != '\'') {
                    stringBuilder.append(charAt);
                } else {
                    stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                }
            }
            name = stringBuilder.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(name);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                stringBuffer2.append("\"\"");
            } else {
                stringBuffer2.append('\"');
                for (byte b : bArr) {
                    modifiers = b & Illuminant.kOther;
                    char c = (char) modifiers;
                    if (modifiers == 92 || modifiers == 34) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append(c);
                    } else if (modifiers >= 32 && modifiers < ScriptIntrinsicBLAS.RsBlas_csyrk) {
                        stringBuffer2.append(c);
                    } else {
                        stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(modifiers)}));
                    }
                }
                stringBuffer2.append('\"');
            }
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    /* renamed from: a */
    public static ibh m3399a(List list, Object obj) {
        ibh ibh = new ibh();
        if (obj != null) {
            ibh.f21652b = new ibi();
            if (obj instanceof String) {
                ibh.f21651a = 2;
                ibh.f21652b.f21654b = (String) obj;
            } else if (obj instanceof Integer) {
                ibh.f21651a = 6;
                ibh.f21652b.f21658f = ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                ibh.f21651a = 5;
                ibh.f21652b.f21657e = ((Long) obj).longValue();
            } else if (obj instanceof Double) {
                ibh.f21651a = 3;
                ibh.f21652b.f21655c = ((Double) obj).doubleValue();
            } else if (obj instanceof Float) {
                ibh.f21651a = 4;
                ibh.f21652b.f21656d = ((Float) obj).floatValue();
            } else if (obj instanceof Boolean) {
                ibh.f21651a = 8;
                ibh.f21652b.f21660h = ((Boolean) obj).booleanValue();
            } else if (obj instanceof Byte) {
                ibh.f21651a = 7;
                ibh.f21652b.f21659g = ((Byte) obj).byteValue();
            } else if (obj instanceof byte[]) {
                ibh.f21651a = 1;
                ibh.f21652b.f21653a = (byte[]) obj;
            } else if (obj instanceof String[]) {
                ibh.f21651a = 11;
                ibh.f21652b.f21663k = (String[]) obj;
            } else if (obj instanceof long[]) {
                ibh.f21651a = 12;
                ibh.f21652b.f21664l = (long[]) obj;
            } else if (obj instanceof float[]) {
                ibh.f21651a = 15;
                ibh.f21652b.f21665m = (float[]) obj;
            } else if (obj instanceof Asset) {
                ibh.f21651a = 13;
                ibi ibi = ibh.f21652b;
                list.add((Asset) obj);
                ibi.f21666n = (long) (list.size() - 1);
            } else if (obj instanceof igj) {
                ibh.f21651a = 9;
                igj igj = (igj) obj;
                TreeSet treeSet = new TreeSet(igj.f6999a.keySet());
                ibg[] ibgArr = new ibg[treeSet.size()];
                Iterator it = treeSet.iterator();
                r1 = 0;
                while (it.hasNext()) {
                    r0 = (String) it.next();
                    ibgArr[r1] = new ibg();
                    ibg ibg = ibgArr[r1];
                    ibg.f21648a = r0;
                    ibg.f21649b = htl.m3399a(list, igj.m3741a(r0));
                    r1++;
                }
                ibh.f21652b.f21661i = ibgArr;
            } else if (obj instanceof ArrayList) {
                ibh.f21651a = 10;
                ArrayList arrayList = (ArrayList) obj;
                ibh[] ibhArr = new ibh[arrayList.size()];
                int size = arrayList.size();
                Object obj2 = null;
                int i = 0;
                int i2 = 14;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    ibh a = htl.m3399a(list, obj3);
                    int i3 = a.f21651a;
                    if (i3 == 14 || i3 == 2 || i3 == 6 || i3 == 9) {
                        if (i2 == 14 && i3 != 14) {
                            r1 = i3;
                        } else if (i3 == i2) {
                            obj3 = obj2;
                            r1 = i2;
                        } else {
                            String valueOf = String.valueOf(obj2.getClass());
                            r0 = String.valueOf(obj3.getClass());
                            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 80) + String.valueOf(r0).length());
                            stringBuilder.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                            stringBuilder.append(valueOf);
                            stringBuilder.append(" and a ");
                            stringBuilder.append(r0);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        ibhArr[i] = a;
                        i++;
                        i2 = r1;
                        obj2 = obj3;
                    } else {
                        r0 = String.valueOf(obj3.getClass());
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(r0).length() + ScriptIntrinsicBLAS.RsBlas_ctrsm);
                        stringBuilder2.append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                        stringBuilder2.append(r0);
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                }
                ibh.f21652b.f21662j = ibhArr;
            } else {
                r0 = String.valueOf(obj.getClass().getSimpleName());
                String str = "newFieldValueFromValue: unexpected value ";
                throw new RuntimeException(r0.length() == 0 ? new String(str) : str.concat(r0));
            }
            return ibh;
        }
        ibh.f21651a = 14;
        return ibh;
    }

    /* renamed from: a */
    public static void m3422a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    private static void m3423a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long a = htl.m3395a(bArr, i);
        long a2 = htl.m3395a(bArr, i + 8);
        long a3 = htl.m3395a(bArr, i + 16);
        long a4 = htl.m3395a(bArr, i + 24);
        a += j;
        long rotateRight = Long.rotateRight((j2 + a) + a4, 51);
        a2 = (a2 + a) + a3;
        a3 = Long.rotateRight(a2, 23);
        jArr[0] = a2 + a4;
        jArr[1] = a + (a3 + rotateRight);
    }

    /* renamed from: a */
    public static void m3409a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int b = htl.m3430b(parcel, i);
            parcel.writeBundle(bundle);
            htl.m3439c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3410a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int b = htl.m3430b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            htl.m3439c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3411a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int b = htl.m3430b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            htl.m3439c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3412a(Parcel parcel, int i, String str) {
        if (str != null) {
            int b = htl.m3430b(parcel, i);
            parcel.writeString(str);
            htl.m3439c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3415a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int b = htl.m3430b(parcel, i);
            parcel.writeByteArray(bArr);
            htl.m3439c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3416a(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int b = htl.m3430b(parcel, i);
            parcel.writeIntArray(iArr);
            htl.m3439c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3417a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int b = htl.m3430b(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable != null) {
                    htl.m3419a(parcel, parcelable, i2);
                } else {
                    parcel.writeInt(0);
                }
            }
            htl.m3439c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3418a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int b = htl.m3430b(parcel, i);
            parcel.writeStringArray(strArr);
            htl.m3439c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3421a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m3435b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m3442e(Parcel parcel, int i) {
        parcel.setDataPosition(htl.m3441d(parcel, i) + parcel.dataPosition());
    }

    /* renamed from: b */
    public static void m3434b(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt((i2 << 16) | i);
            return;
        }
        parcel.writeInt(-65536 | i);
        parcel.writeInt(i2);
    }

    /* renamed from: b */
    public static Object[] m3437b(Parcel parcel, int i, Creator creator) {
        int d = htl.m3441d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(d + dataPosition);
        return createTypedArray;
    }

    /* renamed from: b */
    public static Object m3432b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: a */
    public static Object m3400a(Callable callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            return null;
        }
    }

    /* renamed from: b */
    public static void m3436b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @TargetApi(24)
    /* renamed from: a */
    public static boolean m3424a(Context context) {
        if (f6654c == null) {
            f6654c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f6654c.booleanValue()) {
            if (f6653b == null) {
                f6653b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
            }
            if (f6653b.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m3443f(Parcel parcel, int i) {
        htl.m3407a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: c */
    public static void m3440c(Parcel parcel, int i, int i2) {
        htl.m3434b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: c */
    public static ArrayList m3438c(Parcel parcel, int i, Creator creator) {
        int d = htl.m3441d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(d + dataPosition);
        return createTypedArrayList;
    }

    /* renamed from: a */
    public static void m3413a(Parcel parcel, int i, List list) {
        if (list != null) {
            int b = htl.m3430b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable != null) {
                    htl.m3419a(parcel, parcelable, 0);
                } else {
                    parcel.writeInt(0);
                }
            }
            htl.m3439c(parcel, b);
        }
    }

    /* renamed from: a */
    private static long m3395a(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    /* renamed from: a */
    public static int m3392a(Parcel parcel) {
        int readInt = parcel.readInt();
        int d = htl.m3441d(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != '佅') {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            String str = "Expected object header. Got 0x";
            throw new aci(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), parcel);
        }
        readInt = dataPosition + d;
        if (readInt >= dataPosition && readInt <= parcel.dataSize()) {
            return readInt;
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Size read is invalid start=");
        stringBuilder.append(dataPosition);
        stringBuilder.append(" end=");
        stringBuilder.append(readInt);
        throw new aci(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public static String m3403a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: b */
    public static int m3429b(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    private static long m3393a(long j, long j2) {
        long j3 = (j2 ^ j) * -4132994306676758123L;
        j3 = ((j3 ^ (j3 >>> 47)) ^ j) * -4132994306676758123L;
        return (j3 ^ (j3 >>> 47)) * -4132994306676758123L;
    }

    /* renamed from: g */
    public static byte m3444g(Parcel parcel, int i) {
        htl.m3407a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: h */
    public static int m3445h(Parcel parcel, int i) {
        htl.m3407a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: a */
    public static String m3402a(ibr ibr) {
        String valueOf;
        String str;
        if (ibr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            htl.m3420a(null, (Object) ibr, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            str = "Error printing proto: ";
            return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        } catch (InvocationTargetException e2) {
            valueOf = String.valueOf(e2.getMessage());
            str = "Error printing proto: ";
            return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        }
    }

    /* renamed from: b */
    public static int m3428b(int i) {
        return (char) i;
    }

    /* renamed from: i */
    public static long m3446i(Parcel parcel, int i) {
        htl.m3407a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: a */
    public static String m3404a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: b */
    private static String m3433b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static long m3394a(byte[] bArr) {
        long j;
        long a;
        int length = bArr.length;
        int i;
        int i2;
        long j2;
        if (length <= 32) {
            int i3 = length & -8;
            i = length & 7;
            j = -1397348546323613475L ^ (((long) length) * -4132994306676758123L);
            i2 = 0;
            while (i2 < i3) {
                a = htl.m3395a(bArr, i2) * -4132994306676758123L;
                i2 += 8;
                j = -4132994306676758123L * (j ^ ((a ^ (a >>> 47)) * -4132994306676758123L));
            }
            if (i != 0) {
                j2 = 0;
                for (int i4 = 0; i4 < Math.min(i, 8); i4++) {
                    j2 |= (((long) bArr[i3 + i4]) & 255) << (i4 << 3);
                }
                j = (j ^ j2) * -4132994306676758123L;
            }
            j = (j ^ (j >>> 47)) * -4132994306676758123L;
            a = j ^ (j >>> 47);
        } else if (length <= 64) {
            j = htl.m3395a(bArr, 24);
            i2 = length - 16;
            a = htl.m3395a(bArr, 0) + ((((long) length) + htl.m3395a(bArr, i2)) * -6505348102511208375L);
            long rotateRight = Long.rotateRight(a + j, 52);
            long rotateRight2 = Long.rotateRight(a, 37);
            a += htl.m3395a(bArr, 8);
            long rotateRight3 = Long.rotateRight(a, 7);
            a += htl.m3395a(bArr, 16);
            rotateRight = (rotateRight + Long.rotateRight(a, 31)) + (rotateRight2 + rotateRight3);
            rotateRight2 = htl.m3395a(bArr, 16) + htl.m3395a(bArr, length - 32);
            rotateRight3 = htl.m3395a(bArr, length - 8);
            r14 = Long.rotateRight(rotateRight2 + rotateRight3, 52);
            r18 = Long.rotateRight(rotateRight2, 37);
            rotateRight2 += htl.m3395a(bArr, length - 24);
            j2 = htl.m3395a(bArr, i2) + rotateRight2;
            j = (((j + a) + ((Long.rotateRight(j2, 31) + r14) + (r18 + Long.rotateRight(rotateRight2, 7)))) * -4288712594273399085L) + (((j2 + rotateRight3) + rotateRight) * -6505348102511208375L);
            j = ((j ^ (j >>> 47)) * -6505348102511208375L) + rotateRight;
            a = (j ^ (j >>> 47)) * -4288712594273399085L;
        } else {
            r18 = htl.m3395a(bArr, 0);
            a = htl.m3395a(bArr, length - 16) ^ -8261664234251669945L;
            long a2 = htl.m3395a(bArr, length - 56);
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            j2 = (long) length;
            htl.m3423a(bArr, length - 64, j2, a, jArr);
            htl.m3423a(bArr, length - 32, j2 * -8261664234251669945L, -6505348102511208375L, jArr2);
            j = jArr[1];
            j2 = (-6505348102511208375L ^ a2) + ((j ^ (j >>> 47)) * -8261664234251669945L);
            r14 = Long.rotateRight(a, 33) * -8261664234251669945L;
            int i5 = 0;
            a = -8261664234251669945L * Long.rotateRight(j2 + r18, 39);
            i = (length - 1) & -64;
            while (true) {
                r18 = (Long.rotateRight(((a + r14) + jArr[0]) + htl.m3395a(bArr, i5 + 16), 37) * -8261664234251669945L) ^ jArr2[1];
                r14 = (-8261664234251669945L * Long.rotateRight((jArr[1] + r14) + htl.m3395a(bArr, i5 + 48), 42)) ^ jArr[0];
                a2 = Long.rotateRight(j2 ^ jArr2[0], 33);
                htl.m3423a(bArr, i5, jArr[1] * -8261664234251669945L, jArr2[0] + r18, jArr);
                htl.m3423a(bArr, i5 + 32, a2 + jArr2[1], r14, jArr2);
                i5 += 64;
                int i6 = i - 64;
                if (i6 == 0) {
                    break;
                }
                j2 = r18;
                a = a2;
                i = i6;
            }
            a = htl.m3393a((htl.m3393a(jArr[0], jArr2[0]) + (((r14 >>> 47) ^ r14) * -8261664234251669945L)) + r18, htl.m3393a(jArr[1], jArr2[1]) + a2);
        }
        j = htl.m3393a((length >= 9 ? htl.m3395a(bArr, length - 8) : -6505348102511208375L) + a, length >= 8 ? htl.m3395a(bArr, 0) : -6505348102511208375L);
        return (j == 0 || j == 1) ? j - 2 : j;
    }

    /* renamed from: j */
    public static String m3447j(Parcel parcel, int i) {
        int d = htl.m3441d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(d + dataPosition);
        return readString;
    }

    /* renamed from: k */
    public static IBinder m3448k(Parcel parcel, int i) {
        int d = htl.m3441d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(d + dataPosition);
        return readStrongBinder;
    }

    /* renamed from: l */
    public static Bundle m3449l(Parcel parcel, int i) {
        int d = htl.m3441d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(d + dataPosition);
        return readBundle;
    }

    /* renamed from: m */
    public static byte[] m3450m(Parcel parcel, int i) {
        int d = htl.m3441d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(d + dataPosition);
        return createByteArray;
    }

    /* renamed from: n */
    public static int[] m3451n(Parcel parcel, int i) {
        int d = htl.m3441d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(d + dataPosition);
        return createIntArray;
    }
}
