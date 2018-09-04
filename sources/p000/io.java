package p000;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: io */
public class io {
    /* renamed from: a */
    private final LinkedHashMap f7191a;
    /* renamed from: b */
    private int f7192b;
    /* renamed from: c */
    private int f7193c;
    /* renamed from: d */
    private int f7194d;
    /* renamed from: e */
    private int f7195e;
    /* renamed from: f */
    private int f7196f;
    /* renamed from: g */
    private int f7197g;

    public io(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f7193c = i;
        this.f7191a = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: a */
    public final Object m3903a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.f7191a.get(obj);
            if (obj2 != null) {
                this.f7196f++;
                return obj2;
            }
            this.f7197g++;
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final java.lang.Object m3904a(java.lang.Object r5, java.lang.Object r6) {
        /*
        r4 = this;
        if (r5 == 0) goto L_0x0004;
    L_0x0002:
        if (r6 != 0) goto L_0x000c;
    L_0x0004:
        r0 = new java.lang.NullPointerException;
        r1 = "key == null || value == null";
        r0.<init>(r1);
        throw r0;
    L_0x000c:
        monitor-enter(r4);
        r0 = r4.f7194d;	 Catch:{ all -> 0x0095 }
        r0 = r0 + 1;
        r4.f7194d = r0;	 Catch:{ all -> 0x0095 }
        r0 = r4.f7192b;	 Catch:{ all -> 0x0095 }
        r0 = r0 + 1;
        r4.f7192b = r0;	 Catch:{ all -> 0x0095 }
        r0 = r4.f7191a;	 Catch:{ all -> 0x0095 }
        r1 = r0.put(r5, r6);	 Catch:{ all -> 0x0095 }
        if (r1 == 0) goto L_0x0027;
    L_0x0021:
        r0 = r4.f7192b;	 Catch:{ all -> 0x0095 }
        r0 = r0 + -1;
        r4.f7192b = r0;	 Catch:{ all -> 0x0095 }
    L_0x0027:
        monitor-exit(r4);	 Catch:{ all -> 0x0095 }
        r2 = r4.f7193c;
    L_0x002a:
        monitor-enter(r4);
        r0 = r4.f7192b;	 Catch:{ all -> 0x005a }
        if (r0 < 0) goto L_0x003b;
    L_0x002f:
        r0 = r4.f7191a;	 Catch:{ all -> 0x005a }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x005a }
        if (r0 == 0) goto L_0x005d;
    L_0x0037:
        r0 = r4.f7192b;	 Catch:{ all -> 0x005a }
        if (r0 == 0) goto L_0x005d;
    L_0x003b:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x005a }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005a }
        r1.<init>();	 Catch:{ all -> 0x005a }
        r2 = r4.getClass();	 Catch:{ all -> 0x005a }
        r2 = r2.getName();	 Catch:{ all -> 0x005a }
        r1.append(r2);	 Catch:{ all -> 0x005a }
        r2 = ".sizeOf() is reporting inconsistent results!";
        r1.append(r2);	 Catch:{ all -> 0x005a }
        r1 = r1.toString();	 Catch:{ all -> 0x005a }
        r0.<init>(r1);	 Catch:{ all -> 0x005a }
        throw r0;	 Catch:{ all -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x005a }
        throw r0;
    L_0x005d:
        r0 = r4.f7192b;	 Catch:{ all -> 0x005a }
        if (r0 <= r2) goto L_0x0069;
    L_0x0061:
        r0 = r4.f7191a;	 Catch:{ all -> 0x005a }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x005a }
        if (r0 == 0) goto L_0x006b;
    L_0x0069:
        monitor-exit(r4);	 Catch:{ all -> 0x005a }
        return r1;
    L_0x006b:
        r0 = r4.f7191a;	 Catch:{ all -> 0x005a }
        r0 = r0.entrySet();	 Catch:{ all -> 0x005a }
        r0 = r0.iterator();	 Catch:{ all -> 0x005a }
        r0 = r0.next();	 Catch:{ all -> 0x005a }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x005a }
        r3 = r0.getKey();	 Catch:{ all -> 0x005a }
        r0.getValue();	 Catch:{ all -> 0x005a }
        r0 = r4.f7191a;	 Catch:{ all -> 0x005a }
        r0.remove(r3);	 Catch:{ all -> 0x005a }
        r0 = r4.f7192b;	 Catch:{ all -> 0x005a }
        r0 = r0 + -1;
        r4.f7192b = r0;	 Catch:{ all -> 0x005a }
        r0 = r4.f7195e;	 Catch:{ all -> 0x005a }
        r0 = r0 + 1;
        r4.f7195e = r0;	 Catch:{ all -> 0x005a }
        monitor-exit(r4);	 Catch:{ all -> 0x005a }
        goto L_0x002a;
    L_0x0095:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0095 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.f7196f;
            int i3 = this.f7197g + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            }
            format = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f7193c), Integer.valueOf(this.f7196f), Integer.valueOf(this.f7197g), Integer.valueOf(i)});
        }
        return format;
    }
}
