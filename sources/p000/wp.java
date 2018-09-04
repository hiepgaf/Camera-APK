package p000;

import com.google.android.apps.camera.metadata.refocus.XmpUtil;

/* compiled from: PG */
/* renamed from: wp */
public final class wp {
    /* renamed from: a */
    private static boolean[] f9468a = new boolean[256];
    /* renamed from: b */
    private static boolean[] f9469b = new boolean[256];

    static {
        int i = 0;
        while (i < f9469b.length) {
            boolean[] zArr = f9468a;
            boolean z = (i >= 97 && i <= 122) ? true : (i >= 65 && i <= 90) ? true : i == 58 ? true : i == 95 ? true : (i >= 192 && i <= 214) ? true : i < XmpUtil.M_SOI ? false : i <= 246;
            zArr[i] = z;
            zArr = f9469b;
            if (i >= 97 && i <= 122) {
                z = true;
            } else if (i >= 65 && i <= 90) {
                z = true;
            } else if (i >= 48 && i <= 57) {
                z = true;
            } else if (i == 58) {
                z = true;
            } else if (i == 95) {
                z = true;
            } else if (i == 45) {
                z = true;
            } else if (i == 46) {
                z = true;
            } else if (i == 183) {
                z = true;
            } else if (i >= 192 && i <= 214) {
                z = true;
            } else if (i < XmpUtil.M_SOI) {
                z = false;
            } else if (i > 246) {
                z = false;
            } else {
                z = true;
            }
            zArr[i] = z;
            i = (char) (i + 1);
        }
    }

    /* renamed from: a */
    static boolean m6160a(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        boolean z = true;
        while (i < str.length()) {
            if (str.charAt(i) == '-') {
                i2++;
                z = z ? i != 8 ? i != 13 ? i != 18 ? i == 23 : true : true : true : false;
            }
            i++;
        }
        if (z && i2 == 4 && i == 36) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m6158a(String str, boolean z) {
        int i = 0;
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (charAt != '<') {
                if (charAt != '>') {
                    if (charAt != '&') {
                        if (charAt != '\t') {
                            if (charAt != '\n') {
                                if (charAt != '\r') {
                                    if (z && charAt == '\"') {
                                        i2 = 1;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    i2 = 1;
                                    break;
                                }
                            }
                            i2 = 1;
                            break;
                        }
                        i2 = 1;
                        break;
                    }
                    i2 = 1;
                    break;
                }
                i2 = 1;
                break;
            }
            i2 = 1;
            break;
        }
        i2 = 0;
        if (i2 == 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer((str.length() << 2) / 3);
        while (i < str.length()) {
            char charAt2 = str.charAt(i);
            if (charAt2 != '\t' && charAt2 != '\n' && charAt2 != '\r') {
                switch (charAt2) {
                    case '\"':
                        stringBuffer.append(!z ? "\"" : "&quot;");
                        break;
                    case '&':
                        stringBuffer.append("&amp;");
                        break;
                    case '<':
                        stringBuffer.append("&lt;");
                        break;
                    case '>':
                        stringBuffer.append("&gt;");
                        break;
                    default:
                        stringBuffer.append(charAt2);
                        break;
                }
            }
            stringBuffer.append("&#x");
            stringBuffer.append(Integer.toHexString(charAt2).toUpperCase());
            stringBuffer.append(';');
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    static boolean m6159a(char c) {
        if (c > '\u001f') {
            if (c == '') {
            }
            return false;
        }
        if (!(c == '\t' || c == '\n' || c == '\r')) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m6161b(char c) {
        return c > 'ÿ' || f9469b[c];
    }

    /* renamed from: c */
    private static boolean m6163c(char c) {
        return c > 'ÿ' || f9468a[c];
    }

    /* renamed from: b */
    public static boolean m6162b(String str) {
        int i;
        if (str.length() <= 0) {
            i = 1;
        } else if (!wp.m6163c(str.charAt(0))) {
            return false;
        } else {
            i = 1;
        }
        while (i < str.length()) {
            if (!wp.m6161b(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m6164c(String str) {
        int i;
        if (str.length() <= 0) {
            i = 1;
        } else if (!wp.m6163c(str.charAt(0)) || str.charAt(0) == ':') {
            return false;
        } else {
            i = 1;
        }
        while (i < str.length()) {
            if (!wp.m6161b(str.charAt(i)) || str.charAt(i) == ':') {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: d */
    public static String m6165d(String str) {
        if ("x-default".equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            switch (str.charAt(i2)) {
                case ' ':
                    break;
                case '-':
                case '_':
                    stringBuffer.append('-');
                    i++;
                    break;
                default:
                    if (i == 2) {
                        stringBuffer.append(Character.toUpperCase(str.charAt(i2)));
                        break;
                    }
                    stringBuffer.append(Character.toLowerCase(str.charAt(i2)));
                    break;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    static String m6166e(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (wp.m6159a(stringBuffer.charAt(i))) {
                stringBuffer.setCharAt(i, ' ');
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: f */
    static String[] m6167f(String str) {
        int i;
        int indexOf = str.indexOf(61);
        if (str.charAt(1) == '?') {
            i = 2;
        } else {
            i = 1;
        }
        String substring = str.substring(i, indexOf);
        i = indexOf + 1;
        char charAt = str.charAt(i);
        i++;
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - indexOf);
        while (i < length) {
            stringBuffer.append(str.charAt(i));
            i++;
            if (str.charAt(i) == charAt) {
                i++;
            }
        }
        return new String[]{substring, stringBuffer.toString()};
    }
}
