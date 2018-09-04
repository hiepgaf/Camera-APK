package p000;

import android.util.Pair;
import java.io.Writer;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jwu */
public final class jwu implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jwt f19091a;

    public jwu(jwt jwt) {
        this.f19091a = jwt;
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        for (Pair pair : this.f19091a.f19089a.keySet()) {
            writer.write(String.format(Locale.US, "%d,%d,%f%n", new Object[]{pair.first, pair.second, this.f19091a.f19089a.get(pair)}));
        }
    }
}
