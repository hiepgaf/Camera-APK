package p000;

import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: hok */
final class hok implements kov {
    /* renamed from: a */
    private final /* synthetic */ hoj f17961a;

    hok(hoj hoj) {
        this.f17961a = hoj;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m873e(hod.f21599a, "Fail to connect to GoogleApiClient");
    }

    public final /* synthetic */ void b_(Object obj) {
        int i = 0;
        hjk hjk = (hjk) obj;
        try {
            String str;
            igo igo = this.f17961a.f6413a;
            igj igj = igo.f7001b;
            ibf ibf = new ibf();
            List arrayList = new ArrayList();
            TreeSet treeSet = new TreeSet(igj.f6999a.keySet());
            ibg[] ibgArr = new ibg[treeSet.size()];
            Iterator it = treeSet.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                str = (String) it.next();
                Object a = igj.m3741a(str);
                ibgArr[i2] = new ibg();
                ibg ibg = ibgArr[i2];
                ibg.f21648a = str;
                ibg.f21649b = htl.m3399a(arrayList, a);
                i2++;
            }
            ibf.f21646a = ibgArr;
            ibe ibe = new ibe(ibf, arrayList);
            igo.f7000a.f20664b = ibr.m3656a(ibe.f6894a);
            int size = ibe.f6895b.size();
            while (i < size) {
                String num = Integer.toString(i);
                Asset asset = (Asset) ibe.f6895b.get(i);
                if (num == null) {
                    str = String.valueOf(asset);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
                    stringBuilder.append("asset key cannot be null: ");
                    stringBuilder.append(str);
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (asset == null) {
                    str = String.valueOf(num);
                    String str2 = "asset cannot be null: key=";
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str = str2.concat(str);
                    }
                    throw new IllegalStateException(str);
                } else {
                    if (Log.isLoggable("DataMap", 3)) {
                        String valueOf = String.valueOf(asset);
                        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(num).length() + 33) + String.valueOf(valueOf).length());
                        stringBuilder2.append("asPutDataRequest: adding asset: ");
                        stringBuilder2.append(num);
                        stringBuilder2.append(" ");
                        stringBuilder2.append(valueOf);
                        Log.d("DataMap", stringBuilder2.toString());
                    }
                    igo.f7000a.m15124a(num, asset);
                    i++;
                }
            }
            PutDataRequest putDataRequest = igo.f7000a;
            huq huq = hjk.f6271a.f17906a;
            huq.mo1846a(new igx(huq, putDataRequest));
            Runnable runnable = this.f17961a.f6414b;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable e) {
            bli.m867b(hod.f21599a, "Error setting data item", e);
        }
    }
}
