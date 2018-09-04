package p000;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ahe */
public final class ahe implements agw {
    /* renamed from: a */
    private static final Config f9784a = Config.ARGB_8888;
    /* renamed from: b */
    private final ahg f9785b;
    /* renamed from: c */
    private final Set f9786c;
    /* renamed from: d */
    private final long f9787d;
    /* renamed from: e */
    private long f9788e;
    /* renamed from: f */
    private long f9789f;
    /* renamed from: g */
    private int f9790g;
    /* renamed from: h */
    private int f9791h;
    /* renamed from: i */
    private int f9792i;
    /* renamed from: j */
    private int f9793j;

    public ahe(long j) {
        ahg ahi = new ahi();
        Set hashSet = new HashSet(Arrays.asList(Config.values()));
        hashSet.add(null);
        hashSet.remove(Config.HARDWARE);
        this(j, ahi, Collections.unmodifiableSet(hashSet));
    }

    private ahe(long j, ahg ahg, Set set) {
        this.f9787d = j;
        this.f9788e = j;
        this.f9785b = ahg;
        this.f9786c = set;
        ahf ahf = new ahf();
    }

    /* renamed from: a */
    public final void mo60a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m6444a(0);
    }

    /* renamed from: c */
    private static Bitmap m6446c(int i, int i2, Config config) {
        if (config == null) {
            config = f9784a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: b */
    private final void m6445b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m6447c();
        }
    }

    /* renamed from: c */
    private final void m6447c() {
        int i = this.f9790g;
        int i2 = this.f9791h;
        int i3 = this.f9792i;
        int i4 = this.f9793j;
        long j = this.f9789f;
        long j2 = this.f9788e;
        String valueOf = String.valueOf(this.f9785b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 151);
        stringBuilder.append("Hits=");
        stringBuilder.append(i);
        stringBuilder.append(", misses=");
        stringBuilder.append(i2);
        stringBuilder.append(", puts=");
        stringBuilder.append(i3);
        stringBuilder.append(", evictions=");
        stringBuilder.append(i4);
        stringBuilder.append(", currentSize=");
        stringBuilder.append(j);
        stringBuilder.append(", maxSize=");
        stringBuilder.append(j2);
        stringBuilder.append("\nStrategy=");
        stringBuilder.append(valueOf);
        Log.v("LruBitmapPool", stringBuilder.toString());
    }

    /* renamed from: d */
    private final void m6449d() {
        m6444a(this.f9788e);
    }

    /* renamed from: a */
    public final Bitmap mo59a(int i, int i2, Config config) {
        Bitmap d = m6448d(i, i2, config);
        if (d == null) {
            return ahe.m6446c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    /* renamed from: b */
    public final Bitmap mo64b(int i, int i2, Config config) {
        Bitmap d = m6448d(i, i2, config);
        if (d == null) {
            return ahe.m6446c(i, i2, config);
        }
        return d;
    }

    /* renamed from: d */
    private final synchronized Bitmap m6448d(int i, int i2, Config config) {
        Bitmap a;
        if (config == Config.HARDWARE) {
            String valueOf = String.valueOf(config);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 176);
            stringBuilder.append("Cannot create a mutable Bitmap with config: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Config config2;
        String valueOf2;
        String str;
        ahg ahg = this.f9785b;
        if (config == null) {
            config2 = f9784a;
        } else {
            config2 = config;
        }
        a = ahg.mo75a(i, i2, config2);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                valueOf2 = String.valueOf(this.f9785b.mo76b(i, i2, config));
                str = "Missing bitmap=";
                if (valueOf2.length() == 0) {
                    valueOf2 = new String(str);
                } else {
                    valueOf2 = str.concat(valueOf2);
                }
                Log.d("LruBitmapPool", valueOf2);
            }
            this.f9791h++;
        } else {
            this.f9790g++;
            this.f9789f -= (long) this.f9785b.mo73a(a);
            a.setHasAlpha(true);
            a.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            valueOf2 = String.valueOf(this.f9785b.mo76b(i, i2, config));
            str = "Get bitmap=";
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str);
            } else {
                valueOf2 = str.concat(valueOf2);
            }
            Log.v("LruBitmapPool", valueOf2);
        }
        m6445b();
        return a;
    }

    /* renamed from: a */
    public final synchronized void mo63a(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        } else if (bitmap.isMutable() && ((long) this.f9785b.mo73a(bitmap)) <= this.f9788e && this.f9786c.contains(bitmap.getConfig())) {
            int a = this.f9785b.mo73a(bitmap);
            this.f9785b.mo78c(bitmap);
            this.f9792i++;
            this.f9789f = ((long) a) + this.f9789f;
            if (Log.isLoggable("LruBitmapPool", 2)) {
                r0 = String.valueOf(this.f9785b.mo77b(bitmap));
                String str = "Put bitmap in pool=";
                if (r0.length() == 0) {
                    r0 = new String(str);
                } else {
                    r0 = str.concat(r0);
                }
                Log.v("LruBitmapPool", r0);
            }
            m6445b();
            m6449d();
        } else {
            if (Log.isLoggable("LruBitmapPool", 2)) {
                r0 = this.f9785b.mo77b(bitmap);
                boolean isMutable = bitmap.isMutable();
                boolean contains = this.f9786c.contains(bitmap.getConfig());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(r0).length() + 78);
                stringBuilder.append("Reject bitmap from pool, bitmap: ");
                stringBuilder.append(r0);
                stringBuilder.append(", is mutable: ");
                stringBuilder.append(isMutable);
                stringBuilder.append(", is allowed config: ");
                stringBuilder.append(contains);
                Log.v("LruBitmapPool", stringBuilder.toString());
            }
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public final synchronized void mo61a(float f) {
        this.f9788e = (long) Math.round(((float) this.f9787d) * f);
        m6449d();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public final void mo62a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder stringBuilder = new StringBuilder(29);
            stringBuilder.append("trimMemory, level=");
            stringBuilder.append(i);
            Log.d("LruBitmapPool", stringBuilder.toString());
        }
        if (i >= 40) {
            mo60a();
        } else if (i >= 20 || i == 15) {
            m6444a(this.f9788e / 2);
        }
    }

    /* renamed from: a */
    private final synchronized void m6444a(long j) {
        while (this.f9789f > j) {
            Bitmap a = this.f9785b.mo74a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m6447c();
                }
                this.f9789f = 0;
            } else {
                this.f9789f -= (long) this.f9785b.mo73a(a);
                this.f9793j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    String valueOf = String.valueOf(this.f9785b.mo77b(a));
                    String str = "Evicting bitmap=";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    Log.d("LruBitmapPool", valueOf);
                }
                m6445b();
                a.recycle();
            }
        }
    }
}
