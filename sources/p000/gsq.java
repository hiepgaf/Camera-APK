package p000;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.provider.MediaStore.Images.Media;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: gsq */
public final class gsq {
    /* renamed from: a */
    private final kec f5668a = kec.m18025q();
    /* renamed from: b */
    private final /* synthetic */ gtr f5669b;

    public gsq(gtr gtr) {
        this.f5669b = gtr;
    }

    /* renamed from: a */
    public final void m2799a(ContentResolver contentResolver, String str, long j, kbg kbg, int i, String str2, int i2, int i3, ixx ixx) {
        File file = new File(str2);
        epy epy = new epy(this.f5669b.f17336b);
        epy.f4067a = file;
        epy.f4068b = kbg;
        epy a = epy.m1995a(ixx);
        a.f4069c = iqm.m4037a(i);
        m2797a(contentResolver, a.m1994a(new iqp(i2, i3)).m1993a(j).m1996a(str).m1992a().f4066a);
    }

    /* renamed from: a */
    private final synchronized void m2797a(ContentResolver contentResolver, ContentValues contentValues) {
        this.f5668a.mo2100a(contentResolver, ContentProviderOperation.newInsert(Media.EXTERNAL_CONTENT_URI).withValues(contentValues).build());
    }

    /* renamed from: a */
    public final synchronized List m2798a() {
        List arrayList;
        arrayList = new ArrayList();
        for (ContentResolver contentResolver : this.f5668a.mo2104n()) {
            Collection b = this.f5668a.mo3611b(contentResolver);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(b);
            try {
                for (ContentProviderResult contentProviderResult : contentResolver.applyBatch("media", arrayList2)) {
                    arrayList.add(contentProviderResult.uri);
                }
            } catch (RemoteException e) {
                String str = gtr.f17329a;
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
                stringBuilder.append("Failed to write MediaStore: ");
                stringBuilder.append(valueOf);
                bli.m866b(str, stringBuilder.toString());
            } catch (OperationApplicationException e2) {
                str = gtr.f17329a;
                valueOf = String.valueOf(e2);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
                stringBuilder.append("Write operation to MediaStore failed: ");
                stringBuilder.append(valueOf);
                bli.m866b(str, stringBuilder.toString());
            }
        }
        this.f5668a.mo3200c();
        return arrayList;
    }
}
