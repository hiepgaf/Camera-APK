package p000;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: coo */
final class coo implements Callable {
    /* renamed from: a */
    private final File f2514a;
    /* renamed from: b */
    private final gob f2515b;
    /* renamed from: c */
    private final long f2516c;
    /* renamed from: d */
    private final String f2517d;
    /* renamed from: e */
    private final jqs f2518e;

    public coo(gob gob, File file, String str, long j, jqs jqs) {
        this.f2514a = file;
        this.f2515b = gob;
        this.f2516c = j;
        this.f2517d = str;
        this.f2518e = jqs;
    }

    public final /* synthetic */ Object call() {
        gob gob = this.f2515b;
        gob.m11231a(this.f2514a, this.f2517d, this.f2518e.mo704b(), this.f2518e.mo703a(), this.f2516c);
        god god = gob.f17153d;
        Uri uri = gob.f17151b;
        god.m2651b();
        return izg.f7590a;
    }
}
