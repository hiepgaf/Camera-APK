package p000;

import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Map.Entry;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: isz */
public final class isz {
    /* renamed from: h */
    private static final Charset f7409h = Charset.forName("US-ASCII");
    /* renamed from: r */
    private static final short f7410r = ExifInterface.m8476g(ExifInterface.f12398j);
    /* renamed from: s */
    private static final short f7411s = ExifInterface.m8476g(ExifInterface.f12399k);
    /* renamed from: t */
    private static final short f7412t = ExifInterface.m8476g(ExifInterface.f12414z);
    /* renamed from: u */
    private static final short f7413u = ExifInterface.m8476g(ExifInterface.f12400l);
    /* renamed from: v */
    private static final short f7414v = ExifInterface.m8476g(ExifInterface.f12401m);
    /* renamed from: w */
    private static final short f7415w = ExifInterface.m8476g(ExifInterface.f12394f);
    /* renamed from: x */
    private static final short f7416x = ExifInterface.m8476g(ExifInterface.f12396h);
    /* renamed from: a */
    public final iss f7417a;
    /* renamed from: b */
    public int f7418b;
    /* renamed from: c */
    public ite f7419c;
    /* renamed from: d */
    public itc f7420d;
    /* renamed from: e */
    public ite f7421e;
    /* renamed from: f */
    public ite f7422f;
    /* renamed from: g */
    public final TreeMap f7423g = new TreeMap();
    /* renamed from: i */
    private final int f7424i;
    /* renamed from: j */
    private int f7425j = 0;
    /* renamed from: k */
    private int f7426k = 0;
    /* renamed from: l */
    private boolean f7427l;
    /* renamed from: m */
    private boolean f7428m = false;
    /* renamed from: n */
    private int f7429n;
    /* renamed from: o */
    private byte[] f7430o;
    /* renamed from: p */
    private int f7431p;
    /* renamed from: q */
    private final ExifInterface f7432q;

    public isz(InputStream inputStream, ExifInterface exifInterface) {
        if (inputStream == null) {
            throw new IOException("Null argument inputStream to ExifParser");
        }
        boolean z;
        this.f7432q = exifInterface;
        iss iss = new iss(inputStream);
        short b = iss.m4147b();
        while (b != (short) -39) {
            int b2;
            if (!ion.m3956a(b)) {
                if (b != (short) -40) {
                    b2 = (char) iss.m4147b();
                    if (b == (short) -31 && b2 >= 8) {
                        int a = iss.m4144a();
                        short b3 = iss.m4147b();
                        b2 -= 6;
                        if (a == 1165519206 && b3 == (short) 0) {
                            this.f7429n = b2;
                            z = true;
                            break;
                        }
                    }
                    if (b2 >= 2) {
                        long j = (long) (b2 - 2);
                        if (j == iss.skip(j)) {
                            b = iss.m4147b();
                        }
                    }
                    Log.w("CAM_ExifParser", "Invalid JPEG format.");
                    z = false;
                    break;
                }
                b = iss.m4147b();
            } else {
                z = false;
                break;
            }
        }
        z = false;
        this.f7428m = z;
        this.f7417a = new iss(inputStream);
        this.f7424i = 63;
        if (this.f7428m) {
            short b4 = this.f7417a.m4147b();
            if (b4 == (short) 18761) {
                this.f7417a.m4145a(ByteOrder.LITTLE_ENDIAN);
            } else if (b4 == (short) 19789) {
                this.f7417a.m4145a(ByteOrder.BIG_ENDIAN);
            } else {
                throw new isw("Invalid TIFF header");
            }
            if (this.f7417a.m4147b() == (short) 42) {
                long c = this.f7417a.m4148c();
                if (c > 2147483647L) {
                    StringBuilder stringBuilder = new StringBuilder(35);
                    stringBuilder.append("Invalid offset ");
                    stringBuilder.append(c);
                    throw new isw(stringBuilder.toString());
                }
                b2 = (int) c;
                this.f7431p = b2;
                this.f7418b = 0;
                if (m4163a(0) || m4169c()) {
                    m4162a(0, c);
                    if (c != 8) {
                        this.f7430o = new byte[(b2 - 8)];
                        m4173a(this.f7430o);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new isw("Invalid TIFF header");
        }
    }

    /* renamed from: a */
    private final boolean m4164a(int i, int i2) {
        int i3 = this.f7432q.m8478a().get(i2);
        if (i3 == 0) {
            return false;
        }
        return ExifInterface.m8471a(i3, i);
    }

    /* renamed from: b */
    private final void m4167b(ite ite) {
        int i = 0;
        if (ite != null && ite.f7449d != 0) {
            short s = ite.f7446a;
            int i2 = ite.f7450e;
            if (s == f7410r && m4164a(i2, ExifInterface.f12398j)) {
                if (m4163a(2) || m4163a(3)) {
                    m4162a(2, ite.m4180a(0));
                }
            } else if (s == f7411s && m4164a(i2, ExifInterface.f12399k)) {
                if (m4163a(4)) {
                    m4162a(4, ite.m4180a(0));
                }
            } else if (s == f7412t && m4164a(i2, ExifInterface.f12414z)) {
                if (m4163a(3)) {
                    m4162a(3, ite.m4180a(0));
                }
            } else if (s == f7413u && m4164a(i2, ExifInterface.f12400l)) {
                if (m4168b()) {
                    this.f7423g.put(Integer.valueOf((int) ite.m4180a(0)), new itc());
                }
            } else if (s == f7414v && m4164a(i2, ExifInterface.f12401m)) {
                if (m4168b()) {
                    this.f7422f = ite;
                }
            } else if (s == f7415w && m4164a(i2, ExifInterface.f12394f)) {
                if (!m4168b()) {
                    return;
                }
                if (ite.m4193h()) {
                    while (i < ite.f7449d) {
                        if (ite.f7447b == (short) 3) {
                            m4166b(i, ite.m4180a(i));
                        } else {
                            m4166b(i, ite.m4180a(i));
                        }
                        i++;
                    }
                    return;
                }
                this.f7423g.put(Integer.valueOf(ite.f7452g), new ita(ite, false));
            } else if (s == f7416x && m4164a(i2, ExifInterface.f12396h) && m4168b() && ite.m4193h()) {
                this.f7421e = ite;
            }
        }
    }

    /* renamed from: a */
    private final boolean m4163a(int i) {
        switch (i) {
            case 0:
                return this.f7424i & 1;
            case 1:
                if ((this.f7424i & 2) == 0) {
                    return false;
                }
                return true;
            case 2:
                if ((this.f7424i & 4) == 0) {
                    return false;
                }
                return true;
            case 3:
                if ((this.f7424i & 16) == 0) {
                    return false;
                }
                return true;
            case 4:
                if ((this.f7424i & 8) == 0) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    private final boolean m4168b() {
        return (this.f7424i & 32) != 0;
    }

    /* renamed from: c */
    private final boolean m4169c() {
        switch (this.f7418b) {
            case 0:
                if (m4163a(2) || m4163a(4) || m4163a(3) || m4163a(1)) {
                    return true;
                }
                return false;
            case 1:
                return m4168b();
            case 2:
                return m4163a(3);
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final int m4172a() {
        while (this.f7428m) {
            int i = this.f7417a.f7391a;
            int i2 = (this.f7425j + 2) + (this.f7426k * 12);
            ite ite;
            if (i < i2) {
                this.f7419c = m4170d();
                ite = this.f7419c;
                if (ite != null) {
                    if (this.f7427l) {
                        m4167b(ite);
                    }
                    return 1;
                }
            }
            long e;
            if (i == i2) {
                if (this.f7418b == 0) {
                    e = m4171e();
                    if ((m4163a(1) || m4168b()) && e != 0) {
                        m4162a(1, e);
                    }
                } else {
                    if (this.f7423g.size() > 0) {
                        i = ((Integer) ((Entry) jri.m13152b(this.f7423g.firstEntry())).getKey()).intValue() - this.f7417a.f7391a;
                    } else {
                        i = 4;
                    }
                    if (i < 4) {
                        StringBuilder stringBuilder = new StringBuilder(45);
                        stringBuilder.append("Invalid size of link to next IFD: ");
                        stringBuilder.append(i);
                        Log.w("CAM_ExifParser", stringBuilder.toString());
                    } else {
                        e = m4171e();
                        if (e != 0) {
                            StringBuilder stringBuilder2 = new StringBuilder(46);
                            stringBuilder2.append("Invalid link to next IFD: ");
                            stringBuilder2.append(e);
                            Log.w("CAM_ExifParser", stringBuilder2.toString());
                        }
                    }
                }
            }
            while (this.f7423g.size() != 0) {
                Entry entry = (Entry) jri.m13152b(this.f7423g.pollFirstEntry());
                Object value = entry.getValue();
                try {
                    m4165b(((Integer) entry.getKey()).intValue());
                    if (value instanceof itb) {
                        itb itb = (itb) value;
                        this.f7418b = itb.f7439a;
                        this.f7426k = (char) this.f7417a.m4147b();
                        this.f7425j = ((Integer) entry.getKey()).intValue();
                        if (((this.f7426k * 12) + this.f7425j) + 2 > this.f7429n) {
                            i = this.f7418b;
                            stringBuilder = new StringBuilder(31);
                            stringBuilder.append("Invalid size of IFD ");
                            stringBuilder.append(i);
                            Log.w("CAM_ExifParser", stringBuilder.toString());
                            return 5;
                        }
                        this.f7427l = m4169c();
                        if (itb.f7440b) {
                            return 0;
                        }
                        int i3 = (this.f7426k * 12) + (this.f7425j + 2);
                        i = this.f7417a.f7391a;
                        if (i <= i3) {
                            if (this.f7427l) {
                                while (i < i3) {
                                    this.f7419c = m4170d();
                                    i += 12;
                                    ite ite2 = this.f7419c;
                                    if (ite2 != null) {
                                        m4167b(ite2);
                                    }
                                }
                            } else {
                                m4165b(i3);
                            }
                            e = m4171e();
                            if (this.f7418b == 0 && ((m4163a(1) || m4168b()) && e > 0)) {
                                m4162a(1, e);
                            }
                        }
                    } else if (value instanceof itc) {
                        this.f7420d = (itc) value;
                        return this.f7420d.f7442b;
                    } else {
                        ita ita = (ita) value;
                        this.f7419c = ita.f7437a;
                        ite = this.f7419c;
                        if (!(ite == null || ite.f7447b == (short) 7)) {
                            m4174a(ite);
                            m4167b(this.f7419c);
                        }
                        if (ita.f7438b) {
                            return 2;
                        }
                    }
                } catch (IOException e2) {
                    String valueOf = String.valueOf(entry.getKey());
                    String name = value.getClass().getName();
                    StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(name).length());
                    stringBuilder3.append("Failed to skip to data at: ");
                    stringBuilder3.append(valueOf);
                    stringBuilder3.append(" for ");
                    stringBuilder3.append(name);
                    stringBuilder3.append(", the file may be broken.");
                    Log.w("CAM_ExifParser", stringBuilder3.toString());
                }
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: a */
    public final int m4173a(byte[] bArr) {
        return this.f7417a.read(bArr);
    }

    /* renamed from: a */
    public final void m4174a(ite ite) {
        String valueOf;
        int i;
        int i2 = 0;
        short s = ite.f7447b;
        if (s == (short) 2 || s == (short) 7 || s == (short) 1) {
            int i3 = ite.f7449d;
            if (this.f7423g.size() > 0 && ((Integer) ((Entry) jri.m13152b(this.f7423g.firstEntry())).getKey()).intValue() < i3 + this.f7417a.f7391a) {
                Object value = ((Entry) jri.m13152b(this.f7423g.firstEntry())).getValue();
                String str;
                if (value instanceof itc) {
                    valueOf = String.valueOf(ite.toString());
                    str = "Thumbnail overlaps value for tag: \n";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    Log.w("CAM_ExifParser", valueOf);
                    valueOf = String.valueOf(((Entry) jri.m13152b(this.f7423g.pollFirstEntry())).getKey());
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    stringBuilder.append("Invalid thumbnail offset: ");
                    stringBuilder.append(valueOf);
                    Log.w("CAM_ExifParser", stringBuilder.toString());
                } else {
                    StringBuilder stringBuilder2;
                    if (value instanceof itb) {
                        i = ((itb) value).f7439a;
                        str = ite.toString();
                        stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 41);
                        stringBuilder2.append("Ifd ");
                        stringBuilder2.append(i);
                        stringBuilder2.append(" overlaps value for tag: \n");
                        stringBuilder2.append(str);
                        Log.w("CAM_ExifParser", stringBuilder2.toString());
                    } else if (value instanceof ita) {
                        valueOf = ((ita) value).f7437a.toString();
                        str = ite.toString();
                        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(str).length());
                        stringBuilder3.append("Tag value for tag: \n");
                        stringBuilder3.append(valueOf);
                        stringBuilder3.append(" overlaps value for tag: \n");
                        stringBuilder3.append(str);
                        Log.w("CAM_ExifParser", stringBuilder3.toString());
                    }
                    i = ((Integer) ((Entry) jri.m13152b(this.f7423g.firstEntry())).getKey()).intValue() - this.f7417a.f7391a;
                    str = ite.toString();
                    stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 52);
                    stringBuilder2.append("Invalid size of tag: \n");
                    stringBuilder2.append(str);
                    stringBuilder2.append(" setting count to: ");
                    stringBuilder2.append(i);
                    Log.w("CAM_ExifParser", stringBuilder2.toString());
                    ite.f7449d = i;
                }
            }
        }
        iqn[] iqnArr;
        switch (ite.f7447b) {
            case (short) 1:
            case (short) 7:
                byte[] bArr = new byte[ite.f7449d];
                m4173a(bArr);
                ite.m4182a(bArr);
                return;
            case (short) 2:
                i = ite.f7449d;
                Charset charset = f7409h;
                if (i <= 0) {
                    valueOf = "";
                } else {
                    byte[] bArr2 = new byte[i];
                    this.f7417a.m4146a(bArr2, bArr2.length);
                    valueOf = new String(bArr2, charset);
                }
                ite.m4181a(valueOf);
                return;
            case (short) 3:
                int[] iArr = new int[ite.f7449d];
                int length = iArr.length;
                for (i = 0; i < length; i++) {
                    iArr[i] = (char) this.f7417a.m4147b();
                }
                ite.m4183a(iArr);
                return;
            case (short) 4:
                long[] jArr = new long[ite.f7449d];
                i3 = jArr.length;
                while (i2 < i3) {
                    jArr[i2] = m4171e();
                    i2++;
                }
                ite.m4184a(jArr);
                return;
            case (short) 5:
                iqnArr = new iqn[ite.f7449d];
                i3 = iqnArr.length;
                while (i2 < i3) {
                    iqnArr[i2] = new iqn(m4171e(), m4171e());
                    i2++;
                }
                ite.m4185a(iqnArr);
                return;
            case (short) 9:
                int[] iArr2 = new int[ite.f7449d];
                i3 = iArr2.length;
                while (i2 < i3) {
                    iArr2[i2] = this.f7417a.m4144a();
                    i2++;
                }
                ite.m4183a(iArr2);
                return;
            case (short) 10:
                iqnArr = new iqn[ite.f7449d];
                i3 = iqnArr.length;
                while (i2 < i3) {
                    iqnArr[i2] = new iqn((long) this.f7417a.m4144a(), (long) this.f7417a.m4144a());
                    i2++;
                }
                ite.m4185a(iqnArr);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private final ite m4170d() {
        boolean z = true;
        short b = this.f7417a.m4147b();
        short b2 = this.f7417a.m4147b();
        long c = this.f7417a.m4148c();
        if (c > 2147483647L) {
            throw new isw("Number of component is larger then Integer.MAX_VALUE");
        } else if (ite.m4177b(b2)) {
            int i = (int) c;
            int i2 = this.f7418b;
            if (i == 0) {
                z = false;
            }
            ite ite = new ite(b, b2, i, i2, z);
            int a = ite.m4179a();
            if (a > 4) {
                long c2 = this.f7417a.m4148c();
                if (c2 > 2147483647L) {
                    throw new isw("offset is larger then Integer.MAX_VALUE");
                } else if (c2 >= ((long) this.f7431p) || b2 != (short) 7) {
                    ite.f7452g = (int) c2;
                    return ite;
                } else {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f7430o, ((int) c2) - 8, bArr, 0, i);
                    ite.m4182a(bArr);
                    return ite;
                }
            }
            boolean z2 = ite.f7448c;
            ite.f7448c = false;
            m4174a(ite);
            ite.f7448c = z2;
            this.f7417a.skip((long) (4 - a));
            ite.f7452g = this.f7417a.f7391a - 4;
            return ite;
        } else {
            Log.w("CAM_ExifParser", String.format("Tag %04x: Invalid data type %d", new Object[]{Short.valueOf(b), Short.valueOf(b2)}));
            this.f7417a.skip(4);
            return null;
        }
    }

    /* renamed from: e */
    private final long m4171e() {
        return ((long) this.f7417a.m4144a()) & 4294967295L;
    }

    /* renamed from: a */
    private final void m4162a(int i, long j) {
        this.f7423g.put(Integer.valueOf((int) j), new itb(i, m4163a(i)));
    }

    /* renamed from: b */
    private final void m4166b(int i, long j) {
        this.f7423g.put(Integer.valueOf((int) j), new itc(i));
    }

    /* renamed from: b */
    private final void m4165b(int i) {
        iss iss = this.f7417a;
        long j = ((long) i) - ((long) iss.f7391a);
        if (iss.skip(j) == j) {
            while (!this.f7423g.isEmpty() && ((Integer) this.f7423g.firstKey()).intValue() < i) {
                this.f7423g.pollFirstEntry();
            }
            return;
        }
        throw new EOFException();
    }
}
