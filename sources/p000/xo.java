package p000;

import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.BaseObj;
import android.support.v8.renderscript.Element;
import android.support.v8.renderscript.RenderScript;
import android.support.v8.renderscript.Sampler;
import android.support.v8.renderscript.ScriptC;

/* compiled from: PG */
/* renamed from: xo */
public final class xo extends ScriptC {
    /* renamed from: a */
    public Element f23445a;

    public xo(RenderScript renderScript) {
        Object obj = new byte[xp.f9511a];
        Object a = xp.m6246a();
        System.arraycopy(a, 0, obj, 0, a.length);
        a = new byte[xp.f9512b];
        Object b = xp.m6247b();
        System.arraycopy(b, 0, a, 0, b.length);
        super(renderScript, "tinyplanet", obj, a);
        Element.ALLOCATION(renderScript);
        Element.SAMPLER(renderScript);
        Element.F32(renderScript);
        Element.I32(renderScript);
        this.f23445a = Element.U8_4(renderScript);
    }

    /* renamed from: a */
    public final synchronized void m17826a(float f) {
        setVar(2, f);
    }

    /* renamed from: a */
    public final synchronized void m17827a(int i) {
        setVar(5, i);
    }

    /* renamed from: a */
    public final synchronized void m17828a(Allocation allocation) {
        setVar(0, (BaseObj) allocation);
    }

    /* renamed from: b */
    public final synchronized void m17831b(int i) {
        setVar(4, i);
    }

    /* renamed from: b */
    public final synchronized void m17830b(float f) {
        setVar(3, f);
    }

    /* renamed from: c */
    public final synchronized void m17832c(float f) {
        setVar(6, f);
    }

    /* renamed from: d */
    public final synchronized void m17833d(float f) {
        setVar(7, f);
    }

    /* renamed from: a */
    public final synchronized void m17829a(Sampler sampler) {
        setVar(1, (BaseObj) sampler);
    }
}
