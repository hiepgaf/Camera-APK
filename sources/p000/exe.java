package p000;

import java.util.Map.Entry;

/* renamed from: exe */
final /* synthetic */ class exe implements Runnable {
    /* renamed from: a */
    private final Entry f4328a;
    /* renamed from: b */
    private final gid f4329b;

    exe(Entry entry, gid gid) {
        this.f4328a = entry;
        this.f4329b = gid;
    }

    public final void run() {
        Entry entry = this.f4328a;
        ((exf) entry.getKey()).mo1310a(this.f4329b);
    }
}
