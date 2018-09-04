package p000;

import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;

/* compiled from: PG */
/* renamed from: jz */
public final class jz extends DataSetObserver {
    /* renamed from: a */
    private final /* synthetic */ ViewPager f8087a;

    public jz(ViewPager viewPager) {
        this.f8087a = viewPager;
    }

    public final void onChanged() {
        this.f8087a.m399a();
    }

    public final void onInvalidated() {
        this.f8087a.m399a();
    }
}
