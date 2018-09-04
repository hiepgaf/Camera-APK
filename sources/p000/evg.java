package p000;

/* renamed from: evg */
final /* synthetic */ class evg implements kbn {
    /* renamed from: a */
    private final long f15605a;

    evg(long j) {
        this.f15605a = j;
    }

    /* renamed from: b */
    public final Object mo605b() {
        long j = this.f15605a;
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("copying video frame to encoder: <");
        stringBuilder.append(j);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
