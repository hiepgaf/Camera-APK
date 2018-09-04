package p000;

import java.io.Writer;

/* compiled from: PG */
/* renamed from: jyx */
public final class jyx implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jrj f19125a;

    public jyx(jrj jrj) {
        this.f19125a = jrj;
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        int i = 0;
        for (Long longValue : this.f19125a.m4620a().m13134d()) {
            long longValue2 = longValue.longValue();
            writer.write(String.format("%d,%d%n", new Object[]{Integer.valueOf(i), Long.valueOf(longValue2)}));
            i++;
        }
    }
}
