package android.support.design.internal;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.DepthmapTask;
import p000.cl;
import p000.cm;
import p000.jd;
import p000.jm;
import p000.ot;
import p000.ph;
import p000.sz;

/* compiled from: PG */
public class NavigationMenuItemView extends cl implements ph {
    /* renamed from: b */
    private static final int[] f19793b = new int[]{16842912};
    /* renamed from: a */
    public boolean f19794a;
    /* renamed from: c */
    private final int f19795c;
    /* renamed from: h */
    private final CheckedTextView f19796h;
    /* renamed from: i */
    private FrameLayout f19797i;
    /* renamed from: j */
    private ot f19798j;
    /* renamed from: k */
    private final jd f19799k;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19799k = new cm(this);
        m5828c(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        this.f19795c = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        this.f19796h = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f19796h.setDuplicateParentStateEnabled(true);
        jm.m4559a(this.f19796h, this.f19799k);
    }

    /* renamed from: a */
    public final ot mo280a() {
        return this.f19798j;
    }

    /* renamed from: a */
    public final void mo281a(ot otVar) {
        int i;
        Drawable stateListDrawable;
        this.f19798j = otVar;
        if (otVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f19793b, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            jm.m4555a((View) this, stateListDrawable);
        }
        boolean isCheckable = otVar.isCheckable();
        refreshDrawableState();
        if (this.f19794a != isCheckable) {
            this.f19794a = isCheckable;
            jd.m4411a(this.f19796h, (int) DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
        }
        isCheckable = otVar.isChecked();
        refreshDrawableState();
        this.f19796h.setChecked(isCheckable);
        setEnabled(otVar.isEnabled());
        this.f19796h.setText(otVar.getTitle());
        stateListDrawable = otVar.getIcon();
        if (stateListDrawable != null) {
            int i2 = this.f19795c;
            stateListDrawable.setBounds(0, 0, i2, i2);
        }
        this.f19796h.setCompoundDrawablesRelative(stateListDrawable, null, null, null);
        View actionView = otVar.getActionView();
        if (actionView != null) {
            if (this.f19797i == null) {
                this.f19797i = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f19797i.removeAllViews();
            this.f19797i.addView(actionView);
        }
        setContentDescription(otVar.getContentDescription());
        setTooltipText(otVar.getTooltipText());
        if (this.f19798j.getTitle() != null) {
            isCheckable = false;
        } else if (this.f19798j.getIcon() != null) {
            isCheckable = false;
        } else if (this.f19798j.getActionView() != null) {
            isCheckable = true;
        } else {
            isCheckable = false;
        }
        FrameLayout frameLayout;
        if (isCheckable) {
            this.f19796h.setVisibility(8);
            frameLayout = this.f19797i;
            if (frameLayout != null) {
                sz szVar = (sz) frameLayout.getLayoutParams();
                szVar.width = -1;
                this.f19797i.setLayoutParams(szVar);
                return;
            }
            return;
        }
        this.f19796h.setVisibility(0);
        frameLayout = this.f19797i;
        if (frameLayout != null) {
            szVar = (sz) frameLayout.getLayoutParams();
            szVar.width = -2;
            this.f19797i.setLayoutParams(szVar);
        }
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        ot otVar = this.f19798j;
        if (otVar != null && otVar.isCheckable() && this.f19798j.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f19793b);
        }
        return onCreateDrawableState;
    }

    /* renamed from: b */
    public final boolean mo282b() {
        return false;
    }
}
