package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: aau */
public final class aau implements aat {
    /* renamed from: a */
    public final aat f9602a;
    /* renamed from: b */
    private final Handler f9603b;

    aau(Handler handler, aat aat) {
        this.f9603b = handler;
        this.f9602a = aat;
    }

    /* renamed from: a */
    public final void mo4a() {
        this.f9603b.post(new aav(this));
    }
}
