package p000;

import java.io.Writer;

/* compiled from: PG */
/* renamed from: jyw */
public final class jyw implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jxm f19124a;

    public jyw(jxm jxm) {
        this.f19124a = jxm;
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        Object obj = this.f19124a;
        jri.m13152b(obj);
        jri.m13152b((Object) writer);
        int i = 0;
        for (jxa jxa : obj.m4671a()) {
            int i2 = i + 1;
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("== Metadata Record ");
            stringBuilder.append(i);
            stringBuilder.append("\n");
            writer.write(stringBuilder.toString());
            for (jxi jxi : jxa.f8067w.keySet()) {
                Object a = jxa.m4665a(jxi);
                String valueOf = String.valueOf(jxi);
                String valueOf2 = String.valueOf(a);
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(valueOf2).length());
                stringBuilder2.append("= ");
                stringBuilder2.append(valueOf);
                stringBuilder2.append(" -> ");
                stringBuilder2.append(valueOf2);
                stringBuilder2.append("\n");
                writer.write(stringBuilder2.toString());
            }
            writer.write("==================\n\n");
            i = i2;
        }
    }
}
