package p000;

import android.content.Context;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: czo */
public final class czo implements kwk {
    /* renamed from: a */
    private final kwk f12945a;
    /* renamed from: b */
    private final kwk f12946b;
    /* renamed from: c */
    private final kwk f12947c;

    public czo(czn czn, kwk kwk, kwk kwk2, kwk kwk3) {
        this.f12945a = kwk;
        this.f12946b = kwk2;
        this.f12947c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f12945a;
        kwk kwk2 = this.f12946b;
        return (bqq) ktm.m13963a(new bqq((Context) kwk.mo345a(), (View) ((het) kwk2.mo345a()).f6128h.m3223a((int) R.id.preview_overlay), (hke) this.f12947c.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
