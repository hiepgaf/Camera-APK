package p000;

import java.io.File;

/* renamed from: esm */
final /* synthetic */ class esm implements Runnable {
    /* renamed from: a */
    private final esd f4201a;
    /* renamed from: b */
    private final File f4202b;
    /* renamed from: c */
    private final eso f4203c;

    esm(esd esd, File file, eso eso) {
        this.f4201a = esd;
        this.f4202b = file;
        this.f4203c = eso;
    }

    public final void run() {
        esd esd = this.f4201a;
        File file = this.f4202b;
        eso eso = this.f4203c;
        esd.f15445c.mo1614a(file);
        eso.f4206b.delete();
    }
}
