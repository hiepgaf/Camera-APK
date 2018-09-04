package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* compiled from: PG */
/* renamed from: ri */
final class ri extends tg {
    /* renamed from: a */
    public CharSequence f22554a;
    /* renamed from: b */
    public ListAdapter f22555b;
    /* renamed from: c */
    public final Rect f22556c = new Rect();
    /* renamed from: d */
    public final /* synthetic */ rf f22557d;

    public ri(rf rfVar, Context context, AttributeSet attributeSet, int i) {
        this.f22557d = rfVar;
        super(context, attributeSet, i);
        this.f19623l = rfVar;
        m14424j();
        this.f19624m = new rj(this);
    }

    /* renamed from: a */
    final void m16773a() {
        int i;
        Drawable background = this.f19629r.getBackground();
        if (background != null) {
            background.getPadding(this.f22557d.f9105c);
            if (vx.m6076a(this.f22557d)) {
                i = this.f22557d.f9105c.right;
            } else {
                i = -this.f22557d.f9105c.left;
            }
        } else {
            Rect rect = this.f22557d.f9105c;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.f22557d.getPaddingLeft();
        int paddingRight = this.f22557d.getPaddingRight();
        int width = this.f22557d.getWidth();
        rf rfVar = this.f22557d;
        int i2 = rfVar.f9104b;
        if (i2 == -2) {
            int a = rfVar.m5748a((SpinnerAdapter) this.f22555b, this.f19629r.getBackground());
            i2 = this.f22557d.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f22557d.f9105c;
            i2 = (i2 - rect2.left) - rect2.right;
            if (a <= i2) {
                i2 = a;
            }
            m14411a(Math.max(i2, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m14411a((width - paddingLeft) - paddingRight);
        } else {
            m14411a(i2);
        }
        if (vx.m6076a(this.f22557d)) {
            i2 = ((width - paddingRight) - this.f19617f) + i;
        } else {
            i2 = i + paddingLeft;
        }
        this.f19618g = i2;
    }

    /* renamed from: a */
    public final void mo3329a(ListAdapter listAdapter) {
        super.mo3329a(listAdapter);
        this.f22555b = listAdapter;
    }

    /* renamed from: f */
    public final void mo2474f() {
        boolean isShowing = this.f19629r.isShowing();
        m16773a();
        m14423i();
        super.mo2474f();
        this.f19616e.setChoiceMode(1);
        int selectedItemPosition = this.f22557d.getSelectedItemPosition();
        sh shVar = this.f19616e;
        if (this.f19629r.isShowing() && shVar != null) {
            shVar.f9201a = false;
            shVar.setSelection(selectedItemPosition);
            if (shVar.getChoiceMode() != 0) {
                shVar.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing) {
            ViewTreeObserver viewTreeObserver = this.f22557d.getViewTreeObserver();
            if (viewTreeObserver != null) {
                OnGlobalLayoutListener rkVar = new rk(this);
                viewTreeObserver.addOnGlobalLayoutListener(rkVar);
                m14414a(new rl(this, rkVar));
            }
        }
    }
}
