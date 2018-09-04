package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;

/* compiled from: PG */
/* renamed from: jxi */
public abstract class jxi {
    /* renamed from: a */
    public final String f8068a;

    private jxi(String str) {
        this.f8068a = str;
    }

    /* renamed from: a */
    public abstract Object mo2060a(DataInputStream dataInputStream);

    /* renamed from: a */
    public abstract void mo2061a(Object obj, DataOutputStream dataOutputStream);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxi)) {
            return false;
        }
        return this.f8068a.equals(((jxi) obj).f8068a);
    }

    public int hashCode() {
        return this.f8068a.hashCode();
    }

    public String toString() {
        return this.f8068a;
    }
}
