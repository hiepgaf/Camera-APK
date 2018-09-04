package p000;

import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* renamed from: dvg */
public final class dvg implements kwk {
    /* renamed from: a */
    private final kwk f14611a;

    private dvg(kwk kwk) {
        this.f14611a = kwk;
    }

    /* renamed from: a */
    public static dvg m9446a(kwk kwk) {
        return new dvg(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ViewfinderJankSession) ktm.m13963a((ViewfinderJankSession) ((Instrumentation) this.f14611a.mo345a()).jankStats().create(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
