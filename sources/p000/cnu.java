package p000;

import com.google.android.libraries.smartburst.pipeline.Pipeline;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cnu */
final class cnu implements jau {
    /* renamed from: a */
    private final /* synthetic */ Pipeline f12203a;

    cnu(Pipeline pipeline) {
        this.f12203a = pipeline;
    }

    /* renamed from: a */
    public final jaq mo716a(Object obj, Executor executor) {
        return this.f12203a.process();
    }
}
