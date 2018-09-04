package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.List;
import p000.hif;
import p000.ikd;
import p000.jqk;
import p000.ks;

/* compiled from: PG */
public class BottomBarController {
    public final BottomBar bottomBar;
    public final CameraSwitchButton cameraSwitchButton;
    public final ImageButton cancelButton;
    public final HfrButton hfrButton;
    public boolean isSelfieFlashOn;
    public final BottomBarListener listenerDispatcher = new C01614();
    public final List listeners;
    public final Object lock;
    public final PauseResumeButton pauseResumeButton;
    public boolean photoButtonFadeAnimationDone;
    public final ValueAnimator photoButtonFadeAnimator;
    public final SmoothRotateSwitchButton photoSwitchButton;
    public boolean photoVideoSwitchEnabled;
    public final float photoVideoSwitchTranslation;
    public final ImageButton retakeButton;
    public final ImageButton reviewPlayButton;
    public final SnapshotButton snapshotButton;
    public final RoundedThumbnailView thumbnailButton;
    public final SmoothRotateSwitchButton videoSwitchButton;

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.BottomBarController$1 */
    class C00351 implements AnimatorUpdateListener {
        C00351() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((SmoothRotateSwitchButton) jqk.m13102c(BottomBarController.this.photoSwitchButton)).setTranslation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.BottomBarController$2 */
    class C00362 extends AnimatorListenerAdapter {
        C00362() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomBarController.this.photoButtonFadeAnimationDone = true;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.BottomBarController$4 */
    class C01614 extends BottomBarListener {
        C01614() {
        }

        public void onCameraSwitch(int i) {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onCameraSwitch : BottomBarController.this.listeners) {
                    onCameraSwitch.onCameraSwitch(i);
                }
            }
        }

        public void onCancelButtonPressed() {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onCancelButtonPressed : BottomBarController.this.listeners) {
                    onCancelButtonPressed.onCancelButtonPressed();
                }
            }
        }

        public void onFpsSwitch(int i) {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onFpsSwitch : BottomBarController.this.listeners) {
                    onFpsSwitch.onFpsSwitch(i);
                }
            }
        }

        public void onPauseButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onPauseButtonClicked : BottomBarController.this.listeners) {
                    onPauseButtonClicked.onPauseButtonClicked();
                }
            }
        }

        public void onPhotoSwitchButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onPhotoSwitchButtonClicked : BottomBarController.this.listeners) {
                    onPhotoSwitchButtonClicked.onPhotoSwitchButtonClicked();
                }
            }
        }

        public void onResumeButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onResumeButtonClicked : BottomBarController.this.listeners) {
                    onResumeButtonClicked.onResumeButtonClicked();
                }
            }
        }

        public void onRetakeButtonPressed() {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onRetakeButtonPressed : BottomBarController.this.listeners) {
                    onRetakeButtonPressed.onRetakeButtonPressed();
                }
            }
        }

        public void onReviewPlayButtonPressed() {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onReviewPlayButtonPressed : BottomBarController.this.listeners) {
                    onReviewPlayButtonPressed.onReviewPlayButtonPressed();
                }
            }
        }

        public void onSnapshotButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onSnapshotButtonClicked : BottomBarController.this.listeners) {
                    onSnapshotButtonClicked.onSnapshotButtonClicked();
                }
            }
        }

        public void onThumbnailButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onThumbnailButtonClicked : BottomBarController.this.listeners) {
                    onThumbnailButtonClicked.onThumbnailButtonClicked();
                }
            }
        }

        public void onVideoSwitchButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                for (BottomBarListener onVideoSwitchButtonClicked : BottomBarController.this.listeners) {
                    onVideoSwitchButtonClicked.onVideoSwitchButtonClicked();
                }
            }
        }
    }

    public BottomBarController(BottomBar bottomBar, boolean z) {
        this.bottomBar = bottomBar;
        this.pauseResumeButton = bottomBar.getPauseResumeButton();
        this.cameraSwitchButton = bottomBar.getCameraSwitchButton();
        this.snapshotButton = bottomBar.getSnapshotButton();
        this.thumbnailButton = bottomBar.getThumbnailButton();
        this.photoSwitchButton = bottomBar.getPhotoSwitchButton();
        this.videoSwitchButton = bottomBar.getVideoSwitchButton();
        this.photoVideoSwitchEnabled = false;
        this.hfrButton = bottomBar.getHfrButton();
        this.hfrButton.setIs240FpsSupported(z);
        this.cancelButton = bottomBar.getCancelButton();
        this.retakeButton = bottomBar.getRetakeButton();
        this.reviewPlayButton = bottomBar.getReviewPlayButton();
        this.lock = new Object();
        this.listeners = new ArrayList();
        this.photoVideoSwitchTranslation = bottomBar.getPhotoVideoSwitchTranslation();
        this.photoButtonFadeAnimator = ValueAnimator.ofFloat(new float[]{0.0f, this.photoVideoSwitchTranslation});
        this.photoButtonFadeAnimator.setDuration(300);
        this.photoButtonFadeAnimator.setInterpolator(new ks());
        this.photoButtonFadeAnimator.addUpdateListener(new C00351());
        this.photoButtonFadeAnimator.addListener(new C00362());
    }

    public void addListener(BottomBarListener bottomBarListener) {
        synchronized (this.lock) {
            this.listeners.add(bottomBarListener);
        }
    }

    public void announceAccessibilityForThumbnail(String str) {
        RoundedThumbnailView roundedThumbnailView = this.thumbnailButton;
        if (roundedThumbnailView != null) {
            roundedThumbnailView.announceForAccessibility(str);
        }
    }

    public void cancelRecording() {
        this.photoButtonFadeAnimationDone = false;
        this.photoButtonFadeAnimator.cancel();
    }

    public void disablePhotoVideoSwitch() {
        this.photoVideoSwitchEnabled = false;
        hidePhotoVideoSwitch();
    }

    public void enablePhotoVideoSwitch() {
        this.photoVideoSwitchEnabled = true;
        showPhotoVideoSwitch();
    }

    public hif getBackgroundColorProperty() {
        return this.bottomBar.getBackgroundColorProperty();
    }

    public hif getCameraSwitchColorProperty() {
        return this.cameraSwitchButton.getCameraSwitchColorProperty();
    }

    private void hidePhotoVideoSwitch() {
        this.photoSwitchButton.setVisibility(4);
        this.videoSwitchButton.setVisibility(4);
    }

    final /* synthetic */ void lambda$wireListeners$0$BottomBarController(View view, int i) {
        this.listenerDispatcher.onCameraSwitch(i);
    }

    final /* synthetic */ void lambda$wireListeners$1$BottomBarController(View view) {
        this.listenerDispatcher.onThumbnailButtonClicked();
    }

    final /* synthetic */ void lambda$wireListeners$2$BottomBarController(View view) {
        this.listenerDispatcher.onSnapshotButtonClicked();
    }

    final /* synthetic */ void lambda$wireListeners$3$BottomBarController(View view, int i) {
        this.listenerDispatcher.onFpsSwitch(i);
    }

    final /* synthetic */ void lambda$wireListeners$4$BottomBarController(View view) {
        this.listenerDispatcher.onRetakeButtonPressed();
    }

    final /* synthetic */ void lambda$wireListeners$5$BottomBarController(View view) {
        this.listenerDispatcher.onCancelButtonPressed();
    }

    final /* synthetic */ void lambda$wireListeners$6$BottomBarController(View view) {
        this.listenerDispatcher.onReviewPlayButtonPressed();
    }

    final /* synthetic */ void lambda$wireListeners$7$BottomBarController(View view) {
        this.listenerDispatcher.onPhotoSwitchButtonClicked();
    }

    final /* synthetic */ void lambda$wireListeners$8$BottomBarController(View view) {
        this.listenerDispatcher.onVideoSwitchButtonClicked();
    }

    public void pauseRecording() {
        this.pauseResumeButton.transitionToResumeState();
    }

    public void removeListener(BottomBarListener bottomBarListener) {
        synchronized (this.lock) {
            this.listeners.remove(bottomBarListener);
        }
    }

    public void resetCameraSwitch(int i) {
        this.bottomBar.getCameraSwitchButton().setState(i, false);
    }

    public void resumeRecording() {
        this.pauseResumeButton.transitionToPauseState();
    }

    public void returnToPhotoIntent() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, null, true);
    }

    public void returnToVideoIntent() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, null, true);
    }

    public void setCameraSwitchEnabled(boolean z) {
        this.bottomBar.getCameraSwitchButton().setEnabled(z);
    }

    public void setClickable(boolean z) {
        this.bottomBar.setClickable(z);
        this.bottomBar.setPressed(false);
    }

    public void setImportantForAccessibility(int i) {
        this.bottomBar.setImportantForAccessibility(i);
    }

    public void setProgress(float f, boolean z) {
        if (z) {
            this.photoSwitchButton.setTranslation(this.photoVideoSwitchTranslation * f);
            this.videoSwitchButton.setTranslation(this.photoVideoSwitchTranslation * (-1.0f + f));
            if (f == 1.0f) {
                this.videoSwitchButton.setImportantForAccessibility(1);
                this.photoSwitchButton.setImportantForAccessibility(2);
                return;
            }
            return;
        }
        this.photoSwitchButton.setTranslation(this.photoVideoSwitchTranslation * (1.0f - f));
        this.videoSwitchButton.setTranslation(this.photoVideoSwitchTranslation * (-f));
        if (f == 1.0f) {
            this.photoSwitchButton.setImportantForAccessibility(1);
            this.videoSwitchButton.setImportantForAccessibility(2);
        }
    }

    public void setSelfieFlashState(boolean z) {
        this.isSelfieFlashOn = z;
    }

    public void setSideButtonsClickable(final boolean z) {
        this.bottomBar.post(new Runnable() {
            public void run() {
                BottomBarController.this.bottomBar.setSideButtonsClickable(z);
            }
        });
    }

    public void setSnapshotButtonClickEnabled(boolean z) {
        this.bottomBar.getSnapshotButton().setClickEnabled(z);
    }

    public void setSwitchButtonClickEnabled(boolean z) {
        this.videoSwitchButton.setEnabled(z);
        this.photoSwitchButton.setEnabled(z);
    }

    private void showPhotoVideoSwitch() {
        if (this.photoVideoSwitchEnabled) {
            this.videoSwitchButton.setVisibility(0);
            this.photoSwitchButton.setVisibility(0);
        }
    }

    public void startCountdown() {
        this.bottomBar.changeSideButtons(null, null, true);
        this.bottomBar.fadeBackground(false, true);
        hidePhotoVideoSwitch();
    }

    public void startHfrRecording() {
        this.bottomBar.fadeBackground(false, true);
        this.bottomBar.changeSideButtons(null, null, true);
    }

    public void startImaxCapture() {
        this.bottomBar.fadeBackground(false, true);
        this.bottomBar.changeSideButtons(null, null, false);
    }

    public void startLensBlurCapture() {
        this.bottomBar.changeSideButtons(null, null, true);
    }

    public void startPanoramaCalibration() {
        this.bottomBar.changeSideButtons(this.retakeButton, this.cancelButton, true);
    }

    public void startPhotoSphereCapture() {
        this.bottomBar.changeSideButtons(this.retakeButton, this.cancelButton, true);
    }

    public void startRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        this.bottomBar.changeSideButtons(this.pauseResumeButton, this.snapshotButton, true);
        this.photoButtonFadeAnimator.cancel();
        this.photoButtonFadeAnimator.start();
    }

    public void startVideoIntentRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        this.bottomBar.changeSideButtons(null, null, true);
    }

    public void stopCountdown() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, true);
        this.bottomBar.fadeBackground(true, true);
        showPhotoVideoSwitch();
    }

    public void stopHfrRecording() {
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeSideButtons(this.hfrButton, this.thumbnailButton, true);
    }

    public void stopImaxCapture() {
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, false);
    }

    public void stopLensBlurCapture() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, true);
    }

    public void stopPanoramaCapture() {
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, true);
    }

    public void stopPhotoSphereCapture() {
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, true);
    }

    public void stopRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(true, true);
        }
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, true);
        this.pauseResumeButton.resetButton();
        if (this.photoButtonFadeAnimationDone) {
            this.photoButtonFadeAnimator.cancel();
            this.photoButtonFadeAnimator.reverse();
        }
    }

    public void switchCamera() {
        this.cameraSwitchButton.callOnClick();
    }

    public void switchToImax() {
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, false);
        hidePhotoVideoSwitch();
    }

    public void switchToLensBlur() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, false);
        hidePhotoVideoSwitch();
    }

    public void switchToPanorama() {
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, false);
        hidePhotoVideoSwitch();
    }

    public void switchToPhoto() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, false);
    }

    public void switchToPhotoIntent() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, null, false);
    }

    public void switchToPhotoIntentReview() {
        this.bottomBar.changeSideButtons(this.retakeButton, null, true);
    }

    public void switchToPhotoSphere() {
        this.bottomBar.changeSideButtons(null, this.thumbnailButton, false);
        hidePhotoVideoSwitch();
    }

    public void switchToPortrait(boolean z) {
        View view;
        if (z) {
            view = this.cameraSwitchButton;
        } else {
            view = null;
        }
        this.bottomBar.changeSideButtons(view, this.thumbnailButton, false);
        hidePhotoVideoSwitch();
    }

    public void switchToVideo() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, this.thumbnailButton, false);
    }

    public void switchToVideoHfr() {
        this.bottomBar.changeSideButtons(this.hfrButton, this.thumbnailButton, false);
        hidePhotoVideoSwitch();
    }

    public void switchToVideoIntent() {
        this.bottomBar.changeSideButtons(this.cameraSwitchButton, null, false);
    }

    public void switchToVideoIntentReview() {
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeSideButtons(this.retakeButton, this.reviewPlayButton, true);
    }

    public void wireListeners() {
        ikd.m12259a();
        this.bottomBar.getCameraSwitchButton().setOnStateChangeListener(new BottomBarController$$Lambda$0(this));
        this.bottomBar.getThumbnailButton().setOnClickListener(new BottomBarController$$Lambda$1(this));
        this.bottomBar.getPauseResumeButton().setListener(this.listenerDispatcher);
        this.bottomBar.getSnapshotButton().setOnClickListener(new BottomBarController$$Lambda$2(this));
        this.bottomBar.getSnapshotButton().wirePressedStateAnimationListener();
        this.bottomBar.getHfrButton().setOnStateChangeListener(new BottomBarController$$Lambda$3(this));
        this.bottomBar.getRetakeButton().setOnClickListener(new BottomBarController$$Lambda$4(this));
        this.bottomBar.getCancelButton().setOnClickListener(new BottomBarController$$Lambda$5(this));
        this.bottomBar.getReviewPlayButton().setOnClickListener(new BottomBarController$$Lambda$6(this));
        this.bottomBar.getPhotoSwitchButton().setOnClickListener(new BottomBarController$$Lambda$7(this));
        this.bottomBar.getVideoSwitchButton().setOnClickListener(new BottomBarController$$Lambda$8(this));
        setClickable(true);
    }
}
