package com.google.android.libraries.camera.exif;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import p000.ikm;
import p000.iqn;
import p000.ist;
import p000.isu;
import p000.isz;
import p000.ita;
import p000.itd;
import p000.ite;
import p000.itf;
import p000.ith;
import p000.jri;

@UsedByReflection
/* compiled from: PG */
public class ExifInterface implements isu {
    /* renamed from: A */
    public static final int f12367A = 173059;
    /* renamed from: B */
    public static final int f12368B = 173061;
    /* renamed from: C */
    public static final int f12369C = 173068;
    /* renamed from: D */
    public static final int f12370D = 262145;
    /* renamed from: E */
    public static final int f12371E = 262146;
    /* renamed from: F */
    public static final int f12372F = 262147;
    /* renamed from: G */
    public static final int f12373G = 262148;
    /* renamed from: H */
    public static final int f12374H = 262149;
    /* renamed from: I */
    public static final int f12375I = 262150;
    /* renamed from: J */
    public static final int f12376J = 262151;
    /* renamed from: K */
    public static final int f12377K = 262160;
    /* renamed from: L */
    public static final int f12378L = 262161;
    /* renamed from: M */
    public static final int f12379M = 262173;
    /* renamed from: O */
    public static final Long f12380O;
    /* renamed from: S */
    private static final int f12381S = 258;
    /* renamed from: T */
    private static final int f12382T = 259;
    @UsedByReflection
    public static final int TAG_SOFTWARE = 305;
    /* renamed from: U */
    private static final int f12383U = 262;
    /* renamed from: V */
    private static final int f12384V = 277;
    /* renamed from: W */
    private static final int f12385W = 278;
    /* renamed from: X */
    private static final int f12386X = 282;
    /* renamed from: Y */
    private static final int f12387Y = 283;
    /* renamed from: Z */
    private static final int f12388Z = 284;
    /* renamed from: a */
    public static final int f12389a = 256;
    private static final int aA = 168594;
    private static final int aB = 172032;
    private static final int aC = 172033;
    private static final int aD = 172036;
    private static final int aE = 172555;
    private static final int aF = 172556;
    private static final int aG = 172558;
    private static final int aH = 172559;
    private static final int aI = 172560;
    private static final int aJ = 172564;
    private static final int aK = 172565;
    private static final int aL = 172567;
    private static final int aM = 172800;
    private static final int aN = 172801;
    private static final int aO = 172802;
    private static final int aP = 173057;
    private static final int aQ = 173058;
    private static final int aR = 173060;
    private static final int aS = 173062;
    private static final int aT = 173063;
    private static final int aU = 173064;
    private static final int aV = 173065;
    private static final int aW = 173066;
    private static final int aX = 173067;
    private static final int aY = 173088;
    private static final int aZ = 262144;
    private static final int aa = 296;
    private static final int ab = FrameType.ELEMENT_RGBA8888;
    private static final int ac = 315;
    private static final int ad = 318;
    private static final int ae = 319;
    private static final int af = 529;
    private static final int ag = 530;
    private static final int ah = 531;
    private static final int ai = 532;
    private static final int aj = 33432;
    private static final int ak = 165922;
    private static final int al = 165924;
    private static final int am = 165928;
    private static final int an = 167936;
    private static final int ao = 167939;
    private static final int ap = 167940;
    private static final int aq = 168193;
    private static final int ar = 168194;
    private static final int as = 168451;
    private static final int at = 168453;
    private static final int au = 168455;
    private static final int av = 168456;
    private static final int aw = 168468;
    private static final int ax = 168582;
    private static final int ay = 168592;
    private static final int az = 168593;
    /* renamed from: b */
    public static final int f12390b = 257;
    private static final int ba = 262152;
    private static final int bb = 262153;
    private static final int bc = 262154;
    private static final int bd = 262155;
    private static final int be = 262156;
    private static final int bf = 262157;
    private static final int bg = 262158;
    private static final int bh = 262159;
    private static final int bi = 262162;
    private static final int bj = 262163;
    private static final int bk = 262164;
    private static final int bl = 262167;
    private static final int bm = 262168;
    private static final int bn = 262169;
    private static final int bo = 262170;
    private static final int bp = 262171;
    private static final int bq = 262172;
    private static final int br = 262174;
    private static final int bs = 196609;
    private static final int bt = 196610;
    private static HashSet bu;
    private static HashSet bv;
    private static final Long bw;
    private static final ByteOrder bx = ByteOrder.BIG_ENDIAN;
    /* renamed from: c */
    public static final int f12391c = MediaDecoder.ROTATE_90_LEFT;
    /* renamed from: d */
    public static final int f12392d = 271;
    /* renamed from: e */
    public static final int f12393e = 272;
    /* renamed from: f */
    public static final int f12394f = 273;
    /* renamed from: g */
    public static final int f12395g = 274;
    /* renamed from: h */
    public static final int f12396h = 279;
    /* renamed from: i */
    public static final int f12397i = 306;
    /* renamed from: j */
    public static final int f12398j = 34665;
    /* renamed from: k */
    public static final int f12399k = 34853;
    /* renamed from: l */
    public static final int f12400l = 66049;
    /* renamed from: m */
    public static final int f12401m = 66050;
    /* renamed from: n */
    public static final int f12402n = 164506;
    /* renamed from: o */
    public static final int f12403o = 164509;
    /* renamed from: p */
    public static final int f12404p = 165927;
    /* renamed from: q */
    public static final int f12405q = 168449;
    /* renamed from: r */
    public static final int f12406r = 168450;
    /* renamed from: s */
    public static final int f12407s = 168452;
    /* renamed from: t */
    public static final int f12408t = 168454;
    /* renamed from: u */
    public static final int f12409u = 168457;
    /* renamed from: v */
    public static final int f12410v = 168458;
    /* renamed from: w */
    public static final int f12411w = 168572;
    /* renamed from: x */
    public static final int f12412x = 172034;
    /* renamed from: y */
    public static final int f12413y = 172035;
    /* renamed from: z */
    public static final int f12414z = 172037;
    /* renamed from: N */
    public int f12415N = 0;
    /* renamed from: P */
    public ist f12416P = new ist(bx);
    /* renamed from: Q */
    public final DateFormat f12417Q = new SimpleDateFormat("yyyy:MM:dd");
    /* renamed from: R */
    public final Calendar f12418R = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    private final DateFormat by = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    private SparseIntArray bz = null;

    static {
        HashSet hashSet = new HashSet();
        bu = hashSet;
        hashSet.add(Short.valueOf((short) f12399k));
        bu.add(Short.valueOf((short) f12398j));
        bu.add(Short.valueOf((short) f12400l));
        bu.add(Short.valueOf((short) f12414z));
        bu.add(Short.valueOf((short) f12394f));
        hashSet = new HashSet(bu);
        bv = hashSet;
        hashSet.add(Short.valueOf((short) -1));
        bv.add(Short.valueOf((short) f12401m));
        bv.add(Short.valueOf((short) f12396h));
        Long valueOf = Long.valueOf(100);
        f12380O = valueOf;
        bw = valueOf;
    }

    @UsedByReflection
    public ExifInterface() {
        this.f12417Q.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* renamed from: a */
    public final boolean m8486a(int i, long j, TimeZone timeZone) {
        if (i != f12397i && i != ap && i != ao) {
            return false;
        }
        this.by.setTimeZone(timeZone);
        ite a = m8479a(i, this.by.format(Long.valueOf(j)));
        if (a == null) {
            return false;
        }
        m8480a(a);
        return true;
    }

    /* renamed from: a */
    public final ite m8479a(int i, Object obj) {
        int i2 = 0;
        int i3 = i >>> 16;
        int i4 = m8478a().get(i);
        if (i4 == 0 || obj == null) {
            return null;
        }
        boolean z;
        short h = m8477h(i4);
        char c = (char) i4;
        if (c != '\u0000') {
            z = true;
        } else {
            z = false;
        }
        if (!m8471a(i4, i3)) {
            return null;
        }
        ite ite = new ite((short) i, h, c, i3, z);
        if (obj != null) {
            if (obj instanceof Short) {
                i2 = ite.m4188c((char) ((Short) obj).shortValue());
            } else if (obj instanceof String) {
                i2 = ite.m4181a((String) obj);
            } else if (obj instanceof int[]) {
                i2 = ite.m4183a((int[]) obj);
            } else if (obj instanceof long[]) {
                i2 = ite.m4184a((long[]) obj);
            } else if (obj instanceof iqn) {
                i2 = ite.m4185a(new iqn[]{(iqn) obj});
            } else if (obj instanceof iqn[]) {
                i2 = ite.m4185a((iqn[]) obj);
            } else if (obj instanceof byte[]) {
                i2 = ite.m4182a((byte[]) obj);
            } else if (obj instanceof Integer) {
                i2 = ite.m4188c(((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                i2 = ite.m4184a(new long[]{((Long) obj).longValue()});
            } else if (obj instanceof Byte) {
                i2 = ite.m4182a(new byte[]{((Byte) obj).byteValue()});
            } else if (obj instanceof Short[]) {
                Short[] shArr = (Short[]) obj;
                r3 = new int[shArr.length];
                for (r1 = 0; r1 < shArr.length; r1++) {
                    char shortValue;
                    Short sh = shArr[r1];
                    if (sh != null) {
                        shortValue = (char) sh.shortValue();
                    } else {
                        shortValue = '\u0000';
                    }
                    r3[r1] = shortValue;
                }
                i2 = ite.m4183a(r3);
            } else if (obj instanceof Integer[]) {
                Integer[] numArr = (Integer[]) obj;
                r3 = new int[numArr.length];
                for (r1 = 0; r1 < numArr.length; r1++) {
                    int intValue;
                    Integer num = numArr[r1];
                    if (num != null) {
                        intValue = num.intValue();
                    } else {
                        intValue = 0;
                    }
                    r3[r1] = intValue;
                }
                i2 = ite.m4183a(r3);
            } else if (obj instanceof Long[]) {
                Long[] lArr = (Long[]) obj;
                long[] jArr = new long[lArr.length];
                while (i2 < lArr.length) {
                    long longValue;
                    Long l = lArr[i2];
                    if (l != null) {
                        longValue = l.longValue();
                    } else {
                        longValue = 0;
                    }
                    jArr[i2] = longValue;
                    i2++;
                }
                i2 = ite.m4184a(jArr);
            } else if (obj instanceof Byte[]) {
                Byte[] bArr = (Byte[]) obj;
                byte[] bArr2 = new byte[bArr.length];
                for (r1 = 0; r1 < bArr.length; r1++) {
                    byte byteValue;
                    Byte b = bArr[r1];
                    if (b != null) {
                        byteValue = b.byteValue();
                    } else {
                        byteValue = (byte) 0;
                    }
                    bArr2[r1] = byteValue;
                }
                i2 = ite.m4182a(bArr2);
            }
        }
        if (i2 == 0) {
            return null;
        }
        return ite;
    }

    /* renamed from: c */
    public final ite m8489c(int i) {
        int i2 = m8478a().get(i);
        if (i2 == 0) {
            return null;
        }
        boolean z;
        short h = m8477h(i2);
        char c = (char) i2;
        if (c != '\u0000') {
            z = true;
        } else {
            z = false;
        }
        return new ite((short) i, h, c, i >>> 16, z);
    }

    /* renamed from: a */
    public static double m8468a(iqn[] iqnArr, String str) {
        try {
            double a = (iqnArr[0].m4042a() + (iqnArr[1].m4042a() / 60.0d)) + (iqnArr[2].m4042a() / 3600.0d);
            if (str.startsWith("S") || str.startsWith("W")) {
                return -a;
            }
            return a;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m8470a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        while (read != -1) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr, 0, 1024);
        }
    }

    /* renamed from: d */
    public final int m8490d(int i) {
        if (m8478a().get(i) == 0) {
            return -1;
        }
        return i >>> 16;
    }

    /* renamed from: a */
    public final OutputStream m8481a(OutputStream outputStream) {
        if (outputStream != null) {
            return new ikm(new itf(new BufferedOutputStream(outputStream, 65536), this, this.f12416P));
        }
        throw new IllegalArgumentException("Argument is null");
    }

    /* renamed from: a */
    public final OutputStream m8482a(String str) {
        if (str != null) {
            try {
                return m8481a(new FileOutputStream(str));
            } catch (FileNotFoundException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException("Argument is null");
    }

    /* renamed from: a */
    private static int m8469a(int[] iArr) {
        if (iArr.length == 0) {
            return 0;
        }
        int[] iArr2 = ith.f7456c;
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 : iArr) {
                if (iArr2[i2] == i3) {
                    i |= 1 << i2;
                    break;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public final ite m8491e(int i) {
        return m8474b(i, m8490d(i));
    }

    /* renamed from: b */
    private final ite m8474b(int i, int i2) {
        if (!ite.m4176b(i2)) {
            return null;
        }
        short s = (short) i;
        ith ith = this.f12416P.f7394a[i2];
        if (ith != null) {
            return ith.m4202a(s);
        }
        return null;
    }

    /* renamed from: a */
    public final SparseIntArray m8478a() {
        if (this.bz == null) {
            this.bz = new SparseIntArray();
            int a = m8469a(new int[]{0, 1}) << 24;
            SparseIntArray sparseIntArray = (SparseIntArray) jri.m13152b(this.bz);
            int i = a | 131072;
            sparseIntArray.put(f12392d, i);
            int i2 = a | 262144;
            int i3 = i2 | 1;
            sparseIntArray.put(f12389a, i3);
            sparseIntArray.put(f12390b, i3);
            int i4 = a | 196608;
            sparseIntArray.put(f12381S, i4 | 3);
            int i5 = i4 | 1;
            sparseIntArray.put(f12382T, i5);
            sparseIntArray.put(f12383U, i5);
            sparseIntArray.put(f12395g, i5);
            sparseIntArray.put(f12384V, i5);
            sparseIntArray.put(f12388Z, i5);
            sparseIntArray.put(ag, i4 | 2);
            sparseIntArray.put(ah, i5);
            a |= 327680;
            int i6 = a | 1;
            sparseIntArray.put(f12386X, i6);
            sparseIntArray.put(f12387Y, i6);
            sparseIntArray.put(aa, i5);
            sparseIntArray.put(f12394f, i2);
            sparseIntArray.put(f12385W, i3);
            sparseIntArray.put(f12396h, i2);
            sparseIntArray.put(ab, i4 | 768);
            sparseIntArray.put(ad, a | 2);
            i2 = a | 6;
            sparseIntArray.put(ae, i2);
            sparseIntArray.put(af, a | 3);
            sparseIntArray.put(ai, i2);
            sparseIntArray.put(f12397i, i | 20);
            sparseIntArray.put(f12391c, i);
            sparseIntArray.put(f12392d, i);
            sparseIntArray.put(f12393e, i);
            sparseIntArray.put(TAG_SOFTWARE, i);
            sparseIntArray.put(ac, i);
            sparseIntArray.put(aj, i);
            sparseIntArray.put(f12398j, i3);
            sparseIntArray.put(f12399k, i3);
            a = ((m8469a(new int[]{1}) << 24) | 262144) | 1;
            sparseIntArray.put(f12400l, a);
            sparseIntArray.put(f12401m, a);
            a = m8469a(new int[]{2}) << 24;
            i = 458752 | a;
            i2 = i | 4;
            sparseIntArray.put(an, i2);
            sparseIntArray.put(aB, i2);
            i3 = a | 196608;
            i4 = i3 | 1;
            sparseIntArray.put(aC, i4);
            sparseIntArray.put(aq, i2);
            i2 = (327680 | a) | 1;
            sparseIntArray.put(ar, i2);
            i5 = (a | 262144) | 1;
            sparseIntArray.put(f12412x, i5);
            sparseIntArray.put(f12413y, i5);
            sparseIntArray.put(f12411w, i);
            sparseIntArray.put(ax, i);
            i6 = a | 131072;
            sparseIntArray.put(aD, i6 | 13);
            int i7 = i6 | 20;
            sparseIntArray.put(ao, i7);
            sparseIntArray.put(ap, i7);
            sparseIntArray.put(ay, i6);
            sparseIntArray.put(az, i6);
            sparseIntArray.put(aA, i6);
            sparseIntArray.put(aY, i6 | 33);
            sparseIntArray.put(f12402n, i2);
            sparseIntArray.put(f12403o, i2);
            sparseIntArray.put(ak, i4);
            sparseIntArray.put(al, i6);
            sparseIntArray.put(f12404p, i3);
            sparseIntArray.put(am, i);
            a = (a | 655360) | 1;
            sparseIntArray.put(f12405q, a);
            sparseIntArray.put(f12406r, i2);
            sparseIntArray.put(as, a);
            sparseIntArray.put(f12407s, a);
            sparseIntArray.put(at, i2);
            sparseIntArray.put(f12408t, i2);
            sparseIntArray.put(au, i4);
            sparseIntArray.put(av, i4);
            sparseIntArray.put(f12409u, i4);
            sparseIntArray.put(f12410v, i2);
            sparseIntArray.put(aw, i3);
            sparseIntArray.put(aE, i2);
            sparseIntArray.put(aF, i);
            sparseIntArray.put(aG, i2);
            sparseIntArray.put(aH, i2);
            sparseIntArray.put(aI, i4);
            sparseIntArray.put(aJ, i3 | 2);
            sparseIntArray.put(aK, i2);
            sparseIntArray.put(aL, i4);
            a = i | 1;
            sparseIntArray.put(aM, a);
            sparseIntArray.put(aN, a);
            sparseIntArray.put(aO, i);
            sparseIntArray.put(aP, i4);
            sparseIntArray.put(aQ, i4);
            sparseIntArray.put(f12367A, i4);
            sparseIntArray.put(aR, i2);
            sparseIntArray.put(f12368B, i4);
            sparseIntArray.put(aS, i4);
            sparseIntArray.put(aT, i2);
            sparseIntArray.put(aU, i4);
            sparseIntArray.put(aV, i4);
            sparseIntArray.put(aW, i4);
            sparseIntArray.put(aX, i);
            sparseIntArray.put(f12369C, i4);
            sparseIntArray.put(f12414z, i5);
            a = m8469a(new int[]{4}) << 24;
            i = 65536 | a;
            sparseIntArray.put(aZ, i | 4);
            i2 = a | 131072;
            i3 = i2 | 2;
            sparseIntArray.put(f12370D, i3);
            sparseIntArray.put(f12372F, i3);
            i4 = 327680 | a;
            i5 = i4 | 3;
            sparseIntArray.put(f12371E, i5);
            sparseIntArray.put(f12373G, i5);
            sparseIntArray.put(f12374H, i | 1);
            i = i4 | 1;
            sparseIntArray.put(f12375I, i);
            sparseIntArray.put(f12376J, i5);
            sparseIntArray.put(ba, i2);
            sparseIntArray.put(bb, i3);
            sparseIntArray.put(bc, i3);
            sparseIntArray.put(bd, i);
            sparseIntArray.put(be, i3);
            sparseIntArray.put(bf, i);
            sparseIntArray.put(bg, i3);
            sparseIntArray.put(bh, i);
            sparseIntArray.put(f12377K, i3);
            sparseIntArray.put(f12378L, i);
            sparseIntArray.put(bi, i2);
            sparseIntArray.put(bj, i3);
            sparseIntArray.put(bk, i);
            sparseIntArray.put(bl, i3);
            sparseIntArray.put(bm, i);
            sparseIntArray.put(bn, i3);
            sparseIntArray.put(bo, i);
            i = 458752 | a;
            sparseIntArray.put(bp, i);
            sparseIntArray.put(bq, i);
            sparseIntArray.put(f12379M, i2 | 11);
            sparseIntArray.put(br, (a | 196608) | 11);
            a = m8469a(new int[]{3}) << 24;
            sparseIntArray.put(bs, a | 131072);
            sparseIntArray.put(bt, a | 458752);
        }
        jri.m13152b(this.bz);
        return this.bz;
    }

    /* renamed from: a */
    public final Integer mo828a(int i) {
        int[] b;
        ite b2 = m8474b(i, m8490d(i));
        if (b2 != null) {
            b = b2.m4186b();
        } else {
            b = null;
        }
        if (b == null || b.length <= 0) {
            return null;
        }
        return Integer.valueOf(b[0]);
    }

    /* renamed from: b */
    public final iqn mo829b(int i) {
        iqn[] c = m8475c(i, m8490d(i));
        if (c == null || c.length == 0) {
            return null;
        }
        return new iqn(c[0]);
    }

    /* renamed from: f */
    public final iqn[] m8492f(int i) {
        return m8475c(i, m8490d(i));
    }

    /* renamed from: c */
    private final iqn[] m8475c(int i, int i2) {
        ite b = m8474b(i, i2);
        if (b == null) {
            return null;
        }
        return b.m4191f();
    }

    @UsedByReflection
    public String getTagStringValue(int i) {
        ite b = m8474b(i, m8490d(i));
        if (b == null) {
            return null;
        }
        return b.m4192g();
    }

    /* renamed from: g */
    public static short m8476g(int i) {
        return (short) i;
    }

    /* renamed from: h */
    private static short m8477h(int i) {
        return (i >> 16) & Illuminant.kOther;
    }

    /* renamed from: a */
    public static boolean m8471a(int i, int i2) {
        int i3 = i >>> 24;
        int[] iArr = ith.f7456c;
        int i4 = 0;
        while (i4 < iArr.length) {
            if (i2 == iArr[i4] && ((i3 >> i4) & 1) == 1) {
                return true;
            }
            i4++;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m8472a(short s) {
        return bu.contains(Short.valueOf(s));
    }

    /* renamed from: a */
    public final void m8484a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                isz isz = new isz(inputStream, new itd(this).f7443a);
                ist ist = new ist(isz.f7417a.f7392b.order());
                for (int a = isz.m4172a(); a != 5; a = isz.m4172a()) {
                    ite ite;
                    ith a2;
                    switch (a) {
                        case 0:
                            ist.m4151a(new ith(isz.f7418b));
                            break;
                        case 1:
                            ite = isz.f7419c;
                            if (ite != null) {
                                if (!ite.m4193h()) {
                                    int i = ite.f7452g;
                                    if (i < isz.f7417a.f7391a) {
                                        break;
                                    }
                                    isz.f7423g.put(Integer.valueOf(i), new ita(ite, true));
                                    break;
                                }
                                a2 = ist.m4150a(ite.f7450e);
                                if (a2 == null) {
                                    break;
                                }
                                a2.m4201a(ite);
                                break;
                            }
                            break;
                        case 2:
                            ite = isz.f7419c;
                            if (ite != null) {
                                if (ite.f7447b == (short) 7) {
                                    isz.m4174a(ite);
                                }
                                a2 = ist.m4150a(ite.f7450e);
                                if (a2 == null) {
                                    break;
                                }
                                a2.m4201a(ite);
                                break;
                            }
                            break;
                        case 3:
                            ite = isz.f7422f;
                            if (ite != null) {
                                a = (int) ite.m4180a(0);
                            } else {
                                a = 0;
                            }
                            byte[] bArr = new byte[a];
                            if (bArr.length == isz.m4173a(bArr)) {
                                ist.f7395b = bArr;
                                break;
                            } else {
                                Log.w("CAM_ExifReader", "Failed to read the compressed thumbnail");
                                break;
                            }
                        case 4:
                            ite = isz.f7421e;
                            if (ite != null) {
                                a = (int) ite.m4180a(0);
                            } else {
                                a = 0;
                            }
                            byte[] bArr2 = new byte[a];
                            if (bArr2.length != isz.m4173a(bArr2)) {
                                Log.w("CAM_ExifReader", "Failed to read the strip bytes");
                                break;
                            }
                            int i2 = isz.f7420d.f7441a;
                            if (i2 >= ist.f7396c.size()) {
                                for (a = ist.f7396c.size(); a < i2; a++) {
                                    ist.f7396c.add(null);
                                }
                                ist.f7396c.add(bArr2);
                                break;
                            }
                            ist.f7396c.set(i2, bArr2);
                            break;
                        default:
                            break;
                    }
                }
                this.f12416P = ist;
                return;
            } catch (Throwable e) {
                throw new IOException("Invalid exif format : ", e);
            }
        }
        throw new IllegalArgumentException("Argument is null");
    }

    @UsedByReflection
    public void readExif(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        m8484a(bufferedInputStream);
        bufferedInputStream.close();
    }

    /* renamed from: a */
    public final void m8485a(byte[] bArr) {
        m8484a(new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public final ite m8480a(ite ite) {
        return this.f12416P.m4149a(ite);
    }

    /* renamed from: a */
    public static iqn[] m8473a(double d) {
        double abs = Math.abs(d);
        int i = (int) ((abs - ((double) ((int) abs))) * 60.0d);
        long longValue = bw.longValue();
        return new iqn[]{new iqn((long) r2, 1), new iqn((long) i, 1), new iqn((long) ((int) (((abs - ((double) i)) * 60.0d) * ((double) longValue))), bw.longValue())};
    }

    /* renamed from: b */
    public final void m8488b(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        OutputStream a = m8481a(outputStream);
        m8470a(inputStream, a);
        a.flush();
        a.close();
    }
}
