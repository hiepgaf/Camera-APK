package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gwi */
public final class gwi implements kwk {
    /* renamed from: a */
    private final kwk f17465a;
    /* renamed from: b */
    private final kwk f17466b;
    /* renamed from: c */
    private final kwk f17467c;

    public gwi(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f17465a = kwk;
        this.f17466b = kwk2;
        this.f17467c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f17465a;
        kwk kwk2 = this.f17466b;
        Executor executor = (Executor) kwk2.mo345a();
        ira ira = (ira) this.f17467c.mo345a();
        return (gst) ktm.m13963a(new gst((kpk) kwk.mo345a(), "indicatorThumbnail", executor, new gsr(), new gly(ira)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
