package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: bbo */
public final class bbo extends kdw implements iqo, List {
    /* renamed from: a */
    private final ArrayList f22606a;
    /* renamed from: b */
    private boolean f22607b;

    public bbo() {
        this.f22606a = new ArrayList();
    }

    public bbo(ArrayList arrayList) {
        this.f22606a = arrayList;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        iqo iqo = (iqo) obj;
        jri.m13153b(this.f22607b ^ 1);
        this.f22606a.add(i, iqo);
    }

    public final boolean addAll(int i, Collection collection) {
        jri.m13153b(this.f22607b ^ 1);
        return this.f22606a.addAll(i, collection);
    }

    public final void close() {
        if (!this.f22607b) {
            this.f22607b = true;
            ArrayList arrayList = this.f22606a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((iqo) arrayList.get(i)).close();
                i = i2;
            }
            this.f22606a.clear();
        }
    }

    protected final /* synthetic */ Object F_() {
        return this.f22606a;
    }

    /* renamed from: b */
    protected final /* synthetic */ Collection mo3225b() {
        return this.f22606a;
    }

    /* renamed from: c */
    protected final List mo3373c() {
        return this.f22606a;
    }

    public final /* synthetic */ Object get(int i) {
        jri.m13153b(this.f22607b ^ 1);
        return (iqo) this.f22606a.get(i);
    }

    public final int indexOf(Object obj) {
        jri.m13153b(this.f22607b ^ 1);
        return this.f22606a.indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        jri.m13153b(this.f22607b ^ 1);
        return this.f22606a.lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        jri.m13153b(this.f22607b ^ 1);
        return this.f22606a.listIterator();
    }

    public final ListIterator listIterator(int i) {
        jri.m13153b(this.f22607b ^ 1);
        return this.f22606a.listIterator(i);
    }

    public final /* synthetic */ Object remove(int i) {
        jri.m13153b(this.f22607b ^ 1);
        return (iqo) this.f22606a.remove(i);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        iqo iqo = (iqo) obj;
        jri.m13153b(this.f22607b ^ 1);
        return (iqo) this.f22606a.set(i, iqo);
    }

    public final List subList(int i, int i2) {
        jri.m13153b(this.f22607b ^ 1);
        return this.f22606a.subList(i, i2);
    }
}
