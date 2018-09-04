package p000;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ux */
public class ux {
    /* renamed from: p */
    private static final List f9368p = Collections.EMPTY_LIST;
    /* renamed from: a */
    public final View f9369a;
    /* renamed from: b */
    public WeakReference f9370b;
    /* renamed from: c */
    public int f9371c = -1;
    /* renamed from: d */
    public int f9372d = -1;
    /* renamed from: e */
    public long f9373e = -1;
    /* renamed from: f */
    public int f9374f = -1;
    /* renamed from: g */
    public int f9375g = -1;
    /* renamed from: h */
    public ux f9376h = null;
    /* renamed from: i */
    public ux f9377i = null;
    /* renamed from: j */
    public int f9378j;
    /* renamed from: k */
    public up f9379k = null;
    /* renamed from: l */
    public boolean f9380l = false;
    /* renamed from: m */
    public int f9381m = 0;
    /* renamed from: n */
    public int f9382n = -1;
    /* renamed from: o */
    public RecyclerView f9383o;
    /* renamed from: q */
    private List f9384q = null;
    /* renamed from: r */
    private List f9385r = null;
    /* renamed from: s */
    private int f9386s = 0;

    public ux(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f9369a = view;
    }

    /* renamed from: a */
    public final void m6017a(Object obj) {
        if (obj == null) {
            m6014a(1024);
        } else if ((this.f9378j & 1024) == 0) {
            if (this.f9384q == null) {
                this.f9384q = new ArrayList();
                this.f9385r = Collections.unmodifiableList(this.f9384q);
            }
            this.f9384q.add(obj);
        }
    }

    /* renamed from: a */
    public final void m6014a(int i) {
        this.f9378j |= i;
    }

    /* renamed from: a */
    public final void m6013a() {
        this.f9372d = -1;
        this.f9375g = -1;
    }

    /* renamed from: b */
    final void m6020b() {
        List list = this.f9384q;
        if (list != null) {
            list.clear();
        }
        this.f9378j &= -1025;
    }

    /* renamed from: c */
    final void m6022c() {
        this.f9378j &= -33;
    }

    /* renamed from: d */
    public final void m6023d() {
        this.f9378j &= -257;
    }

    /* renamed from: e */
    public final int m6024e() {
        RecyclerView recyclerView = this.f9383o;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.m462c(this);
    }

    /* renamed from: f */
    public final int m6025f() {
        int i = this.f9375g;
        return i == -1 ? this.f9371c : i;
    }

    /* renamed from: g */
    public final List m6026g() {
        if ((this.f9378j & 1024) != 0) {
            return f9368p;
        }
        List list = this.f9384q;
        if (list == null || list.size() == 0) {
            return f9368p;
        }
        return this.f9385r;
    }

    /* renamed from: b */
    public final boolean m6021b(int i) {
        return (this.f9378j & i) != 0;
    }

    /* renamed from: h */
    public final boolean m6027h() {
        return (this.f9378j & 4) != 0;
    }

    /* renamed from: i */
    public final boolean m6028i() {
        return (this.f9378j & 16) == 0 && !jm.m4588v(this.f9369a);
    }

    /* renamed from: j */
    public final boolean m6029j() {
        return (this.f9378j & 8) != 0;
    }

    /* renamed from: k */
    final boolean m6030k() {
        return this.f9379k != null;
    }

    /* renamed from: l */
    public final boolean m6031l() {
        return (this.f9378j & 256) != 0;
    }

    /* renamed from: m */
    public final boolean m6032m() {
        return (this.f9378j & 2) != 0;
    }

    /* renamed from: n */
    final boolean m6033n() {
        return (this.f9378j & 2) != 0;
    }

    /* renamed from: a */
    public final void m6016a(int i, boolean z) {
        if (this.f9372d == -1) {
            this.f9372d = this.f9371c;
        }
        if (this.f9375g == -1) {
            this.f9375g = this.f9371c;
        }
        if (z) {
            this.f9375g += i;
        }
        this.f9371c += i;
        if (this.f9369a.getLayoutParams() != null) {
            ((uk) this.f9369a.getLayoutParams()).f9326e = true;
        }
    }

    /* renamed from: o */
    final void m6034o() {
        this.f9378j = 0;
        this.f9371c = -1;
        this.f9372d = -1;
        this.f9373e = -1;
        this.f9375g = -1;
        this.f9386s = 0;
        this.f9376h = null;
        this.f9377i = null;
        m6020b();
        this.f9381m = 0;
        this.f9382n = -1;
        RecyclerView.m427b(this);
    }

    /* renamed from: a */
    public final void m6015a(int i, int i2) {
        this.f9378j = (this.f9378j & (i2 ^ -1)) | (i & i2);
    }

    /* renamed from: a */
    public final void m6019a(boolean z) {
        int i;
        if (z) {
            i = this.f9386s - 1;
        } else {
            i = this.f9386s + 1;
        }
        this.f9386s = i;
        i = this.f9386s;
        if (i < 0) {
            this.f9386s = 0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            stringBuilder.append(this);
            Log.e("View", stringBuilder.toString());
        } else if (!z && i == 1) {
            this.f9378j |= 16;
        } else if (z && i == 0) {
            this.f9378j &= -17;
        }
    }

    /* renamed from: a */
    final void m6018a(up upVar, boolean z) {
        this.f9379k = upVar;
        this.f9380l = z;
    }

    /* renamed from: p */
    public final boolean m6035p() {
        return (this.f9378j & 128) != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ViewHolder{");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(" position=");
        stringBuilder.append(this.f9371c);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f9373e);
        stringBuilder.append(", oldPos=");
        stringBuilder.append(this.f9372d);
        stringBuilder.append(", pLpos:");
        stringBuilder.append(this.f9375g);
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
        if (m6030k()) {
            String str;
            stringBuilder2.append(" scrap ");
            if (this.f9380l) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            stringBuilder2.append(str);
        }
        if (m6027h()) {
            stringBuilder2.append(" invalid");
        }
        if ((this.f9378j & 1) == 0) {
            stringBuilder2.append(" unbound");
        }
        if (m6033n()) {
            stringBuilder2.append(" update");
        }
        if (m6029j()) {
            stringBuilder2.append(" removed");
        }
        if (m6035p()) {
            stringBuilder2.append(" ignored");
        }
        if (m6031l()) {
            stringBuilder2.append(" tmpDetached");
        }
        if (!m6028i()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(" not recyclable(");
            stringBuilder.append(this.f9386s);
            stringBuilder.append(")");
            stringBuilder2.append(stringBuilder.toString());
        }
        int i;
        if ((this.f9378j & 512) != 0) {
            i = 1;
        } else if (m6027h()) {
            i = 1;
        } else {
            Object obj = null;
        }
        if (obj != null) {
            stringBuilder2.append(" undefined adapter position");
        }
        if (this.f9369a.getParent() == null) {
            stringBuilder2.append(" no parent");
        }
        stringBuilder2.append("}");
        return stringBuilder2.toString();
    }

    /* renamed from: q */
    final void m6036q() {
        this.f9379k.m6005b(this);
    }

    /* renamed from: r */
    final boolean m6037r() {
        return (this.f9378j & 32) != 0;
    }
}
