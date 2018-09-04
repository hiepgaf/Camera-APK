package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kcv */
public final class kcv extends kcw {
    public static final long serialVersionUID = 0;
    /* renamed from: c */
    private transient int f23600c;

    public kcv() {
        this((byte) 0);
    }

    private kcv(byte b) {
        super(kgy.m4850a());
        khb.m4859a(3, "expectedValuesPerKey");
        this.f23600c = 3;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Map mo2103k() {
        return super.mo2103k();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo3200c() {
        super.mo3200c();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo2101b(Object obj, Object obj2) {
        return super.mo2101b(obj, obj2);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo3605c(Object obj) {
        return super.mo3605c(obj);
    }

    /* renamed from: a */
    final /* synthetic */ Collection mo3504a() {
        return mo3603b();
    }

    /* renamed from: b */
    final List mo3603b() {
        return new ArrayList(this.f23600c);
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Collection mo3506l() {
        return super.mo3506l();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ List mo3604b(Object obj) {
        return super.mo3604b(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ boolean mo3608m() {
        return super.mo3608m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Set mo2104n() {
        return super.mo2104n();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2100a(Object obj, Object obj2) {
        return super.mo2100a(obj, obj2);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f23600c = 3;
        int readInt = objectInputStream.readInt();
        m16445a(new kdb());
        kgy.m4853a((kfr) this, objectInputStream, readInt);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo2102c(Object obj, Object obj2) {
        return super.mo2102c(obj, obj2);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ int mo3206i() {
        return super.mo3206i();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Collection mo2105o() {
        return super.mo2105o();
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        kgy.m4854a((kfr) this, objectOutputStream);
    }
}
