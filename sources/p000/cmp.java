package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cmp */
public final class cmp {
    /* renamed from: n */
    private static final String f2159n = bli.m862a("GridZoomMgr");
    /* renamed from: a */
    public final cmy f2160a;
    /* renamed from: b */
    public List f2161b = new ArrayList();
    /* renamed from: c */
    public boolean f2162c;
    /* renamed from: d */
    public Animator f2163d;
    /* renamed from: e */
    public ViewGroup f2164e;
    /* renamed from: f */
    public RecyclerView f2165f;
    /* renamed from: g */
    public cnb f2166g;
    /* renamed from: h */
    public cmg f2167h;
    /* renamed from: i */
    public Context f2168i;
    /* renamed from: j */
    public View f2169j;
    /* renamed from: k */
    public boolean f2170k;
    /* renamed from: l */
    public final Map f2171l = new HashMap();
    /* renamed from: m */
    public ViewPager f2172m;

    public cmp(cmy cmy) {
        this.f2160a = cmy;
    }

    /* renamed from: a */
    private static Rect m1187a(Rect rect, Rect rect2) {
        if (rect.height() == 0 || rect2.height() == 0) {
            bli.m866b(f2159n, "Invalid sizes for centerUncrop Rects.");
            return rect;
        } else if (((float) rect.width()) / ((float) rect.height()) <= ((float) rect2.width()) / ((float) rect2.height())) {
            r2 = (double) ((((float) ((rect2.width() * rect.height()) / rect2.height())) - ((float) rect.width())) / 2.0f);
            return new Rect(rect.left - ((int) Math.floor(r2)), rect.top, ((int) Math.ceil(r2)) + rect.right, rect.bottom);
        } else {
            r2 = (double) ((((float) ((rect2.height() * rect.width()) / rect2.width())) - ((float) rect.height())) / 2.0f);
            return new Rect(rect.left, rect.top - ((int) Math.floor(r2)), rect.right, ((int) Math.ceil(r2)) + rect.bottom);
        }
    }

    /* renamed from: c */
    private static Rect m1190c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    static void m1188a(View view) {
        view.setPivotX((float) (view.getWidth() / 2));
        view.setPivotY((float) (view.getHeight() / 2));
    }

    /* renamed from: b */
    static void m1189b(View view) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
    }

    /* renamed from: a */
    public final void m1193a(int i) {
        float f;
        ViewPager viewPager = this.f2172m;
        if (i == 0) {
            f = 255.0f;
        } else {
            f = 0.0f;
        }
        viewPager.setAlpha(f);
        this.f2172m.setVisibility(i);
        this.f2169j.setVisibility(i);
    }

    /* renamed from: a */
    public final void m1194a(Uri uri) {
        ImageButton imageButton = (ImageButton) this.f2164e.findViewById(R.id.share);
        ImageButton imageButton2 = (ImageButton) this.f2164e.findViewById(R.id.edit);
        ImageButton imageButton3 = (ImageButton) this.f2164e.findViewById(R.id.delete);
        if (uri != null) {
            if (this.f2170k) {
                imageButton.setOnClickListener(null);
                imageButton.setClickable(false);
                imageButton.setVisibility(8);
            } else {
                imageButton.setOnClickListener(new cmv(this, uri));
            }
            if (this.f2170k) {
                imageButton2.setOnClickListener(null);
                imageButton2.setClickable(false);
                imageButton2.setVisibility(8);
            } else {
                imageButton2.setOnClickListener(new cmw(this, uri));
            }
            imageButton3.setOnClickListener(new cmx(this, uri));
            return;
        }
        imageButton.setOnClickListener(null);
        imageButton.setClickable(false);
        imageButton2.setOnClickListener(null);
        imageButton2.setClickable(false);
        imageButton3.setOnClickListener(null);
        imageButton3.setClickable(false);
    }

    /* renamed from: a */
    final cnb m1191a(BurstImageView burstImageView, kvr kvr) {
        Rect c = cmp.m1190c(burstImageView);
        Rect c2 = cmp.m1190c(kvr);
        cot cot = (cot) this.f2161b.get(this.f2172m.f585e);
        Rect a = cmp.m1187a(cmp.m1187a(c, new Rect(0, 0, cot.f12527c.mo1034h().f7329a, cot.f12527c.mo1034h().f7330b)), c2);
        float width = ((float) a.width()) / ((float) c2.width());
        int i = a.left;
        int i2 = c2.left;
        int i3 = a.top;
        int i4 = c2.top;
        Rect rect = new Rect(c);
        rect.offset(-a.left, -a.top);
        rect.left = (int) (((float) rect.left) / width);
        rect.top = (int) (((float) rect.top) / width);
        rect.right = (int) (((float) rect.right) / width);
        rect.bottom = (int) (((float) rect.bottom) / width);
        Rect rect2 = new Rect(c2);
        rect2.offset(-c2.left, -c2.top);
        return new cnb(burstImageView, (float) (i - i2), (float) (i3 - i4), width, rect, rect2);
    }

    /* renamed from: a */
    public final void m1192a() {
        if (this.f2166g != null) {
            Animator animator = this.f2163d;
            if (animator != null) {
                animator.cancel();
            }
            this.f2165f.setVisibility(0);
            m1194a(null);
            this.f2162c = false;
            if (this.f2161b.isEmpty()) {
                this.f2165f.setAlpha(1.0f);
                m1193a(4);
                this.f2160a.m1195a();
                this.f2166g = null;
                return;
            }
            cng b;
            cnb cnb;
            cmy cmy = this.f2160a;
            cot cot = (cot) this.f2161b.get(this.f2172m.f585e);
            cmg cmg = this.f2167h;
            for (int i = 0; i < cmy.f2187a.f12169m.m1178b(); i++) {
                cmf a = cmy.f2187a.f12169m.m1176a(i);
                if (a.f2137b == cmg && kbf.m16436b(a.f2136a.f12527c.f12515e.f4155h, cot.f12527c.f12515e.f4155h)) {
                    b = cmy.f2187a.f12166j.m1199b(i);
                    break;
                }
            }
            b = null;
            kvr kvr = (kvr) this.f2171l.get(((cot) this.f2161b.get(this.f2172m.f585e)).f12527c.f12515e.f4155h);
            if (b == null) {
                cnb = this.f2166g;
            } else {
                cnb = m1191a(b.f20329s, kvr);
            }
            BurstImageView burstImageView = cnb.f2194a;
            burstImageView.setAlpha(0.0f);
            kvr.m5472e();
            cmp.m1189b(kvr);
            Animator animatorSet = new AnimatorSet();
            Animator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new cmo(kvr, cnb));
            animatorSet.play(ObjectAnimator.ofFloat(kvr, View.TRANSLATION_X, new float[]{0.0f, cnb.f2195b})).with(ObjectAnimator.ofFloat(kvr, View.TRANSLATION_Y, new float[]{0.0f, cnb.f2196c})).with(ObjectAnimator.ofFloat(kvr, View.SCALE_X, new float[]{1.0f, cnb.f2197d})).with(ObjectAnimator.ofFloat(kvr, View.SCALE_Y, new float[]{1.0f, cnb.f2197d})).with(ObjectAnimator.ofFloat(this.f2165f, View.ALPHA, new float[]{0.0f, 1.0f})).with(ObjectAnimator.ofFloat(this.f2169j, View.ALPHA, new float[]{1.0f, 0.0f})).with(ofFloat);
            animatorSet.setDuration(250);
            animatorSet.setInterpolator(axl.f1008a);
            animatorSet.addListener(new cmu(this, burstImageView, kvr));
            animatorSet.start();
            this.f2163d = animatorSet;
            this.f2166g = null;
        }
    }
}
