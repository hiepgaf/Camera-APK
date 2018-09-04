package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ahq */
final class ahq {
    /* renamed from: a */
    public final Map f464a = new HashMap();
    /* renamed from: b */
    public final ahs f465b = new ahs();

    ahq() {
    }

    /* renamed from: a */
    final void m288a(String str) {
        ahr ahr;
        synchronized (this) {
            ahr = (ahr) aqe.m585a((ahr) this.f464a.get(str), "Argument must not be null");
            int i = ahr.f467b;
            if (i <= 0) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 81);
                stringBuilder.append("Cannot release a lock that is not held, safeKey: ");
                stringBuilder.append(str);
                stringBuilder.append(", interestedThreads: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
            ahr.f467b = i - 1;
            if (ahr.f467b == 0) {
                ahr ahr2 = (ahr) this.f464a.remove(str);
                if (ahr2.equals(ahr)) {
                    ahs ahs = this.f465b;
                    synchronized (ahs.f468a) {
                        if (ahs.f468a.size() < 10) {
                            ahs.f468a.offer(ahr2);
                        }
                    }
                } else {
                    String valueOf = String.valueOf(ahr);
                    String valueOf2 = String.valueOf(ahr2);
                    StringBuilder stringBuilder2 = new StringBuilder(((String.valueOf(valueOf).length() + 79) + String.valueOf(valueOf2).length()) + String.valueOf(str).length());
                    stringBuilder2.append("Removed the wrong lock, expected to remove: ");
                    stringBuilder2.append(valueOf);
                    stringBuilder2.append(", but actually removed: ");
                    stringBuilder2.append(valueOf2);
                    stringBuilder2.append(", safeKey: ");
                    stringBuilder2.append(str);
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
        }
        ahr.f466a.unlock();
    }
}
