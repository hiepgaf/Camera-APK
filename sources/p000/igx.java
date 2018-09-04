package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.zzch;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.FutureTask;

/* renamed from: igx */
public final class igx extends iiw {
    /* renamed from: a */
    private final /* synthetic */ PutDataRequest f23546a;

    public igx(huq huq, PutDataRequest putDataRequest) {
        this.f23546a = putDataRequest;
        super(huq);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo3466a(hul hul) {
        iin iin = (iin) hul;
        PutDataRequest putDataRequest = this.f23546a;
        for (Entry value : putDataRequest.m15125a().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.f20649a == null && asset.f20650b == null && asset.f20651c == null && asset.f20652d == null) {
                String valueOf = String.valueOf(putDataRequest.f20663a);
                String valueOf2 = String.valueOf(asset);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length());
                stringBuilder.append("Put for ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" contains invalid asset: ");
                stringBuilder.append(valueOf2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        PutDataRequest a = PutDataRequest.m15122a(putDataRequest.f20663a);
        a.f20664b = putDataRequest.f20664b;
        if (putDataRequest.f20665c == 0) {
            a.f20665c = 0;
        }
        List arrayList = new ArrayList();
        for (Entry value2 : putDataRequest.m15125a().entrySet()) {
            Asset asset2 = (Asset) value2.getValue();
            if (asset2.f20649a != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(asset2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        int length = String.valueOf(valueOf3).length();
                        StringBuilder stringBuilder2 = new StringBuilder(((length + 61) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length());
                        stringBuilder2.append("processAssets: replacing data with FD in asset: ");
                        stringBuilder2.append(valueOf3);
                        stringBuilder2.append(" read:");
                        stringBuilder2.append(valueOf4);
                        stringBuilder2.append(" write:");
                        stringBuilder2.append(valueOf5);
                        Log.d("WearableClient", stringBuilder2.toString());
                    }
                    a.m15124a((String) value2.getKey(), Asset.m15120a(createPipe[0]));
                    Runnable futureTask = new FutureTask(new iio(createPipe[1], asset2.f20649a));
                    arrayList.add(futureTask);
                    iin.f23351l.submit(futureTask);
                } catch (Throwable e) {
                    valueOf = String.valueOf(putDataRequest);
                    StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf).length() + 60);
                    stringBuilder3.append("Unable to create ParcelFileDescriptor for asset in request: ");
                    stringBuilder3.append(valueOf);
                    throw new IllegalStateException(stringBuilder3.toString(), e);
                }
            } else if (asset2.f20652d == null) {
                a.m15124a((String) value2.getKey(), asset2);
            } else {
                try {
                    a.m15124a((String) value2.getKey(), Asset.m15120a(iin.f6718c.getContentResolver().openFileDescriptor(asset2.f20652d, "r")));
                } catch (FileNotFoundException e2) {
                    new iim(this, arrayList).mo3479a(new zzch(4005, null));
                    valueOf2 = String.valueOf(asset2.f20652d);
                    StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                    stringBuilder4.append("Couldn't resolve asset URI: ");
                    stringBuilder4.append(valueOf2);
                    Log.w("WearableClient", stringBuilder4.toString());
                    return;
                }
            }
        }
        ((iht) iin.m3526p()).mo1867a(new iim(this, arrayList), a);
    }

    /* renamed from: a */
    public final /* synthetic */ hux mo3119a(Status status) {
        return new igh(status);
    }
}
