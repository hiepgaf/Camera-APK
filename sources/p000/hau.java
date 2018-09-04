package p000;

import android.view.Window;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hau */
public final class hau implements emw, eof, eoh, eol, hat {
    /* renamed from: a */
    private static final String f17608a = bli.m862a("ScreenOnController");
    /* renamed from: b */
    private static final long f17609b = 120000;
    /* renamed from: c */
    private final Window f17610c;
    /* renamed from: d */
    private final ikp f17611d;
    /* renamed from: e */
    private final Runnable f17612e;
    /* renamed from: f */
    private boolean f17613f = true;
    /* renamed from: g */
    private int f17614g = go.bp;
    /* renamed from: h */
    private int f17615h = go.bp;

    public hau(ikd ikd, Window window, ScheduledExecutorService scheduledExecutorService) {
        this.f17610c = window;
        this.f17611d = new ikp(scheduledExecutorService, f17609b, TimeUnit.MILLISECONDS);
        this.f17612e = new haw(ikd, new hav(this));
    }

    /* renamed from: g */
    public final void mo379g() {
        this.f17613f = true;
        this.f17615h = go.bp;
        m11723d();
    }

    /* renamed from: h */
    public final void mo380h() {
        this.f17613f = false;
        m11723d();
    }

    /* renamed from: a */
    public final void mo1699a() {
        if (this.f17614g != go.br) {
            mo1701c();
        }
    }

    /* renamed from: b */
    public final void mo1700b() {
        this.f17615h = go.br;
        m11719e();
    }

    /* renamed from: c */
    public final void mo1701c() {
        this.f17615h = go.bq;
        m11719e();
    }

    /* renamed from: d */
    final void m11723d() {
        ikd.m12259a();
        if (this.f17615h == go.bp && this.f17614g != go.bp) {
            this.f17610c.clearFlags(128);
            bli.m863a(f17608a, "Removed FLAG_KEEP_SCREEN_ON");
        }
        if (this.f17615h != go.bp && this.f17614g == go.bp) {
            this.f17610c.addFlags(128);
            bli.m863a(f17608a, "Added FLAG_KEEP_SCREEN_ON");
        }
        this.f17611d.m12262a();
        if (this.f17615h == go.bq) {
            this.f17611d.execute(this.f17612e);
        }
        this.f17614g = this.f17615h;
    }

    /* renamed from: e */
    private final void m11719e() {
        if (!this.f17613f) {
            m11723d();
        }
    }
}
