package p000;

/* compiled from: PG */
/* renamed from: kqp */
public abstract class kqp implements ktf {
    /* renamed from: a */
    public abstract kqp mo3540a();

    /* renamed from: a */
    protected abstract kqp mo3541a(kqo kqo);

    public /* synthetic */ Object clone() {
        return mo3540a();
    }

    /* renamed from: a */
    public final /* synthetic */ ktf mo3253a(kte kte) {
        if (mo3535d().getClass().isInstance(kte)) {
            return mo3541a((kqo) kte);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
