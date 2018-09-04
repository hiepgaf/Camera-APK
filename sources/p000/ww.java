package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: ww */
public final class ww implements Comparable {
    /* renamed from: a */
    public String f9480a;
    /* renamed from: b */
    public String f9481b;
    /* renamed from: c */
    public ww f9482c;
    /* renamed from: d */
    public List f9483d;
    /* renamed from: e */
    public List f9484e;
    /* renamed from: f */
    public xj f9485f;
    /* renamed from: g */
    public boolean f9486g;
    /* renamed from: h */
    public boolean f9487h;
    /* renamed from: i */
    public boolean f9488i;
    /* renamed from: j */
    public boolean f9489j;

    public ww(String str, xj xjVar) {
        this(str, null, xjVar);
    }

    public ww(String str, String str2, xj xjVar) {
        this.f9483d = null;
        this.f9484e = null;
        this.f9485f = null;
        this.f9480a = str;
        this.f9481b = str2;
        this.f9485f = xjVar;
    }

    /* renamed from: a */
    public final void m6186a(int i, ww wwVar) {
        m6179c(wwVar.f9480a);
        wwVar.f9482c = this;
        m6188b().add(i - 1, wwVar);
    }

    /* renamed from: a */
    public final void m6187a(ww wwVar) {
        m6179c(wwVar.f9480a);
        wwVar.f9482c = this;
        m6188b().add(wwVar);
    }

    /* renamed from: b */
    public final void m6191b(ww wwVar) {
        String str = wwVar.f9480a;
        if ("[]".equals(str) || m6190b(str) == null) {
            wwVar.f9482c = this;
            wwVar.m6194d().m6238a(32, true);
            m6194d().m14515b(true);
            if (wwVar.m6181l()) {
                this.f9485f.m14512a(true);
                m6180k().add(0, wwVar);
                return;
            } else if (wwVar.m6182m()) {
                this.f9485f.m14518c(true);
                m6180k().add(this.f9485f.m6239b(64), wwVar);
                return;
            } else {
                m6180k().add(wwVar);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
        stringBuilder.append("Duplicate '");
        stringBuilder.append(str);
        stringBuilder.append("' qualifier");
        throw new wb(stringBuilder.toString(), 203);
    }

    /* renamed from: c */
    private final void m6179c(String str) {
        if (!"[]".equals(str) && m6184a(str) != null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 35);
            stringBuilder.append("Duplicate property or field node '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            throw new wb(stringBuilder.toString(), 203);
        }
    }

    /* renamed from: a */
    protected final void m6185a() {
        if (this.f9483d.isEmpty()) {
            this.f9483d = null;
        }
    }

    public final Object clone() {
        xj xjVar;
        try {
            xjVar = new xj(m6194d().f9510a);
        } catch (wb e) {
            xjVar = new xj();
        }
        ww wwVar = new ww(this.f9480a, this.f9481b, xjVar);
        try {
            Iterator h = m6199h();
            while (h.hasNext()) {
                wwVar.m6187a((ww) ((ww) h.next()).clone());
            }
            h = m6200i();
            while (h.hasNext()) {
                wwVar.m6191b((ww) ((ww) h.next()).clone());
            }
        } catch (wb e2) {
        }
        return wwVar;
    }

    public final int compareTo(Object obj) {
        if (m6194d().m6239b(kvl.UNSET_ENUM_VALUE)) {
            return this.f9481b.compareTo(((ww) obj).f9481b);
        }
        return this.f9480a.compareTo(((ww) obj).f9480a);
    }

    /* renamed from: a */
    private static ww m6178a(List list, String str) {
        if (list != null) {
            for (ww wwVar : list) {
                if (wwVar.f9480a.equals(str)) {
                    return wwVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final ww m6184a(String str) {
        return ww.m6178a(m6188b(), str);
    }

    /* renamed from: b */
    public final ww m6190b(String str) {
        return ww.m6178a(this.f9484e, str);
    }

    /* renamed from: a */
    public final ww m6183a(int i) {
        return (ww) m6188b().get(i - 1);
    }

    /* renamed from: b */
    final List m6188b() {
        if (this.f9483d == null) {
            this.f9483d = new ArrayList(0);
        }
        return this.f9483d;
    }

    /* renamed from: c */
    public final int m6192c() {
        List list = this.f9483d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: d */
    public final xj m6194d() {
        if (this.f9485f == null) {
            this.f9485f = new xj();
        }
        return this.f9485f;
    }

    /* renamed from: k */
    private final List m6180k() {
        if (this.f9484e == null) {
            this.f9484e = new ArrayList(0);
        }
        return this.f9484e;
    }

    /* renamed from: b */
    public final ww m6189b(int i) {
        return (ww) m6180k().get(i - 1);
    }

    /* renamed from: e */
    public final int m6196e() {
        List list = this.f9484e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: f */
    public final boolean m6197f() {
        List list = this.f9483d;
        return list != null && list.size() > 0;
    }

    /* renamed from: g */
    public final boolean m6198g() {
        List list = this.f9484e;
        return list != null && list.size() > 0;
    }

    /* renamed from: l */
    private final boolean m6181l() {
        return "xml:lang".equals(this.f9480a);
    }

    /* renamed from: m */
    private final boolean m6182m() {
        return "rdf:type".equals(this.f9480a);
    }

    /* renamed from: h */
    public final Iterator m6199h() {
        if (this.f9483d != null) {
            return m6188b().iterator();
        }
        return Collections.EMPTY_LIST.listIterator();
    }

    /* renamed from: i */
    public final Iterator m6200i() {
        if (this.f9484e != null) {
            return new wx(m6180k().iterator());
        }
        return Collections.EMPTY_LIST.iterator();
    }

    /* renamed from: c */
    public final void m6193c(ww wwVar) {
        m6188b().remove(wwVar);
        m6185a();
    }

    /* renamed from: d */
    public final void m6195d(ww wwVar) {
        xj d = m6194d();
        if (wwVar.m6181l()) {
            d.m14512a(false);
        } else if (wwVar.m6182m()) {
            d.m14518c(false);
        }
        m6180k().remove(wwVar);
        if (this.f9484e.isEmpty()) {
            d.m14515b(false);
            this.f9484e = null;
        }
    }

    /* renamed from: j */
    public final void m6201j() {
        int i = 0;
        if (m6198g()) {
            int length;
            ListIterator listIterator;
            ww[] wwVarArr = (ww[]) m6180k().toArray(new ww[m6196e()]);
            int i2 = 0;
            while (true) {
                length = wwVarArr.length;
                if (length <= i2 || !("xml:lang".equals(wwVarArr[i2].f9480a) || "rdf:type".equals(wwVarArr[i2].f9480a))) {
                    Arrays.sort(wwVarArr, i2, length);
                    listIterator = this.f9484e.listIterator();
                } else {
                    wwVarArr[i2].m6201j();
                    i2++;
                }
            }
            Arrays.sort(wwVarArr, i2, length);
            listIterator = this.f9484e.listIterator();
            while (i < wwVarArr.length) {
                listIterator.next();
                listIterator.set(wwVarArr[i]);
                wwVarArr[i].m6201j();
                i++;
            }
        }
        if (m6197f()) {
            if (!m6194d().m6239b(512)) {
                Collections.sort(this.f9483d);
            }
            Iterator h = m6199h();
            while (h.hasNext()) {
                ((ww) h.next()).m6201j();
            }
        }
    }
}
