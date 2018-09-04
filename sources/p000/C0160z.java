package p000;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: z */
public final class C0160z extends C0128u {
    /* renamed from: a */
    private C0155f f19760a = new C0155f();
    /* renamed from: b */
    private C0130w f19761b;
    /* renamed from: c */
    private final WeakReference f19762c;
    /* renamed from: d */
    private int f19763d = 0;
    /* renamed from: e */
    private boolean f19764e = false;
    /* renamed from: f */
    private boolean f19765f = false;
    /* renamed from: g */
    private ArrayList f19766g = new ArrayList();

    public C0160z(C0132y c0132y) {
        this.f19762c = new WeakReference(c0132y);
        this.f19761b = C0130w.INITIALIZED;
    }

    /* renamed from: a */
    public final void mo2582a(C0131x c0131x) {
        C0130w c0130w;
        Object obj = 1;
        if (this.f19761b != C0130w.DESTROYED) {
            c0130w = C0130w.INITIALIZED;
        } else {
            c0130w = C0130w.DESTROYED;
        }
        cz czVar = new cz(c0131x, c0130w);
        if (((cz) this.f19760a.mo1331a(c0131x, czVar)) == null) {
            C0132y c0132y = (C0132y) this.f19762c.get();
            if (c0132y != null) {
                if (this.f19763d == 0 && !this.f19764e) {
                    obj = null;
                }
                Enum c = m14614c(c0131x);
                this.f19763d++;
                while (czVar.f2844a.compareTo(c) < 0 && this.f19760a.m10141a(c0131x)) {
                    m14612b(czVar.f2844a);
                    czVar.m1551a(c0132y, C0160z.m14613c(czVar.f2844a));
                    m14611b();
                    c = m14614c(c0131x);
                }
                if (obj == null) {
                    m14615c();
                }
                this.f19763d--;
            }
        }
    }

    /* renamed from: c */
    private final C0130w m14614c(C0131x c0131x) {
        Entry entry;
        C0130w c0130w;
        C0130w c0130w2;
        C0155f c0155f = this.f19760a;
        if (c0155f.m10141a(c0131x)) {
            entry = ((C0123j) c0155f.f15821a.get(c0131x)).f7596d;
        } else {
            entry = null;
        }
        if (entry != null) {
            c0130w = ((cz) entry.getValue()).f2844a;
        } else {
            c0130w = null;
        }
        if (this.f19766g.isEmpty()) {
            c0130w2 = null;
        } else {
            ArrayList arrayList = this.f19766g;
            c0130w2 = (C0130w) arrayList.get(arrayList.size() - 1);
        }
        return C0160z.m14610a(C0160z.m14610a(this.f19761b, c0130w), c0130w2);
    }

    /* renamed from: a */
    public final C0130w mo2581a() {
        return this.f19761b;
    }

    /* renamed from: a */
    public static C0130w m14609a(C0129v c0129v) {
        switch (c0129v.ordinal()) {
            case 0:
            case 4:
                return C0130w.CREATED;
            case 1:
            case 3:
                return C0130w.STARTED;
            case 2:
                return C0130w.RESUMED;
            case 5:
                return C0130w.DESTROYED;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected event value ");
                stringBuilder.append(c0129v);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public final void m14619b(C0129v c0129v) {
        m14617a(C0160z.m14609a(c0129v));
    }

    /* renamed from: a */
    public static C0130w m14610a(C0130w c0130w, C0130w c0130w2) {
        return (c0130w2 == null || c0130w2.compareTo(c0130w) >= 0) ? c0130w : c0130w2;
    }

    /* renamed from: a */
    public final void m14617a(C0130w c0130w) {
        if (this.f19761b != c0130w) {
            this.f19761b = c0130w;
            if (this.f19764e || this.f19763d != 0) {
                this.f19765f = true;
                return;
            }
            this.f19764e = true;
            m14615c();
            this.f19764e = false;
        }
    }

    /* renamed from: b */
    private final void m14611b() {
        ArrayList arrayList = this.f19766g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: b */
    private final void m14612b(C0130w c0130w) {
        this.f19766g.add(c0130w);
    }

    /* renamed from: b */
    public final void mo2583b(C0131x c0131x) {
        this.f19760a.mo1333c(c0131x);
    }

    /* renamed from: c */
    private final void m14615c() {
        C0132y c0132y = (C0132y) this.f19762c.get();
        if (c0132y != null) {
            while (true) {
                boolean z;
                C0121g c0121g = this.f19760a;
                if (c0121g.f4948e != 0) {
                    C0130w c0130w = ((cz) c0121g.f4945b.getValue()).f2844a;
                    C0130w c0130w2 = ((cz) this.f19760a.f4946c.getValue()).f2844a;
                    z = c0130w == c0130w2 ? this.f19761b == c0130w2 : false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f19765f = false;
                    return;
                }
                Entry entry;
                this.f19765f = false;
                if (this.f19761b.compareTo(((cz) this.f19760a.f4945b.getValue()).f2844a) < 0) {
                    c0121g = this.f19760a;
                    Iterator c0164i = new C0164i(c0121g.f4946c, c0121g.f4945b);
                    c0121g.f4947d.put(c0164i, Boolean.valueOf(false));
                    while (c0164i.hasNext() && !this.f19765f) {
                        entry = (Entry) c0164i.next();
                        cz czVar = (cz) entry.getValue();
                        while (czVar.f2844a.compareTo(this.f19761b) > 0 && !this.f19765f && this.f19760a.m10141a(entry.getKey())) {
                            C0129v c0129v;
                            C0130w c0130w3 = czVar.f2844a;
                            switch (c0130w3.ordinal()) {
                                case 0:
                                    throw new IllegalArgumentException();
                                case 1:
                                    throw new IllegalArgumentException();
                                case 2:
                                    c0129v = C0129v.ON_DESTROY;
                                    break;
                                case 3:
                                    c0129v = C0129v.ON_STOP;
                                    break;
                                case 4:
                                    c0129v = C0129v.ON_PAUSE;
                                    break;
                                default:
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unexpected state value ");
                                    stringBuilder.append(c0130w3);
                                    throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            m14612b(C0160z.m14609a(c0129v));
                            czVar.m1551a(c0132y, c0129v);
                            m14611b();
                        }
                    }
                }
                entry = this.f19760a.f4946c;
                if (!(this.f19765f || entry == null || this.f19761b.compareTo(((cz) entry.getValue()).f2844a) <= 0)) {
                    Iterator a = this.f19760a.m2448a();
                    while (a.hasNext() && !this.f19765f) {
                        Entry entry2 = (Entry) a.next();
                        cz czVar2 = (cz) entry2.getValue();
                        while (czVar2.f2844a.compareTo(this.f19761b) < 0 && !this.f19765f && this.f19760a.m10141a(entry2.getKey())) {
                            m14612b(czVar2.f2844a);
                            czVar2.m1551a(c0132y, C0160z.m14613c(czVar2.f2844a));
                            m14611b();
                        }
                    }
                }
            }
        } else {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
        }
    }

    /* renamed from: c */
    private static C0129v m14613c(C0130w c0130w) {
        switch (c0130w.ordinal()) {
            case 0:
            case 1:
                return C0129v.ON_CREATE;
            case 2:
                return C0129v.ON_START;
            case 3:
                return C0129v.ON_RESUME;
            case 4:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(c0130w);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
