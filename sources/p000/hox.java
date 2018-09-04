package p000;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.zoomui.ZoomMarkerView;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* compiled from: PG */
/* renamed from: hox */
public final class hox implements how, iqo {
    /* renamed from: e */
    private static final String f17962e = bli.m862a("ZoomUiCtrl");
    /* renamed from: a */
    public float f17963a = 1.0f;
    /* renamed from: b */
    public final hpf f17964b = new hom();
    /* renamed from: c */
    public SeekBar f17965c;
    /* renamed from: d */
    public ZoomMarkerView f17966d;
    /* renamed from: f */
    private float f17967f;
    /* renamed from: g */
    private final hpt f17968g = new hot(this.f17964b);
    /* renamed from: h */
    private ImageButton f17969h;
    /* renamed from: i */
    private ImageButton f17970i;
    /* renamed from: j */
    private final ilp f17971j;
    /* renamed from: k */
    private final ikb f17972k = new ikb();
    /* renamed from: l */
    private final boolean f17973l;
    /* renamed from: m */
    private final irs f17974m;
    /* renamed from: n */
    private final hjf f17975n;
    /* renamed from: o */
    private iut f17976o = iut.BACK;
    /* renamed from: p */
    private kbg f17977p = kau.f19138a;
    /* renamed from: q */
    private final ilp f17978q;

    public hox(ilp ilp, ilp ilp2, boolean z, irs irs, hjf hjf) {
        this.f17971j = ilp;
        this.f17973l = z;
        this.f17974m = irs;
        this.f17975n = hjf;
        this.f17978q = ilp2;
    }

    public final void close() {
        this.f17972k.close();
    }

    /* renamed from: a */
    public final void mo1750a() {
        this.f17968g.mo2699c();
    }

    /* renamed from: b */
    public final void mo1755b() {
        this.f17970i.setSoundEffectsEnabled(false);
        this.f17969h.setSoundEffectsEnabled(false);
    }

    /* renamed from: c */
    public final void mo1757c() {
        this.f17968g.ag();
        if (this.f17973l) {
            this.f17964b.ah();
        }
    }

    /* renamed from: d */
    public final void mo1759d() {
        this.f17970i.setSoundEffectsEnabled(true);
        this.f17969h.setSoundEffectsEnabled(true);
    }

    /* renamed from: e */
    public final void mo1760e() {
        if (!this.f17973l) {
            this.f17964b.mo2701e();
        }
    }

    /* renamed from: a */
    public final void mo1752a(ZoomUi zoomUi, Context context) {
        this.f17969h = (ImageButton) zoomUi.findViewById(R.id.zoom_minus_button);
        this.f17970i = (ImageButton) zoomUi.findViewById(R.id.zoom_plus_button);
        this.f17965c = zoomUi.m1346b();
        this.f17966d = zoomUi.m1345a();
        m11935a(this.f17969h, false);
        m11935a(this.f17970i, true);
        this.f17972k.mo1879a(this.f17971j.mo2859a(new hpb(this), kpq.f8410a));
        this.f17965c.setOnSeekBarChangeListener(new hpc(this));
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.scrolling);
        valueAnimator.addUpdateListener(new hpd(this));
        this.f17964b.mo3569a(this.f17968g, zoomUi, this.f17966d, this.f17971j, this.f17973l, valueAnimator, this.f17974m);
        this.f17968g.mo3570a(zoomUi);
        this.f17968g.mo1562a();
    }

    /* renamed from: f */
    public final void mo1761f() {
        this.f17964b.ag();
    }

    /* renamed from: a */
    public final void mo1751a(float f) {
        this.f17964b.mo3464b(f);
    }

    /* renamed from: g */
    public final void mo1762g() {
        this.f17964b.an();
    }

    /* renamed from: h */
    public final void mo1763h() {
        this.f17964b.mo2704g();
    }

    /* renamed from: i */
    public final void mo1764i() {
        this.f17971j.mo348a(Float.valueOf(this.f17963a));
    }

    /* renamed from: b */
    public final void mo1756b(float f) {
        if (f < this.f17963a) {
            String str = f17962e;
            float f2 = this.f17963a;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("resetZoom zoomValue=");
            stringBuilder.append(f);
            stringBuilder.append(" minZoomValue=");
            stringBuilder.append(f2);
            bli.m873e(str, stringBuilder.toString());
            f = this.f17963a;
        }
        this.f17971j.mo348a(Float.valueOf(f));
        this.f17966d.m1344a(f);
    }

    /* renamed from: l */
    private final void m11937l() {
        float f;
        String str;
        float f2 = this.f17967f;
        if (!this.f17975n.m3195c()) {
            f = f2;
        } else if (this.f17977p.mo2084b()) {
            inc inc = (inc) this.f17977p.mo2081a();
            if (this.f17976o.equals(iut.FRONT)) {
                f = 5.0f;
            } else if (inc.equals(inc.FPS_30)) {
                f = 5.0f;
            } else if (inc.equals(inc.FPS_60)) {
                f = 3.0f;
            } else if (inc.equals(inc.FPS_120)) {
                f = 3.0f;
            } else if (inc.equals(inc.FPS_240)) {
                f = 3.0f;
            } else {
                str = f17962e;
                String valueOf = String.valueOf(inc);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                stringBuilder.append("Unknown camcorder capture rate");
                stringBuilder.append(valueOf);
                bli.m866b(str, stringBuilder.toString());
                f = f2;
            }
        } else {
            f = f2;
        }
        String str2 = f17962e;
        str = String.valueOf(this.f17977p);
        String valueOf2 = String.valueOf(this.f17976o);
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(valueOf2).length());
        stringBuilder2.append("Set the max zoom level to ");
        stringBuilder2.append(f);
        stringBuilder2.append(" for ");
        stringBuilder2.append(str);
        stringBuilder2.append(" and ");
        stringBuilder2.append(valueOf2);
        bli.m863a(str2, stringBuilder2.toString());
        this.f17978q.mo348a(Float.valueOf(f));
        ZoomMarkerView zoomMarkerView = this.f17966d;
        zoomMarkerView.f2457e = f;
        zoomMarkerView.f2453a.f6438i = f;
        this.f17964b.f23317t = f;
    }

    /* renamed from: c */
    public final void mo1758c(float f) {
        if (f < 1.0f) {
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("Invalid min zoom value: ");
            stringBuilder.append(f);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f17963a = f;
        this.f17964b.f23318u = f;
        ZoomMarkerView zoomMarkerView = this.f17966d;
        zoomMarkerView.f2458f = f;
        zoomMarkerView.f2453a.f6439j = f;
        zoomMarkerView.f2455c = f;
        if (((Float) this.f17971j.mo2860b()).floatValue() < f) {
            this.f17971j.mo348a(Float.valueOf(f));
        }
    }

    /* renamed from: a */
    private final void m11935a(ImageButton imageButton, boolean z) {
        imageButton.setOnClickListener(new hoy(this, z));
        imageButton.setOnLongClickListener(new hoz(this, z));
        imageButton.setOnTouchListener(new hpa(this));
    }

    /* renamed from: a */
    public final void mo1754a(kbg kbg) {
        this.f17977p = kbg;
        m11937l();
    }

    /* renamed from: a */
    public final void mo1753a(ffc ffc) {
        this.f17976o = ffc.mo1921c();
        this.f17967f = ffc.mo1929k();
        m11937l();
    }

    /* renamed from: j */
    public final void mo1765j() {
        this.f17964b.ah();
        this.f17964b.mo3461b(true);
    }

    /* renamed from: k */
    public final void mo1766k() {
        this.f17964b.ah();
        this.f17964b.mo3461b(false);
    }
}
