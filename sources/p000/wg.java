package p000;

import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: wg */
public final class wg {
    /* renamed from: a */
    private Map f9449a = new HashMap();
    /* renamed from: b */
    private Map f9450b = new HashMap();
    /* renamed from: c */
    private Map f9451c = new HashMap();
    /* renamed from: d */
    private Pattern f9452d = Pattern.compile("[/*?\\[\\]]");

    public wg() {
        try {
            m6124a("http://www.w3.org/XML/1998/namespace", "xml");
            m6124a("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
            m6124a("http://purl.org/dc/elements/1.1/", "dc");
            m6124a("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
            m6124a("adobe:ns:meta/", "x");
            m6124a("http://ns.adobe.com/iX/1.0/", "iX");
            m6124a("http://ns.adobe.com/xap/1.0/", "xmp");
            m6124a("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
            m6124a("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
            m6124a("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
            m6124a("http://ns.adobe.com/xmp/note/", "xmpNote");
            m6124a("http://ns.adobe.com/pdf/1.3/", "pdf");
            m6124a("http://ns.adobe.com/pdfx/1.3/", "pdfx");
            m6124a("http://www.npes.org/pdfx/ns/id/", "pdfxid");
            m6124a("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
            m6124a("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
            m6124a("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
            m6124a("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
            m6124a("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
            m6124a("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
            m6124a("http://ns.adobe.com/photoshop/1.0/", "photoshop");
            m6124a("http://ns.adobe.com/album/1.0/", "album");
            m6124a("http://ns.adobe.com/exif/1.0/", "exif");
            m6124a("http://ns.adobe.com/exif/1.0/aux/", "aux");
            m6124a("http://ns.adobe.com/tiff/1.0/", "tiff");
            m6124a("http://ns.adobe.com/png/1.0/", "png");
            m6124a("http://ns.adobe.com/jpeg/1.0/", "jpeg");
            m6124a("http://ns.adobe.com/jp2k/1.0/", "jp2k");
            m6124a("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
            m6124a("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
            m6124a("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
            m6124a("http://ns.adobe.com/asf/1.0/", "asf");
            m6124a("http://ns.adobe.com/xmp/wav/1.0/", "wav");
            m6124a("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
            m6124a("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
            m6124a("http://ns.adobe.com/xap/1.0/t/", "xmpT");
            m6124a("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
            m6124a("http://ns.adobe.com/xap/1.0/g/", "xmpG");
            m6124a("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
            m6124a("http://ns.adobe.com/xap/1.0/sType/Font#", "stFNT");
            m6124a("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
            m6124a("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
            m6124a("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
            m6124a("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
            m6124a("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
            m6124a("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
            m6124a("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
            xf xfVar = new xf();
            xfVar.m6238a(1536, true);
            xf xfVar2 = new xf();
            xfVar2.m6238a(7680, true);
            m6123a("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", xfVar);
            m6123a("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
            m6123a("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
            m6123a("http://ns.adobe.com/xap/1.0/", GDepthUtil.FORMAT, "http://purl.org/dc/elements/1.1/", "format", null);
            m6123a("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            m6123a("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
            m6123a("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", NotificationCompatJellybean.KEY_TITLE, null);
            m6123a("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            m6123a("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", xfVar);
            m6123a("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
            m6123a("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            m6123a("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            m6123a("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            m6123a("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", xfVar2);
            m6123a("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", NotificationCompatJellybean.KEY_TITLE, xfVar2);
            m6123a("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", xfVar);
            m6123a("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", xfVar2);
            m6123a("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", xfVar2);
            m6123a("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            m6123a("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
            m6123a("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", NotificationCompatJellybean.KEY_TITLE, xfVar2);
            m6123a("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
            m6123a("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", xfVar);
            m6123a("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            m6123a("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            m6123a("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
            m6123a("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            m6123a("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", xfVar);
            m6123a("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", xfVar2);
            m6123a("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            m6123a("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", xfVar2);
            m6123a("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            m6123a("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            m6123a("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", NotificationCompatJellybean.KEY_TITLE, xfVar2);
        } catch (wb e) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    /* renamed from: a */
    public final synchronized xl m6125a(String str) {
        return (xl) this.f9451c.get(str);
    }

    /* renamed from: b */
    public final synchronized String m6126b(String str) {
        return (String) this.f9449a.get(str);
    }

    /* renamed from: c */
    public final synchronized String m6127c(String str) {
        if (str != null) {
            if (!str.endsWith(":")) {
                str = String.valueOf(str).concat(":");
            }
        }
        return (String) this.f9450b.get(str);
    }

    /* renamed from: a */
    private final synchronized void m6123a(String str, String str2, String str3, String str4, xf xfVar) {
        xf xfVar2;
        tz.m5885c(str);
        tz.m5884b(str2);
        tz.m5885c(str3);
        tz.m5884b(str4);
        if (xfVar != null) {
            xfVar2 = new xf(wy.m6206a(xfVar.m14508c(), null).f9510a);
        } else {
            xfVar2 = new xf();
        }
        if (this.f9452d.matcher(str2).find() || this.f9452d.matcher(str4).find()) {
            throw new wb("Alias and actual property names must be simple", 102);
        }
        String b = m6126b(str);
        String b2 = m6126b(str3);
        if (b == null) {
            throw new wb("Alias namespace is not registered", 101);
        } else if (b2 == null) {
            throw new wb("Actual namespace is not registered", 101);
        } else {
            Object str5;
            String valueOf = String.valueOf(b);
            b = String.valueOf(str2);
            if (b.length() == 0) {
                str5 = new String(valueOf);
            } else {
                valueOf = valueOf.concat(b);
            }
            if (this.f9451c.containsKey(str5)) {
                throw new wb("Alias is already existing", 4);
            }
            Object str6;
            Map map = this.f9451c;
            String valueOf2 = String.valueOf(b2);
            b = String.valueOf(str4);
            if (b.length() == 0) {
                str6 = new String(valueOf2);
            } else {
                str6 = valueOf2.concat(b);
            }
            if (map.containsKey(str6)) {
                throw new wb("Actual property is already an alias, use the base property", 4);
            }
            this.f9451c.put(str5, new xa(str3, b2, str4, xfVar2));
        }
    }

    /* renamed from: a */
    public final synchronized String m6124a(String str, String str2) {
        String valueOf;
        tz.m5885c(str);
        if (str2 == null || str2.length() == 0) {
            throw new wb("Empty prefix", 4);
        }
        if (str2.charAt(str2.length() - 1) != ':') {
            valueOf = String.valueOf(str2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 1);
            stringBuilder.append(valueOf);
            stringBuilder.append(':');
            str2 = stringBuilder.toString();
        }
        if (wp.m6164c(str2.substring(0, str2.length() - 1))) {
            valueOf = (String) this.f9449a.get(str);
            String str3 = (String) this.f9450b.get(str2);
            if (valueOf == null) {
                if (str3 != null) {
                    int i = 1;
                    valueOf = str2;
                    while (this.f9450b.containsKey(valueOf)) {
                        valueOf = str2.substring(0, str2.length() - 1);
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 14);
                        stringBuilder2.append(valueOf);
                        stringBuilder2.append("_");
                        stringBuilder2.append(i);
                        stringBuilder2.append("_:");
                        i++;
                        valueOf = stringBuilder2.toString();
                    }
                } else {
                    valueOf = str2;
                }
                this.f9450b.put(valueOf, str);
                this.f9449a.put(str, valueOf);
            }
        } else {
            throw new wb("The prefix is a bad XML name", FrameType.ELEMENT_FLOAT64);
        }
        return valueOf;
    }
}
