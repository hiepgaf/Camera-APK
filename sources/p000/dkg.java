package p000;

import android.app.NotificationManager;
import android.media.AudioManager;

/* compiled from: PG */
/* renamed from: dkg */
public final class dkg implements kwk {
    /* renamed from: a */
    private final kwk f13520a;
    /* renamed from: b */
    private final kwk f13521b;
    /* renamed from: c */
    private final kwk f13522c;
    /* renamed from: d */
    private final kwk f13523d;

    public dkg(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f13520a = kwk;
        this.f13521b = kwk2;
        this.f13522c = kwk3;
        this.f13523d = kwk4;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f13520a;
        kwk kwk2 = this.f13521b;
        kwk kwk3 = this.f13522c;
        AudioManager audioManager = (AudioManager) kwk.mo345a();
        gpn gpn = (gpn) kwk2.mo345a();
        NotificationManager notificationManager = (NotificationManager) kwk3.mo345a();
        this.f13523d.mo345a();
        return new dke(audioManager, gpn, notificationManager);
    }
}
