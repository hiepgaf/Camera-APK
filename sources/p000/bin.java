package p000;

/* compiled from: PG */
/* renamed from: bin */
public final class bin {
    /* renamed from: a */
    public static final bsk f1189a = new bsk("camcorder.h265");
    /* renamed from: b */
    public static final bsa f1190b = new bsa("camcorder.codec");
    /* renamed from: c */
    public static final bst f1191c;
    /* renamed from: d */
    public static final bst f1192d;
    /* renamed from: e */
    public static final bst f1193e;

    static {
        Integer valueOf = Integer.valueOf(30);
        Integer valueOf2 = Integer.valueOf(60);
        Integer valueOf3 = Integer.valueOf(120);
        Integer valueOf4 = Integer.valueOf(240);
        f1191c = new bst("camcorder.capture_rate", keu.m13475a(valueOf, valueOf2, valueOf3, valueOf4));
        bsb bsb = new bsb("camcorder.ois");
        Integer valueOf5 = Integer.valueOf(144);
        valueOf = Integer.valueOf(288);
        valueOf2 = Integer.valueOf(480);
        valueOf3 = Integer.valueOf(720);
        Integer valueOf6 = Integer.valueOf(1080);
        Integer[] numArr = new Integer[1];
        numArr[0] = Integer.valueOf(2160);
        f1192d = new bst("camcorder.vidqual_front", keu.m13476a(valueOf5, valueOf4, valueOf, valueOf2, valueOf3, valueOf6, numArr));
        f1193e = new bst("camcorder.vidqual_back", keu.m13476a(valueOf5, valueOf4, valueOf, valueOf2, valueOf3, valueOf6, r8));
    }
}
