package p000;

import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import java.util.List;

/* compiled from: PG */
/* renamed from: jid */
public final class jid {
    /* renamed from: a */
    public final FilterGraph f7847a;
    /* renamed from: b */
    public final List f7848b;

    public jid(FilterGraph filterGraph, List list) {
        jri.m13152b((Object) filterGraph);
        jri.m13152b((Object) list);
        this.f7847a = filterGraph;
        this.f7848b = list;
    }

    public final String toString() {
        int size = this.f7848b.size();
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("FeatureExtractionGraph[target-count=");
        stringBuilder.append(size);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
