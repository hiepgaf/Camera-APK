package p000;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: gsv */
final class gsv implements kaw {
    /* renamed from: a */
    private final /* synthetic */ gst f17303a;

    gsv(gst gst) {
        this.f17303a = gst;
    }

    /* renamed from: a */
    private final Void m11487a(acr acr) {
        try {
            acr.m135c(this.f17303a.f5673b);
        } catch (IOException e) {
            bli.m866b(gst.f5672a, "Purge cache failed.");
        }
        return null;
    }
}
