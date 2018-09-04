package p000;

import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.view.View;

/* compiled from: PG */
/* renamed from: js */
public final class js implements jk {
    /* renamed from: a */
    private final Rect f18992a = new Rect();
    /* renamed from: b */
    private final /* synthetic */ ViewPager f18993b;

    public js(ViewPager viewPager) {
        this.f18993b = viewPager;
    }

    /* renamed from: a */
    public final kj mo439a(View view, kj kjVar) {
        kj b = jm.m4564b(view, kjVar);
        if (b.m4981e()) {
            return b;
        }
        Rect rect = this.f18992a;
        rect.left = b.m4978b();
        rect.top = b.m4980d();
        rect.right = b.m4979c();
        rect.bottom = b.m4976a();
        int childCount = this.f18993b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            kj a = jm.m4548a(this.f18993b.getChildAt(i), b);
            rect.left = Math.min(a.m4978b(), rect.left);
            rect.top = Math.min(a.m4980d(), rect.top);
            rect.right = Math.min(a.m4979c(), rect.right);
            rect.bottom = Math.min(a.m4976a(), rect.bottom);
        }
        return b.m4977a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
