package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;

/* compiled from: PG */
/* renamed from: tz */
public class tz {
    /* renamed from: a */
    public static void m5880a(String str) {
        if (str == null || str.length() == 0) {
            throw new wb("Empty array name", 4);
        }
    }

    /* renamed from: a */
    public static void m5879a(Object obj) {
        if (obj == null) {
            throw new wb("Parameter must not be null", 4);
        } else if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new wb("Parameter must not be null or empty", 4);
        }
    }

    /* renamed from: b */
    public static void m5884b(String str) {
        if (str == null || str.length() == 0) {
            throw new wb("Empty property name", 4);
        }
    }

    /* renamed from: c */
    public static void m5885c(String str) {
        if (str == null || str.length() == 0) {
            throw new wb("Empty schema namespace URI", 4);
        }
    }

    /* renamed from: d */
    public static boolean m5886d(String str) {
        if (str == null || str.length() == 0) {
            throw new wb("Empty convert-string", 5);
        }
        Object toLowerCase = str.toLowerCase();
        try {
            if (Integer.parseInt(toLowerCase) != 0) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            if ("true".equals(toLowerCase) || "t".equals(toLowerCase) || "on".equals(toLowerCase) || "yes".equals(toLowerCase)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: e */
    public static vz m5887e(String str) {
        int i = 1;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            throw new wb("Empty convert-string", 5);
        }
        int a;
        vz wqVar = new wq();
        tz.m5879a((Object) str);
        wn wnVar = new wn(str);
        int i3 = wnVar.m6154a(0) == 'T' ? 1 : (wnVar.f9465a.length() < 2 || wnVar.m6154a(1) != ':') ? wnVar.f9465a.length() >= 3 ? wnVar.m6154a(2) != ':' ? 0 : 1 : 0 : 1;
        if (i3 == 0) {
            if (wnVar.m6154a(0) == '-') {
                wnVar.m6157c();
            }
            a = wnVar.m6155a("Invalid year in date string", 9999);
            if (!wnVar.m6156b() || wnVar.m6153a() == '-') {
                if (wnVar.m6154a(0) == '-') {
                    a = -a;
                }
                wqVar.mo2510g(a);
                if (!wnVar.m6156b()) {
                    return wqVar;
                }
                wnVar.m6157c();
                a = wnVar.m6155a("Invalid month in date string", 12);
                if (!wnVar.m6156b() || wnVar.m6153a() == '-') {
                    wqVar.mo2504d(a);
                    if (!wnVar.m6156b()) {
                        return wqVar;
                    }
                    wnVar.m6157c();
                    a = wnVar.m6155a("Invalid day in date string", 31);
                    if (!wnVar.m6156b() || wnVar.m6153a() == 'T') {
                        wqVar.mo2497a(a);
                        if (!wnVar.m6156b()) {
                            return wqVar;
                        }
                    }
                    throw new wb("Invalid date string, after day", 5);
                }
                throw new wb("Invalid date string, after month", 5);
            }
            throw new wb("Invalid date string, after year", 5);
        }
        wqVar.mo2504d(1);
        wqVar.mo2497a(1);
        if (wnVar.m6153a() == 'T') {
            wnVar.m6157c();
        } else if (i3 == 0) {
            throw new wb("Invalid date string, missing 'T' after date", 5);
        }
        a = wnVar.m6155a("Invalid hour in date string", 23);
        if (wnVar.m6153a() != ':') {
            throw new wb("Invalid date string, after hour", 5);
        }
        wqVar.mo2500b(a);
        wnVar.m6157c();
        a = wnVar.m6155a("Invalid minute in date string", 59);
        if (!wnVar.m6156b() || wnVar.m6153a() == ':' || wnVar.m6153a() == 'Z' || wnVar.m6153a() == '+' || wnVar.m6153a() == '-') {
            wqVar.mo2502c(a);
            if (wnVar.m6153a() == ':') {
                wnVar.m6157c();
                a = wnVar.m6155a("Invalid whole seconds in date string", 59);
                if (!wnVar.m6156b() || wnVar.m6153a() == '.' || wnVar.m6153a() == 'Z' || wnVar.m6153a() == '+' || wnVar.m6153a() == '-') {
                    wqVar.mo2508f(a);
                    if (wnVar.m6153a() == '.') {
                        wnVar.m6157c();
                        a = wnVar.f9466b;
                        i3 = wnVar.m6155a("Invalid fractional seconds in date string", 999999999);
                        if (wnVar.m6153a() == 'Z' || wnVar.m6153a() == '+' || wnVar.m6153a() == '-') {
                            a = wnVar.f9466b - a;
                            while (a > 9) {
                                i3 /= 10;
                                a--;
                            }
                            while (a < 9) {
                                i3 *= 10;
                                a++;
                            }
                            wqVar.mo2506e(i3);
                        } else {
                            throw new wb("Invalid date string, after fractional second", 5);
                        }
                    }
                }
                throw new wb("Invalid date string, after whole seconds", 5);
            }
            if (wnVar.m6153a() == 'Z') {
                wnVar.m6157c();
                a = 0;
                i = 0;
            } else if (wnVar.m6156b()) {
                if (wnVar.m6153a() != '+') {
                    if (wnVar.m6153a() == '-') {
                        i = -1;
                    } else {
                        throw new wb("Time zone must begin with 'Z', '+', or '-'", 5);
                    }
                }
                wnVar.m6157c();
                i2 = wnVar.m6155a("Invalid time zone hour in date string", 23);
                if (wnVar.m6153a() != ':') {
                    throw new wb("Invalid date string, after time zone hour", 5);
                }
                wnVar.m6157c();
                a = wnVar.m6155a("Invalid time zone minute in date string", 59);
            } else {
                a = 0;
                i = 0;
            }
            wqVar.mo2498a(new SimpleTimeZone((((a * 60) * 1000) + ((i2 * 3600) * 1000)) * i, ""));
            if (!wnVar.m6156b()) {
                return wqVar;
            }
            throw new wb("Invalid date string, extra chars at end", 5);
        }
        throw new wb("Invalid date string, after minute", 5);
    }

    /* renamed from: f */
    public static double m5888f(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return Double.parseDouble(str);
                }
            } catch (NumberFormatException e) {
                throw new wb("Invalid double string", 5);
            }
        }
        throw new wb("Empty convert-string", 5);
    }

    /* renamed from: g */
    public static int m5889g(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (str.startsWith("0x")) {
                        return Integer.parseInt(str.substring(2), 16);
                    }
                    return Integer.parseInt(str);
                }
            } catch (NumberFormatException e) {
                throw new wb("Invalid integer string", 5);
            }
        }
        throw new wb("Empty convert-string", 5);
    }

    /* renamed from: h */
    public static long m5890h(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (str.startsWith("0x")) {
                        return Long.parseLong(str.substring(2), 16);
                    }
                    return Long.parseLong(str);
                }
            } catch (NumberFormatException e) {
                throw new wb("Invalid long string", 5);
            }
        }
        throw new wb("Empty convert-string", 5);
    }

    /* renamed from: a */
    public static byte[] m5881a(byte b) {
        int i = b & Illuminant.kOther;
        if (i >= 128) {
            if (i == ScriptIntrinsicBLAS.RsBlas_ctrmm || i == 141 || i == 143 || i == 144 || i == 157) {
                try {
                    return new byte[]{(byte) 32};
                } catch (UnsupportedEncodingException e) {
                }
            } else {
                return new String(new byte[]{b}, "cp1252").getBytes("UTF-8");
            }
        }
        return new byte[]{b};
    }

    /* renamed from: i */
    public static byte[] m5891i(String str) {
        try {
            return wi.m6129a(str.getBytes());
        } catch (Throwable th) {
            wb wbVar = new wb("Invalid base64 string", 5, th);
        }
    }

    /* renamed from: a */
    public static xd m5878a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new wb("Parameter must not be null", 4);
        }
        xd xdVar = new xd();
        xc xcVar = new xc();
        xcVar.f9500a = str2;
        while (xcVar.f9504e < xcVar.f9500a.length() && "/[*".indexOf(xcVar.f9500a.charAt(xcVar.f9504e)) < 0) {
            xcVar.f9504e++;
        }
        int i = xcVar.f9504e;
        int i2 = xcVar.f9503d;
        if (i == i2) {
            throw new wb("Empty initial XMPPath step", 102);
        }
        xe xeVar;
        String b = tz.m5883b(str, xcVar.f9500a.substring(i2, i));
        xl a = we.f9447a.m6125a(b);
        if (a == null) {
            xdVar.m6234a(new xe(str, kvl.UNSET_ENUM_VALUE));
            xdVar.m6234a(new xe(b, 1));
        } else {
            xdVar.m6234a(new xe(a.mo2537b(), kvl.UNSET_ENUM_VALUE));
            xeVar = new xe(tz.m5883b(a.mo2537b(), a.mo2539d()), 1);
            xeVar.f9508c = true;
            xeVar.f9509d = a.mo2536a().f9510a;
            xdVar.m6234a(xeVar);
            if (a.mo2536a().m6239b(4096)) {
                xeVar = new xe("[?xml:lang='x-default']", 5);
                xeVar.f9508c = true;
                xeVar.f9509d = a.mo2536a().f9510a;
                xdVar.m6234a(xeVar);
            } else if (a.mo2536a().m6239b(512)) {
                xeVar = new xe("[1]", 3);
                xeVar.f9508c = true;
                xeVar.f9509d = a.mo2536a().f9510a;
                xdVar.m6234a(xeVar);
            }
        }
        while (xcVar.f9504e < str2.length()) {
            int i3;
            xe xeVar2;
            xcVar.f9503d = xcVar.f9504e;
            if (str2.charAt(xcVar.f9503d) == '/') {
                xcVar.f9503d++;
                if (xcVar.f9503d >= str2.length()) {
                    throw new wb("Empty XMPPath segment", 102);
                }
            }
            if (str2.charAt(xcVar.f9503d) == '*') {
                xcVar.f9503d++;
                if (xcVar.f9503d >= str2.length() || str2.charAt(xcVar.f9503d) != '[') {
                    throw new wb("Missing '[' after '*'", 102);
                }
            }
            i = xcVar.f9503d;
            xcVar.f9504e = i;
            if (str2.charAt(i) != '[') {
                xcVar.f9501b = xcVar.f9503d;
                while (xcVar.f9504e < xcVar.f9500a.length() && "/[*".indexOf(xcVar.f9500a.charAt(xcVar.f9504e)) < 0) {
                    xcVar.f9504e++;
                }
                i2 = xcVar.f9504e;
                xcVar.f9502c = i2;
                i3 = xcVar.f9503d;
                if (i2 == i3) {
                    throw new wb("Empty XMPPath segment", 102);
                }
                xeVar2 = new xe(xcVar.f9500a.substring(i3, i2), 1);
            } else {
                xcVar.f9504e++;
                if (xcVar.f9500a.charAt(xcVar.f9504e) >= '0' && xcVar.f9500a.charAt(xcVar.f9504e) <= '9') {
                    while (xcVar.f9504e < xcVar.f9500a.length() && xcVar.f9500a.charAt(xcVar.f9504e) >= '0' && xcVar.f9500a.charAt(xcVar.f9504e) <= '9') {
                        xcVar.f9504e++;
                    }
                    xeVar = new xe(null, 3);
                } else {
                    while (xcVar.f9504e < xcVar.f9500a.length() && xcVar.f9500a.charAt(xcVar.f9504e) != ']' && xcVar.f9500a.charAt(xcVar.f9504e) != '=') {
                        xcVar.f9504e++;
                    }
                    if (xcVar.f9504e >= xcVar.f9500a.length()) {
                        throw new wb("Missing ']' or '=' for array index", 102);
                    } else if (xcVar.f9500a.charAt(xcVar.f9504e) != ']') {
                        xcVar.f9501b = xcVar.f9503d + 1;
                        i = xcVar.f9504e;
                        xcVar.f9502c = i;
                        xcVar.f9504e = i + 1;
                        char charAt = xcVar.f9500a.charAt(xcVar.f9504e);
                        if (charAt == '\'' || charAt == '\"') {
                            xcVar.f9504e++;
                            while (xcVar.f9504e < xcVar.f9500a.length()) {
                                if (xcVar.f9500a.charAt(xcVar.f9504e) == charAt) {
                                    if (xcVar.f9504e + 1 >= xcVar.f9500a.length() || xcVar.f9500a.charAt(xcVar.f9504e + 1) != charAt) {
                                        break;
                                    }
                                    xcVar.f9504e++;
                                }
                                xcVar.f9504e++;
                            }
                            if (xcVar.f9504e >= xcVar.f9500a.length()) {
                                throw new wb("No terminating quote for array selector", 102);
                            }
                            xcVar.f9504e++;
                            xeVar = new xe(null, 6);
                        } else {
                            throw new wb("Invalid quote in array selector", 102);
                        }
                    } else if ("[last()".equals(xcVar.f9500a.substring(xcVar.f9503d, xcVar.f9504e))) {
                        xeVar = new xe(null, 4);
                    } else {
                        throw new wb("Invalid non-numeric array index", 102);
                    }
                }
                if (xcVar.f9504e >= xcVar.f9500a.length() || xcVar.f9500a.charAt(xcVar.f9504e) != ']') {
                    throw new wb("Missing ']' for array index", 102);
                }
                xcVar.f9504e++;
                xeVar.f9506a = xcVar.f9500a.substring(xcVar.f9503d, xcVar.f9504e);
                xeVar2 = xeVar;
            }
            i = xeVar2.f9507b;
            String str3;
            if (i == 1) {
                if (xeVar2.f9506a.charAt(0) == '@') {
                    b = String.valueOf(xeVar2.f9506a.substring(1));
                    str3 = "?";
                    if (b.length() == 0) {
                        b = new String(str3);
                    } else {
                        b = str3.concat(b);
                    }
                    xeVar2.f9506a = b;
                    if (!"?xml:lang".equals(xeVar2.f9506a)) {
                        throw new wb("Only xml:lang allowed with '@'", 102);
                    }
                }
                if (xeVar2.f9506a.charAt(0) == '?') {
                    xcVar.f9501b++;
                    xeVar2.f9507b = 2;
                }
                b = xcVar.f9500a.substring(xcVar.f9501b, xcVar.f9502c);
                i3 = b.indexOf(58);
                if (i3 > 0) {
                    b = b.substring(0, i3);
                    if (wp.m6164c(b)) {
                        if (we.f9447a.m6127c(b) == null) {
                            throw new wb("Unknown namespace prefix for qualified name", 102);
                        }
                    }
                }
                throw new wb("Ill-formed qualified name", 102);
            } else if (i == 6) {
                if (xeVar2.f9506a.charAt(1) == '@') {
                    b = String.valueOf(xeVar2.f9506a.substring(2));
                    str3 = "[?";
                    if (b.length() == 0) {
                        b = new String(str3);
                    } else {
                        b = str3.concat(b);
                    }
                    xeVar2.f9506a = b;
                    if (!xeVar2.f9506a.startsWith("[?xml:lang=")) {
                        throw new wb("Only xml:lang allowed with '@'", 102);
                    }
                }
                if (xeVar2.f9506a.charAt(1) == '?') {
                    xcVar.f9501b++;
                    xeVar2.f9507b = 5;
                    b = xcVar.f9500a.substring(xcVar.f9501b, xcVar.f9502c);
                    i3 = b.indexOf(58);
                    if (i3 > 0) {
                        b = b.substring(0, i3);
                        if (wp.m6164c(b)) {
                            if (we.f9447a.m6127c(b) == null) {
                                throw new wb("Unknown namespace prefix for qualified name", 102);
                            }
                        }
                    }
                    throw new wb("Ill-formed qualified name", 102);
                }
                continue;
            } else {
                continue;
            }
            xdVar.m6234a(xeVar2);
        }
        return xdVar;
    }

    /* renamed from: a */
    public void mo734a() {
    }

    /* renamed from: a */
    public static String m5877a(vz vzVar) {
        StringBuffer stringBuffer = new StringBuffer();
        DecimalFormat decimalFormat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
        stringBuffer.append(decimalFormat.format((long) vzVar.mo2512i()));
        if (vzVar.mo2505e() == 0) {
            return stringBuffer.toString();
        }
        decimalFormat.applyPattern("'-'00");
        stringBuffer.append(decimalFormat.format((long) vzVar.mo2505e()));
        if (vzVar.mo2499b() == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append(decimalFormat.format((long) vzVar.mo2499b()));
        if (!(vzVar.mo2501c() == 0 && vzVar.mo2503d() == 0 && vzVar.mo2509g() == 0 && vzVar.mo2507f() == 0 && (vzVar.mo2511h() == null || vzVar.mo2511h().getRawOffset() == 0))) {
            int g;
            int f;
            stringBuffer.append('T');
            decimalFormat.applyPattern("00");
            stringBuffer.append(decimalFormat.format((long) vzVar.mo2501c()));
            stringBuffer.append(':');
            stringBuffer.append(decimalFormat.format((long) vzVar.mo2503d()));
            if (!(vzVar.mo2509g() == 0 && vzVar.mo2507f() == 0)) {
                g = vzVar.mo2509g();
                f = vzVar.mo2507f();
                decimalFormat.applyPattern(":00.#########");
                stringBuffer.append(decimalFormat.format((((double) f) / 1.0E9d) + ((double) g)));
            }
            if (vzVar.mo2511h() != null) {
                g = vzVar.mo2511h().getOffset(vzVar.mo2496a().getTimeInMillis());
                if (g == 0) {
                    stringBuffer.append('Z');
                } else {
                    f = Math.abs((g % 3600000) / 60000);
                    decimalFormat.applyPattern("+00;-00");
                    stringBuffer.append(decimalFormat.format((long) (g / 3600000)));
                    decimalFormat.applyPattern(":00");
                    stringBuffer.append(decimalFormat.format((long) f));
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static byte[] m5882a(wt wtVar, xk xkVar) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
        if (xkVar == null) {
            xkVar = new xk();
        }
        if (xkVar.m6239b(4096)) {
            wtVar.f19668a.m6201j();
        }
        xb xbVar = new xb();
        try {
            int i;
            String valueOf;
            int i2;
            xbVar.f9495b = new wk(byteArrayOutputStream);
            xbVar.f9496c = new OutputStreamWriter(xbVar.f9495b, xkVar.m14526d());
            xbVar.f9494a = wtVar;
            xbVar.f9497d = xkVar;
            xbVar.f9499f = xkVar.f19674b;
            xbVar.f9496c = new OutputStreamWriter(xbVar.f9495b, xkVar.m14526d());
            if ((xbVar.f9497d.m14524b() | xbVar.f9497d.m14525c()) != 0) {
                xbVar.f9498e = 2;
            }
            if (xbVar.f9497d.m6239b(512)) {
                if ((xbVar.f9497d.m6239b(16) | xbVar.f9497d.m6239b(256)) != 0) {
                    throw new wb("Inconsistent options for exact size serialize", 103);
                } else if ((xbVar.f9497d.f19674b & (xbVar.f9498e - 1)) != 0) {
                    throw new wb("Exact size must be a multiple of the Unicode element", 103);
                }
            } else if (xbVar.f9497d.m6239b(32)) {
                if ((xbVar.f9497d.m6239b(16) | xbVar.f9497d.m6239b(256)) != 0) {
                    throw new wb("Inconsistent options for read-only packet", 103);
                }
                xbVar.f9499f = 0;
            } else if (!xbVar.f9497d.m6239b(16)) {
                if (xbVar.f9499f == 0) {
                    xbVar.f9499f = xbVar.f9498e << 11;
                }
                if (xbVar.f9497d.m6239b(256) && !xbVar.f9494a.mo2525b("http://ns.adobe.com/xap/1.0/", "Thumbnails")) {
                    xbVar.f9499f += xbVar.f9498e * MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR;
                }
            } else if (xbVar.f9497d.m6239b(256)) {
                throw new wb("Inconsistent options for non-packet serialize", 103);
            } else {
                xbVar.f9499f = 0;
            }
            if (!xbVar.f9497d.m6239b(16)) {
                xbVar.m6231c(0);
                xbVar.m6224a("<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>");
                xbVar.m6222a();
            }
            xbVar.m6231c(0);
            xbVar.m6224a("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"");
            xk xkVar2 = xbVar.f9497d;
            xbVar.m6224a(we.m6122b().mo2495a());
            xbVar.m6224a("\">");
            xbVar.m6222a();
            xbVar.m6231c(1);
            xbVar.m6224a("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">");
            xbVar.m6222a();
            Iterator h;
            Iterator h2;
            if (xbVar.f9497d.m6239b(64)) {
                xbVar.m6231c(2);
                xbVar.m6224a("<rdf:Description rdf:about=");
                xbVar.m6228b();
                Set hashSet = new HashSet();
                hashSet.add("xml");
                hashSet.add("rdf");
                h = xbVar.f9494a.f19668a.m6199h();
                while (h.hasNext()) {
                    xbVar.m6225a((ww) h.next(), hashSet, 4);
                }
                h = xbVar.f9494a.f19668a.m6199h();
                i = 1;
                while (h.hasNext()) {
                    i = xbVar.m6227a((ww) h.next(), 3) & i;
                }
                if (i == 0) {
                    xbVar.m6223a(62);
                    xbVar.m6222a();
                    h2 = xbVar.f9494a.f19668a.m6199h();
                    while (h2.hasNext()) {
                        xbVar.m6230b((ww) h2.next(), 3);
                    }
                    xbVar.m6231c(2);
                    xbVar.m6224a("</rdf:Description>");
                    xbVar.m6222a();
                } else {
                    xbVar.m6224a("/>");
                    xbVar.m6222a();
                }
            } else if (xbVar.f9494a.f19668a.m6192c() > 0) {
                h2 = xbVar.f9494a.f19668a.m6199h();
                while (h2.hasNext()) {
                    ww wwVar = (ww) h2.next();
                    xbVar.m6231c(2);
                    xbVar.m6224a("<rdf:Description rdf:about=");
                    xbVar.m6228b();
                    Set hashSet2 = new HashSet();
                    hashSet2.add("xml");
                    hashSet2.add("rdf");
                    xbVar.m6225a(wwVar, hashSet2, 4);
                    xbVar.m6223a(62);
                    xbVar.m6222a();
                    h = wwVar.m6199h();
                    while (h.hasNext()) {
                        xbVar.m6226a((ww) h.next(), false, 3);
                    }
                    xbVar.m6231c(2);
                    xbVar.m6224a("</rdf:Description>");
                    xbVar.m6222a();
                }
            } else {
                xbVar.m6231c(2);
                xbVar.m6224a("<rdf:Description rdf:about=");
                xbVar.m6228b();
                xbVar.m6224a("/>");
                xbVar.m6222a();
            }
            xbVar.m6231c(1);
            xbVar.m6224a("</rdf:RDF>");
            xbVar.m6222a();
            xbVar.m6231c(0);
            xbVar.m6224a("</x:xmpmeta>");
            xbVar.m6222a();
            Object obj = "";
            if (!xbVar.f9497d.m6239b(16)) {
                char c;
                for (i = xbVar.f9497d.f19677e; i > 0; i--) {
                    String valueOf2 = String.valueOf(obj);
                    valueOf = String.valueOf(xbVar.f9497d.f19676d);
                    if (valueOf.length() == 0) {
                        obj = new String(valueOf2);
                    } else {
                        obj = valueOf2.concat(valueOf);
                    }
                }
                String valueOf3 = String.valueOf(obj);
                valueOf = String.valueOf("<?xpacket end=\"");
                if (valueOf.length() == 0) {
                    obj = new String(valueOf3);
                } else {
                    obj = valueOf3.concat(valueOf);
                }
                valueOf3 = String.valueOf(obj);
                if (xbVar.f9497d.m6239b(32)) {
                    c = 'r';
                } else {
                    c = 'w';
                }
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf3).length() + 1);
                stringBuilder.append(valueOf3);
                stringBuilder.append(c);
                valueOf3 = String.valueOf(stringBuilder.toString());
                valueOf = String.valueOf("\"?>");
                if (valueOf.length() != 0) {
                    valueOf = valueOf3.concat(valueOf);
                } else {
                    valueOf = new String(valueOf3);
                }
            }
            xbVar.f9496c.flush();
            i = valueOf.length();
            if (xbVar.f9497d.m6239b(512)) {
                i = (i * xbVar.f9498e) + xbVar.f9495b.f9458a;
                i2 = xbVar.f9499f;
                if (i > i2) {
                    throw new wb("Can't fit into specified packet size", 107);
                }
                xbVar.f9499f = i2 - i;
            }
            xbVar.f9499f /= xbVar.f9498e;
            i = xbVar.f9497d.f19675c.length();
            i2 = xbVar.f9499f;
            if (i2 >= i) {
                xbVar.f9499f = i2 - i;
                while (true) {
                    i2 = xbVar.f9499f;
                    int i3 = i + 100;
                    if (i2 < i3) {
                        break;
                    }
                    xbVar.m6229b(100);
                    xbVar.m6222a();
                    xbVar.f9499f -= i3;
                }
                xbVar.m6229b(i2);
                xbVar.m6222a();
            } else {
                xbVar.m6229b(i2);
            }
            xbVar.m6224a(valueOf);
            xbVar.f9496c.flush();
            xbVar.f9495b.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new wb("Error writing to the OutputStream", 0);
        }
    }

    /* renamed from: a */
    public static String m5876a(int i) {
        switch (i) {
            case 1:
                return "OPEN_CAMERA";
            case 2:
                return "RELEASE";
            case 3:
                return "RECONNECT";
            case 4:
                return "UNLOCK";
            case 5:
                return "LOCK";
            case 101:
                return "SET_PREVIEW_TEXTURE_ASYNC";
            case 102:
                return "START_PREVIEW_ASYNC";
            case 103:
                return "STOP_PREVIEW";
            case 104:
                return "SET_PREVIEW_CALLBACK_WITH_BUFFER";
            case 105:
                return "ADD_CALLBACK_BUFFER";
            case 106:
                return "SET_PREVIEW_DISPLAY_ASYNC";
            case 107:
                return "SET_PREVIEW_CALLBACK";
            case 108:
                return "SET_ONE_SHOT_PREVIEW_CALLBACK";
            case FrameType.ELEMENT_FLOAT64 /*201*/:
                return "SET_PARAMETERS";
            case 202:
                return "GET_PARAMETERS";
            case 203:
                return "REFRESH_PARAMETERS";
            case 204:
                return "APPLY_SETTINGS";
            case FrameType.ELEMENT_RGBA8888 /*301*/:
                return "AUTO_FOCUS";
            case 302:
                return "CANCEL_AUTO_FOCUS";
            case 303:
                return "SET_AUTO_FOCUS_MOVE_CALLBACK";
            case 304:
                return "SET_ZOOM_CHANGE_LISTENER";
            case 305:
                return "CANCEL_AUTO_FOCUS_FINISH";
            case 461:
                return "SET_FACE_DETECTION_LISTENER";
            case 462:
                return "START_FACE_DETECTION";
            case 463:
                return "STOP_FACE_DETECTION";
            case 501:
                return "ENABLE_SHUTTER_SOUND";
            case 502:
                return "SET_DISPLAY_ORIENTATION";
            case 601:
                return "CAPTURE_PHOTO";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("UNKNOWN(");
                stringBuilder.append(i);
                stringBuilder.append(")");
                return stringBuilder.toString();
        }
    }

    /* renamed from: j */
    private static void m5892j(String str) {
        if (!wp.m6162b(str)) {
            throw new wb("Bad XML name", 102);
        }
    }

    /* renamed from: b */
    private static String m5883b(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new wb("Schema namespace URI is required", 101);
        } else if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new wb("Top level name must not be a qualifier", 102);
        } else if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new wb("Top level name must be simple", 102);
        } else {
            String b = we.f9447a.m6126b(str);
            if (b == null) {
                throw new wb("Unregistered schema namespace URI", 101);
            }
            int indexOf = str2.indexOf(58);
            String valueOf;
            if (indexOf < 0) {
                tz.m5892j(str2);
                valueOf = String.valueOf(b);
                b = String.valueOf(str2);
                return b.length() == 0 ? new String(valueOf) : valueOf.concat(b);
            } else {
                tz.m5892j(str2.substring(0, indexOf));
                tz.m5892j(str2.substring(indexOf));
                b = str2.substring(0, indexOf + 1);
                valueOf = we.f9447a.m6126b(str);
                if (valueOf == null) {
                    throw new wb("Unknown schema namespace prefix", 101);
                } else if (b.equals(valueOf)) {
                    return str2;
                } else {
                    throw new wb("Schema namespace URI and prefix mismatch", 101);
                }
            }
        }
    }
}
