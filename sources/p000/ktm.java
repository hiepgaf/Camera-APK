package p000;

import android.support.v4.app.Person;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: ktm */
public final class ktm implements kqz {
    ktm() {
    }

    /* renamed from: a */
    private static String m13964a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static Object m13962a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static Object m13963a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public final byte[] mo2258a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i + i2);
    }

    /* renamed from: b */
    private static String m13971b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static String m13965a(kqx kqx) {
        kuf kuf = new kuf(kqx);
        StringBuilder stringBuilder = new StringBuilder(kuf.f8571a.mo3268b());
        for (int i = 0; i < kuf.f8571a.mo3268b(); i++) {
            byte a = kuf.f8571a.mo3262a(i);
            switch (a) {
                case (byte) 7:
                    stringBuilder.append("\\a");
                    break;
                case (byte) 8:
                    stringBuilder.append("\\b");
                    break;
                case (byte) 9:
                    stringBuilder.append("\\t");
                    break;
                case (byte) 10:
                    stringBuilder.append("\\n");
                    break;
                case (byte) 11:
                    stringBuilder.append("\\v");
                    break;
                case (byte) 12:
                    stringBuilder.append("\\f");
                    break;
                case (byte) 13:
                    stringBuilder.append("\\r");
                    break;
                case (byte) 34:
                    stringBuilder.append("\\\"");
                    break;
                case (byte) 39:
                    stringBuilder.append("\\'");
                    break;
                case (byte) 92:
                    stringBuilder.append("\\\\");
                    break;
                default:
                    if (a >= (byte) 32 && a <= (byte) 126) {
                        stringBuilder.append((char) a);
                        break;
                    }
                    stringBuilder.append('\\');
                    stringBuilder.append((char) (((a >>> 6) & 3) + 48));
                    stringBuilder.append((char) (((a >>> 3) & 7) + 48));
                    stringBuilder.append((char) ((a & 7) + 48));
                    break;
                    break;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static List m13967a(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    /* renamed from: a */
    public static String m13966a(kvl kvl) {
        String valueOf;
        String str;
        if (kvl == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            ktm.m13968a(null, (Object) kvl, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            str = "Error printing proto: ";
            if (valueOf.length() == 0) {
                return new String(str);
            }
            return str.concat(valueOf);
        } catch (InvocationTargetException e2) {
            valueOf = String.valueOf(e2.getMessage());
            str = "Error printing proto: ";
            if (valueOf.length() == 0) {
                return new String(str);
            }
            return str.concat(valueOf);
        }
    }

    /* renamed from: a */
    private static void m13968a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        int modifiers;
        int length;
        String name;
        if (obj instanceof kvl) {
            String name2;
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(ktm.m13971b(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class cls = obj.getClass();
            for (Field field : cls.getFields()) {
                modifiers = field.getModifiers();
                name2 = field.getName();
                if (!("cachedSize".equals(name2) || (modifiers & 1) != 1 || (modifiers & 8) == 8 || name2.startsWith("_") || name2.endsWith("_"))) {
                    Class type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        ktm.m13968a(name2, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        ktm.m13968a(name2, obj2, stringBuffer, stringBuffer2);
                    } else {
                        if (obj2 != null) {
                            length = Array.getLength(obj2);
                        } else {
                            length = 0;
                        }
                        for (modifiers = 0; modifiers < length; modifiers++) {
                            ktm.m13968a(name2, Array.get(obj2, modifiers), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method name3 : cls.getMethods()) {
                name = name3.getName();
                if (name.startsWith("set")) {
                    String substring = name.substring(3);
                    try {
                        name2 = "has";
                        name = String.valueOf(substring);
                        if (name.length() != 0) {
                            name = name2.concat(name);
                        } else {
                            name = new String(name2);
                        }
                        if (((Boolean) cls.getMethod(name, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            try {
                                name2 = "get";
                                name = String.valueOf(substring);
                                if (name.length() != 0) {
                                    name = name2.concat(name);
                                } else {
                                    name = new String(name2);
                                }
                                ktm.m13968a(substring, cls.getMethod(name, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            } catch (NoSuchMethodException e) {
                            }
                        }
                    } catch (NoSuchMethodException e2) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        name = ktm.m13971b(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(name);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            obj = (String) obj;
            if (!obj.startsWith("http") && obj.length() > 200) {
                obj = String.valueOf(obj.substring(0, 200)).concat("[...]");
            }
            modifiers = obj.length();
            StringBuilder stringBuilder = new StringBuilder(modifiers);
            for (length = 0; length < modifiers; length++) {
                char charAt = obj.charAt(length);
                if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                    stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                } else {
                    stringBuilder.append(charAt);
                }
            }
            name = stringBuilder.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(name);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                stringBuffer2.append("\"\"");
            } else {
                stringBuffer2.append('\"');
                for (byte b : bArr) {
                    modifiers = b & Illuminant.kOther;
                    char c = (char) modifiers;
                    if (modifiers == 92 || modifiers == 34) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append(c);
                    } else if (modifiers < 32 || modifiers >= ScriptIntrinsicBLAS.RsBlas_csyrk) {
                        stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(modifiers)}));
                    } else {
                        stringBuffer2.append(c);
                    }
                }
                stringBuffer2.append('\"');
            }
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    /* renamed from: a */
    private static void m13969a(StringBuilder stringBuilder, int i, String str, Object obj) {
        int i2 = 0;
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                ktm.m13969a(stringBuilder, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Object a2 : ((Map) obj).entrySet()) {
                ktm.m13969a(stringBuilder, i, str, a2);
            }
        } else {
            int i3;
            stringBuilder.append('\n');
            for (i3 = 0; i3 < i; i3++) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(str);
            if (obj instanceof String) {
                stringBuilder.append(": \"");
                stringBuilder.append(ktm.m13965a(kqx.m5054a((String) obj)));
                stringBuilder.append('\"');
            } else if (obj instanceof kqx) {
                stringBuilder.append(": \"");
                stringBuilder.append(ktm.m13965a((kqx) obj));
                stringBuilder.append('\"');
            } else if (obj instanceof kry) {
                stringBuilder.append(" {");
                ktm.m13970a((kry) obj, stringBuilder, i + 2);
                stringBuilder.append("\n");
                while (i2 < i) {
                    stringBuilder.append(' ');
                    i2++;
                }
                stringBuilder.append("}");
            } else if (obj instanceof Entry) {
                stringBuilder.append(" {");
                Entry entry = (Entry) obj;
                i3 = i + 2;
                ktm.m13969a(stringBuilder, i3, Person.KEY_KEY, entry.getKey());
                ktm.m13969a(stringBuilder, i3, "value", entry.getValue());
                stringBuilder.append("\n");
                while (i2 < i) {
                    stringBuilder.append(' ');
                    i2++;
                }
                stringBuilder.append("}");
            } else {
                stringBuilder.append(": ");
                stringBuilder.append(obj.toString());
            }
        }
    }

    /* renamed from: a */
    static void m13970a(kte kte, StringBuilder stringBuilder, int i) {
        int booleanValue;
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Set<String> treeSet = new TreeSet();
        for (Method method : kte.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String valueOf;
            String valueOf2;
            Method method2;
            Object str2;
            String replaceFirst = str.replaceFirst("get", "");
            if (!(!replaceFirst.endsWith("List") || replaceFirst.endsWith("OrBuilderList") || replaceFirst.equals("List"))) {
                valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                if (valueOf2.length() == 0) {
                    valueOf = new String(valueOf);
                } else {
                    valueOf = valueOf.concat(valueOf2);
                }
                method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    ktm.m13969a(stringBuilder, i, ktm.m13964a(valueOf), kry.m17792a(method2, (Object) kte, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                if (valueOf2.length() == 0) {
                    valueOf = new String(valueOf);
                } else {
                    valueOf = valueOf.concat(valueOf2);
                }
                method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                    ktm.m13969a(stringBuilder, i, ktm.m13964a(valueOf), kry.m17792a(method2, (Object) kte, new Object[0]));
                }
            }
            valueOf2 = String.valueOf(replaceFirst);
            String str3 = "set";
            if (valueOf2.length() == 0) {
                str2 = new String(str3);
            } else {
                str2 = str3.concat(valueOf2);
            }
            if (((Method) hashMap2.get(str2)) != null) {
                String str4;
                Object str5;
                if (replaceFirst.endsWith("Bytes")) {
                    valueOf2 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    str3 = "get";
                    if (valueOf2.length() == 0) {
                        str2 = new String(str3);
                    } else {
                        str2 = str3.concat(valueOf2);
                    }
                    if (hashMap.containsKey(str2)) {
                    }
                }
                str3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                valueOf2 = String.valueOf(replaceFirst.substring(1));
                if (valueOf2.length() == 0) {
                    str4 = new String(str3);
                } else {
                    str4 = str3.concat(valueOf2);
                }
                valueOf2 = String.valueOf(replaceFirst);
                str3 = "get";
                if (valueOf2.length() == 0) {
                    str2 = new String(str3);
                } else {
                    str2 = str3.concat(valueOf2);
                }
                method2 = (Method) hashMap.get(str2);
                str3 = String.valueOf(replaceFirst);
                valueOf = "has";
                if (str3.length() == 0) {
                    str5 = new String(valueOf);
                } else {
                    str5 = valueOf.concat(str3);
                }
                Method method3 = (Method) hashMap.get(str5);
                if (method2 != null) {
                    boolean booleanValue2;
                    kte a = kry.m17792a(method2, (Object) kte, new Object[0]);
                    if (method3 != null) {
                        booleanValue2 = ((Boolean) kry.m17792a(method3, (Object) kte, new Object[0])).booleanValue();
                    } else {
                        if (a instanceof Boolean) {
                            booleanValue = ((Boolean) a).booleanValue() ^ 1;
                        } else if (a instanceof Integer) {
                            if (((Integer) a).intValue() == 0) {
                                booleanValue = 1;
                            } else {
                                booleanValue = 0;
                            }
                        } else if (a instanceof Float) {
                            if (((Float) a).floatValue() == 0.0f) {
                                booleanValue = 1;
                            } else {
                                booleanValue = 0;
                            }
                        } else if (a instanceof Double) {
                            if (((Double) a).doubleValue() == 0.0d) {
                                booleanValue = 1;
                            } else {
                                booleanValue = 0;
                            }
                        } else if (a instanceof String) {
                            booleanValue = a.equals("");
                        } else if (a instanceof kqx) {
                            booleanValue = a.equals(kqx.f8429a);
                        } else if (a instanceof kte) {
                            if (a == a.mo3535d()) {
                                booleanValue = 1;
                            } else {
                                booleanValue = 0;
                            }
                        } else if (!(a instanceof Enum)) {
                            booleanValue = 0;
                        } else if (((Enum) a).ordinal() == 0) {
                            booleanValue = 1;
                        } else {
                            booleanValue = 0;
                        }
                        booleanValue2 = booleanValue == 0;
                    }
                    if (booleanValue2) {
                        ktm.m13969a(stringBuilder, i, ktm.m13964a(str4), (Object) a);
                    }
                }
            }
        }
        if (kte instanceof ksb) {
            Iterator c = ((ksb) kte).f23582g.m5125c();
            while (c.hasNext()) {
                Entry entry = (Entry) c.next();
                int i2 = ((krs) entry.getKey()).f8456b;
                StringBuilder stringBuilder2 = new StringBuilder(13);
                stringBuilder2.append("[");
                stringBuilder2.append(i2);
                stringBuilder2.append("]");
                ktm.m13969a(stringBuilder, i, stringBuilder2.toString(), entry.getValue());
            }
        }
        kuh kuh = ((kry) kte).f23439e;
        if (kuh != null) {
            for (booleanValue = 0; booleanValue < kuh.f8573b; booleanValue++) {
                ktm.m13969a(stringBuilder, i, String.valueOf(kuh.f8574c[booleanValue] >>> 3), kuh.f8575d[booleanValue]);
            }
        }
    }
}
