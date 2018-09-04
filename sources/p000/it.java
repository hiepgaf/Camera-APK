package p000;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: it */
final class it implements Iterator, Entry {
    /* renamed from: a */
    private int f7433a;
    /* renamed from: b */
    private int f7434b;
    /* renamed from: c */
    private boolean f7435c = false;
    /* renamed from: d */
    private final /* synthetic */ ip f7436d;

    it(ip ipVar) {
        this.f7436d = ipVar;
        this.f7433a = ipVar.mo1878c() - 1;
        this.f7434b = -1;
    }

    public final boolean equals(Object obj) {
        if (!this.f7435c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            if (il.m3811a(entry.getKey(), this.f7436d.mo1871a(this.f7434b, 0)) && il.m3811a(entry.getValue(), this.f7436d.mo1871a(this.f7434b, 1))) {
                return true;
            }
            return false;
        }
    }

    public final Object getKey() {
        if (this.f7435c) {
            return this.f7436d.mo1871a(this.f7434b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f7435c) {
            return this.f7436d.mo1871a(this.f7434b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.f7434b < this.f7433a;
    }

    public final int hashCode() {
        int i = 0;
        if (this.f7435c) {
            int hashCode;
            Object a = this.f7436d.mo1871a(this.f7434b, 0);
            Object a2 = this.f7436d.mo1871a(this.f7434b, 1);
            if (a != null) {
                hashCode = a.hashCode();
            } else {
                hashCode = 0;
            }
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            this.f7434b++;
            this.f7435c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f7435c) {
            this.f7436d.mo1874a(this.f7434b);
            this.f7434b--;
            this.f7433a--;
            this.f7435c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f7435c) {
            return this.f7436d.mo1872a(this.f7434b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getKey());
        stringBuilder.append("=");
        stringBuilder.append(getValue());
        return stringBuilder.toString();
    }
}
