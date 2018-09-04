package p000;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(24)
/* compiled from: PG */
/* renamed from: bqv */
public final class bqv implements bls, kwk {
    /* renamed from: a */
    private final Context f11196a;
    /* renamed from: b */
    private final iqz f11197b;
    /* renamed from: c */
    private final Map f11198c = new HashMap();
    /* renamed from: d */
    private File f11199d;

    /* renamed from: a */
    private static /* synthetic */ void m7671a(Throwable th, FileReader fileReader) {
        if (th != null) {
            try {
                fileReader.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fileReader.close();
    }

    public bqv(Context context, blx blx, iqz iqz) {
        this.f11196a = context;
        this.f11197b = iqz.mo512a("ShotTracker");
    }

    /* renamed from: b */
    public final synchronized boolean mo564b() {
        boolean z;
        int i = false;
        synchronized (this) {
            if (this.f11198c.isEmpty()) {
                File[] listFiles = m7673c().listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    if (length != 0) {
                        while (i < length) {
                            File file = listFiles[i];
                            iqz iqz = this.f11197b;
                            String valueOf = String.valueOf(file);
                            String a = bqv.m7670a(file);
                            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(a).length());
                            stringBuilder.append("Failed to persist shot: ");
                            stringBuilder.append(valueOf);
                            stringBuilder.append("\n");
                            stringBuilder.append(a);
                            iqz.mo516c(stringBuilder.toString());
                            jqk.m13095a(file.delete());
                            i++;
                        }
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: e */
    private final btf m7674e(String str) {
        if (this.f11198c.containsKey(str)) {
            btf f = m7675f(str);
            String valueOf = String.valueOf(str);
            String str2 = "create() on a shot that already exists: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            f.m7731a(valueOf);
            return f;
        }
        btf btf = new btf(new File(m7673c(), str), str, this.f11197b);
        this.f11198c.put(str, btf);
        return btf;
    }

    /* renamed from: c */
    private final File m7673c() {
        boolean z = true;
        File file = this.f11199d;
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f11196a.getExternalCacheDir(), "dbg-shot-tracker");
        if (!(file2.exists() || file2.mkdir())) {
            z = false;
        }
        jqk.m13095a(z);
        this.f11199d = file2;
        return this.f11199d;
    }

    /* renamed from: a */
    private static String m7670a(File file) {
        try {
            return bqv.m7672b(file);
        } catch (IOException e) {
            return "";
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: f */
    private final btf m7675f(String str) {
        if (this.f11198c.containsKey(str)) {
            return (btf) this.f11198c.get(str);
        }
        btf e = m7674e(str);
        String valueOf = String.valueOf(str);
        String str2 = "get() on a shot that does not exist: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        e.m7731a(valueOf);
        return e;
    }

    /* renamed from: a */
    public final synchronized void mo562a(String str, String str2) {
        if (this.f11198c.containsKey(str)) {
            m7675f(str).m7731a(str2);
        } else {
            this.f11197b.mo520f(String.format(null, "Tried to log '%s' to nonexistent shot: %s.  Maybe it was already deleted", new Object[]{str2, str}));
        }
    }

    /* renamed from: a */
    public final synchronized void mo561a(String str) {
        m7675f(str).m7732b();
    }

    /* renamed from: b */
    public final synchronized void mo563b(String str) {
        m7675f(str).m7732b();
    }

    /* renamed from: c */
    public final synchronized void mo565c(String str) {
        m7675f(str).m7732b();
    }

    /* renamed from: d */
    public final synchronized void mo566d(String str) {
        m7674e(str).m7731a("#onShotStarted");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static java.lang.String m7672b(java.io.File r8) {
        /*
        r1 = new java.io.FileReader;
        r1.<init>(r8);
        r2 = r8.length();	 Catch:{ all -> 0x0028 }
        r0 = (int) r2;	 Catch:{ all -> 0x0028 }
        r2 = new char[r0];	 Catch:{ all -> 0x0028 }
        r0 = r1.read(r2);	 Catch:{ all -> 0x0028 }
        r4 = (long) r0;	 Catch:{ all -> 0x0028 }
        r6 = r8.length();	 Catch:{ all -> 0x0028 }
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x0026;
    L_0x0019:
        r0 = 1;
    L_0x001a:
        p000.jqk.m13095a(r0);	 Catch:{ all -> 0x0028 }
        r0 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0028 }
        r2 = 0;
        p000.bqv.m7671a(r2, r1);
        return r0;
    L_0x0026:
        r0 = 0;
        goto L_0x001a;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002a }
    L_0x002a:
        r2 = move-exception;
        p000.bqv.m7671a(r0, r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bqv.b(java.io.File):java.lang.String");
    }
}
