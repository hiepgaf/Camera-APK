package p000;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jvn */
public final class jvn extends jun {
    /* renamed from: a */
    private final jui[] f21957a;

    public jvn(jui... juiArr) {
        this.f21957a = juiArr;
    }

    /* renamed from: a */
    public final boolean mo3184a(juh juh) {
        Set set = juh.f7985b;
        for (Object contains : this.f21957a) {
            if (set.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f21957a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 31);
        stringBuilder.append("LabeledSegmentSelector[labels=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
