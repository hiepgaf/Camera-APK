package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: fhl */
public final class fhl implements kaw {
    /* renamed from: a */
    private final /* synthetic */ ikb f16023a;
    /* renamed from: b */
    private final /* synthetic */ fiq f16024b;

    public fhl(ikb ikb, fiq fiq) {
        this.f16023a = ikb;
        this.f16024b = fiq;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        iwg iwg = (iwg) obj;
        ikb ikb = this.f16023a;
        HandlerThread handlerThread = new HandlerThread("GcaMetadataHandler", -2);
        handlerThread.start();
        ikb.mo1879a(new ijz(handlerThread));
        Handler handler = new Handler(handlerThread.getLooper());
        fiq fiq = this.f16024b;
        return new fie(fiq.f4578a, fiq.f4579b, fiq.m2311a(iwg, handler));
    }
}
