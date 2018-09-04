package p000;

import android.support.v8.renderscript.Element;
import android.support.v8.renderscript.Element.Builder;
import android.support.v8.renderscript.FieldPacker;
import android.support.v8.renderscript.RenderScript;
import android.support.v8.renderscript.Script.FieldBase;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: hsh */
public final class hsh extends FieldBase {
    /* renamed from: a */
    private hvy[] f18100a = null;
    /* renamed from: b */
    private FieldPacker f18101b = null;

    static {
        WeakReference weakReference = new WeakReference(null);
    }

    public hsh(RenderScript renderScript, int i) {
        Builder builder = new Builder(renderScript);
        builder.add(Element.I32(renderScript), "offset");
        builder.add(Element.I32(renderScript), "radius_x");
        builder.add(Element.I32(renderScript), "radius_y");
        this.mElement = builder.create();
        init(renderScript, i);
    }

    /* renamed from: a */
    public final synchronized int m11973a(int i) {
        int i2;
        hvy[] hvyArr = this.f18100a;
        if (hvyArr == null) {
            i2 = 0;
        } else {
            i2 = hvyArr[i].f6753a;
        }
        return i2;
    }

    /* renamed from: a */
    public final synchronized void m11974a(int i, int i2) {
        if (this.f18101b == null) {
            this.f18101b = new FieldPacker(this.mElement.getBytesSize() * getType().getX());
        }
        if (this.f18100a == null) {
            this.f18100a = new hvy[getType().getX()];
        }
        hvy[] hvyArr = this.f18100a;
        if (hvyArr[i] == null) {
            hvyArr[i] = new hvy();
        }
        this.f18100a[i].f6753a = i2;
        this.f18101b.reset(this.mElement.getBytesSize() * i);
        this.f18101b.addI32(i2);
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i2);
        this.mAllocation.setFromFieldPacker(i, 0, fieldPacker);
    }

    /* renamed from: b */
    public final synchronized void m11975b(int i, int i2) {
        if (this.f18101b == null) {
            this.f18101b = new FieldPacker(this.mElement.getBytesSize() * getType().getX());
        }
        if (this.f18100a == null) {
            this.f18100a = new hvy[getType().getX()];
        }
        hvy[] hvyArr = this.f18100a;
        if (hvyArr[i] == null) {
            hvyArr[i] = new hvy();
        }
        this.f18101b.reset((this.mElement.getBytesSize() * i) + 4);
        this.f18101b.addI32(i2);
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i2);
        this.mAllocation.setFromFieldPacker(i, 1, fieldPacker);
    }

    /* renamed from: c */
    public final synchronized void m11976c(int i, int i2) {
        if (this.f18101b == null) {
            this.f18101b = new FieldPacker(this.mElement.getBytesSize() * getType().getX());
        }
        if (this.f18100a == null) {
            this.f18100a = new hvy[getType().getX()];
        }
        hvy[] hvyArr = this.f18100a;
        if (hvyArr[i] == null) {
            hvyArr[i] = new hvy();
        }
        this.f18101b.reset((this.mElement.getBytesSize() * i) + 8);
        this.f18101b.addI32(i2);
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i2);
        this.mAllocation.setFromFieldPacker(i, 2, fieldPacker);
    }
}
