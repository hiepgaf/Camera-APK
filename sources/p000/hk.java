package p000;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hk */
public final class hk {
    /* renamed from: a */
    public static final io f6284a = new io(16);
    /* renamed from: b */
    public static final Object f6285b = new Object();
    /* renamed from: c */
    public static final iz f6286c = new iz();
    /* renamed from: d */
    private static final hs f6287d = new hs("fonts");
    /* renamed from: e */
    private static final Comparator f6288e = new ho();

    /* renamed from: a */
    private static hq[] m3219a(Context context, hj hjVar, String str) {
        Throwable th;
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme("content").authority(str).build();
        Uri build2 = new Builder().scheme("content").authority(str).appendPath("file").build();
        try {
            ArrayList arrayList2;
            Cursor query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{hjVar.f6260c}, null, null);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        int columnIndex = query.getColumnIndex("result_code");
                        arrayList2 = new ArrayList();
                        int columnIndex2 = query.getColumnIndex("_id");
                        int columnIndex3 = query.getColumnIndex("file_id");
                        int columnIndex4 = query.getColumnIndex("font_ttc_index");
                        int columnIndex5 = query.getColumnIndex("font_weight");
                        int columnIndex6 = query.getColumnIndex("font_italic");
                        while (query.moveToNext()) {
                            int i;
                            int i2;
                            Uri withAppendedId;
                            int i3;
                            boolean z;
                            if (columnIndex != -1) {
                                i = query.getInt(columnIndex);
                            } else {
                                i = 0;
                            }
                            if (columnIndex4 != -1) {
                                i2 = query.getInt(columnIndex4);
                            } else {
                                i2 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                            }
                            if (columnIndex5 != -1) {
                                i3 = query.getInt(columnIndex5);
                            } else {
                                i3 = 400;
                            }
                            if (columnIndex6 == -1) {
                                z = false;
                            } else if (query.getInt(columnIndex6) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList2.add(new hq(withAppendedId, i2, i3, z, i));
                        }
                    } else {
                        arrayList2 = arrayList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                }
            } else {
                arrayList2 = arrayList;
            }
            if (query != null) {
                query.close();
            }
            return (hq[]) arrayList2.toArray(new hq[0]);
        } catch (Throwable th22) {
            th = th22;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    static hr m3217a(Context context, hj hjVar, int i) {
        int i2 = -3;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = hjVar.f6258a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            StringBuilder stringBuilder;
            if (resolveContentProvider == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("No package found for authority: ");
                stringBuilder.append(str);
                throw new NameNotFoundException(stringBuilder.toString());
            } else if (resolveContentProvider.packageName.equals(hjVar.f6259b)) {
                int i3;
                List a;
                ProviderInfo providerInfo;
                hp hpVar;
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                List arrayList = new ArrayList();
                for (Signature toByteArray : signatureArr) {
                    arrayList.add(toByteArray.toByteArray());
                }
                Collections.sort(arrayList, f6288e);
                List list = hjVar.f6261d;
                if (list == null) {
                    a = ll.m5507a(resources, 0);
                } else {
                    a = list;
                }
                for (int i4 = 0; i4 < a.size(); i4++) {
                    Object obj;
                    List arrayList2 = new ArrayList((Collection) a.get(i4));
                    Collections.sort(arrayList2, f6288e);
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                                obj = null;
                                break;
                            }
                        }
                        i3 = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        providerInfo = resolveContentProvider;
                        break;
                    }
                }
                providerInfo = null;
                if (providerInfo == null) {
                    hpVar = new hp(1, null);
                } else {
                    hpVar = new hp(0, hk.m3219a(context, hjVar, providerInfo.authority));
                }
                int i6 = hpVar.f6420a;
                if (i6 == 0) {
                    Typeface a2 = gw.f5716a.mo1665a(context, hpVar.f6421b, i);
                    return new hr(a2, a2 != null ? 0 : -3);
                }
                if (i6 == 1) {
                    i2 = -2;
                }
                return new hr(null, i2);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Found content provider ");
                stringBuilder.append(str);
                stringBuilder.append(", but package was not ");
                stringBuilder.append(hjVar.f6259b);
                throw new NameNotFoundException(stringBuilder.toString());
            }
        } catch (NameNotFoundException e) {
            return new hr(null, -1);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static android.graphics.Typeface m3216a(android.content.Context r6, p000.hj r7, p000.mz r8, android.os.Handler r9, boolean r10, int r11, int r12) {
        /*
        r2 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r7.f6262e;
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0.append(r12);
        r3 = r0.toString();
        r0 = f6284a;
        r0 = r0.m3903a(r3);
        r0 = (android.graphics.Typeface) r0;
        if (r0 == 0) goto L_0x0028;
    L_0x0021:
        if (r8 == 0) goto L_0x0026;
    L_0x0023:
        r8.m14127a(r0);
    L_0x0026:
        r2 = r0;
    L_0x0027:
        return r2;
    L_0x0028:
        if (r10 == 0) goto L_0x0043;
    L_0x002a:
        r0 = -1;
        if (r11 != r0) goto L_0x0043;
    L_0x002d:
        r0 = p000.hk.m3217a(r6, r7, r12);
        if (r8 == 0) goto L_0x003c;
    L_0x0033:
        r1 = r0.f6465b;
        if (r1 != 0) goto L_0x003f;
    L_0x0037:
        r1 = r0.f6464a;
        r8.m14128a(r1, r9);
    L_0x003c:
        r2 = r0.f6464a;
        goto L_0x0027;
    L_0x003f:
        r8.m14126a(r1, r9);
        goto L_0x003c;
    L_0x0043:
        r4 = new hl;
        r4.<init>(r6, r7, r12, r3);
        if (r10 == 0) goto L_0x0055;
    L_0x004a:
        r0 = f6287d;	 Catch:{ InterruptedException -> 0x00a1 }
        r0 = r0.m3329a(r4, r11);	 Catch:{ InterruptedException -> 0x00a1 }
        r0 = (p000.hr) r0;	 Catch:{ InterruptedException -> 0x00a1 }
        r2 = r0.f6464a;	 Catch:{ InterruptedException -> 0x00a1 }
        goto L_0x0027;
    L_0x0055:
        if (r8 == 0) goto L_0x009f;
    L_0x0057:
        r0 = new hm;
        r0.<init>(r8, r9);
        r1 = r0;
    L_0x005d:
        r5 = f6285b;
        monitor-enter(r5);
        r0 = f6286c;	 Catch:{ all -> 0x0077 }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x0077 }
        if (r0 == 0) goto L_0x007a;
    L_0x0068:
        if (r1 == 0) goto L_0x0075;
    L_0x006a:
        r0 = f6286c;	 Catch:{ all -> 0x0077 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0077 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x0077 }
        r0.add(r1);	 Catch:{ all -> 0x0077 }
    L_0x0075:
        monitor-exit(r5);	 Catch:{ all -> 0x0077 }
        goto L_0x0027;
    L_0x0077:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0077 }
        throw r0;
    L_0x007a:
        if (r1 == 0) goto L_0x0089;
    L_0x007c:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0077 }
        r0.<init>();	 Catch:{ all -> 0x0077 }
        r0.add(r1);	 Catch:{ all -> 0x0077 }
        r1 = f6286c;	 Catch:{ all -> 0x0077 }
        r1.put(r3, r0);	 Catch:{ all -> 0x0077 }
    L_0x0089:
        monitor-exit(r5);	 Catch:{ all -> 0x0077 }
        r0 = f6287d;
        r1 = new hn;
        r1.<init>(r3);
        r3 = new android.os.Handler;
        r3.<init>();
        r5 = new hu;
        r5.<init>(r4, r3, r1);
        r0.m3330a(r5);
        goto L_0x0027;
    L_0x009f:
        r1 = r2;
        goto L_0x005d;
    L_0x00a1:
        r0 = move-exception;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.a(android.content.Context, hj, mz, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Map m3218a(Context context, hq[] hqVarArr, CancellationSignal cancellationSignal) {
        Map hashMap = new HashMap();
        for (hq hqVar : hqVarArr) {
            if (hqVar.f6444e == 0) {
                Uri uri = hqVar.f6440a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, ha.m2967a(context, null, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
