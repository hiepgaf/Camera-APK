package p000;

import com.google.android.libraries.smartburst.utils.Feature;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jky */
public final class jky {
    /* renamed from: a */
    private final int f7901a;
    /* renamed from: b */
    private final int[] f7902b;
    /* renamed from: c */
    private final /* synthetic */ jkx f7903c;

    jky(jkx jkx, int[] iArr, int i) {
        this.f7903c = jkx;
        this.f7902b = iArr;
        this.f7901a = i;
    }

    /* renamed from: a */
    public final Feature m4525a(jza jza) {
        return this.f7903c.m12921a(jza, this.f7901a, this.f7902b[jza.f8131z]);
    }

    /* renamed from: a */
    public final Feature[] m4526a() {
        Feature[] featureArr = new Feature[this.f7903c.f18905a.size()];
        Iterator it = this.f7903c.f18905a.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            featureArr[i] = m4525a((jza) it.next());
            i = i2;
        }
        return featureArr;
    }

    /* renamed from: b */
    public final long m4527b() {
        return this.f7903c.m12920a(this.f7901a);
    }
}
