package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kck */
abstract class kck extends kcp implements Serializable {
    public static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        m16456a();
        kgy.m4855a((kft) this, objectInputStream, readInt);
    }

    /* renamed from: a */
    abstract void m16456a();

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        kgy.m4856a((kft) this, objectOutputStream);
    }
}
