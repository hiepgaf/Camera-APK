package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jbi */
final class jbi extends izy {
    /* renamed from: a */
    private final /* synthetic */ int f21834a;
    /* renamed from: b */
    private final /* synthetic */ jbg f21835b;

    jbi(jbg jbg, int i) {
        this.f21835b = jbg;
        this.f21834a = i;
    }

    public final /* synthetic */ void a_(Object obj) {
        jar jar = (jar) obj;
        jbg jbg = this.f21835b;
        jbg.f7634c[this.f21834a] = jar;
        jbg.f7636e = true;
        if (jbg.f7635d.decrementAndGet() != 0) {
            return;
        }
        if (jbg.f7636e) {
            jar[] jarArr = jbg.f7634c;
            int length = jarArr.length;
            jar jar2 = null;
            int i = 0;
            while (i < length) {
                Throwable th = jarArr[i];
                if (th == null) {
                    th = jar2;
                } else if (jar2 != null) {
                    kqg.m5044a(jar2, th);
                    th = jar2;
                }
                i++;
                Throwable th2 = th;
            }
            if (jar2 != null) {
                jbg.f7632a.m12762a(jar2);
                return;
            } else {
                jbg.f7632a.m12762a(jar.m4390a(new AssertionError("Result list was marked as having an exception,but no exception was found")));
                return;
            }
        }
        jbg.f7632a.m12763a(Arrays.asList(jbg.f7633b));
    }
}
