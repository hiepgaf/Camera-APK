package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: afg */
final class afg {
    /* renamed from: a */
    private final ahn f389a;
    /* renamed from: b */
    private volatile ahm f390b;

    afg(ahn ahn) {
        this.f389a = ahn;
    }

    /* renamed from: a */
    public final ahm m214a() {
        ahm ahm = null;
        if (this.f390b == null) {
            synchronized (this) {
                if (this.f390b == null) {
                    File file;
                    ahn ahn = this.f389a;
                    aht aht = ahn.f460b;
                    File cacheDir = aht.f469a.getCacheDir();
                    if (cacheDir != null) {
                        String str = aht.f470b;
                        if (str != null) {
                            file = new File(cacheDir, str);
                        } else {
                            file = cacheDir;
                        }
                    } else {
                        file = null;
                    }
                    if (file != null && (file.mkdirs() || (file.exists() && file.isDirectory()))) {
                        ahm = new ahu(file, ahn.f459a);
                    }
                    this.f390b = ahm;
                }
                if (this.f390b == null) {
                    this.f390b = new ahp();
                }
            }
        }
        return this.f390b;
    }
}
