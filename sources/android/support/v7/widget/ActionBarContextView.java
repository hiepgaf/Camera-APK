package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.jm;
import p000.kvl;
import p000.ni;
import p000.nn;
import p000.op;
import p000.pp;
import p000.ps;
import p000.py;
import p000.vk;
import p000.vx;

/* compiled from: PG */
public class ActionBarContextView extends pp {
    /* renamed from: f */
    public CharSequence f10033f;
    /* renamed from: g */
    public CharSequence f10034g;
    /* renamed from: h */
    public View f10035h;
    /* renamed from: i */
    public boolean f10036i;
    /* renamed from: j */
    private View f10037j;
    /* renamed from: k */
    private LinearLayout f10038k;
    /* renamed from: l */
    private TextView f10039l;
    /* renamed from: m */
    private TextView f10040m;
    /* renamed from: n */
    private int f10041n;
    /* renamed from: o */
    private int f10042o;
    /* renamed from: p */
    private int f10043p;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vk a = vk.m6047a(context, attributeSet, ni.f8922x, i, 0);
        jm.m4555a((View) this, a.m6052b(ni.f8923y));
        this.f10041n = a.m6061g(ni.f8875C, 0);
        this.f10042o = a.m6061g(ni.f8874B, 0);
        this.d = a.m6059f(ni.f8873A, 0);
        this.f10043p = a.m6061g(ni.f8924z, R.layout.abc_action_mode_close_item_material);
        a.f9419b.recycle();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    public final void m6790a(nn nnVar) {
        View view = this.f10035h;
        if (view == null) {
            this.f10035h = LayoutInflater.from(getContext()).inflate(this.f10043p, this, false);
            addView(this.f10035h);
        } else if (view.getParent() == null) {
            addView(this.f10035h);
        }
        this.f10035h.findViewById(R.id.action_mode_close_button).setOnClickListener(new ps(nnVar));
        op opVar = (op) nnVar.mo2404d();
        if (this.c != null) {
            this.c.m16765b();
        }
        this.c = new py(getContext());
        py pyVar = this.c;
        pyVar.f22540g = true;
        pyVar.f22541h = true;
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        opVar.m14247a(this.c, this.a);
        this.b = (ActionMenuView) this.c.mo3325a((ViewGroup) this);
        jm.m4555a(this.b, null);
        addView(this.b, layoutParams);
    }

    /* renamed from: c */
    private final void m6786c() {
        int i;
        int i2 = 0;
        if (this.f10038k == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            this.f10038k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f10039l = (TextView) this.f10038k.findViewById(R.id.action_bar_title);
            this.f10040m = (TextView) this.f10038k.findViewById(R.id.action_bar_subtitle);
            if (this.f10041n != 0) {
                this.f10039l.setTextAppearance(getContext(), this.f10041n);
            }
            if (this.f10042o != 0) {
                this.f10040m.setTextAppearance(getContext(), this.f10042o);
            }
        }
        this.f10039l.setText(this.f10033f);
        this.f10040m.setText(this.f10034g);
        int isEmpty = TextUtils.isEmpty(this.f10033f) ^ 1;
        boolean isEmpty2 = TextUtils.isEmpty(this.f10034g);
        int i3 = isEmpty2 ^ 1;
        TextView textView = this.f10040m;
        if (isEmpty2) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.f10038k;
        if (isEmpty == 0 && i3 == 0) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        if (this.f10038k.getParent() == null) {
            addView(this.f10038k);
        }
    }

    /* renamed from: b */
    public final void m6793b() {
        removeAllViews();
        this.f10037j = null;
        this.b = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            this.c.m16766c();
            this.c.m16768d();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f10033f);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingRight;
        int i5;
        boolean a = vx.m6076a(this);
        if (a) {
            paddingRight = (i3 - i) - getPaddingRight();
        } else {
            paddingRight = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f10035h;
        if (view == null) {
            i5 = paddingRight;
        } else if (view.getVisibility() != 8) {
            int i6;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f10035h.getLayoutParams();
            if (a) {
                i6 = marginLayoutParams.rightMargin;
            } else {
                i6 = marginLayoutParams.leftMargin;
            }
            if (a) {
                i5 = marginLayoutParams.leftMargin;
            } else {
                i5 = marginLayoutParams.rightMargin;
            }
            paddingRight = pp.m5691a(paddingRight, i6, a);
            i5 = pp.m5691a(paddingRight + pp.m5693a(this.f10035h, paddingRight, paddingTop, paddingTop2, a), i5, a);
        } else {
            i5 = paddingRight;
        }
        LinearLayout linearLayout = this.f10038k;
        if (!(linearLayout == null || this.f10037j != null || linearLayout.getVisibility() == 8)) {
            i5 += pp.m5693a(this.f10038k, i5, paddingTop, paddingTop2, a);
        }
        View view2 = this.f10037j;
        if (view2 != null) {
            pp.m5693a(view2, i5, paddingTop, paddingTop2, a);
        }
        if (a) {
            i5 = getPaddingLeft();
        } else {
            i5 = (i3 - i) - getPaddingRight();
        }
        if (this.b != null) {
            pp.m5693a(this.b, i5, paddingTop, paddingTop2, a ^ 1);
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        StringBuilder stringBuilder;
        if (MeasureSpec.getMode(i) != 1073741824) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used ");
            stringBuilder.append("with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (MeasureSpec.getMode(i2) == 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used ");
            stringBuilder.append("with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(stringBuilder.toString());
        } else {
            int i4;
            int a;
            int size = MeasureSpec.getSize(i);
            if (this.d > 0) {
                i4 = this.d;
            } else {
                i4 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, kvl.UNSET_ENUM_VALUE);
            View view = this.f10035h;
            if (view != null) {
                a = pp.m5692a(view, paddingLeft, makeMeasureSpec);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f10035h.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.b == null) {
                a = paddingLeft;
            } else if (this.b.getParent() == this) {
                a = pp.m5692a(this.b, paddingLeft, makeMeasureSpec);
            } else {
                a = paddingLeft;
            }
            View view2 = this.f10038k;
            if (view2 != null && this.f10037j == null) {
                if (this.f10036i) {
                    this.f10038k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    makeMeasureSpec = this.f10038k.getMeasuredWidth();
                    if (makeMeasureSpec <= a) {
                        paddingLeft = a - makeMeasureSpec;
                    } else {
                        paddingLeft = a;
                    }
                    LinearLayout linearLayout = this.f10038k;
                    if (makeMeasureSpec <= a) {
                        a = 0;
                    } else {
                        a = 8;
                    }
                    linearLayout.setVisibility(a);
                    a = paddingLeft;
                } else {
                    a = pp.m5692a(view2, a, makeMeasureSpec);
                }
            }
            view2 = this.f10037j;
            if (view2 != null) {
                int min;
                LayoutParams layoutParams = view2.getLayoutParams();
                makeMeasureSpec = layoutParams.width != -2 ? 1073741824 : kvl.UNSET_ENUM_VALUE;
                if (layoutParams.width >= 0) {
                    min = Math.min(layoutParams.width, a);
                } else {
                    min = a;
                }
                paddingLeft = layoutParams.height != -2 ? 1073741824 : kvl.UNSET_ENUM_VALUE;
                if (layoutParams.height >= 0) {
                    a = Math.min(layoutParams.height, i5);
                } else {
                    a = i5;
                }
                this.f10037j.measure(MeasureSpec.makeMeasureSpec(min, makeMeasureSpec), MeasureSpec.makeMeasureSpec(a, paddingLeft));
            }
            if (this.d <= 0) {
                a = getChildCount();
                i4 = 0;
                while (i3 < a) {
                    paddingLeft = getChildAt(i3).getMeasuredHeight() + paddingTop;
                    if (paddingLeft <= i4) {
                        paddingLeft = i4;
                    }
                    i3++;
                    i4 = paddingLeft;
                }
                setMeasuredDimension(size, i4);
                return;
            }
            setMeasuredDimension(size, i4);
        }
    }

    /* renamed from: a */
    public final void mo286a(int i) {
        this.d = i;
    }

    /* renamed from: a */
    public final void m6788a(View view) {
        View view2 = this.f10037j;
        if (view2 != null) {
            removeView(view2);
        }
        this.f10037j = view;
        if (view != null) {
            view2 = this.f10038k;
            if (view2 != null) {
                removeView(view2);
                this.f10038k = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: a */
    public final void m6789a(CharSequence charSequence) {
        this.f10034g = charSequence;
        m6786c();
    }

    /* renamed from: b */
    public final void m6794b(CharSequence charSequence) {
        this.f10033f = charSequence;
        m6786c();
    }

    /* renamed from: a */
    public final void m6791a(boolean z) {
        if (z != this.f10036i) {
            requestLayout();
        }
        this.f10036i = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo287a() {
        return this.c != null ? this.c.m16770f() : false;
    }
}
