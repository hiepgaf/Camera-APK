package p000;

import android.util.Base64;
import java.util.List;

/* compiled from: PG */
/* renamed from: hj */
public final class hj {
    /* renamed from: a */
    public final String f6258a;
    /* renamed from: b */
    public final String f6259b;
    /* renamed from: c */
    public final String f6260c;
    /* renamed from: d */
    public final List f6261d;
    /* renamed from: e */
    public final String f6262e;

    public hj(String str, String str2, String str3, List list) {
        this.f6258a = (String) ha.m2978b(str);
        this.f6259b = (String) ha.m2978b(str2);
        this.f6260c = (String) ha.m2978b(str3);
        this.f6261d = (List) ha.m2978b(list);
        StringBuilder stringBuilder = new StringBuilder(this.f6258a);
        stringBuilder.append("-");
        stringBuilder.append(this.f6259b);
        stringBuilder.append("-");
        stringBuilder.append(this.f6260c);
        this.f6262e = stringBuilder.toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("FontRequest {mProviderAuthority: ");
        stringBuilder2.append(this.f6258a);
        stringBuilder2.append(", mProviderPackage: ");
        stringBuilder2.append(this.f6259b);
        stringBuilder2.append(", mQuery: ");
        stringBuilder2.append(this.f6260c);
        stringBuilder2.append(", mCertificates:");
        stringBuilder.append(stringBuilder2.toString());
        for (int i = 0; i < this.f6261d.size(); i++) {
            stringBuilder.append(" [");
            List list = (List) this.f6261d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("mCertificatesArray: ");
        stringBuilder2.append(0);
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}
