package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jyb */
final class jyb implements jxy {
    /* renamed from: a */
    private final jxy f19106a;
    /* renamed from: b */
    private final List f19107b;

    public jyb(jxy jxy, List list) {
        this.f19106a = jxy;
        this.f19107b = new ArrayList(list);
        Collections.sort(list);
    }

    /* renamed from: a */
    public final int mo2062a(File file) {
        return this.f19106a.mo2062a(file);
    }

    /* renamed from: b */
    public final boolean mo2063b(File file) {
        return this.f19106a.mo2063b(file);
    }

    /* renamed from: c */
    public final boolean mo2064c(File file) {
        return this.f19106a.mo2064c(file);
    }

    /* renamed from: d */
    public final boolean mo2065d(File file) {
        return this.f19106a.mo2065d(file);
    }

    /* renamed from: e */
    public final boolean mo2066e(File file) {
        return this.f19106a.mo2066e(file);
    }

    /* renamed from: f */
    public final File[] mo2067f(File file) {
        return this.f19106a.mo2067f(file);
    }

    /* renamed from: g */
    public final long mo2068g(File file) {
        long g;
        try {
            g = this.f19106a.mo2068g(file);
        } catch (jya e) {
            jya jya = e;
            try {
                g = ((Long) this.f19107b.get(this.f19106a.mo2062a(file))).longValue();
            } catch (jya e2) {
                throw new jya(String.format(Locale.US, "timestamp (from %s OR %s)", new Object[]{jya.getMessage(), e2.getMessage()}));
            }
        }
        return g;
    }
}
