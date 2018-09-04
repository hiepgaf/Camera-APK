package p000;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* renamed from: hkb */
public final class hkb implements kwk {
    /* renamed from: a */
    private final kwk f17917a;

    public hkb(hka hka, kwk kwk) {
        this.f17917a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return Boolean.valueOf(((UserManager) ((Context) this.f17917a.mo345a()).getSystemService("user")).isDemoUser());
    }
}
