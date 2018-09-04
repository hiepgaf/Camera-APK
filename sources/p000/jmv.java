package p000;

/* compiled from: PG */
/* renamed from: jmv */
public final class jmv {
    /* renamed from: a */
    private final /* synthetic */ kmq f7931a;
    /* renamed from: b */
    private final /* synthetic */ String f7932b;
    /* renamed from: c */
    private final /* synthetic */ jms f7933c;

    jmv(jms jms, kmq kmq, String str) {
        this.f7933c = jms;
        this.f7931a = kmq;
        this.f7932b = str;
    }

    /* renamed from: a */
    public final void m4601a(jnp jnp) {
        String a = jms.m4594a(this.f7931a, this.f7932b);
        this.f7933c.m4598a(a);
        this.f7933c.f7926a.put(a, jnp);
    }
}
