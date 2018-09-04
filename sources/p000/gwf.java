package p000;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: gwf */
public final class gwf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Context f5718a;
    /* renamed from: b */
    private final /* synthetic */ kpw f5719b;

    public gwf(Context context, kpw kpw) {
        this.f5718a = context;
        this.f5719b = kpw;
    }

    public final void run() {
        try {
            this.f5719b.mo3557a(acr.m125a(new File(this.f5718a.getCacheDir(), "indicatorDiskCache"), 5000000));
        } catch (Throwable e) {
            this.f5719b.m17780a(e);
        }
    }
}
