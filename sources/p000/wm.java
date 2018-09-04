package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* compiled from: PG */
/* renamed from: wm */
public final class wm {
    /* renamed from: a */
    public final ih f9463a = new ih();
    /* renamed from: b */
    public final in f9464b = new in();

    /* renamed from: a */
    private static ww m6135a(wt wtVar, ww wwVar, Node node, String str, boolean z) {
        boolean z2 = false;
        wg wgVar = we.f9447a;
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            String str2;
            if ("http://purl.org/dc/1.1/".equals(namespaceURI)) {
                namespaceURI = "http://purl.org/dc/elements/1.1/";
            }
            Object b = wgVar.m6126b(namespaceURI);
            if (b == null) {
                if (node.getPrefix() == null) {
                    str2 = "_dflt";
                } else {
                    str2 = node.getPrefix();
                }
                b = wgVar.m6124a(namespaceURI, str2);
            }
            String valueOf = String.valueOf(b);
            str2 = String.valueOf(node.getLocalName());
            if (str2.length() == 0) {
                str2 = new String(valueOf);
            } else {
                str2 = valueOf.concat(str2);
            }
            xj xjVar = new xj();
            if (z) {
                wwVar = wy.m6203a(wtVar.f19668a, namespaceURI, "_dflt", true);
                wwVar.f9486g = false;
                if (wgVar.m6125a(str2) != null) {
                    wtVar.f19668a.f9487h = true;
                    wwVar.f9487h = true;
                    z2 = true;
                }
            }
            boolean equals = "rdf:li".equals(str2);
            boolean equals2 = "rdf:value".equals(str2);
            ww wwVar2 = new ww(str2, str, xjVar);
            wwVar2.f9488i = z2;
            if (equals2) {
                wwVar.m6186a(1, wwVar2);
            } else {
                wwVar.m6187a(wwVar2);
            }
            if (equals2) {
                if (z || !wwVar.m6194d().m6239b(256)) {
                    throw new wb("Misplaced rdf:value element", 202);
                }
                wwVar.f9489j = true;
            }
            if (equals) {
                if (wwVar.m6194d().m6239b(512)) {
                    wwVar2.f9480a = "[]";
                } else {
                    throw new wb("Misplaced rdf:li element", 202);
                }
            }
            return wwVar2;
        }
        throw new wb("XML namespace required for all elements and attributes", 202);
    }

    /* renamed from: a */
    private static ww m6136a(ww wwVar, String str, String str2) {
        if ("xml:lang".equals(str)) {
            str2 = wp.m6165d(str2);
        }
        ww wwVar2 = new ww(str, str2, null);
        wwVar.m6191b(wwVar2);
        return wwVar2;
    }

    /* renamed from: a */
    public final void m6147a(ux uxVar) {
        vw vwVar = (vw) this.f9463a.get(uxVar);
        if (vwVar == null) {
            vwVar = vw.m6073a();
            this.f9463a.put(uxVar, vwVar);
        }
        r0.f9433a |= 1;
    }

    /* renamed from: a */
    public final void m6146a(long j, ux uxVar) {
        this.f9464b.m3867a(j, uxVar);
    }

    /* renamed from: a */
    public final void m6148a(ux uxVar, ue ueVar) {
        vw vwVar = (vw) this.f9463a.get(uxVar);
        if (vwVar == null) {
            vwVar = vw.m6073a();
            this.f9463a.put(uxVar, vwVar);
        }
        vwVar.f9435c = ueVar;
        vwVar.f9433a |= 8;
    }

    /* renamed from: b */
    public final void m6149b(ux uxVar, ue ueVar) {
        vw vwVar = (vw) this.f9463a.get(uxVar);
        if (vwVar == null) {
            vwVar = vw.m6073a();
            this.f9463a.put(uxVar, vwVar);
        }
        vwVar.f9434b = ueVar;
        vwVar.f9433a |= 4;
    }

    /* renamed from: a */
    public final void m6145a() {
        this.f9463a.clear();
        this.f9464b.m3865a();
    }

    /* renamed from: a */
    private static void m6138a(ww wwVar) {
        int i = 1;
        ww a = wwVar.m6183a(1);
        if (a.m6194d().m6239b(64)) {
            if (wwVar.m6194d().m6239b(64)) {
                throw new wb("Redundant xml:lang for rdf:value element", 203);
            }
            ww b = a.m6189b(1);
            a.m6195d(b);
            wwVar.m6191b(b);
        }
        while (i <= a.m6196e()) {
            wwVar.m6191b(a.m6189b(i));
            i++;
        }
        for (i = 2; i <= wwVar.m6192c(); i++) {
            wwVar.m6191b(wwVar.m6183a(i));
        }
        wwVar.f9489j = false;
        wwVar.m6194d().m14520d(false);
        wwVar.m6194d().m14514a(a.m6194d());
        wwVar.f9481b = a.f9481b;
        wwVar.f9483d = null;
        Iterator h = a.m6199h();
        while (h.hasNext()) {
            wwVar.m6187a((ww) h.next());
        }
    }

    /* renamed from: b */
    private static int m6140b(Node node) {
        String localName = node.getLocalName();
        Object namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if ("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            if ("li".equals(localName)) {
                return 9;
            }
            if ("parseType".equals(localName)) {
                return 4;
            }
            if ("Description".equals(localName)) {
                return 8;
            }
            if ("about".equals(localName)) {
                return 3;
            }
            if ("resource".equals(localName)) {
                return 5;
            }
            if ("RDF".equals(localName)) {
                return 1;
            }
            if ("ID".equals(localName)) {
                return 2;
            }
            if ("nodeID".equals(localName)) {
                return 6;
            }
            if ("datatype".equals(localName)) {
                return 7;
            }
            if ("aboutEach".equals(localName)) {
                return 10;
            }
            if ("aboutEachPrefix".equals(localName)) {
                return 11;
            }
            if ("bagID".equals(localName)) {
                return 12;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean m6150b(ux uxVar) {
        vw vwVar = (vw) this.f9463a.get(uxVar);
        return (vwVar == null || (vwVar.f9433a & 1) == 0) ? false : true;
    }

    /* renamed from: a */
    static boolean m6139a(Node node) {
        if (node.getNodeType() != (short) 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final ue m6144a(ux uxVar, int i) {
        ue ueVar = null;
        int a = this.f9463a.m4351a((Object) uxVar);
        if (a >= 0) {
            vw vwVar = (vw) this.f9463a.m4358d(a);
            if (vwVar != null) {
                int i2 = vwVar.f9433a;
                if ((i2 & i) != 0) {
                    vwVar.f9433a = (i ^ -1) & i2;
                    if (i == 4) {
                        ueVar = vwVar.f9434b;
                    } else if (i == 8) {
                        ueVar = vwVar.f9435c;
                    } else {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    if ((vwVar.f9433a & 12) == 0) {
                        this.f9463a.mo2635c(a);
                        vw.m6074a(vwVar);
                    }
                }
            }
        }
        return ueVar;
    }

    /* renamed from: b */
    private static void m6141b(wt wtVar, ww wwVar, Node node, boolean z) {
        if (node.hasChildNodes()) {
            throw new wb("Nested content not allowed with rdf:resource or property attributes", 202);
        }
        Object obj;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Node node2 = null;
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node item = node.getAttributes().item(i);
            if (!("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName())))) {
                switch (wm.m6140b(item)) {
                    case 0:
                        if (!"value".equals(item.getLocalName()) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item.getNamespaceURI())) {
                            if (!"xml:lang".equals(item.getNodeName())) {
                                obj2 = 1;
                                break;
                            }
                            break;
                        } else if (obj3 == null) {
                            obj5 = 1;
                            node2 = item;
                            break;
                        } else {
                            throw new wb("Empty property element can't have both rdf:value and rdf:resource", 203);
                        }
                    case 2:
                        break;
                    case 5:
                        if (obj4 == null) {
                            if (obj5 == null) {
                                if (obj5 != null) {
                                    obj3 = 1;
                                    break;
                                }
                                obj3 = 1;
                                node2 = item;
                                break;
                            }
                            throw new wb("Empty property element can't have both rdf:value and rdf:resource", 203);
                        }
                        throw new wb("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                    case 6:
                        if (obj3 == null) {
                            obj4 = 1;
                            break;
                        }
                        throw new wb("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                    default:
                        throw new wb("Unrecognized attribute of empty property element", 202);
                }
            }
        }
        ww a = wm.m6135a(wtVar, wwVar, node, "", z);
        if (obj5 != null || obj3 != null) {
            String str;
            if (node2 == null) {
                str = "";
            } else {
                str = node2.getNodeValue();
            }
            a.f9481b = str;
            if (obj5 == null) {
                a.m6194d().m6238a(2, true);
                obj = null;
            } else {
                obj = null;
            }
        } else if (obj2 != null) {
            a.m6194d().m14520d(true);
            obj = 1;
        } else {
            obj = null;
        }
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node item2 = node.getAttributes().item(i2);
            if (!(item2 == node2 || "xmlns".equals(item2.getPrefix()) || (item2.getPrefix() == null && "xmlns".equals(item2.getNodeName())))) {
                switch (wm.m6140b(item2)) {
                    case 0:
                        if (obj != null) {
                            if (!"xml:lang".equals(item2.getNodeName())) {
                                wm.m6135a(wtVar, a, item2, item2.getNodeValue(), false);
                                break;
                            } else {
                                wm.m6136a(a, "xml:lang", item2.getNodeValue());
                                break;
                            }
                        }
                        wm.m6136a(a, item2.getNodeName(), item2.getNodeValue());
                        break;
                    case 2:
                    case 6:
                        break;
                    case 5:
                        wm.m6136a(a, "rdf:resource", item2.getNodeValue());
                        break;
                    default:
                        throw new wb("Unrecognized attribute of empty property element", 202);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m6142c(wt wtVar, ww wwVar, Node node, boolean z) {
        String namespaceURI;
        int i = 0;
        ww a = wm.m6135a(wtVar, wwVar, node, null, z);
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node item = node.getAttributes().item(i2);
            if (!("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName())))) {
                namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if ("xml:lang".equals(item.getNodeName())) {
                    wm.m6136a(a, "xml:lang", item.getNodeValue());
                } else if (!("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) && ("ID".equals(localName) || "datatype".equals(localName)))) {
                    throw new wb("Invalid attribute for literal property element", 202);
                }
            }
        }
        String str = "";
        while (i < node.getChildNodes().getLength()) {
            item = node.getChildNodes().item(i);
            if (item.getNodeType() == (short) 3) {
                namespaceURI = String.valueOf(str);
                str = String.valueOf(item.getNodeValue());
                if (str.length() == 0) {
                    str = new String(namespaceURI);
                } else {
                    str = namespaceURI.concat(str);
                }
                i++;
            } else {
                throw new wb("Invalid child of literal property element", 202);
            }
        }
        a.f9481b = str;
    }

    /* renamed from: a */
    static void m6137a(wt wtVar, ww wwVar, Node node, boolean z) {
        int i = 0;
        int b = wm.m6140b(node);
        if (b == 8 || b == 0) {
            if (!z) {
                b = 0;
            } else if (b != 0) {
                b = 0;
            } else {
                throw new wb("Top level typed node not allowed", 203);
            }
            while (i < node.getAttributes().getLength()) {
                Node item = node.getAttributes().item(i);
                if (!("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName())))) {
                    int b2 = wm.m6140b(item);
                    switch (b2) {
                        case 0:
                            wm.m6135a(wtVar, wwVar, item, item.getNodeValue(), z);
                            break;
                        case 2:
                        case 3:
                        case 6:
                            if (b <= 0) {
                                b++;
                                if (z && b2 == 3) {
                                    String str = wwVar.f9480a;
                                    if (str != null && str.length() > 0) {
                                        if (wwVar.f9480a.equals(item.getNodeValue())) {
                                            break;
                                        }
                                        throw new wb("Mismatched top level rdf:about values", 203);
                                    }
                                    wwVar.f9480a = item.getNodeValue();
                                    break;
                                }
                            }
                            throw new wb("Mutally exclusive about, ID, nodeID attributes", 202);
                            break;
                        default:
                            throw new wb("Invalid nodeElement attribute", 202);
                    }
                }
                i++;
            }
            wm.m6143d(wtVar, wwVar, node, z);
            return;
        }
        throw new wb("Node element must be rdf:Description or typed node", 202);
    }

    /* renamed from: d */
    private static void m6143d(wt wtVar, ww wwVar, Node node, boolean z) {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node item = node.getChildNodes().item(i);
            if (!wm.m6139a(item)) {
                if (item.getNodeType() != (short) 1) {
                    throw new wb("Expected property element node not found", 202);
                }
                Object obj;
                int i2;
                int b = wm.m6140b(item);
                if (b != 8) {
                    if (b < 10) {
                        obj = null;
                    } else if (b <= 12) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        if (b <= 0) {
                            i2 = 0;
                        } else if (b <= 7) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        i2 ^= 1;
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    throw new wb("Invalid property element name", 202);
                }
                int i3;
                NamedNodeMap attributes = item.getAttributes();
                ArrayList arrayList = null;
                for (i3 = 0; i3 < attributes.getLength(); i3++) {
                    Node item2 = attributes.item(i3);
                    if ("xmlns".equals(item2.getPrefix()) || (item2.getPrefix() == null && "xmlns".equals(item2.getNodeName()))) {
                        List arrayList2;
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                        } else {
                            obj = arrayList;
                        }
                        arrayList2.add(item2.getNodeName());
                        arrayList = arrayList2;
                    }
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        i3 = i2 + 1;
                        attributes.removeNamedItem((String) arrayList.get(i2));
                        i2 = i3;
                    }
                }
                if (attributes.getLength() > 3) {
                    wm.m6141b(wtVar, wwVar, item, z);
                } else {
                    Node item3;
                    String localName;
                    String namespaceURI;
                    Node item4;
                    i2 = 0;
                    while (i2 < attributes.getLength()) {
                        item3 = attributes.item(i2);
                        localName = item3.getLocalName();
                        namespaceURI = item3.getNamespaceURI();
                        String nodeValue = item3.getNodeValue();
                        if ("xml:lang".equals(item3.getNodeName()) && (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI))) {
                            i2++;
                        } else if ("datatype".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                            wm.m6142c(wtVar, wwVar, item, z);
                        } else if (!"parseType".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                            wm.m6141b(wtVar, wwVar, item, z);
                        } else if ("Literal".equals(nodeValue)) {
                            throw new wb("ParseTypeLiteral property element not allowed", 203);
                        } else if ("Resource".equals(nodeValue)) {
                            ww a = wm.m6135a(wtVar, wwVar, item, "", z);
                            a.m6194d().m14520d(true);
                            for (i2 = 0; i2 < item.getAttributes().getLength(); i2++) {
                                item4 = item.getAttributes().item(i2);
                                if (!("xmlns".equals(item4.getPrefix()) || (item4.getPrefix() == null && "xmlns".equals(item4.getNodeName())))) {
                                    String localName2 = item4.getLocalName();
                                    namespaceURI = item4.getNamespaceURI();
                                    if ("xml:lang".equals(item4.getNodeName())) {
                                        wm.m6136a(a, "xml:lang", item4.getNodeValue());
                                    } else if (!("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) && ("ID".equals(localName2) || "parseType".equals(localName2)))) {
                                        throw new wb("Invalid attribute for ParseTypeResource property element", 202);
                                    }
                                }
                            }
                            wm.m6143d(wtVar, a, item, false);
                            if (a.f9489j) {
                                wm.m6138a(a);
                            }
                        } else if ("Collection".equals(nodeValue)) {
                            throw new wb("ParseTypeCollection property element not allowed", 203);
                        } else {
                            throw new wb("ParseTypeOther property element not allowed", 203);
                        }
                    }
                    if (item.hasChildNodes()) {
                        i2 = 0;
                        while (i2 < item.getChildNodes().getLength()) {
                            if (item.getChildNodes().item(i2).getNodeType() == (short) 3) {
                                i2++;
                            } else if (!z || !"iX:changes".equals(item.getNodeName())) {
                                ww a2 = wm.m6135a(wtVar, wwVar, item, "", z);
                                for (i2 = 0; i2 < item.getAttributes().getLength(); i2++) {
                                    item3 = item.getAttributes().item(i2);
                                    if (!("xmlns".equals(item3.getPrefix()) || (item3.getPrefix() == null && "xmlns".equals(item3.getNodeName())))) {
                                        localName = item3.getLocalName();
                                        namespaceURI = item3.getNamespaceURI();
                                        if ("xml:lang".equals(item3.getNodeName())) {
                                            wm.m6136a(a2, "xml:lang", item3.getNodeValue());
                                        } else if (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                                            throw new wb("Invalid attribute for resource property element", 202);
                                        }
                                    }
                                }
                                obj = null;
                                b = 0;
                                while (b < item.getChildNodes().getLength()) {
                                    Object obj2;
                                    item4 = item.getChildNodes().item(b);
                                    if (wm.m6139a(item4)) {
                                        obj2 = obj;
                                    } else if (item4.getNodeType() == (short) 1 && obj == null) {
                                        boolean equals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item4.getNamespaceURI());
                                        namespaceURI = item4.getLocalName();
                                        if (equals && "Bag".equals(namespaceURI)) {
                                            a2.m6194d().m14517c();
                                        } else if (equals && "Seq".equals(namespaceURI)) {
                                            a2.m6194d().m14517c().m14522f();
                                        } else if (equals && "Alt".equals(namespaceURI)) {
                                            a2.m6194d().m14517c().m14522f().m14521e();
                                        } else {
                                            a2.m6194d().m14520d(true);
                                            if (!(equals || "Description".equals(namespaceURI))) {
                                                String namespaceURI2 = item4.getNamespaceURI();
                                                if (namespaceURI2 == null) {
                                                    throw new wb("All XML elements must be in a namespace", 203);
                                                }
                                                namespaceURI2 = String.valueOf(namespaceURI2);
                                                StringBuilder stringBuilder = new StringBuilder((String.valueOf(namespaceURI2).length() + 1) + String.valueOf(namespaceURI).length());
                                                stringBuilder.append(namespaceURI2);
                                                stringBuilder.append(':');
                                                stringBuilder.append(namespaceURI);
                                                wm.m6136a(a2, "rdf:type", stringBuilder.toString());
                                            }
                                        }
                                        wm.m6137a(wtVar, a2, item4, false);
                                        if (a2.f9489j) {
                                            wm.m6138a(a2);
                                            obj2 = 1;
                                        } else if (!a2.m6194d().m6239b(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
                                            obj2 = 1;
                                        } else if (!a2.m6194d().m6239b(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
                                            obj2 = 1;
                                        } else if (a2.m6197f()) {
                                            Iterator h = a2.m6199h();
                                            while (h.hasNext()) {
                                                if (((ww) h.next()).m6194d().m6239b(64)) {
                                                    obj = 1;
                                                    break;
                                                }
                                            }
                                            obj = null;
                                            if (obj != null) {
                                                a2.m6194d().m14519d();
                                                wy.m6210b(a2);
                                                obj2 = 1;
                                            } else {
                                                obj2 = 1;
                                            }
                                        } else {
                                            obj2 = 1;
                                        }
                                    } else if (obj != null) {
                                        throw new wb("Invalid child of resource property element", 202);
                                    } else {
                                        throw new wb("Children of resource property element must be XML elements", 202);
                                    }
                                    b++;
                                    obj = obj2;
                                }
                                if (obj == null) {
                                    throw new wb("Missing child of resource property element", 202);
                                }
                            }
                        }
                        wm.m6142c(wtVar, wwVar, item, z);
                    } else {
                        wm.m6141b(wtVar, wwVar, item, z);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m6151c(ux uxVar) {
        vw vwVar = (vw) this.f9463a.get(uxVar);
        if (vwVar != null) {
            vwVar.f9433a &= -2;
        }
    }

    /* renamed from: d */
    public final void m6152d(ux uxVar) {
        vw vwVar;
        int c = this.f9464b.m3871c() - 1;
        while (c >= 0) {
            if (uxVar != this.f9464b.m3868b(c)) {
                c--;
            } else {
                in inVar = this.f9464b;
                if (inVar.f7120d[c] != in.f7117a) {
                    inVar.f7120d[c] = in.f7117a;
                    inVar.f7118b = true;
                }
                vwVar = (vw) this.f9463a.remove(uxVar);
                if (vwVar != null) {
                    vw.m6074a(vwVar);
                }
            }
        }
        vwVar = (vw) this.f9463a.remove(uxVar);
        if (vwVar != null) {
            vw.m6074a(vwVar);
        }
    }
}
