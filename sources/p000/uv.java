package p000;

/* compiled from: PG */
/* renamed from: uv */
public final class uv {
    /* renamed from: a */
    public int f9347a = -1;
    /* renamed from: b */
    public int f9348b = 0;
    /* renamed from: c */
    public int f9349c = 0;
    /* renamed from: d */
    public int f9350d = 1;
    /* renamed from: e */
    public int f9351e = 0;
    /* renamed from: f */
    public boolean f9352f = false;
    /* renamed from: g */
    public boolean f9353g = false;
    /* renamed from: h */
    public boolean f9354h = false;
    /* renamed from: i */
    public boolean f9355i = false;
    /* renamed from: j */
    public boolean f9356j = false;
    /* renamed from: k */
    public boolean f9357k = false;
    /* renamed from: l */
    public int f9358l;
    /* renamed from: m */
    public long f9359m;
    /* renamed from: n */
    public int f9360n;

    /* renamed from: a */
    public final void m6010a(int i) {
        if ((this.f9350d & i) == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Layout state should be one of ");
            stringBuilder.append(Integer.toBinaryString(i));
            stringBuilder.append(" but it is ");
            stringBuilder.append(Integer.toBinaryString(this.f9350d));
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final int m6009a() {
        return this.f9353g ? this.f9348b - this.f9349c : this.f9351e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("State{mTargetPosition=");
        stringBuilder.append(this.f9347a);
        stringBuilder.append(", mData=");
        stringBuilder.append(null);
        stringBuilder.append(", mItemCount=");
        stringBuilder.append(this.f9351e);
        stringBuilder.append(", mIsMeasuring=");
        stringBuilder.append(this.f9355i);
        stringBuilder.append(", mPreviousLayoutItemCount=");
        stringBuilder.append(this.f9348b);
        stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        stringBuilder.append(this.f9349c);
        stringBuilder.append(", mStructureChanged=");
        stringBuilder.append(this.f9352f);
        stringBuilder.append(", mInPreLayout=");
        stringBuilder.append(this.f9353g);
        stringBuilder.append(", mRunSimpleAnimations=");
        stringBuilder.append(this.f9356j);
        stringBuilder.append(", mRunPredictiveAnimations=");
        stringBuilder.append(this.f9357k);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
