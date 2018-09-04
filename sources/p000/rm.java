package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: rm */
public final class rm {
    /* renamed from: a */
    public int f9117a = 0;
    /* renamed from: b */
    public Typeface f9118b;
    /* renamed from: c */
    public boolean f9119c;
    /* renamed from: d */
    private final TextView f9120d;
    /* renamed from: e */
    private vi f9121e;
    /* renamed from: f */
    private vi f9122f;
    /* renamed from: g */
    private vi f9123g;
    /* renamed from: h */
    private vi f9124h;
    /* renamed from: i */
    private vi f9125i;
    /* renamed from: j */
    private vi f9126j;
    /* renamed from: k */
    private final ro f9127k;

    rm(TextView textView) {
        this.f9120d = textView;
        this.f9127k = new ro(this.f9120d);
    }

    /* renamed from: a */
    private final void m5751a(Drawable drawable, vi viVar) {
        if (drawable != null && viVar != null) {
            qq.m5727a(drawable, viVar, this.f9120d.getDrawableState());
        }
    }

    /* renamed from: a */
    final void m5753a() {
        if (!(this.f9121e == null && this.f9122f == null && this.f9123g == null && this.f9124h == null)) {
            Drawable[] compoundDrawables = this.f9120d.getCompoundDrawables();
            m5751a(compoundDrawables[0], this.f9121e);
            m5751a(compoundDrawables[1], this.f9122f);
            m5751a(compoundDrawables[2], this.f9123g);
            m5751a(compoundDrawables[3], this.f9124h);
        }
        if (this.f9125i != null || this.f9126j != null) {
            compoundDrawables = this.f9120d.getCompoundDrawablesRelative();
            m5751a(compoundDrawables[0], this.f9125i);
            m5751a(compoundDrawables[2], this.f9126j);
        }
    }

    /* renamed from: a */
    private static vi m5749a(Context context, qq qqVar, int i) {
        ColorStateList a = qqVar.m5731a(context, i);
        if (a == null) {
            return null;
        }
        vi viVar = new vi();
        viVar.f9417d = true;
        viVar.f9414a = a;
        return viVar;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    final void m5755a(AttributeSet attributeSet, int i) {
        boolean z;
        Object obj;
        ColorStateList a;
        ColorStateList a2;
        ColorStateList a3;
        float dimension;
        float dimension2;
        float dimension3;
        int resourceId;
        boolean z2;
        int i2;
        Context context = this.f9120d.getContext();
        qq a4 = qq.m5725a();
        vk a5 = vk.m6047a(context, attributeSet, ni.f8891S, i, 0);
        int g = a5.m6061g(ni.f8898Z, -1);
        if (a5.m6060f(ni.f8894V)) {
            this.f9121e = rm.m5749a(context, a4, a5.m6061g(ni.f8894V, 0));
        }
        if (a5.m6060f(ni.f8897Y)) {
            this.f9122f = rm.m5749a(context, a4, a5.m6061g(ni.f8897Y, 0));
        }
        if (a5.m6060f(ni.f8895W)) {
            this.f9123g = rm.m5749a(context, a4, a5.m6061g(ni.f8895W, 0));
        }
        if (a5.m6060f(ni.f8892T)) {
            this.f9124h = rm.m5749a(context, a4, a5.m6061g(ni.f8892T, 0));
        }
        if (a5.m6060f(ni.f8896X)) {
            this.f9125i = rm.m5749a(context, a4, a5.m6061g(ni.f8896X, 0));
        }
        if (a5.m6060f(ni.f8893U)) {
            this.f9126j = rm.m5749a(context, a4, a5.m6061g(ni.f8893U, 0));
        }
        a5.f9419b.recycle();
        boolean z3 = this.f9120d.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            vk a6 = vk.m6045a(context, g, ni.bS);
            if (z3) {
                z = false;
                obj = null;
            } else if (a6.m6060f(ni.cb)) {
                z = a6.m6050a(ni.cb, false);
                obj = 1;
            } else {
                z = false;
                obj = null;
            }
            m5750a(context, a6);
            a6.f9419b.recycle();
        } else {
            z = false;
            obj = null;
        }
        vk a7 = vk.m6047a(context, attributeSet, ni.bS, i, 0);
        if (!z3 && a7.m6060f(ni.cb)) {
            z = a7.m6050a(ni.cb, false);
            obj = 1;
        }
        if (VERSION.SDK_INT < 23) {
            if (a7.m6060f(ni.bU)) {
                a = a7.m6049a(ni.bU);
            } else {
                a = null;
            }
            if (a7.m6060f(ni.bV)) {
                a2 = a7.m6049a(ni.bV);
            } else {
                a2 = null;
            }
            if (a7.m6060f(ni.bW)) {
                a3 = a7.m6049a(ni.bW);
            } else {
                a3 = null;
            }
        } else {
            a3 = null;
            a = null;
            a2 = null;
        }
        m5750a(context, a7);
        a7.f9419b.recycle();
        if (a != null) {
            this.f9120d.setTextColor(a);
        }
        if (a2 != null) {
            this.f9120d.setHintTextColor(a2);
        }
        if (a3 != null) {
            this.f9120d.setLinkTextColor(a3);
        }
        if (!(z3 || r0 == null)) {
            m5752a(z);
        }
        Typeface typeface = this.f9118b;
        if (typeface != null) {
            this.f9120d.setTypeface(typeface, this.f9117a);
        }
        ro roVar = this.f9127k;
        TypedArray obtainStyledAttributes = roVar.f9137h.obtainStyledAttributes(attributeSet, ni.aa, i, 0);
        if (obtainStyledAttributes.hasValue(ni.af)) {
            roVar.f9130a = obtainStyledAttributes.getInt(ni.af, 0);
        }
        if (obtainStyledAttributes.hasValue(ni.ae)) {
            dimension = obtainStyledAttributes.getDimension(ni.ae, -1.0f);
        } else {
            dimension = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(ni.ac)) {
            dimension2 = obtainStyledAttributes.getDimension(ni.ac, -1.0f);
        } else {
            dimension2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(ni.ab)) {
            dimension3 = obtainStyledAttributes.getDimension(ni.ab, -1.0f);
        } else {
            dimension3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(ni.ad)) {
            resourceId = obtainStyledAttributes.getResourceId(ni.ad, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                if (length > 0) {
                    for (resourceId = 0; resourceId < length; resourceId++) {
                        iArr[resourceId] = obtainTypedArray.getDimensionPixelSize(resourceId, -1);
                    }
                    roVar.f9135f = ro.m5756a(iArr);
                    int[] iArr2 = roVar.f9135f;
                    int length2 = iArr2.length;
                    if (length2 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    roVar.f9136g = z2;
                    if (roVar.f9136g) {
                        roVar.f9130a = 1;
                        roVar.f9133d = (float) iArr2[0];
                        roVar.f9134e = (float) iArr2[length2 - 1];
                        roVar.f9132c = -1.0f;
                    }
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!roVar.m5757a()) {
            roVar.f9130a = 0;
        } else if (roVar.f9130a == 1) {
            if (!roVar.f9136g) {
                DisplayMetrics displayMetrics = roVar.f9137h.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                StringBuilder stringBuilder;
                if (dimension2 <= 0.0f) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Minimum auto-size text size (");
                    stringBuilder.append(dimension2);
                    stringBuilder.append("px) is less or equal to (0px)");
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (dimension3 <= dimension2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Maximum auto-size text size (");
                    stringBuilder.append(dimension3);
                    stringBuilder.append("px) is less or equal to minimum auto-size ");
                    stringBuilder.append("text size (");
                    stringBuilder.append(dimension2);
                    stringBuilder.append("px)");
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (dimension <= 0.0f) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("The auto-size step granularity (");
                    stringBuilder2.append(dimension);
                    stringBuilder2.append("px) is less or equal to (0px)");
                    throw new IllegalArgumentException(stringBuilder2.toString());
                } else {
                    roVar.f9130a = 1;
                    roVar.f9133d = dimension2;
                    roVar.f9134e = dimension3;
                    roVar.f9132c = dimension;
                    roVar.f9136g = false;
                }
            }
            if (roVar.m5757a() && roVar.f9130a == 1) {
                if (!roVar.f9136g || roVar.f9135f.length == 0) {
                    i2 = 1;
                    for (float round = (float) Math.round(roVar.f9133d); Math.round(roVar.f9132c + round) <= Math.round(roVar.f9134e); round += roVar.f9132c) {
                        i2++;
                    }
                    int[] iArr3 = new int[i2];
                    dimension2 = roVar.f9133d;
                    for (resourceId = 0; resourceId < i2; resourceId++) {
                        iArr3[resourceId] = Math.round(dimension2);
                        dimension2 += roVar.f9132c;
                    }
                    roVar.f9135f = ro.m5756a(iArr3);
                }
                roVar.f9131b = true;
            } else {
                roVar.f9131b = false;
            }
            z2 = roVar.f9131b;
        }
        ro roVar2 = this.f9127k;
        if (roVar2.f9130a != 0) {
            int[] iArr4 = roVar2.f9135f;
            if (iArr4.length > 0) {
                if (((float) this.f9120d.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f9120d.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f9127k.f9133d), Math.round(this.f9127k.f9134e), Math.round(this.f9127k.f9132c), 0);
                } else {
                    this.f9120d.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        vk a8 = vk.m6046a(context, attributeSet, ni.aa);
        i2 = a8.m6053c(ni.ag, -1);
        g = a8.m6053c(ni.ah, -1);
        int c = a8.m6053c(ni.ai, -1);
        a8.f9419b.recycle();
        if (i2 != -1) {
            TextView textView = this.f9120d;
            ha.m2958a(i2);
            textView.setFirstBaselineToTopHeight(i2);
        }
        if (g != -1) {
            TextView textView2 = this.f9120d;
            ha.m2958a(g);
            FontMetricsInt fontMetricsInt = textView2.getPaint().getFontMetricsInt();
            if (textView2.getIncludeFontPadding()) {
                resourceId = fontMetricsInt.bottom;
            } else {
                resourceId = fontMetricsInt.descent;
            }
            if (g > Math.abs(resourceId)) {
                textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), textView2.getPaddingRight(), g - resourceId);
            }
        }
        if (c != -1) {
            ha.m2970a(this.f9120d, c);
        }
    }

    /* renamed from: a */
    final void m5754a(Context context, int i) {
        vk a = vk.m6045a(context, i, ni.bS);
        if (a.m6060f(ni.cb)) {
            m5752a(a.m6050a(ni.cb, false));
        }
        m5750a(context, a);
        a.f9419b.recycle();
        Typeface typeface = this.f9118b;
        if (typeface != null) {
            this.f9120d.setTypeface(typeface, this.f9117a);
        }
    }

    /* renamed from: a */
    private final void m5752a(boolean z) {
        this.f9120d.setAllCaps(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m5750a(android.content.Context r11, p000.vk r12) {
        /*
        r10 = this;
        r1 = 0;
        r7 = 1;
        r8 = 0;
        r0 = p000.ni.bY;
        r2 = r10.f9117a;
        r0 = r12.m6055d(r0, r2);
        r10.f9117a = r0;
        r0 = p000.ni.bT;
        r0 = r12.m6060f(r0);
        if (r0 != 0) goto L_0x001d;
    L_0x0015:
        r0 = p000.ni.ca;
        r0 = r12.m6060f(r0);
        if (r0 == 0) goto L_0x0090;
    L_0x001d:
        r10.f9118b = r1;
        r0 = p000.ni.ca;
        r0 = r12.m6060f(r0);
        if (r0 != 0) goto L_0x008c;
    L_0x0027:
        r0 = p000.ni.bT;
        r6 = r0;
    L_0x002a:
        r0 = r11.isRestricted();
        if (r0 != 0) goto L_0x0073;
    L_0x0030:
        r0 = new java.lang.ref.WeakReference;
        r2 = r10.f9120d;
        r0.<init>(r2);
        r5 = new mz;
        r5.<init>(r10, r0);
        r4 = r10.f9117a;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        r0 = r12.f9419b;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        r2 = 0;
        r3 = r0.getResourceId(r6, r2);	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        if (r3 == 0) goto L_0x008a;
    L_0x0047:
        r0 = r12.f9420c;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        if (r0 != 0) goto L_0x0052;
    L_0x004b:
        r0 = new android.util.TypedValue;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        r0.<init>();	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        r12.f9420c = r0;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
    L_0x0052:
        r0 = r12.f9418a;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        r2 = r12.f9420c;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        r9 = r0.isRestricted();	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        if (r9 != 0) goto L_0x0088;
    L_0x005c:
        r1 = r0.getResources();	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        r9 = 1;
        r1.getValue(r3, r2, r9);	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        r0 = p000.ll.m5506a(r0, r1, r2, r3, r4, r5);	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        if (r0 != 0) goto L_0x006a;
    L_0x006a:
        r10.f9118b = r0;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        r0 = r10.f9118b;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
        if (r0 != 0) goto L_0x0086;
    L_0x0070:
        r0 = r7;
    L_0x0071:
        r10.f9119c = r0;	 Catch:{ UnsupportedOperationException -> 0x00b3, NotFoundException -> 0x00b5 }
    L_0x0073:
        r0 = r10.f9118b;
        if (r0 != 0) goto L_0x0085;
    L_0x0077:
        r0 = r12.m6056d(r6);
        if (r0 == 0) goto L_0x0085;
    L_0x007d:
        r1 = r10.f9117a;
        r0 = android.graphics.Typeface.create(r0, r1);
        r10.f9118b = r0;
    L_0x0085:
        return;
    L_0x0086:
        r0 = r8;
        goto L_0x0071;
    L_0x0088:
        r0 = r1;
        goto L_0x006a;
    L_0x008a:
        r0 = r1;
        goto L_0x006a;
    L_0x008c:
        r0 = p000.ni.ca;
        r6 = r0;
        goto L_0x002a;
    L_0x0090:
        r0 = p000.ni.bZ;
        r0 = r12.m6060f(r0);
        if (r0 == 0) goto L_0x0085;
    L_0x0098:
        r10.f9119c = r8;
        r0 = p000.ni.bZ;
        r0 = r12.m6055d(r0, r7);
        switch(r0) {
            case 1: goto L_0x00a4;
            case 2: goto L_0x00ae;
            case 3: goto L_0x00a9;
            default: goto L_0x00a3;
        };
    L_0x00a3:
        goto L_0x0085;
    L_0x00a4:
        r0 = android.graphics.Typeface.SANS_SERIF;
        r10.f9118b = r0;
        goto L_0x0085;
    L_0x00a9:
        r0 = android.graphics.Typeface.MONOSPACE;
        r10.f9118b = r0;
        goto L_0x0085;
    L_0x00ae:
        r0 = android.graphics.Typeface.SERIF;
        r10.f9118b = r0;
        goto L_0x0085;
    L_0x00b3:
        r0 = move-exception;
        goto L_0x0073;
    L_0x00b5:
        r0 = move-exception;
        goto L_0x0073;
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.a(android.content.Context, vk):void");
    }
}
