package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: nu */
public final class nu extends MenuInflater {
    /* renamed from: a */
    public static final Class[] f8943a;
    /* renamed from: e */
    private static final Class[] f8944e;
    /* renamed from: b */
    public final Object[] f8945b;
    /* renamed from: c */
    public Context f8946c;
    /* renamed from: d */
    public Object f8947d;
    /* renamed from: f */
    private final Object[] f8948f = this.f8945b;

    static {
        Class[] clsArr = new Class[]{Context.class};
        f8943a = clsArr;
        f8944e = clsArr;
    }

    public nu(Context context) {
        super(context);
        this.f8946c = context;
        this.f8945b = new Object[]{context};
    }

    /* renamed from: a */
    static Object m5645a(Object obj) {
        Object obj2 = obj;
        while (!(obj2 instanceof Activity) && (obj2 instanceof ContextWrapper)) {
            obj2 = ((ContextWrapper) obj2).getBaseContext();
        }
        return obj2;
    }

    public final void inflate(int i, Menu menu) {
        Throwable e;
        XmlResourceParser xmlResourceParser;
        Throwable th;
        XmlResourceParser xmlResourceParser2;
        XmlResourceParser xmlResourceParser3 = null;
        if (menu instanceof hf) {
            try {
                xmlResourceParser3 = this.f8946c.getResources().getLayout(i);
                try {
                    m5646a(xmlResourceParser3, Xml.asAttributeSet(xmlResourceParser3), menu);
                    if (xmlResourceParser3 != null) {
                        xmlResourceParser3.close();
                        return;
                    }
                    return;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    try {
                        throw new InflateException("Error inflating menu XML", e);
                    } catch (Throwable e3) {
                        xmlResourceParser = xmlResourceParser3;
                        th = e3;
                        xmlResourceParser2 = xmlResourceParser;
                        if (xmlResourceParser2 != null) {
                            xmlResourceParser2.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e3 = e4;
                    try {
                        throw new InflateException("Error inflating menu XML", e3);
                    } catch (Throwable e32) {
                        xmlResourceParser = xmlResourceParser3;
                        th = e32;
                        xmlResourceParser2 = xmlResourceParser;
                        if (xmlResourceParser2 != null) {
                            xmlResourceParser2.close();
                        }
                        throw th;
                    }
                } catch (Throwable e322) {
                    xmlResourceParser = xmlResourceParser3;
                    th = e322;
                    xmlResourceParser2 = xmlResourceParser;
                    if (xmlResourceParser2 != null) {
                        xmlResourceParser2.close();
                    }
                    throw th;
                }
            } catch (XmlPullParserException e5) {
                e322 = e5;
                throw new InflateException("Error inflating menu XML", e322);
            } catch (IOException e6) {
                e322 = e6;
                throw new InflateException("Error inflating menu XML", e322);
            } catch (Throwable e3222) {
                xmlResourceParser = xmlResourceParser3;
                th = e3222;
                xmlResourceParser2 = xmlResourceParser;
                if (xmlResourceParser2 != null) {
                    xmlResourceParser2.close();
                }
                throw th;
            }
        }
        super.inflate(i, menu);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m5646a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
        r10 = this;
        r4 = new nw;
        r4.<init>(r10, r13);
        r0 = r11.getEventType();
    L_0x0009:
        r1 = 2;
        if (r0 != r1) goto L_0x0249;
    L_0x000c:
        r0 = r11.getName();
        r1 = "menu";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0252;
    L_0x0018:
        r0 = r11.next();
    L_0x001c:
        r3 = 0;
        r2 = 0;
        r1 = 0;
    L_0x001f:
        if (r1 != 0) goto L_0x0271;
    L_0x0021:
        switch(r0) {
            case 1: goto L_0x0269;
            case 2: goto L_0x0031;
            case 3: goto L_0x01e1;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = r1;
        r1 = r2;
        r2 = r3;
    L_0x0027:
        r3 = r11.next();
        r9 = r0;
        r0 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r9;
        goto L_0x001f;
    L_0x0031:
        if (r3 != 0) goto L_0x01dc;
    L_0x0033:
        r0 = r11.getName();
        r5 = "group";
        r5 = r0.equals(r5);
        if (r5 != 0) goto L_0x0197;
    L_0x003f:
        r5 = "item";
        r5 = r0.equals(r5);
        if (r5 != 0) goto L_0x005c;
    L_0x0047:
        r5 = "menu";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x0057;
    L_0x004f:
        r0 = r4.m5648a();
        r10.m5646a(r11, r12, r0);
        goto L_0x0024;
    L_0x0057:
        r2 = 1;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x005c:
        r0 = r4.f8957F;
        r0 = r0.f8946c;
        r5 = p000.ni.be;
        r5 = r0.obtainStyledAttributes(r12, r5);
        r0 = p000.ni.bo;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f8966i = r0;
        r0 = p000.ni.bp;
        r6 = r4.f8960c;
        r0 = r5.getInt(r0, r6);
        r6 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r0 = r0 & r6;
        r6 = p000.ni.bs;
        r7 = r4.f8961d;
        r6 = r5.getInt(r6, r7);
        r6 = (char) r6;
        r0 = r0 | r6;
        r4.f8967j = r0;
        r0 = p000.ni.bt;
        r0 = r5.getText(r0);
        r4.f8968k = r0;
        r0 = p000.ni.bu;
        r0 = r5.getText(r0);
        r4.f8969l = r0;
        r0 = p000.ni.bn;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f8970m = r0;
        r0 = p000.ni.bj;
        r0 = r5.getString(r0);
        r0 = p000.nw.m5647a(r0);
        r4.f8971n = r0;
        r0 = p000.ni.bi;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r5.getInt(r0, r6);
        r4.f8972o = r0;
        r0 = p000.ni.bq;
        r0 = r5.getString(r0);
        r0 = p000.nw.m5647a(r0);
        r4.f8973p = r0;
        r0 = p000.ni.bz;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r5.getInt(r0, r6);
        r4.f8974q = r0;
        r0 = p000.ni.bk;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x0191;
    L_0x00d3:
        r0 = p000.ni.bk;
        r6 = 0;
        r0 = r5.getBoolean(r0, r6);
        r4.f8975r = r0;
    L_0x00dc:
        r0 = p000.ni.bl;
        r6 = 0;
        r0 = r5.getBoolean(r0, r6);
        r4.f8976s = r0;
        r0 = p000.ni.bv;
        r6 = r4.f8963f;
        r0 = r5.getBoolean(r0, r6);
        r4.f8977t = r0;
        r0 = p000.ni.bm;
        r6 = r4.f8964g;
        r0 = r5.getBoolean(r0, r6);
        r4.f8978u = r0;
        r0 = p000.ni.bA;
        r6 = -1;
        r0 = r5.getInt(r0, r6);
        r4.f8979v = r0;
        r0 = p000.ni.br;
        r0 = r5.getString(r0);
        r4.f8983z = r0;
        r0 = p000.ni.bf;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f8980w = r0;
        r0 = p000.ni.bh;
        r0 = r5.getString(r0);
        r4.f8981x = r0;
        r0 = p000.ni.bg;
        r0 = r5.getString(r0);
        r4.f8982y = r0;
        r0 = r4.f8982y;
        if (r0 == 0) goto L_0x0184;
    L_0x0127:
        r6 = r4.f8980w;
        if (r6 != 0) goto L_0x0184;
    L_0x012b:
        r6 = r4.f8981x;
        if (r6 != 0) goto L_0x0184;
    L_0x012f:
        r6 = f8944e;
        r7 = r4.f8957F;
        r7 = r7.f8948f;
        r0 = r4.m5649a(r0, r6, r7);
        r0 = (p000.jf) r0;
        r4.f8952A = r0;
    L_0x013d:
        r0 = p000.ni.bw;
        r0 = r5.getText(r0);
        r4.f8953B = r0;
        r0 = p000.ni.bB;
        r0 = r5.getText(r0);
        r4.f8954C = r0;
        r0 = p000.ni.by;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x0180;
    L_0x0155:
        r0 = p000.ni.by;
        r6 = -1;
        r0 = r5.getInt(r0, r6);
        r6 = r4.f8956E;
        r0 = p000.sg.m5804a(r0, r6);
        r4.f8956E = r0;
    L_0x0164:
        r0 = p000.ni.bx;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x017c;
    L_0x016c:
        r0 = p000.ni.bx;
        r0 = r5.getColorStateList(r0);
        r4.f8955D = r0;
    L_0x0174:
        r5.recycle();
        r0 = 0;
        r4.f8965h = r0;
        goto L_0x0024;
    L_0x017c:
        r0 = 0;
        r4.f8955D = r0;
        goto L_0x0174;
    L_0x0180:
        r0 = 0;
        r4.f8956E = r0;
        goto L_0x0164;
    L_0x0184:
        if (r0 == 0) goto L_0x018d;
    L_0x0186:
        r0 = "SupportMenuInflater";
        r6 = "Ignoring attribute 'actionProviderClass'. Action view already specified.";
        android.util.Log.w(r0, r6);
    L_0x018d:
        r0 = 0;
        r4.f8952A = r0;
        goto L_0x013d;
    L_0x0191:
        r0 = r4.f8962e;
        r4.f8975r = r0;
        goto L_0x00dc;
    L_0x0197:
        r0 = r4.f8957F;
        r0 = r0.f8946c;
        r5 = p000.ni.aX;
        r0 = r0.obtainStyledAttributes(r12, r5);
        r5 = p000.ni.ba;
        r6 = 0;
        r5 = r0.getResourceId(r5, r6);
        r4.f8959b = r5;
        r5 = p000.ni.bb;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f8960c = r5;
        r5 = p000.ni.bc;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f8961d = r5;
        r5 = p000.ni.aY;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f8962e = r5;
        r5 = p000.ni.bd;
        r6 = 1;
        r5 = r0.getBoolean(r5, r6);
        r4.f8963f = r5;
        r5 = p000.ni.aZ;
        r6 = 1;
        r5 = r0.getBoolean(r5, r6);
        r4.f8964g = r5;
        r0.recycle();
        goto L_0x0024;
    L_0x01dc:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x01e1:
        r0 = r11.getName();
        if (r3 == 0) goto L_0x01ed;
    L_0x01e7:
        r5 = r0.equals(r2);
        if (r5 != 0) goto L_0x0242;
    L_0x01ed:
        r5 = "group";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x01fa;
    L_0x01f5:
        r4.m5651b();
        goto L_0x0024;
    L_0x01fa:
        r5 = "item";
        r5 = r0.equals(r5);
        if (r5 != 0) goto L_0x0214;
    L_0x0202:
        r5 = "menu";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x020f;
    L_0x020a:
        r0 = 1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x020f:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x0214:
        r0 = r4.f8965h;
        if (r0 != 0) goto L_0x023d;
    L_0x0218:
        r0 = r4.f8952A;
        if (r0 == 0) goto L_0x0227;
    L_0x021c:
        r0 = r0.mo2446a();
        if (r0 == 0) goto L_0x0227;
    L_0x0222:
        r4.m5648a();
        goto L_0x0024;
    L_0x0227:
        r0 = 1;
        r4.f8965h = r0;
        r0 = r4.f8958a;
        r5 = r4.f8959b;
        r6 = r4.f8966i;
        r7 = r4.f8967j;
        r8 = r4.f8968k;
        r0 = r0.add(r5, r6, r7, r8);
        r4.m5650a(r0);
        goto L_0x0024;
    L_0x023d:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x0242:
        r2 = 0;
        r0 = 0;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x0249:
        r0 = r11.next();
        r1 = 1;
        if (r0 == r1) goto L_0x001c;
    L_0x0250:
        goto L_0x0009;
    L_0x0252:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Expecting menu, got ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0269:
        r0 = new java.lang.RuntimeException;
        r1 = "Unexpected end of document";
        r0.<init>(r1);
        throw r0;
    L_0x0271:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }
}
