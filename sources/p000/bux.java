package p000;

import android.content.UriMatcher;

/* compiled from: PG */
/* renamed from: bux */
public final class bux implements buy {
    /* renamed from: a */
    private final bus f11314a;
    /* renamed from: b */
    private final UriMatcher f11315b;
    /* renamed from: c */
    private final bvm f11316c;

    public bux(bus bus, UriMatcher uriMatcher, bvm bvm) {
        this.f11314a = bus;
        this.f11315b = uriMatcher;
        this.f11316c = bvm;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final android.database.Cursor mo589a(android.net.Uri r14, java.lang.String[] r15) {
        /*
        r13 = this;
        r4 = 0;
        r0 = p000.buk.f1597a;
        r1 = java.lang.String.valueOf(r14);
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 20;
        r3.<init>(r2);
        r2 = "handle request: uri=";
        r3.append(r2);
        r3.append(r1);
        r1 = r3.toString();
        p000.bli.m863a(r0, r1);
        r0 = p000.jri.m13152b(r15);
        r0 = (java.lang.String[]) r0;
        r1 = r13.f11315b;
        r1 = r1.match(r14);
        switch(r1) {
            case 7: goto L_0x0059;
            case 8: goto L_0x0205;
            default: goto L_0x0034;
        };
    L_0x0034:
        r0 = new java.lang.IllegalArgumentException;
        r1 = java.lang.String.valueOf(r14);
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 18;
        r3.<init>(r2);
        r2 = "Unrecognized uri: ";
        r3.append(r2);
        r3.append(r1);
        r1 = r3.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0059:
        r1 = p000.buk.f1597a;
        r2 = "query the status of all processing media items";
        p000.bli.m863a(r1, r2);
        r1 = r13.f11314a;
        r1 = r1.mo575a();
    L_0x0066:
        r5 = new android.database.MatrixCursor;
        r5.<init>(r0);
        r6 = r1.iterator();
    L_0x006f:
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x025f;
    L_0x0075:
        r1 = r6.next();
        r2 = r1;
        r2 = (p000.buo) r2;
        r1 = r0.length;
        r7 = new java.lang.Object[r1];
        r3 = r4;
    L_0x0080:
        r1 = r0.length;
        if (r3 >= r1) goto L_0x0200;
    L_0x0083:
        r8 = r0[r3];
        r1 = r8.hashCode();
        switch(r1) {
            case -939545020: goto L_0x01f5;
            case -902562118: goto L_0x01ea;
            case 44324844: goto L_0x01df;
            case 1407525684: goto L_0x01d4;
            default: goto L_0x008c;
        };
    L_0x008c:
        r1 = -1;
    L_0x008d:
        switch(r1) {
            case 0: goto L_0x018d;
            case 1: goto L_0x0148;
            case 2: goto L_0x0106;
            case 3: goto L_0x00a7;
            default: goto L_0x0090;
        };
    L_0x0090:
        r1 = new java.lang.IllegalArgumentException;
        r0 = java.lang.String.valueOf(r8);
        r2 = "invalid projection: ";
        r3 = r0.length();
        if (r3 != 0) goto L_0x0259;
    L_0x009e:
        r0 = new java.lang.String;
        r0.<init>(r2);
    L_0x00a3:
        r1.<init>(r0);
        throw r1;
    L_0x00a7:
        r1 = r13.f11316c;
        r9 = r2.mo2708b();
        r10 = r9.mo1263b();
        r1 = r1.mo590a(r10);
        r9 = r1.mo2084b();
        r10 = "media store id is not found in locating its special type.";
        p000.jri.m13144a(r9, r10);
        r1 = r1.mo2081a();
        r1 = (p000.bve) r1;
        r1 = r1.m1007d();
        r7[r3] = r1;
        r1 = p000.buk.f1597a;
        r9 = r7[r3];
        r9 = java.lang.String.valueOf(r9);
        r10 = java.lang.String.valueOf(r8);
        r10 = r10.length();
        r11 = java.lang.String.valueOf(r9);
        r11 = r11.length();
        r12 = new java.lang.StringBuilder;
        r10 = r10 + 16;
        r10 = r10 + r11;
        r12.<init>(r10);
        r10 = "response: col[";
        r12.append(r10);
        r12.append(r8);
        r8 = "]=";
        r12.append(r8);
        r12.append(r9);
        r8 = r12.toString();
        p000.bli.m863a(r1, r8);
    L_0x0101:
        r1 = r3 + 1;
        r3 = r1;
        goto L_0x0080;
    L_0x0106:
        r1 = r2.mo2710d();
        r1 = java.lang.Integer.valueOf(r1);
        r7[r3] = r1;
        r1 = p000.buk.f1597a;
        r9 = r7[r3];
        r9 = java.lang.String.valueOf(r9);
        r10 = java.lang.String.valueOf(r8);
        r10 = r10.length();
        r11 = java.lang.String.valueOf(r9);
        r11 = r11.length();
        r12 = new java.lang.StringBuilder;
        r10 = r10 + 16;
        r10 = r10 + r11;
        r12.<init>(r10);
        r10 = "response: col[";
        r12.append(r10);
        r12.append(r8);
        r8 = "]=";
        r12.append(r8);
        r12.append(r9);
        r8 = r12.toString();
        p000.bli.m863a(r1, r8);
        goto L_0x0101;
    L_0x0148:
        r1 = r2.mo2709c();
        r1 = r1.f6483c;
        r1 = java.lang.Integer.valueOf(r1);
        r7[r3] = r1;
        r1 = p000.buk.f1597a;
        r9 = r7[r3];
        r9 = java.lang.String.valueOf(r9);
        r10 = java.lang.String.valueOf(r8);
        r10 = r10.length();
        r11 = java.lang.String.valueOf(r9);
        r11 = r11.length();
        r12 = new java.lang.StringBuilder;
        r10 = r10 + 16;
        r10 = r10 + r11;
        r12.<init>(r10);
        r10 = "response: col[";
        r12.append(r10);
        r12.append(r8);
        r8 = "]=";
        r12.append(r8);
        r12.append(r9);
        r8 = r12.toString();
        p000.bli.m863a(r1, r8);
        goto L_0x0101;
    L_0x018d:
        r1 = r2.mo2708b();
        r10 = r1.mo1263b();
        r1 = java.lang.Long.valueOf(r10);
        r7[r3] = r1;
        r1 = p000.buk.f1597a;
        r9 = r7[r3];
        r9 = java.lang.String.valueOf(r9);
        r10 = java.lang.String.valueOf(r8);
        r10 = r10.length();
        r11 = java.lang.String.valueOf(r9);
        r11 = r11.length();
        r12 = new java.lang.StringBuilder;
        r10 = r10 + 16;
        r10 = r10 + r11;
        r12.<init>(r10);
        r10 = "response: col[";
        r12.append(r10);
        r12.append(r8);
        r8 = "]=";
        r12.append(r8);
        r12.append(r9);
        r8 = r12.toString();
        p000.bli.m863a(r1, r8);
        goto L_0x0101;
    L_0x01d4:
        r1 = "media_store_id";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x008c;
    L_0x01dc:
        r1 = r4;
        goto L_0x008d;
    L_0x01df:
        r1 = "progress_percentage";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x008c;
    L_0x01e7:
        r1 = 2;
        goto L_0x008d;
    L_0x01ea:
        r1 = "special_type_id";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x008c;
    L_0x01f2:
        r1 = 3;
        goto L_0x008d;
    L_0x01f5:
        r1 = "progress_status";
        r1 = r8.equals(r1);
        if (r1 == 0) goto L_0x008c;
    L_0x01fd:
        r1 = 1;
        goto L_0x008d;
    L_0x0200:
        r5.addRow(r7);
        goto L_0x006f;
    L_0x0205:
        r6 = p000.blx.m7532a(r14);
        r1 = p000.buk.f1597a;
        r2 = new java.lang.StringBuilder;
        r3 = 78;
        r2.<init>(r3);
        r3 = "query the status of a processing media item: mediaStoreId=";
        r2.append(r3);
        r2.append(r6);
        r2 = r2.toString();
        p000.bli.m863a(r1, r2);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r1 = r13.f11314a;
        r1 = r1.mo576a(r6);
        r3 = r1.mo2084b();
        if (r3 == 0) goto L_0x0256;
    L_0x0232:
        r3 = p000.buk.f1597a;
        r5 = new java.lang.StringBuilder;
        r8 = 62;
        r5.<init>(r8);
        r8 = "the processing media exists: mediaStoreId=";
        r5.append(r8);
        r5.append(r6);
        r5 = r5.toString();
        p000.bli.m869c(r3, r5);
        r1 = r1.mo2081a();
        r1 = (p000.buo) r1;
        r2.add(r1);
        r1 = r2;
        goto L_0x0066;
    L_0x0256:
        r1 = r2;
        goto L_0x0066;
    L_0x0259:
        r0 = r2.concat(r0);
        goto L_0x00a3;
    L_0x025f:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: bux.a(android.net.Uri, java.lang.String[]):android.database.Cursor");
    }
}
