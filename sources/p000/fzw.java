package p000;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.GoogleCamera.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fzw */
public final class fzw extends LinearLayout {
    /* renamed from: a */
    public final fzq f4916a;
    /* renamed from: b */
    public final Map f4917b = new HashMap();

    public fzw(Context context, List list, fzp fzp, fzq fzq) {
        super(context);
        this.f4916a = fzq;
        setOrientation(0);
        setBackgroundColor(context.getColor(R.color.optionsbar_background_closed));
        removeAllViews();
        this.f4917b.clear();
        for (fzn fzn : list) {
            View gbs = new gbs(context, fzn.f4861b, fzn.f4862c);
            gbs.setContentDescription(getResources().getString(fzn.f4863d));
            this.f4917b.put(fzn, gbs);
            addView(gbs, new LayoutParams(-2, -2, 1.0f));
            if (fzp == fzn.f4860a) {
                gbs.setSelected(true);
            } else {
                gbs.setSelected(false);
            }
            gbs.setOnClickListener(new fzx(this, fzn));
        }
        setGravity(17);
    }
}
