package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: ckm */
public final class ckm {
    /* renamed from: a */
    private static final String f2110a = bli.m862a("BurstFSPM");
    /* renamed from: b */
    private final File f2111b;
    /* renamed from: c */
    private final File f2112c = new File(this.f2111b, ".burst_in_progress.lock");

    public ckm(File file) {
        jri.m13152b((Object) file);
        this.f2111b = file;
    }

    /* renamed from: a */
    public final synchronized boolean m1167a() {
        return this.f2112c.exists() ^ 1;
    }

    /* renamed from: b */
    public final synchronized void m1168b() {
        if (!this.f2112c.exists()) {
            bli.m873e(f2110a, "Could not find in progress lock file.");
        } else if (!this.f2112c.delete()) {
            bli.m873e(f2110a, "Could not delete in progress lock file.");
        }
    }

    /* renamed from: c */
    public final synchronized void m1169c() {
        if (!this.f2111b.exists()) {
            this.f2111b.mkdir();
        }
        if (!this.f2112c.exists()) {
            try {
                this.f2112c.createNewFile();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }
}
