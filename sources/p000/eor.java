package p000;

import android.app.Application;

/* compiled from: PG */
/* renamed from: eor */
public class eor extends Application {
    /* renamed from: f */
    public final enf f3992f = new enf();

    public void onCreate() {
        enf enf = this.f3992f;
        enf.f15298b = enf.m9761a(new eng());
        super.onCreate();
    }

    public void onTerminate() {
        enf enf = this.f3992f;
        enf.m9763b(enf.f15298b);
        for (eol eol : enf.f15297a) {
            if (eol instanceof eno) {
                ((eno) eol).m1902a();
            }
        }
        super.onTerminate();
    }
}
