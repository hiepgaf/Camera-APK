package p000;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: eiu */
public final class eiu {
    /* renamed from: a */
    public View f3644a;
    /* renamed from: b */
    public Button f3645b;
    /* renamed from: c */
    public chc f3646c;
    /* renamed from: d */
    public final boolean f3647d;
    /* renamed from: e */
    private OnClickListener f3648e = new eiv(this);

    static {
        bli.m862a("A11yController");
    }

    public eiu(View view, bkw bkw) {
        ikd.m12259a();
        this.f3644a = view;
        this.f3645b = (Button) view.findViewById(R.id.accessibility_burst_button);
        this.f3645b.setOnClickListener(this.f3648e);
        this.f3647d = bkw.m856h();
        if (!this.f3647d) {
            this.f3645b.setVisibility(8);
        }
    }
}
