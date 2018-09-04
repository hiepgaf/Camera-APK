package p000;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import com.google.android.GoogleCamera.R;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: had */
public final class had {
    /* renamed from: a */
    public final ObjectAnimator f5872a;
    /* renamed from: b */
    public final ObjectAnimator f5873b;
    /* renamed from: c */
    private final View f5874c;

    public had(hes hes, Context context) {
        this.f5874c = (View) hes.f6120j.m3223a((int) R.id.toybox_notification_dot);
        View view = this.f5874c;
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.video_hint_fade_in);
        objectAnimator.setTarget(view);
        objectAnimator.setDuration(250);
        objectAnimator.addListener(new hae(view));
        this.f5872a = objectAnimator;
        view = this.f5874c;
        objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.video_hint_fade_out);
        objectAnimator.setDuration(250);
        objectAnimator.setTarget(view);
        objectAnimator.addListener(new haf(view));
        this.f5873b = objectAnimator;
    }
}
