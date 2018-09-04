package p000;

/* compiled from: PG */
/* renamed from: kfy */
abstract class kfy extends kgt {
    kfy() {
    }

    /* renamed from: a */
    abstract kft mo3215a();

    public void clear() {
        mo3215a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof kfu)) {
            return false;
        }
        kfu kfu = (kfu) obj;
        if (kfu.mo3239a() > 0 && mo3215a().mo3226a(kfu.mo3240b()) == kfu.mo3239a()) {
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof kfu)) {
            return false;
        }
        kfu kfu = (kfu) obj;
        Object b = kfu.mo3240b();
        int a = kfu.mo3239a();
        if (a != 0) {
            return mo3215a().mo2107a(b, a, 0);
        }
        return false;
    }
}
