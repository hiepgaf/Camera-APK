package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;
import p000.ge;
import p000.jm;
import p000.kz;
import p000.ld;

@Deprecated
/* compiled from: PG */
public class ActionBarDrawerToggle implements ld {
    public static final int ID_HOME = 16908332;
    public static final String TAG = "ActionBarDrawerToggle";
    public static final int[] THEME_ATTRS = new int[]{16843531};
    public static final float TOGGLE_DRAWABLE_OFFSET = 0.33333334f;
    public final Activity mActivity;
    public final Delegate mActivityImpl;
    public final int mCloseDrawerContentDescRes;
    public Drawable mDrawerImage;
    public final int mDrawerImageResource;
    public boolean mDrawerIndicatorEnabled;
    public final kz mDrawerLayout;
    public boolean mHasCustomUpIndicator;
    public Drawable mHomeAsUpIndicator;
    public final int mOpenDrawerContentDescRes;
    public SetIndicatorInfo mSetIndicatorInfo;
    public SlideDrawable mSlider;

    @Deprecated
    /* compiled from: PG */
    public interface Delegate {
        Drawable getThemeUpIndicator();

        void setActionBarDescription(int i);

        void setActionBarUpIndicator(Drawable drawable, int i);
    }

    @Deprecated
    /* compiled from: PG */
    public interface DelegateProvider {
        Delegate getDrawerToggleDelegate();
    }

    /* compiled from: PG */
    class SetIndicatorInfo {
        public Method mSetHomeActionContentDescription;
        public Method mSetHomeAsUpIndicator;
        public ImageView mUpIndicatorView;

        SetIndicatorInfo(Activity activity) {
            try {
                this.mSetHomeAsUpIndicator = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.mSetHomeActionContentDescription = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException e) {
                View findViewById = activity.findViewById(ActionBarDrawerToggle.ID_HOME);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        findViewById = viewGroup.getChildAt(1);
                        if (childAt.getId() != ActionBarDrawerToggle.ID_HOME) {
                            findViewById = childAt;
                        }
                        if (findViewById instanceof ImageView) {
                            this.mUpIndicatorView = (ImageView) findViewById;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: PG */
    class SlideDrawable extends InsetDrawable implements Callback {
        public final boolean mHasMirroring = true;
        public float mOffset;
        public float mPosition;
        public final Rect mTmpRect = new Rect();

        SlideDrawable(Drawable drawable) {
            super(drawable, 0);
        }

        public void draw(Canvas canvas) {
            int i;
            copyBounds(this.mTmpRect);
            canvas.save();
            int j = jm.m4576j(ActionBarDrawerToggle.this.mActivity.getWindow().getDecorView());
            if (j == 1) {
                i = -1;
            } else {
                i = 1;
            }
            float width = (float) this.mTmpRect.width();
            canvas.translate(((float) i) * (((-this.mOffset) * width) * this.mPosition), 0.0f);
            if (j == 1 && !this.mHasMirroring) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }

        public float getPosition() {
            return this.mPosition;
        }

        public void setOffset(float f) {
            this.mOffset = f;
            invalidateSelf();
        }

        public void setPosition(float f) {
            this.mPosition = f;
            invalidateSelf();
        }
    }

    public ActionBarDrawerToggle(Activity activity, kz kzVar, int i, int i2, int i3) {
        this(activity, kzVar, assumeMaterial(activity) ^ 1, i, i2, i3);
    }

    public ActionBarDrawerToggle(Activity activity, kz kzVar, boolean z, int i, int i2, int i3) {
        float f;
        this.mDrawerIndicatorEnabled = true;
        this.mActivity = activity;
        if (activity instanceof DelegateProvider) {
            this.mActivityImpl = ((DelegateProvider) activity).getDrawerToggleDelegate();
        } else {
            this.mActivityImpl = null;
        }
        this.mDrawerLayout = kzVar;
        this.mDrawerImageResource = i;
        this.mOpenDrawerContentDescRes = i2;
        this.mCloseDrawerContentDescRes = i3;
        this.mHomeAsUpIndicator = getThemeUpIndicator();
        this.mDrawerImage = ge.getDrawable(activity, i);
        this.mSlider = new SlideDrawable(this.mDrawerImage);
        SlideDrawable slideDrawable = this.mSlider;
        if (z) {
            f = 0.33333334f;
        } else {
            f = 0.0f;
        }
        slideDrawable.setOffset(f);
    }

    private static boolean assumeMaterial(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    private Drawable getThemeUpIndicator() {
        Delegate delegate = this.mActivityImpl;
        if (delegate != null) {
            return delegate.getThemeUpIndicator();
        }
        Context themedContext;
        ActionBar actionBar = this.mActivity.getActionBar();
        if (actionBar != null) {
            themedContext = actionBar.getThemedContext();
        } else {
            themedContext = this.mActivity;
        }
        TypedArray obtainStyledAttributes = themedContext.obtainStyledAttributes(null, THEME_ATTRS, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.mDrawerIndicatorEnabled;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mHasCustomUpIndicator) {
            this.mHomeAsUpIndicator = getThemeUpIndicator();
        }
        this.mDrawerImage = ge.getDrawable(this.mActivity, this.mDrawerImageResource);
        syncState();
    }

    public void onDrawerClosed(View view) {
        this.mSlider.setPosition(0.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mOpenDrawerContentDescRes);
        }
    }

    public void onDrawerOpened(View view) {
        this.mSlider.setPosition(1.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mCloseDrawerContentDescRes);
        }
    }

    public void onDrawerSlide(View view, float f) {
        float position = this.mSlider.getPosition();
        if (f > 0.5f) {
            float max = Math.max(0.0f, -0.5f + f);
            position = Math.max(position, max + max);
        } else {
            position = Math.min(position, f + f);
        }
        this.mSlider.setPosition(position);
    }

    public void onDrawerStateChanged(int i) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z = false;
        if (menuItem == null || menuItem.getItemId() != ID_HOME || !this.mDrawerIndicatorEnabled) {
            return false;
        }
        View a = this.mDrawerLayout.m5493a(8388611);
        if (a != null) {
            z = kz.m5489g(a);
        }
        if (z) {
            this.mDrawerLayout.m5494a();
        } else {
            this.mDrawerLayout.m5504d();
        }
        return true;
    }

    private void setActionBarDescription(int i) {
        Delegate delegate = this.mActivityImpl;
        if (delegate != null) {
            delegate.setActionBarDescription(i);
            return;
        }
        ActionBar actionBar = this.mActivity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    private void setActionBarUpIndicator(Drawable drawable, int i) {
        Delegate delegate = this.mActivityImpl;
        if (delegate != null) {
            delegate.setActionBarUpIndicator(drawable, i);
            return;
        }
        ActionBar actionBar = this.mActivity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        if (z != this.mDrawerIndicatorEnabled) {
            if (z) {
                int i;
                Drawable drawable = this.mSlider;
                if (this.mDrawerLayout.m5503c()) {
                    i = this.mCloseDrawerContentDescRes;
                } else {
                    i = this.mOpenDrawerContentDescRes;
                }
                setActionBarUpIndicator(drawable, i);
            } else {
                setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
            }
            this.mDrawerIndicatorEnabled = z;
        }
    }

    public void setHomeAsUpIndicator(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = ge.getDrawable(this.mActivity, i);
        } else {
            drawable = null;
        }
        setHomeAsUpIndicator(drawable);
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        if (drawable == null) {
            this.mHomeAsUpIndicator = getThemeUpIndicator();
            this.mHasCustomUpIndicator = false;
        } else {
            this.mHomeAsUpIndicator = drawable;
            this.mHasCustomUpIndicator = true;
        }
        if (!this.mDrawerIndicatorEnabled) {
            setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
        }
    }

    public void syncState() {
        if (this.mDrawerLayout.m5503c()) {
            this.mSlider.setPosition(1.0f);
        } else {
            this.mSlider.setPosition(0.0f);
        }
        if (this.mDrawerIndicatorEnabled) {
            int i;
            Drawable drawable = this.mSlider;
            if (this.mDrawerLayout.m5503c()) {
                i = this.mCloseDrawerContentDescRes;
            } else {
                i = this.mOpenDrawerContentDescRes;
            }
            setActionBarUpIndicator(drawable, i);
        }
    }
}
