package p000;

/* compiled from: PG */
/* renamed from: jri */
public final class jri implements izi {
    jri() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        return ((kah) obj).D_();
    }

    /* renamed from: a */
    private static String m13140a(int i, int i2, String str) {
        if (i < 0) {
            return jri.m13141a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            return jri.m13141a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public static void m13143a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m13144a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m13145a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(jri.m13141a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static void m13146a(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(jri.m13141a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: a */
    public static void m13147a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(jri.m13141a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: a */
    public static void m13148a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(jri.m13141a(str, obj));
        }
    }

    /* renamed from: a */
    public static void m13149a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(jri.m13141a(str, obj, obj2));
        }
    }

    /* renamed from: a */
    public static void m13150a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(jri.m13141a(str, obj, obj2, obj3));
        }
    }

    /* renamed from: a */
    public static int m13138a(int i, int i2) {
        if (i >= 0 && i < i2) {
            return i;
        }
        String str = "index";
        if (i < 0) {
            str = jri.m13141a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            str = jri.m13141a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    /* renamed from: b */
    public static Object m13152b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static Object m13139a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: b */
    public static int m13151b(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(jri.m13140a(i, i2, "index"));
    }

    /* renamed from: a */
    public static void m13142a(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            String a;
            if (i < 0 || i > i3) {
                a = jri.m13140a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                a = jri.m13140a(i2, i3, "end index");
            } else {
                a = jri.m13141a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }

    /* renamed from: b */
    public static void m13153b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m13154b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m13155b(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(jri.m13141a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: b */
    public static void m13156b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(jri.m13141a(str, obj));
        }
    }

    /* renamed from: a */
    public static String m13141a(String str, Object... objArr) {
        int i = 0;
        CharSequence valueOf = String.valueOf(str);
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        }
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + (objArr.length << 4));
        int i2 = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                break;
            }
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(valueOf, i2, indexOf);
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            int i3 = i2;
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(valueOf, i2, valueOf.length());
        if (i < length) {
            stringBuilder.append(" [");
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            i = i2;
            while (i < objArr.length) {
                stringBuilder.append(", ");
                i2 = i + 1;
                stringBuilder.append(objArr[i]);
                i = i2;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }
}
