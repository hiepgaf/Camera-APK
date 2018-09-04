package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: ije */
public class ije {
    /* renamed from: a */
    public static final AtomicBoolean f7022a = new AtomicBoolean();
    /* renamed from: b */
    private static final Uri f7023b = Uri.parse("content://com.google.android.gsf.gservices");
    /* renamed from: c */
    private static final Uri f7024c = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* renamed from: d */
    private static final Pattern f7025d = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    /* renamed from: e */
    private static final Pattern f7026e = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* renamed from: f */
    private static HashMap f7027f;
    /* renamed from: g */
    private static final HashMap f7028g = new HashMap();
    /* renamed from: h */
    private static final HashMap f7029h = new HashMap();
    /* renamed from: i */
    private static final HashMap f7030i = new HashMap();
    /* renamed from: j */
    private static final HashMap f7031j = new HashMap();
    /* renamed from: k */
    private static Object f7032k;
    /* renamed from: l */
    private static boolean f7033l;
    /* renamed from: m */
    private static String[] f7034m = new String[0];

    /* renamed from: a */
    private static void m3776a(ContentResolver contentResolver) {
        if (f7027f == null) {
            f7022a.set(false);
            f7027f = new HashMap();
            f7032k = new Object();
            f7033l = false;
            contentResolver.registerContentObserver(f7023b, true, new ijf());
        } else if (f7022a.getAndSet(false)) {
            f7027f.clear();
            f7028g.clear();
            f7029h.clear();
            f7030i.clear();
            f7031j.clear();
            f7032k = new Object();
            f7033l = false;
        }
    }

    /* renamed from: a */
    public static boolean m3779a(ContentResolver contentResolver, String str, boolean z) {
        Object b = ije.m3780b(contentResolver);
        Object obj = (Boolean) ije.m3773a(f7028g, str, Boolean.valueOf(z));
        if (obj != null) {
            return obj.booleanValue();
        }
        Object a = ije.m3774a(contentResolver, str, null);
        if (!(a == null || a.equals(""))) {
            if (f7025d.matcher(a).matches()) {
                obj = Boolean.valueOf(true);
                z = true;
            } else if (f7026e.matcher(a).matches()) {
                obj = Boolean.valueOf(false);
                z = false;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("attempt to read gservices key ");
                stringBuilder.append(str);
                stringBuilder.append(" (value \"");
                stringBuilder.append(a);
                stringBuilder.append("\") as boolean");
                Log.w("Gservices", stringBuilder.toString());
            }
        }
        ije.m3778a(b, f7028g, str, obj);
        return z;
    }

    /* renamed from: a */
    public static float m3771a(ContentResolver contentResolver, String str, float f) {
        Object b = ije.m3780b(contentResolver);
        Object obj = (Float) ije.m3773a(f7031j, str, Float.valueOf(f));
        if (obj != null) {
            return obj.floatValue();
        }
        String a = ije.m3774a(contentResolver, str, null);
        if (a != null) {
            try {
                float parseFloat = Float.parseFloat(a);
                obj = Float.valueOf(parseFloat);
                f = parseFloat;
            } catch (NumberFormatException e) {
            }
        }
        ije.m3778a(b, f7031j, str, obj);
        return f;
    }

    /* renamed from: a */
    public static int m3772a(ContentResolver contentResolver, String str, int i) {
        Object b = ije.m3780b(contentResolver);
        Object obj = (Integer) ije.m3773a(f7029h, str, Integer.valueOf(i));
        if (obj != null) {
            return obj.intValue();
        }
        String a = ije.m3774a(contentResolver, str, null);
        if (a != null) {
            try {
                int parseInt = Integer.parseInt(a);
                obj = Integer.valueOf(parseInt);
                i = parseInt;
            } catch (NumberFormatException e) {
            }
        }
        ije.m3778a(b, f7029h, str, obj);
        return i;
    }

    /* renamed from: a */
    public static String m3774a(ContentResolver contentResolver, String str, String str2) {
        synchronized (ije.class) {
            ije.m3776a(contentResolver);
            Object obj = f7032k;
            String str3;
            if (f7027f.containsKey(str)) {
                str3 = (String) f7027f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                String[] strArr = f7034m;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (str.startsWith(strArr[i])) {
                        if (!f7033l || f7027f.isEmpty()) {
                            f7027f.putAll(ije.m3775a(contentResolver, f7034m));
                            f7033l = true;
                            if (f7027f.containsKey(str)) {
                                str3 = (String) f7027f.get(str);
                                if (str3 != null) {
                                    str2 = str3;
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
                Cursor query = contentResolver.query(f7023b, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            if (str3 != null && str3.equals(str2)) {
                                str3 = str2;
                            }
                            ije.m3777a(obj, str, str3);
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (query != null) {
                                query.close();
                            }
                        } else {
                            ije.m3777a(obj, str, null);
                            if (query != null) {
                                query.close();
                            }
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            query.close();
                        }
                    }
                } else if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static Map m3775a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f7024c, null, null, strArr, null);
        Map treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static java.lang.Object m3773a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
        r1 = p000.ije.class;
        monitor-enter(r1);
        r0 = r2.containsKey(r3);	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0012;
    L_0x0009:
        r0 = r2.get(r3);	 Catch:{ all -> 0x0015 }
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        r0 = r4;
    L_0x0010:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
    L_0x0011:
        return r0;
    L_0x0012:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        r0 = 0;
        goto L_0x0011;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ije.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    private static Object m3780b(ContentResolver contentResolver) {
        Object obj;
        synchronized (ije.class) {
            ije.m3776a(contentResolver);
            obj = f7032k;
        }
        return obj;
    }

    /* renamed from: a */
    private static void m3777a(Object obj, String str, String str2) {
        synchronized (ije.class) {
            if (obj == f7032k) {
                f7027f.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    private static void m3778a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (ije.class) {
            if (obj == f7032k) {
                hashMap.put(str, obj2);
                f7027f.remove(str);
            }
        }
    }
}
