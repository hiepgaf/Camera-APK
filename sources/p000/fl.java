package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fl */
public final class fl {
    /* renamed from: a */
    public final Map f4607a = new HashMap();
    /* renamed from: b */
    public View f4608b;
    /* renamed from: c */
    public final ArrayList f4609c = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj instanceof fl) {
            fl flVar = (fl) obj;
            if (this.f4608b == flVar.f4608b && this.f4607a.equals(flVar.f4607a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4608b.hashCode() * 31) + this.f4607a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransitionValues@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(":\n");
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    view = ");
        stringBuilder3.append(this.f4608b);
        stringBuilder3.append("\n");
        stringBuilder2 = stringBuilder3.toString();
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("    values:");
        stringBuilder2 = stringBuilder3.toString();
        String str = stringBuilder2;
        for (String stringBuilder22 : this.f4607a.keySet()) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str);
            stringBuilder4.append(GraphFactorySource.INDENT);
            stringBuilder4.append(stringBuilder22);
            stringBuilder4.append(": ");
            stringBuilder4.append(this.f4607a.get(stringBuilder22));
            stringBuilder4.append("\n");
            str = stringBuilder4.toString();
        }
        return str;
    }
}
