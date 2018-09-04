package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: aef */
public final class aef extends aek {
    public aef(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo2585a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    /* renamed from: a */
    public final Class mo33a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2584a(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("FileDescriptor is null for: ");
        stringBuilder.append(valueOf);
        throw new FileNotFoundException(stringBuilder.toString());
    }
}
