package p000;

import java.io.Writer;

/* compiled from: PG */
/* renamed from: jmt */
final class jmt implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jms f18944a;

    jmt(jms jms) {
        this.f18944a = jms;
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        for (String str : this.f18944a.f7926a.keySet()) {
            Object obj = this.f18944a.f7927b.get(str);
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 5) + String.valueOf(valueOf).length());
                stringBuilder.append(str);
                stringBuilder.append(" -> ");
                stringBuilder.append(valueOf);
                stringBuilder.append("\n");
                writer.write(stringBuilder.toString());
            } else {
                writer.write(String.valueOf(str).concat(" -> [Instantiator not invoked]\n"));
            }
            writer.write("\n");
        }
    }
}
