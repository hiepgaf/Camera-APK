package p000;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: wz */
public final class wz {
    /* renamed from: a */
    private static Map f9492a = new HashMap();

    static {
        xj xjVar = new xj();
        xjVar.m14517c();
        f9492a.put("dc:contributor", xjVar);
        f9492a.put("dc:language", xjVar);
        f9492a.put("dc:publisher", xjVar);
        f9492a.put("dc:relation", xjVar);
        f9492a.put("dc:subject", xjVar);
        f9492a.put("dc:type", xjVar);
        xjVar = new xj();
        xjVar.m14517c();
        xjVar.m14522f();
        f9492a.put("dc:creator", xjVar);
        f9492a.put("dc:date", xjVar);
        xjVar = new xj();
        xjVar.m14517c();
        xjVar.m14522f();
        xjVar.m14521e();
        xjVar.m14519d();
        f9492a.put("dc:description", xjVar);
        f9492a.put("dc:rights", xjVar);
        f9492a.put("dc:title", xjVar);
    }

    /* renamed from: a */
    private static void m6217a(ww wwVar, ww wwVar2, boolean z) {
        if (!wwVar.f9481b.equals(wwVar2.f9481b) || wwVar.m6192c() != wwVar2.m6192c()) {
            throw new wb("Mismatch between alias and base nodes", 203);
        } else if (z || (wwVar.f9480a.equals(wwVar2.f9480a) && wwVar.m6194d().equals(wwVar2.m6194d()) && wwVar.m6196e() == wwVar2.m6196e())) {
            Iterator h = wwVar.m6199h();
            Iterator h2 = wwVar2.m6199h();
            while (h.hasNext() && h2.hasNext()) {
                wz.m6217a((ww) h.next(), (ww) h2.next(), false);
            }
            h = wwVar.m6200i();
            h2 = wwVar2.m6200i();
            while (h.hasNext() && h2.hasNext()) {
                wz.m6217a((ww) h.next(), (ww) h2.next(), false);
            }
        } else {
            throw new wb("Mismatch between alias and base nodes", 203);
        }
    }

    /* renamed from: a */
    static wd m6214a(wt wtVar, xi xiVar) {
        ww a;
        String str;
        String valueOf;
        String valueOf2;
        ww wwVar = wtVar.f19668a;
        wy.m6203a(wwVar, "http://purl.org/dc/elements/1.1/", null, true);
        Iterator h = wtVar.f19668a.m6199h();
        while (h.hasNext()) {
            int i;
            ww a2;
            ww a3;
            String str2;
            ww wwVar2 = (ww) h.next();
            if ("http://purl.org/dc/elements/1.1/".equals(wwVar2.f9480a)) {
                for (i = 1; i <= wwVar2.m6192c(); i++) {
                    ww a4 = wwVar2.m6183a(i);
                    xj xjVar = (xj) f9492a.get(a4.f9480a);
                    if (xjVar != null) {
                        if ((a4.m6194d().f9510a & 768) != 0) {
                            a4.m6194d().m6238a(7680, false);
                            a4.m6194d().m14514a(xjVar);
                            if (xjVar.m6239b(4096)) {
                                wz.m6216a(a4);
                            }
                        } else {
                            ww wwVar3 = new ww(a4.f9480a, xjVar);
                            a4.f9480a = "[]";
                            wwVar3.m6187a(a4);
                            wwVar3.f9482c = wwVar2;
                            wwVar2.m6188b().set(i - 1, wwVar3);
                            if (xjVar.m6239b(4096) && !a4.m6194d().m6239b(64)) {
                                a4.m6191b(new ww("xml:lang", "x-default", null));
                            }
                        }
                    }
                }
            } else if ("http://ns.adobe.com/exif/1.0/".equals(wwVar2.f9480a)) {
                a2 = wy.m6204a(wwVar2, "exif:GPSTimeStamp", false);
                if (a2 != null) {
                    try {
                        vz e = tz.m5887e(a2.f9481b);
                        if (e.mo2512i() == 0 && e.mo2505e() == 0 && e.mo2499b() == 0) {
                            a = wy.m6204a(wwVar2, "exif:DateTimeOriginal", false);
                            if (a == null) {
                                a = wy.m6204a(wwVar2, "exif:DateTimeDigitized", false);
                            }
                            vz e2 = tz.m5887e(a.f9481b);
                            Calendar a5 = e.mo2496a();
                            a5.set(1, e2.mo2512i());
                            a5.set(2, e2.mo2505e());
                            a5.set(5, e2.mo2499b());
                            a2.f9481b = tz.m5877a(new wq(a5));
                        }
                    } catch (wb e3) {
                    }
                }
                wwVar2 = wy.m6204a(wwVar2, "exif:UserComment", false);
                if (wwVar2 != null) {
                    wz.m6216a(wwVar2);
                }
            } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(wwVar2.f9480a)) {
                a3 = wy.m6204a(wwVar2, "xmpDM:copyright", false);
                if (a3 != null) {
                    try {
                        wwVar2 = wy.m6203a(wtVar.f19668a, "http://purl.org/dc/elements/1.1/", null, true);
                        str2 = a3.f9481b;
                        str = "\n\n";
                        ww a6 = wy.m6204a(wwVar2, "dc:rights", false);
                        if (a6 == null || !a6.m6197f()) {
                            String str3;
                            valueOf = String.valueOf(str);
                            String valueOf3 = String.valueOf(str2);
                            if (valueOf3.length() == 0) {
                                str3 = new String(valueOf);
                            } else {
                                str3 = valueOf.concat(valueOf3);
                            }
                            wtVar.mo2520a("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", str3);
                        } else {
                            int a7 = wy.m6202a(a6, "x-default");
                            if (a7 < 0) {
                                wt wtVar2 = wtVar;
                                wtVar2.mo2520a("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", a6.m6183a(1).f9481b);
                                a7 = wy.m6202a(a6, "x-default");
                            }
                            a = a6.m6183a(a7);
                            valueOf = a.f9481b;
                            i = valueOf.indexOf(str);
                            if (i >= 0) {
                                i += 2;
                                if (!valueOf.substring(i).equals(str2)) {
                                    valueOf2 = String.valueOf(valueOf.substring(0, i));
                                    valueOf = String.valueOf(str2);
                                    if (valueOf.length() == 0) {
                                        valueOf = new String(valueOf2);
                                    } else {
                                        valueOf = valueOf2.concat(valueOf);
                                    }
                                    a.f9481b = valueOf;
                                }
                            } else if (!str2.equals(valueOf)) {
                                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + String.valueOf(str).length()) + String.valueOf(str2).length());
                                stringBuilder.append(valueOf);
                                stringBuilder.append(str);
                                stringBuilder.append(str2);
                                a.f9481b = stringBuilder.toString();
                            }
                        }
                        a3.f9482c.m6193c(a3);
                    } catch (wb e4) {
                    }
                }
            } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(wwVar2.f9480a)) {
                wwVar2 = wy.m6204a(wwVar2, "xmpRights:UsageTerms", false);
                if (wwVar2 != null) {
                    wz.m6216a(wwVar2);
                }
            }
        }
        if (wwVar.f9487h) {
            wwVar.f9487h = false;
            boolean b = xiVar.m6239b(4);
            for (ww a8 : Collections.unmodifiableList(new ArrayList(wwVar.m6188b()))) {
                if (a8.f9487h) {
                    Iterator h2 = a8.m6199h();
                    while (h2.hasNext()) {
                        wwVar2 = (ww) h2.next();
                        if (wwVar2.f9488i) {
                            wwVar2.f9488i = false;
                            xl a9 = we.f9447a.m6125a(wwVar2.f9480a);
                            if (a9 != null) {
                                a3 = wy.m6203a(wwVar, a9.mo2537b(), null, true);
                                a3.f9486g = false;
                                str2 = String.valueOf(a9.mo2538c());
                                valueOf2 = String.valueOf(a9.mo2539d());
                                if (valueOf2.length() == 0) {
                                    valueOf2 = new String(str2);
                                } else {
                                    valueOf2 = str2.concat(valueOf2);
                                }
                                ww a10 = wy.m6204a(a3, valueOf2, false);
                                if (a10 == null) {
                                    if (a9.mo2536a().m14507b()) {
                                        str2 = String.valueOf(a9.mo2538c());
                                        valueOf2 = String.valueOf(a9.mo2539d());
                                        if (valueOf2.length() == 0) {
                                            valueOf2 = new String(str2);
                                        } else {
                                            valueOf2 = str2.concat(valueOf2);
                                        }
                                        wwVar2.f9480a = valueOf2;
                                        a3.m6187a(wwVar2);
                                        h2.remove();
                                    } else {
                                        str = String.valueOf(a9.mo2538c());
                                        valueOf2 = String.valueOf(a9.mo2539d());
                                        if (valueOf2.length() == 0) {
                                            valueOf2 = new String(str);
                                        } else {
                                            valueOf2 = str.concat(valueOf2);
                                        }
                                        a10 = new ww(valueOf2, a9.mo2536a().m14508c());
                                        a3.m6187a(a10);
                                        wz.m6215a(h2, wwVar2, a10);
                                    }
                                } else if (a9.mo2536a().m14507b()) {
                                    if (b) {
                                        wz.m6217a(wwVar2, a10, true);
                                    }
                                    h2.remove();
                                } else {
                                    if (a9.mo2536a().m6239b(4096)) {
                                        i = wy.m6202a(a10, "x-default");
                                        if (i != -1) {
                                            a2 = a10.m6183a(i);
                                        } else {
                                            a2 = null;
                                        }
                                    } else if (a10.m6197f()) {
                                        a2 = a10.m6183a(1);
                                    } else {
                                        a2 = null;
                                    }
                                    if (a2 == null) {
                                        wz.m6215a(h2, wwVar2, a10);
                                    } else {
                                        if (b) {
                                            wz.m6217a(wwVar2, a2, true);
                                        }
                                        h2.remove();
                                    }
                                }
                            }
                        }
                    }
                    a8.f9487h = false;
                }
            }
        }
        valueOf = wwVar.f9480a;
        if (valueOf != null && valueOf.length() >= 36) {
            valueOf = wwVar.f9480a.toLowerCase();
            if (valueOf.startsWith("uuid:")) {
                valueOf = valueOf.substring(5);
            }
            if (wp.m6160a(valueOf)) {
                a8 = wy.m6205a(wwVar, tz.m5878a("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, null);
                if (a8 != null) {
                    a8.f9485f = null;
                    valueOf = String.valueOf(valueOf);
                    valueOf2 = "uuid:";
                    if (valueOf.length() == 0) {
                        valueOf = new String(valueOf2);
                    } else {
                        valueOf = valueOf2.concat(valueOf);
                    }
                    a8.f9481b = valueOf;
                    a8.f9483d = null;
                    xj d = a8.m6194d();
                    d.m14515b(false);
                    d.m14512a(false);
                    d.m14518c(false);
                    a8.f9484e = null;
                    wwVar.f9480a = null;
                } else {
                    throw new wb("Failure creating xmpMM:InstanceID", 9);
                }
            }
        }
        Iterator h3 = wwVar.m6199h();
        while (h3.hasNext()) {
            if (!((ww) h3.next()).m6197f()) {
                h3.remove();
            }
        }
        return wtVar;
    }

    /* renamed from: a */
    private static void m6216a(ww wwVar) {
        if (wwVar != null && wwVar.m6194d().m6239b(512)) {
            wwVar.m6194d().m14522f().m14521e().m14519d();
            Iterator h = wwVar.m6199h();
            while (h.hasNext()) {
                ww wwVar2 = (ww) h.next();
                if (wwVar2.m6194d().m14516b()) {
                    h.remove();
                } else if (!wwVar2.m6194d().m6239b(64)) {
                    String str = wwVar2.f9481b;
                    if (str == null || str.length() == 0) {
                        h.remove();
                    } else {
                        wwVar2.m6191b(new ww("xml:lang", "x-repair", null));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m6215a(Iterator it, ww wwVar, ww wwVar2) {
        if (wwVar2.m6194d().m6239b(4096)) {
            if (wwVar.m6194d().m6239b(64)) {
                throw new wb("Alias to x-default already has a language qualifier", 203);
            }
            wwVar.m6191b(new ww("xml:lang", "x-default", null));
        }
        it.remove();
        wwVar.f9480a = "[]";
        wwVar2.m6187a(wwVar);
    }
}
