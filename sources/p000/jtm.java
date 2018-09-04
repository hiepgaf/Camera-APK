package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jtm */
public final class jtm implements jtl {
    /* renamed from: a */
    private FeatureTable f19039a;

    public jtm(FeatureTable featureTable) {
        jri.m13152b((Object) featureTable);
        this.f19039a = featureTable;
    }

    /* renamed from: a */
    public final jtv mo2053a(String str) {
        int parseInt;
        int i = 0;
        CharSequence toUpperCase = str.toUpperCase();
        Matcher matcher = Pattern.compile("^(.+):(\\d+)$").matcher(toUpperCase);
        if (matcher.matches()) {
            String group = matcher.group(1);
            parseInt = Integer.parseInt(matcher.group(2));
        } else {
            CharSequence charSequence = toUpperCase;
            parseInt = 0;
        }
        for (jza name : jza.values()) {
            if (name.name().equals(group)) {
                i = 1;
                break;
            }
        }
        if (i != 0) {
            return new juc(this.f19039a, jza.m4707a(group), parseInt);
        }
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19039a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
        stringBuilder.append("FeatureTableFeatureScorerProvider[featureTable = ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
