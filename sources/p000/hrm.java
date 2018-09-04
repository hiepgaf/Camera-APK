package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hrm */
public final class hrm extends hdz {
    /* renamed from: a */
    public ImageView f18088a;
    /* renamed from: b */
    public int f18089b = 0;
    /* renamed from: i */
    public final hrt[] f18090i = new hrt[]{new hrt(R.string.refocus_tutorial_title_slide_1, R.id.slide_1, R.string.refocus_tutorial_next, this.f18098q), new hrt(R.string.refocus_tutorial_title_slide_2, R.id.slide_2, R.string.refocus_tutorial_next, null), new hrt(R.string.refocus_tutorial_title_slide_3, R.id.slide_3, R.string.refocus_tutorial_ok_got_it, this.f18099r)};
    /* renamed from: j */
    private View f18091j;
    /* renamed from: k */
    private TextView f18092k;
    /* renamed from: l */
    private Button f18093l;
    /* renamed from: m */
    private Button f18094m;
    /* renamed from: n */
    private final int f18095n;
    /* renamed from: o */
    private final Matrix f18096o = new Matrix();
    /* renamed from: p */
    private ImageView f18097p;
    /* renamed from: q */
    private final AnimatorSet f18098q = new AnimatorSet();
    /* renamed from: r */
    private final AnimatorSet f18099r = new AnimatorSet();

    public hrm(hea hea, Context context) {
        super(context, R.layout.refocus_tutorial, hea);
        this.f18095n = context.getResources().getDimensionPixelSize(R.dimen.refocus_tutorial_viewfinder_size);
    }

    /* renamed from: a */
    private static void m11968a(AnimatorSet animatorSet) {
        animatorSet.removeAllListeners();
        animatorSet.addListener(new hrs(animatorSet));
    }

    /* renamed from: a */
    final void m11969a(int i) {
        int i2 = 8;
        hrt hrt = this.f18090i[this.f18089b];
        this.f18091j.findViewById(hrt.f6519b).setVisibility(8);
        AnimatorSet animatorSet = hrt.f6521d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        hrt = this.f18090i[i];
        this.f18091j.findViewById(hrt.f6519b).setVisibility(0);
        this.f18092k.setText(hrt.f6518a);
        this.f18093l.setText(hrt.f6520c);
        this.f18089b = i;
        animatorSet = hrt.f6521d;
        if (animatorSet != null) {
            animatorSet.start();
        }
        int length = this.f18090i.length;
        Button button = this.f18094m;
        if (i != length - 1) {
            i2 = 0;
        }
        button.setVisibility(i2);
    }

    /* renamed from: a */
    protected final void mo1233a(View view) {
        this.f18091j = view;
        this.f18092k = (TextView) this.f18091j.findViewById(R.id.refocus_tutorial_title);
        this.f18093l = (Button) this.f18091j.findViewById(R.id.next_button);
        this.f18094m = (Button) this.f18091j.findViewById(R.id.skip_link);
        this.f18097p = (ImageView) this.f18091j.findViewById(R.id.slide_1_photo_front);
        this.f18088a = (ImageView) this.f18091j.findViewById(R.id.slide_3_viewfinder_graphic);
        ImageView imageView = (ImageView) this.f18091j.findViewById(R.id.distance_graphic);
        imageView.addOnLayoutChangeListener(new hrn(this, imageView));
        m11971a(imageView, -10.0f);
        ObjectAnimator.ofFloat(this.f18097p, "alpha", new float[]{1.0f, 0.0f}).setDuration(200).setStartDelay(200);
        ObjectAnimator.ofFloat(this.f18097p, "alpha", new float[]{0.0f, 1.0f}).setDuration(200).setStartDelay(200);
        this.f18098q.playSequentially(new Animator[]{r0, r1});
        hrm.m11968a(this.f18098q);
        Animator duration = ObjectAnimator.ofFloat(this.f18088a, "alpha", new float[]{0.0f, 1.0f}).setDuration(200);
        duration.addListener(new hro(this));
        duration.setStartDelay(100);
        ValueAnimator.ofFloat(new float[]{-10.0f, -30.0f}).setDuration(1000).addUpdateListener(new hrp(this));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f18088a, "alpha", new float[]{1.0f, 0.0f}).setDuration(200);
        this.f18099r.playSequentially(new Animator[]{duration, r1, duration2});
        hrm.m11968a(this.f18099r);
        this.f18093l.setOnClickListener(new hrq(this));
        this.f18094m.setOnClickListener(new hrr(this));
        m11969a(0);
    }

    /* renamed from: a */
    final void m11971a(ImageView imageView, float f) {
        this.f18096o.reset();
        this.f18096o.postRotate(f, (float) (-(imageView.getWidth() / 4)), (float) (imageView.getHeight() / 4));
        this.f18096o.postTranslate((float) (this.f18095n / 4), (float) (imageView.getHeight() - this.f18095n));
        imageView.setImageMatrix(this.f18096o);
    }

    /* renamed from: c */
    public final void mo1775c() {
        for (hrt hrt : this.f18090i) {
            AnimatorSet animatorSet = hrt.f6521d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
        super.mo1775c();
    }
}
