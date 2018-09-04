package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: cvn */
public final class cvn implements kov {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f12674a;
    /* renamed from: b */
    private final /* synthetic */ PeekableFilmstripLayout f12675b;

    public cvn(PeekableFilmstripLayout peekableFilmstripLayout, Bitmap bitmap) {
        this.f12675b = peekableFilmstripLayout;
        this.f12674a = bitmap;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m864a(PeekableFilmstripLayout.f12255a, "Exception waiting to show filmstrip", th);
    }

    public final /* synthetic */ void b_(Object obj) {
        bli.m863a(PeekableFilmstripLayout.f12255a, "Filmstrip is ready to show.");
        PeekableFilmstripLayout peekableFilmstripLayout = this.f12675b;
        Bitmap bitmap = this.f12674a;
        if (peekableFilmstripLayout.f12266l.mo766j()) {
            bli.m863a(PeekableFilmstripLayout.f12255a, "Activity paused/finishing. Aborting filmstrip show animation.");
            peekableFilmstripLayout.f12267m.set(false);
            return;
        }
        bli.m863a(PeekableFilmstripLayout.f12255a, "Running filmstrip show animation.");
        peekableFilmstripLayout.f12264j.mo3423w();
        peekableFilmstripLayout.f12260f.setVisibility(0);
        peekableFilmstripLayout.setVisibility(0);
        peekableFilmstripLayout.f12257c.setTranslationX((float) peekableFilmstripLayout.getMeasuredWidth());
        peekableFilmstripLayout.f12258d.f2350k.mo1077c();
        peekableFilmstripLayout.f12260f.m1244a(peekableFilmstripLayout.f12261g);
        peekableFilmstripLayout.f12260f.m1243a(bitmap, new cvo(peekableFilmstripLayout));
    }
}
