package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Process;
import android.support.v4.app.AppOpsManagerCompat;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: ll */
public final class ll {
    /* renamed from: a */
    public final gk f8779a;
    /* renamed from: b */
    public final Object[] f8780b;

    public ll(gk gkVar, Object... objArr) {
        this.f8779a = gkVar;
        this.f8780b = objArr;
    }

    /* renamed from: a */
    public static int m5505a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManagerCompat.permissionToOp(str);
        if (permissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        if (AppOpsManagerCompat.noteProxyOpNoThrow(context, permissionToOp, packageName) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: a */
    public static Typeface m5506a(Context context, Resources resources, TypedValue typedValue, int i, int i2, mz mzVar) {
        if (typedValue.string == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Resource \"");
            stringBuilder.append(resources.getResourceName(i));
            stringBuilder.append("\" (");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(") is not a Font: ");
            stringBuilder.append(typedValue);
            throw new NotFoundException(stringBuilder.toString());
        }
        String charSequence = typedValue.string.toString();
        if (charSequence.startsWith("res/")) {
            Typeface typeface = (Typeface) gw.f5717b.m3903a(gw.m2851a(resources, i, i2));
            if (typeface != null) {
                mzVar.m14128a(typeface, null);
                return typeface;
            }
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    int next;
                    XmlPullParser xml = resources.getXml(i);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    gq gqVar;
                    xml.require(2, null, "font-family");
                    if (xml.getName().equals("font-family")) {
                        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), aq.f852a);
                        String string = obtainAttributes.getString(0);
                        String string2 = obtainAttributes.getString(1);
                        String string3 = obtainAttributes.getString(2);
                        int resourceId = obtainAttributes.getResourceId(3, 0);
                        int integer = obtainAttributes.getInteger(4, 1);
                        int integer2 = obtainAttributes.getInteger(5, 500);
                        obtainAttributes.recycle();
                        if (string == null || string2 == null || string3 == null) {
                            List arrayList = new ArrayList();
                            while (xml.next() != 3) {
                                if (xml.getEventType() == 2) {
                                    if (xml.getName().equals("font")) {
                                        boolean z;
                                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xml), aq.f853b);
                                        if (obtainAttributes2.hasValue(7)) {
                                            next = aq.f862k;
                                        } else {
                                            next = aq.f857f;
                                        }
                                        int i3 = obtainAttributes2.getInt(next, 400);
                                        if (obtainAttributes2.hasValue(5)) {
                                            next = aq.f860i;
                                        } else {
                                            next = aq.f855d;
                                        }
                                        if (obtainAttributes2.getInt(next, 0) == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (obtainAttributes2.hasValue(9)) {
                                            resourceId = aq.f863l;
                                        } else {
                                            resourceId = aq.f858g;
                                        }
                                        if (obtainAttributes2.hasValue(8)) {
                                            next = aq.f861j;
                                        } else {
                                            next = aq.f856e;
                                        }
                                        string3 = obtainAttributes2.getString(next);
                                        integer = obtainAttributes2.getInt(resourceId, 0);
                                        if (obtainAttributes2.hasValue(6)) {
                                            next = aq.f859h;
                                        } else {
                                            next = aq.f854c;
                                        }
                                        integer2 = obtainAttributes2.getResourceId(next, 0);
                                        String string4 = obtainAttributes2.getString(next);
                                        obtainAttributes2.recycle();
                                        while (xml.next() != 3) {
                                            ll.m5509a(xml);
                                        }
                                        arrayList.add(new qr(string4, i3, z, string3, integer, integer2));
                                    } else {
                                        ll.m5509a(xml);
                                    }
                                }
                            }
                            if (arrayList.isEmpty()) {
                                gqVar = null;
                            } else {
                                gqVar = new na((qr[]) arrayList.toArray(new qr[arrayList.size()]));
                            }
                        } else {
                            while (xml.next() != 3) {
                                ll.m5509a(xml);
                            }
                            gqVar = new gr(new hj(string, string2, string3, ll.m5507a(resources, resourceId)), integer, integer2);
                        }
                    } else {
                        ll.m5509a(xml);
                        gqVar = null;
                    }
                    if (gqVar != null) {
                        return gw.m2850a(context, gqVar, resources, i, i2, mzVar, null, true);
                    }
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    mzVar.m14126a(-3, null);
                    return null;
                }
                typeface = gw.m2849a(context, resources, i, charSequence, i2);
                if (typeface != null) {
                    mzVar.m14128a(typeface, null);
                    return typeface;
                }
                mzVar.m14126a(-3, null);
                return typeface;
            } catch (Throwable e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to parse xml resource ");
                stringBuilder.append(charSequence);
                Log.e("ResourcesCompat", stringBuilder.toString(), e);
                mzVar.m14126a(-3, null);
                return null;
            } catch (Throwable e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to read xml resource ");
                stringBuilder.append(charSequence);
                Log.e("ResourcesCompat", stringBuilder.toString(), e2);
                mzVar.m14126a(-3, null);
                return null;
            }
        }
        mzVar.m14126a(-3, null);
        return null;
    }

    /* renamed from: a */
    public static List m5507a(Resources resources, int i) {
        List list = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                List arrayList = new ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(ll.m5508a(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                } else {
                    arrayList.add(ll.m5508a(resources.getStringArray(i)));
                }
                list = arrayList;
            }
            obtainTypedArray.recycle();
        }
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    private static void m5509a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private static List m5508a(String[] strArr) {
        List arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
