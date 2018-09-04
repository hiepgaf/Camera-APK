package p000;

import java.io.Writer;
import java.util.List;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jib */
public final class jib implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jia f18825a;

    public jib(jia jia) {
        this.f18825a = jia;
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        synchronized (this.f18825a) {
            long nanoTime = System.nanoTime() - this.f18825a.f18822e;
            StringBuilder stringBuilder = new StringBuilder(46);
            stringBuilder.append("Measurement duration: ");
            stringBuilder.append(nanoTime);
            stringBuilder.append(" NS\n");
            writer.write(stringBuilder.toString());
            int size = this.f18825a.f18818a.size();
            StringBuilder stringBuilder2 = new StringBuilder(33);
            stringBuilder2.append("Decoded frame count: ");
            stringBuilder2.append(size);
            stringBuilder2.append("\n");
            writer.write(stringBuilder2.toString());
            for (Entry entry : this.f18825a.f18819b.entrySet()) {
                int intValue;
                String num;
                Integer num2 = (Integer) this.f18825a.f18820c.get(entry.getKey());
                if (num2 != null) {
                    intValue = num2.intValue();
                } else {
                    intValue = 0;
                }
                num2 = (Integer) this.f18825a.f18821d.get(entry.getKey());
                if (num2 != null) {
                    num = num2.toString();
                } else {
                    num = "unknown";
                }
                String name = ((Thread) entry.getKey()).getName();
                size = ((List) entry.getValue()).size();
                StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(name).length() + 80) + String.valueOf(num).length());
                stringBuilder3.append("Thread '");
                stringBuilder3.append(name);
                stringBuilder3.append("' [max-dimension: ");
                stringBuilder3.append(num);
                stringBuilder3.append("] saw ");
                stringBuilder3.append(size);
                stringBuilder3.append(" frames, skipped ");
                stringBuilder3.append(intValue);
                stringBuilder3.append(" frames.\n");
                writer.write(stringBuilder3.toString());
            }
        }
    }
}
