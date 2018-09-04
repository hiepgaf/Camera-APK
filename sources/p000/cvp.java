package p000;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: cvp */
public final class cvp implements kov {
    /* renamed from: a */
    private final /* synthetic */ PeekableFilmstripLayout f12677a;

    public cvp(PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f12677a = peekableFilmstripLayout;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        throw new IllegalStateException("getImageViewFuture should not throw an exception.", th);
    }

    public final /* synthetic */ void b_(Object obj) {
        Bitmap a = PeekableFilmstripLayout.m8393a((ImageView) obj);
        jri.m13152b((Object) a);
        this.f12677a.f12260f.m1242a(a);
    }
}
