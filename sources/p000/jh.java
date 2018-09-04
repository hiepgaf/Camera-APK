package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* renamed from: jh */
public final class jh {
    /* renamed from: a */
    public boolean f7820a;
    /* renamed from: b */
    private ViewParent f7821b;
    /* renamed from: c */
    private ViewParent f7822c;
    /* renamed from: d */
    private final View f7823d;
    /* renamed from: e */
    private int[] f7824e;

    public jh(View view) {
        this.f7823d = view;
    }

    /* renamed from: a */
    public final boolean m4483a(float f, float f2, boolean z) {
        if (!this.f7820a) {
            return false;
        }
        ViewParent c = m4480c(0);
        if (c != null) {
            return ha.m2974a(c, this.f7823d, f, f2, z);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m4482a(float f, float f2) {
        if (!this.f7820a) {
            return false;
        }
        ViewParent c = m4480c(0);
        if (c != null) {
            return ha.m2973a(c, this.f7823d, f, f2);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m4487a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.f7820a) {
            ViewParent c = m4480c(i3);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                int i4;
                int i5;
                int[] iArr3;
                if (iArr2 != null) {
                    this.f7823d.getLocationInWindow(iArr2);
                    int i6 = iArr2[0];
                    i4 = iArr2[1];
                    i5 = i6;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.f7824e == null) {
                        this.f7824e = new int[2];
                    }
                    iArr3 = this.f7824e;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                View view = this.f7823d;
                if (c instanceof ji) {
                    ((ji) c).mo136a(view, i, i2, iArr3, i3);
                } else if (i3 == 0) {
                    try {
                        c.onNestedPreScroll(view, i, i2, iArr3);
                    } catch (Throwable e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ViewParent ");
                        stringBuilder.append(c);
                        stringBuilder.append(" does not implement interface ");
                        stringBuilder.append("method onNestedPreScroll");
                        Log.e("ViewParentCompat", stringBuilder.toString(), e);
                    }
                }
                if (iArr2 != null) {
                    this.f7823d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr3[0] == 0 && iArr3[1] == 0) {
                    return false;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m4486a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        if (this.f7820a) {
            ViewParent c = m4480c(i5);
            if (c == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                int i6;
                int i7;
                if (iArr != null) {
                    this.f7823d.getLocationInWindow(iArr);
                    int i8 = iArr[0];
                    i6 = iArr[1];
                    i7 = i8;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                View view = this.f7823d;
                if (c instanceof ji) {
                    ((ji) c).mo135a(view, i, i2, i3, i4, i5);
                } else if (i5 == 0) {
                    try {
                        c.onNestedScroll(view, i, i2, i3, i4);
                    } catch (Throwable e) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ViewParent ");
                        stringBuilder.append(c);
                        stringBuilder.append(" does not implement interface ");
                        stringBuilder.append("method onNestedScroll");
                        Log.e("ViewParentCompat", stringBuilder.toString(), e);
                    }
                }
                if (iArr != null) {
                    this.f7823d.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i6;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final ViewParent m4480c(int i) {
        switch (i) {
            case 0:
                return this.f7821b;
            case 1:
                return this.f7822c;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final boolean m4484a(int i) {
        return m4480c(i) != null;
    }

    /* renamed from: a */
    public final void m4481a(boolean z) {
        if (this.f7820a) {
            jm.m4546E(this.f7823d);
        }
        this.f7820a = z;
    }

    /* renamed from: a */
    private final void m4479a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f7821b = viewParent;
                return;
            case 1:
                this.f7822c = viewParent;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final boolean m4485a(int i, int i2) {
        if (m4484a(i2)) {
            return true;
        }
        if (this.f7820a) {
            View view = this.f7823d;
            for (ViewParent parent = this.f7823d.getParent(); parent != null; parent = parent.getParent()) {
                if (ha.m2975a(parent, view, this.f7823d, i, i2)) {
                    m4479a(i2, parent);
                    View view2 = this.f7823d;
                    if (parent instanceof ji) {
                        ((ji) parent).mo139b(view2, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view2, i);
                        } catch (Throwable e) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("ViewParent ");
                            stringBuilder.append(parent);
                            stringBuilder.append(" does not implement interface ");
                            stringBuilder.append("method onNestedScrollAccepted");
                            Log.e("ViewParentCompat", stringBuilder.toString(), e);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m4488b(int i) {
        ViewParent c = m4480c(i);
        if (c != null) {
            View view = this.f7823d;
            if (c instanceof ji) {
                ((ji) c).mo138b(view, i);
            } else if (i == 0) {
                try {
                    c.onStopNestedScroll(view);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append(c);
                    stringBuilder.append(" does not implement interface ");
                    stringBuilder.append("method onStopNestedScroll");
                    Log.e("ViewParentCompat", stringBuilder.toString(), e);
                }
            }
            m4479a(i, null);
        }
    }
}
