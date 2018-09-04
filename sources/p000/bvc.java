package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bvc */
public final class bvc implements buy {
    /* renamed from: a */
    private static final String f11319a = bli.m862a("SpeTpMetaReqHand");
    /* renamed from: b */
    private final Context f11320b;
    /* renamed from: c */
    private final String f11321c;

    public bvc(Context context, String str) {
        this.f11320b = context;
        this.f11321c = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final android.database.Cursor mo589a(android.net.Uri r11, java.lang.String[] r12) {
        /*
        r10 = this;
        r1 = 0;
        r4 = 0;
        if (r12 != 0) goto L_0x0006;
    L_0x0004:
        r0 = r1;
    L_0x0005:
        return r0;
    L_0x0006:
        r0 = p000.jri.m13152b(r12);
        r0 = (java.lang.String[]) r0;
        r2 = r11.getLastPathSegment();
        r2 = android.net.Uri.decode(r2);
        r2 = p000.bve.m1000a(r2);
        r3 = r2.mo2084b();
        if (r3 != 0) goto L_0x0059;
    L_0x001e:
        r2 = f11319a;
        r3 = java.lang.String.valueOf(r11);
        r0 = java.util.Arrays.toString(r0);
        r4 = java.lang.String.valueOf(r3);
        r4 = r4.length();
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r4 = r4 + 33;
        r4 = r4 + r5;
        r6.<init>(r4);
        r4 = "Illegal type from uri ";
        r6.append(r4);
        r6.append(r3);
        r3 = " including ";
        r6.append(r3);
        r6.append(r0);
        r0 = r6.toString();
        p000.bli.m873e(r2, r0);
        r0 = r1;
        goto L_0x0005;
    L_0x0059:
        r1 = r2.mo2081a();
        r1 = (p000.bve) r1;
        r3 = new android.database.MatrixCursor;
        r3.<init>(r0);
        r2 = p000.bve.NONE;
        if (r1 != r2) goto L_0x006a;
    L_0x0068:
        r0 = r3;
        goto L_0x0005;
    L_0x006a:
        r7 = r0.length;
        r8 = new java.lang.Object[r7];
        r5 = r4;
        r6 = r4;
    L_0x006f:
        if (r5 >= r7) goto L_0x01df;
    L_0x0071:
        r2 = r0[r5];
        r9 = r2.hashCode();
        switch(r9) {
            case -2067576059: goto L_0x01d4;
            case -1375007329: goto L_0x01c9;
            case -718092355: goto L_0x01bd;
            case -485675384: goto L_0x01b2;
            case -439465942: goto L_0x01a6;
            case -38747754: goto L_0x019a;
            case 221347946: goto L_0x018f;
            case 341019851: goto L_0x0184;
            case 939096685: goto L_0x0179;
            case 1651496089: goto L_0x016d;
            case 1932752118: goto L_0x0162;
            case 1971189053: goto L_0x0157;
            default: goto L_0x007a;
        };
    L_0x007a:
        r2 = -1;
    L_0x007b:
        switch(r2) {
            case 0: goto L_0x014d;
            case 1: goto L_0x0141;
            case 2: goto L_0x0135;
            case 3: goto L_0x0110;
            case 4: goto L_0x0106;
            case 5: goto L_0x0106;
            case 6: goto L_0x0106;
            case 7: goto L_0x00f0;
            case 8: goto L_0x00db;
            case 9: goto L_0x00c6;
            case 10: goto L_0x00a5;
            case 11: goto L_0x0084;
            default: goto L_0x007e;
        };
    L_0x007e:
        r6 = r6 + 1;
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x006f;
    L_0x0084:
        r2 = r1.m1006c();
        r2 = r2.mo2084b();
        if (r2 == 0) goto L_0x007e;
    L_0x008e:
        r9 = r10.f11320b;
        r2 = r1.m1006c();
        r2 = r2.mo2081a();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r2 = r9.getString(r2);
        r8[r6] = r2;
        goto L_0x007e;
    L_0x00a5:
        r2 = r1.m1004a();
        r2 = r2.mo2084b();
        if (r2 == 0) goto L_0x007e;
    L_0x00af:
        r9 = r10.f11320b;
        r2 = r1.m1004a();
        r2 = r2.mo2081a();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r2 = r9.getString(r2);
        r8[r6] = r2;
        goto L_0x007e;
    L_0x00c6:
        r2 = r1.m1009f();
        r2 = r2.mo2084b();
        if (r2 == 0) goto L_0x007e;
    L_0x00d0:
        r2 = r1.m1009f();
        r2 = r2.mo2081a();
        r8[r6] = r2;
        goto L_0x007e;
    L_0x00db:
        r2 = r1.m1008e();
        r2 = r2.mo2084b();
        if (r2 == 0) goto L_0x007e;
    L_0x00e5:
        r2 = r1.m1008e();
        r2 = r2.mo2081a();
        r8[r6] = r2;
        goto L_0x007e;
    L_0x00f0:
        r2 = r1.m1005b();
        r2 = r2.mo2084b();
        if (r2 == 0) goto L_0x007e;
    L_0x00fa:
        r2 = r1.m1005b();
        r2 = r2.mo2081a();
        r8[r6] = r2;
        goto L_0x007e;
    L_0x0106:
        r2 = r10.f11320b;
        r2 = r2.getPackageName();
        r8[r6] = r2;
        goto L_0x007e;
    L_0x0110:
        r2 = new android.net.Uri$Builder;
        r2.<init>();
        r9 = "content";
        r2 = r2.scheme(r9);
        r9 = r10.f11321c;
        r2 = r2.authority(r9);
        r9 = "icon";
        r2 = r2.appendPath(r9);
        r9 = r1.f1618k;
        r9 = java.lang.String.valueOf(r9);
        r2 = r2.appendPath(r9);
        r8[r6] = r2;
        goto L_0x007e;
    L_0x0135:
        r2 = r10.f11320b;
        r9 = r1.f1617j;
        r2 = r2.getString(r9);
        r8[r6] = r2;
        goto L_0x007e;
    L_0x0141:
        r2 = r10.f11320b;
        r9 = r1.f1616i;
        r2 = r2.getString(r9);
        r8[r6] = r2;
        goto L_0x007e;
    L_0x014d:
        r2 = r1.f1615h;
        r2 = r2.toString();
        r8[r6] = r2;
        goto L_0x007e;
    L_0x0157:
        r9 = "special_type_description";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x015f:
        r2 = 2;
        goto L_0x007b;
    L_0x0162:
        r9 = "configuration";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x016a:
        r2 = r4;
        goto L_0x007b;
    L_0x016d:
        r9 = "interact_activity_class_name";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x0175:
        r2 = 8;
        goto L_0x007b;
    L_0x0179:
        r9 = "edit_activity_class_name";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x0181:
        r2 = 7;
        goto L_0x007b;
    L_0x0184:
        r9 = "interact_activity_package_name";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x018c:
        r2 = 5;
        goto L_0x007b;
    L_0x018f:
        r9 = "special_type_name";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x0197:
        r2 = 1;
        goto L_0x007b;
    L_0x019a:
        r9 = "launch_activity_class_name";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x01a2:
        r2 = 9;
        goto L_0x007b;
    L_0x01a6:
        r9 = "editor_description";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x01ae:
        r2 = 10;
        goto L_0x007b;
    L_0x01b2:
        r9 = "launch_activity_package_name";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x01ba:
        r2 = 6;
        goto L_0x007b;
    L_0x01bd:
        r9 = "editor_promo";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x01c5:
        r2 = 11;
        goto L_0x007b;
    L_0x01c9:
        r9 = "edit_activity_package_name";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x01d1:
        r2 = 4;
        goto L_0x007b;
    L_0x01d4:
        r9 = "special_type_icon_uri";
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x007a;
    L_0x01dc:
        r2 = 3;
        goto L_0x007b;
    L_0x01df:
        r1 = f11319a;
        r0 = java.util.Arrays.toString(r8);
        r0 = java.lang.String.valueOf(r0);
        r2 = "metadata is found as ";
        r4 = r0.length();
        if (r4 != 0) goto L_0x01ff;
    L_0x01f1:
        r0 = new java.lang.String;
        r0.<init>(r2);
    L_0x01f6:
        p000.bli.m863a(r1, r0);
        r3.addRow(r8);
        r0 = r3;
        goto L_0x0005;
    L_0x01ff:
        r0 = r2.concat(r0);
        goto L_0x01f6;
        */
        throw new UnsupportedOperationException("Method not decompiled: bvc.a(android.net.Uri, java.lang.String[]):android.database.Cursor");
    }
}
