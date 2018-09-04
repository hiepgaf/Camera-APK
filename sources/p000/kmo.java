package p000;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: PG */
/* renamed from: kmo */
final class kmo extends kmn {
    /* renamed from: a */
    private final /* synthetic */ TypeVariable f19226a;
    /* renamed from: b */
    private final /* synthetic */ kmn f19227b;

    kmo(TypeVariable typeVariable, kmn kmn) {
        this.f19226a = typeVariable;
        this.f19227b = kmn;
    }

    /* renamed from: a */
    public final Type mo2186a(TypeVariable typeVariable, kmn kmn) {
        return typeVariable.getGenericDeclaration().equals(this.f19226a.getGenericDeclaration()) ? typeVariable : this.f19227b.mo2186a(typeVariable, kmn);
    }
}
