package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;

/* compiled from: PG */
/* renamed from: cng */
public final class cng extends cnf {
    /* renamed from: x */
    private static int f20325x;
    /* renamed from: p */
    public final cno f20326p;
    /* renamed from: q */
    public Uri f20327q;
    /* renamed from: r */
    public cmg f20328r;
    /* renamed from: s */
    public final BurstImageView f20329s;
    /* renamed from: t */
    public acj f20330t;
    /* renamed from: u */
    private FrameLayout f20331u;
    /* renamed from: v */
    private final FrameLayout f20332v;
    /* renamed from: w */
    private ValueAnimator f20333w;

    public cng(cnk cnk, FrameLayout frameLayout, cne cne) {
        super(frameLayout);
        this.f20326p = cnk.f12191c;
        this.f20331u = frameLayout;
        this.f20329s = (BurstImageView) frameLayout.findViewById(R.id.burst_grid_image_view);
        this.f20332v = (FrameLayout) frameLayout.findViewById(R.id.selection_padding_frame_layout);
        this.f20329s.setOnClickListener(new cnh(this, cne));
        this.f20329s.setOnLongClickListener(new cni(this, cne));
        if (f20325x == 0) {
            f20325x = this.f20329s.getContext().getResources().getDimensionPixelOffset(R.dimen.burst_grid_select_matting);
        }
        this.f20333w = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f});
        this.f20333w.setDuration(250);
        this.f20333w.setInterpolator(axl.f1008a);
        this.f20333w.addUpdateListener(new cnj(this));
    }

    /* renamed from: b */
    public final void mo2778b(boolean z) {
        int i;
        boolean a = this.f20326p.m1200a();
        boolean a2 = this.f20326p.m1201a(this.f20327q);
        ImageView imageView = (ImageView) this.f20331u.findViewById(R.id.selection_circle);
        if (a) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        a = imageView.isSelected();
        imageView.setSelected(a2);
        if (a == a2) {
            z = false;
        }
        if (a2) {
            if (z) {
                this.f20333w.setFloatValues(new float[]{0.0f, (float) f20325x});
                this.f20333w.start();
            } else {
                m15043a((float) f20325x);
            }
        } else if (z) {
            this.f20333w.setFloatValues(new float[]{(float) f20325x, 0.0f});
            this.f20333w.start();
        } else {
            m15043a(0.0f);
        }
        this.f20329s.invalidate();
    }

    /* renamed from: c */
    public final void m15046c(boolean z) {
        BurstImageView burstImageView = this.f20329s;
        burstImageView.f2316a = z;
        burstImageView.postInvalidate();
    }

    /* renamed from: a */
    final void m15043a(float f) {
        int i = (int) f;
        this.f20332v.setPadding(i, i, i, i);
        if (f > 0.0f) {
            this.f20332v.setBackgroundResource(R.color.burst_editor_selected_bg_color);
        } else {
            this.f20332v.setBackgroundColor(0);
        }
        this.f20332v.invalidate();
    }

    /* renamed from: a */
    public final void m15044a(acm acm, cot cot) {
        acj a = acm.m6281a(Drawable.class);
        aqg b = new aqg().m610d().m608b(256, 256);
        eru eru = cot.f12527c.f12515e;
        acj a2 = a.m119a(b.m598a(new are(eru.f4151d, eru.f4153f.getTime(), 0)));
        Object acq = new acq('\u0000');
        acq.f255a = (arc) aqe.m585a(new aqv(new aqw().f893a), "Argument must not be null");
        a2.f237b = (acq) aqe.m585a(acq, "Argument must not be null");
        a2.f239d = false;
        this.f20330t = a2.m120a(this.f20327q);
        this.f20330t.m123a(this.f20329s);
    }
}
