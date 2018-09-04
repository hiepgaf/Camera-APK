package p000;

import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* renamed from: ebv */
final class ebv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ List f3519a;
    /* renamed from: b */
    private final /* synthetic */ RectF f3520b;

    ebv(List list, RectF rectF) {
        this.f3519a = list;
        this.f3520b = rectF;
    }

    public final void run() {
        for (ham a : this.f3519a) {
            a.mo1132a(this.f3520b);
        }
    }
}
