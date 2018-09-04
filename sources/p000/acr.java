package p000;

import com.google.googlex.gcam.androidutils.camera2.BlockingCameraManager;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: acr */
public final class acr implements Closeable {
    /* renamed from: a */
    public final File f256a;
    /* renamed from: b */
    public final int f257b;
    /* renamed from: c */
    public Writer f258c;
    /* renamed from: d */
    public int f259d;
    /* renamed from: e */
    private final File f260e;
    /* renamed from: f */
    private final File f261f;
    /* renamed from: g */
    private final File f262g;
    /* renamed from: h */
    private final int f263h;
    /* renamed from: i */
    private long f264i;
    /* renamed from: j */
    private long f265j = 0;
    /* renamed from: k */
    private final LinkedHashMap f266k = new LinkedHashMap(0, 0.75f, true);
    /* renamed from: l */
    private long f267l = 0;
    /* renamed from: m */
    private final ThreadPoolExecutor f268m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new act());
    /* renamed from: n */
    private final Callable f269n = new acs(this);

    private acr(File file, long j) {
        this.f256a = file;
        this.f263h = 1;
        this.f260e = new File(file, "journal");
        this.f261f = new File(file, "journal.tmp");
        this.f262g = new File(file, "journal.bkp");
        this.f257b = 1;
        this.f264i = j;
    }

    /* renamed from: d */
    private final void m128d() {
        if (this.f258c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void close() {
        if (this.f258c != null) {
            ArrayList arrayList = new ArrayList(this.f266k.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                acu acu = ((acv) arrayList.get(i)).f280f;
                if (acu != null) {
                    acu.m137a();
                    i = i2;
                } else {
                    i = i2;
                }
            }
            m134c();
            this.f258c.close();
            this.f258c = null;
        }
    }

    /* renamed from: a */
    final synchronized void m130a(acu acu, boolean z) {
        int i = 0;
        synchronized (this) {
            acv acv = acu.f271a;
            if (acv.f280f != acu) {
                throw new IllegalStateException();
            }
            if (z && !acv.f279e) {
                int i2 = 0;
                while (i2 < this.f257b) {
                    if (!acu.f272b[i2]) {
                        acu.m137a();
                        StringBuilder stringBuilder = new StringBuilder(61);
                        stringBuilder.append("Newly created entry didn't create value for index ");
                        stringBuilder.append(i2);
                        throw new IllegalStateException(stringBuilder.toString());
                    } else if (!acv.f278d[i2].exists()) {
                        acu.m137a();
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            while (i < this.f257b) {
                File file = acv.f278d[i];
                if (!z) {
                    acr.m126a(file);
                } else if (file.exists()) {
                    File file2 = acv.f277c[i];
                    file.renameTo(file2);
                    long j = acv.f276b[i];
                    long length = file2.length();
                    acv.f276b[i] = length;
                    this.f265j = (this.f265j - j) + length;
                }
                i++;
            }
            this.f259d++;
            acv.f280f = null;
            if ((acv.f279e | z) == 0) {
                this.f266k.remove(acv.f275a);
                this.f258c.append("REMOVE");
                this.f258c.append(' ');
                this.f258c.append(acv.f275a);
                this.f258c.append('\n');
            } else {
                acv.f279e = true;
                this.f258c.append("CLEAN");
                this.f258c.append(' ');
                this.f258c.append(acv.f275a);
                this.f258c.append(acv.m142a());
                this.f258c.append('\n');
                if (z) {
                    this.f267l++;
                }
            }
            this.f258c.flush();
            if (this.f265j > this.f264i || m131a()) {
                this.f268m.submit(this.f269n);
            }
        }
    }

    /* renamed from: a */
    private static void m126a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public final synchronized acu m129a(String str) {
        acu acu;
        acv acv;
        m128d();
        acv acv2 = (acv) this.f266k.get(str);
        if (acv2 == null) {
            acv2 = new acv(this, str);
            this.f266k.put(str, acv2);
            acv = acv2;
        } else if (acv2.f280f != null) {
            acu = null;
        } else {
            acv = acv2;
        }
        acu = new acu(this, acv);
        acv.f280f = acu;
        this.f258c.append("DIRTY");
        this.f258c.append(' ');
        this.f258c.append(str);
        this.f258c.append('\n');
        this.f258c.flush();
        return acu;
    }

    /* renamed from: b */
    public final synchronized acw m132b(String str) {
        acw acw;
        m128d();
        acv acv = (acv) this.f266k.get(str);
        if (acv == null) {
            acw = null;
        } else if (acv.f279e) {
            for (File exists : acv.f277c) {
                if (!exists.exists()) {
                    acw = null;
                    break;
                }
            }
            this.f259d++;
            this.f258c.append("READ");
            this.f258c.append(' ');
            this.f258c.append(str);
            this.f258c.append('\n');
            if (m131a()) {
                this.f268m.submit(this.f269n);
            }
            acw = new acw(acv.f277c);
        } else {
            acw = null;
        }
        return acw;
    }

    /* renamed from: a */
    final boolean m131a() {
        int i = this.f259d;
        if (i < BlockingCameraManager.OPEN_TIME_OUT_MS || i < this.f266k.size()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static p000.acr m125a(java.io.File r13, long r14) {
        /*
        r11 = 5;
        r3 = 0;
        r10 = -1;
        r0 = 0;
        r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0011;
    L_0x0009:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "maxSize <= 0";
        r0.<init>(r1);
        throw r0;
    L_0x0011:
        r0 = new java.io.File;
        r1 = "journal.bkp";
        r0.<init>(r13, r1);
        r1 = r0.exists();
        if (r1 == 0) goto L_0x002e;
    L_0x001e:
        r1 = new java.io.File;
        r2 = "journal";
        r1.<init>(r13, r2);
        r2 = r1.exists();
        if (r2 == 0) goto L_0x025d;
    L_0x002b:
        r0.delete();
    L_0x002e:
        r1 = new acr;
        r1.<init>(r13, r14);
        r0 = r1.f260e;
        r0 = r0.exists();
        if (r0 == 0) goto L_0x0133;
    L_0x003b:
        r5 = new acx;	 Catch:{ IOException -> 0x00ec }
        r0 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00ec }
        r2 = r1.f260e;	 Catch:{ IOException -> 0x00ec }
        r0.<init>(r2);	 Catch:{ IOException -> 0x00ec }
        r2 = p000.acz.f289a;	 Catch:{ IOException -> 0x00ec }
        r4 = 0;
        r5.<init>(r0, r2, r4);	 Catch:{ IOException -> 0x00ec }
        r0 = r5.m144a();	 Catch:{ all -> 0x00e7 }
        r2 = r5.m144a();	 Catch:{ all -> 0x00e7 }
        r4 = r5.m144a();	 Catch:{ all -> 0x00e7 }
        r6 = r5.m144a();	 Catch:{ all -> 0x00e7 }
        r7 = r5.m144a();	 Catch:{ all -> 0x00e7 }
        r8 = "libcore.io.DiskLruCache";
        r8 = r8.equals(r0);	 Catch:{ all -> 0x00e7 }
        if (r8 == 0) goto L_0x008e;
    L_0x0066:
        r8 = "1";
        r8 = r8.equals(r2);	 Catch:{ all -> 0x00e7 }
        if (r8 == 0) goto L_0x008e;
    L_0x006e:
        r8 = r1.f263h;	 Catch:{ all -> 0x00e7 }
        r8 = java.lang.Integer.toString(r8);	 Catch:{ all -> 0x00e7 }
        r4 = r8.equals(r4);	 Catch:{ all -> 0x00e7 }
        if (r4 == 0) goto L_0x008e;
    L_0x007a:
        r4 = r1.f257b;	 Catch:{ all -> 0x00e7 }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ all -> 0x00e7 }
        r4 = r4.equals(r6);	 Catch:{ all -> 0x00e7 }
        if (r4 == 0) goto L_0x008e;
    L_0x0086:
        r4 = "";
        r4 = r4.equals(r7);	 Catch:{ all -> 0x00e7 }
        if (r4 != 0) goto L_0x013f;
    L_0x008e:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x00e7 }
        r4 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00e7 }
        r4 = r4.length();	 Catch:{ all -> 0x00e7 }
        r4 = r4 + 35;
        r8 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00e7 }
        r8 = r8.length();	 Catch:{ all -> 0x00e7 }
        r4 = r4 + r8;
        r8 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x00e7 }
        r8 = r8.length();	 Catch:{ all -> 0x00e7 }
        r4 = r4 + r8;
        r8 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x00e7 }
        r8 = r8.length();	 Catch:{ all -> 0x00e7 }
        r4 = r4 + r8;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e7 }
        r8.<init>(r4);	 Catch:{ all -> 0x00e7 }
        r4 = "unexpected journal header: [";
        r8.append(r4);	 Catch:{ all -> 0x00e7 }
        r8.append(r0);	 Catch:{ all -> 0x00e7 }
        r0 = ", ";
        r8.append(r0);	 Catch:{ all -> 0x00e7 }
        r8.append(r2);	 Catch:{ all -> 0x00e7 }
        r0 = ", ";
        r8.append(r0);	 Catch:{ all -> 0x00e7 }
        r8.append(r6);	 Catch:{ all -> 0x00e7 }
        r0 = ", ";
        r8.append(r0);	 Catch:{ all -> 0x00e7 }
        r8.append(r7);	 Catch:{ all -> 0x00e7 }
        r0 = "]";
        r8.append(r0);	 Catch:{ all -> 0x00e7 }
        r0 = r8.toString();	 Catch:{ all -> 0x00e7 }
        r3.<init>(r0);	 Catch:{ all -> 0x00e7 }
        throw r3;	 Catch:{ all -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        p000.acz.m145a(r5);	 Catch:{ IOException -> 0x00ec }
        throw r0;	 Catch:{ IOException -> 0x00ec }
    L_0x00ec:
        r0 = move-exception;
        r2 = java.lang.System.out;
        r3 = java.lang.String.valueOf(r13);
        r0 = r0.getMessage();
        r4 = java.lang.String.valueOf(r3);
        r4 = r4.length();
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r4 = r4 + 36;
        r4 = r4 + r5;
        r6.<init>(r4);
        r4 = "DiskLruCache ";
        r6.append(r4);
        r6.append(r3);
        r3 = " is corrupt: ";
        r6.append(r3);
        r6.append(r0);
        r0 = ", removing";
        r6.append(r0);
        r0 = r6.toString();
        r2.println(r0);
        r1.close();
        r0 = r1.f256a;
        p000.acz.m146a(r0);
    L_0x0133:
        r13.mkdirs();
        r0 = new acr;
        r0.<init>(r13, r14);
        r0.m133b();
    L_0x013e:
        return r0;
    L_0x013f:
        r4 = r3;
    L_0x0140:
        r6 = r5.m144a();	 Catch:{ EOFException -> 0x0163 }
        r0 = 32;
        r7 = r6.indexOf(r0);	 Catch:{ EOFException -> 0x0163 }
        if (r7 != r10) goto L_0x01a8;
    L_0x014c:
        r2 = new java.io.IOException;	 Catch:{ EOFException -> 0x0163 }
        r0 = java.lang.String.valueOf(r6);	 Catch:{ EOFException -> 0x0163 }
        r6 = "unexpected journal line: ";
        r7 = r0.length();	 Catch:{ EOFException -> 0x0163 }
        if (r7 != 0) goto L_0x0283;
    L_0x015a:
        r0 = new java.lang.String;	 Catch:{ EOFException -> 0x0163 }
        r0.<init>(r6);	 Catch:{ EOFException -> 0x0163 }
    L_0x015f:
        r2.<init>(r0);	 Catch:{ EOFException -> 0x0163 }
        throw r2;	 Catch:{ EOFException -> 0x0163 }
    L_0x0163:
        r0 = move-exception;
        r0 = r1.f266k;	 Catch:{ all -> 0x00e7 }
        r0 = r0.size();	 Catch:{ all -> 0x00e7 }
        r0 = r4 - r0;
        r1.f259d = r0;	 Catch:{ all -> 0x00e7 }
        r0 = r5.f284b;	 Catch:{ all -> 0x00e7 }
        if (r0 != r10) goto L_0x0294;
    L_0x0172:
        r1.m133b();	 Catch:{ all -> 0x00e7 }
    L_0x0175:
        p000.acz.m145a(r5);	 Catch:{ IOException -> 0x00ec }
        r0 = r1.f261f;	 Catch:{ IOException -> 0x00ec }
        p000.acr.m126a(r0);	 Catch:{ IOException -> 0x00ec }
        r0 = r1.f266k;	 Catch:{ IOException -> 0x00ec }
        r0 = r0.values();	 Catch:{ IOException -> 0x00ec }
        r4 = r0.iterator();	 Catch:{ IOException -> 0x00ec }
    L_0x0187:
        r0 = r4.hasNext();	 Catch:{ IOException -> 0x00ec }
        if (r0 == 0) goto L_0x0280;
    L_0x018d:
        r0 = r4.next();	 Catch:{ IOException -> 0x00ec }
        r0 = (p000.acv) r0;	 Catch:{ IOException -> 0x00ec }
        r2 = r0.f280f;	 Catch:{ IOException -> 0x00ec }
        if (r2 != 0) goto L_0x0262;
    L_0x0197:
        r2 = r3;
    L_0x0198:
        r5 = r1.f257b;	 Catch:{ IOException -> 0x00ec }
        if (r2 >= r5) goto L_0x0187;
    L_0x019c:
        r6 = r1.f265j;	 Catch:{ IOException -> 0x00ec }
        r5 = r0.f276b;	 Catch:{ IOException -> 0x00ec }
        r8 = r5[r2];	 Catch:{ IOException -> 0x00ec }
        r6 = r6 + r8;
        r1.f265j = r6;	 Catch:{ IOException -> 0x00ec }
        r2 = r2 + 1;
        goto L_0x0198;
    L_0x01a8:
        r0 = r7 + 1;
        r2 = 32;
        r8 = r6.indexOf(r2, r0);	 Catch:{ EOFException -> 0x0163 }
        if (r8 != r10) goto L_0x0256;
    L_0x01b2:
        r0 = r6.substring(r0);	 Catch:{ EOFException -> 0x0163 }
        r2 = 6;
        if (r7 != r2) goto L_0x01cb;
    L_0x01b9:
        r2 = "REMOVE";
        r2 = r6.startsWith(r2);	 Catch:{ EOFException -> 0x0163 }
        if (r2 == 0) goto L_0x02ac;
    L_0x01c1:
        r2 = r1.f266k;	 Catch:{ EOFException -> 0x0163 }
        r2.remove(r0);	 Catch:{ EOFException -> 0x0163 }
    L_0x01c6:
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x0140;
    L_0x01cb:
        r2 = r0;
    L_0x01cc:
        r0 = r1.f266k;	 Catch:{ EOFException -> 0x0163 }
        r0 = r0.get(r2);	 Catch:{ EOFException -> 0x0163 }
        r0 = (p000.acv) r0;	 Catch:{ EOFException -> 0x0163 }
        if (r0 != 0) goto L_0x0254;
    L_0x01d6:
        r0 = new acv;	 Catch:{ EOFException -> 0x0163 }
        r0.<init>(r1, r2);	 Catch:{ EOFException -> 0x0163 }
        r9 = r1.f266k;	 Catch:{ EOFException -> 0x0163 }
        r9.put(r2, r0);	 Catch:{ EOFException -> 0x0163 }
        r2 = r0;
    L_0x01e1:
        if (r8 == r10) goto L_0x021c;
    L_0x01e3:
        if (r7 != r11) goto L_0x021c;
    L_0x01e5:
        r0 = "CLEAN";
        r0 = r6.startsWith(r0);	 Catch:{ EOFException -> 0x0163 }
        if (r0 == 0) goto L_0x021c;
    L_0x01ed:
        r0 = r8 + 1;
        r0 = r6.substring(r0);	 Catch:{ EOFException -> 0x0163 }
        r6 = " ";
        r6 = r0.split(r6);	 Catch:{ EOFException -> 0x0163 }
        r0 = 1;
        r2.f279e = r0;	 Catch:{ EOFException -> 0x0163 }
        r0 = 0;
        r2.f280f = r0;	 Catch:{ EOFException -> 0x0163 }
        r0 = r6.length;	 Catch:{ EOFException -> 0x0163 }
        r7 = r2.f281g;	 Catch:{ EOFException -> 0x0163 }
        r7 = r7.f257b;	 Catch:{ EOFException -> 0x0163 }
        if (r0 == r7) goto L_0x020b;
    L_0x0206:
        r0 = p000.acv.m141a(r6);	 Catch:{ EOFException -> 0x0163 }
        throw r0;	 Catch:{ EOFException -> 0x0163 }
    L_0x020b:
        r0 = r3;
    L_0x020c:
        r7 = r6.length;	 Catch:{ NumberFormatException -> 0x0289 }
        if (r0 >= r7) goto L_0x01c6;
    L_0x020f:
        r7 = r2.f276b;	 Catch:{ NumberFormatException -> 0x0289 }
        r8 = r6[r0];	 Catch:{ NumberFormatException -> 0x0289 }
        r8 = java.lang.Long.parseLong(r8);	 Catch:{ NumberFormatException -> 0x0289 }
        r7[r0] = r8;	 Catch:{ NumberFormatException -> 0x0289 }
        r0 = r0 + 1;
        goto L_0x020c;
    L_0x021c:
        if (r8 != r10) goto L_0x0230;
    L_0x021e:
        if (r7 != r11) goto L_0x0230;
    L_0x0220:
        r0 = "DIRTY";
        r0 = r6.startsWith(r0);	 Catch:{ EOFException -> 0x0163 }
        if (r0 == 0) goto L_0x0230;
    L_0x0228:
        r0 = new acu;	 Catch:{ EOFException -> 0x0163 }
        r0.<init>(r1, r2);	 Catch:{ EOFException -> 0x0163 }
        r2.f280f = r0;	 Catch:{ EOFException -> 0x0163 }
        goto L_0x01c6;
    L_0x0230:
        if (r8 != r10) goto L_0x023d;
    L_0x0232:
        r0 = 4;
        if (r7 != r0) goto L_0x023d;
    L_0x0235:
        r0 = "READ";
        r0 = r6.startsWith(r0);	 Catch:{ EOFException -> 0x0163 }
        if (r0 != 0) goto L_0x01c6;
    L_0x023d:
        r2 = new java.io.IOException;	 Catch:{ EOFException -> 0x0163 }
        r0 = java.lang.String.valueOf(r6);	 Catch:{ EOFException -> 0x0163 }
        r6 = "unexpected journal line: ";
        r7 = r0.length();	 Catch:{ EOFException -> 0x0163 }
        if (r7 != 0) goto L_0x028f;
    L_0x024b:
        r0 = new java.lang.String;	 Catch:{ EOFException -> 0x0163 }
        r0.<init>(r6);	 Catch:{ EOFException -> 0x0163 }
    L_0x0250:
        r2.<init>(r0);	 Catch:{ EOFException -> 0x0163 }
        throw r2;	 Catch:{ EOFException -> 0x0163 }
    L_0x0254:
        r2 = r0;
        goto L_0x01e1;
    L_0x0256:
        r0 = r6.substring(r0, r8);	 Catch:{ EOFException -> 0x0163 }
        r2 = r0;
        goto L_0x01cc;
    L_0x025d:
        p000.acr.m127a(r0, r1, r3);
        goto L_0x002e;
    L_0x0262:
        r2 = 0;
        r0.f280f = r2;	 Catch:{ IOException -> 0x00ec }
        r2 = r3;
    L_0x0266:
        r5 = r1.f257b;	 Catch:{ IOException -> 0x00ec }
        if (r2 < r5) goto L_0x026f;
    L_0x026a:
        r4.remove();	 Catch:{ IOException -> 0x00ec }
        goto L_0x0187;
    L_0x026f:
        r5 = r0.f277c;	 Catch:{ IOException -> 0x00ec }
        r5 = r5[r2];	 Catch:{ IOException -> 0x00ec }
        p000.acr.m126a(r5);	 Catch:{ IOException -> 0x00ec }
        r5 = r0.f278d;	 Catch:{ IOException -> 0x00ec }
        r5 = r5[r2];	 Catch:{ IOException -> 0x00ec }
        p000.acr.m126a(r5);	 Catch:{ IOException -> 0x00ec }
        r2 = r2 + 1;
        goto L_0x0266;
    L_0x0280:
        r0 = r1;
        goto L_0x013e;
    L_0x0283:
        r0 = r6.concat(r0);	 Catch:{ EOFException -> 0x0163 }
        goto L_0x015f;
    L_0x0289:
        r0 = move-exception;
        r0 = p000.acv.m141a(r6);	 Catch:{ EOFException -> 0x0163 }
        throw r0;	 Catch:{ EOFException -> 0x0163 }
    L_0x028f:
        r0 = r6.concat(r0);	 Catch:{ EOFException -> 0x0163 }
        goto L_0x0250;
    L_0x0294:
        r0 = new java.io.BufferedWriter;	 Catch:{ all -> 0x00e7 }
        r2 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x00e7 }
        r4 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00e7 }
        r6 = r1.f260e;	 Catch:{ all -> 0x00e7 }
        r7 = 1;
        r4.<init>(r6, r7);	 Catch:{ all -> 0x00e7 }
        r6 = p000.acz.f289a;	 Catch:{ all -> 0x00e7 }
        r2.<init>(r4, r6);	 Catch:{ all -> 0x00e7 }
        r0.<init>(r2);	 Catch:{ all -> 0x00e7 }
        r1.f258c = r0;	 Catch:{ all -> 0x00e7 }
        goto L_0x0175;
    L_0x02ac:
        r2 = r0;
        goto L_0x01cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: acr.a(java.io.File, long):acr");
    }

    /* renamed from: b */
    final synchronized void m133b() {
        Writer writer = this.f258c;
        if (writer != null) {
            writer.close();
        }
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f261f), acz.f289a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f263h));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f257b));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (acv acv : this.f266k.values()) {
                String str;
                if (acv.f280f != null) {
                    str = acv.f275a;
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
                    stringBuilder.append("DIRTY ");
                    stringBuilder.append(str);
                    stringBuilder.append('\n');
                    bufferedWriter.write(stringBuilder.toString());
                } else {
                    String str2 = acv.f275a;
                    str = acv.m142a();
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str2).length() + 7) + String.valueOf(str).length());
                    stringBuilder2.append("CLEAN ");
                    stringBuilder2.append(str2);
                    stringBuilder2.append(str);
                    stringBuilder2.append('\n');
                    bufferedWriter.write(stringBuilder2.toString());
                }
            }
            bufferedWriter.close();
            if (this.f260e.exists()) {
                acr.m127a(this.f260e, this.f262g, true);
            }
            acr.m127a(this.f261f, this.f260e, false);
            this.f262g.delete();
            this.f258c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f260e, true), acz.f289a));
        } catch (Throwable th) {
            bufferedWriter.close();
        }
    }

    /* renamed from: c */
    public final synchronized boolean m135c(String str) {
        boolean z;
        int i = 0;
        synchronized (this) {
            m128d();
            acv acv = (acv) this.f266k.get(str);
            if (acv == null || acv.f280f != null) {
                z = false;
            } else {
                while (i < this.f257b) {
                    File file = acv.f277c[i];
                    if (!file.exists() || file.delete()) {
                        long j = this.f265j;
                        long[] jArr = acv.f276b;
                        this.f265j = j - jArr[i];
                        jArr[i] = 0;
                        i++;
                    } else {
                        String valueOf = String.valueOf(file);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                        stringBuilder.append("failed to delete ");
                        stringBuilder.append(valueOf);
                        throw new IOException(stringBuilder.toString());
                    }
                }
                this.f259d++;
                this.f258c.append("REMOVE");
                this.f258c.append(' ');
                this.f258c.append(str);
                this.f258c.append('\n');
                this.f266k.remove(str);
                if (m131a()) {
                    this.f268m.submit(this.f269n);
                }
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static void m127a(File file, File file2, boolean z) {
        if (z) {
            acr.m126a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: c */
    final void m134c() {
        while (this.f265j > this.f264i) {
            m135c((String) ((Entry) this.f266k.entrySet().iterator().next()).getKey());
        }
    }
}
