package p000;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: iio */
final class iio implements Callable {
    /* renamed from: a */
    private final /* synthetic */ ParcelFileDescriptor f7006a;
    /* renamed from: b */
    private final /* synthetic */ byte[] f7007b;

    iio(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f7006a = parcelFileDescriptor;
        this.f7007b = bArr;
    }

    /* renamed from: a */
    private final Boolean m3758a() {
        String valueOf;
        StringBuilder stringBuilder;
        String valueOf2;
        StringBuilder stringBuilder2;
        if (Log.isLoggable("WearableClient", 3)) {
            String valueOf3 = String.valueOf(this.f7006a);
            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
            stringBuilder3.append("processAssets: writing data to FD : ");
            stringBuilder3.append(valueOf3);
            Log.d("WearableClient", stringBuilder3.toString());
        }
        AutoCloseOutputStream autoCloseOutputStream = new AutoCloseOutputStream(this.f7006a);
        try {
            autoCloseOutputStream.write(this.f7007b);
            autoCloseOutputStream.flush();
            if (Log.isLoggable("WearableClient", 3)) {
                valueOf = String.valueOf(this.f7006a);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("processAssets: wrote data: ");
                stringBuilder.append(valueOf);
                Log.d("WearableClient", stringBuilder.toString());
            }
            Boolean valueOf4 = Boolean.valueOf(true);
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    valueOf2 = String.valueOf(this.f7006a);
                    stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                    stringBuilder2.append("processAssets: closing: ");
                    stringBuilder2.append(valueOf2);
                    Log.d("WearableClient", stringBuilder2.toString());
                }
                autoCloseOutputStream.close();
                return valueOf4;
            } catch (IOException e) {
                return valueOf4;
            }
        } catch (IOException e2) {
            valueOf = String.valueOf(this.f7006a);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
            stringBuilder.append("processAssets: writing data failed: ");
            stringBuilder.append(valueOf);
            Log.w("WearableClient", stringBuilder.toString());
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    valueOf = String.valueOf(this.f7006a);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    stringBuilder.append("processAssets: closing: ");
                    stringBuilder.append(valueOf);
                    Log.d("WearableClient", stringBuilder.toString());
                }
                autoCloseOutputStream.close();
            } catch (IOException e3) {
            }
            return Boolean.valueOf(false);
        } catch (Throwable th) {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    valueOf2 = String.valueOf(this.f7006a);
                    stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                    stringBuilder2.append("processAssets: closing: ");
                    stringBuilder2.append(valueOf2);
                    Log.d("WearableClient", stringBuilder2.toString());
                }
                autoCloseOutputStream.close();
            } catch (IOException e4) {
            }
            throw th;
        }
    }

    public final /* synthetic */ Object call() {
        return m3758a();
    }
}
