package p000;

import android.os.SystemClock;
import android.view.SurfaceHolder.Callback2;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

/* compiled from: PG */
/* renamed from: hei */
final class hei implements OnLayoutChangeListener, iqo {
    /* renamed from: j */
    private static int f17712j = 0;
    /* renamed from: a */
    public final hmy f17713a;
    /* renamed from: b */
    public final iqz f17714b;
    /* renamed from: c */
    public final hmz f17715c;
    /* renamed from: d */
    public final gci f17716d;
    /* renamed from: e */
    public final Runnable f17717e;
    /* renamed from: f */
    public final heo f17718f;
    /* renamed from: g */
    public final gsg f17719g;
    /* renamed from: h */
    public final kpw f17720h = kpw.m18056d();
    /* renamed from: i */
    public hmx f17721i;
    /* renamed from: k */
    private final FrameLayout f17722k;
    /* renamed from: l */
    private final MainActivityLayout f17723l;
    /* renamed from: m */
    private final Callback2 f17724m;

    hei(ira ira, hmy hmy, FrameLayout frameLayout, MainActivityLayout mainActivityLayout, gci gci, Instrumentation instrumentation, heo heo, Runnable runnable) {
        boolean z;
        this.f17722k = frameLayout;
        this.f17723l = mainActivityLayout;
        this.f17713a = hmy;
        this.f17715c = hmy.mo1743a(frameLayout.getContext());
        hmz hmz = this.f17715c;
        iqp iqp = heo.f6105a;
        hmz.mo1744a(iqp.f7329a, iqp.f7330b);
        this.f17716d = gci;
        this.f17718f = heo;
        this.f17719g = (gsg) instrumentation.viewfinder().create();
        this.f17717e = runnable;
        int i = f17712j;
        f17712j = i + 1;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("ViewfinderSV");
        stringBuilder.append(i);
        this.f17714b = ira.mo511a(stringBuilder.toString());
        this.f17724m = new hej(this);
        this.f17715c.getHolder().addCallback(this.f17724m);
        mainActivityLayout.addOnLayoutChangeListener(this);
        this.f17722k.addView(this.f17715c, new LayoutParams(-1, -1));
        gsg gsg = this.f17719g;
        if (gsg.f17295a == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Accidental session reuse.");
        iya iya = gsg.m;
        gsg.f17295a = SystemClock.elapsedRealtimeNanos();
        this.f17722k.setVisibility(0);
        this.f17715c.setVisibility(0);
    }

    public final void close() {
        ikd.m12259a();
        hmx hmx = this.f17721i;
        if (hmx != null) {
            hmx.close();
            this.f17721i = null;
        }
        if (!this.f17720h.isDone()) {
            this.f17714b.mo514b("Previous request exists, setting exception and nulling request.");
            this.f17720h.m17780a(new isr("Config canceled"));
        }
        this.f17715c.getHolder().removeCallback(this.f17724m);
        this.f17722k.removeView(this.f17715c);
        this.f17723l.removeOnLayoutChangeListener(this);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        hmx hmx = this.f17721i;
        if (hmx != null) {
            hmx.mo3093a(this.f17716d.mo1448f());
        }
    }
}
