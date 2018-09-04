package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;

/* compiled from: PG */
/* renamed from: xj */
public final class xj extends xh {
    public xj(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo2541a(int i) {
        if ((i & 256) > 0 && (i & 512) > 0) {
            throw new wb("IsStruct and IsArray options are mutually exclusive", 103);
        } else if ((i & 2) > 0 && (i & 768) > 0) {
            throw new wb("Structs and arrays can't have \"value\" options", 103);
        }
    }

    /* renamed from: a */
    protected final int mo2540a() {
        return -2147475470;
    }

    /* renamed from: b */
    public final boolean m14516b() {
        return (this.f9510a & 768) > 0;
    }

    /* renamed from: a */
    public final void m14514a(xj xjVar) {
        if (xjVar != null) {
            m6240c(this.f9510a | xjVar.f9510a);
        }
    }

    /* renamed from: c */
    public final xj m14517c() {
        m6238a(512, true);
        return this;
    }

    /* renamed from: d */
    public final xj m14519d() {
        m6238a(4096, true);
        return this;
    }

    /* renamed from: e */
    public final xj m14521e() {
        m6238a(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX, true);
        return this;
    }

    /* renamed from: f */
    public final xj m14522f() {
        m6238a(1024, true);
        return this;
    }

    /* renamed from: a */
    public final xj m14512a(boolean z) {
        m6238a(64, z);
        return this;
    }

    /* renamed from: b */
    public final xj m14515b(boolean z) {
        m6238a(16, z);
        return this;
    }

    /* renamed from: c */
    public final xj m14518c(boolean z) {
        m6238a(128, z);
        return this;
    }

    /* renamed from: d */
    public final xj m14520d(boolean z) {
        m6238a(256, z);
        return this;
    }
}
