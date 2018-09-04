package p000;

import android.support.v8.renderscript.Element;
import android.support.v8.renderscript.FieldPacker;
import android.support.v8.renderscript.RenderScript;
import android.support.v8.renderscript.ScriptC;

/* compiled from: PG */
/* renamed from: hsg */
public final class hsg extends ScriptC {
    /* renamed from: a */
    public Element f23332a;

    public hsg(RenderScript renderScript) {
        Object obj = new byte[hsj.f6575a];
        Object a = hsj.m3337a();
        int length = a.length;
        System.arraycopy(a, 0, obj, 0, length);
        a = hsj.m3338b();
        int length2 = a.length;
        System.arraycopy(a, 0, obj, length, length2);
        a = hsj.m3339c();
        System.arraycopy(a, 0, obj, length + length2, a.length);
        a = new byte[hsj.f6576b];
        Object d = hsj.m3340d();
        length2 = d.length;
        System.arraycopy(d, 0, a, 0, length2);
        d = hsj.m3341e();
        int length3 = d.length;
        System.arraycopy(d, 0, a, length2, length3);
        d = hsj.m3342f();
        System.arraycopy(d, 0, a, length2 + length3, d.length);
        super(renderScript, "layered_filter_fast_f32", obj, a);
        this.f23332a = Element.U8_4(renderScript);
    }

    /* renamed from: a */
    public final void m17531a(int i) {
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i);
        invoke(2, fieldPacker);
    }
}
