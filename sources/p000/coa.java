package p000;

import android.location.Location;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: coa */
final class coa implements Callable {
    /* renamed from: a */
    private final /* synthetic */ File f2224a;

    coa(File file) {
        this.f2224a = file;
    }

    /* renamed from: a */
    private final kbg m1210a() {
        File[] f = jxr.m4678a().mo2067f(this.f2224a);
        int length = f.length;
        int i = 0;
        while (i < length) {
            File file = f[i];
            try {
                Location a = cnz.m1206a(cnz.m1207a(file));
                if (a != null) {
                    return kbg.m4745c(a);
                }
                i++;
            } catch (cob e) {
                String str = cnz.f2219a;
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                stringBuilder.append("Failed to load EXIF from file ");
                stringBuilder.append(valueOf);
                bli.m874e(str, stringBuilder.toString(), e.getCause());
            }
        }
        return kau.f19138a;
    }

    public final /* synthetic */ Object call() {
        return m1210a();
    }
}
