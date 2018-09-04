package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.LongSparseArray;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jrk */
public final class jrk implements jqo, jyv {
    /* renamed from: a */
    private final jqo f18978a;
    /* renamed from: b */
    private final Set f18979b = new HashSet();

    public jrk(jqo jqo) {
        jri.m13152b((Object) jqo);
        this.f18978a = jqo;
    }

    /* renamed from: a */
    public final jqr mo2041a(String str, int i, int i2, Config config) {
        return new jrm(str, "CREATE", this.f18978a.mo2041a(str, i, i2, config), this.f18979b);
    }

    public final String toString() {
        return this.f18978a.toString();
    }

    /* renamed from: a */
    public final jqr mo2042a(String str, Bitmap bitmap) {
        return new jrm(str, "WRAP", this.f18978a.mo2042a(str, bitmap), this.f18979b);
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        LongSparseArray longSparseArray = new LongSparseArray();
        synchronized (this.f18979b) {
            for (jrm jrm : this.f18979b) {
                String f = jrm.m17681f();
                longSparseArray.put(jrm.f23405b, new jrl(jrm.f23407d, jrm.f23406c, jrm));
                if (f != null) {
                    longSparseArray.put(jrm.f23410g, new jrl(-jrm.f23407d, jrm.m17681f(), jrm));
                }
            }
        }
        writer.write("TIME,ALLOC_SIZE,WIDTH,HEIGHT,LABEL,TYPE,LEAKED,TOTAL_USAGE,TOTAL_COUNT\n");
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            int i3;
            String str;
            jrl jrl = (jrl) longSparseArray.valueAt(i2);
            int i4 = jrl.f7943a;
            if (i4 >= 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            i += i3;
            j += (long) i4;
            long keyAt = longSparseArray.keyAt(i2);
            i3 = jrl.f7943a;
            jrm jrm2 = jrl.f7944b;
            int i5 = jrm2.f23408e;
            int i6 = jrm2.f23409f;
            String str2 = jrm2.f23404a;
            String str3 = jrl.f7945c;
            if (jrm2.m17681f() != null) {
                str = "";
            } else {
                str = "Y";
            }
            i4 = String.valueOf(str2).length();
            StringBuilder stringBuilder = new StringBuilder(((i4 + 93) + String.valueOf(str3).length()) + String.valueOf(str).length());
            stringBuilder.append(keyAt);
            stringBuilder.append(",");
            stringBuilder.append(i3);
            stringBuilder.append(",");
            stringBuilder.append(i5);
            stringBuilder.append(",");
            stringBuilder.append(i6);
            stringBuilder.append(",");
            stringBuilder.append(str2);
            stringBuilder.append(",");
            stringBuilder.append(str3);
            stringBuilder.append(",");
            stringBuilder.append(str);
            stringBuilder.append(",");
            stringBuilder.append(j);
            stringBuilder.append(",");
            stringBuilder.append(i);
            stringBuilder.append("\n");
            writer.write(stringBuilder.toString());
        }
    }
}
