package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ism */
final class ism implements iri {
    /* renamed from: a */
    private final AtomicBoolean f18557a = new AtomicBoolean(false);
    /* renamed from: b */
    private final iur f18558b;
    /* renamed from: c */
    private final /* synthetic */ irh f18559c;

    ism(irh irh, iur iur) {
        this.f18559c = irh;
        this.f18558b = iur;
    }

    /* renamed from: a */
    public final void mo1150a() {
        iqz iqz = this.f18559c.f7352e;
        String str = this.f18558b.f7482b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 19);
        stringBuilder.append("Camera ");
        stringBuilder.append(str);
        stringBuilder.append(" was closed.");
        iqz.mo518d(stringBuilder.toString());
        this.f18559c.m4081a(this.f18558b, this.f18557a.get(), -1);
    }

    /* renamed from: b */
    public final void mo1153b() {
        iqz iqz = this.f18559c.f7352e;
        String str = this.f18558b.f7482b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 25);
        stringBuilder.append("Camera ");
        stringBuilder.append(str);
        stringBuilder.append(" was disconnected.");
        iqz.mo518d(stringBuilder.toString());
        this.f18559c.m4081a(this.f18558b, this.f18557a.get(), -2);
    }

    /* renamed from: a */
    public final void mo1151a(int i) {
        iqz iqz = this.f18559c.f7352e;
        String str = this.f18558b.f7482b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 35);
        stringBuilder.append("Camera ");
        stringBuilder.append(str);
        stringBuilder.append(" received error ");
        stringBuilder.append(i);
        stringBuilder.append(".");
        iqz.mo518d(stringBuilder.toString());
        this.f18559c.m4081a(this.f18558b, this.f18557a.get(), i);
    }

    /* renamed from: a */
    public final void mo1152a(iwl iwl) {
        iqz iqz = this.f18559c.f7352e;
        String str = this.f18558b.f7482b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 19);
        stringBuilder.append("Camera ");
        stringBuilder.append(str);
        stringBuilder.append(" was opened.");
        iqz.mo518d(stringBuilder.toString());
        this.f18557a.set(true);
    }
}
