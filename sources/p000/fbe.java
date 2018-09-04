package p000;

import android.view.View.OnClickListener;
import java.util.Date;

/* compiled from: PG */
/* renamed from: fbe */
public final class fbe implements Comparable {
    /* renamed from: a */
    public boolean f4432a;
    /* renamed from: b */
    public int f4433b;
    /* renamed from: c */
    public int f4434c;
    /* renamed from: d */
    public Date f4435d;
    /* renamed from: e */
    public OnClickListener f4436e;
    /* renamed from: f */
    public final String f4437f;

    public fbe(String str) {
        this.f4437f = str;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        fbe fbe = (fbe) obj;
        int i = this.f4433b;
        int i2 = fbe.f4433b;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return -this.f4435d.compareTo(fbe.f4435d);
    }
}
