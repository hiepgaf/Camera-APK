package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: bja */
public final class bja {
    /* renamed from: a */
    private final gsx f1200a;

    public bja(gsx gsx) {
        this.f1200a = gsx;
    }

    /* renamed from: a */
    public final void m838a() {
        File[] listFiles = this.f1200a.mo1623a().listFiles(new bjb());
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.length() == 0) {
                    file.delete();
                }
            }
        }
    }
}
