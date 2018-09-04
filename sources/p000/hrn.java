package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: hrn */
final class hrn implements OnLayoutChangeListener {
    /* renamed from: a */
    private final /* synthetic */ ImageView f6510a;
    /* renamed from: b */
    private final /* synthetic */ hrm f6511b;

    hrn(hrm hrm, ImageView imageView) {
        this.f6511b = hrm;
        this.f6510a = imageView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f6511b.m11971a(this.f6510a, -10.0f);
    }
}
