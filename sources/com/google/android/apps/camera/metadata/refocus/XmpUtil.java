package com.google.android.apps.camera.metadata.refocus;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.jri;
import p000.kqg;
import p000.wc;
import p000.wd;
import p000.we;
import p000.xk;
import p000.xn;

/* compiled from: PG */
public class XmpUtil {
    public static final int MAX_EXTENDED_XMP_BUFFER_SIZE = 65458;
    public static final int MAX_XMP_BUFFER_SIZE = 65502;
    public static final int M_APP1 = 225;
    public static final int M_SOI = 216;
    public static final int M_SOS = 218;
    public static final String TAG = "XmpUtil";
    public static final String XMP_EXTENSION_HEADER = "http://ns.adobe.com/xmp/extension/\u0000";
    public static final int XMP_EXTENSION_HEADER_GUID_SIZE = 68;
    public static final int XMP_EXTENSION_HEADER_OFFSET = 7;
    public static final String XMP_HAS_EXTENSION = "HasExtendedXMP";
    public static final String XMP_HEADER = "http://ns.adobe.com/xap/1.0/\u0000";
    public static final Logger logger = Logger.getLogger(TAG);

    /* compiled from: PG */
    class Section {
        public byte[] data;
        public int length;
        public int marker;

        private Section() {
        }
    }

    private XmpUtil() {
    }

    private static int appendBuffer(byte[] bArr, int i, byte[] bArr2, int i2) {
        int min = Math.min(bArr.length - i, bArr2.length - i2);
        System.arraycopy(bArr, i, bArr2, i2, min);
        return min;
    }

    private static boolean checkExtendedSectionExists(List list, String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
        stringBuilder.append(XMP_EXTENSION_HEADER);
        stringBuilder.append(str);
        stringBuilder.append("\u0000");
        String stringBuilder2 = stringBuilder.toString();
        for (Section section : list) {
            if (hasHeader(section.data, stringBuilder2)) {
                return true;
            }
        }
        return false;
    }

    private static List createExtendedSections(byte[] bArr) {
        String guid = getGUID(bArr);
        String valueOf = String.valueOf(XMP_EXTENSION_HEADER);
        guid = String.valueOf(guid);
        if (guid.length() == 0) {
            guid = new String(valueOf);
        } else {
            guid = valueOf.concat(guid);
        }
        int length = guid.length() + 8;
        List arrayList = new ArrayList();
        int length2 = (bArr.length / (MAX_EXTENDED_XMP_BUFFER_SIZE - length)) + 1;
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            int length3 = bArr.length;
            byte[] bArr2 = new byte[Math.min((length3 - i) + length, MAX_EXTENDED_XMP_BUFFER_SIZE)];
            int appendBuffer = appendBuffer(guid.getBytes(), 0, bArr2, 0);
            length3 = appendBuffer(toByteArray(length3), 0, bArr2, appendBuffer) + appendBuffer;
            i += appendBuffer(bArr, i, bArr2, length3 + appendBuffer(toByteArray(i), 0, bArr2, length3));
            arrayList.add(createSection(bArr2));
        }
        return arrayList;
    }

    private static Section createSection(byte[] bArr) {
        Section section = new Section();
        section.marker = M_APP1;
        section.length = bArr.length + 2;
        section.data = bArr;
        return section;
    }

    private static Section createStandardSection(byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length + 29)];
        appendBuffer(bArr, 0, bArr2, appendBuffer(XMP_HEADER.getBytes(), 0, bArr2, 0));
        return createSection(bArr2);
    }

    public static wd createXMPMeta() {
        return we.m6118a();
    }

    public static wd extractOrCreateXMPMeta(String str) {
        wd extractXMPMeta = extractXMPMeta(str);
        return extractXMPMeta == null ? createXMPMeta() : extractXMPMeta;
    }

    public static wd extractXMPMeta(InputStream inputStream) {
        return extractXMPMeta(inputStream, false);
    }

    public static wd extractXMPMeta(InputStream inputStream, boolean z) {
        List parse = parse(inputStream, true, z);
        if (parse == null) {
            return null;
        }
        wd parseFirstValidXMPSection = parseFirstValidXMPSection(parse);
        if (parseFirstValidXMPSection == null || !parseFirstValidXMPSection.mo2525b("http://ns.adobe.com/xmp/note/", XMP_HAS_EXTENSION)) {
            return parseFirstValidXMPSection;
        }
        try {
            String str = (String) parseFirstValidXMPSection.mo2528d("http://ns.adobe.com/xmp/note/", XMP_HAS_EXTENSION).mo2535a();
            if (!z) {
                wd parseExtendedXMPSections = parseExtendedXMPSections(parse, str);
                if (parseExtendedXMPSections == null) {
                    return null;
                }
                try {
                    wc a = parseExtendedXMPSections.mo2514a();
                    while (true) {
                        xn xnVar = (xn) jri.m13152b(a.next());
                        String str2 = xnVar.f19679b;
                        if (str2 != null) {
                            parseFirstValidXMPSection.mo2519a(xnVar.f19678a, str2, xnVar.f19680c, xnVar.f19681d.m6194d());
                        }
                    }
                } catch (Exception e) {
                    return parseFirstValidXMPSection;
                }
            } else if (checkExtendedSectionExists(parse, str)) {
                return parseFirstValidXMPSection;
            } else {
                return null;
            }
        } catch (Throwable e2) {
            kqg.f8420a.mo2210b(e2);
            return null;
        }
    }

    public static wd extractXMPMeta(String str) {
        if (str.toLowerCase().endsWith(".jpg") || str.toLowerCase().endsWith(".jpeg") || str.toLowerCase().endsWith(".rgbz")) {
            try {
                return extractXMPMeta(new FileInputStream(str));
            } catch (Throwable e) {
                String str2;
                Logger logger = logger;
                Level level = Level.SEVERE;
                String valueOf = String.valueOf(str);
                String str3 = "Could not read file: ";
                if (valueOf.length() == 0) {
                    str2 = new String(str3);
                } else {
                    str2 = str3.concat(valueOf);
                }
                logger.logp(level, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "extractXMPMeta", str2, e);
                return null;
            }
        }
        logger.logp(Level.INFO, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "extractXMPMeta", "XMP parse: only JPEG file is supported");
        return null;
    }

    private static String getGUID(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            int length = instance.digest().length;
            Appendable stringBuilder = new StringBuilder(length + length);
            Formatter formatter = new Formatter(stringBuilder);
            for (int i = 0; i < length; i++) {
                formatter.format("%02x", new Object[]{Byte.valueOf(r2[i])});
            }
            formatter.close();
            return stringBuilder.toString().toUpperCase();
        } catch (Throwable e) {
            logger.logp(Level.INFO, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "getGUID", "MD5 hash function not available", e);
            return "";
        }
    }

    private static int getXMPContentEnd(byte[] bArr) {
        int length = bArr.length - 1;
        while (length > 0) {
            if (bArr[length] == (byte) 62 && bArr[length - 1] != (byte) 63) {
                return length + 1;
            }
            length--;
        }
        return bArr.length;
    }

    private static boolean hasHeader(byte[] bArr, String str) {
        if (bArr.length < str.length()) {
            return false;
        }
        try {
            Object obj = new byte[str.length()];
            System.arraycopy(bArr, 0, obj, 0, str.length());
            if (new String(obj, "UTF-8").equals(str)) {
                return true;
            }
            return false;
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }

    private static void insertExtendedXMPSection(List list, int i, byte[] bArr) {
        list.addAll(i, createExtendedSections(bArr));
    }

    private static int insertStandardXMPSection(List list, byte[] bArr) {
        int i = 0;
        if (list == null) {
            return -1;
        }
        if (bArr.length > MAX_XMP_BUFFER_SIZE) {
            logger.logp(Level.SEVERE, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "insertStandardXMPSection", "The standard XMP section cannot have a size larger than 65502 bytes.");
            return -1;
        }
        Section createStandardSection = createStandardSection(bArr);
        int i2 = 0;
        while (i2 < list.size()) {
            if (((Section) list.get(i2)).marker == M_APP1 && hasHeader(((Section) list.get(i2)).data, XMP_HEADER)) {
                list.set(i2, createStandardSection);
                return i2;
            }
            i2++;
        }
        if (list.size() > 0 && ((Section) list.get(0)).marker == M_APP1) {
            i = 1;
        }
        list.add(i, createStandardSection);
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List parse(java.io.InputStream r7, boolean r8, boolean r9) {
        /*
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r3 = -1;
        r6 = new java.util.ArrayList;
        r6.<init>();
        if (r7 != 0) goto L_0x000c;
    L_0x000a:
        r0 = r6;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = r7.read();	 Catch:{ IOException -> 0x0071 }
        if (r0 != r4) goto L_0x00b4;
    L_0x0012:
        r0 = r7.read();	 Catch:{ IOException -> 0x0071 }
        r1 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        if (r0 != r1) goto L_0x00b4;
    L_0x001a:
        r0 = r7.read();	 Catch:{ IOException -> 0x0071 }
        if (r0 == r3) goto L_0x00ac;
    L_0x0020:
        if (r0 != r4) goto L_0x00a4;
    L_0x0022:
        r0 = r7.read();	 Catch:{ IOException -> 0x0071 }
        if (r0 == r4) goto L_0x0022;
    L_0x0028:
        if (r0 == r3) goto L_0x009c;
    L_0x002a:
        r1 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        if (r0 != r1) goto L_0x0054;
    L_0x002e:
        if (r8 != 0) goto L_0x004d;
    L_0x0030:
        r1 = new com.google.android.apps.camera.metadata.refocus.XmpUtil$Section;	 Catch:{ IOException -> 0x0071 }
        r2 = 0;
        r1.<init>();	 Catch:{ IOException -> 0x0071 }
        r1.marker = r0;	 Catch:{ IOException -> 0x0071 }
        r0 = -1;
        r1.length = r0;	 Catch:{ IOException -> 0x0071 }
        r0 = r7.available();	 Catch:{ IOException -> 0x0071 }
        r0 = new byte[r0];	 Catch:{ IOException -> 0x0071 }
        r1.data = r0;	 Catch:{ IOException -> 0x0071 }
        r0 = r1.data;	 Catch:{ IOException -> 0x0071 }
        r2 = r0.length;	 Catch:{ IOException -> 0x0071 }
        r3 = 0;
        r7.read(r0, r3, r2);	 Catch:{ IOException -> 0x0071 }
        r6.add(r1);	 Catch:{ IOException -> 0x0071 }
    L_0x004d:
        if (r7 == 0) goto L_0x0052;
    L_0x004f:
        r7.close();	 Catch:{ IOException -> 0x00bc }
    L_0x0052:
        r0 = r6;
        goto L_0x000b;
    L_0x0054:
        r1 = r7.read();	 Catch:{ IOException -> 0x0071 }
        r2 = r7.read();	 Catch:{ IOException -> 0x0071 }
        if (r1 == r3) goto L_0x0094;
    L_0x005e:
        if (r2 == r3) goto L_0x0094;
    L_0x0060:
        r1 = r1 << 8;
        r1 = r1 | r2;
        if (r8 == 0) goto L_0x0069;
    L_0x0065:
        r2 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        if (r0 != r2) goto L_0x0086;
    L_0x0069:
        r0 = readSection(r7, r1, r0, r9);	 Catch:{ IOException -> 0x0071 }
        r6.add(r0);	 Catch:{ IOException -> 0x0071 }
        goto L_0x001a;
    L_0x0071:
        r5 = move-exception;
        r0 = logger;	 Catch:{ all -> 0x008d }
        r1 = java.util.logging.Level.INFO;	 Catch:{ all -> 0x008d }
        r2 = "com.google.android.apps.camera.metadata.refocus.XmpUtil";
        r3 = "parse";
        r4 = "Could not parse file.";
        r0.logp(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x008d }
        if (r7 == 0) goto L_0x0084;
    L_0x0081:
        r7.close();	 Catch:{ IOException -> 0x00c8 }
    L_0x0084:
        r0 = r6;
        goto L_0x000b;
    L_0x0086:
        r0 = r1 + -2;
        r0 = (long) r0;
        r7.skip(r0);	 Catch:{ IOException -> 0x0071 }
        goto L_0x001a;
    L_0x008d:
        r0 = move-exception;
        if (r7 == 0) goto L_0x0093;
    L_0x0090:
        r7.close();	 Catch:{ IOException -> 0x00ca }
    L_0x0093:
        throw r0;
    L_0x0094:
        if (r7 == 0) goto L_0x0099;
    L_0x0096:
        r7.close();	 Catch:{ IOException -> 0x00be }
    L_0x0099:
        r0 = r6;
        goto L_0x000b;
    L_0x009c:
        if (r7 == 0) goto L_0x00a1;
    L_0x009e:
        r7.close();	 Catch:{ IOException -> 0x00c0 }
    L_0x00a1:
        r0 = r6;
        goto L_0x000b;
    L_0x00a4:
        if (r7 == 0) goto L_0x00a9;
    L_0x00a6:
        r7.close();	 Catch:{ IOException -> 0x00c2 }
    L_0x00a9:
        r0 = r6;
        goto L_0x000b;
    L_0x00ac:
        if (r7 == 0) goto L_0x00b1;
    L_0x00ae:
        r7.close();	 Catch:{ IOException -> 0x00c4 }
    L_0x00b1:
        r0 = r6;
        goto L_0x000b;
    L_0x00b4:
        if (r7 == 0) goto L_0x00b9;
    L_0x00b6:
        r7.close();	 Catch:{ IOException -> 0x00c6 }
    L_0x00b9:
        r0 = r6;
        goto L_0x000b;
    L_0x00bc:
        r0 = move-exception;
        goto L_0x0052;
    L_0x00be:
        r0 = move-exception;
        goto L_0x0099;
    L_0x00c0:
        r0 = move-exception;
        goto L_0x00a1;
    L_0x00c2:
        r0 = move-exception;
        goto L_0x00a9;
    L_0x00c4:
        r0 = move-exception;
        goto L_0x00b1;
    L_0x00c6:
        r0 = move-exception;
        goto L_0x00b9;
    L_0x00c8:
        r0 = move-exception;
        goto L_0x0084;
    L_0x00ca:
        r1 = move-exception;
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.metadata.refocus.XmpUtil.parse(java.io.InputStream, boolean, boolean):java.util.List");
    }

    private static wd parseExtendedXMPSections(List list, String str) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
        stringBuilder.append(XMP_EXTENSION_HEADER);
        stringBuilder.append(str);
        stringBuilder.append("\u0000");
        String stringBuilder2 = stringBuilder.toString();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        int i2 = 0;
        for (Section section : list) {
            Section section2;
            if (hasHeader(section2.data, stringBuilder2)) {
                int length = stringBuilder2.length() + 7;
                int length2 = section2.data.length;
                i2 += Math.max(0, length2 - length);
                arrayList.add(section2);
                arrayList2.add(Integer.valueOf(length));
                arrayList3.add(Integer.valueOf(length2));
            }
        }
        if (i2 == 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i < arrayList.size()) {
            section2 = (Section) arrayList.get(i);
            length = ((Integer) arrayList2.get(i)).intValue();
            i2 = ((Integer) arrayList3.get(i)).intValue() - length;
            System.arraycopy(section2.data, length, bArr, i3, i2);
            i++;
            i3 += i2;
        }
        try {
            return we.m6120a(bArr);
        } catch (Throwable e) {
            logger.logp(Level.INFO, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "parseExtendedXMPSections", "Extended XMP parse error", e);
            return null;
        }
    }

    private static wd parseFirstValidXMPSection(List list) {
        for (Section section : list) {
            if (hasHeader(section.data, XMP_HEADER)) {
                byte[] bArr = new byte[(getXMPContentEnd(section.data) - 29)];
                System.arraycopy(section.data, 29, bArr, 0, bArr.length);
                try {
                    return we.m6120a(bArr);
                } catch (Throwable e) {
                    logger.logp(Level.INFO, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "parseFirstValidXMPSection", "XMP parse error", e);
                    return null;
                }
            }
        }
        return null;
    }

    private static Section readSection(InputStream inputStream, int i, int i2, boolean z) {
        int i3 = i - 2;
        if (i3 < XMP_EXTENSION_HEADER_GUID_SIZE || !z) {
            Section section = new Section();
            section.marker = i2;
            section.length = i;
            section.data = new byte[i3];
            inputStream.read(section.data, 0, i3);
            return section;
        }
        Object obj = new byte[XMP_EXTENSION_HEADER_GUID_SIZE];
        int length = obj.length;
        inputStream.read(obj, 0, length);
        if (hasHeader(obj, XMP_EXTENSION_HEADER) && z) {
            section = new Section();
            section.marker = i2;
            section.length = length + 2;
            section.data = obj;
            inputStream.skip((long) (i3 - length));
            return section;
        }
        section = new Section();
        section.marker = i2;
        section.length = i;
        section.data = new byte[i3];
        System.arraycopy(obj, 0, section.data, 0, length);
        inputStream.read(section.data, length, i3 - length);
        return section;
    }

    private static byte[] serializeMeta(wd wdVar) {
        try {
            xk xkVar = new xk();
            xkVar.m14528f();
            xkVar.m14527e();
            return we.m6121a(wdVar, xkVar);
        } catch (Throwable e) {
            logger.logp(Level.INFO, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "serializeMeta", "Serialize XMP failed", e);
            return null;
        }
    }

    private static byte[] toByteArray(int i) {
        return new byte[]{i >> 24, (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    private static void writeSections(OutputStream outputStream, List list) {
        outputStream.write(Illuminant.kOther);
        outputStream.write(M_SOI);
        for (Section section : list) {
            outputStream.write(Illuminant.kOther);
            outputStream.write(section.marker);
            int i = section.length;
            if (i > 0) {
                outputStream.write(i >> 8);
                outputStream.write(i & Illuminant.kOther);
            }
            outputStream.write(section.data);
        }
    }

    public static boolean writeXMPMeta(InputStream inputStream, OutputStream outputStream, wd wdVar, wd wdVar2) {
        if (outputStream == null || wdVar == null) {
            return false;
        }
        OutputStream outputStream2 = (OutputStream) jri.m13152b((Object) outputStream);
        wd wdVar3 = (wd) jri.m13152b((Object) wdVar);
        byte[] serializeMeta;
        if (wdVar2 != null) {
            serializeMeta = serializeMeta(wdVar2);
            if (serializeMeta == null) {
                return false;
            }
            try {
                wdVar3.mo2518a("http://ns.adobe.com/xmp/note/", XMP_HAS_EXTENSION, getGUID(serializeMeta));
            } catch (Throwable e) {
                logger.logp(Level.INFO, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "writeXMPMeta", "Could not write XMP extension property", e);
                return false;
            }
        }
        serializeMeta = null;
        byte[] serializeMeta2 = serializeMeta(wdVar3);
        if (serializeMeta2 == null) {
            return false;
        }
        if (wdVar2 != null) {
            wdVar3.mo2515a("http://ns.adobe.com/xmp/note/", XMP_HAS_EXTENSION);
        }
        List parse = parse(inputStream, false, false);
        int insertStandardXMPSection = insertStandardXMPSection(parse, serializeMeta2);
        if (insertStandardXMPSection < 0) {
            return false;
        }
        if (serializeMeta != null) {
            insertExtendedXMPSection(parse, insertStandardXMPSection + 1, serializeMeta);
        }
        try {
            writeSections(outputStream2, parse);
            return true;
        } catch (Throwable e2) {
            logger.logp(Level.INFO, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "writeXMPMeta", "Write to stream failed", e2);
            return false;
        }
    }

    public static boolean writeXMPMeta(String str, wd wdVar) {
        InputStream fileInputStream;
        String valueOf;
        String str2;
        String str3;
        OutputStream fileOutputStream;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable e) {
            Logger logger = logger;
            Level level = Level.INFO;
            valueOf = String.valueOf(str);
            str2 = "Read file failed:";
            if (valueOf.length() == 0) {
                str3 = new String(str2);
            } else {
                str3 = str2.concat(valueOf);
            }
            logger.logp(level, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "writeXMPMeta", str3, e);
            fileInputStream = null;
        }
        try {
            fileOutputStream = new FileOutputStream(str);
        } catch (Throwable e2) {
            logger = logger;
            level = Level.INFO;
            valueOf = String.valueOf(str);
            str2 = "Write file failed:";
            if (valueOf.length() == 0) {
                str3 = new String(str2);
            } else {
                str3 = str2.concat(valueOf);
            }
            logger.logp(level, "com.google.android.apps.camera.metadata.refocus.XmpUtil", "writeXMPMeta", str3, e2);
            fileOutputStream = null;
        }
        if (fileInputStream == null || fileOutputStream == null) {
            try {
                fileInputStream.close();
            } catch (IOException e3) {
            }
            try {
                fileOutputStream.close();
            } catch (IOException e4) {
            }
            return false;
        }
        try {
            boolean writeXMPMeta = writeXMPMeta(fileInputStream, fileOutputStream, wdVar, null);
            try {
                fileOutputStream.close();
                return writeXMPMeta;
            } catch (IOException e5) {
                return writeXMPMeta;
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e6) {
            }
            try {
                fileOutputStream.close();
            } catch (IOException e7) {
            }
        }
    }
}
