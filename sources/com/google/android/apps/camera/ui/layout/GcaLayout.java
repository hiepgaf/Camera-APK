package com.google.android.apps.camera.ui.layout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import p000.bli;
import p000.cct;
import p000.go;
import p000.gxv;
import p000.gxy;
import p000.gyb;
import p000.gyc;
import p000.gyh;
import p000.jqk;
import p000.kbn;

/* compiled from: PG */
public class GcaLayout extends FrameLayout {
    /* renamed from: b */
    private static final String f2423b = bli.m862a("GcaLayout");
    /* renamed from: a */
    public kbn f2424a;
    /* renamed from: c */
    private gxv f2425c;

    public GcaLayout(Context context) {
        super(context);
        m1330a(context);
    }

    public GcaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1330a(context);
    }

    public GcaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1330a(context);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof gyc;
    }

    protected FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new gyc(go.bm);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new gyc(getContext(), attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new gyc(layoutParams);
    }

    /* renamed from: a */
    private final void m1330a(Context context) {
        ((gyb) ((cct) context).mo2796a(gyb.class)).mo2722a(this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection(String.valueOf(getTag().toString()).concat(".onLayout"));
        super.onLayout(z, i, i2, i3, i4);
        Trace.endSection();
    }

    public void onMeasure(int i, int i2) {
        Trace.beginSection(String.valueOf(getTag().toString()).concat(".onMeasure"));
        gxy gxy = (gxy) jqk.m13102c((gxy) this.f2424a.mo605b());
        if (!(gxy == null || this.f2425c == gxy.mo1688a())) {
            gxv a = gxy.mo1688a();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                gyc gyc = (gyc) childAt.getLayoutParams();
                int i4 = gyc.f5787a;
                if (i4 != 0) {
                    switch (i4 - 1) {
                        case 0:
                            m1331a(gyc, childAt, a.mo1676b());
                            break;
                        case 1:
                            m1331a(gyc, childAt, a.mo1679e());
                            break;
                        case 2:
                            m1331a(gyc, childAt, a.mo1681g());
                            break;
                        case 3:
                            m1331a(gyc, childAt, a.mo1680f());
                            break;
                        case 4:
                            m1331a(gyc, childAt, a.mo1678d());
                            break;
                        case 5:
                            m1331a(gyc, childAt, a.mo1675a());
                            break;
                        case 6:
                            gyh c = gxy.mo1690c();
                            if (c != null) {
                                gyc.width = c.mo1695e().getWidth();
                                gyc.height = c.mo1695e().getHeight();
                                gyc.gravity = c.mo1691a();
                                gyc.setLayoutDirection(c.mo1692b());
                                gyc.setMargins(c.mo1693c().left, c.mo1693c().top, c.mo1693c().right, c.mo1693c().bottom);
                                childAt.setLayoutParams(gyc);
                                childAt.setPadding(c.mo1694d().left, c.mo1694d().top, c.mo1694d().right, c.mo1694d().bottom);
                                break;
                            }
                            m1331a(gyc, childAt, a.mo1681g());
                            break;
                        case 7:
                            m1331a(gyc, childAt, a.mo1677c());
                            break;
                        default:
                            break;
                    }
                }
            }
            this.f2425c = a;
        }
        super.onMeasure(i, i2);
        Trace.endSection();
    }

    public void requestLayout() {
        super.requestLayout();
        this.f2425c = null;
    }

    /* renamed from: a */
    private static void m1331a(gyc gyc, View view, Rect rect) {
        if (rect.width() < 0 || rect.height() < 0) {
            String str = f2423b;
            String valueOf = String.valueOf(rect);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
            stringBuilder.append("rect box has negative width or height ");
            stringBuilder.append(valueOf);
            bli.m863a(str, stringBuilder.toString());
            return;
        }
        gyc.width = rect.width();
        gyc.height = rect.height();
        gyc.setMargins(rect.left, rect.top, 0, 0);
        view.setLayoutParams(gyc);
    }
}
