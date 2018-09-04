package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jbh */
final class jbh extends izy {
    /* renamed from: a */
    private final /* synthetic */ int f21832a;
    /* renamed from: b */
    private final /* synthetic */ jbg f21833b;

    jbh(jbg jbg, int i) {
        this.f21833b = jbg;
        this.f21832a = i;
    }

    public final void a_(Object obj) {
        jbg jbg = this.f21833b;
        jbg.f7633b[this.f21832a] = obj;
        if (jbg.f7635d.decrementAndGet() != 0) {
            return;
        }
        if (jbg.f7636e) {
            jar[] jarArr = jbg.f7634c;
            int length = jarArr.length;
            jar jar = null;
            int i = 0;
            while (i < length) {
                Throwable th = jarArr[i];
                if (th == null) {
                    th = jar;
                } else if (jar != null) {
                    kqg.m5044a(jar, th);
                    th = jar;
                }
                i++;
                Throwable th2 = th;
            }
            if (jar != null) {
                jbg.f7632a.m12762a(jar);
                return;
            } else {
                jbg.f7632a.m12762a(jar.m4390a(new AssertionError("Result list was marked as having an exception,but no exception was found")));
                return;
            }
        }
        jbg.f7632a.m12763a(Arrays.asList(jbg.f7633b));
    }
}
