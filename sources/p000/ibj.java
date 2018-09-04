package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: ibj */
public class ibj {
    /* renamed from: a */
    public static final AtomicBoolean f6896a = new AtomicBoolean();
    /* renamed from: b */
    private static final Uri f6897b = Uri.parse("content://com.google.android.gsf.gservices");
    /* renamed from: c */
    private static final Uri f6898c = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* renamed from: d */
    private static HashMap f6899d;
    /* renamed from: e */
    private static Object f6900e;
    /* renamed from: f */
    private static boolean f6901f;
    /* renamed from: g */
    private static String[] f6902g = new String[0];

    static {
        Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }

    /* renamed from: a */
    public static long m3608a(ContentResolver contentResolver, String str) {
        long j = 0;
        String b = ibj.m3612b(contentResolver, str);
        if (b != null) {
            try {
                j = Long.parseLong(b);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    /* renamed from: a */
    private static void m3609a(ContentResolver contentResolver) {
        if (f6899d == null) {
            f6896a.set(false);
            f6899d = new HashMap();
            f6900e = new Object();
            f6901f = false;
            contentResolver.registerContentObserver(f6897b, true, new ibk());
        } else if (f6896a.getAndSet(false)) {
            f6899d.clear();
            f6900e = new Object();
            f6901f = false;
        }
    }

    /* renamed from: a */
    private static void m3611a(Object obj, String str, String str2) {
        synchronized (ibj.class) {
            if (obj == f6900e) {
                f6899d.put(str, str2);
            }
        }
    }

    /* renamed from: b */
    public static String m3612b(ContentResolver contentResolver, String str) {
        String str2 = null;
        synchronized (ibj.class) {
            ibj.m3609a(contentResolver);
            Object obj = f6900e;
            String str3;
            if (f6899d.containsKey(str)) {
                str3 = (String) f6899d.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                String[] strArr = f6902g;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (str.startsWith(strArr[i])) {
                        if (f6901f) {
                            if (f6899d.isEmpty()) {
                            }
                        }
                        ibj.m3614c(contentResolver, f6902g);
                        if (f6899d.containsKey(str)) {
                            str3 = (String) f6899d.get(str);
                            if (str3 != null) {
                                str2 = str3;
                            }
                        }
                    } else {
                        i++;
                    }
                }
                Cursor query = contentResolver.query(f6897b, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            if (str3 != null && str3.equals(null)) {
                                str3 = null;
                            }
                            ibj.m3611a(obj, str, str3);
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (query != null) {
                                query.close();
                            }
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            query.close();
                        }
                    }
                }
                ibj.m3611a(obj, str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    /* renamed from: b */
    private static Map m3613b(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f6898c, null, null, strArr, null);
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

    /* renamed from: c */
    private static void m3614c(ContentResolver contentResolver, String[] strArr) {
        f6899d.putAll(ibj.m3613b(contentResolver, strArr));
        f6901f = true;
    }

    /* renamed from: a */
    public static void m3610a(ContentResolver contentResolver, String... strArr) {
        if (r1 != 0) {
            synchronized (ibj.class) {
                String[] strArr2;
                ibj.m3609a(contentResolver);
                HashSet hashSet = new HashSet((((f6902g.length + r1) << 2) / 3) + 1);
                hashSet.addAll(Arrays.asList(f6902g));
                ArrayList arrayList = new ArrayList();
                for (Object obj : strArr) {
                    if (hashSet.add(obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    strArr2 = new String[0];
                } else {
                    f6902g = (String[]) hashSet.toArray(new String[hashSet.size()]);
                    strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (!f6901f || f6899d.isEmpty()) {
                    ibj.m3614c(contentResolver, f6902g);
                } else if (strArr2.length != 0) {
                    ibj.m3614c(contentResolver, strArr2);
                }
            }
        }
    }
}
