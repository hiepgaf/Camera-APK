package p000;

import android.annotation.TargetApi;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jli */
public final class jli implements kov {
    /* renamed from: a */
    private final /* synthetic */ jbj f18926a;

    /* renamed from: a */
    private static /* synthetic */ void m12944a(Throwable th, DataInputStream dataInputStream) {
        if (th != null) {
            try {
                dataInputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        dataInputStream.close();
    }

    /* renamed from: a */
    public static /* synthetic */ void m12945a(Throwable th, DataOutputStream dataOutputStream) {
        if (th != null) {
            try {
                dataOutputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        dataOutputStream.close();
    }

    public jli(jbj jbj, jcc jcc) {
        this.f18926a = jbj;
    }

    /* renamed from: a */
    public static jaq m12940a(kpk kpk) {
        return new izz(kpk);
    }

    /* renamed from: a */
    public static jaq m12939a(Executor executor, Callable callable) {
        Object d = jbj.m12751d();
        try {
            executor.execute(new jav(d, callable, jcd.f18731b));
        } catch (Throwable e) {
            d.m12762a(jar.m4390a(e));
        }
        return d;
    }

    /* renamed from: b */
    public static jaq m12948b(Object obj) {
        return new jcb(obj);
    }

    /* renamed from: b */
    private static List m12950b(Iterable iterable) {
        List arrayList = new ArrayList();
        for (Object b : iterable) {
            arrayList.add(jli.m12948b(b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m12942a(Iterable iterable, Executor executor, jau jau) {
        Iterable<jaq> b = jli.m12950b(iterable);
        List arrayList = new ArrayList();
        for (jaq a : b) {
            arrayList.add(a.mo1975a(executor, jau));
        }
        return arrayList;
    }

    /* renamed from: c */
    private static List m12952c(Iterable iterable, Executor executor, izi izi) {
        List arrayList = new ArrayList();
        for (jaq a : iterable) {
            arrayList.add(a.mo1973a(executor, izi));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static jaq m12938a(Iterable iterable, Executor executor, izi izi) {
        return jli.m12937a(jli.m12952c(jli.m12950b(iterable), executor, izi));
    }

    /* renamed from: b */
    public static jaq m12947b(Iterable iterable, Executor executor, jau jau) {
        return jli.m12937a(jli.m12942a(iterable, executor, jau));
    }

    /* renamed from: b */
    public static jaq m12946b(Iterable iterable, Executor executor, izi izi) {
        return jli.m12937a(jli.m12952c(iterable, executor, izi));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static p000.jxm m12943a(java.io.File r10) {
        /*
        r1 = 0;
        r0 = new java.io.File;
        r2 = "metadatastore.bin";
        r0.<init>(r10, r2);
        r3 = new java.io.DataInputStream;
        r2 = new java.io.BufferedInputStream;
        r4 = new java.io.FileInputStream;
        r4.<init>(r0);
        r2.<init>(r4);
        r3.<init>(r2);
        r0 = r3.readInt();	 Catch:{ all -> 0x0044 }
        if (r0 > 0) goto L_0x004b;
    L_0x001d:
        r1 = new java.io.IOException;	 Catch:{ all -> 0x0044 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0044 }
        r4 = 61;
        r2.<init>(r4);	 Catch:{ all -> 0x0044 }
        r4 = "Unsupported serialization version (";
        r2.append(r4);	 Catch:{ all -> 0x0044 }
        r2.append(r0);	 Catch:{ all -> 0x0044 }
        r0 = ", minimum is ";
        r2.append(r0);	 Catch:{ all -> 0x0044 }
        r0 = 1;
        r2.append(r0);	 Catch:{ all -> 0x0044 }
        r0 = ")";
        r2.append(r0);	 Catch:{ all -> 0x0044 }
        r0 = r2.toString();	 Catch:{ all -> 0x0044 }
        r1.<init>(r0);	 Catch:{ all -> 0x0044 }
        throw r1;	 Catch:{ all -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0046 }
    L_0x0046:
        r1 = move-exception;
        p000.jli.m12944a(r0, r3);
        throw r1;
    L_0x004b:
        r4 = new jxm;	 Catch:{ all -> 0x0044 }
        r4.<init>();	 Catch:{ all -> 0x0044 }
        r5 = r3.readInt();	 Catch:{ all -> 0x0044 }
        r0 = r1;
    L_0x0055:
        if (r0 >= r5) goto L_0x007b;
    L_0x0057:
        r6 = new jxa;	 Catch:{ all -> 0x0044 }
        r6.<init>();	 Catch:{ all -> 0x0044 }
        r7 = r3.readInt();	 Catch:{ all -> 0x0044 }
        r2 = r1;
    L_0x0061:
        if (r2 < r7) goto L_0x0069;
    L_0x0063:
        r4.m4673a(r6);	 Catch:{ all -> 0x0044 }
        r0 = r0 + 1;
        goto L_0x0055;
    L_0x0069:
        r8 = r3.readUTF();	 Catch:{ all -> 0x0044 }
        r8 = p000.jxa.m4664a(r8);	 Catch:{ all -> 0x0044 }
        r9 = r8.mo2060a(r3);	 Catch:{ all -> 0x0044 }
        r6.m4666a(r8, r9);	 Catch:{ all -> 0x0044 }
        r2 = r2 + 1;
        goto L_0x0061;
    L_0x007b:
        r0 = 0;
        p000.jli.m12944a(r0, r3);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: jli.a(java.io.File):jxm");
    }

    /* renamed from: a */
    public static Object m12941a(jaq jaq) {
        Object b = jli.m12949b(jaq);
        if (b != null) {
            return b;
        }
        String valueOf = String.valueOf(jaq);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 55);
        stringBuilder.append("Attempting to get value of ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" which is not yet available!");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static Object m12949b(jaq jaq) {
        return jaq.mo1983c() ? jli.m12951c(jaq) : null;
    }

    /* renamed from: c */
    public static Object m12951c(jaq jaq) {
        try {
            return jli.m12953d(jaq);
        } catch (Throwable e) {
            throw new kqe(e);
        }
    }

    /* renamed from: d */
    public static Object m12953d(jaq jaq) {
        Object b;
        Object obj = null;
        while (true) {
            try {
                b = jaq.mo1982b();
                break;
            } catch (InterruptedException e) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
        return b;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f18926a.m12762a(jar.m4390a(th));
    }

    public final void b_(Object obj) {
        if (obj == null) {
            this.f18926a.m12762a(jar.m4390a(new NullPointerException("Function output is null")));
        } else {
            this.f18926a.m12763a(obj);
        }
    }

    /* renamed from: a */
    public static jaq m12936a(jaq jaq, jaq jaq2) {
        return jaq.mo1976a(kpq.f8410a, new jba(jaq2), new jax(jaq2));
    }

    /* renamed from: a */
    public static jaq m12937a(Iterable iterable) {
        boolean isEmpty;
        if (iterable instanceof Collection) {
            isEmpty = ((Collection) iterable).isEmpty();
        } else {
            isEmpty = iterable.iterator().hasNext() ^ 1;
        }
        if (isEmpty) {
            return jli.m12948b(Collections.emptyList());
        }
        return new jbg(iterable).f7632a;
    }
}
