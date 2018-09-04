package p000;

import android.view.Window;
import android.view.WindowManager.LayoutParams;

/* compiled from: PG */
/* renamed from: his */
public final class his {
    /* renamed from: a */
    private final Window f6252a;
    /* renamed from: b */
    private int f6253b = 0;

    public his(Window window) {
        this.f6252a = (Window) jri.m13152b((Object) window);
    }

    /* renamed from: a */
    public final void m3184a() {
        boolean z;
        if (this.f6253b > 0) {
            z = true;
        } else {
            z = false;
        }
        jqk.m13095a(z);
        this.f6253b--;
        if (this.f6253b == 0) {
            m3183a(-1.0f);
        }
    }

    /* renamed from: b */
    public final void m3185b() {
        m3183a(1.0f);
        this.f6253b++;
    }

    /* renamed from: a */
    private final void m3183a(float f) {
        LayoutParams attributes = this.f6252a.getAttributes();
        attributes.screenBrightness = f;
        this.f6252a.setAttributes(attributes);
    }
}
