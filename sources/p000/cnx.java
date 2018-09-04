package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: cnx */
final class cnx extends izx {
    /* renamed from: a */
    private final File f22708a;

    cnx(File file) {
        this.f22708a = file;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final /* synthetic */ void mo3396b(java.lang.Object r8, java.lang.Object r9) {
        /*
        r7 = this;
        r8 = (com.google.android.libraries.smartburst.buffers.FeatureTable) r8;
        r9 = (p000.jxm) r9;
        r0 = r7.f22708a;
        r1 = new java.io.File;
        r2 = "feature_table.bin";
        r1.<init>(r0, r2);
        r1 = p000.jqk.m13077a(r1);	 Catch:{ IOException -> 0x006b }
        r2 = new java.io.DataOutputStream;	 Catch:{ all -> 0x0064 }
        r2.<init>(r1);	 Catch:{ all -> 0x0064 }
        r0 = 1984295711; // 0x7645f31f float:1.0037242E33 double:9.80372342E-315;
        r2.writeInt(r0);	 Catch:{ all -> 0x0064 }
        r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r2.writeInt(r0);	 Catch:{ all -> 0x0064 }
        r3 = new jlh;	 Catch:{ all -> 0x0064 }
        r3.<init>();	 Catch:{ all -> 0x0064 }
        r0 = r8.getRowCount();	 Catch:{ all -> 0x0064 }
        r3.m4536a(r0);	 Catch:{ all -> 0x0064 }
        r0 = r8.getFrameRate();	 Catch:{ all -> 0x0064 }
        r4 = r3.f7912a;	 Catch:{ all -> 0x0064 }
        r4.writeFloat(r0);	 Catch:{ all -> 0x0064 }
        r4 = r8.getEarliestTimestamp();	 Catch:{ all -> 0x0064 }
        r0 = r3.f7912a;	 Catch:{ all -> 0x0064 }
        r0.writeLong(r4);	 Catch:{ all -> 0x0064 }
        r0 = r8.getFeatureTypes();	 Catch:{ all -> 0x0064 }
        r0 = r0.size();	 Catch:{ all -> 0x0064 }
        r3.m4536a(r0);	 Catch:{ all -> 0x0064 }
        r0 = r8.getFeatureTypes();	 Catch:{ all -> 0x0064 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0064 }
    L_0x0052:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0064 }
        if (r0 == 0) goto L_0x0074;
    L_0x0058:
        r0 = r4.next();	 Catch:{ all -> 0x0064 }
        r0 = (p000.jza) r0;	 Catch:{ all -> 0x0064 }
        r0 = r0.f8131z;	 Catch:{ all -> 0x0064 }
        r3.m4536a(r0);	 Catch:{ all -> 0x0064 }
        goto L_0x0052;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0066 }
    L_0x0066:
        r2 = move-exception;
        p000.jlf.m4533a(r0, r1);	 Catch:{ IOException -> 0x006b }
        throw r2;	 Catch:{ IOException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = "Could not write feature table";
        r1.<init>(r2, r0);
        throw r1;
    L_0x0074:
        r0 = r3.f7912a;	 Catch:{ all -> 0x0064 }
        r0 = r0.size();	 Catch:{ all -> 0x0064 }
        r4 = r3.f7914c;	 Catch:{ all -> 0x0064 }
        r0 = r0 - r4;
        r2.writeInt(r0);	 Catch:{ all -> 0x0064 }
        r0 = r3.f7913b;	 Catch:{ all -> 0x0064 }
        r0 = r0.toByteArray();	 Catch:{ all -> 0x0064 }
        r2.write(r0);	 Catch:{ all -> 0x0064 }
        r0 = r8.getFeatureTypes();	 Catch:{ all -> 0x0064 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0064 }
    L_0x0091:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0064 }
        if (r0 == 0) goto L_0x00ba;
    L_0x0097:
        r0 = r3.next();	 Catch:{ all -> 0x0064 }
        r0 = (p000.jza) r0;	 Catch:{ all -> 0x0064 }
        r4 = r8.getColumnValues(r0);	 Catch:{ all -> 0x0064 }
        r5 = r0.f8131z;	 Catch:{ all -> 0x0064 }
        r2.writeInt(r5);	 Catch:{ all -> 0x0064 }
        r0 = r0.f8127A;	 Catch:{ all -> 0x0064 }
        r2.writeInt(r0);	 Catch:{ all -> 0x0064 }
        r5 = r4.length;	 Catch:{ all -> 0x0064 }
        r2.writeInt(r5);	 Catch:{ all -> 0x0064 }
        r0 = 0;
    L_0x00b0:
        if (r0 >= r5) goto L_0x0091;
    L_0x00b2:
        r6 = r4[r0];	 Catch:{ all -> 0x0064 }
        r6.writeValues(r2);	 Catch:{ all -> 0x0064 }
        r0 = r0 + 1;
        goto L_0x00b0;
    L_0x00ba:
        r0 = 0;
        p000.jlf.m4533a(r0, r1);	 Catch:{ IOException -> 0x006b }
        r0 = r7.f22708a;
        r1 = new java.io.File;
        r2 = "metadatastore.bin";
        r1.<init>(r0, r2);
        r2 = new java.io.DataOutputStream;	 Catch:{ IOException -> 0x0120 }
        r0 = p000.jqk.m13077a(r1);	 Catch:{ IOException -> 0x0120 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0120 }
        r0 = 1;
        r2.writeInt(r0);	 Catch:{ all -> 0x0119 }
        r0 = r9.m4671a();	 Catch:{ all -> 0x0119 }
        r1 = r0.size();	 Catch:{ all -> 0x0119 }
        r2.writeInt(r1);	 Catch:{ all -> 0x0119 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0119 }
    L_0x00e3:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0119 }
        if (r0 == 0) goto L_0x0129;
    L_0x00e9:
        r0 = r3.next();	 Catch:{ all -> 0x0119 }
        r0 = (p000.jxa) r0;	 Catch:{ all -> 0x0119 }
        r1 = r0.f8067w;	 Catch:{ all -> 0x0119 }
        r1 = r1.keySet();	 Catch:{ all -> 0x0119 }
        r4 = r1.size();	 Catch:{ all -> 0x0119 }
        r2.writeInt(r4);	 Catch:{ all -> 0x0119 }
        r4 = r1.iterator();	 Catch:{ all -> 0x0119 }
    L_0x0100:
        r1 = r4.hasNext();	 Catch:{ all -> 0x0119 }
        if (r1 == 0) goto L_0x00e3;
    L_0x0106:
        r1 = r4.next();	 Catch:{ all -> 0x0119 }
        r1 = (p000.jxi) r1;	 Catch:{ all -> 0x0119 }
        r5 = r1.f8068a;	 Catch:{ all -> 0x0119 }
        r2.writeUTF(r5);	 Catch:{ all -> 0x0119 }
        r5 = r0.m4665a(r1);	 Catch:{ all -> 0x0119 }
        r1.mo2061a(r5, r2);	 Catch:{ all -> 0x0119 }
        goto L_0x0100;
    L_0x0119:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x011b }
    L_0x011b:
        r1 = move-exception;
        p000.jli.m12945a(r0, r2);	 Catch:{ IOException -> 0x0120 }
        throw r1;	 Catch:{ IOException -> 0x0120 }
    L_0x0120:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = "Could not save MetadataStore";
        r1.<init>(r2, r0);
        throw r1;
    L_0x0129:
        r0 = 0;
        p000.jli.m12945a(r0, r2);	 Catch:{ IOException -> 0x0120 }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: cnx.b(java.lang.Object, java.lang.Object):void");
    }
}
