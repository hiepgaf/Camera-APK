package p000;

/* compiled from: PG */
/* renamed from: kns */
final class kns extends knl {
    kns() {
    }

    /* renamed from: a */
    final boolean mo2195a(knk knk, knp knp, knp knp2) {
        synchronized (knk) {
            if (knk.listeners != knp) {
                return false;
            }
            knk.listeners = knp2;
            return true;
        }
    }

    /* renamed from: a */
    final boolean mo2194a(knk knk, Object obj, Object obj2) {
        synchronized (knk) {
            if (knk.value != obj) {
                return false;
            }
            knk.value = obj2;
            return true;
        }
    }

    /* renamed from: a */
    final boolean mo2196a(knk knk, knw knw, knw knw2) {
        synchronized (knk) {
            if (knk.waiters != knw) {
                return false;
            }
            knk.waiters = knw2;
            return true;
        }
    }

    /* renamed from: a */
    final void mo2193a(knw knw, knw knw2) {
        knw.next = knw2;
    }

    /* renamed from: a */
    final void mo2192a(knw knw, Thread thread) {
        knw.thread = thread;
    }
}
