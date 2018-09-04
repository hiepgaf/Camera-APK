package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kgy */
final class kgy {
    /* renamed from: a */
    private final Field f8284a;

    private kgy(Field field) {
        this.f8284a = field;
        field.setAccessible(true);
    }

    /* renamed from: a */
    static kgy m4852a(Class cls, String str) {
        try {
            return new kgy(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    static Map m4850a() {
        return new kdb(12);
    }

    /* renamed from: a */
    static Set m4851a(int i) {
        return new kdk(i);
    }

    /* renamed from: a */
    static void m4853a(kfr kfr, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection a = kfr.mo3199a(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                a.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: a */
    static void m4855a(kft kft, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            kft.mo2106a(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: a */
    final void m4857a(Object obj, Object obj2) {
        try {
            this.f8284a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    static void m4854a(kfr kfr, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(kfr.mo2103k().size());
        for (Entry entry : kfr.mo2103k().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: a */
    static void m4856a(kft kft, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(kft.mo2114g().size());
        for (kfu kfu : kft.mo2114g()) {
            objectOutputStream.writeObject(kfu.mo3240b());
            objectOutputStream.writeInt(kfu.mo3239a());
        }
    }
}
