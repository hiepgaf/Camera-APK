package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import p000.kvl;
import p000.mg;
import p000.mt;
import p000.op;
import p000.rs;
import p000.rt;

/* compiled from: PG */
public class ContentFrameLayout extends FrameLayout {
    /* renamed from: a */
    public TypedValue f642a;
    /* renamed from: b */
    public TypedValue f643b;
    /* renamed from: c */
    public TypedValue f644c;
    /* renamed from: d */
    public TypedValue f645d;
    /* renamed from: e */
    public TypedValue f646e;
    /* renamed from: f */
    public TypedValue f647f;
    /* renamed from: g */
    public final Rect f648g;
    /* renamed from: h */
    public rs f649h;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f648g = new Rect();
    }

    /* renamed from: a */
    public final void m414a(Rect rect) {
        fitSystemWindows(rect);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rs rsVar = this.f649h;
        if (rsVar != null) {
            mg mgVar = rsVar.f9145a;
            rt rtVar = mgVar.f19365e;
            if (rtVar != null) {
                rtVar.mo293b();
            }
            if (mgVar.f19368h != null) {
                mgVar.f19363c.getDecorView().removeCallbacks(mgVar.f19369i);
                if (mgVar.f19368h.isShowing()) {
                    try {
                        mgVar.f19368h.dismiss();
                    } catch (IllegalArgumentException e) {
                    }
                }
                mgVar.f19368h = null;
            }
            mgVar.m14092l();
            mt e2 = mgVar.m14083e(0);
            if (e2 != null) {
                op opVar = e2.f8841h;
                if (opVar != null) {
                    opVar.close();
                }
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        TypedValue typedValue;
        Object obj;
        int dimension;
        Object obj2 = null;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == kvl.UNSET_ENUM_VALUE) {
            if (i3 >= i4) {
                typedValue = this.f644c;
            } else {
                typedValue = this.f645d;
            }
            if (typedValue == null) {
                obj = null;
            } else if (typedValue.type != 0) {
                if (typedValue.type == 5) {
                    dimension = (int) typedValue.getDimension(displayMetrics);
                } else if (typedValue.type == 6) {
                    dimension = (int) typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                } else {
                    dimension = 0;
                }
                if (dimension > 0) {
                    Rect rect = this.f648g;
                    i = MeasureSpec.makeMeasureSpec(Math.min(dimension - (rect.right + rect.left), MeasureSpec.getSize(i)), 1073741824);
                    obj = 1;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        if (mode2 == kvl.UNSET_ENUM_VALUE) {
            if (i3 >= i4) {
                typedValue = this.f647f;
            } else {
                typedValue = this.f646e;
            }
            if (!(typedValue == null || typedValue.type == 0)) {
                if (typedValue.type == 5) {
                    dimension = (int) typedValue.getDimension(displayMetrics);
                } else if (typedValue.type == 6) {
                    dimension = (int) typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
                } else {
                    dimension = 0;
                }
                if (dimension > 0) {
                    Rect rect2 = this.f648g;
                    i2 = MeasureSpec.makeMeasureSpec(Math.min(dimension - (rect2.bottom + rect2.top), MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        mode2 = MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (obj != null) {
            dimension = mode2;
        } else if (mode == kvl.UNSET_ENUM_VALUE) {
            if (i3 >= i4) {
                typedValue = this.f642a;
            } else {
                typedValue = this.f643b;
            }
            if (typedValue == null) {
                dimension = mode2;
            } else if (typedValue.type != 0) {
                if (typedValue.type == 5) {
                    dimension = (int) typedValue.getDimension(displayMetrics);
                } else if (typedValue.type == 6) {
                    dimension = (int) typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                } else {
                    dimension = 0;
                }
                if (dimension > 0) {
                    rect = this.f648g;
                    dimension -= rect.right + rect.left;
                }
                if (measuredWidth < dimension) {
                    dimension = MeasureSpec.makeMeasureSpec(dimension, 1073741824);
                    obj2 = 1;
                } else {
                    dimension = mode2;
                }
            } else {
                dimension = mode2;
            }
        } else {
            dimension = mode2;
        }
        if (obj2 != null) {
            super.onMeasure(dimension, i2);
        }
    }
}
