package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: hrq */
final class hrq implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ hrm f6514a;

    hrq(hrm hrm) {
        this.f6514a = hrm;
    }

    public final void onClick(View view) {
        hrm hrm = this.f6514a;
        int i = hrm.f18089b + 1;
        if (i >= hrm.f18090i.length) {
            hrm.m3086a();
        } else {
            hrm.m11969a(i);
        }
    }
}
