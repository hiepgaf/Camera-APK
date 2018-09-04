package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: hur */
public final class hur {
    /* renamed from: a */
    public Account f6681a;
    /* renamed from: b */
    public final ArrayList f6682b;
    /* renamed from: c */
    public final ArrayList f6683c;
    /* renamed from: d */
    private final Set f6684d;
    /* renamed from: e */
    private final Set f6685e;
    /* renamed from: f */
    private String f6686f;
    /* renamed from: g */
    private String f6687g;
    /* renamed from: h */
    private final Map f6688h;
    /* renamed from: i */
    private final Context f6689i;
    /* renamed from: j */
    private final Map f6690j;
    /* renamed from: k */
    private int f6691k;
    /* renamed from: l */
    private Looper f6692l;
    /* renamed from: m */
    private hua f6693m;
    /* renamed from: n */
    private huk f6694n;

    public hur(Context context) {
        this.f6684d = new HashSet();
        this.f6685e = new HashSet();
        this.f6688h = new ih();
        this.f6690j = new ih();
        this.f6691k = -1;
        this.f6693m = hua.f18117a;
        this.f6694n = iaq.f6875a;
        this.f6682b = new ArrayList();
        this.f6683c = new ArrayList();
        this.f6689i = context;
        this.f6692l = context.getMainLooper();
        this.f6686f = context.getPackageName();
        this.f6687g = context.getClass().getName();
    }

    public hur(Context context, hus hus, hut hut) {
        this(context);
        htl.m3432b((Object) hus, (Object) "Must provide a connected listener");
        this.f6682b.add(hus);
        htl.m3432b((Object) hut, (Object) "Must provide a connection failed listener");
        this.f6683c.add(hut);
    }

    /* renamed from: b */
    public final hvx m3487b() {
        iav iav = iav.f6882a;
        if (this.f6690j.containsKey(iaq.f6876b)) {
            iav = (iav) this.f6690j.get(iaq.f6876b);
        }
        return new hvx(this.f6681a, this.f6684d, this.f6688h, this.f6686f, this.f6687g, iav);
    }

    /* renamed from: a */
    public final hur m3486a(huh huh) {
        htl.m3432b((Object) huh, (Object) "Api must not be null");
        this.f6690j.put(huh, null);
        Collection emptyList = Collections.emptyList();
        this.f6685e.addAll(emptyList);
        this.f6684d.addAll(emptyList);
        return this;
    }

    /* renamed from: a */
    public final huq m3485a() {
        htl.m3436b(this.f6690j.isEmpty() ^ 1, (Object) "must call addApi() to add at least one API");
        hvx b = m3487b();
        Map map = b.f6748d;
        Map ihVar = new ih();
        Map ihVar2 = new ih();
        ArrayList arrayList = new ArrayList();
        for (huh huh : this.f6690j.keySet()) {
            Object obj = this.f6690j.get(huh);
            boolean z = map.get(huh) != null;
            ihVar.put(huh, Boolean.valueOf(z));
            hus ico = new ico(huh, z);
            arrayList.add(ico);
            ihVar2.put(huh.m3471b(), huh.m3470a().mo3107a(this.f6689i, this.f6692l, b, obj, ico, ico));
        }
        huq idn = new idn(this.f6689i, new ReentrantLock(), this.f6692l, b, this.f6693m, this.f6694n, ihVar, this.f6682b, this.f6683c, ihVar2, this.f6691k, idn.m12170a(ihVar2.values()), arrayList);
        synchronized (huq.f6680a) {
            huq.f6680a.add(idn);
        }
        if (this.f6691k < 0) {
            return idn;
        }
        throw new NoSuchMethodError();
    }
}
