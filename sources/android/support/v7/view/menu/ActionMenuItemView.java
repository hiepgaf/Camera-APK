package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import p000.kvl;
import p000.ni;
import p000.ob;
import p000.oc;
import p000.or;
import p000.ot;
import p000.ph;
import p000.qf;
import p000.rn;
import p000.sp;

/* compiled from: PG */
public class ActionMenuItemView extends rn implements OnClickListener, ph, qf {
    /* renamed from: a */
    public ot f10004a;
    /* renamed from: b */
    public or f10005b;
    /* renamed from: c */
    public oc f10006c;
    /* renamed from: d */
    private CharSequence f10007d;
    /* renamed from: e */
    private Drawable f10008e;
    /* renamed from: f */
    private sp f10009f;
    /* renamed from: g */
    private boolean f10010g;
    /* renamed from: h */
    private int f10011h;
    /* renamed from: i */
    private int f10012i;
    /* renamed from: j */
    private int f10013j;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f10010g = m6771f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ni.f8920v, i, 0);
        this.f10011h = obtainStyledAttributes.getDimensionPixelSize(ni.f8921w, 0);
        obtainStyledAttributes.recycle();
        this.f10013j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f10012i = -1;
        setSaveEnabled(false);
    }

    /* renamed from: a */
    public final ot mo280a() {
        return this.f10004a;
    }

    /* renamed from: c */
    public final boolean m6776c() {
        return TextUtils.isEmpty(getText()) ^ 1;
    }

    /* renamed from: a */
    public final void mo281a(ot otVar) {
        int i;
        this.f10004a = otVar;
        Drawable icon = otVar.getIcon();
        this.f10008e = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            i = this.f10013j;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicHeight = (int) ((((float) i) / ((float) intrinsicHeight)) * ((float) intrinsicWidth));
            } else {
                i = intrinsicHeight;
                intrinsicHeight = intrinsicWidth;
            }
            icon.setBounds(0, 0, intrinsicHeight, i);
        }
        setCompoundDrawables(icon, null, null, null);
        m6772g();
        this.f10007d = otVar.m14275a((ph) this);
        m6772g();
        setId(otVar.getItemId());
        if (otVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(otVar.isEnabled());
        if (otVar.hasSubMenu() && this.f10009f == null) {
            this.f10009f = new ob(this);
        }
    }

    /* renamed from: d */
    public final boolean mo283d() {
        return m6776c();
    }

    /* renamed from: e */
    public final boolean mo284e() {
        return m6776c() && this.f10004a.getIcon() == null;
    }

    public void onClick(View view) {
        or orVar = this.f10005b;
        if (orVar != null) {
            orVar.mo285a(this.f10004a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10010g = m6771f();
        m6772g();
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        boolean c = m6776c();
        if (c) {
            i3 = this.f10012i;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        i3 = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == kvl.UNSET_ENUM_VALUE) {
            i3 = Math.min(i3, this.f10011h);
        } else {
            i3 = this.f10011h;
        }
        if (mode != 1073741824 && this.f10011h > 0 && measuredWidth < i3) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!c && this.f10008e != null) {
            super.setPadding((getMeasuredWidth() - this.f10008e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10004a.hasSubMenu()) {
            sp spVar = this.f10009f;
            if (spVar != null && spVar.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final boolean mo282b() {
        return true;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f10012i = i;
        super.setPadding(i, i2, i3, i4);
    }

    /* renamed from: f */
    private final boolean m6771f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || ((i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2);
    }

    /* renamed from: g */
    private final void m6772g() {
        CharSequence charSequence;
        int i = 0;
        CharSequence charSequence2 = null;
        int isEmpty = TextUtils.isEmpty(this.f10007d) ^ 1;
        if (this.f10008e == null) {
            i = 1;
        } else if ((this.f10004a.f19513e & 4) == 4 && this.f10010g) {
            i = 1;
        }
        int i2 = isEmpty & i;
        if (i2 != 0) {
            charSequence = this.f10007d;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        charSequence = this.f10004a.getContentDescription();
        if (TextUtils.isEmpty(charSequence)) {
            if (i2 == 0) {
                charSequence = this.f10004a.getTitle();
            } else {
                charSequence = null;
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(charSequence);
        }
        charSequence = this.f10004a.getTooltipText();
        if (TextUtils.isEmpty(charSequence)) {
            if (i2 == 0) {
                charSequence2 = this.f10004a.getTitle();
            }
            setTooltipText(charSequence2);
            return;
        }
        setTooltipText(charSequence);
    }
}
