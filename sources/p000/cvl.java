package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: cvl */
public final class cvl implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ PeekableFilmstripLayout f2807a;

    public cvl(PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f2807a = peekableFilmstripLayout;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        motionEvent.setLocation(motionEvent.getX() + this.f2807a.f12257c.getX(), motionEvent.getY() + this.f2807a.f12257c.getY());
        return this.f2807a.f12259e.f12630a.mo1081a(motionEvent);
    }
}
