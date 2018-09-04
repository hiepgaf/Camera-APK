package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: akh */
public final class akh {
    /* renamed from: a */
    private static final akk f513a = new akk();
    /* renamed from: b */
    private static final ajz f514b = new aki();
    /* renamed from: c */
    private final List f515c;
    /* renamed from: d */
    private final Set f516d;
    /* renamed from: e */
    private final iw f517e;

    public akh(iw iwVar) {
        this(iwVar, (byte) 0);
    }

    private akh(iw iwVar, byte b) {
        this.f515c = new ArrayList();
        this.f516d = new HashSet();
        this.f517e = iwVar;
    }

    /* renamed from: a */
    final synchronized void m326a(Class cls, Class cls2, akb akb) {
        akj akj = new akj(cls, cls2, akb);
        List list = this.f515c;
        list.add(list.size(), akj);
    }

    /* renamed from: a */
    private final ajz m323a(akj akj) {
        return (ajz) aqe.m585a(akj.f519b.mo91a(this), "Argument must not be null");
    }

    /* renamed from: a */
    final synchronized List m325a(Class cls) {
        List arrayList;
        try {
            arrayList = new ArrayList();
            for (akj akj : this.f515c) {
                if (!this.f516d.contains(akj) && akj.m328a(cls)) {
                    this.f516d.add(akj);
                    arrayList.add(m323a(akj));
                    this.f516d.remove(akj);
                }
            }
        } catch (Throwable th) {
            this.f516d.clear();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized ajz m324a(Class cls, Class cls2) {
        ajz akf;
        try {
            List arrayList = new ArrayList();
            Object obj = null;
            for (akj akj : this.f515c) {
                if (this.f516d.contains(akj)) {
                    obj = 1;
                } else {
                    Object obj2 = akj.m328a(cls) ? akj.f518a.isAssignableFrom(cls2) ? 1 : null : null;
                    if (obj2 != null) {
                        this.f516d.add(akj);
                        arrayList.add(m323a(akj));
                        this.f516d.remove(akj);
                    }
                }
            }
            if (arrayList.size() > 1) {
                akf = new akf(arrayList, this.f517e);
            } else if (arrayList.size() == 1) {
                akf = (ajz) arrayList.get(0);
            } else if (obj != null) {
                akf = f514b;
            } else {
                throw new aci(cls, cls2);
            }
        } catch (Throwable th) {
            this.f516d.clear();
        }
        return akf;
    }

    /* renamed from: b */
    final synchronized List m327b(Class cls) {
        List arrayList;
        arrayList = new ArrayList();
        for (akj akj : this.f515c) {
            if (!arrayList.contains(akj.f518a) && akj.m328a(cls)) {
                arrayList.add(akj.f518a);
            }
        }
        return arrayList;
    }
}
