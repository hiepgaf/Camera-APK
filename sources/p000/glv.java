package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: glv */
public final class glv {
    /* renamed from: a */
    private final AtomicInteger f5385a = new AtomicInteger(go.aY - 1);
    /* renamed from: b */
    private final boolean f5386b;

    glv(boolean z) {
        this.f5386b = z;
    }

    /* renamed from: a */
    final void m2609a(int... iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (this.f5385a.get() == i - 1) {
                z = true;
            }
        }
        int i2 = this.f5385a.get();
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("Invalid session state: ");
        stringBuilder.append(i2);
        jri.m13154b(z, stringBuilder.toString());
    }

    /* renamed from: a */
    final boolean m2610a() {
        return this.f5385a.get() == go.bb + -1;
    }

    /* renamed from: b */
    final boolean m2611b() {
        return this.f5385a.get() == go.aZ + -1;
    }

    /* renamed from: a */
    final void m2607a(int i) {
        this.f5385a.set(i - 1);
    }

    /* renamed from: a */
    final void m2608a(int i, int i2, String str) {
        int i3 = i - 1;
        if (this.f5385a.getAndSet(i2 - 1) == i3) {
            return;
        }
        if (this.f5386b) {
            throw new IllegalStateException();
        }
        int i4 = this.f5385a.get();
        StringBuilder stringBuilder = new StringBuilder(79);
        stringBuilder.append("Warning: CaptureSession in unexpected state ");
        stringBuilder.append(i4);
        stringBuilder.append("! Expected: ");
        stringBuilder.append(i3);
        stringBuilder.append(".");
        bli.m873e(str, stringBuilder.toString());
    }
}
