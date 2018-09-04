package p000;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: cnm */
final class cnm extends uf {
    /* renamed from: a */
    private final int f12199a;
    /* renamed from: b */
    private final int f12200b;
    /* renamed from: c */
    private final int f12201c;
    /* renamed from: d */
    private final sx f12202d;

    public cnm(int i, int i2, sx sxVar) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f12199a = i;
        this.f12201c = i2;
        this.f12202d = sxVar;
        this.f12200b = Math.round((1.0f - (1.0f / ((float) i2))) * ((float) i));
    }

    /* renamed from: a */
    public final void mo735a(Rect rect, View view, RecyclerView recyclerView) {
        int e;
        ux c = RecyclerView.m428c(view);
        if (c != null) {
            e = c.m6024e();
        } else {
            e = -1;
        }
        rect.set(0, this.f12199a, 0, 0);
        int a = this.f12202d.mo727a(e);
        int i = this.f12201c;
        if (a != i) {
            e = Math.round((((float) this.f12202d.mo2461a(e, i)) / ((float) this.f12201c)) * ((float) this.f12199a));
            a = this.f12200b - e;
            if (jm.m4576j(recyclerView) == 1) {
                rect.right = e;
                rect.left = a;
                return;
            }
            rect.left = e;
            rect.right = a;
        }
    }
}
