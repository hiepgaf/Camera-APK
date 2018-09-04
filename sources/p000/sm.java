package p000;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: sm */
final class sm extends um {
    /* renamed from: a */
    private final /* synthetic */ sk f19595a;

    sm(sk skVar) {
        this.f19595a = skVar;
    }

    /* renamed from: a */
    public final void mo2460a(RecyclerView recyclerView) {
        boolean z;
        sk skVar = this.f19595a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = skVar.f19580j.computeVerticalScrollRange();
        int i = skVar.f19579i;
        if (computeVerticalScrollRange - i <= 0) {
            z = false;
        } else if (i >= skVar.f19571a) {
            z = true;
        } else {
            z = false;
        }
        skVar.f19581k = z;
        int computeHorizontalScrollRange = skVar.f19580j.computeHorizontalScrollRange();
        int i2 = skVar.f19578h;
        if (computeHorizontalScrollRange - i2 <= 0) {
            z = false;
        } else if (i2 >= skVar.f19571a) {
            z = true;
        } else {
            z = false;
        }
        skVar.f19582l = z;
        z = skVar.f19581k;
        if (z || skVar.f19582l) {
            float f;
            if (z) {
                f = (float) i;
                skVar.f19575e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                skVar.f19574d = Math.min(i, (i * i) / computeVerticalScrollRange);
            }
            if (skVar.f19582l) {
                f = (float) i2;
                skVar.f19577g = (int) ((f * (((float) computeHorizontalScrollOffset) + (f / 2.0f))) / ((float) computeHorizontalScrollRange));
                skVar.f19576f = Math.min(i2, (i2 * i2) / computeHorizontalScrollRange);
            }
            int i3 = skVar.f19583m;
            if (i3 == 0 || i3 == 1) {
                skVar.m14343a(1);
            }
        } else if (skVar.f19583m != 0) {
            skVar.m14343a(0);
        }
    }
}
