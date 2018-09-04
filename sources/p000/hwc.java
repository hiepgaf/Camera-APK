package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.util.Set;

/* renamed from: hwc */
public abstract class hwc extends hvm implements huo, hwe {
    /* renamed from: l */
    private final Set f21625l;
    /* renamed from: m */
    private final Account f21626m;

    public hwc(Context context, Looper looper, int i, hvx hvx, hus hus, hut hut) {
        this(context, looper, hwf.m3551a(context), hua.f18117a, i, hvx, (hus) htl.m3431b((Object) hus), (hut) htl.m3431b((Object) hut));
    }

    /* renamed from: j */
    public final Account mo3111j() {
        return this.f21626m;
    }

    /* renamed from: n */
    public final zzc[] mo3112n() {
        return new zzc[0];
    }

    /* renamed from: q */
    protected final Set mo3113q() {
        return this.f21625l;
    }

    private hwc(Context context, Looper looper, hwf hwf, hua hua, int i, hvx hvx, hus hus, hut hut) {
        super(context, looper, hwf, hua, i, hus != null ? new hvo(hus) : null, hut != null ? new hvp(hut) : null, hvx.f6750f);
        this.f21626m = hvx.f6745a;
        Set<Scope> set = hvx.f6747c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f21625l = set;
    }
}
