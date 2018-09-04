package android.support.design.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.db;
import p000.jm;

/* compiled from: PG */
public class SnackbarContentLayout extends LinearLayout {
    /* renamed from: a */
    private TextView f552a;
    /* renamed from: b */
    private Button f553b;
    /* renamed from: c */
    private int f554c;
    /* renamed from: d */
    private int f555d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, db.f2919a);
        this.f554c = obtainStyledAttributes.getDimensionPixelSize(db.f2920b, -1);
        this.f555d = obtainStyledAttributes.getDimensionPixelSize(db.f2922d, -1);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f552a = (TextView) findViewById(R.id.snackbar_text);
        this.f553b = (Button) findViewById(R.id.snackbar_action);
    }

    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3;
        super.onMeasure(i, i2);
        if (this.f554c > 0) {
            measuredWidth = getMeasuredWidth();
            i3 = this.f554c;
            if (measuredWidth > i3) {
                i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        i3 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        measuredWidth = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        int lineCount = this.f552a.getLayout().getLineCount();
        if (lineCount <= 1 || this.f555d <= 0 || this.f553b.getMeasuredWidth() <= this.f555d) {
            if (lineCount > 1) {
                measuredWidth = i3;
            }
            if (m374a(0, measuredWidth, measuredWidth)) {
                measuredWidth = 1;
            } else {
                measuredWidth = 0;
            }
        } else if (m374a(1, i3, i3 - measuredWidth)) {
            measuredWidth = 1;
        } else {
            measuredWidth = 0;
        }
        if (measuredWidth != 0) {
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: a */
    private final boolean m374a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f552a.getPaddingTop() == i2 && this.f552a.getPaddingBottom() == i3) {
            return z;
        }
        View view = this.f552a;
        if (jm.m4592z(view)) {
            jm.m4551a(view, jm.m4580n(view), i2, jm.m4579m(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
        return true;
    }
}
