package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayList;
import java.util.List;
import p000.hdy;
import p000.hif;
import p000.hir;
import p000.hkg;
import p000.ikd;
import p000.khb;
import p000.ks;

/* compiled from: PG */
public class BottomBar extends LinearLayout {
    public static final int RECORDING_BACKGROUND_FADE_ANIM_DELAY_MS = 217;
    public static final int RECORDING_BACKGROUND_FADE_ANIM_DURATION_MS = 217;
    public static final int RECORDING_CONTROLS_SLIDE_IN_ANIM_DELAY_MS = 100;
    public static final int RECORDING_CONTROLS_SLIDE_IN_ANIM_DURATION_MS = 200;
    public static final int RECORDING_CONTROLS_SLIDE_OUT_ANIM_DURATION_MS = 150;
    public final int backgroundColor;
    public CameraSwitchButton cameraSwitchButton;
    public ImageButton cancelButton;
    public List children;
    public int contentSidePadding;
    public View currentLeftButton;
    public View currentRightButton;
    public HfrButton hfrButton;
    public final List inProgressAnimators;
    public boolean isReversed = false;
    public hir orientation;
    public PauseResumeButton pauseResumeButton;
    public SmoothRotateSwitchButton photoSwitchButton;
    public ImageButton retakeButton;
    public ImageButton reviewPlayButton;
    public ShutterButton shutterButton;
    public SnapshotButton snapshotButton;
    public RoundedThumbnailView thumbnailView;
    public int verticalOffset;
    public SmoothRotateSwitchButton videoSwitchButton;

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.BottomBar$2 */
    class C01392 implements hif {
        C01392() {
        }

        public int getColor() {
            return ((ColorDrawable) BottomBar.this.getBackground()).getColor();
        }

        public void setColor(int i) {
            BottomBar.this.setBackgroundColor(i);
        }
    }

    public BottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.backgroundColor = context.getColor(C0042R.color.bottom_bar_background_color);
        this.inProgressAnimators = new ArrayList();
        inflate(context);
    }

    private void applyOrientation() {
        Trace.beginSection("bottomBar:applyOrientation");
        int i = this.verticalOffset;
        if (hdy.m3085c(getContext())) {
            i = 0;
        }
        int i2;
        if (this.orientation == hir.PORTRAIT || this.orientation == hir.REVERSE_PORTRAIT) {
            setOrientation(0);
            reorderChildren(false);
            i2 = this.contentSidePadding;
            setPadding(i2, i, i2, 0);
        } else if (this.orientation == hir.LANDSCAPE) {
            setOrientation(1);
            reorderChildren(true);
            i2 = this.contentSidePadding;
            setPadding(i, i2, 0, i2);
        } else if (this.orientation == hir.REVERSE_LANDSCAPE) {
            setOrientation(1);
            reorderChildren(false);
            i2 = this.contentSidePadding;
            setPadding(0, i2, i, i2);
        }
        Trace.endSection();
    }

    void changeSideButtons(View view, View view2, boolean z) {
        ikd.m12259a();
        for (ObjectAnimator end : this.inProgressAnimators) {
            end.end();
        }
        this.inProgressAnimators.clear();
        View view3 = this.currentLeftButton;
        if (view3 != null) {
            fadeView(view3, false, z);
        }
        this.currentLeftButton = view;
        if (view != null) {
            fadeView(view, true, z);
        }
        view3 = this.currentRightButton;
        if (view3 != null) {
            fadeView(view3, false, z);
        }
        this.currentRightButton = view2;
        if (view2 != null) {
            fadeView(view2, true, z);
        }
    }

    void fadeBackground(boolean z, boolean z2) {
        int i = 0;
        ikd.m12259a();
        if (z2) {
            ObjectAnimator ofInt;
            if (z) {
                ofInt = ObjectAnimator.ofInt(getBackground(), "alpha", new int[]{0, Illuminant.kOther});
            } else {
                ofInt = ObjectAnimator.ofInt(getBackground(), "alpha", new int[]{Illuminant.kOther, 0});
            }
            ofInt.setDuration(217);
            ofInt.setStartDelay(217);
            ofInt.start();
            return;
        }
        Drawable background = getBackground();
        if (z) {
            i = Illuminant.kOther;
        }
        background.setAlpha(i);
    }

    private void fadeView(final View view, final boolean z, boolean z2) {
        ikd.m12259a();
        if (z2) {
            ObjectAnimator ofFloat;
            final boolean isClickable = view.isClickable();
            view.setClickable(false);
            if (z) {
                ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setStartDelay(100);
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new ks());
                view.setAlpha(0.0f);
                view.setVisibility(0);
            } else {
                ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
                ofFloat.setDuration(150);
                ofFloat.setInterpolator(new LinearInterpolator());
            }
            ofFloat.addListener(new AnimatorListenerAdapter(this) {
                public void onAnimationEnd(Animator animator) {
                    if (!z) {
                        view.setVisibility(8);
                    }
                    if (isClickable) {
                        view.setClickable(true);
                    }
                }
            });
            this.inProgressAnimators.add(ofFloat);
            ofFloat.start();
            return;
        }
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        view.setAlpha(!z ? 0.0f : 1.0f);
    }

    public hif getBackgroundColorProperty() {
        return new C01392();
    }

    CameraSwitchButton getCameraSwitchButton() {
        return this.cameraSwitchButton;
    }

    ImageButton getCancelButton() {
        return this.cancelButton;
    }

    HfrButton getHfrButton() {
        return this.hfrButton;
    }

    PauseResumeButton getPauseResumeButton() {
        return this.pauseResumeButton;
    }

    SmoothRotateSwitchButton getPhotoSwitchButton() {
        return this.photoSwitchButton;
    }

    float getPhotoVideoSwitchTranslation() {
        return (getResources().getDimension(C0042R.dimen.bottom_bar_content_size) + getResources().getDimension(C0042R.dimen.photo_video_switch_size)) / 2.0f;
    }

    ImageButton getRetakeButton() {
        return this.retakeButton;
    }

    ImageButton getReviewPlayButton() {
        return this.reviewPlayButton;
    }

    public ShutterButton getShutterButton() {
        return this.shutterButton;
    }

    SnapshotButton getSnapshotButton() {
        return this.snapshotButton;
    }

    public RoundedThumbnailView getThumbnailButton() {
        return this.thumbnailView;
    }

    SmoothRotateSwitchButton getVideoSwitchButton() {
        return this.videoSwitchButton;
    }

    private void inflate(Context context) {
        hkg a = hkg.m3221a(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0042R.layout.bottom_bar_layout, this));
        this.shutterButton = (ShutterButton) a.m3223a(C0042R.id.shutter_button);
        this.photoSwitchButton = (SmoothRotateSwitchButton) a.m3223a(C0042R.id.photo_switch_button);
        this.photoSwitchButton.setIsPhotoButton(true);
        this.photoSwitchButton.setEnabled(false);
        this.photoSwitchButton.setTranslation(getPhotoVideoSwitchTranslation());
        this.videoSwitchButton = (SmoothRotateSwitchButton) a.m3223a(C0042R.id.video_switch_button);
        this.videoSwitchButton.setIsPhotoButton(false);
        this.videoSwitchButton.setEnabled(false);
        this.pauseResumeButton = (PauseResumeButton) a.m3223a(C0042R.id.pause_resume_button);
        this.cameraSwitchButton = (CameraSwitchButton) a.m3223a(C0042R.id.camera_switch_button);
        this.snapshotButton = (SnapshotButton) a.m3223a(C0042R.id.snapshot_button);
        this.thumbnailView = (RoundedThumbnailView) a.m3223a(C0042R.id.thumbnail_button);
        this.hfrButton = (HfrButton) a.m3223a(C0042R.id.hfr_button);
        this.cancelButton = (ImageButton) a.m3223a(C0042R.id.cancel_button);
        this.retakeButton = (ImageButton) a.m3223a(C0042R.id.retake_button);
        this.reviewPlayButton = (ImageButton) a.m3223a(C0042R.id.review_play_button);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.children = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            this.children.add(getChildAt(i));
        }
        this.verticalOffset = getResources().getDimensionPixelSize(C0042R.dimen.bottom_bar_vertical_offset);
        this.contentSidePadding = getResources().getDimensionPixelSize(C0042R.dimen.bottom_bar_side_padding);
        setBackgroundColor(this.backgroundColor);
        this.currentLeftButton = getCameraSwitchButton();
        this.currentRightButton = getThumbnailButton();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("bottomBar:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        Trace.endSection();
    }

    protected void onMeasure(int i, int i2) {
        Trace.beginSection("bottomBar:onMesure");
        super.setGravity(17);
        super.onMeasure(i, i2);
        Trace.endSection();
    }

    private void reorderChildren(boolean z) {
        if (this.isReversed != z) {
            this.isReversed = z;
            removeAllViews();
            List a;
            if (z) {
                a = khb.m4867a(this.children);
            } else {
                a = this.children;
            }
            for (View view : r0) {
                addView(view, view.getLayoutParams());
            }
        }
    }

    public void setClickable(boolean z) {
        getShutterButton().setClickEnabled(z);
        setSideButtonsClickable(z);
    }

    void setSideButtonsClickable(boolean z) {
        View view = this.currentRightButton;
        if (view != null) {
            view.setClickable(z);
        }
        view = this.currentLeftButton;
        if (view != null) {
            view.setClickable(z);
        }
    }

    public void setUiOrientation(hir hir) {
        if (this.orientation != hir) {
            this.orientation = hir;
            applyOrientation();
        }
    }
}
