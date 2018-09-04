package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.design.widget.FloatingActionButton;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: cli */
public final class cli {
    /* renamed from: a */
    public static final String f2113a = bli.m862a("AddCreationFabMenu");
    /* renamed from: l */
    private static final clr f2114l = new clj();
    /* renamed from: b */
    public FloatingActionButton f2115b;
    /* renamed from: c */
    public View f2116c;
    /* renamed from: d */
    public boolean f2117d = false;
    /* renamed from: e */
    public LinearLayout f2118e;
    /* renamed from: f */
    public boolean f2119f;
    /* renamed from: g */
    public Interpolator f2120g;
    /* renamed from: h */
    public volatile boolean f2121h = false;
    /* renamed from: i */
    public final Map f2122i = new ConcurrentHashMap();
    /* renamed from: j */
    public clr f2123j = f2114l;
    /* renamed from: k */
    private final clq f2124k;

    public cli(clq clq) {
        this.f2124k = clq;
    }

    /* renamed from: a */
    final View m1170a(jiy jiy, int i, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f2118e.getContext()).inflate(R.layout.burst_editor_speed_dial_item, this.f2118e, false);
        this.f2118e.addView(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.speed_dial_text);
        textView.setText(i);
        textView.requestLayout();
        ((ImageView) linearLayout.findViewById(R.id.speed_dial_button)).setImageResource(i2);
        linearLayout.setVisibility(8);
        this.f2122i.put(jiy, linearLayout);
        linearLayout.setOnClickListener(new clo(this, jiy));
        return linearLayout;
    }

    /* renamed from: a */
    final void m1172a(boolean z) {
        float f;
        float f2;
        long j;
        Collection arrayList = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2115b.setImageResource(R.drawable.ic_clear_white);
        arrayList.add(ObjectAnimator.ofFloat(this.f2115b, View.ROTATION, new float[]{-90.0f, 0.0f}));
        FloatingActionButton floatingActionButton;
        if (z) {
            floatingActionButton = this.f2115b;
            floatingActionButton.setContentDescription(floatingActionButton.getResources().getString(R.string.burst_editor_close_speed_dial_description));
        } else {
            floatingActionButton = this.f2115b;
            floatingActionButton.setContentDescription(floatingActionButton.getResources().getString(R.string.burst_editor_open_speed_dial_description));
        }
        View view = this.f2116c;
        float[] fArr = new float[2];
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        arrayList.add(ObjectAnimator.ofFloat(view, "alpha", fArr));
        int i = 0;
        while (i < this.f2118e.getChildCount()) {
            int childCount;
            float f3;
            float f4;
            View childAt = this.f2118e.getChildAt(i);
            int height = childAt.getHeight() / 2;
            ImageView imageView = (ImageView) childAt.findViewById(R.id.speed_dial_button);
            if (z) {
                childAt.setAlpha(0.0f);
            }
            if (z) {
                childCount = (this.f2118e.getChildCount() - i) * 30;
            } else {
                childCount = i * 20;
            }
            Property property = View.TRANSLATION_Y;
            float[] fArr2 = new float[2];
            if (z) {
                f3 = (float) height;
            } else {
                f3 = 0.0f;
            }
            fArr2[0] = f3;
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = (float) height;
            }
            fArr2[1] = f3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, fArr2);
            long j2 = (long) childCount;
            ofFloat.setStartDelay(j2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, View.ALPHA, new float[]{f, f2});
            ofFloat2.setStartDelay(j2);
            if (z) {
                f3 = 0.5f;
            } else {
                f3 = 1.0f;
            }
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, new float[]{f3, f4});
            ofFloat3.setStartDelay(j2);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView, View.SCALE_Y, new float[]{f3, f4});
            ofFloat4.setStartDelay(j2);
            if (!z && i == 0) {
                ofFloat2.addListener(new cln(this));
            }
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            arrayList.add(ofFloat3);
            arrayList.add(ofFloat4);
            i++;
        }
        animatorSet.setInterpolator(this.f2120g);
        if (z) {
            j = 218;
        } else {
            j = 150;
        }
        animatorSet.setDuration(j);
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new clm(this));
        animatorSet.start();
    }

    /* renamed from: a */
    final void m1171a() {
        if (this.f2118e.getVisibility() != 8) {
            this.f2117d = false;
            m1172a(this.f2117d);
            this.f2115b.setImageResource(R.drawable.ic_auto_awesome);
        }
    }

    /* renamed from: b */
    public final void m1173b() {
        m1171a();
        this.f2115b.setVisibility(8);
        this.f2116c.setVisibility(8);
    }

    /* renamed from: c */
    public final void m1174c() {
        kpk a;
        cop cop = this.f2124k.f2131a.f12162f;
        if (cop == null) {
            a = kow.m13617a(ken.m13464e());
        } else {
            a = cop.mo708a();
        }
        kow.m13622a(a, new clp(this), new ikd());
    }
}
