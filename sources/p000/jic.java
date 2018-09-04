package p000;

import java.io.Writer;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jic */
public final class jic implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jia f18826a;

    public jic(jia jia) {
        this.f18826a = jia;
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        writer.write("IDEAL");
        for (Thread name : this.f18826a.f18819b.keySet()) {
            String valueOf = String.valueOf(name.getName());
            String str = ",";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            writer.write(valueOf);
        }
        writer.write("\n");
        Set set = this.f18826a.f18818a;
        Long[] lArr = (Long[]) set.toArray(new Long[set.size()]);
        for (int i = 0; i < lArr.length; i++) {
            writer.write(String.valueOf(lArr[i]));
            for (Thread thread : this.f18826a.f18819b.keySet()) {
                List list = (List) this.f18826a.f18819b.get(thread);
                if (list.size() > i) {
                    String valueOf2 = String.valueOf(list.get(i));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 1);
                    stringBuilder.append(",");
                    stringBuilder.append(valueOf2);
                    writer.write(stringBuilder.toString());
                } else {
                    writer.write(",");
                }
            }
            writer.write("\n");
        }
    }
}
