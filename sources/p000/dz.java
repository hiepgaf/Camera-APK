package p000;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dz */
final class dz {
    /* renamed from: a */
    public final Matrix f3368a = new Matrix();
    /* renamed from: b */
    public final ArrayList f3369b = new ArrayList();
    /* renamed from: c */
    public float f3370c = 0.0f;
    /* renamed from: d */
    public float f3371d = 0.0f;
    /* renamed from: e */
    public float f3372e = 0.0f;
    /* renamed from: f */
    public float f3373f = 1.0f;
    /* renamed from: g */
    public float f3374g = 1.0f;
    /* renamed from: h */
    public float f3375h = 0.0f;
    /* renamed from: i */
    public float f3376i = 0.0f;
    /* renamed from: j */
    public final Matrix f3377j = new Matrix();
    /* renamed from: k */
    public int f3378k;
    /* renamed from: l */
    public int[] f3379l;
    /* renamed from: m */
    public String f3380m = null;

    public dz(dz dzVar, ih ihVar) {
        this.f3370c = dzVar.f3370c;
        this.f3371d = dzVar.f3371d;
        this.f3372e = dzVar.f3372e;
        this.f3373f = dzVar.f3373f;
        this.f3374g = dzVar.f3374g;
        this.f3375h = dzVar.f3375h;
        this.f3376i = dzVar.f3376i;
        this.f3379l = dzVar.f3379l;
        this.f3380m = dzVar.f3380m;
        this.f3378k = dzVar.f3378k;
        String str = this.f3380m;
        if (str != null) {
            ihVar.put(str, this);
        }
        this.f3377j.set(dzVar.f3377j);
        ArrayList arrayList = dzVar.f3369b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof dz) {
                this.f3369b.add(new dz((dz) obj, ihVar));
            } else {
                ea dyVar;
                if (obj instanceof dy) {
                    dyVar = new dy((dy) obj);
                } else if (obj instanceof dx) {
                    dyVar = new dx((dx) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3369b.add(dyVar);
                String str2 = dyVar.f3434o;
                if (str2 != null) {
                    ihVar.put(str2, dyVar);
                }
            }
        }
    }

    public final String getGroupName() {
        return this.f3380m;
    }

    public final Matrix getLocalMatrix() {
        return this.f3377j;
    }

    public final float getPivotX() {
        return this.f3371d;
    }

    public final float getPivotY() {
        return this.f3372e;
    }

    public final float getRotation() {
        return this.f3370c;
    }

    public final float getScaleX() {
        return this.f3373f;
    }

    public final float getScaleY() {
        return this.f3374g;
    }

    public final float getTranslateX() {
        return this.f3375h;
    }

    public final float getTranslateY() {
        return this.f3376i;
    }

    public final void setPivotX(float f) {
        if (f != this.f3371d) {
            this.f3371d = f;
            m1693a();
        }
    }

    public final void setPivotY(float f) {
        if (f != this.f3372e) {
            this.f3372e = f;
            m1693a();
        }
    }

    public final void setRotation(float f) {
        if (f != this.f3370c) {
            this.f3370c = f;
            m1693a();
        }
    }

    public final void setScaleX(float f) {
        if (f != this.f3373f) {
            this.f3373f = f;
            m1693a();
        }
    }

    public final void setScaleY(float f) {
        if (f != this.f3374g) {
            this.f3374g = f;
            m1693a();
        }
    }

    public final void setTranslateX(float f) {
        if (f != this.f3375h) {
            this.f3375h = f;
            m1693a();
        }
    }

    public final void setTranslateY(float f) {
        if (f != this.f3376i) {
            this.f3376i = f;
            m1693a();
        }
    }

    /* renamed from: a */
    final void m1693a() {
        this.f3377j.reset();
        this.f3377j.postTranslate(-this.f3371d, -this.f3372e);
        this.f3377j.postScale(this.f3373f, this.f3374g);
        this.f3377j.postRotate(this.f3370c, 0.0f, 0.0f);
        this.f3377j.postTranslate(this.f3375h + this.f3371d, this.f3376i + this.f3372e);
    }
}
