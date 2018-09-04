package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kds */
abstract class kds extends kdx implements kgx {
    /* renamed from: a */
    private transient Comparator f23415a;
    /* renamed from: b */
    private transient NavigableSet f23416b;
    /* renamed from: c */
    private transient Set f23417c;

    kds() {
    }

    /* renamed from: c */
    abstract Iterator mo3590c();

    /* renamed from: d */
    abstract kgx mo3591d();

    /* renamed from: a */
    public final Comparator mo3216a() {
        Comparator comparator = this.f23415a;
        if (comparator != null) {
            return comparator;
        }
        kgd kgd;
        comparator = mo3591d().mo3216a();
        if (comparator instanceof kgd) {
            kgd = (kgd) comparator;
        } else {
            kgd = new kdm(comparator);
        }
        comparator = kgd.mo2152a();
        this.f23415a = comparator;
        return comparator;
    }

    /* renamed from: f */
    protected final kft mo3509f() {
        return mo3591d();
    }

    protected final /* synthetic */ Object F_() {
        return mo3591d();
    }

    /* renamed from: b */
    protected final /* synthetic */ Collection mo3225b() {
        return mo3591d();
    }

    /* renamed from: i */
    public final kgx mo3219i() {
        return mo3591d();
    }

    /* renamed from: j */
    public final NavigableSet mo3220j() {
        NavigableSet navigableSet = this.f23416b;
        if (navigableSet != null) {
            return navigableSet;
        }
        navigableSet = new kha(this);
        this.f23416b = navigableSet;
        return navigableSet;
    }

    /* renamed from: e */
    public final /* synthetic */ Set mo2112e() {
        return mo3220j();
    }

    /* renamed from: g */
    public final Set mo2114g() {
        Set set = this.f23417c;
        if (set != null) {
            return set;
        }
        set = new kdt(this);
        this.f23417c = set;
        return set;
    }

    /* renamed from: k */
    public final kfu mo3221k() {
        return mo3591d().mo3222l();
    }

    /* renamed from: a */
    public final kgx mo3507a(Object obj, kcy kcy) {
        return mo3591d().mo3508b(obj, kcy).mo3219i();
    }

    public Iterator iterator() {
        return khb.m4866a((kft) this);
    }

    /* renamed from: l */
    public final kfu mo3222l() {
        return mo3591d().mo3221k();
    }

    /* renamed from: m */
    public final kfu mo3223m() {
        return mo3591d().mo3224n();
    }

    /* renamed from: n */
    public final kfu mo3224n() {
        return mo3591d().mo3223m();
    }

    /* renamed from: a */
    public final kgx mo3217a(Object obj, kcy kcy, Object obj2, kcy kcy2) {
        return mo3591d().mo3217a(obj2, kcy2, obj, kcy).mo3219i();
    }

    /* renamed from: b */
    public final kgx mo3508b(Object obj, kcy kcy) {
        return mo3591d().mo3507a(obj, kcy).mo3219i();
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int size = size();
        if (objArr.length >= size) {
            objArr2 = objArr;
        } else {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        int i = 0;
        for (Object obj : this) {
            int i2 = i + 1;
            objArr2[i] = obj;
            i = i2;
        }
        if (objArr2.length > size) {
            objArr2[size] = null;
        }
        return objArr2;
    }

    public String toString() {
        return mo2114g().toString();
    }
}
