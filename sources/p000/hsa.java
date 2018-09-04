package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.Element;
import android.support.v8.renderscript.RenderScript;

/* compiled from: PG */
/* renamed from: hsa */
public final class hsa {
    /* renamed from: a */
    public Bitmap f6546a;
    /* renamed from: b */
    public Bitmap f6547b;
    /* renamed from: c */
    public Allocation f6548c;
    /* renamed from: d */
    public Allocation f6549d;
    /* renamed from: e */
    public int f6550e;
    /* renamed from: f */
    public int f6551f;
    /* renamed from: g */
    public int f6552g;
    /* renamed from: h */
    private Allocation f6553h;
    /* renamed from: i */
    private Allocation f6554i;
    /* renamed from: j */
    private Allocation f6555j;

    private hsa(Bitmap bitmap, int i, RenderScript renderScript) {
        this.f6546a = bitmap;
        this.f6548c = Allocation.createFromBitmap(renderScript, this.f6546a);
        this.f6547b = Bitmap.createBitmap(this.f6546a.getWidth(), this.f6546a.getHeight(), Config.ARGB_8888);
        this.f6549d = Allocation.createFromBitmap(renderScript, this.f6547b);
        this.f6552g = i;
        int i2 = i + i;
        this.f6550e = this.f6546a.getWidth() + i2;
        this.f6551f = i2 + this.f6546a.getHeight();
    }

    public hsa(Bitmap bitmap, int i, RenderScript renderScript, hsg hsg) {
        this(bitmap, i, renderScript);
        this.f6553h = Allocation.createSized(renderScript, Element.F32_4(renderScript), this.f6550e * this.f6551f);
        this.f6554i = Allocation.createSized(renderScript, Element.F32_4(renderScript), this.f6550e * this.f6551f);
        this.f6555j = Allocation.createSized(renderScript, Element.F32_4(renderScript), this.f6550e * this.f6551f);
        Allocation allocation = this.f6553h;
        if (allocation == null) {
            hsg.bindAllocation(null, 0);
        } else {
            hsg.bindAllocation(allocation, 0);
        }
        allocation = this.f6554i;
        if (allocation == null) {
            hsg.bindAllocation(null, 1);
        } else {
            hsg.bindAllocation(allocation, 1);
        }
        allocation = this.f6555j;
        if (allocation == null) {
            hsg.bindAllocation(null, 2);
        } else {
            hsg.bindAllocation(allocation, 2);
        }
    }
}
