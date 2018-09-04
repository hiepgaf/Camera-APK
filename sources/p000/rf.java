package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: rf */
public final class rf extends Spinner {
    /* renamed from: d */
    private static final int[] f9102d = new int[]{16843505};
    /* renamed from: a */
    public ri f9103a;
    /* renamed from: b */
    public int f9104b;
    /* renamed from: c */
    public final Rect f9105c;
    /* renamed from: e */
    private final ql f9106e;
    /* renamed from: f */
    private final Context f9107f;
    /* renamed from: g */
    private sp f9108g;
    /* renamed from: h */
    private SpinnerAdapter f9109h;
    /* renamed from: i */
    private final boolean f9110i;

    public rf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private rf(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (int) R.attr.spinnerStyle);
    }

    private rf(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, R.attr.spinnerStyle, -1);
    }

    private rf(Context context, AttributeSet attributeSet, int i, int i2) {
        Throwable e;
        ri riVar;
        vk a;
        CharSequence[] textArray;
        SpinnerAdapter arrayAdapter;
        SpinnerAdapter spinnerAdapter;
        TypedArray typedArray;
        Throwable th;
        TypedArray typedArray2;
        super(context, attributeSet, i);
        this.f9105c = new Rect();
        vk a2 = vk.m6047a(context, attributeSet, ni.bN, i, 0);
        this.f9106e = new ql(this);
        int g = a2.m6061g(ni.bR, 0);
        if (g != 0) {
            this.f9107f = new nq(context, g);
        } else {
            this.f9107f = null;
        }
        if (this.f9107f != null) {
            TypedArray obtainStyledAttributes;
            try {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9102d, i, 0);
                try {
                    if (obtainStyledAttributes.hasValue(0)) {
                        i2 = obtainStyledAttributes.getInt(0, 0);
                    }
                    if (obtainStyledAttributes != null) {
                        obtainStyledAttributes.recycle();
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        if (obtainStyledAttributes != null) {
                            obtainStyledAttributes.recycle();
                        }
                        if (i2 == 1) {
                            riVar = new ri(this, this.f9107f, attributeSet, i);
                            a = vk.m6047a(this.f9107f, attributeSet, ni.bN, i, 0);
                            this.f9104b = a.m6059f(ni.bO, -2);
                            riVar.m14412a(a.m6052b(ni.bP));
                            riVar.f22554a = a2.m6056d(ni.bQ);
                            a.f9419b.recycle();
                            this.f9103a = riVar;
                            this.f9108g = new rg(this, this, riVar);
                        }
                        textArray = a2.f9419b.getTextArray(0);
                        if (textArray != null) {
                            arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
                            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                            setAdapter(arrayAdapter);
                        }
                        a2.f9419b.recycle();
                        this.f9110i = true;
                        spinnerAdapter = this.f9109h;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f9109h = null;
                        }
                        this.f9106e.m5715a(attributeSet, i);
                    } catch (Throwable e3) {
                        typedArray = obtainStyledAttributes;
                        th = e3;
                        typedArray2 = typedArray;
                        if (typedArray2 != null) {
                            typedArray2.recycle();
                        }
                        throw th;
                    }
                } catch (Throwable e32) {
                    typedArray = obtainStyledAttributes;
                    th = e32;
                    typedArray2 = typedArray;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e32 = e4;
                obtainStyledAttributes = null;
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e32);
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                if (i2 == 1) {
                    riVar = new ri(this, this.f9107f, attributeSet, i);
                    a = vk.m6047a(this.f9107f, attributeSet, ni.bN, i, 0);
                    this.f9104b = a.m6059f(ni.bO, -2);
                    riVar.m14412a(a.m6052b(ni.bP));
                    riVar.f22554a = a2.m6056d(ni.bQ);
                    a.f9419b.recycle();
                    this.f9103a = riVar;
                    this.f9108g = new rg(this, this, riVar);
                }
                textArray = a2.f9419b.getTextArray(0);
                if (textArray != null) {
                    arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
                    arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    setAdapter(arrayAdapter);
                }
                a2.f9419b.recycle();
                this.f9110i = true;
                spinnerAdapter = this.f9109h;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f9109h = null;
                }
                this.f9106e.m5715a(attributeSet, i);
            } catch (Throwable e322) {
                th = e322;
                typedArray2 = null;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
            if (i2 == 1) {
                riVar = new ri(this, this.f9107f, attributeSet, i);
                a = vk.m6047a(this.f9107f, attributeSet, ni.bN, i, 0);
                this.f9104b = a.m6059f(ni.bO, -2);
                riVar.m14412a(a.m6052b(ni.bP));
                riVar.f22554a = a2.m6056d(ni.bQ);
                a.f9419b.recycle();
                this.f9103a = riVar;
                this.f9108g = new rg(this, this, riVar);
            }
        }
        textArray = a2.f9419b.getTextArray(0);
        if (textArray != null) {
            arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            setAdapter(arrayAdapter);
        }
        a2.f9419b.recycle();
        this.f9110i = true;
        spinnerAdapter = this.f9109h;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f9109h = null;
        }
        this.f9106e.m5715a(attributeSet, i);
    }

    /* renamed from: a */
    final int m5748a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        int i = 0;
        max = 0;
        View view = null;
        while (max2 < min) {
            int i2;
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                i2 = itemViewType;
            } else {
                i2 = i;
            }
            if (itemViewType != i) {
                view = null;
            }
            View view2 = spinnerAdapter.getView(max2, view, this);
            if (view2.getLayoutParams() == null) {
                view2.setLayoutParams(new LayoutParams(-2, -2));
            }
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            max = Math.max(max, view2.getMeasuredWidth());
            max2++;
            i = i2;
            view = view2;
        }
        if (drawable == null) {
            return max;
        }
        drawable.getPadding(this.f9105c);
        Rect rect = this.f9105c;
        return (rect.right + rect.left) + max;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ql qlVar = this.f9106e;
        if (qlVar != null) {
            qlVar.m5713a();
        }
    }

    public final int getDropDownHorizontalOffset() {
        tg tgVar = this.f9103a;
        if (tgVar == null) {
            return super.getDropDownHorizontalOffset();
        }
        return tgVar.f19618g;
    }

    public final int getDropDownVerticalOffset() {
        ri riVar = this.f9103a;
        if (riVar != null) {
            return riVar.m14421g();
        }
        return super.getDropDownVerticalOffset();
    }

    public final int getDropDownWidth() {
        if (this.f9103a != null) {
            return this.f9104b;
        }
        return super.getDropDownWidth();
    }

    public final Drawable getPopupBackground() {
        tg tgVar = this.f9103a;
        if (tgVar == null) {
            return super.getPopupBackground();
        }
        return tgVar.f19629r.getBackground();
    }

    public final Context getPopupContext() {
        if (this.f9103a != null) {
            return this.f9107f;
        }
        return super.getPopupContext();
    }

    public final CharSequence getPrompt() {
        ri riVar = this.f9103a;
        return riVar == null ? super.getPrompt() : riVar.f22554a;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tg tgVar = this.f9103a;
        if (tgVar != null && tgVar.f19629r.isShowing()) {
            this.f9103a.mo2471c();
        }
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9103a != null && MeasureSpec.getMode(i) == kvl.UNSET_ENUM_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m5748a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sp spVar = this.f9108g;
        if (spVar == null || !spVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        tg tgVar = this.f9103a;
        if (tgVar == null) {
            return super.performClick();
        }
        if (!tgVar.f19629r.isShowing()) {
            this.f9103a.mo2474f();
        }
        return true;
    }

    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f9110i) {
            super.setAdapter(spinnerAdapter);
            if (this.f9103a != null) {
                Context context = this.f9107f;
                if (context == null) {
                    context = getContext();
                }
                this.f9103a.mo3329a(new rh(spinnerAdapter, context.getTheme()));
                return;
            }
            return;
        }
        this.f9109h = spinnerAdapter;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ql qlVar = this.f9106e;
        if (qlVar != null) {
            qlVar.m5716b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ql qlVar = this.f9106e;
        if (qlVar != null) {
            qlVar.m5714a(i);
        }
    }

    public final void setDropDownHorizontalOffset(int i) {
        tg tgVar = this.f9103a;
        if (tgVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            tgVar.f19618g = i;
        }
    }

    public final void setDropDownVerticalOffset(int i) {
        ri riVar = this.f9103a;
        if (riVar != null) {
            riVar.m14416b(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public final void setDropDownWidth(int i) {
        if (this.f9103a != null) {
            this.f9104b = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        ri riVar = this.f9103a;
        if (riVar != null) {
            riVar.m14412a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(nj.m5620b(getPopupContext(), i));
    }

    public final void setPrompt(CharSequence charSequence) {
        ri riVar = this.f9103a;
        if (riVar == null) {
            super.setPrompt(charSequence);
        } else {
            riVar.f22554a = charSequence;
        }
    }
}
