package p000;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dzm */
final class dzm extends PreferenceCategory {
    dzm(Context context) {
        super(context);
    }

    protected final void onBindView(View view) {
        super.onBindView(view);
        view.setBackgroundResource(R.drawable.rounded_rect_grey_top_inset);
    }
}
