package p000;

import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: PG */
/* renamed from: bx */
public final class bx implements OnPreDrawListener {
    /* renamed from: a */
    private final /* synthetic */ bu f1679a;

    public bx(bu buVar) {
        this.f1679a = buVar;
    }

    public final boolean onPreDraw() {
        bu buVar = this.f1679a;
        float rotation = buVar.f1592x.getRotation();
        if (buVar.f1583i != rotation) {
            buVar.f1583i = rotation;
            cu cuVar = buVar.f1582h;
            if (cuVar != null) {
                float f = -buVar.f1583i;
                if (cuVar.f12643c != f) {
                    cuVar.f12643c = f;
                    cuVar.invalidateSelf();
                }
            }
            ci ciVar = buVar.f1586l;
            if (ciVar != null) {
                float f2 = -buVar.f1583i;
                if (f2 != ciVar.f2019i) {
                    ciVar.f2019i = f2;
                    ciVar.invalidateSelf();
                }
            }
        }
        return true;
    }
}
