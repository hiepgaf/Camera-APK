package p000;

/* compiled from: PG */
/* renamed from: fns */
final class fns implements iqt {
    /* renamed from: a */
    private int f16236a = -1;
    /* renamed from: b */
    private final /* synthetic */ int f16237b;

    fns(int i) {
        this.f16237b = i;
    }

    /* renamed from: a */
    private final synchronized void m10552a(Integer num) {
        if (num != null) {
            if (this.f16236a != num.intValue()) {
                this.f16236a = num.intValue();
                String str = fnr.f4637a;
                String valueOf = String.valueOf(num);
                int i = this.f16237b;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                stringBuilder.append("Global ticket count: ");
                stringBuilder.append(valueOf);
                stringBuilder.append("/");
                stringBuilder.append(i);
                bli.m863a(str, stringBuilder.toString());
            }
        }
    }
}
