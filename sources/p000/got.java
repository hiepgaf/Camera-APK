package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.google.android.apps.camera.backup.CameraBackupAgent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: got */
public final class got extends gos {
    /* renamed from: a */
    private static final String f17164a = bli.m862a("SettingsManager");
    /* renamed from: b */
    private final Object f17165b = new Object();
    /* renamed from: c */
    private final Context f17166c;
    /* renamed from: d */
    private final String f17167d;
    /* renamed from: e */
    private final SharedPreferences f17168e;
    /* renamed from: f */
    private SharedPreferences f17169f;
    /* renamed from: g */
    private String f17170g = null;
    /* renamed from: h */
    private final List f17171h = new ArrayList();
    /* renamed from: i */
    private final List f17172i = new ArrayList();

    public got(Context context, SharedPreferences sharedPreferences, irs irs) {
        goh goh = new goh();
        this.f17166c = context;
        this.f17167d = this.f17166c.getPackageName();
        this.f17168e = sharedPreferences;
        CameraBackupAgent.f12221a = irs;
        mo1529a(new gou(context));
    }

    /* renamed from: a */
    public final void mo1529a(gol gol) {
        jqk.m13102c(this.f17165b);
        jqk.m13102c(this.f17172i);
        jqk.m13102c(this.f17168e);
        synchronized (this.f17165b) {
            if (this.f17171h.contains(gol)) {
                return;
            }
            this.f17171h.add(gol);
            OnSharedPreferenceChangeListener gov = new gov(gol);
            this.f17172i.add(gov);
            this.f17168e.registerOnSharedPreferenceChangeListener(gov);
            SharedPreferences sharedPreferences = this.f17169f;
            if (sharedPreferences != null) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(gov);
            }
            String str = f17164a;
            String valueOf = String.valueOf(this.f17171h);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
            stringBuilder.append("listeners: ");
            stringBuilder.append(valueOf);
            bli.m871d(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo1535a(String str, String str2) {
        boolean a;
        synchronized (this.f17165b) {
            a = mo1536a(str, str2, m11253d(str2));
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo1536a(String str, String str2, boolean z) {
        synchronized (this.f17165b) {
            String str3;
            if (z) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            str3 = m11252b(str, str2, str3);
            if (str3 == null) {
            } else {
                z = Integer.parseInt(str3) != 0;
            }
        }
        return z;
    }

    /* renamed from: d */
    private final boolean m11253d(String str) {
        boolean z = false;
        synchronized (this.f17165b) {
            String a = goh.m2656a(str);
            if (!(a == null || Integer.parseInt(a) == 0)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final SharedPreferences mo1528a() {
        SharedPreferences sharedPreferences;
        synchronized (this.f17165b) {
            sharedPreferences = this.f17168e;
        }
        return sharedPreferences;
    }

    /* renamed from: b */
    public final int mo1537b(String str, String str2) {
        int i;
        synchronized (this.f17165b) {
            String[] b = goh.m2658b(str2);
            if (b == null || b.length == 0) {
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length());
                stringBuilder.append("No possible values for scope=");
                stringBuilder.append(str);
                stringBuilder.append(" key=");
                stringBuilder.append(str2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            String d = mo1543d(str, str2);
            i = 0;
            while (i < b.length) {
                if (d == null || !d.equals(b[i])) {
                    i++;
                }
            }
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 60) + String.valueOf(str2).length());
            stringBuilder.append("Current value for scope=");
            stringBuilder.append(str);
            stringBuilder.append(" key=");
            stringBuilder.append(str2);
            stringBuilder.append(" not in list of possible values");
            throw new IllegalStateException(stringBuilder.toString());
        }
        return i;
    }

    /* renamed from: c */
    public final int mo1541c(String str, String str2) {
        int a;
        synchronized (this.f17165b) {
            a = mo1527a(str, str2, m11254e(str2));
        }
        return a;
    }

    /* renamed from: a */
    public final int mo1527a(String str, String str2, Integer num) {
        int intValue;
        synchronized (this.f17165b) {
            String b = m11252b(str, str2, Integer.toString(num.intValue()));
            if (b == null) {
                intValue = num.intValue();
            } else {
                intValue = Integer.parseInt(b);
            }
        }
        return intValue;
    }

    /* renamed from: e */
    private final Integer m11254e(String str) {
        Integer valueOf;
        synchronized (this.f17165b) {
            String a = goh.m2656a(str);
            valueOf = Integer.valueOf(a != null ? Integer.parseInt(a) : 0);
        }
        return valueOf;
    }

    /* renamed from: f */
    private final SharedPreferences m11255f(String str) {
        SharedPreferences sharedPreferences;
        synchronized (this.f17165b) {
            if (str.equals("default_scope")) {
                sharedPreferences = this.f17168e;
            } else if (str.equals(this.f17170g)) {
                sharedPreferences = this.f17169f;
            } else {
                SharedPreferences sharedPreferences2 = this.f17169f;
                if (sharedPreferences2 != null) {
                    synchronized (this.f17165b) {
                        for (OnSharedPreferenceChangeListener unregisterOnSharedPreferenceChangeListener : this.f17172i) {
                            sharedPreferences2.unregisterOnSharedPreferenceChangeListener(unregisterOnSharedPreferenceChangeListener);
                        }
                        this.f17170g = null;
                    }
                }
                this.f17169f = mo1542c(str);
                sharedPreferences = this.f17169f;
            }
        }
        return sharedPreferences;
    }

    /* renamed from: d */
    public final String mo1543d(String str, String str2) {
        String b;
        synchronized (this.f17165b) {
            b = m11252b(str, str2, m11256g(str2));
        }
        return b;
    }

    /* renamed from: b */
    private final String m11252b(String str, String str2, String str3) {
        synchronized (this.f17165b) {
            SharedPreferences f = m11255f(str);
            try {
                str3 = f.getString(str2, str3);
            } catch (Throwable e) {
                bli.m874e(f17164a, "existing preference with invalid type, removing and returning default", e);
                f.edit().remove(str2).apply();
            }
        }
        return str3;
    }

    /* renamed from: g */
    private final String m11256g(String str) {
        String a;
        synchronized (this.f17165b) {
            a = goh.m2656a(str);
        }
        return a;
    }

    /* renamed from: e */
    public final boolean mo1544e(String str, String str2) {
        boolean contains;
        synchronized (this.f17165b) {
            contains = m11255f(str).contains(str2);
        }
        return contains;
    }

    /* renamed from: c */
    public final SharedPreferences mo1542c(String str) {
        SharedPreferences sharedPreferences;
        synchronized (this.f17165b) {
            Context context = this.f17166c;
            String valueOf = String.valueOf(this.f17167d);
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() == 0) {
                valueOf2 = new String(valueOf);
            } else {
                valueOf2 = valueOf.concat(valueOf2);
            }
            sharedPreferences = context.getSharedPreferences(valueOf2, 0);
            for (OnSharedPreferenceChangeListener registerOnSharedPreferenceChangeListener : this.f17172i) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(registerOnSharedPreferenceChangeListener);
            }
            this.f17170g = str;
        }
        return sharedPreferences;
    }

    /* renamed from: f */
    public final void mo1545f(String str, String str2) {
        synchronized (this.f17165b) {
            m11255f(str).edit().remove(str2).apply();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final void mo1538b(p000.gol r5) {
        /*
        r4 = this;
        r0 = r4.f17165b;
        p000.jqk.m13102c(r0);
        r0 = r4.f17172i;
        p000.jqk.m13102c(r0);
        r0 = r4.f17168e;
        p000.jqk.m13102c(r0);
        r1 = r4.f17165b;
        monitor-enter(r1);
        if (r5 != 0) goto L_0x001d;
    L_0x0014:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x001a }
        r0.<init>();	 Catch:{ all -> 0x001a }
        throw r0;	 Catch:{ all -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r0;
    L_0x001d:
        r0 = r4.f17171h;	 Catch:{ all -> 0x001a }
        r0 = r0.contains(r5);	 Catch:{ all -> 0x001a }
        if (r0 != 0) goto L_0x0027;
    L_0x0025:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
    L_0x0026:
        return;
    L_0x0027:
        r0 = r4.f17171h;	 Catch:{ all -> 0x001a }
        r2 = r0.indexOf(r5);	 Catch:{ all -> 0x001a }
        r0 = r4.f17171h;	 Catch:{ all -> 0x001a }
        r0.remove(r5);	 Catch:{ all -> 0x001a }
        r0 = r4.f17172i;	 Catch:{ all -> 0x001a }
        r0 = r0.get(r2);	 Catch:{ all -> 0x001a }
        r0 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r0;	 Catch:{ all -> 0x001a }
        r3 = r4.f17172i;	 Catch:{ all -> 0x001a }
        r3.remove(r2);	 Catch:{ all -> 0x001a }
        r2 = r4.f17168e;	 Catch:{ all -> 0x001a }
        r2.unregisterOnSharedPreferenceChangeListener(r0);	 Catch:{ all -> 0x001a }
        r2 = r4.f17169f;	 Catch:{ all -> 0x001a }
        if (r2 == 0) goto L_0x004b;
    L_0x0048:
        r2.unregisterOnSharedPreferenceChangeListener(r0);	 Catch:{ all -> 0x001a }
    L_0x004b:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: got.b(gol):void");
    }

    /* renamed from: a */
    public final void mo1531a(String str, String str2, int i) {
        synchronized (this.f17165b) {
            mo1532a(str, str2, Integer.toString(i));
        }
    }

    /* renamed from: a */
    public final void mo1532a(String str, String str2, String str3) {
        synchronized (this.f17165b) {
            m11255f(str).edit().putString(str2, str3).apply();
        }
    }

    /* renamed from: b */
    public final void mo1540b(String str, String str2, boolean z) {
        synchronized (this.f17165b) {
            mo1532a(str, str2, gos.m2670a(z));
        }
    }

    /* renamed from: a */
    public final void mo1530a(String str, int i, int[] iArr) {
        synchronized (this.f17165b) {
            String num = Integer.toString(i);
            String[] strArr = new String[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                strArr[i2] = Integer.toString(iArr[i2]);
            }
            goh.m2657a(str, num, strArr);
        }
    }

    /* renamed from: a */
    public final void mo1533a(String str, String str2, String[] strArr) {
        synchronized (this.f17165b) {
            goh.m2657a(str, str2, strArr);
        }
    }

    /* renamed from: a */
    public final void mo1534a(String str, boolean z) {
        synchronized (this.f17165b) {
            String str2;
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            goh.m2657a(str, str2, new String[]{"0", "1"});
        }
    }

    /* renamed from: g */
    public final void mo1546g(String str, String str2) {
        synchronized (this.f17165b) {
            String g = m11256g(str2);
            if (g != null) {
                mo1532a(str, str2, g);
            }
        }
    }

    /* renamed from: b */
    public final void mo1539b(String str, String str2, int i) {
        synchronized (this.f17165b) {
            StringBuilder stringBuilder;
            String[] b = goh.m2658b(str2);
            if (b != null) {
                int length = b.length;
                if (length != 0) {
                    if (i < 0 || i >= length) {
                        stringBuilder = new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length());
                        stringBuilder.append("For possible values of scope=");
                        stringBuilder.append(str);
                        stringBuilder.append(" key=");
                        stringBuilder.append(str2);
                        throw new IndexOutOfBoundsException(stringBuilder.toString());
                    }
                    mo1532a(str, str2, b[i]);
                }
            }
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length());
            stringBuilder.append("No possible values for scope=");
            stringBuilder.append(str);
            stringBuilder.append(" key=");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
