package p000;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btd */
public class btd {
    /* renamed from: a */
    public final Context f1537a;
    /* renamed from: b */
    public final Resources f1538b;
    /* renamed from: c */
    public final FocusIndicatorRingView f1539c;
    /* renamed from: d */
    public final TextView f1540d;
    /* renamed from: e */
    public final FocusIndicatorView f1541e;

    public btd(Context context, FocusIndicatorView focusIndicatorView) {
        this.f1537a = context;
        this.f1541e = focusIndicatorView;
        this.f1538b = context.getResources();
        this.f1539c = (FocusIndicatorRingView) focusIndicatorView.findViewById(R.id.focus_indicator_ring);
        this.f1540d = (TextView) focusIndicatorView.findViewById(R.id.focus_indicator_debug_hud);
    }
}
