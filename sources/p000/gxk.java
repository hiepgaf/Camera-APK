package p000;

/* compiled from: PG */
/* renamed from: gxk */
public enum gxk {
    OFF(0),
    THREE_BY_THREE(1),
    FOUR_BY_FOUR(2),
    GOLDEN_RATIO(3);
    
    /* renamed from: e */
    public final int f5765e;

    private gxk(int i) {
        this.f5765e = i;
    }

    /* renamed from: a */
    public static int[] m2867a() {
        return new int[]{OFF.f5765e, THREE_BY_THREE.f5765e, FOUR_BY_FOUR.f5765e, GOLDEN_RATIO.f5765e};
    }

    /* renamed from: a */
    public static gxk m2866a(int i) {
        switch (i) {
            case 0:
                return OFF;
            case 1:
                return THREE_BY_THREE;
            case 2:
                return FOUR_BY_FOUR;
            case 3:
                return GOLDEN_RATIO;
            default:
                return OFF;
        }
    }
}
