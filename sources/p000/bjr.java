package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bjr */
public final class bjr implements bjn {
    /* renamed from: a */
    public static final String f10966a = bli.m862a("CdrMediaRecStop");
    /* renamed from: b */
    public final biw f10967b;
    /* renamed from: c */
    public final bhx f10968c;
    /* renamed from: d */
    private final Executor f10969d;

    public bjr(Executor executor, biw biw, bhx bhx) {
        this.f10969d = executor;
        this.f10967b = biw;
        this.f10968c = bhx;
    }

    /* renamed from: a */
    public final kpk mo506a(bhj bhj, boolean z) {
        kpk d = kpw.m18056d();
        this.f10969d.execute(new bjs(this, d));
        if (z) {
            bli.m863a(f10966a, "Restart the preview after MediaRecorder is stopped");
            kow.m13622a(d, new bjt(this), kpq.f8410a);
        }
        return d;
    }
}
