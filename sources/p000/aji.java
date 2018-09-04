package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: aji */
final class aji implements adw {
    /* renamed from: a */
    private final File f9829a;
    /* renamed from: b */
    private final ajj f9830b;
    /* renamed from: c */
    private Object f9831c;

    aji(File file, ajj ajj) {
        this.f9829a = file;
        this.f9830b = ajj;
    }

    /* renamed from: b */
    public final void mo25b() {
    }

    /* renamed from: c */
    public final void mo26c() {
        Object obj = this.f9831c;
        if (obj != null) {
            try {
                this.f9830b.mo97a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final Class mo33a() {
        return this.f9830b.mo95a();
    }

    /* renamed from: d */
    public final adf mo27d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo24a(acg acg, adx adx) {
        try {
            this.f9831c = this.f9830b.mo96a(this.f9829a);
            adx.mo37a(this.f9831c);
        } catch (Exception e) {
            if (Log.isLoggable("FileLoader", 3)) {
                Log.d("FileLoader", "Failed to open file", e);
            }
            adx.mo36a(e);
        }
    }
}
