package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dli */
public final class dli {
    /* renamed from: a */
    public final ebd f3122a;
    /* renamed from: b */
    public final gxz f3123b;
    /* renamed from: c */
    public final dlj f3124c;
    /* renamed from: d */
    private final cfh f3125d;
    /* renamed from: e */
    private final View f3126e;

    static {
        bli.m862a("VideoUI");
    }

    public dli(cfh cfh, View view, ebd ebd, gxz gxz) {
        this.f3123b = gxz;
        this.f3125d = cfh;
        this.f3126e = view;
        this.f3122a = ebd;
        this.f3125d.mo2765t().inflate(R.layout.video_module, (ViewGroup) this.f3126e.findViewById(R.id.root_module_layout), true);
        this.f3123b.m2907a((TextView) this.f3126e.findViewById(R.id.recording_time));
        this.f3124c = new dlj(this.f3125d, view);
    }

    /* renamed from: a */
    public final void m1655a() {
        this.f3122a.m9611c(true);
    }

    /* renamed from: b */
    public static void m1653b() {
        ikd.m12259a();
    }

    /* renamed from: c */
    public static void m1654c() {
    }

    /* renamed from: a */
    public final void m1656a(boolean z) {
        if (z) {
            this.f3122a.m9622m();
            this.f3122a.m9608b(false);
            this.f3123b.m2909b();
        } else {
            this.f3122a.m9624p();
            this.f3123b.m2908a(false);
        }
        this.f3122a.m9611c(true);
    }
}
