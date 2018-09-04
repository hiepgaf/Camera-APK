package p000;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jms */
public final class jms {
    /* renamed from: a */
    public final Map f7926a = khb.m4899d();
    /* renamed from: b */
    public final Map f7927b = khb.m4899d();
    /* renamed from: c */
    public boolean f7928c = true;
    /* renamed from: d */
    private final List f7929d = khb.m4885b();
    /* renamed from: e */
    private final HashSet f7930e = khb.m4903e();

    /* renamed from: a */
    final void m4598a(String str) {
        Map map = this.f7926a;
        jnp jnp = (jnp) map.get(str);
        if (jnp == null) {
            return;
        }
        if (this.f7928c) {
            String concat = String.valueOf(str).concat(":original");
            m4598a(concat);
            map.put(concat, jnp);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 60);
        stringBuilder.append("Attempting to override ");
        stringBuilder.append(str);
        stringBuilder.append(", but overrides have been disallowed!");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final jyv m4596a() {
        return new jmt(this);
    }

    /* renamed from: a */
    static String m4594a(kmq kmq, String str) {
        String kmq2 = kmq.toString();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(kmq2).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(kmq2);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final Object m4595a(Class cls, String str) {
        String a;
        kmq a2 = kmq.m13572a(cls);
        while (true) {
            a = jms.m4594a(a2, str);
            if (!this.f7930e.contains(a)) {
                break;
            }
            str = String.valueOf(str).concat(":original");
        }
        this.f7930e.add(a);
        Object obj = this.f7927b.get(a);
        if (obj == null) {
            jnp jnp = (jnp) this.f7926a.get(a);
            StringBuilder stringBuilder;
            if (jnp == null) {
                stringBuilder = new StringBuilder(String.valueOf(a).length() + 33);
                stringBuilder.append("Unable to find instantiator for ");
                stringBuilder.append(a);
                stringBuilder.append(".");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            Object a3 = jnp.mo710a(this);
            if (a3 == null) {
                stringBuilder = new StringBuilder(String.valueOf(a).length() + 43);
                stringBuilder.append("Instantiator for ");
                stringBuilder.append(a);
                stringBuilder.append(" returns a null reference!");
                throw new NullPointerException(stringBuilder.toString());
            }
            Class cls2 = a3.getClass();
            obj = a3;
            for (jmw jmw : this.f7929d) {
                if (jmw.f7934a.isAssignableFrom(cls2)) {
                    obj = jmw.f7935b.mo2075a(obj, str);
                }
            }
            this.f7927b.put(a, obj);
        }
        this.f7930e.remove(a);
        return obj;
    }

    /* renamed from: b */
    public final jmv m4599b(Class cls, String str) {
        return new jmv(this, kmq.m13572a(cls), str);
    }

    /* renamed from: a */
    public final void m4597a(Class cls, jmu jmu) {
        int size = this.f7929d.size();
        int i = 0;
        while (i < this.f7929d.size()) {
            if (((jmw) this.f7929d.get(i)).f7934a.isAssignableFrom(cls)) {
                break;
            }
            i++;
        }
        i = size;
        this.f7929d.add(i, new jmw(cls, jmu));
    }
}
