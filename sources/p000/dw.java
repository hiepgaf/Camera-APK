package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.AttributeSet;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: dw */
public final class dw extends dv {
    /* renamed from: b */
    public static final Mode f14632b = Mode.SRC_IN;
    /* renamed from: c */
    private ec f14633c;
    /* renamed from: d */
    private PorterDuffColorFilter f14634d;
    /* renamed from: e */
    private ColorFilter f14635e;
    /* renamed from: f */
    private boolean f14636f;
    /* renamed from: g */
    private boolean f14637g;
    /* renamed from: h */
    private final float[] f14638h;
    /* renamed from: i */
    private final Matrix f14639i;
    /* renamed from: j */
    private final Rect f14640j;

    public dw() {
        this.f14637g = true;
        this.f14638h = new float[9];
        this.f14639i = new Matrix();
        this.f14640j = new Rect();
        this.f14633c = new ec();
    }

    dw(ec ecVar) {
        this.f14637g = true;
        this.f14638h = new float[9];
        this.f14639i = new Matrix();
        this.f14640j = new Rect();
        this.f14633c = ecVar;
        this.f14634d = m9483a(ecVar.f3524c, ecVar.f3525d);
    }

    /* renamed from: a */
    static int m9482a(int i, float f) {
        return (16777215 & i) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public final /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public final boolean canApplyTheme() {
        if (this.a != null) {
            this.a.canApplyTheme();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void draw(Canvas canvas) {
        if (this.a != null) {
            this.a.draw(canvas);
            return;
        }
        copyBounds(this.f14640j);
        if (this.f14640j.width() > 0 && this.f14640j.height() > 0) {
            ColorFilter colorFilter = this.f14635e;
            if (colorFilter == null) {
                colorFilter = this.f14634d;
            }
            canvas.getMatrix(this.f14639i);
            this.f14639i.getValues(this.f14638h);
            float abs = Math.abs(this.f14638h[0]);
            float abs2 = Math.abs(this.f14638h[4]);
            float abs3 = Math.abs(this.f14638h[1]);
            float abs4 = Math.abs(this.f14638h[3]);
            if (abs3 != 0.0f) {
                abs2 = 1.0f;
                abs = 1.0f;
            } else if (abs4 != 0.0f) {
                abs2 = 1.0f;
                abs = 1.0f;
            }
            int width = this.f14640j.width();
            int height = this.f14640j.height();
            int min = Math.min(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX, (int) (abs * ((float) width)));
            width = Math.min(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX, (int) (abs2 * ((float) height)));
            if (min > 0 && width > 0) {
                boolean z;
                ec ecVar;
                Rect rect;
                Paint paint;
                height = canvas.save();
                Rect rect2 = this.f14640j;
                canvas.translate((float) rect2.left, (float) rect2.top);
                if (!isAutoMirrored()) {
                    z = false;
                } else if (getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    canvas.translate((float) this.f14640j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f14640j.offsetTo(0, 0);
                ec ecVar2 = this.f14633c;
                Bitmap bitmap = ecVar2.f3527f;
                if (bitmap != null) {
                    if (min != bitmap.getWidth()) {
                        z = false;
                    } else if (width == ecVar2.f3527f.getHeight()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                    }
                    if (this.f14637g) {
                        this.f14633c.m1747a(min, width);
                    } else {
                        ecVar = this.f14633c;
                        if (!ecVar.f3532k) {
                            z = false;
                        } else if (ecVar.f3528g == ecVar.f3524c) {
                            z = false;
                        } else if (ecVar.f3529h == ecVar.f3525d) {
                            z = false;
                        } else if (ecVar.f3531j == ecVar.f3526e) {
                            z = false;
                        } else if (ecVar.f3530i != ecVar.f3523b.getRootAlpha()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            this.f14633c.m1747a(min, width);
                            ecVar = this.f14633c;
                            ecVar.f3528g = ecVar.f3524c;
                            ecVar.f3529h = ecVar.f3525d;
                            ecVar.f3530i = ecVar.f3523b.getRootAlpha();
                            ecVar.f3531j = ecVar.f3526e;
                            ecVar.f3532k = false;
                        }
                    }
                    ecVar = this.f14633c;
                    rect = this.f14640j;
                    if (ecVar.f3523b.getRootAlpha() >= Illuminant.kOther || colorFilter != null) {
                        if (ecVar.f3533l == null) {
                            ecVar.f3533l = new Paint();
                            ecVar.f3533l.setFilterBitmap(true);
                        }
                        ecVar.f3533l.setAlpha(ecVar.f3523b.getRootAlpha());
                        ecVar.f3533l.setColorFilter(colorFilter);
                        paint = ecVar.f3533l;
                    } else {
                        paint = null;
                    }
                    canvas.drawBitmap(ecVar.f3527f, null, rect, paint);
                    canvas.restoreToCount(height);
                }
                ecVar2.f3527f = Bitmap.createBitmap(min, width, Config.ARGB_8888);
                ecVar2.f3532k = true;
                if (this.f14637g) {
                    ecVar = this.f14633c;
                    if (!ecVar.f3532k) {
                        z = false;
                    } else if (ecVar.f3528g == ecVar.f3524c) {
                        z = false;
                    } else if (ecVar.f3529h == ecVar.f3525d) {
                        z = false;
                    } else if (ecVar.f3531j == ecVar.f3526e) {
                        z = false;
                    } else if (ecVar.f3530i != ecVar.f3523b.getRootAlpha()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        this.f14633c.m1747a(min, width);
                        ecVar = this.f14633c;
                        ecVar.f3528g = ecVar.f3524c;
                        ecVar.f3529h = ecVar.f3525d;
                        ecVar.f3530i = ecVar.f3523b.getRootAlpha();
                        ecVar.f3531j = ecVar.f3526e;
                        ecVar.f3532k = false;
                    }
                } else {
                    this.f14633c.m1747a(min, width);
                }
                ecVar = this.f14633c;
                rect = this.f14640j;
                if (ecVar.f3523b.getRootAlpha() >= Illuminant.kOther) {
                }
                if (ecVar.f3533l == null) {
                    ecVar.f3533l = new Paint();
                    ecVar.f3533l.setFilterBitmap(true);
                }
                ecVar.f3533l.setAlpha(ecVar.f3523b.getRootAlpha());
                ecVar.f3533l.setColorFilter(colorFilter);
                paint = ecVar.f3533l;
                canvas.drawBitmap(ecVar.f3527f, null, rect, paint);
                canvas.restoreToCount(height);
            }
        }
    }

    public final int getAlpha() {
        if (this.a != null) {
            return this.a.getAlpha();
        }
        return this.f14633c.f3523b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        if (this.a != null) {
            return this.a.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f14633c.getChangingConfigurations();
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final ConstantState getConstantState() {
        if (this.a != null) {
            return new ed(this.a.getConstantState());
        }
        this.f14633c.f3522a = getChangingConfigurations();
        return this.f14633c;
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final int getIntrinsicHeight() {
        if (this.a != null) {
            return this.a.getIntrinsicHeight();
        }
        return (int) this.f14633c.f3523b.f3487f;
    }

    public final int getIntrinsicWidth() {
        if (this.a != null) {
            return this.a.getIntrinsicWidth();
        }
        return (int) this.f14633c.f3523b.f3486e;
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.a != null ? this.a.getOpacity() : -3;
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.a != null) {
            this.a.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.a != null) {
            this.a.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        ec ecVar = this.f14633c;
        ecVar.f3523b = new eb();
        TypedArray a = na.m14134a(resources, theme, attributeSet, dr.f3204a);
        ec ecVar2 = this.f14633c;
        eb ebVar = ecVar2.f3523b;
        int b = na.m14137b(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        switch (b) {
            case 3:
                mode = Mode.SRC_OVER;
                break;
            case 5:
                mode = Mode.SRC_IN;
                break;
            case 9:
                mode = Mode.SRC_ATOP;
                break;
            case 14:
                mode = Mode.MULTIPLY;
                break;
            case 15:
                mode = Mode.SCREEN;
                break;
            case 16:
                mode = Mode.ADD;
                break;
        }
        ecVar2.f3525d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            ecVar2.f3524c = colorStateList;
        }
        boolean z = ecVar2.f3526e;
        if (na.m14136a(xmlPullParser, "autoMirrored")) {
            z = a.getBoolean(5, z);
        }
        ecVar2.f3526e = z;
        ebVar.f3488g = na.m14131a(a, xmlPullParser, "viewportWidth", 7, ebVar.f3488g);
        ebVar.f3489h = na.m14131a(a, xmlPullParser, "viewportHeight", 8, ebVar.f3489h);
        StringBuilder stringBuilder;
        if (ebVar.f3488g <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else if (ebVar.f3489h <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else {
            ebVar.f3486e = a.getDimension(3, ebVar.f3486e);
            ebVar.f3487f = a.getDimension(2, ebVar.f3487f);
            if (ebVar.f3486e <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a.getPositionDescription());
                stringBuilder.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else if (ebVar.f3487f <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a.getPositionDescription());
                stringBuilder.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else {
                ebVar.setAlpha(na.m14131a(a, xmlPullParser, "alpha", 4, ebVar.getAlpha()));
                String string = a.getString(0);
                if (string != null) {
                    ebVar.f3490i = string;
                    ebVar.f3491j.put(string, ebVar);
                }
                a.recycle();
                ecVar.f3522a = getChangingConfigurations();
                ecVar.f3532k = true;
                ecVar2 = this.f14633c;
                ebVar = ecVar2.f3523b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(ebVar.f3485d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                Object obj = 1;
                while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    Object obj2;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        dz dzVar = (dz) arrayDeque.peek();
                        TypedArray a2;
                        if ("path".equals(name)) {
                            dy dyVar = new dy();
                            a2 = na.m14134a(resources, theme, attributeSet, dr.f3206c);
                            dyVar.f14712a = null;
                            if (na.m14136a(xmlPullParser, "pathData")) {
                                String string2 = a2.getString(0);
                                if (string2 != null) {
                                    dyVar.o = string2;
                                }
                                string2 = a2.getString(2);
                                if (string2 != null) {
                                    dyVar.n = qr.m5736a(string2);
                                }
                                dyVar.f14715d = na.m14133a(a2, xmlPullParser, "fillColor", 1, dyVar.f14715d);
                                dyVar.f14718g = na.m14131a(a2, xmlPullParser, "fillAlpha", 12, dyVar.f14718g);
                                int b2 = na.m14137b(a2, xmlPullParser, "strokeLineCap", 8, -1);
                                Cap cap = dyVar.f14722k;
                                switch (b2) {
                                    case 0:
                                        cap = Cap.BUTT;
                                        break;
                                    case 1:
                                        cap = Cap.ROUND;
                                        break;
                                    case 2:
                                        cap = Cap.SQUARE;
                                        break;
                                }
                                dyVar.f14722k = cap;
                                b2 = na.m14137b(a2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Join join = dyVar.f14723l;
                                switch (b2) {
                                    case 0:
                                        join = Join.MITER;
                                        break;
                                    case 1:
                                        join = Join.ROUND;
                                        break;
                                    case 2:
                                        join = Join.BEVEL;
                                        break;
                                }
                                dyVar.f14723l = join;
                                dyVar.f14724m = na.m14131a(a2, xmlPullParser, "strokeMiterLimit", 10, dyVar.f14724m);
                                dyVar.f14713b = na.m14133a(a2, xmlPullParser, "strokeColor", 3, dyVar.f14713b);
                                dyVar.f14716e = na.m14131a(a2, xmlPullParser, "strokeAlpha", 11, dyVar.f14716e);
                                dyVar.f14714c = na.m14131a(a2, xmlPullParser, "strokeWidth", 4, dyVar.f14714c);
                                dyVar.f14720i = na.m14131a(a2, xmlPullParser, "trimPathEnd", 6, dyVar.f14720i);
                                dyVar.f14721j = na.m14131a(a2, xmlPullParser, "trimPathOffset", 7, dyVar.f14721j);
                                dyVar.f14719h = na.m14131a(a2, xmlPullParser, "trimPathStart", 5, dyVar.f14719h);
                                dyVar.f14717f = na.m14137b(a2, xmlPullParser, "fillType", 13, dyVar.f14717f);
                            }
                            a2.recycle();
                            dzVar.f3369b.add(dyVar);
                            if (dyVar.getPathName() != null) {
                                ebVar.f3491j.put(dyVar.getPathName(), dyVar);
                            }
                            ecVar2.f3522a |= dyVar.p;
                            obj2 = null;
                        } else if ("clip-path".equals(name)) {
                            dx dxVar = new dx();
                            if (na.m14136a(xmlPullParser, "pathData")) {
                                a2 = na.m14134a(resources, theme, attributeSet, dr.f3207d);
                                r13 = a2.getString(0);
                                if (r13 != null) {
                                    dxVar.o = r13;
                                }
                                r13 = a2.getString(1);
                                if (r13 != null) {
                                    dxVar.n = qr.m5736a(r13);
                                }
                                a2.recycle();
                            }
                            dzVar.f3369b.add(dxVar);
                            if (dxVar.getPathName() != null) {
                                ebVar.f3491j.put(dxVar.getPathName(), dxVar);
                            }
                            ecVar2.f3522a |= dxVar.p;
                            obj2 = obj;
                        } else if ("group".equals(name)) {
                            dz dzVar2 = new dz();
                            a2 = na.m14134a(resources, theme, attributeSet, dr.f3205b);
                            dzVar2.f3379l = null;
                            dzVar2.f3370c = na.m14131a(a2, xmlPullParser, "rotation", 5, dzVar2.f3370c);
                            dzVar2.f3371d = a2.getFloat(1, dzVar2.f3371d);
                            dzVar2.f3372e = a2.getFloat(2, dzVar2.f3372e);
                            dzVar2.f3373f = na.m14131a(a2, xmlPullParser, "scaleX", 3, dzVar2.f3373f);
                            dzVar2.f3374g = na.m14131a(a2, xmlPullParser, "scaleY", 4, dzVar2.f3374g);
                            dzVar2.f3375h = na.m14131a(a2, xmlPullParser, "translateX", 6, dzVar2.f3375h);
                            dzVar2.f3376i = na.m14131a(a2, xmlPullParser, "translateY", 7, dzVar2.f3376i);
                            r13 = a2.getString(0);
                            if (r13 != null) {
                                dzVar2.f3380m = r13;
                            }
                            dzVar2.m1693a();
                            a2.recycle();
                            dzVar.f3369b.add(dzVar2);
                            arrayDeque.push(dzVar2);
                            if (dzVar2.getGroupName() != null) {
                                ebVar.f3491j.put(dzVar2.getGroupName(), dzVar2);
                            }
                            ecVar2.f3522a |= dzVar2.f3378k;
                            obj2 = obj;
                        } else {
                            obj2 = obj;
                        }
                    } else if (eventType != 3) {
                        obj2 = obj;
                    } else if ("group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                        obj2 = obj;
                    } else {
                        obj2 = obj;
                    }
                    obj = obj2;
                    eventType = xmlPullParser.next();
                }
                if (obj != null) {
                    throw new XmlPullParserException("no path defined");
                }
                this.f14634d = m9483a(ecVar.f3524c, ecVar.f3525d);
            }
        }
    }

    public final void invalidateSelf() {
        if (this.a != null) {
            this.a.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        if (this.a != null) {
            return this.a.isAutoMirrored();
        }
        return this.f14633c.f3526e;
    }

    public final boolean isStateful() {
        boolean z = true;
        if (this.a != null) {
            return this.a.isStateful();
        }
        if (!super.isStateful()) {
            ec ecVar = this.f14633c;
            if (ecVar != null) {
                ColorStateList colorStateList = ecVar.f3524c;
                if (colorStateList == null) {
                    z = false;
                } else if (!colorStateList.isStateful()) {
                    return false;
                }
            }
            z = false;
        }
        return z;
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (this.a != null) {
            this.a.mutate();
        } else if (!this.f14636f && super.mutate() == this) {
            this.f14633c = new ec(this.f14633c);
            this.f14636f = true;
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect) {
        if (this.a != null) {
            this.a.setBounds(rect);
        }
    }

    protected final boolean onStateChange(int[] iArr) {
        if (this.a != null) {
            return this.a.setState(iArr);
        }
        ec ecVar = this.f14633c;
        ColorStateList colorStateList = ecVar.f3524c;
        if (colorStateList != null) {
            Mode mode = ecVar.f3525d;
            if (mode != null) {
                this.f14634d = m9483a(colorStateList, mode);
                invalidateSelf();
                return true;
            }
        }
        return false;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.a != null) {
            this.a.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.a != null) {
            this.a.setAlpha(i);
        } else if (this.f14633c.f3523b.getRootAlpha() != i) {
            this.f14633c.f3523b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.a != null) {
            this.a.setAutoMirrored(z);
        } else {
            this.f14633c.f3526e = z;
        }
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.a != null) {
            this.a.setColorFilter(colorFilter);
            return;
        }
        this.f14635e = colorFilter;
        invalidateSelf();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final void setTint(int i) {
        if (this.a != null) {
            this.a.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.a != null) {
            this.a.setTintList(colorStateList);
            return;
        }
        ec ecVar = this.f14633c;
        if (ecVar.f3524c != colorStateList) {
            ecVar.f3524c = colorStateList;
            this.f14634d = m9483a(colorStateList, ecVar.f3525d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.a != null) {
            this.a.setTintMode(mode);
            return;
        }
        ec ecVar = this.f14633c;
        if (ecVar.f3525d != mode) {
            ecVar.f3525d = mode;
            this.f14634d = m9483a(ecVar.f3524c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.a != null) {
            return this.a.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.a != null) {
            this.a.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a */
    private final PorterDuffColorFilter m9483a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
