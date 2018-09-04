package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;
import java.lang.reflect.Field;

/* compiled from: PG */
/* renamed from: sh */
class sh extends ListView {
    /* renamed from: a */
    public boolean f9201a;
    /* renamed from: b */
    public sj f9202b;
    /* renamed from: c */
    private final Rect f9203c = new Rect();
    /* renamed from: d */
    private int f9204d = 0;
    /* renamed from: e */
    private int f9205e = 0;
    /* renamed from: f */
    private int f9206f = 0;
    /* renamed from: g */
    private int f9207g = 0;
    /* renamed from: h */
    private int f9208h;
    /* renamed from: i */
    private Field f9209i;
    /* renamed from: j */
    private si f9210j;
    /* renamed from: k */
    private boolean f9211k;
    /* renamed from: l */
    private boolean f9212l;
    /* renamed from: m */
    private lj f9213m;

    sh(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f9211k = z;
        setCacheColorHint(0);
        try {
            this.f9209i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f9209i.setAccessible(true);
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        if (!this.f9203c.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f9203c);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    protected void drawableStateChanged() {
        if (this.f9202b == null) {
            super.drawableStateChanged();
            m5808a(true);
            m5807a();
        }
    }

    public boolean hasFocus() {
        return this.f9211k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f9211k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f9211k || super.isFocused();
    }

    public boolean isInTouchMode() {
        if (this.f9211k) {
            if (!this.f9201a) {
            }
            return true;
        }
        if (!super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int mo2475a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0) {
            dividerHeight = 0;
        } else if (divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        View view = null;
        listPaddingBottom = i6;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                i6 = itemViewType;
            } else {
                i6 = i8;
            }
            if (itemViewType != i8) {
                view = null;
            }
            View view2 = adapter.getView(i9, view, this);
            LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                listPaddingTop = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                listPaddingTop = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(i, listPaddingTop);
            view2.forceLayout();
            if (i9 > 0) {
                listPaddingTop = listPaddingBottom + dividerHeight;
            } else {
                listPaddingTop = listPaddingBottom;
            }
            listPaddingBottom = view2.getMeasuredHeight() + listPaddingTop;
            if (listPaddingBottom < i4) {
                listPaddingTop = i5 >= 0 ? i9 >= i5 ? listPaddingBottom : i7 : i7;
                i9++;
                i8 = i6;
                i7 = listPaddingTop;
                view = view2;
            } else if (i5 < 0 || i9 <= i5 || i7 <= 0 || listPaddingBottom == i4) {
                return i4;
            } else {
                return i7;
            }
        }
        return listPaddingBottom;
    }

    protected void onDetachedFromWindow() {
        this.f9202b = null;
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public boolean mo2476a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        Object obj;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        switch (actionMasked) {
            case 1:
                z = false;
                break;
            case 2:
                z = true;
                break;
            case 3:
                z2 = false;
                obj = null;
                break;
            default:
                z2 = true;
                obj = null;
                break;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            findPointerIndex = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, findPointerIndex);
            int i2;
            if (pointToPosition != -1) {
                Object obj2;
                View childAt2 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = (float) x;
                float f2 = (float) findPointerIndex;
                this.f9212l = true;
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                i2 = this.f9208h;
                if (i2 != -1) {
                    childAt = getChildAt(i2 - getFirstVisiblePosition());
                    if (!(childAt == null || childAt == childAt2 || !childAt.isPressed())) {
                        childAt.setPressed(false);
                    }
                }
                this.f9208h = pointToPosition;
                childAt2.drawableHotspotChanged(f - ((float) childAt2.getLeft()), f2 - ((float) childAt2.getTop()));
                if (!childAt2.isPressed()) {
                    childAt2.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector == null) {
                    obj2 = null;
                } else if (pointToPosition != -1) {
                    findPointerIndex = 1;
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.f9203c;
                rect.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                rect.left -= this.f9204d;
                rect.top -= this.f9205e;
                rect.right += this.f9206f;
                rect.bottom += this.f9207g;
                try {
                    z = this.f9209i.getBoolean(this);
                    if (childAt2.isEnabled() != z) {
                        this.f9209i.set(this, Boolean.valueOf(z ^ 1));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (Throwable e) {
                    kqg.f8420a.mo2210b(e);
                }
                if (obj2 != null) {
                    rect = this.f9203c;
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    if (getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    selector.setVisible(z, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (!(selector2 == null || pointToPosition == -1)) {
                    selector2.setHotspot(f, f2);
                }
                m5808a(false);
                refreshDrawableState();
                if (actionMasked != 1) {
                    z2 = true;
                    obj = null;
                } else {
                    performItemClick(childAt2, pointToPosition, getItemIdAtPosition(pointToPosition));
                    z2 = true;
                    obj = null;
                }
            } else {
                z2 = z;
                i2 = 1;
            }
        } else {
            z2 = false;
            obj = null;
        }
        if (!(z2 && r0 == null)) {
            this.f9212l = false;
            setPressed(false);
            drawableStateChanged();
            childAt = getChildAt(this.f9208h - getFirstVisiblePosition());
            if (childAt != null) {
                childAt.setPressed(false);
            }
        }
        if (z2) {
            if (this.f9213m == null) {
                this.f9213m = new lj(this);
            }
            this.f9213m.m5367a(true);
            this.f9213m.onTouch(this, motionEvent);
        } else {
            lj ljVar = this.f9213m;
            if (ljVar != null) {
                ljVar.m5367a(false);
            }
        }
        return z2;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f9202b == null) {
            this.f9202b = new sj(this);
            Runnable runnable = this.f9202b;
            runnable.f9214a.post(runnable);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            actionMasked = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(actionMasked == -1 || actionMasked == getSelectedItemPosition())) {
                View childAt = getChildAt(actionMasked - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(actionMasked, childAt.getTop() - getTop());
                }
                m5807a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f9208h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        Runnable runnable = this.f9202b;
        if (runnable != null) {
            sh shVar = runnable.f9214a;
            shVar.f9202b = null;
            shVar.removeCallbacks(runnable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSelector(Drawable drawable) {
        si siVar;
        if (drawable != null) {
            siVar = new si(drawable);
        } else {
            siVar = null;
        }
        this.f9210j = siVar;
        super.setSelector(this.f9210j);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9204d = rect.left;
        this.f9205e = rect.top;
        this.f9206f = rect.right;
        this.f9207g = rect.bottom;
    }

    /* renamed from: a */
    private final void m5808a(boolean z) {
        si siVar = this.f9210j;
        if (siVar != null) {
            siVar.f19563a = z;
        }
    }

    /* renamed from: a */
    private final void m5807a() {
        Drawable selector = getSelector();
        if (selector != null && this.f9212l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
