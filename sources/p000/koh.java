package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: koh */
final class koh extends kof {
    koh() {
    }

    /* renamed from: a */
    final void mo2201a(koe koe, Set set) {
        synchronized (koe) {
            if (koe.seenExceptions == null) {
                koe.seenExceptions = set;
            }
        }
    }

    /* renamed from: a */
    final int mo2200a(koe koe) {
        int i;
        synchronized (koe) {
            koe.remaining--;
            i = koe.remaining;
        }
        return i;
    }
}
