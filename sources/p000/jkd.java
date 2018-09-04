package p000;

import android.util.Pair;
import com.google.android.libraries.smartburst.artifacts.gifutils.LZWEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: jkd */
final class jkd implements izi {
    /* renamed from: a */
    private final jje f18871a;
    /* renamed from: b */
    private final jzp f18872b;
    /* renamed from: c */
    private final int f18873c;
    /* renamed from: d */
    private final int f18874d;

    public jkd(jje jje, jzp jzp, int i, int i2) {
        this.f18871a = jje;
        this.f18872b = jzp;
        this.f18873c = i;
        this.f18874d = i2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        Pair pair = (Pair) obj;
        int i = this.f18873c;
        if (((Integer) pair.second).intValue() == this.f18874d - 1) {
            i += 500;
        }
        jje jje = this.f18871a;
        Object obj2 = (ByteBuffer) pair.first;
        jzp jzp = this.f18872b;
        int i2 = jzp.f8149a;
        int i3 = jzp.f8150b;
        int intValue = ((Integer) pair.second).intValue();
        int i4 = this.f18874d;
        jri.m13152b(obj2);
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i3 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13143a(z2);
        if (intValue < 0) {
            z3 = false;
        } else if (intValue < i4) {
            z3 = true;
        } else {
            z3 = false;
        }
        jri.m13143a(z3);
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        jri.m13143a(z3);
        if (i < 0) {
            z4 = false;
        }
        jri.m13143a(z4);
        jri.m13152b(obj2);
        jri.m13143a(z);
        jri.m13143a(z2);
        obj2.order(ByteOrder.nativeOrder());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(768);
        allocateDirect.order(ByteOrder.nativeOrder());
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i2 * i3);
        allocateDirect2.order(ByteOrder.nativeOrder());
        jje.f7879a.mo831a(obj2, allocateDirect, allocateDirect2, i2, i3);
        Pair create = Pair.create(allocateDirect, allocateDirect2);
        return LZWEncoder.m1356a((ByteBuffer) create.first, (ByteBuffer) create.second, i2, i3, intValue, i4, i, jje.f7881c, jje.f7880b, 0);
    }
}
