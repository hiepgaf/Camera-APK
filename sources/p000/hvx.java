package p000;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: hvx */
public final class hvx {
    /* renamed from: a */
    public final Account f6745a;
    /* renamed from: b */
    public final Set f6746b;
    /* renamed from: c */
    public final Set f6747c;
    /* renamed from: d */
    public final Map f6748d;
    /* renamed from: e */
    public final String f6749e;
    /* renamed from: f */
    public final String f6750f;
    /* renamed from: g */
    public final iav f6751g;
    /* renamed from: h */
    public Integer f6752h;

    public hvx(Account account, Set set, Map map, String str, String str2, iav iav) {
        this.f6745a = account;
        this.f6746b = set != null ? Collections.unmodifiableSet(set) : Collections.EMPTY_SET;
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f6748d = map;
        this.f6749e = str;
        this.f6750f = str2;
        this.f6751g = iav;
        Set hashSet = new HashSet(this.f6746b);
        Iterator it = this.f6748d.values().iterator();
        while (it.hasNext()) {
            it.next();
            hashSet.addAll(null);
        }
        this.f6747c = Collections.unmodifiableSet(hashSet);
    }
}
