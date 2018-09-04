package p000;

/* compiled from: PG */
/* renamed from: gcb */
public class gcb {
    /* renamed from: a */
    public static final int f5051a = 1;
    /* renamed from: b */
    public static final int f5052b = 2;
    /* renamed from: c */
    public static final int f5053c = 1;
    /* renamed from: d */
    public static final int f5054d = 2;
    /* renamed from: e */
    public static final int f5055e = 3;
    /* renamed from: f */
    public static final int f5056f = 4;
    /* renamed from: g */
    public static final int f5057g = 5;
    /* renamed from: h */
    public static final int f5058h = 6;
    /* renamed from: i */
    public static final int f5059i = 7;
    /* renamed from: j */
    public static final int f5060j = 8;
    /* renamed from: k */
    public static final int f5061k = 9;
    /* renamed from: l */
    public static final /* synthetic */ int[] f5062l = new int[]{f5053c, f5054d, f5055e, f5056f, f5057g, f5058h, f5059i, f5060j, f5061k};
    /* renamed from: m */
    private static final int f5063m = 3;
    /* renamed from: n */
    private static final int f5064n = 4;
    /* renamed from: o */
    private static final /* synthetic */ int[] f5065o = new int[]{f5051a, f5052b, f5063m, f5064n};

    /* renamed from: a */
    public static int m2470a(iqm iqm, boolean z) {
        if (z) {
            if (iqm == iqm.CLOCKWISE_0) {
                return f5051a;
            }
            if (iqm == iqm.CLOCKWISE_90) {
                return f5063m;
            }
            if (iqm == iqm.CLOCKWISE_180) {
                return f5052b;
            }
            return f5064n;
        } else if (iqm == iqm.CLOCKWISE_0) {
            return f5063m;
        } else {
            if (iqm == iqm.CLOCKWISE_90) {
                return f5051a;
            }
            if (iqm == iqm.CLOCKWISE_180) {
                return f5064n;
            }
            return f5052b;
        }
    }

    /* renamed from: a */
    public static boolean m2471a(int i) {
        if (i != 0) {
            return i == f5063m || i == f5064n;
        } else {
            throw null;
        }
    }
}
