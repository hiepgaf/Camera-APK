package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import p000.jm;
import p000.sy;
import p000.sz;

/* compiled from: PG */
public class AlertDialogLayout extends sy {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        i5 = getMeasuredHeight();
        int childCount = getChildCount();
        int i6 = this.f9241e;
        int i7 = i6 & 8388615;
        switch (i6 & 112) {
            case 16:
                i5 = (((i4 - i2) - i5) / 2) + getPaddingTop();
                break;
            case 80:
                i5 = ((getPaddingTop() + i4) - i2) - i5;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        Drawable drawable = this.f9242f;
        if (drawable != null) {
            i6 = drawable.getIntrinsicHeight();
        } else {
            i6 = 0;
        }
        int i8 = i5;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                sz szVar = (sz) childAt.getLayoutParams();
                int i10 = szVar.f9253h;
                if (i10 < 0) {
                    i10 = i7;
                }
                switch (Gravity.getAbsoluteGravity(i10, jm.m4576j(this)) & 7) {
                    case 1:
                        i10 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + szVar.leftMargin) - szVar.rightMargin;
                        break;
                    case 5:
                        i10 = (paddingRight - measuredWidth) - szVar.rightMargin;
                        break;
                    default:
                        i10 = szVar.leftMargin + paddingLeft;
                        break;
                }
                if (m5826b(i9)) {
                    i8 += i6;
                }
                i8 += szVar.topMargin;
                childAt.layout(i10, i8, measuredWidth + i10, i8 + measuredHeight);
                i8 += szVar.bottomMargin + measuredHeight;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r14, int r15) {
        /*
        r13 = this;
        r8 = r13.getChildCount();
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r0 = 0;
        r4 = r0;
        r0 = r1;
    L_0x000a:
        if (r4 >= r8) goto L_0x004d;
    L_0x000c:
        r1 = r13.getChildAt(r4);
        r5 = r1.getVisibility();
        r6 = 8;
        if (r5 != r6) goto L_0x0020;
    L_0x0018:
        r1 = r2;
        r2 = r3;
    L_0x001a:
        r3 = r4 + 1;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        goto L_0x000a;
    L_0x0020:
        r5 = r1.getId();
        r6 = 2131624096; // 0x7f0e00a0 float:1.8875362E38 double:1.0531622357E-314;
        if (r5 == r6) goto L_0x0049;
    L_0x0029:
        r6 = 2131624085; // 0x7f0e0095 float:1.887534E38 double:1.05316223E-314;
        if (r5 == r6) goto L_0x0047;
    L_0x002e:
        r6 = 2131624088; // 0x7f0e0098 float:1.8875346E38 double:1.0531622317E-314;
        if (r5 == r6) goto L_0x0038;
    L_0x0033:
        r6 = 2131624094; // 0x7f0e009e float:1.8875358E38 double:1.0531622347E-314;
        if (r5 != r6) goto L_0x0045;
    L_0x0038:
        if (r3 != 0) goto L_0x003e;
    L_0x003a:
        r12 = r2;
        r2 = r1;
        r1 = r12;
        goto L_0x001a;
    L_0x003e:
        r0 = 0;
    L_0x003f:
        if (r0 != 0) goto L_0x0044;
    L_0x0041:
        super.onMeasure(r14, r15);
    L_0x0044:
        return;
    L_0x0045:
        r0 = 0;
        goto L_0x003f;
    L_0x0047:
        r2 = r3;
        goto L_0x001a;
    L_0x0049:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x001a;
    L_0x004d:
        r9 = android.view.View.MeasureSpec.getMode(r15);
        r10 = android.view.View.MeasureSpec.getSize(r15);
        r11 = android.view.View.MeasureSpec.getMode(r14);
        r1 = r13.getPaddingTop();
        r4 = r13.getPaddingBottom();
        r4 = r4 + r1;
        if (r0 == 0) goto L_0x019c;
    L_0x0064:
        r1 = 0;
        r0.measure(r14, r1);
        r1 = r0.getMeasuredHeight();
        r4 = r4 + r1;
        r1 = 0;
        r0 = r0.getMeasuredState();
        r5 = android.view.View.combineMeasuredStates(r1, r0);
    L_0x0076:
        if (r2 == 0) goto L_0x0195;
    L_0x0078:
        r0 = 0;
        r2.measure(r14, r0);
        r0 = r2;
    L_0x007d:
        r1 = p000.jm.m4577k(r0);
        if (r1 > 0) goto L_0x0192;
    L_0x0083:
        r1 = r0 instanceof android.view.ViewGroup;
        if (r1 == 0) goto L_0x018f;
    L_0x0087:
        r0 = (android.view.ViewGroup) r0;
        r1 = r0.getChildCount();
        r6 = 1;
        if (r1 != r6) goto L_0x0096;
    L_0x0090:
        r1 = 0;
        r0 = r0.getChildAt(r1);
        goto L_0x007d;
    L_0x0096:
        r0 = 0;
    L_0x0097:
        r1 = r2.getMeasuredHeight();
        r1 = r1 - r0;
        r4 = r4 + r0;
        r6 = r2.getMeasuredState();
        r5 = android.view.View.combineMeasuredStates(r5, r6);
        r6 = r5;
        r5 = r4;
        r4 = r1;
        r1 = r0;
    L_0x00a9:
        if (r3 == 0) goto L_0x018b;
    L_0x00ab:
        if (r9 == 0) goto L_0x0188;
    L_0x00ad:
        r0 = 0;
        r7 = r10 - r5;
        r0 = java.lang.Math.max(r0, r7);
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9);
    L_0x00b8:
        r3.measure(r14, r0);
        r0 = r3.getMeasuredHeight();
        r5 = r5 + r0;
        r7 = r3.getMeasuredState();
        r6 = android.view.View.combineMeasuredStates(r6, r7);
        r7 = r0;
    L_0x00c9:
        r0 = r10 - r5;
        if (r2 == 0) goto L_0x0183;
    L_0x00cd:
        r5 = r5 - r1;
        r4 = java.lang.Math.min(r0, r4);
        if (r4 <= 0) goto L_0x00d6;
    L_0x00d4:
        r0 = r0 - r4;
        r1 = r1 + r4;
    L_0x00d6:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r4);
        r2.measure(r14, r1);
        r1 = r2.getMeasuredHeight();
        r1 = r1 + r5;
        r2 = r2.getMeasuredState();
        r2 = android.view.View.combineMeasuredStates(r6, r2);
        r12 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r12;
    L_0x00f0:
        if (r3 == 0) goto L_0x010a;
    L_0x00f2:
        if (r2 <= 0) goto L_0x010a;
    L_0x00f4:
        r2 = r2 + r7;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9);
        r3.measure(r14, r2);
        r0 = r0 - r7;
        r2 = r3.getMeasuredHeight();
        r0 = r0 + r2;
        r2 = r3.getMeasuredState();
        r1 = android.view.View.combineMeasuredStates(r1, r2);
    L_0x010a:
        r3 = 0;
        r2 = 0;
        r12 = r2;
        r2 = r3;
        r3 = r12;
    L_0x010f:
        if (r3 >= r8) goto L_0x0128;
    L_0x0111:
        r4 = r13.getChildAt(r3);
        r5 = r4.getVisibility();
        r6 = 8;
        if (r5 == r6) goto L_0x0125;
    L_0x011d:
        r4 = r4.getMeasuredWidth();
        r2 = java.lang.Math.max(r2, r4);
    L_0x0125:
        r3 = r3 + 1;
        goto L_0x010f;
    L_0x0128:
        r3 = r13.getPaddingLeft();
        r4 = r13.getPaddingRight();
        r3 = r3 + r4;
        r2 = r2 + r3;
        r1 = android.view.View.resolveSizeAndState(r2, r14, r1);
        r2 = 0;
        r0 = android.view.View.resolveSizeAndState(r0, r15, r2);
        r13.setMeasuredDimension(r1, r0);
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r11 == r0) goto L_0x0180;
    L_0x0142:
        r0 = r13.getMeasuredWidth();
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1);
        r0 = 0;
        r7 = r0;
    L_0x014e:
        if (r7 >= r8) goto L_0x017d;
    L_0x0150:
        r1 = r13.getChildAt(r7);
        r0 = r1.getVisibility();
        r3 = 8;
        if (r0 == r3) goto L_0x0179;
    L_0x015c:
        r0 = r1.getLayoutParams();
        r6 = r0;
        r6 = (p000.sz) r6;
        r0 = r6.width;
        r3 = -1;
        if (r0 != r3) goto L_0x0179;
    L_0x0168:
        r9 = r6.height;
        r0 = r1.getMeasuredHeight();
        r6.height = r0;
        r3 = 0;
        r5 = 0;
        r0 = r13;
        r4 = r15;
        r0.measureChildWithMargins(r1, r2, r3, r4, r5);
        r6.height = r9;
    L_0x0179:
        r0 = r7 + 1;
        r7 = r0;
        goto L_0x014e;
    L_0x017d:
        r0 = 1;
        goto L_0x003f;
    L_0x0180:
        r0 = 1;
        goto L_0x003f;
    L_0x0183:
        r2 = r0;
        r1 = r6;
        r0 = r5;
        goto L_0x00f0;
    L_0x0188:
        r0 = 0;
        goto L_0x00b8;
    L_0x018b:
        r0 = 0;
        r7 = r0;
        goto L_0x00c9;
    L_0x018f:
        r0 = 0;
        goto L_0x0097;
    L_0x0192:
        r0 = r1;
        goto L_0x0097;
    L_0x0195:
        r1 = 0;
        r0 = 0;
        r6 = r5;
        r5 = r4;
        r4 = r0;
        goto L_0x00a9;
    L_0x019c:
        r5 = 0;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AlertDialogLayout.onMeasure(int, int):void");
    }
}
