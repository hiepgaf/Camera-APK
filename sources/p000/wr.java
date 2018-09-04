package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: wr */
public class wr implements Iterator {
    /* renamed from: a */
    public xn f9470a = null;
    /* renamed from: b */
    private int f9471b = 0;
    /* renamed from: c */
    private ww f9472c;
    /* renamed from: d */
    private String f9473d;
    /* renamed from: e */
    private Iterator f9474e = null;
    /* renamed from: f */
    private int f9475f = 0;
    /* renamed from: g */
    private Iterator f9476g = Collections.EMPTY_LIST.iterator();
    /* renamed from: h */
    private final /* synthetic */ wc f9477h;

    public wr(wc wcVar) {
        this.f9477h = wcVar;
    }

    public wr(wc wcVar, ww wwVar, String str, int i) {
        this.f9477h = wcVar;
        this.f9472c = wwVar;
        this.f9471b = 0;
        if (wwVar.m6194d().m6239b(kvl.UNSET_ENUM_VALUE)) {
            wcVar.f9445b = wwVar.f9480a;
        }
        this.f9473d = m6170a(wwVar, str, i);
    }

    /* renamed from: a */
    protected final String m6170a(ww wwVar, String str, int i) {
        if (wwVar.f9482c == null || wwVar.m6194d().m6239b(kvl.UNSET_ENUM_VALUE)) {
            return null;
        }
        String valueOf;
        String str2;
        if (wwVar.f9482c.m6194d().m6239b(512)) {
            valueOf = String.valueOf(i);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 2);
            stringBuilder.append("[");
            stringBuilder.append(valueOf);
            stringBuilder.append("]");
            valueOf = stringBuilder.toString();
            str2 = "";
        } else {
            valueOf = wwVar.f9480a;
            str2 = "/";
        }
        if (str == null || str.length() == 0) {
            return valueOf;
        }
        if (!this.f9477h.f9444a.m6239b(1024)) {
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + String.valueOf(str2).length()) + String.valueOf(valueOf).length());
            stringBuilder2.append(str);
            stringBuilder2.append(str2);
            stringBuilder2.append(valueOf);
            return stringBuilder2.toString();
        } else if (valueOf.startsWith("?")) {
            return valueOf.substring(1);
        } else {
            return valueOf;
        }
    }

    /* renamed from: a */
    protected static xn m6168a(ww wwVar, String str, String str2) {
        Object obj;
        if (wwVar.m6194d().m6239b(kvl.UNSET_ENUM_VALUE)) {
            obj = null;
        } else {
            obj = wwVar.f9481b;
        }
        return new xn(str, str2, obj, wwVar);
    }

    public boolean hasNext() {
        if (this.f9470a != null) {
            return true;
        }
        int i = this.f9471b;
        if (i == 0) {
            this.f9471b = 1;
            if (this.f9472c.f9482c == null || (this.f9477h.f9444a.m6239b(512) && this.f9472c.m6197f())) {
                return hasNext();
            }
            this.f9470a = wr.m6168a(this.f9472c, this.f9477h.f9445b, this.f9473d);
            return true;
        } else if (i == 1) {
            if (this.f9474e == null) {
                this.f9474e = this.f9472c.m6199h();
            }
            boolean a = m6169a(this.f9474e);
            if (a || !this.f9472c.m6198g() || this.f9477h.f9444a.m6239b(4096)) {
                return a;
            }
            this.f9471b = 2;
            this.f9474e = null;
            return hasNext();
        } else {
            if (this.f9474e == null) {
                this.f9474e = this.f9472c.m6200i();
            }
            return m6169a(this.f9474e);
        }
    }

    /* renamed from: a */
    private final boolean m6169a(Iterator it) {
        if (!this.f9476g.hasNext() && it.hasNext()) {
            ww wwVar = (ww) it.next();
            this.f9475f++;
            this.f9476g = new wr(this.f9477h, wwVar, this.f9473d, this.f9475f);
        }
        if (!this.f9476g.hasNext()) {
            return false;
        }
        this.f9470a = (xn) this.f9476g.next();
        return true;
    }

    public Object next() {
        if (hasNext()) {
            xn xnVar = this.f9470a;
            this.f9470a = null;
            return xnVar;
        }
        throw new NoSuchElementException("There are no more nodes to return");
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
