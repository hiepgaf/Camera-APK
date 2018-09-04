package p000;

import java.util.EnumMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: era */
public final class era {
    /* renamed from: a */
    private static final String f4106a = bli.m862a("MemoryManager");
    /* renamed from: b */
    private final Object f4107b = new Object();
    /* renamed from: c */
    private final Executor f4108c;
    /* renamed from: d */
    private final long f4109d;
    /* renamed from: e */
    private final EnumMap f4110e = new EnumMap(eqv.class);

    public era(eqy eqy, Executor executor) {
        this.f4109d = eqy.f4103a;
        String str = f4106a;
        long j = this.f4109d;
        StringBuilder stringBuilder = new StringBuilder(72);
        stringBuilder.append("Max native memory: ");
        stringBuilder.append(j);
        stringBuilder.append(" bytes. (");
        stringBuilder.append(j / 1000000);
        stringBuilder.append("MB).");
        bli.m869c(str, stringBuilder.toString());
        this.f4108c = executor;
    }

    /* renamed from: b */
    private final long m2025b() {
        long j;
        synchronized (this.f4107b) {
            long j2 = 0;
            for (eqv eqv : this.f4110e.keySet()) {
                j2 = ((Long) ((erd) this.f4110e.get(eqv)).f15422a.mo1267b().mo2860b()).longValue() + j2;
            }
            j = this.f4109d - j2;
        }
        return j;
    }

    /* renamed from: a */
    public final ilp m2027a(eqv eqv) {
        ilp ilp;
        synchronized (this.f4107b) {
            if (this.f4110e.containsKey(eqv)) {
                ilp = ((erd) this.f4110e.get(eqv)).f15423b;
            } else {
                String valueOf = String.valueOf(eqv);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Feature not registered: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return ilp;
    }

    /* renamed from: b */
    private final boolean m2026b(eqv eqv) {
        synchronized (this.f4107b) {
            long b = m2025b();
            long longValue = ((Long) ((erd) this.f4110e.get(eqv)).f15422a.mo1266a().mo2860b()).longValue();
            if (longValue < 0) {
                String str = f4106a;
                String name = eqv.name();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 73);
                stringBuilder.append("Feature (");
                stringBuilder.append(name);
                stringBuilder.append(") reports negative shot memory: ");
                stringBuilder.append(longValue);
                stringBuilder.append(". Disabling.");
                bli.m873e(str, stringBuilder.toString());
                return false;
            }
            boolean z;
            if (longValue <= b) {
                z = true;
            } else {
                z = false;
            }
            String str2 = f4106a;
            name = eqv.name();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 68);
            stringBuilder.append("Feature available: ");
            stringBuilder.append(name);
            stringBuilder.append(": ");
            stringBuilder.append(z);
            stringBuilder.append(" (Additional memory: ");
            stringBuilder.append(longValue);
            stringBuilder.append(")");
            bli.m863a(str2, stringBuilder.toString());
            return z;
        }
    }

    /* renamed from: a */
    public final boolean m2029a(eqw eqw) {
        synchronized (this.f4107b) {
            String valueOf;
            if (this.f4110e.containsKey(eqw.mo1268c())) {
                String str = f4106a;
                String str2 = "Feature already registered: ";
                valueOf = String.valueOf(eqw.mo1268c().name());
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m869c(str, valueOf);
                return false;
            }
            valueOf = f4106a;
            str = "Registering feature: ";
            String valueOf2 = String.valueOf(eqw.mo1268c().name());
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str);
            } else {
                valueOf2 = str.concat(valueOf2);
            }
            bli.m869c(valueOf, valueOf2);
            this.f4110e.put(eqw.mo1268c(), new erd(eqw, new ilb(Boolean.valueOf(false)), ken.m13454a(eqw.mo1267b().mo2859a(new erb(this), this.f4108c), eqw.mo1266a().mo2859a(new erc(this), this.f4108c))));
            m2028a();
            return true;
        }
    }

    /* renamed from: a */
    final void m2028a() {
        synchronized (this.f4107b) {
            long b = m2025b();
            for (eqv eqv : this.f4110e.keySet()) {
                ((erd) this.f4110e.get(eqv)).f15423b.mo348a(Boolean.valueOf(m2026b(eqv)));
            }
            String str = f4106a;
            StringBuilder stringBuilder = new StringBuilder(48);
            stringBuilder.append("State updated. Free Memory: ");
            stringBuilder.append(b);
            bli.m869c(str, stringBuilder.toString());
        }
    }
}
