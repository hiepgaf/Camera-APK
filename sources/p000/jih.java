package p000;

import java.io.Writer;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jih */
public final class jih implements jyv {
    /* renamed from: a */
    private final /* synthetic */ Set f18827a;
    /* renamed from: b */
    private final /* synthetic */ jig f18828b;

    public jih(jig jig, Set set) {
        this.f18828b = jig;
        this.f18827a = set;
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        jig jig = this.f18828b;
        for (jza jza : this.f18827a) {
            jzr a = jig.m4507a(jza);
            if (a.f8156e != 0) {
                int assignmentCount = jig.f7849a.getAssignmentCount(jza);
                String valueOf = String.valueOf(jza);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 1);
                stringBuilder.append(valueOf);
                stringBuilder.append("\n");
                writer.write(stringBuilder.toString());
                int i = jza.f8127A;
                StringBuilder stringBuilder2 = new StringBuilder(26);
                stringBuilder2.append("  dimensions: ");
                stringBuilder2.append(i);
                stringBuilder2.append("\n");
                writer.write(stringBuilder2.toString());
                i = a.f8156e;
                stringBuilder2 = new StringBuilder(21);
                stringBuilder2.append("  count: ");
                stringBuilder2.append(i);
                stringBuilder2.append("\n");
                writer.write(stringBuilder2.toString());
                StringBuilder stringBuilder3 = new StringBuilder(27);
                stringBuilder3.append("  assignments: ");
                stringBuilder3.append(assignmentCount);
                stringBuilder3.append("\n");
                writer.write(stringBuilder3.toString());
                double d = a.f8152a;
                stringBuilder3 = new StringBuilder(32);
                stringBuilder3.append("  min: ");
                stringBuilder3.append(d);
                stringBuilder3.append("\n");
                writer.write(stringBuilder3.toString());
                d = a.f8153b;
                stringBuilder3 = new StringBuilder(32);
                stringBuilder3.append("  max: ");
                stringBuilder3.append(d);
                stringBuilder3.append("\n");
                writer.write(stringBuilder3.toString());
                d = a.f8154c;
                stringBuilder3 = new StringBuilder(33);
                stringBuilder3.append("  mean: ");
                stringBuilder3.append(d);
                stringBuilder3.append("\n");
                writer.write(stringBuilder3.toString());
                d = Math.sqrt(a.f8155d);
                stringBuilder3 = new StringBuilder(36);
                stringBuilder3.append("  stddev: ");
                stringBuilder3.append(d);
                stringBuilder3.append("\n\n");
                writer.write(stringBuilder3.toString());
            }
        }
    }
}
