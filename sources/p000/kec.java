package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kec */
public final class kec extends ked {
    public static final long serialVersionUID = 0;
    /* renamed from: c */
    private transient int f23601c;

    private kec() {
        this((byte) 0);
    }

    private kec(byte b) {
        super(kgy.m4850a());
        this.f23601c = 2;
        jri.m13143a(true);
        this.f23601c = 2;
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

    /* renamed from: q */
    public static kec m18025q() {
        return new kec();
    }

    /* renamed from: a */
    final /* synthetic */ Collection mo3504a() {
        return kgy.m4851a(this.f23601c);
    }

    /* renamed from: b */
    final Set mo3610b() {
        return kgy.m4851a(this.f23601c);
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ Set mo3612p() {
        return super.mo3612p();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Set mo3611b(Object obj) {
        return super.mo3611b(obj);
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
        this.f23601c = 2;
        int readInt = objectInputStream.readInt();
        m16445a(kgy.m4850a());
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
