package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.ao;
import p000.ha;
import p000.ij;
import p000.im;
import p000.jm;

/* compiled from: PG */
final class FragmentManagerImpl extends FragmentManager implements Factory2 {
    public static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5f);
    public static final Interpolator ACCELERATE_QUINT = new AccelerateInterpolator(2.5f);
    public static final int ANIM_DUR = 220;
    public static final int ANIM_STYLE_CLOSE_ENTER = 3;
    public static final int ANIM_STYLE_CLOSE_EXIT = 4;
    public static final int ANIM_STYLE_FADE_ENTER = 5;
    public static final int ANIM_STYLE_FADE_EXIT = 6;
    public static final int ANIM_STYLE_OPEN_ENTER = 1;
    public static final int ANIM_STYLE_OPEN_EXIT = 2;
    public static boolean DEBUG = false;
    public static final Interpolator DECELERATE_CUBIC = new DecelerateInterpolator(1.5f);
    public static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5f);
    public static final String TAG = "FragmentManager";
    public static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    public static final String TARGET_STATE_TAG = "android:target_state";
    public static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    public static final String VIEW_STATE_TAG = "android:view_state";
    public static Field sAnimationListenerField = null;
    public SparseArray mActive;
    public final ArrayList mAdded = new ArrayList();
    public ArrayList mAvailBackStackIndices;
    public ArrayList mBackStack;
    public ArrayList mBackStackChangeListeners;
    public ArrayList mBackStackIndices;
    public FragmentContainer mContainer;
    public ArrayList mCreatedMenus;
    public int mCurState = 0;
    public boolean mDestroyed;
    public Runnable mExecCommit = new C00051();
    public boolean mExecutingActions;
    public boolean mHavePendingDeferredStart;
    public FragmentHostCallback mHost;
    public final CopyOnWriteArrayList mLifecycleCallbacks = new CopyOnWriteArrayList();
    public boolean mNeedMenuInvalidate;
    public int mNextFragmentIndex = 0;
    public String mNoTransactionsBecause;
    public Fragment mParent;
    public ArrayList mPendingActions;
    public ArrayList mPostponedTransactions;
    public Fragment mPrimaryNav;
    public FragmentManagerNonConfig mSavedNonConfig;
    public SparseArray mStateArray = null;
    public Bundle mStateBundle = null;
    public boolean mStateSaved;
    public boolean mStopped;
    public ArrayList mTmpAddedFragments;
    public ArrayList mTmpIsPop;
    public ArrayList mTmpRecords;

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.FragmentManagerImpl$1 */
    class C00051 implements Runnable {
        C00051() {
        }

        public void run() {
            FragmentManagerImpl.this.execPendingActions();
        }
    }

    /* compiled from: PG */
    class AnimationListenerWrapper implements AnimationListener {
        public final AnimationListener mWrapped;

        private AnimationListenerWrapper(AnimationListener animationListener) {
            this.mWrapped = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            AnimationListener animationListener = this.mWrapped;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            AnimationListener animationListener = this.mWrapped;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            AnimationListener animationListener = this.mWrapped;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* compiled from: PG */
    class AnimationOrAnimator {
        public final Animation animation;
        public final Animator animator;

        private AnimationOrAnimator(Animator animator) {
            this.animation = null;
            this.animator = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        private AnimationOrAnimator(Animation animation) {
            this.animation = animation;
            this.animator = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* compiled from: PG */
    class AnimatorOnHWLayerIfNeededListener extends AnimatorListenerAdapter {
        public View mView;

        AnimatorOnHWLayerIfNeededListener(View view) {
            this.mView = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.mView.setLayerType(0, null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.mView.setLayerType(2, null);
        }
    }

    /* compiled from: PG */
    class EndViewTransitionAnimator extends AnimationSet implements Runnable {
        public final View mChild;
        public boolean mEnded;
        public final ViewGroup mParent;
        public boolean mTransitionEnded;

        EndViewTransitionAnimator(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            if (this.mEnded) {
                return this.mTransitionEnded ^ 1;
            }
            if (super.getTransformation(j, transformation)) {
                return true;
            }
            this.mEnded = true;
            OneShotPreDrawListener.add(this.mParent, this);
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.mEnded) {
                return this.mTransitionEnded ^ 1;
            }
            if (super.getTransformation(j, transformation, f)) {
                return true;
            }
            this.mEnded = true;
            OneShotPreDrawListener.add(this.mParent, this);
            return true;
        }

        public void run() {
            this.mParent.endViewTransition(this.mChild);
            this.mTransitionEnded = true;
        }
    }

    /* compiled from: PG */
    final class FragmentLifecycleCallbacksHolder {
        public final FragmentLifecycleCallbacks mCallback;
        public final boolean mRecursive;

        FragmentLifecycleCallbacksHolder(FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            this.mCallback = fragmentLifecycleCallbacks;
            this.mRecursive = z;
        }
    }

    /* compiled from: PG */
    class FragmentTag {
        public static final int[] Fragment = new int[]{16842755, 16842960, 16842961};
        public static final int Fragment_id = 1;
        public static final int Fragment_name = 0;
        public static final int Fragment_tag = 2;

        private FragmentTag() {
        }
    }

    /* compiled from: PG */
    interface OpGenerator {
        boolean generateOps(ArrayList arrayList, ArrayList arrayList2);
    }

    /* compiled from: PG */
    class AnimateOnHWLayerIfNeededListener extends AnimationListenerWrapper {
        public View mView;

        /* compiled from: PG */
        /* renamed from: android.support.v4.app.FragmentManagerImpl$AnimateOnHWLayerIfNeededListener$1 */
        class C00091 implements Runnable {
            C00091() {
            }

            public void run() {
                AnimateOnHWLayerIfNeededListener.this.mView.setLayerType(0, null);
            }
        }

        AnimateOnHWLayerIfNeededListener(View view, AnimationListener animationListener) {
            super(animationListener);
            this.mView = view;
        }

        public void onAnimationEnd(Animation animation) {
            jm.m4589w(this.mView);
            this.mView.post(new C00091());
            super.onAnimationEnd(animation);
        }
    }

    /* compiled from: PG */
    class PopBackStackState implements OpGenerator {
        public final int mFlags;
        public final int mId;
        public final String mName;

        PopBackStackState(String str, int i, int i2) {
            this.mName = str;
            this.mId = i;
            this.mFlags = i2;
        }

        public boolean generateOps(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManagerImpl.this.mPrimaryNav;
            if (fragment != null && this.mId < 0 && this.mName == null) {
                FragmentManager peekChildFragmentManager = fragment.peekChildFragmentManager();
                if (peekChildFragmentManager != null && peekChildFragmentManager.popBackStackImmediate()) {
                    return false;
                }
            }
            return FragmentManagerImpl.this.popBackStackState(arrayList, arrayList2, this.mName, this.mId, this.mFlags);
        }
    }

    /* compiled from: PG */
    class StartEnterTransitionListener implements OnStartEnterTransitionListener {
        public final boolean mIsBack;
        public int mNumPostponed;
        public final BackStackRecord mRecord;

        StartEnterTransitionListener(BackStackRecord backStackRecord, boolean z) {
            this.mIsBack = z;
            this.mRecord = backStackRecord;
        }

        public void cancelTransaction() {
            BackStackRecord backStackRecord = this.mRecord;
            backStackRecord.mManager.completeExecute(backStackRecord, this.mIsBack, false, false);
        }

        public void completeTransaction() {
            boolean z;
            boolean z2 = false;
            int i = this.mNumPostponed;
            if (i <= 0) {
                z = false;
            } else {
                z = true;
            }
            FragmentManagerImpl fragmentManagerImpl = this.mRecord.mManager;
            int size = fragmentManagerImpl.mAdded.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) fragmentManagerImpl.mAdded.get(i2);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            BackStackRecord backStackRecord = this.mRecord;
            FragmentManagerImpl fragmentManagerImpl2 = backStackRecord.mManager;
            boolean z3 = this.mIsBack;
            if (i <= 0) {
                z2 = true;
            }
            fragmentManagerImpl2.completeExecute(backStackRecord, z3, z2, true);
        }

        public boolean isReady() {
            return this.mNumPostponed == 0;
        }

        public void onStartEnterTransition() {
            this.mNumPostponed--;
            if (this.mNumPostponed == 0) {
                this.mRecord.mManager.scheduleCommit();
            }
        }

        public void startListening() {
            this.mNumPostponed++;
        }
    }

    FragmentManagerImpl() {
    }

    private final void addAddedFragments(ij ijVar) {
        int i = this.mCurState;
        if (i > 0) {
            int min = Math.min(i, 4);
            int size = this.mAdded.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) this.mAdded.get(i2);
                if (fragment.mState < min) {
                    moveToState(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (!(fragment.mView == null || fragment.mHidden || !fragment.mIsNewlyAdded)) {
                        ijVar.add(fragment);
                    }
                }
            }
        }
    }

    final void addBackStackState(BackStackRecord backStackRecord) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList();
        }
        this.mBackStack.add(backStackRecord);
    }

    public final void addFragment(Fragment fragment, boolean z) {
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("add: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        makeActive(fragment);
        if (!fragment.mDetached) {
            if (this.mAdded.contains(fragment)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Fragment already added: ");
                stringBuilder2.append(fragment);
                throw new IllegalStateException(stringBuilder2.toString());
            }
            synchronized (this.mAdded) {
                this.mAdded.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.mNeedMenuInvalidate = true;
            }
            if (z) {
                moveToState(fragment);
            }
        }
    }

    public final void addOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList();
        }
        this.mBackStackChangeListeners.add(onBackStackChangedListener);
    }

    public final int allocBackStackIndex(BackStackRecord backStackRecord) {
        int size;
        synchronized (this) {
            ArrayList arrayList = this.mAvailBackStackIndices;
            StringBuilder stringBuilder;
            if (arrayList == null || arrayList.size() <= 0) {
                if (this.mBackStackIndices == null) {
                    this.mBackStackIndices = new ArrayList();
                }
                size = this.mBackStackIndices.size();
                if (DEBUG) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Setting back stack index ");
                    stringBuilder.append(size);
                    stringBuilder.append(" to ");
                    stringBuilder.append(backStackRecord);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.mBackStackIndices.add(backStackRecord);
            } else {
                arrayList = this.mAvailBackStackIndices;
                size = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
                if (DEBUG) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Adding back stack index ");
                    stringBuilder.append(size);
                    stringBuilder.append(" with ");
                    stringBuilder.append(backStackRecord);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.mBackStackIndices.set(size, backStackRecord);
            }
        }
        return size;
    }

    private final void animateRemoveFragment(final Fragment fragment, AnimationOrAnimator animationOrAnimator, int i) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        Animation animation = animationOrAnimator.animation;
        if (animation != null) {
            Animation endViewTransitionAnimator = new EndViewTransitionAnimator(animation, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            endViewTransitionAnimator.setAnimationListener(new AnimationListenerWrapper(getAnimationListener(endViewTransitionAnimator)) {

                /* compiled from: PG */
                /* renamed from: android.support.v4.app.FragmentManagerImpl$2$1 */
                class C00061 implements Runnable {
                    C00061() {
                    }

                    public void run() {
                        if (fragment.getAnimatingAway() != null) {
                            fragment.setAnimatingAway(null);
                            C01372 c01372 = C01372.this;
                            FragmentManagerImpl fragmentManagerImpl = FragmentManagerImpl.this;
                            Fragment fragment = fragment;
                            fragmentManagerImpl.moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                        }
                    }
                }

                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new C00061());
                }
            });
            setHWLayerAnimListenerIfAlpha(view, animationOrAnimator);
            fragment.mView.startAnimation(endViewTransitionAnimator);
            return;
        }
        Animator animator = animationOrAnimator.animator;
        fragment.setAnimator(animator);
        animator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator animator2 = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
                    FragmentManagerImpl fragmentManagerImpl = FragmentManagerImpl.this;
                    Fragment fragment = fragment;
                    fragmentManagerImpl.moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fragment.mView);
        setHWLayerAnimListenerIfAlpha(fragment.mView, animationOrAnimator);
        animator.start();
    }

    public final void attachController(FragmentHostCallback fragmentHostCallback, FragmentContainer fragmentContainer, Fragment fragment) {
        if (this.mHost != null) {
            throw new IllegalStateException("Already attached");
        }
        this.mHost = fragmentHostCallback;
        this.mContainer = fragmentContainer;
        this.mParent = fragment;
    }

    public final void attachFragment(Fragment fragment) {
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("attach: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                if (this.mAdded.contains(fragment)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Fragment already added: ");
                    stringBuilder2.append(fragment);
                    throw new IllegalStateException(stringBuilder2.toString());
                }
                if (DEBUG) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("add from attach: ");
                    stringBuilder.append(fragment);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                synchronized (this.mAdded) {
                    this.mAdded.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.mNeedMenuInvalidate = true;
                }
            }
        }
    }

    public final FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }

    private final void burpActive() {
        SparseArray sparseArray = this.mActive;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.mActive.valueAt(size) == null) {
                    SparseArray sparseArray2 = this.mActive;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private final void checkStateLoss() {
        if (isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.mNoTransactionsBecause != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not perform this action inside of ");
            stringBuilder.append(this.mNoTransactionsBecause);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private final void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    private final void completeExecute(BackStackRecord backStackRecord, boolean z, boolean z2, boolean z3) {
        if (z) {
            backStackRecord.executePopOps(z3);
        } else {
            backStackRecord.executeOps();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(backStackRecord);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            FragmentTransition.startTransitions(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            moveToState(this.mCurState, true);
        }
        SparseArray sparseArray = this.mActive;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.mActive.valueAt(i);
                if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && backStackRecord.interactsWith(fragment.mContainerId)) {
                    float f = fragment.mPostponedAlpha;
                    if (f > 0.0f) {
                        fragment.mView.setAlpha(f);
                    }
                    if (z3) {
                        fragment.mPostponedAlpha = 0.0f;
                    } else {
                        fragment.mPostponedAlpha = -1.0f;
                        fragment.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    final void completeShowHideFragment(final Fragment fragment) {
        if (fragment.mView != null) {
            int i;
            AnimationOrAnimator loadAnimation = loadAnimation(fragment, fragment.getNextTransition(), fragment.mHidden ^ 1, fragment.getNextTransitionStyle());
            if (loadAnimation != null) {
                Animator animator = loadAnimation.animator;
                if (animator != null) {
                    animator.setTarget(fragment.mView);
                    if (!fragment.mHidden) {
                        fragment.mView.setVisibility(0);
                    } else if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        final ViewGroup viewGroup = fragment.mContainer;
                        final View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        loadAnimation.animator.addListener(new AnimatorListenerAdapter() {
                            public void onAnimationEnd(Animator animator) {
                                viewGroup.endViewTransition(view);
                                animator.removeListener(this);
                                View view = fragment.mView;
                                if (view != null) {
                                    view.setVisibility(8);
                                }
                            }
                        });
                    }
                    setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                    loadAnimation.animator.start();
                }
            }
            if (loadAnimation != null) {
                setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                fragment.mView.startAnimation(loadAnimation.animation);
                loadAnimation.animation.start();
            }
            if (!fragment.mHidden) {
                i = 0;
            } else if (fragment.isHideReplaced()) {
                i = 0;
            } else {
                i = 8;
            }
            fragment.mView.setVisibility(i);
            if (fragment.isHideReplaced()) {
                fragment.setHideReplaced(false);
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.mNeedMenuInvalidate = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public final void detachFragment(Fragment fragment) {
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("detach: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (DEBUG) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("remove from detach: ");
                    stringBuilder.append(fragment);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                synchronized (this.mAdded) {
                    this.mAdded.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.mNeedMenuInvalidate = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    public final void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(2);
    }

    public final void dispatchConfigurationChanged(Configuration configuration) {
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final boolean dispatchContextItemSelected(MenuItem menuItem) {
        if (this.mCurState <= 0) {
            return false;
        }
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(1);
    }

    public final boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.mCurState <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.mAdded.size(); i2++) {
            Fragment fragment = (Fragment) this.mAdded.get(i2);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            while (i < this.mCreatedMenus.size()) {
                fragment = (Fragment) this.mCreatedMenus.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
                i++;
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    public final void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions();
        dispatchStateChange(0);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
    }

    public final void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    public final void dispatchLowMemory() {
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final void dispatchMultiWindowModeChanged(boolean z) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.mAdded.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    final void dispatchOnFragmentActivityCreated(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentActivityCreated(fragment, bundle, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentActivityCreated(this, fragment, bundle);
            }
        }
    }

    final void dispatchOnFragmentAttached(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentAttached(fragment, context, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentAttached(this, fragment, context);
            }
        }
    }

    final void dispatchOnFragmentCreated(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentCreated(fragment, bundle, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentCreated(this, fragment, bundle);
            }
        }
    }

    final void dispatchOnFragmentDestroyed(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentDestroyed(fragment, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentDestroyed(this, fragment);
            }
        }
    }

    final void dispatchOnFragmentDetached(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentDetached(fragment, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentDetached(this, fragment);
            }
        }
    }

    final void dispatchOnFragmentPaused(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPaused(fragment, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentPaused(this, fragment);
            }
        }
    }

    final void dispatchOnFragmentPreAttached(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPreAttached(fragment, context, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentPreAttached(this, fragment, context);
            }
        }
    }

    final void dispatchOnFragmentPreCreated(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPreCreated(fragment, bundle, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentPreCreated(this, fragment, bundle);
            }
        }
    }

    final void dispatchOnFragmentResumed(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentResumed(fragment, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentResumed(this, fragment);
            }
        }
    }

    final void dispatchOnFragmentSaveInstanceState(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentSaveInstanceState(fragment, bundle, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentSaveInstanceState(this, fragment, bundle);
            }
        }
    }

    final void dispatchOnFragmentStarted(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentStarted(fragment, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentStarted(this, fragment);
            }
        }
    }

    final void dispatchOnFragmentStopped(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentStopped(fragment, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentStopped(this, fragment);
            }
        }
    }

    final void dispatchOnFragmentViewCreated(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentViewCreated(fragment, view, bundle, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentViewCreated(this, fragment, view, bundle);
            }
        }
    }

    final void dispatchOnFragmentViewDestroyed(Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentViewDestroyed(fragment, true);
            }
        }
        Iterator it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z || fragmentLifecycleCallbacksHolder.mRecursive) {
                fragmentLifecycleCallbacksHolder.mCallback.onFragmentViewDestroyed(this, fragment);
            }
        }
    }

    public final boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        if (this.mCurState <= 0) {
            return false;
        }
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void dispatchOptionsMenuClosed(Menu menu) {
        if (this.mCurState > 0) {
            for (int i = 0; i < this.mAdded.size(); i++) {
                Fragment fragment = (Fragment) this.mAdded.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void dispatchPause() {
        dispatchStateChange(4);
    }

    public final void dispatchPictureInPictureModeChanged(boolean z) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.mAdded.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public final boolean dispatchPrepareOptionsMenu(Menu menu) {
        if (this.mCurState <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.mAdded.size(); i++) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void dispatchReallyStop() {
        dispatchStateChange(2);
    }

    public final void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(5);
    }

    public final void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(4);
    }

    private final void dispatchStateChange(int i) {
        try {
            this.mExecutingActions = true;
            moveToState(i, false);
            execPendingActions();
        } finally {
            this.mExecutingActions = false;
        }
    }

    public final void dispatchStop() {
        this.mStopped = true;
        dispatchStateChange(3);
    }

    final void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        Fragment fragment;
        int i2 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(GraphFactorySource.INDENT);
        String stringBuilder2 = stringBuilder.toString();
        SparseArray sparseArray = this.mActive;
        if (sparseArray != null) {
            size = sparseArray.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.mActive.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.dump(stringBuilder2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        size = this.mAdded.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (i = 0; i < size; i++) {
                fragment = (Fragment) this.mAdded.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList = this.mCreatedMenus;
        if (arrayList != null) {
            size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.mCreatedMenus.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        arrayList = this.mBackStack;
        if (arrayList != null) {
            size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    BackStackRecord backStackRecord = (BackStackRecord) this.mBackStack.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(backStackRecord.toString());
                    backStackRecord.dump(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            arrayList = this.mBackStackIndices;
            if (arrayList != null) {
                int size2 = arrayList.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        backStackRecord = (BackStackRecord) this.mBackStackIndices.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(backStackRecord);
                    }
                }
            }
            arrayList = this.mAvailBackStackIndices;
            if (arrayList != null && arrayList.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
            }
        }
        arrayList = this.mPendingActions;
        if (arrayList != null) {
            i = arrayList.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    OpGenerator opGenerator = (OpGenerator) this.mPendingActions.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(opGenerator);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
        if (this.mNoTransactionsBecause != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.mNoTransactionsBecause);
        }
    }

    private final void endAnimatingAwayFragments() {
        int size;
        SparseArray sparseArray = this.mActive;
        if (sparseArray != null) {
            size = sparseArray.size();
        } else {
            size = 0;
        }
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.mActive.valueAt(i);
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    moveToState(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    public final void enqueueAction(OpGenerator opGenerator, boolean z) {
        if (!z) {
            checkStateLoss();
        }
        synchronized (this) {
            if (!this.mDestroyed && this.mHost != null) {
                if (this.mPendingActions == null) {
                    this.mPendingActions = new ArrayList();
                }
                this.mPendingActions.add(opGenerator);
                scheduleCommit();
            } else if (z) {
            } else {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    private final void ensureExecReady(boolean z) {
        if (this.mExecutingActions) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.mHost == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() != this.mHost.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                checkStateLoss();
            }
            if (this.mTmpRecords == null) {
                this.mTmpRecords = new ArrayList();
                this.mTmpIsPop = new ArrayList();
            }
            this.mExecutingActions = true;
            try {
                executePostponedTransaction(null, null);
            } finally {
                this.mExecutingActions = false;
            }
        }
    }

    final void ensureInflatedFragmentView(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                fragment.mInnerView = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    public final boolean execPendingActions() {
        ensureExecReady(true);
        boolean z = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
                z = true;
            } catch (Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        doPendingDeferredStart();
        burpActive();
        return z;
    }

    public final void execSingleAction(OpGenerator opGenerator, boolean z) {
        if (!z || (this.mHost != null && !this.mDestroyed)) {
            ensureExecReady(z);
            if (opGenerator.generateOps(this.mTmpRecords, this.mTmpIsPop)) {
                this.mExecutingActions = true;
                try {
                    removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                } finally {
                    cleanupExec();
                }
            }
            doPendingDeferredStart();
            burpActive();
        }
    }

    private static void executeOps(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        while (i < i2) {
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                boolean z;
                backStackRecord.bumpBackStackNesting(-1);
                if (i == i2 - 1) {
                    z = true;
                } else {
                    z = false;
                }
                backStackRecord.executePopOps(z);
            } else {
                backStackRecord.bumpBackStackNesting(1);
                backStackRecord.executeOps();
            }
            i++;
        }
    }

    private final void executeOpsTogether(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int postponePostponableTransactions;
        boolean z = ((BackStackRecord) arrayList.get(i)).mReorderingAllowed;
        ArrayList arrayList3 = this.mTmpAddedFragments;
        if (arrayList3 == null) {
            this.mTmpAddedFragments = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.mTmpAddedFragments.addAll(this.mAdded);
        int i3 = i;
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z2 = false;
        while (i3 < i2) {
            Fragment trackAddedFragmentsInPop;
            boolean z3;
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i3);
            if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                trackAddedFragmentsInPop = backStackRecord.trackAddedFragmentsInPop(this.mTmpAddedFragments, primaryNavigationFragment);
            } else {
                trackAddedFragmentsInPop = backStackRecord.expandOps(this.mTmpAddedFragments, primaryNavigationFragment);
            }
            if (z2) {
                z3 = true;
            } else if (backStackRecord.mAddToBackStack) {
                z3 = true;
            } else {
                z3 = false;
            }
            i3++;
            primaryNavigationFragment = trackAddedFragmentsInPop;
            z2 = z3;
        }
        this.mTmpAddedFragments.clear();
        if (!z) {
            FragmentTransition.startTransitions(this, arrayList, arrayList2, i, i2, false);
        }
        executeOps(arrayList, arrayList2, i, i2);
        if (z) {
            ij ijVar = new ij();
            addAddedFragments(ijVar);
            postponePostponableTransactions = postponePostponableTransactions(arrayList, arrayList2, i, i2, ijVar);
            makeRemovedFragmentsInvisible(ijVar);
        } else {
            postponePostponableTransactions = i2;
        }
        if (postponePostponableTransactions != i && z) {
            FragmentTransition.startTransitions(this, arrayList, arrayList2, i, postponePostponableTransactions, true);
            moveToState(this.mCurState, true);
        }
        while (i < i2) {
            BackStackRecord backStackRecord2 = (BackStackRecord) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                int i4 = backStackRecord2.mIndex;
                if (i4 >= 0) {
                    freeBackStackIndex(i4);
                    backStackRecord2.mIndex = -1;
                }
            }
            backStackRecord2.runOnCommitRunnables();
            i++;
        }
        if (z2) {
            reportBackStackChanged();
        }
    }

    public final boolean executePendingTransactions() {
        boolean execPendingActions = execPendingActions();
        forcePostponedTransactions();
        return execPendingActions;
    }

    private final void executePostponedTransaction(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        ArrayList arrayList3 = this.mPostponedTransactions;
        if (arrayList3 != null) {
            size = arrayList3.size();
        } else {
            size = 0;
        }
        int i = 0;
        int i2 = size;
        while (i < i2) {
            int indexOf;
            StartEnterTransitionListener startEnterTransitionListener = (StartEnterTransitionListener) this.mPostponedTransactions.get(i);
            if (!(arrayList == null || startEnterTransitionListener.mIsBack)) {
                indexOf = arrayList.indexOf(startEnterTransitionListener.mRecord);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    startEnterTransitionListener.cancelTransaction();
                    size = i;
                    indexOf = i2;
                    i = size + 1;
                    i2 = indexOf;
                }
            }
            if (!startEnterTransitionListener.isReady()) {
                if (arrayList == null) {
                    size = i;
                    indexOf = i2;
                } else if (!startEnterTransitionListener.mRecord.interactsWith(arrayList, 0, arrayList.size())) {
                    size = i;
                    indexOf = i2;
                }
                i = size + 1;
                i2 = indexOf;
            }
            this.mPostponedTransactions.remove(i);
            i--;
            i2--;
            if (!(arrayList == null || startEnterTransitionListener.mIsBack)) {
                indexOf = arrayList.indexOf(startEnterTransitionListener.mRecord);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    startEnterTransitionListener.cancelTransaction();
                    size = i;
                    indexOf = i2;
                    i = size + 1;
                    i2 = indexOf;
                }
            }
            startEnterTransitionListener.completeTransaction();
            size = i;
            indexOf = i2;
            i = size + 1;
            i2 = indexOf;
        }
    }

    public final Fragment findFragmentById(int i) {
        int size;
        for (size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.mAdded.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        SparseArray sparseArray = this.mActive;
        if (sparseArray != null) {
            for (size = sparseArray.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.mActive.valueAt(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public final Fragment findFragmentByTag(String str) {
        int size;
        Fragment fragment;
        if (str != null) {
            for (size = this.mAdded.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.mAdded.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        SparseArray sparseArray = this.mActive;
        if (!(sparseArray == null || str == null)) {
            for (size = sparseArray.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.mActive.valueAt(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public final Fragment findFragmentByWho(String str) {
        SparseArray sparseArray = this.mActive;
        if (!(sparseArray == null || str == null)) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.mActive.valueAt(size);
                if (fragment != null) {
                    fragment = fragment.findFragmentByWho(str);
                    if (fragment != null) {
                        return fragment;
                    }
                }
            }
        }
        return null;
    }

    private final Fragment findFragmentUnder(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.mAdded.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            Fragment fragment2 = (Fragment) this.mAdded.get(indexOf);
            if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                return fragment2;
            }
        }
        return null;
    }

    private final void forcePostponedTransactions() {
        if (this.mPostponedTransactions != null) {
            while (!this.mPostponedTransactions.isEmpty()) {
                ((StartEnterTransitionListener) this.mPostponedTransactions.remove(0)).completeTransaction();
            }
        }
    }

    public final void freeBackStackIndex(int i) {
        synchronized (this) {
            this.mBackStackIndices.set(i, null);
            if (this.mAvailBackStackIndices == null) {
                this.mAvailBackStackIndices = new ArrayList();
            }
            if (DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing back stack index ");
                stringBuilder.append(i);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.mAvailBackStackIndices.add(Integer.valueOf(i));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean generateOpsForPendingActions(java.util.ArrayList r5, java.util.ArrayList r6) {
        /*
        r4 = this;
        r0 = 0;
        monitor-enter(r4);
        r1 = r4.mPendingActions;	 Catch:{ all -> 0x003c }
        if (r1 == 0) goto L_0x000c;
    L_0x0006:
        r1 = r1.size();	 Catch:{ all -> 0x003c }
        if (r1 != 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
    L_0x000d:
        return r0;
    L_0x000e:
        r1 = r4.mPendingActions;	 Catch:{ all -> 0x003c }
        r3 = r1.size();	 Catch:{ all -> 0x003c }
        r2 = r0;
        r1 = r0;
    L_0x0016:
        if (r2 >= r3) goto L_0x0029;
    L_0x0018:
        r0 = r4.mPendingActions;	 Catch:{ all -> 0x003c }
        r0 = r0.get(r2);	 Catch:{ all -> 0x003c }
        r0 = (android.support.v4.app.FragmentManagerImpl.OpGenerator) r0;	 Catch:{ all -> 0x003c }
        r0 = r0.generateOps(r5, r6);	 Catch:{ all -> 0x003c }
        r1 = r1 | r0;
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0016;
    L_0x0029:
        r0 = r4.mPendingActions;	 Catch:{ all -> 0x003c }
        r0.clear();	 Catch:{ all -> 0x003c }
        r0 = r4.mHost;	 Catch:{ all -> 0x003c }
        r0 = r0.getHandler();	 Catch:{ all -> 0x003c }
        r2 = r4.mExecCommit;	 Catch:{ all -> 0x003c }
        r0.removeCallbacks(r2);	 Catch:{ all -> 0x003c }
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        r0 = r1;
        goto L_0x000d;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.generateOpsForPendingActions(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    final int getActiveFragmentCount() {
        SparseArray sparseArray = this.mActive;
        if (sparseArray == null) {
            return 0;
        }
        return sparseArray.size();
    }

    final List getActiveFragments() {
        SparseArray sparseArray = this.mActive;
        if (sparseArray == null) {
            return null;
        }
        int size = sparseArray.size();
        List arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(this.mActive.valueAt(i));
        }
        return arrayList;
    }

    private static AnimationListener getAnimationListener(Animation animation) {
        try {
            if (sAnimationListenerField == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                sAnimationListenerField = declaredField;
                declaredField.setAccessible(true);
            }
            return (AnimationListener) sAnimationListenerField.get(animation);
        } catch (Throwable e) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
            return null;
        } catch (Throwable e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        }
    }

    public final BackStackEntry getBackStackEntryAt(int i) {
        return (BackStackEntry) this.mBackStack.get(i);
    }

    public final int getBackStackEntryCount() {
        ArrayList arrayList = this.mBackStack;
        return arrayList != null ? arrayList.size() : 0;
    }

    public final Fragment getFragment(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = (Fragment) this.mActive.get(i);
        if (fragment != null) {
            return fragment;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment no longer exists for key ");
        stringBuilder.append(str);
        stringBuilder.append(": index ");
        stringBuilder.append(i);
        throwException(new IllegalStateException(stringBuilder.toString()));
        return fragment;
    }

    public final List getFragments() {
        if (this.mAdded.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list;
        synchronized (this.mAdded) {
            list = (List) this.mAdded.clone();
        }
        return list;
    }

    final Factory2 getLayoutInflaterFactory() {
        return this;
    }

    public final Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    public final void hideFragment(Fragment fragment) {
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hide: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged ^= 1;
        }
    }

    public final boolean isDestroyed() {
        return this.mDestroyed;
    }

    final boolean isStateAtLeast(int i) {
        return this.mCurState >= i;
    }

    public final boolean isStateSaved() {
        return this.mStateSaved || this.mStopped;
    }

    final AnimationOrAnimator loadAnimation(Fragment fragment, int i, boolean z, int i2) {
        int nextAnim = fragment.getNextAnim();
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, nextAnim);
        if (onCreateAnimation != null) {
            return new AnimationOrAnimator(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i, z, nextAnim);
        if (onCreateAnimator != null) {
            return new AnimationOrAnimator(onCreateAnimator);
        }
        if (nextAnim != 0) {
            Object obj;
            boolean equals = "anim".equals(this.mHost.getContext().getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.mHost.getContext(), nextAnim);
                    if (loadAnimation != null) {
                        return new AnimationOrAnimator(loadAnimation);
                    }
                    obj = 1;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    obj = null;
                }
            } else {
                obj = null;
            }
            if (obj == null) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.mHost.getContext(), nextAnim);
                    if (loadAnimator != null) {
                        return new AnimationOrAnimator(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (equals) {
                        throw e3;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.mHost.getContext(), nextAnim);
                    if (loadAnimation2 != null) {
                        return new AnimationOrAnimator(loadAnimation2);
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int transitToStyleIndex = transitToStyleIndex(i, z);
        if (transitToStyleIndex < 0) {
            return null;
        }
        switch (transitToStyleIndex) {
            case 1:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return makeOpenCloseAnimation(this.mHost.getContext(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return makeOpenCloseAnimation(this.mHost.getContext(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return makeFadeAnimation(this.mHost.getContext(), 0.0f, 1.0f);
            case 6:
                return makeFadeAnimation(this.mHost.getContext(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.mHost.onHasWindowAnimations()) {
                    i2 = this.mHost.onGetWindowAnimations();
                }
                if (i2 == 0) {
                    return null;
                }
                return null;
        }
    }

    final void makeActive(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i = this.mNextFragmentIndex;
            this.mNextFragmentIndex = i + 1;
            fragment.setIndex(i, this.mParent);
            if (this.mActive == null) {
                this.mActive = new SparseArray();
            }
            this.mActive.put(fragment.mIndex, fragment);
            if (DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Allocated fragment index ");
                stringBuilder.append(fragment);
                Log.v("FragmentManager", stringBuilder.toString());
            }
        }
    }

    static AnimationOrAnimator makeFadeAnimation(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220);
        return new AnimationOrAnimator(alphaAnimation);
    }

    final void makeInactive(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            if (DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing fragment index ");
                stringBuilder.append(fragment);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.mActive.put(fragment.mIndex, null);
            fragment.initState();
        }
    }

    static AnimationOrAnimator makeOpenCloseAnimation(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(DECELERATE_QUINT);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(DECELERATE_CUBIC);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return new AnimationOrAnimator(animationSet);
    }

    private final void makeRemovedFragmentsInvisible(ij ijVar) {
        int size = ijVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) ijVar.f7018a[i];
            if (!fragment.mAdded) {
                View view = fragment.getView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    static boolean modifiesAlpha(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
            return false;
        } else if (!(animator instanceof AnimatorSet)) {
            return false;
        } else {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (modifiesAlpha((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    static boolean modifiesAlpha(AnimationOrAnimator animationOrAnimator) {
        Animation animation = animationOrAnimator.animation;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return modifiesAlpha(animationOrAnimator.animator);
        }
        List animations = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    final void moveFragmentToExpectedState(Fragment fragment) {
        if (fragment != null) {
            int i = this.mCurState;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            moveToState(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment findFragmentUnder = findFragmentUnder(fragment);
                if (findFragmentUnder != null) {
                    View view = findFragmentUnder.mView;
                    ViewGroup viewGroup = fragment.mContainer;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    i = viewGroup.indexOfChild(fragment.mView);
                    if (i < indexOfChild) {
                        viewGroup.removeViewAt(i);
                        viewGroup.addView(fragment.mView, indexOfChild);
                    }
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    float f = fragment.mPostponedAlpha;
                    if (f > 0.0f) {
                        fragment.mView.setAlpha(f);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    AnimationOrAnimator loadAnimation = loadAnimation(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (loadAnimation != null) {
                        setHWLayerAnimListenerIfAlpha(fragment.mView, loadAnimation);
                        Animation animation = loadAnimation.animation;
                        if (animation != null) {
                            fragment.mView.startAnimation(animation);
                        } else {
                            loadAnimation.animator.setTarget(fragment.mView);
                            loadAnimation.animator.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                completeShowHideFragment(fragment);
            }
        }
    }

    final void moveToState(int i, boolean z) {
        if (this.mHost == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.mCurState) {
            this.mCurState = i;
            if (this.mActive != null) {
                int i2;
                int size = this.mAdded.size();
                for (i2 = 0; i2 < size; i2++) {
                    moveFragmentToExpectedState((Fragment) this.mAdded.get(i2));
                }
                size = this.mActive.size();
                for (i2 = 0; i2 < size; i2++) {
                    Fragment fragment = (Fragment) this.mActive.valueAt(i2);
                    if (fragment != null) {
                        if (!fragment.mRemoving) {
                            if (fragment.mDetached) {
                            }
                        }
                        if (!fragment.mIsNewlyAdded) {
                            moveFragmentToExpectedState(fragment);
                        }
                    }
                }
                startPendingDeferredFragments();
                if (this.mNeedMenuInvalidate) {
                    FragmentHostCallback fragmentHostCallback = this.mHost;
                    if (fragmentHostCallback != null && this.mCurState == 5) {
                        fragmentHostCallback.onSupportInvalidateOptionsMenu();
                        this.mNeedMenuInvalidate = false;
                    }
                }
            }
        }
    }

    final void moveToState(Fragment fragment) {
        moveToState(fragment, this.mCurState, 0, 0, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void moveToState(android.support.v4.app.Fragment r8, int r9, int r10, int r11, boolean r12) {
        /*
        r7 = this;
        r0 = r8.mAdded;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        r0 = r8.mDetached;
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r0 = 1;
        if (r9 <= r0) goto L_0x000c;
    L_0x000b:
        r9 = 1;
    L_0x000c:
        r0 = r8.mRemoving;
        if (r0 == 0) goto L_0x001e;
    L_0x0010:
        r0 = r8.mState;
        if (r9 <= r0) goto L_0x001e;
    L_0x0014:
        if (r0 != 0) goto L_0x001c;
    L_0x0016:
        r0 = r8.isInBackStack();
        if (r0 != 0) goto L_0x04b6;
    L_0x001c:
        r9 = r8.mState;
    L_0x001e:
        r0 = r8.mDeferStart;
        if (r0 == 0) goto L_0x04b3;
    L_0x0022:
        r0 = r8.mState;
        r1 = 4;
        if (r0 >= r1) goto L_0x04b0;
    L_0x0027:
        r0 = 3;
        if (r9 <= r0) goto L_0x04ad;
    L_0x002a:
        r9 = 3;
        r6 = r9;
    L_0x002c:
        r0 = r8.mState;
        if (r0 > r6) goto L_0x0328;
    L_0x0030:
        r0 = r8.mFromLayout;
        if (r0 == 0) goto L_0x0039;
    L_0x0034:
        r0 = r8.mInLayout;
        if (r0 != 0) goto L_0x0039;
    L_0x0038:
        return;
    L_0x0039:
        r0 = r8.getAnimatingAway();
        if (r0 != 0) goto L_0x0045;
    L_0x003f:
        r0 = r8.getAnimator();
        if (r0 == 0) goto L_0x0059;
    L_0x0045:
        r0 = 0;
        r8.setAnimatingAway(r0);
        r0 = 0;
        r8.setAnimator(r0);
        r2 = r8.getStateAfterAnimating();
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r7;
        r1 = r8;
        r0.moveToState(r1, r2, r3, r4, r5);
    L_0x0059:
        r0 = r8.mState;
        switch(r0) {
            case 0: goto L_0x0216;
            case 1: goto L_0x00bf;
            case 2: goto L_0x04c4;
            case 3: goto L_0x04c1;
            case 4: goto L_0x04be;
            default: goto L_0x005e;
        };
    L_0x005e:
        r0 = r6;
    L_0x005f:
        r6 = r0;
    L_0x0060:
        r0 = r8.mState;
        if (r0 == r6) goto L_0x0038;
    L_0x0064:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "moveToState: Fragment state for ";
        r0.append(r1);
        r0.append(r8);
        r1 = " not updated inline; ";
        r0.append(r1);
        r1 = "expected state ";
        r0.append(r1);
        r0.append(r6);
        r1 = " found ";
        r0.append(r1);
        r1 = r8.mState;
        r0.append(r1);
        r1 = "FragmentManager";
        r0 = r0.toString();
        android.util.Log.w(r1, r0);
        r8.mState = r6;
        goto L_0x0038;
    L_0x0094:
        r0 = r8.mParentFragment;
        if (r0 != 0) goto L_0x0312;
    L_0x0098:
        r0 = r7.mHost;
        r0.onAttachFragment(r8);
    L_0x009d:
        r0 = r7.mHost;
        r0 = r0.getContext();
        r1 = 0;
        r7.dispatchOnFragmentAttached(r8, r0, r1);
        r0 = r8.mIsCreated;
        if (r0 != 0) goto L_0x0308;
    L_0x00ab:
        r0 = r8.mSavedFragmentState;
        r1 = 0;
        r7.dispatchOnFragmentPreCreated(r8, r0, r1);
        r0 = r8.mSavedFragmentState;
        r8.performCreate(r0);
        r0 = r8.mSavedFragmentState;
        r1 = 0;
        r7.dispatchOnFragmentCreated(r8, r0, r1);
    L_0x00bc:
        r0 = 0;
        r8.mRetaining = r0;
    L_0x00bf:
        r7.ensureInflatedFragmentView(r8);
        r0 = 1;
        if (r6 <= r0) goto L_0x0214;
    L_0x00c5:
        r0 = DEBUG;
        if (r0 == 0) goto L_0x00df;
    L_0x00c9:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "moveto ACTIVITY_CREATED: ";
        r0.append(r1);
        r0.append(r8);
        r1 = "FragmentManager";
        r0 = r0.toString();
        android.util.Log.v(r1, r0);
    L_0x00df:
        r0 = r8.mFromLayout;
        if (r0 != 0) goto L_0x0198;
    L_0x00e3:
        r0 = r8.mContainerId;
        if (r0 == 0) goto L_0x0211;
    L_0x00e7:
        r1 = -1;
        if (r0 != r1) goto L_0x0108;
    L_0x00ea:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Cannot create fragment ";
        r1.append(r2);
        r1.append(r8);
        r2 = " for a container view with no id";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r7.throwException(r0);
    L_0x0108:
        r0 = r7.mContainer;
        r1 = r8.mContainerId;
        r0 = r0.onFindViewById(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0151;
    L_0x0114:
        r1 = r8.mRestored;
        if (r1 != 0) goto L_0x0151;
    L_0x0118:
        r1 = r8.getResources();	 Catch:{ NotFoundException -> 0x04b9 }
        r2 = r8.mContainerId;	 Catch:{ NotFoundException -> 0x04b9 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x04b9 }
    L_0x0122:
        r2 = new java.lang.IllegalArgumentException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "No view found for id 0x";
        r3.append(r4);
        r4 = r8.mContainerId;
        r4 = java.lang.Integer.toHexString(r4);
        r3.append(r4);
        r4 = " (";
        r3.append(r4);
        r3.append(r1);
        r1 = ") for fragment ";
        r3.append(r1);
        r3.append(r8);
        r1 = r3.toString();
        r2.<init>(r1);
        r7.throwException(r2);
    L_0x0151:
        r8.mContainer = r0;
        r1 = r8.mSavedFragmentState;
        r1 = r8.performGetLayoutInflater(r1);
        r2 = r8.mSavedFragmentState;
        r8.performCreateView(r1, r0, r2);
        r1 = r8.mView;
        if (r1 == 0) goto L_0x020d;
    L_0x0162:
        r8.mInnerView = r1;
        r2 = 0;
        r1.setSaveFromParentEnabled(r2);
        if (r0 == 0) goto L_0x016f;
    L_0x016a:
        r1 = r8.mView;
        r0.addView(r1);
    L_0x016f:
        r0 = r8.mHidden;
        if (r0 == 0) goto L_0x017a;
    L_0x0173:
        r0 = r8.mView;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x017a:
        r0 = r8.mView;
        r1 = r8.mSavedFragmentState;
        r8.onViewCreated(r0, r1);
        r0 = r8.mView;
        r1 = r8.mSavedFragmentState;
        r2 = 0;
        r7.dispatchOnFragmentViewCreated(r8, r0, r1, r2);
        r0 = r8.mView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x020b;
    L_0x0191:
        r0 = r8.mContainer;
        if (r0 == 0) goto L_0x0209;
    L_0x0195:
        r0 = 1;
    L_0x0196:
        r8.mIsNewlyAdded = r0;
    L_0x0198:
        r0 = r8.mSavedFragmentState;
        r8.performActivityCreated(r0);
        r0 = r8.mSavedFragmentState;
        r1 = 0;
        r7.dispatchOnFragmentActivityCreated(r8, r0, r1);
        r0 = r8.mView;
        if (r0 == 0) goto L_0x01ac;
    L_0x01a7:
        r0 = r8.mSavedFragmentState;
        r8.restoreViewState(r0);
    L_0x01ac:
        r0 = 0;
        r8.mSavedFragmentState = r0;
        r0 = r6;
    L_0x01b0:
        r1 = 2;
        if (r0 <= r1) goto L_0x01b6;
    L_0x01b3:
        r1 = 3;
        r8.mState = r1;
    L_0x01b6:
        r1 = 3;
        if (r0 <= r1) goto L_0x01da;
    L_0x01b9:
        r1 = DEBUG;
        if (r1 == 0) goto L_0x01d3;
    L_0x01bd:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1.append(r2);
        r1.append(r8);
        r2 = "FragmentManager";
        r1 = r1.toString();
        android.util.Log.v(r2, r1);
    L_0x01d3:
        r8.performStart();
        r1 = 0;
        r7.dispatchOnFragmentStarted(r8, r1);
    L_0x01da:
        r1 = 4;
        if (r0 <= r1) goto L_0x0206;
    L_0x01dd:
        r1 = DEBUG;
        if (r1 == 0) goto L_0x01f7;
    L_0x01e1:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1.append(r2);
        r1.append(r8);
        r2 = "FragmentManager";
        r1 = r1.toString();
        android.util.Log.v(r2, r1);
    L_0x01f7:
        r8.performResume();
        r1 = 0;
        r7.dispatchOnFragmentResumed(r8, r1);
        r1 = 0;
        r8.mSavedFragmentState = r1;
        r1 = 0;
        r8.mSavedViewState = r1;
        goto L_0x005f;
    L_0x0206:
        r6 = r0;
        goto L_0x0060;
    L_0x0209:
        r0 = 0;
        goto L_0x0196;
    L_0x020b:
        r0 = 0;
        goto L_0x0196;
    L_0x020d:
        r0 = 0;
        r8.mInnerView = r0;
        goto L_0x0198;
    L_0x0211:
        r0 = 0;
        goto L_0x0151;
    L_0x0214:
        r0 = r6;
        goto L_0x01b0;
    L_0x0216:
        if (r6 <= 0) goto L_0x00bf;
    L_0x0218:
        r0 = DEBUG;
        if (r0 == 0) goto L_0x0232;
    L_0x021c:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "moveto CREATED: ";
        r0.append(r1);
        r0.append(r8);
        r1 = "FragmentManager";
        r0 = r0.toString();
        android.util.Log.v(r1, r0);
    L_0x0232:
        r0 = r8.mSavedFragmentState;
        if (r0 == 0) goto L_0x027e;
    L_0x0236:
        r1 = r7.mHost;
        r1 = r1.getContext();
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r8.mSavedFragmentState;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r8.mSavedViewState = r0;
        r0 = r8.mSavedFragmentState;
        r1 = "android:target_state";
        r0 = r7.getFragment(r0, r1);
        r8.mTarget = r0;
        r0 = r8.mTarget;
        if (r0 == 0) goto L_0x0266;
    L_0x025b:
        r0 = r8.mSavedFragmentState;
        r1 = "android:target_req_state";
        r2 = 0;
        r0 = r0.getInt(r1, r2);
        r8.mTargetRequestCode = r0;
    L_0x0266:
        r0 = r8.mSavedUserVisibleHint;
        if (r0 == 0) goto L_0x031b;
    L_0x026a:
        r0 = r0.booleanValue();
        r8.mUserVisibleHint = r0;
        r0 = 0;
        r8.mSavedUserVisibleHint = r0;
    L_0x0273:
        r0 = r8.mUserVisibleHint;
        if (r0 != 0) goto L_0x027e;
    L_0x0277:
        r0 = 1;
        r8.mDeferStart = r0;
        r0 = 3;
        if (r6 <= r0) goto L_0x027e;
    L_0x027d:
        r6 = 3;
    L_0x027e:
        r0 = r7.mHost;
        r8.mHost = r0;
        r0 = r7.mParent;
        r8.mParentFragment = r0;
        if (r0 != 0) goto L_0x0317;
    L_0x0288:
        r0 = r7.mHost;
        r0 = r0.getFragmentManagerImpl();
    L_0x028e:
        r8.mFragmentManager = r0;
        r0 = r8.mTarget;
        if (r0 == 0) goto L_0x02d2;
    L_0x0294:
        r1 = r7.mActive;
        r0 = r0.mIndex;
        r0 = r1.get(r0);
        r1 = r8.mTarget;
        if (r0 == r1) goto L_0x02c6;
    L_0x02a0:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1.append(r2);
        r1.append(r8);
        r2 = " declared target fragment ";
        r1.append(r2);
        r2 = r8.mTarget;
        r1.append(r2);
        r2 = " that does not belong to this FragmentManager!";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x02c6:
        r0 = r1.mState;
        if (r0 > 0) goto L_0x02d2;
    L_0x02ca:
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r7;
        r0.moveToState(r1, r2, r3, r4, r5);
    L_0x02d2:
        r0 = r7.mHost;
        r0 = r0.getContext();
        r1 = 0;
        r7.dispatchOnFragmentPreAttached(r8, r0, r1);
        r0 = 0;
        r8.mCalled = r0;
        r0 = r7.mHost;
        r0 = r0.getContext();
        r8.onAttach(r0);
        r0 = r8.mCalled;
        if (r0 != 0) goto L_0x0094;
    L_0x02ec:
        r0 = new android.support.v4.app.SuperNotCalledException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1.append(r2);
        r1.append(r8);
        r2 = " did not call through to super.onAttach()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0308:
        r0 = r8.mSavedFragmentState;
        r8.restoreChildFragmentState(r0);
        r0 = 1;
        r8.mState = r0;
        goto L_0x00bc;
    L_0x0312:
        r0.onAttachFragment(r8);
        goto L_0x009d;
    L_0x0317:
        r0 = r0.mChildFragmentManager;
        goto L_0x028e;
    L_0x031b:
        r0 = r8.mSavedFragmentState;
        r1 = "android:user_visible_hint";
        r2 = 1;
        r0 = r0.getBoolean(r1, r2);
        r8.mUserVisibleHint = r0;
        goto L_0x0273;
    L_0x0328:
        if (r0 <= r6) goto L_0x0060;
    L_0x032a:
        switch(r0) {
            case 1: goto L_0x032f;
            case 2: goto L_0x03c0;
            case 3: goto L_0x03a0;
            case 4: goto L_0x037c;
            case 5: goto L_0x0358;
            default: goto L_0x032d;
        };
    L_0x032d:
        goto L_0x0060;
    L_0x032f:
        if (r6 > 0) goto L_0x0060;
    L_0x0331:
        r0 = r7.mDestroyed;
        if (r0 == 0) goto L_0x0346;
    L_0x0335:
        r0 = r8.getAnimatingAway();
        if (r0 == 0) goto L_0x048f;
    L_0x033b:
        r0 = r8.getAnimatingAway();
        r1 = 0;
        r8.setAnimatingAway(r1);
        r0.clearAnimation();
    L_0x0346:
        r0 = r8.getAnimatingAway();
        if (r0 != 0) goto L_0x0352;
    L_0x034c:
        r0 = r8.getAnimator();
        if (r0 == 0) goto L_0x0449;
    L_0x0352:
        r8.setStateAfterAnimating(r6);
        r6 = 1;
        goto L_0x0060;
    L_0x0358:
        r0 = 5;
        if (r6 >= r0) goto L_0x037c;
    L_0x035b:
        r0 = DEBUG;
        if (r0 == 0) goto L_0x0375;
    L_0x035f:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "movefrom RESUMED: ";
        r0.append(r1);
        r0.append(r8);
        r1 = "FragmentManager";
        r0 = r0.toString();
        android.util.Log.v(r1, r0);
    L_0x0375:
        r8.performPause();
        r0 = 0;
        r7.dispatchOnFragmentPaused(r8, r0);
    L_0x037c:
        r0 = 4;
        if (r6 >= r0) goto L_0x03a0;
    L_0x037f:
        r0 = DEBUG;
        if (r0 == 0) goto L_0x0399;
    L_0x0383:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "movefrom STARTED: ";
        r0.append(r1);
        r0.append(r8);
        r1 = "FragmentManager";
        r0 = r0.toString();
        android.util.Log.v(r1, r0);
    L_0x0399:
        r8.performStop();
        r0 = 0;
        r7.dispatchOnFragmentStopped(r8, r0);
    L_0x03a0:
        r0 = 3;
        if (r6 >= r0) goto L_0x03c0;
    L_0x03a3:
        r0 = DEBUG;
        if (r0 == 0) goto L_0x03bd;
    L_0x03a7:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "movefrom STOPPED: ";
        r0.append(r1);
        r0.append(r8);
        r1 = "FragmentManager";
        r0 = r0.toString();
        android.util.Log.v(r1, r0);
    L_0x03bd:
        r8.performReallyStop();
    L_0x03c0:
        r0 = 2;
        if (r6 >= r0) goto L_0x032f;
    L_0x03c3:
        r0 = DEBUG;
        if (r0 == 0) goto L_0x03dd;
    L_0x03c7:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "movefrom ACTIVITY_CREATED: ";
        r0.append(r1);
        r0.append(r8);
        r1 = "FragmentManager";
        r0 = r0.toString();
        android.util.Log.v(r1, r0);
    L_0x03dd:
        r0 = r8.mView;
        if (r0 == 0) goto L_0x03f0;
    L_0x03e1:
        r0 = r7.mHost;
        r0 = r0.onShouldSaveFragmentState(r8);
        if (r0 == 0) goto L_0x03f0;
    L_0x03e9:
        r0 = r8.mSavedViewState;
        if (r0 != 0) goto L_0x03f0;
    L_0x03ed:
        r7.saveFragmentViewState(r8);
    L_0x03f0:
        r8.performDestroyView();
        r0 = 0;
        r7.dispatchOnFragmentViewDestroyed(r8, r0);
        r0 = r8.mView;
        if (r0 == 0) goto L_0x0432;
    L_0x03fb:
        r1 = r8.mContainer;
        if (r1 == 0) goto L_0x0432;
    L_0x03ff:
        r1.endViewTransition(r0);
        r0 = r8.mView;
        r0.clearAnimation();
        r0 = r7.mCurState;
        if (r0 <= 0) goto L_0x04aa;
    L_0x040b:
        r0 = r7.mDestroyed;
        if (r0 != 0) goto L_0x04a7;
    L_0x040f:
        r0 = r8.mView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x04a4;
    L_0x0417:
        r0 = r8.mPostponedAlpha;
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x04a2;
    L_0x041e:
        r0 = 0;
        r0 = r7.loadAnimation(r8, r10, r0, r11);
    L_0x0423:
        r1 = 0;
        r8.mPostponedAlpha = r1;
        if (r0 == 0) goto L_0x042b;
    L_0x0428:
        r7.animateRemoveFragment(r8, r0, r6);
    L_0x042b:
        r0 = r8.mContainer;
        r1 = r8.mView;
        r0.removeView(r1);
    L_0x0432:
        r0 = 0;
        r8.mContainer = r0;
        r0 = 0;
        r8.mView = r0;
        r0 = 0;
        r8.mViewLifecycleOwner = r0;
        r0 = r8.mViewLifecycleOwnerLiveData;
        r1 = 0;
        r0.setValue(r1);
        r0 = 0;
        r8.mInnerView = r0;
        r0 = 0;
        r8.mInLayout = r0;
        goto L_0x032f;
    L_0x0449:
        r0 = DEBUG;
        if (r0 == 0) goto L_0x0463;
    L_0x044d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "movefrom CREATED: ";
        r0.append(r1);
        r0.append(r8);
        r1 = "FragmentManager";
        r0 = r0.toString();
        android.util.Log.v(r1, r0);
    L_0x0463:
        r0 = r8.mRetaining;
        if (r0 != 0) goto L_0x048b;
    L_0x0467:
        r8.performDestroy();
        r0 = 0;
        r7.dispatchOnFragmentDestroyed(r8, r0);
    L_0x046e:
        r8.performDetach();
        r0 = 0;
        r7.dispatchOnFragmentDetached(r8, r0);
        if (r12 != 0) goto L_0x0060;
    L_0x0477:
        r0 = r8.mRetaining;
        if (r0 != 0) goto L_0x0480;
    L_0x047b:
        r7.makeInactive(r8);
        goto L_0x0060;
    L_0x0480:
        r0 = 0;
        r8.mHost = r0;
        r0 = 0;
        r8.mParentFragment = r0;
        r0 = 0;
        r8.mFragmentManager = r0;
        goto L_0x0060;
    L_0x048b:
        r0 = 0;
        r8.mState = r0;
        goto L_0x046e;
    L_0x048f:
        r0 = r8.getAnimator();
        if (r0 == 0) goto L_0x0346;
    L_0x0495:
        r0 = r8.getAnimator();
        r1 = 0;
        r8.setAnimator(r1);
        r0.cancel();
        goto L_0x0346;
    L_0x04a2:
        r0 = 0;
        goto L_0x0423;
    L_0x04a4:
        r0 = 0;
        goto L_0x0423;
    L_0x04a7:
        r0 = 0;
        goto L_0x0423;
    L_0x04aa:
        r0 = 0;
        goto L_0x0423;
    L_0x04ad:
        r6 = r9;
        goto L_0x002c;
    L_0x04b0:
        r6 = r9;
        goto L_0x002c;
    L_0x04b3:
        r6 = r9;
        goto L_0x002c;
    L_0x04b6:
        r9 = 1;
        goto L_0x001e;
    L_0x04b9:
        r1 = move-exception;
        r1 = "unknown";
        goto L_0x0122;
    L_0x04be:
        r0 = r6;
        goto L_0x01da;
    L_0x04c1:
        r0 = r6;
        goto L_0x01b6;
    L_0x04c4:
        r0 = r6;
        goto L_0x01b0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentManagerImpl.moveToState(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    public final void noteStateNotSaved() {
        this.mSavedNonConfig = null;
        this.mStateSaved = false;
        this.mStopped = false;
        int size = this.mAdded.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.mAdded.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String string;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentTag.Fragment);
        if (attributeValue == null) {
            string = obtainStyledAttributes.getString(0);
        } else {
            string = attributeValue;
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.isSupportFragmentClass(this.mHost.getContext(), string)) {
            return null;
        }
        int id;
        if (view != null) {
            id = view.getId();
        } else {
            id = 0;
        }
        if (id == -1 && resourceId == -1 && string2 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Fragment findFragmentById;
        Fragment fragment;
        if (resourceId != -1) {
            findFragmentById = findFragmentById(resourceId);
        } else {
            findFragmentById = null;
        }
        if (findFragmentById == null && string2 != null) {
            findFragmentById = findFragmentByTag(string2);
        }
        if (findFragmentById == null && id != -1) {
            findFragmentById = findFragmentById(id);
        }
        if (DEBUG) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("onCreateView: id=0x");
            stringBuilder2.append(Integer.toHexString(resourceId));
            stringBuilder2.append(" fname=");
            stringBuilder2.append(string);
            stringBuilder2.append(" existing=");
            stringBuilder2.append(findFragmentById);
            Log.v("FragmentManager", stringBuilder2.toString());
        }
        if (findFragmentById == null) {
            int i;
            Fragment instantiate = this.mContainer.instantiate(context, string, null);
            instantiate.mFromLayout = true;
            if (resourceId != 0) {
                i = resourceId;
            } else {
                i = id;
            }
            instantiate.mFragmentId = i;
            instantiate.mContainerId = id;
            instantiate.mTag = string2;
            instantiate.mInLayout = true;
            instantiate.mFragmentManager = this;
            instantiate.mHost = this.mHost;
            instantiate.onInflate(this.mHost.getContext(), attributeSet, instantiate.mSavedFragmentState);
            addFragment(instantiate, true);
            fragment = instantiate;
        } else if (findFragmentById.mInLayout) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(attributeSet.getPositionDescription());
            stringBuilder3.append(": Duplicate id 0x");
            stringBuilder3.append(Integer.toHexString(resourceId));
            stringBuilder3.append(", tag ");
            stringBuilder3.append(string2);
            stringBuilder3.append(", or parent id 0x");
            stringBuilder3.append(Integer.toHexString(id));
            stringBuilder3.append(" with another fragment for ");
            stringBuilder3.append(string);
            throw new IllegalArgumentException(stringBuilder3.toString());
        } else {
            findFragmentById.mInLayout = true;
            findFragmentById.mHost = this.mHost;
            if (findFragmentById.mRetaining) {
                fragment = findFragmentById;
            } else {
                findFragmentById.onInflate(this.mHost.getContext(), attributeSet, findFragmentById.mSavedFragmentState);
                fragment = findFragmentById;
            }
        }
        if (this.mCurState > 0 || !fragment.mFromLayout) {
            moveToState(fragment);
        } else {
            moveToState(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.mView;
        if (view2 == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(string);
            stringBuilder.append(" did not create a view.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragment.mView.getTag() == null) {
            fragment.mView.setTag(string2);
        }
        return fragment.mView;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void performPendingDeferredStart(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.mExecutingActions) {
            this.mHavePendingDeferredStart = true;
            return;
        }
        fragment.mDeferStart = false;
        moveToState(fragment, this.mCurState, 0, 0, false);
    }

    public final void popBackStack() {
        enqueueAction(new PopBackStackState(null, -1, 0), false);
    }

    public final void popBackStack(int i, int i2) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bad id: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        enqueueAction(new PopBackStackState(null, i, i2), false);
    }

    public final void popBackStack(String str, int i) {
        enqueueAction(new PopBackStackState(str, -1, i), false);
    }

    public final boolean popBackStackImmediate() {
        checkStateLoss();
        return popBackStackImmediate(null, -1, 0);
    }

    public final boolean popBackStackImmediate(int i, int i2) {
        checkStateLoss();
        execPendingActions();
        if (i >= 0) {
            return popBackStackImmediate(null, i, i2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad id: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final boolean popBackStackImmediate(String str, int i) {
        checkStateLoss();
        return popBackStackImmediate(str, -1, i);
    }

    private final boolean popBackStackImmediate(String str, int i, int i2) {
        execPendingActions();
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i < 0 && str == null) {
            FragmentManager peekChildFragmentManager = fragment.peekChildFragmentManager();
            if (peekChildFragmentManager != null && peekChildFragmentManager.popBackStackImmediate()) {
                return true;
            }
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i, i2);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        doPendingDeferredStart();
        burpActive();
        return popBackStackState;
    }

    final boolean popBackStackState(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        ArrayList arrayList3 = this.mBackStack;
        if (arrayList3 == null) {
            return false;
        }
        int size;
        if (str == null && i < 0 && (i2 & 1) == 0) {
            size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            int size2;
            if (str != null || i >= 0) {
                BackStackRecord backStackRecord;
                size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    backStackRecord = (BackStackRecord) this.mBackStack.get(size2);
                    if ((str != null && str.equals(backStackRecord.getName())) || (i >= 0 && i == backStackRecord.mIndex)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        backStackRecord = (BackStackRecord) this.mBackStack.get(size2);
                        if (str == null || !str.equals(backStackRecord.getName())) {
                            if (i >= 0) {
                                if (i != backStackRecord.mIndex) {
                                    size = size2;
                                    break;
                                }
                            } else {
                                size = size2;
                                break;
                            }
                        }
                        size2--;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            } else {
                size = -1;
            }
            if (size == this.mBackStack.size() - 1) {
                return false;
            }
            for (size2 = this.mBackStack.size() - 1; size2 > size; size2--) {
                arrayList.add(this.mBackStack.remove(size2));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    private final int postponePostponableTransactions(ArrayList arrayList, ArrayList arrayList2, int i, int i2, ij ijVar) {
        int i3 = i2 - 1;
        int i4 = i2;
        while (i3 >= i) {
            boolean z;
            int i5;
            BackStackRecord backStackRecord = (BackStackRecord) arrayList.get(i3);
            boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
            if (!backStackRecord.isPostponed()) {
                z = false;
            } else if (backStackRecord.interactsWith(arrayList, i3 + 1, i2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.mPostponedTransactions == null) {
                    this.mPostponedTransactions = new ArrayList();
                }
                OnStartEnterTransitionListener startEnterTransitionListener = new StartEnterTransitionListener(backStackRecord, booleanValue);
                this.mPostponedTransactions.add(startEnterTransitionListener);
                backStackRecord.setOnStartPostponedListener(startEnterTransitionListener);
                if (booleanValue) {
                    backStackRecord.executeOps();
                } else {
                    backStackRecord.executePopOps(false);
                }
                int i6 = i4 - 1;
                if (i3 != i6) {
                    arrayList.remove(i3);
                    arrayList.add(i6, backStackRecord);
                }
                addAddedFragments(ijVar);
                i5 = i6;
            } else {
                i5 = i4;
            }
            i3--;
            i4 = i5;
        }
        return i4;
    }

    public final void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not currently in the FragmentManager");
            throwException(new IllegalStateException(stringBuilder.toString()));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    public final void registerFragmentLifecycleCallbacks(FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.mLifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(fragmentLifecycleCallbacks, z));
    }

    public final void removeFragment(Fragment fragment) {
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove: ");
            stringBuilder.append(fragment);
            stringBuilder.append(" nesting=");
            stringBuilder.append(fragment.mBackStackNesting);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        int isInBackStack = fragment.isInBackStack() ^ 1;
        if (!fragment.mDetached || isInBackStack != 0) {
            synchronized (this.mAdded) {
                this.mAdded.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    public final void removeOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        ArrayList arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(onBackStackChangedListener);
        }
    }

    private final void removeRedundantOperationsAndExecute(ArrayList arrayList, ArrayList arrayList2) {
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            executePostponedTransaction(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            while (i < size) {
                int i3;
                if (((BackStackRecord) arrayList.get(i)).mReorderingAllowed) {
                    i3 = i;
                } else {
                    if (i2 != i) {
                        executeOpsTogether(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size) {
                            if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                                if (((BackStackRecord) arrayList.get(i2)).mReorderingAllowed) {
                                    i3 = i2;
                                    break;
                                }
                                i2++;
                            } else {
                                i3 = i2;
                                break;
                            }
                        }
                        i3 = i2;
                    } else {
                        i3 = i2;
                    }
                    executeOpsTogether(arrayList, arrayList2, i, i3);
                    i2 = i3;
                    i3--;
                }
                i = i3 + 1;
            }
            if (i2 != size) {
                executeOpsTogether(arrayList, arrayList2, i2, size);
            }
        }
    }

    final void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
                ((OnBackStackChangedListener) this.mBackStackChangeListeners.get(i)).onBackStackChanged();
            }
        }
    }

    final void restoreAllState(Parcelable parcelable, FragmentManagerNonConfig fragmentManagerNonConfig) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.mActive != null) {
                List fragments;
                List childNonConfigs;
                int size;
                Fragment fragment;
                StringBuilder stringBuilder;
                int i;
                int length;
                List list;
                int i2;
                if (fragmentManagerNonConfig != null) {
                    fragments = fragmentManagerNonConfig.getFragments();
                    childNonConfigs = fragmentManagerNonConfig.getChildNonConfigs();
                    List viewModelStores = fragmentManagerNonConfig.getViewModelStores();
                    if (fragments != null) {
                        size = fragments.size();
                    } else {
                        boolean z = false;
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        StringBuilder stringBuilder2;
                        fragment = (Fragment) fragments.get(i3);
                        if (DEBUG) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("restoreAllState: re-attaching retained ");
                            stringBuilder.append(fragment);
                            Log.v("FragmentManager", stringBuilder.toString());
                            i = 0;
                        } else {
                            i = 0;
                        }
                        while (true) {
                            FragmentState[] fragmentStateArr = fragmentManagerState.mActive;
                            length = fragmentStateArr.length;
                            if (i < length && fragmentStateArr[i].mIndex != fragment.mIndex) {
                                i++;
                            } else if (i == length) {
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Could not find active fragment with index ");
                                stringBuilder2.append(fragment.mIndex);
                                throwException(new IllegalStateException(stringBuilder2.toString()));
                            }
                        }
                        if (i == length) {
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Could not find active fragment with index ");
                            stringBuilder2.append(fragment.mIndex);
                            throwException(new IllegalStateException(stringBuilder2.toString()));
                        }
                        FragmentState fragmentState = fragmentManagerState.mActive[i];
                        fragmentState.mInstance = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTarget = null;
                        Bundle bundle = fragmentState.mSavedFragmentState;
                        if (bundle != null) {
                            bundle.setClassLoader(this.mHost.getContext().getClassLoader());
                            fragment.mSavedViewState = fragmentState.mSavedFragmentState.getSparseParcelableArray(VIEW_STATE_TAG);
                            fragment.mSavedFragmentState = fragmentState.mSavedFragmentState;
                        }
                    }
                    fragments = viewModelStores;
                    list = childNonConfigs;
                } else {
                    fragments = null;
                    list = null;
                }
                this.mActive = new SparseArray(fragmentManagerState.mActive.length);
                length = 0;
                while (true) {
                    FragmentState[] fragmentStateArr2 = fragmentManagerState.mActive;
                    if (length >= fragmentStateArr2.length) {
                        break;
                    }
                    FragmentState fragmentState2 = fragmentStateArr2[length];
                    if (fragmentState2 != null) {
                        FragmentManagerNonConfig fragmentManagerNonConfig2;
                        ao aoVar;
                        if (list == null) {
                            fragmentManagerNonConfig2 = null;
                        } else if (length < list.size()) {
                            fragmentManagerNonConfig2 = (FragmentManagerNonConfig) list.get(length);
                        } else {
                            fragmentManagerNonConfig2 = null;
                        }
                        if (fragments == null) {
                            aoVar = null;
                        } else if (length < fragments.size()) {
                            aoVar = (ao) fragments.get(length);
                        } else {
                            aoVar = null;
                        }
                        Fragment instantiate = fragmentState2.instantiate(this.mHost, this.mContainer, this.mParent, fragmentManagerNonConfig2, aoVar);
                        if (DEBUG) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("restoreAllState: active #");
                            stringBuilder.append(length);
                            stringBuilder.append(": ");
                            stringBuilder.append(instantiate);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        this.mActive.put(instantiate.mIndex, instantiate);
                        fragmentState2.mInstance = null;
                    }
                    length++;
                }
                if (fragmentManagerNonConfig != null) {
                    childNonConfigs = fragmentManagerNonConfig.getFragments();
                    if (childNonConfigs != null) {
                        i = childNonConfigs.size();
                    } else {
                        boolean z2 = false;
                    }
                    for (int i4 = 0; i4 < i; i4++) {
                        fragment = (Fragment) childNonConfigs.get(i4);
                        size = fragment.mTargetIndex;
                        if (size >= 0) {
                            fragment.mTarget = (Fragment) this.mActive.get(size);
                            if (fragment.mTarget == null) {
                                StringBuilder stringBuilder3 = new StringBuilder();
                                stringBuilder3.append("Re-attaching retained fragment ");
                                stringBuilder3.append(fragment);
                                stringBuilder3.append(" target no longer exists: ");
                                stringBuilder3.append(fragment.mTargetIndex);
                                Log.w("FragmentManager", stringBuilder3.toString());
                            }
                        }
                    }
                }
                this.mAdded.clear();
                if (fragmentManagerState.mAdded != null) {
                    size = 0;
                    while (true) {
                        int[] iArr = fragmentManagerState.mAdded;
                        if (size >= iArr.length) {
                            break;
                        }
                        fragment = (Fragment) this.mActive.get(iArr[size]);
                        if (fragment == null) {
                            StringBuilder stringBuilder4 = new StringBuilder();
                            stringBuilder4.append("No instantiated fragment for index #");
                            stringBuilder4.append(fragmentManagerState.mAdded[size]);
                            throwException(new IllegalStateException(stringBuilder4.toString()));
                        }
                        fragment.mAdded = true;
                        if (DEBUG) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("restoreAllState: added #");
                            stringBuilder.append(size);
                            stringBuilder.append(": ");
                            stringBuilder.append(fragment);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        if (this.mAdded.contains(fragment)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.mAdded) {
                            this.mAdded.add(fragment);
                        }
                        size++;
                    }
                }
                BackStackState[] backStackStateArr = fragmentManagerState.mBackStack;
                if (backStackStateArr != null) {
                    this.mBackStack = new ArrayList(backStackStateArr.length);
                    i2 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr2 = fragmentManagerState.mBackStack;
                        if (i2 >= backStackStateArr2.length) {
                            break;
                        }
                        BackStackRecord instantiate2 = backStackStateArr2[i2].instantiate(this);
                        if (DEBUG) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("restoreAllState: back stack #");
                            stringBuilder.append(i2);
                            stringBuilder.append(" (index ");
                            stringBuilder.append(instantiate2.mIndex);
                            stringBuilder.append("): ");
                            stringBuilder.append(instantiate2);
                            Log.v("FragmentManager", stringBuilder.toString());
                            PrintWriter printWriter = new PrintWriter(new im("FragmentManager"));
                            instantiate2.dump("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.mBackStack.add(instantiate2);
                        i = instantiate2.mIndex;
                        if (i >= 0) {
                            setBackStackIndex(i, instantiate2);
                        }
                        i2++;
                    }
                } else {
                    this.mBackStack = null;
                }
                i2 = fragmentManagerState.mPrimaryNavActiveIndex;
                if (i2 >= 0) {
                    this.mPrimaryNav = (Fragment) this.mActive.get(i2);
                }
                this.mNextFragmentIndex = fragmentManagerState.mNextFragmentIndex;
            }
        }
    }

    final FragmentManagerNonConfig retainNonConfig() {
        setRetaining(this.mSavedNonConfig);
        return this.mSavedNonConfig;
    }

    public static int reverseTransit(int i) {
        switch (i) {
            case FragmentTransaction.TRANSIT_FRAGMENT_OPEN /*4097*/:
                return FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
            case FragmentTransaction.TRANSIT_FRAGMENT_FADE /*4099*/:
                return FragmentTransaction.TRANSIT_FRAGMENT_FADE;
            case FragmentTransaction.TRANSIT_FRAGMENT_CLOSE /*8194*/:
                return FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            default:
                return 0;
        }
    }

    final Parcelable saveAllState() {
        Parcelable parcelable = null;
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions();
        this.mStateSaved = true;
        this.mSavedNonConfig = null;
        SparseArray sparseArray = this.mActive;
        if (sparseArray != null && sparseArray.size() > 0) {
            Fragment fragment;
            int size = this.mActive.size();
            FragmentState[] fragmentStateArr = new FragmentState[size];
            int i = 0;
            boolean z = false;
            while (i < size) {
                boolean z2;
                fragment = (Fragment) this.mActive.valueAt(i);
                if (fragment != null) {
                    StringBuilder stringBuilder;
                    if (fragment.mIndex < 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Failure saving state: active ");
                        stringBuilder.append(fragment);
                        stringBuilder.append(" has cleared index: ");
                        stringBuilder.append(fragment.mIndex);
                        throwException(new IllegalStateException(stringBuilder.toString()));
                    }
                    FragmentState fragmentState = new FragmentState(fragment);
                    fragmentStateArr[i] = fragmentState;
                    if (fragment.mState <= 0 || fragmentState.mSavedFragmentState != null) {
                        fragmentState.mSavedFragmentState = fragment.mSavedFragmentState;
                    } else {
                        fragmentState.mSavedFragmentState = saveFragmentBasicState(fragment);
                        Fragment fragment2 = fragment.mTarget;
                        if (fragment2 != null) {
                            if (fragment2.mIndex < 0) {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Failure saving state: ");
                                stringBuilder2.append(fragment);
                                stringBuilder2.append(" has target not in fragment manager: ");
                                stringBuilder2.append(fragment.mTarget);
                                throwException(new IllegalStateException(stringBuilder2.toString()));
                            }
                            if (fragmentState.mSavedFragmentState == null) {
                                fragmentState.mSavedFragmentState = new Bundle();
                            }
                            putFragment(fragmentState.mSavedFragmentState, TARGET_STATE_TAG, fragment.mTarget);
                            int i2 = fragment.mTargetRequestCode;
                            if (i2 != 0) {
                                fragmentState.mSavedFragmentState.putInt(TARGET_REQUEST_CODE_STATE_TAG, i2);
                            }
                        }
                    }
                    if (DEBUG) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Saved state of ");
                        stringBuilder.append(fragment);
                        stringBuilder.append(": ");
                        stringBuilder.append(fragmentState.mSavedFragmentState);
                        Log.v("FragmentManager", stringBuilder.toString());
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = z;
                }
                i++;
                z = z2;
            }
            if (z) {
                StringBuilder stringBuilder3;
                int[] iArr;
                BackStackState[] backStackStateArr;
                i = this.mAdded.size();
                if (i > 0) {
                    int[] iArr2 = new int[i];
                    for (int i3 = 0; i3 < i; i3++) {
                        iArr2[i3] = ((Fragment) this.mAdded.get(i3)).mIndex;
                        if (iArr2[i3] < 0) {
                            StringBuilder stringBuilder4 = new StringBuilder();
                            stringBuilder4.append("Failure saving state: active ");
                            stringBuilder4.append(this.mAdded.get(i3));
                            stringBuilder4.append(" has cleared index: ");
                            stringBuilder4.append(iArr2[i3]);
                            throwException(new IllegalStateException(stringBuilder4.toString()));
                        }
                        if (DEBUG) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("saveAllState: adding fragment #");
                            stringBuilder3.append(i3);
                            stringBuilder3.append(": ");
                            stringBuilder3.append(this.mAdded.get(i3));
                            Log.v("FragmentManager", stringBuilder3.toString());
                        }
                    }
                    iArr = iArr2;
                } else {
                    iArr = null;
                }
                ArrayList arrayList = this.mBackStack;
                if (arrayList != null) {
                    i = arrayList.size();
                    if (i > 0) {
                        BackStackState[] backStackStateArr2 = new BackStackState[i];
                        for (int i4 = 0; i4 < i; i4++) {
                            backStackStateArr2[i4] = new BackStackState((BackStackRecord) this.mBackStack.get(i4));
                            if (DEBUG) {
                                stringBuilder3 = new StringBuilder();
                                stringBuilder3.append("saveAllState: adding back stack #");
                                stringBuilder3.append(i4);
                                stringBuilder3.append(": ");
                                stringBuilder3.append(this.mBackStack.get(i4));
                                Log.v("FragmentManager", stringBuilder3.toString());
                            }
                        }
                        backStackStateArr = backStackStateArr2;
                    } else {
                        backStackStateArr = null;
                    }
                } else {
                    backStackStateArr = null;
                }
                parcelable = new FragmentManagerState();
                parcelable.mActive = fragmentStateArr;
                parcelable.mAdded = iArr;
                parcelable.mBackStack = backStackStateArr;
                fragment = this.mPrimaryNav;
                if (fragment != null) {
                    parcelable.mPrimaryNavActiveIndex = fragment.mIndex;
                }
                parcelable.mNextFragmentIndex = this.mNextFragmentIndex;
                saveNonConfig();
            } else if (DEBUG) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        }
        return parcelable;
    }

    final Bundle saveFragmentBasicState(Fragment fragment) {
        Bundle bundle;
        if (this.mStateBundle == null) {
            this.mStateBundle = new Bundle();
        }
        fragment.performSaveInstanceState(this.mStateBundle);
        dispatchOnFragmentSaveInstanceState(fragment, this.mStateBundle, false);
        if (this.mStateBundle.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.mStateBundle;
            this.mStateBundle = null;
        }
        if (fragment.mView != null) {
            saveFragmentViewState(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(VIEW_STATE_TAG, fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(USER_VISIBLE_HINT_TAG, fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public final SavedState saveFragmentInstanceState(Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not currently in the FragmentManager");
            throwException(new IllegalStateException(stringBuilder.toString()));
        }
        if (fragment.mState <= 0) {
            return null;
        }
        Bundle saveFragmentBasicState = saveFragmentBasicState(fragment);
        if (saveFragmentBasicState != null) {
            return new SavedState(saveFragmentBasicState);
        }
        return null;
    }

    final void saveFragmentViewState(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray sparseArray = this.mStateArray;
            if (sparseArray == null) {
                this.mStateArray = new SparseArray();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.mStateArray);
            if (this.mStateArray.size() > 0) {
                fragment.mSavedViewState = this.mStateArray;
                this.mStateArray = null;
            }
        }
    }

    final void saveNonConfig() {
        List list;
        List list2;
        List list3;
        if (this.mActive != null) {
            list = null;
            list2 = null;
            list3 = null;
            for (int i = 0; i < this.mActive.size(); i++) {
                Fragment fragment = (Fragment) this.mActive.valueAt(i);
                if (fragment != null) {
                    int i2;
                    Object obj;
                    if (fragment.mRetainInstance) {
                        if (list3 == null) {
                            list3 = new ArrayList();
                        }
                        list3.add(fragment);
                        Fragment fragment2 = fragment.mTarget;
                        if (fragment2 != null) {
                            i2 = fragment2.mIndex;
                        } else {
                            i2 = -1;
                        }
                        fragment.mTargetIndex = i2;
                        if (DEBUG) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("retainNonConfig: keeping retained ");
                            stringBuilder.append(fragment);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                    }
                    FragmentManagerImpl fragmentManagerImpl = fragment.mChildFragmentManager;
                    if (fragmentManagerImpl != null) {
                        fragmentManagerImpl.saveNonConfig();
                        obj = fragment.mChildFragmentManager.mSavedNonConfig;
                    } else {
                        FragmentManagerNonConfig fragmentManagerNonConfig = fragment.mChildNonConfig;
                    }
                    if (list2 == null && obj != null) {
                        list2 = new ArrayList(this.mActive.size());
                        for (i2 = 0; i2 < i; i2++) {
                            list2.add(null);
                        }
                    }
                    if (list2 != null) {
                        list2.add(obj);
                    }
                    if (list == null && fragment.mViewModelStore != null) {
                        list = new ArrayList(this.mActive.size());
                        for (i2 = 0; i2 < i; i2++) {
                            list.add(null);
                        }
                    }
                    if (list != null) {
                        list.add(fragment.mViewModelStore);
                    }
                }
            }
        } else {
            list = null;
            list2 = null;
            list3 = null;
        }
        if (list3 == null && list2 == null && list == null) {
            this.mSavedNonConfig = null;
        } else {
            this.mSavedNonConfig = new FragmentManagerNonConfig(list3, list2, list);
        }
    }

    private final void scheduleCommit() {
        Object obj = 1;
        synchronized (this) {
            Object obj2;
            ArrayList arrayList = this.mPostponedTransactions;
            if (arrayList == null) {
                obj2 = null;
            } else if (arrayList.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = 1;
            }
            ArrayList arrayList2 = this.mPendingActions;
            if (arrayList2 == null) {
                obj = null;
            } else if (arrayList2.size() != 1) {
                obj = null;
            }
            if (!(obj2 == null && r0 == null)) {
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                this.mHost.getHandler().post(this.mExecCommit);
            }
        }
    }

    public final void setBackStackIndex(int i, BackStackRecord backStackRecord) {
        synchronized (this) {
            if (this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList();
            }
            int size = this.mBackStackIndices.size();
            StringBuilder stringBuilder;
            if (i < size) {
                if (DEBUG) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Setting back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" to ");
                    stringBuilder.append(backStackRecord);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.mBackStackIndices.set(i, backStackRecord);
            } else {
                while (size < i) {
                    this.mBackStackIndices.add(null);
                    if (this.mAvailBackStackIndices == null) {
                        this.mAvailBackStackIndices = new ArrayList();
                    }
                    if (DEBUG) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Adding available back stack index ");
                        stringBuilder2.append(size);
                        Log.v("FragmentManager", stringBuilder2.toString());
                    }
                    this.mAvailBackStackIndices.add(Integer.valueOf(size));
                    size++;
                }
                if (DEBUG) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Adding back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" with ");
                    stringBuilder.append(backStackRecord);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.mBackStackIndices.add(backStackRecord);
            }
        }
    }

    private static void setHWLayerAnimListenerIfAlpha(View view, AnimationOrAnimator animationOrAnimator) {
        if (view != null && animationOrAnimator != null && shouldRunOnHWLayer(view, animationOrAnimator)) {
            Animator animator = animationOrAnimator.animator;
            if (animator != null) {
                animator.addListener(new AnimatorOnHWLayerIfNeededListener(view));
                return;
            }
            AnimationListener animationListener = getAnimationListener(animationOrAnimator.animation);
            view.setLayerType(2, null);
            animationOrAnimator.animation.setAnimationListener(new AnimateOnHWLayerIfNeededListener(view, animationListener));
        }
    }

    public final void setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment == null || (this.mActive.get(fragment.mIndex) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            this.mPrimaryNav = fragment;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(fragment);
        stringBuilder.append(" is not an active fragment of FragmentManager ");
        stringBuilder.append(this);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static void setRetaining(FragmentManagerNonConfig fragmentManagerNonConfig) {
        if (fragmentManagerNonConfig != null) {
            List<Fragment> fragments = fragmentManagerNonConfig.getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    fragment.mRetaining = true;
                }
            }
            List<FragmentManagerNonConfig> childNonConfigs = fragmentManagerNonConfig.getChildNonConfigs();
            if (childNonConfigs != null) {
                for (FragmentManagerNonConfig retaining : childNonConfigs) {
                    setRetaining(retaining);
                }
            }
        }
    }

    static boolean shouldRunOnHWLayer(View view, AnimationOrAnimator animationOrAnimator) {
        if (view != null && animationOrAnimator != null && view.getLayerType() == 0 && jm.m4587u(view) && modifiesAlpha(animationOrAnimator)) {
            return true;
        }
        return false;
    }

    public final void showFragment(Fragment fragment) {
        if (DEBUG) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged ^= 1;
        }
    }

    final void startPendingDeferredFragments() {
        if (this.mActive != null) {
            for (int i = 0; i < this.mActive.size(); i++) {
                Fragment fragment = (Fragment) this.mActive.valueAt(i);
                if (fragment != null) {
                    performPendingDeferredStart(fragment);
                }
            }
        }
    }

    private final void throwException(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new im("FragmentManager"));
        FragmentHostCallback fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.onDump("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                dump("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        Object obj = this.mParent;
        if (obj != null) {
            ha.m2972a(obj, stringBuilder);
        } else {
            ha.m2972a(this.mHost, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public static int transitToStyleIndex(int i, boolean z) {
        switch (i) {
            case FragmentTransaction.TRANSIT_FRAGMENT_OPEN /*4097*/:
                if (z) {
                    return 1;
                }
                return 2;
            case FragmentTransaction.TRANSIT_FRAGMENT_FADE /*4099*/:
                if (z) {
                    return 5;
                }
                return 6;
            case FragmentTransaction.TRANSIT_FRAGMENT_CLOSE /*8194*/:
                if (z) {
                    return 3;
                }
                return 4;
            default:
                return -1;
        }
    }

    public final void unregisterFragmentLifecycleCallbacks(FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        synchronized (this.mLifecycleCallbacks) {
            int size = this.mLifecycleCallbacks.size();
            for (int i = 0; i < size; i++) {
                if (((FragmentLifecycleCallbacksHolder) this.mLifecycleCallbacks.get(i)).mCallback == fragmentLifecycleCallbacks) {
                    this.mLifecycleCallbacks.remove(i);
                    break;
                }
            }
        }
    }
}
