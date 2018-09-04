package p000;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dzn */
final class dzn extends Preference {
    /* renamed from: a */
    private final /* synthetic */ int f3402a;
    /* renamed from: b */
    private final /* synthetic */ int f3403b;

    dzn(Context context, int i, int i2) {
        this.f3402a = i;
        this.f3403b = i2;
        super(context);
    }

    protected final void onBindView(View view) {
        super.onBindView(view);
        if (this.f3402a == this.f3403b) {
            view.setBackgroundResource(R.drawable.rounded_rect_grey_bottom_inset);
        } else {
            view.setBackgroundResource(R.drawable.rounded_rect_grey_middle_inset);
        }
    }
}
