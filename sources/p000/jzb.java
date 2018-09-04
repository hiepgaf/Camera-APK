package p000;

import com.google.android.libraries.smartburst.utils.FloatArray;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jzb */
public final class jzb implements Iterator {
    /* renamed from: a */
    private int f8132a = 0;
    /* renamed from: b */
    private final /* synthetic */ FloatArray f8133b;

    public jzb(FloatArray floatArray) {
        this.f8133b = floatArray;
    }

    public final boolean hasNext() {
        return this.f8132a < this.f8133b.f2477b;
    }

    public final /* synthetic */ Object next() {
        float[] fArr = this.f8133b.f2476a;
        int i = this.f8132a;
        this.f8132a = i + 1;
        return Float.valueOf(fArr[i]);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported in FloatArray!");
    }
}
