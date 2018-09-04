package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bjo */
public final class bjo implements bjn {
    /* renamed from: a */
    public static final String f10962a = bli.m862a("CdrMediaRecStop");
    /* renamed from: b */
    public final Executor f10963b;
    /* renamed from: c */
    public final biw f10964c;
    /* renamed from: d */
    private final ijx f10965d;

    public bjo(ijx ijx, Executor executor, biw biw) {
        this.f10965d = ijx;
        this.f10963b = executor;
        this.f10964c = biw;
    }

    /* renamed from: a */
    public final kpk mo506a(bhj bhj, boolean z) {
        kpk d = kpw.m18056d();
        this.f10965d.execute(new bjp(this, bhj, d));
        return d;
    }
}
