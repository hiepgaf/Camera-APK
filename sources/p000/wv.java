package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;

/* compiled from: PG */
/* renamed from: wv */
public final class wv {
    /* renamed from: a */
    private static final Object f9478a = new Object();
    /* renamed from: b */
    private static DocumentBuilderFactory f9479b = wv.m6171a();

    /* renamed from: a */
    private static DocumentBuilderFactory m6171a() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
        }
        return newInstance;
    }

    /* renamed from: a */
    private static Object[] m6177a(Node node, boolean z, Object[] objArr) {
        loop0:
        while (true) {
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == (short) 7) {
                    ProcessingInstruction processingInstruction = (ProcessingInstruction) item;
                    if (processingInstruction.getTarget() == "xpacket") {
                        if (objArr != null) {
                            objArr[2] = processingInstruction.getData();
                        }
                    }
                }
                if (!(item.getNodeType() == (short) 3 || item.getNodeType() == (short) 7)) {
                    String namespaceURI = item.getNamespaceURI();
                    String localName = item.getLocalName();
                    if ((!"xmpmeta".equals(localName) && !"xapmeta".equals(localName)) || !"adobe:ns:meta/".equals(namespaceURI)) {
                        if (!z && "RDF".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                            break loop0;
                        }
                        Object[] a = wv.m6177a(item, z, objArr);
                        if (a != null) {
                            return a;
                        }
                    } else {
                        z = false;
                        node = item;
                    }
                }
            }
            return null;
        }
        if (objArr == null) {
            return objArr;
        }
        objArr[0] = item;
        objArr[1] = f9478a;
        return objArr;
    }

    /* renamed from: a */
    public static wd m6176a(Object obj) {
        Node a;
        int i = 0;
        tz.m5879a(obj);
        xi xiVar = new xi();
        if (obj instanceof InputStream) {
            a = wv.m6172a((InputStream) obj, xiVar);
        } else if (obj instanceof byte[]) {
            a = wv.m6175a(new wj((byte[]) obj), xiVar);
        } else {
            a = wv.m6173a((String) obj, xiVar);
        }
        Object[] a2 = wv.m6177a(a, xiVar.m6239b(1), new Object[3]);
        if (a2 == null || a2[1] != f9478a) {
            return new wt();
        }
        a = (Node) a2[0];
        wt wtVar = new wt();
        if (a.hasAttributes()) {
            ww wwVar = wtVar.f19668a;
            while (i < a.getChildNodes().getLength()) {
                Node item = a.getChildNodes().item(i);
                if (!wm.m6139a(item)) {
                    wm.m6137a(wtVar, wwVar, item, true);
                }
                i++;
            }
            if (xiVar.m6239b(32)) {
                return wtVar;
            }
            return wz.m6214a(wtVar, xiVar);
        }
        throw new wb("Invalid attributes of rdf:RDF element", 202);
    }

    /* renamed from: a */
    private static Document m6174a(InputSource inputSource) {
        try {
            DocumentBuilder newDocumentBuilder = f9479b.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(null);
            return newDocumentBuilder.parse(inputSource);
        } catch (Throwable e) {
            throw new wb("XML parsing failure", FrameType.ELEMENT_FLOAT64, e);
        } catch (Throwable e2) {
            throw new wb("XML Parser not correctly configured", 0, e2);
        } catch (Throwable e22) {
            throw new wb("Error reading the XML-file", 204, e22);
        }
    }

    /* renamed from: a */
    private static Document m6175a(wj wjVar, xi xiVar) {
        try {
            return wv.m6174a(new InputSource(wjVar.m6131a()));
        } catch (Throwable e) {
            int i = e.f9443a;
            if (i == FrameType.ELEMENT_FLOAT64 || i == 204) {
                if (xiVar.m6239b(16) && "UTF-8".equals(wjVar.m6134b())) {
                    byte[] bArr = new byte[8];
                    wj wjVar2 = new wj((wjVar.f9456b << 2) / 3);
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = wjVar.f9456b;
                        byte[] a;
                        if (i5 >= i6) {
                            if (i4 == 11) {
                                for (i5 = 0; i5 < i2; i5++) {
                                    a = tz.m5881a(bArr[i5]);
                                    wjVar2.m6133a(a, a.length);
                                }
                                wjVar = wjVar2;
                            } else {
                                wjVar = wjVar2;
                            }
                        } else if (i5 < i6) {
                            int i7 = wjVar.f9455a[i5] & Illuminant.kOther;
                            switch (i4) {
                                case 11:
                                    if (i3 > 0 && (i7 & 192) == 128) {
                                        i6 = i2 + 1;
                                        bArr[i2] = (byte) i7;
                                        i3--;
                                        if (i3 != 0) {
                                            i2 = i6;
                                            break;
                                        }
                                        wjVar2.m6133a(bArr, i6);
                                        i2 = 0;
                                        i4 = 0;
                                        break;
                                    }
                                    a = tz.m5881a(bArr[0]);
                                    wjVar2.m6133a(a, a.length);
                                    i5 -= i2;
                                    i2 = 0;
                                    i4 = 0;
                                    break;
                                    break;
                                default:
                                    byte[] a2;
                                    if (i7 >= ScriptIntrinsicBLAS.RsBlas_csyrk) {
                                        if (i7 < 192) {
                                            a2 = tz.m5881a((byte) i7);
                                            wjVar2.m6133a(a2, a2.length);
                                            break;
                                        }
                                        i3 = -1;
                                        i4 = i7;
                                        while (i3 < 8 && (i4 & 128) == 128) {
                                            i3++;
                                            i4 += i4;
                                        }
                                        i6 = i2 + 1;
                                        bArr[i2] = (byte) i7;
                                        i4 = 11;
                                        i2 = i6;
                                        break;
                                    }
                                    wjVar2.m6132a(wjVar2.f9456b + 1);
                                    a2 = wjVar2.f9455a;
                                    int i8 = wjVar2.f9456b;
                                    wjVar2.f9456b = i8 + 1;
                                    a2[i8] = (byte) i7;
                                    break;
                                    break;
                            }
                            i5++;
                        } else {
                            throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
                        }
                    }
                }
                if (!xiVar.m6239b(8)) {
                    return wv.m6174a(new InputSource(wjVar.m6131a()));
                }
                try {
                    return wv.m6174a(new InputSource(new wl(new InputStreamReader(wjVar.m6131a(), wjVar.m6134b()))));
                } catch (UnsupportedEncodingException e2) {
                    throw new wb("Unsupported Encoding", 9, e);
                }
            }
            throw e;
        }
    }

    /* renamed from: a */
    private static Document m6172a(InputStream inputStream, xi xiVar) {
        if (!xiVar.m6239b(16) && !xiVar.m6239b(8)) {
            return wv.m6174a(new InputSource(inputStream));
        }
        try {
            return wv.m6175a(new wj(inputStream), xiVar);
        } catch (Throwable e) {
            throw new wb("Error reading the XML-file", 204, e);
        }
    }

    /* renamed from: a */
    private static Document m6173a(String str, xi xiVar) {
        try {
            return wv.m6174a(new InputSource(new StringReader(str)));
        } catch (wb e) {
            if (e.f9443a == FrameType.ELEMENT_FLOAT64 && xiVar.m6239b(8)) {
                return wv.m6174a(new InputSource(new wl(new StringReader(str))));
            }
            throw e;
        }
    }
}
