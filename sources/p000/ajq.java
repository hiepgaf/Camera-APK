package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ajq */
public final class ajq {
    /* renamed from: b */
    private static final String f498b;
    /* renamed from: c */
    private static final Map f499c;
    /* renamed from: a */
    public Map f500a = f499c;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder stringBuilder = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if (charAt <= '\u001f') {
                    if (charAt == '\t') {
                    }
                    stringBuilder.append('?');
                }
                if (charAt < '') {
                    stringBuilder.append(charAt);
                }
                stringBuilder.append('?');
            }
            property = stringBuilder.toString();
        }
        f498b = property;
        Map hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(f498b)) {
            hashMap.put("User-Agent", Collections.singletonList(new ajr(f498b)));
        }
        f499c = Collections.unmodifiableMap(hashMap);
    }
}
