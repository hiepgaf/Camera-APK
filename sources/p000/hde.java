package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.PopupWindow;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: hde */
final class hde extends ViewGroup implements AutoCloseable {
    /* renamed from: A */
    private final int f6010A;
    /* renamed from: B */
    private final int f6011B;
    /* renamed from: C */
    private final int f6012C;
    /* renamed from: D */
    private final int f6013D;
    /* renamed from: E */
    private float f6014E = 1.0f;
    /* renamed from: a */
    public final int[] f6015a = new int[2];
    /* renamed from: b */
    public final Paint f6016b = new Paint();
    /* renamed from: c */
    public final int f6017c;
    /* renamed from: d */
    public final List f6018d = Collections.synchronizedList(new ArrayList());
    /* renamed from: e */
    public PopupWindow f6019e;
    /* renamed from: f */
    public boolean f6020f;
    /* renamed from: g */
    public View f6021g;
    /* renamed from: h */
    public int f6022h;
    /* renamed from: i */
    public View f6023i;
    /* renamed from: j */
    public Rect f6024j;
    /* renamed from: k */
    public int f6025k;
    /* renamed from: l */
    public int f6026l;
    /* renamed from: m */
    public boolean f6027m = false;
    /* renamed from: n */
    public final Object f6028n = new Object();
    /* renamed from: o */
    public gbv f6029o;
    /* renamed from: p */
    public TranslateAnimation f6030p;
    /* renamed from: q */
    public boolean f6031q;
    /* renamed from: r */
    public gbw f6032r;
    /* renamed from: s */
    public List f6033s;
    /* renamed from: t */
    private final Path f6034t = new Path();
    /* renamed from: u */
    private final RectF f6035u = new RectF();
    /* renamed from: v */
    private final int f6036v;
    /* renamed from: w */
    private final int f6037w;
    /* renamed from: x */
    private final int f6038x;
    /* renamed from: y */
    private final int f6039y;
    /* renamed from: z */
    private final int f6040z;

    hde(Context context) {
        super(context);
        this.f6037w = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_horizontal_container_padding);
        this.f6036v = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_container_padding);
        this.f6017c = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_animation_movement);
        this.f6038x = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_vertical_animation_padding);
        this.f6039y = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_margin);
        this.f6040z = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_shadow_offset);
        this.f6013D = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_shadow_radius);
        this.f6010A = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_arrow_length);
        this.f6011B = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_arrow_base_width);
        this.f6012C = context.getResources().getDimensionPixelSize(R.dimen.ui_tooltip_container_corner_radius);
        int color = ge.getColor(context, R.color.tooltip_background_color);
        int color2 = ge.getColor(context, R.color.tooltip_container_shadow);
        this.f6016b.setStyle(Style.FILL);
        this.f6016b.setColor(color);
        this.f6016b.setAntiAlias(true);
        float f = (float) this.f6040z;
        this.f6016b.setShadowLayer((float) this.f6013D, f, f, color2);
        this.f6020f = true;
        this.f6031q = false;
    }

    public final void close() {
        m3079a();
        setOnClickListener(null);
        removeAllViews();
        this.f6032r = null;
        this.f6029o = null;
        this.f6018d.clear();
        PopupWindow popupWindow = this.f6019e;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f6019e = null;
        this.f6021g = null;
        this.f6023i = null;
        setVisibility(8);
    }

    /* renamed from: a */
    private final void m3077a(Canvas canvas) {
        getLocationOnScreen(this.f6015a);
        canvas.save();
        canvas.translate((float) (this.f6039y - this.f6015a[0]), 0.0f);
        canvas.drawPath(this.f6034t, this.f6016b);
        canvas.restore();
    }

    /* renamed from: b */
    private final Point m3078b() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    /* renamed from: a */
    public final void m3079a() {
        PopupWindow popupWindow = this.f6019e;
        if (popupWindow != null) {
            clearAnimation();
            popupWindow.dismiss();
        }
    }

    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.f6022h == 2) {
            canvas.translate(0.0f, (float) this.f6010A);
            m3077a(canvas);
        }
        float f = (float) this.f6012C;
        canvas.drawRoundRect(this.f6035u, f, f, this.f6016b);
        if (this.f6022h == 1) {
            m3077a(canvas);
        }
        canvas.restore();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        View view = this.f6021g;
        if (view != null) {
            i5 = this.f6037w;
            i6 = this.f6036v;
            int i8 = this.f6022h;
            if (i8 == 2) {
                i7 = this.f6010A;
            } else {
                i7 = 0;
            }
            int i9 = i6 + i7;
            int i10 = (i3 - i) - i5;
            i6 = (i4 - i2) - i6;
            if (i8 == 1) {
                i7 = this.f6010A;
            } else {
                i7 = 0;
            }
            view.layout(i5, i9, i10, i6 - i7);
        }
        Point b = m3078b();
        int i11 = b.x;
        i5 = b.y;
        i7 = this.f6039y;
        i6 = i11 - (i7 + i7);
        Rect rect = this.f6024j;
        i7 = rect.top - i7;
        if (this.f6022h == 2) {
            i7 = ((i5 - rect.top) - rect.height()) - this.f6039y;
        }
        measure(MeasureSpec.makeMeasureSpec(i6, kvl.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(i7, kvl.UNSET_ENUM_VALUE));
        Rect rect2 = this.f6024j;
        hdk hdk = new hdk(rect2.left, rect2.top, i11);
        PopupWindow popupWindow = this.f6019e;
        if (popupWindow != null) {
            Object obj;
            i11 = this.f6022h;
            if (i11 == 1) {
                i5 = ((-getMeasuredHeight()) - this.f6026l) - this.f6038x;
            } else if (i11 == 2) {
                i5 = (this.f6024j.height() + this.f6026l) + this.f6038x;
            } else {
                i5 = 0;
            }
            i6 = getMeasuredWidth();
            if (jm.m4576j(this) != 1) {
                obj = null;
            } else {
                obj = 1;
            }
            switch (this.f6025k) {
                case 1:
                    if (obj == null) {
                        i11 = hdk.f6048a;
                        break;
                    } else {
                        i11 = (hdk.f6048a + this.f6024j.width()) - i6;
                        break;
                    }
                case 2:
                    i11 = hdk.f6048a - ((getMeasuredWidth() - this.f6024j.width()) / 2);
                    break;
                case 3:
                    if (obj == null) {
                        i11 = (hdk.f6048a + this.f6024j.width()) - i6;
                        break;
                    } else {
                        i11 = hdk.f6048a;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
            i9 = this.f6039y;
            popupWindow.update(Math.min((hdk.f6050c - i9) - i6, Math.max(i9, i11)), i5 + hdk.f6049b, i6, getMeasuredHeight(), true);
        }
        switch (this.f6025k) {
            case 1:
                i7 = this.f6011B;
                i11 = this.f6039y;
                i7 = (i7 / 2) + (i11 + i11);
                break;
            case 2:
                i7 = this.f6024j.width() / 2;
                break;
            case 3:
                i7 = this.f6024j.width();
                i11 = this.f6011B;
                i5 = this.f6039y;
                i7 = (i7 - (i11 / 2)) - (i5 + i5);
                break;
            default:
                i7 = 0;
                break;
        }
        if (jm.m4576j(this) == 1) {
            i7 = this.f6024j.width() - i7;
        }
        i7 += this.f6024j.left;
        this.f6034t.reset();
        i11 = this.f6022h;
        if (i11 == 1) {
            this.f6034t.moveTo((float) ((i7 - this.f6039y) - (this.f6011B / 2)), this.f6035u.bottom);
            this.f6034t.rLineTo((float) this.f6011B, 0.0f);
            this.f6034t.rLineTo((float) ((-this.f6011B) / 2), (float) this.f6010A);
            this.f6034t.rLineTo((float) ((-this.f6011B) / 2), (float) (-this.f6010A));
            this.f6034t.close();
        } else if (i11 == 2) {
            this.f6034t.moveTo((float) ((i7 - this.f6039y) + (this.f6011B / 2)), this.f6035u.top);
            this.f6034t.rLineTo((float) (-this.f6011B), 0.0f);
            this.f6034t.rLineTo((float) (this.f6011B / 2), (float) (-this.f6010A));
            this.f6034t.rLineTo((float) (this.f6011B / 2), (float) this.f6010A);
            this.f6034t.close();
        }
    }

    protected final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = this.f6037w;
        int i4 = this.f6040z;
        size = (size - (i3 + i3)) - i4;
        i3 = this.f6036v;
        size2 = ((size2 - (i3 + i3)) - i4) - this.f6010A;
        i3 = Math.min((int) (((float) m3078b().x) * this.f6014E), size);
        View view = this.f6021g;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec(i3, kvl.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(size2, 0));
            if (this.f6021g.getMeasuredHeight() > size2) {
                this.f6021g.measure(MeasureSpec.makeMeasureSpec(size, kvl.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(size2, kvl.UNSET_ENUM_VALUE));
            }
        }
        View view2 = this.f6021g;
        if (view2 != null) {
            size = view2.getMeasuredWidth();
            size2 = this.f6037w;
            i3 = this.f6021g.getMeasuredHeight();
            i4 = this.f6036v;
            this.f6035u.set(0.0f, 0.0f, (float) (size + (size2 + size2)), (float) ((i4 + i4) + i3));
        }
        setMeasuredDimension(((int) this.f6035u.width()) + this.f6040z, ((((int) this.f6035u.height()) + this.f6040z) + this.f6010A) + this.f6038x);
    }
}
