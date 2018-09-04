package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.utils.Feature;
import java.io.Writer;

/* compiled from: PG */
/* renamed from: jlj */
public final class jlj implements jyv {
    /* renamed from: a */
    private final /* synthetic */ FeatureTable f18927a;

    public jlj(FeatureTable featureTable) {
        this.f18927a = featureTable;
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        FeatureTable featureTable = this.f18927a;
        jkz rowIterator = featureTable.getRowIterator(featureTable.getEarliestTimestamp());
        Object obj = null;
        while (rowIterator.m4528a()) {
            jky jky = (jky) rowIterator.next();
            if (obj == null) {
                writer.write("TIMESTAMP_NS");
                for (Feature type : jky.m4526a()) {
                    jza type2 = type.getType();
                    for (int i = 0; i < type2.f8127A; i++) {
                        String name = type2.name();
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 13);
                        stringBuilder.append(",");
                        stringBuilder.append(name);
                        stringBuilder.append("_");
                        stringBuilder.append(i);
                        writer.write(stringBuilder.toString());
                    }
                }
                writer.write("\n");
                obj = 1;
            }
            writer.write(String.valueOf(jky.m4527b()));
            for (Feature values : jky.m4526a()) {
                for (float f : values.getValues()) {
                    stringBuilder = new StringBuilder(16);
                    stringBuilder.append(",");
                    stringBuilder.append(f);
                    writer.write(stringBuilder.toString());
                }
            }
            writer.write("\n");
        }
    }
}
