package p000;

import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.FieldPacker;
import android.support.v8.renderscript.RenderScript;

/* compiled from: PG */
/* renamed from: hsd */
public final class hsd {
    /* renamed from: a */
    public static final String f6561a = bli.m862a("RefocusFilter");
    /* renamed from: b */
    public RenderScript f6562b;
    /* renamed from: c */
    public Object f6563c;
    /* renamed from: d */
    public boolean f6564d;
    /* renamed from: e */
    public hsa f6565e;

    private hsd(RenderScript renderScript) {
        this.f6562b = renderScript;
    }

    public hsd(RenderScript renderScript, byte b) {
        this(renderScript);
        this.f6564d = false;
    }

    /* renamed from: a */
    public static int m3332a(int i, hrz hrz) {
        return hsb.m3331a(hrz.m3326a(i));
    }

    /* renamed from: a */
    public final void m3333a(int i) {
        hsg hsg = (hsg) this.f6563c;
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i);
        hsg.invoke(1, fieldPacker);
    }

    /* renamed from: b */
    public final void m3335b(int i, hrz hrz) {
        hsb hsi = new hsi(i, hrz, this.f6562b);
        if (hsi.f18102d > 3.0f) {
            this.f6564d = true;
        } else {
            this.f6564d = false;
        }
        hsg hsg = (hsg) this.f6563c;
        hsh hsh = hsi.f6558c;
        if (hsh == null) {
            hsg.bindAllocation(null, 4);
        } else {
            hsg.bindAllocation(hsh.getAllocation(), 4);
        }
        hsg = (hsg) this.f6563c;
        Allocation allocation = hsi.f18103e;
        if (allocation == null) {
            hsg.bindAllocation(null, 3);
        } else {
            hsg.bindAllocation(allocation, 3);
        }
    }

    /* renamed from: a */
    public final void m3334a(hsc hsc) {
        hsg hsg = (hsg) this.f6563c;
        int i = hsc.f6559a;
        int i2 = hsc.f6560b;
        FieldPacker fieldPacker = new FieldPacker(8);
        fieldPacker.addI32(i);
        fieldPacker.addI32(i2);
        hsg.invoke(0, fieldPacker);
    }
}
