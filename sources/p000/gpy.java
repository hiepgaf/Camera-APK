package p000;

import java.util.TimerTask;

/* compiled from: PG */
/* renamed from: gpy */
final class gpy extends TimerTask {
    /* renamed from: a */
    private final /* synthetic */ kpw f5620a;
    /* renamed from: b */
    private final /* synthetic */ int f5621b;
    /* renamed from: c */
    private final /* synthetic */ float f5622c = 0.6f;
    /* renamed from: d */
    private final /* synthetic */ gpv f5623d;

    gpy(gpv gpv, kpw kpw, int i) {
        this.f5623d = gpv;
        this.f5620a = kpw;
        this.f5621b = i;
    }

    public final void run() {
        this.f5620a.mo3557a(Integer.valueOf(this.f5623d.m11302a(this.f5621b, this.f5622c, -1)));
    }
}
