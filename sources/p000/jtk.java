package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jtk */
final class jtk implements kbn {
    /* renamed from: a */
    private final /* synthetic */ String f19037a;
    /* renamed from: b */
    private final /* synthetic */ jtj f19038b;

    jtk(jtj jtj, String str) {
        this.f19038b = jtj;
        this.f19037a = str;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo605b() {
        Object a = this.f19038b.f7961a.mo2053a(this.f19037a);
        if (a != null) {
            return a;
        }
        String str = this.f19037a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
        stringBuilder.append("Feature ");
        stringBuilder.append(str);
        stringBuilder.append(" not found. Defaulting to 0.");
        Log.d("ExplicitNonlinearScorer", stringBuilder.toString());
        return new jth(0.0f);
    }
}
