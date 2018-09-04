package p000;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* renamed from: qi */
public final class qi {
    /* renamed from: a */
    public final /* synthetic */ RecyclerView f9042a;

    public qi(RecyclerView recyclerView) {
        this.f9042a = recyclerView;
    }

    /* renamed from: a */
    final void m5709a(qj qjVar) {
        switch (qjVar.f9043a) {
            case 1:
                this.f9042a.f683k.mo811b();
                return;
            case 2:
                this.f9042a.f683k.mo817e();
                return;
            case 4:
                this.f9042a.f683k.mo819f();
                return;
            case 8:
                this.f9042a.f683k.mo815d();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final ux m5706a(int i) {
        ux c;
        RecyclerView recyclerView = this.f9042a;
        int childCount = recyclerView.f678f.f9139a.f9144a.getChildCount();
        int i2 = 0;
        ux uxVar = null;
        while (i2 < childCount) {
            c = RecyclerView.m428c(recyclerView.f678f.m5768d(i2));
            if (c == null) {
                c = uxVar;
            } else if (c.m6029j()) {
                c = uxVar;
            } else if (c.f9371c != i) {
                c = uxVar;
            } else if (!recyclerView.f678f.m5767c(c.f9369a)) {
                break;
            }
            i2++;
            uxVar = c;
        }
        c = uxVar;
        if (c == null) {
            return null;
        }
        if (this.f9042a.f678f.m5767c(c.f9369a)) {
            return null;
        }
        return c;
    }

    /* renamed from: a */
    public final void m5708a(int i, int i2, Object obj) {
        int i3;
        RecyclerView recyclerView = this.f9042a;
        int childCount = recyclerView.f678f.f9139a.f9144a.getChildCount();
        int i4 = i + i2;
        for (i3 = 0; i3 < childCount; i3++) {
            View d = recyclerView.f678f.m5768d(i3);
            ux c = RecyclerView.m428c(d);
            if (!(c == null || c.m6035p())) {
                int i5 = c.f9371c;
                if (i5 >= i && i5 < i4) {
                    c.m6014a(2);
                    c.m6017a(obj);
                    ((uk) d.getLayoutParams()).f9326e = true;
                }
            }
        }
        up upVar = recyclerView.f676d;
        for (i3 = upVar.f9336c.size() - 1; i3 >= 0; i3--) {
            ux uxVar = (ux) upVar.f9336c.get(i3);
            if (uxVar != null) {
                childCount = uxVar.f9371c;
                if (childCount >= i && childCount < i4) {
                    uxVar.m6014a(2);
                    upVar.m6003b(i3);
                }
            }
        }
        this.f9042a.f659D = true;
    }

    /* renamed from: a */
    public final void m5707a(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.f9042a;
        int childCount = recyclerView.f678f.f9139a.f9144a.getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            ux c = RecyclerView.m428c(recyclerView.f678f.m5768d(i3));
            if (!(c == null || c.m6035p() || c.f9371c < i)) {
                c.m6016a(i2, false);
                recyclerView.f656A.f9352f = true;
            }
        }
        up upVar = recyclerView.f676d;
        int size = upVar.f9336c.size();
        for (i3 = 0; i3 < size; i3++) {
            ux uxVar = (ux) upVar.f9336c.get(i3);
            if (uxVar != null && uxVar.f9371c >= i) {
                uxVar.m6016a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f9042a.f658C = true;
    }

    /* renamed from: b */
    public final void m5710b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f9042a;
        int childCount = recyclerView.f678f.f9139a.f9144a.getChildCount();
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i6;
        if (i < i2) {
            i6 = i2;
        } else {
            i6 = i;
        }
        if (i < i2) {
            i4 = i;
        } else {
            i4 = i2;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            ux c = RecyclerView.m428c(recyclerView.f678f.m5768d(i7));
            if (c != null) {
                i5 = c.f9371c;
                if (i5 >= i4 && i5 <= r4) {
                    if (i5 == i) {
                        c.m6016a(i2 - i, false);
                    } else {
                        c.m6016a(i3, false);
                    }
                    recyclerView.f656A.f9352f = true;
                }
            }
        }
        up upVar = recyclerView.f676d;
        i5 = upVar.f9336c.size();
        for (childCount = 0; childCount < i5; childCount++) {
            ux uxVar = (ux) upVar.f9336c.get(childCount);
            if (uxVar != null) {
                int i8 = uxVar.f9371c;
                if (i8 >= i4 && i8 <= r4) {
                    if (i8 == i) {
                        uxVar.m6016a(i2 - i, false);
                    } else {
                        uxVar.m6016a(i3, false);
                    }
                }
            }
        }
        recyclerView.requestLayout();
        this.f9042a.f658C = true;
    }

    /* renamed from: c */
    public final void m5711c(int i, int i2) {
        this.f9042a.m447a(i, i2, true);
        RecyclerView recyclerView = this.f9042a;
        recyclerView.f658C = true;
        uv uvVar = recyclerView.f656A;
        uvVar.f9349c += i2;
    }
}
