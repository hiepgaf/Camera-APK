package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: kam */
final class kam extends gc {
    /* renamed from: i */
    private List f21999i;
    /* renamed from: j */
    private List f22000j;

    static {
        kam.class.getCanonicalName();
    }

    kam(Context context) {
        super(context.getApplicationContext());
    }

    kam(Context context, List list) {
        this(context);
        this.f22000j = list;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo3193b(Object obj) {
        m16431a((List) obj);
    }

    /* renamed from: a */
    private final void m16431a(List list) {
        this.f21999i = list;
        super.mo3193b(list);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo3192b() {
        Collection treeSet = new TreeSet();
        treeSet.addAll(jqk.m13085a(jqk.m13080a(this.f5126d.getApplicationContext(), "third_party_license_metadata", 0, -1), ""));
        List<String> list = this.f22000j;
        if (list != null) {
            for (String str : list) {
                Collection a;
                String a2 = jqk.m13083a("res/raw/third_party_license_metadata", str, 0, -1);
                if (a2 != null) {
                    a = jqk.m13085a(a2, str);
                } else {
                    a = new ArrayList();
                }
                treeSet.addAll(a);
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    /* renamed from: e */
    protected final void mo3194e() {
        List list = this.f21999i;
        if (list != null) {
            m16431a(list);
        } else {
            mo1440d();
        }
    }

    /* renamed from: f */
    protected final void mo3195f() {
        mo1439c();
    }
}
