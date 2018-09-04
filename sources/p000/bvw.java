package p000;

import android.content.ContentProvider.PipeDataWriter;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

/* renamed from: bvw */
final /* synthetic */ class bvw implements PipeDataWriter {
    /* renamed from: a */
    private final bvv f1633a;
    /* renamed from: b */
    private final String f1634b;
    /* renamed from: c */
    private final ByteArrayOutputStream f1635c;

    bvw(bvv bvv, String str, ByteArrayOutputStream byteArrayOutputStream) {
        this.f1633a = bvv;
        this.f1634b = str;
        this.f1635c = byteArrayOutputStream;
    }

    public final void writeDataToPipe(ParcelFileDescriptor parcelFileDescriptor, Uri uri, String str, Bundle bundle, Object obj) {
        bvv bvv = this.f1633a;
        String str2 = this.f1634b;
        ByteArrayOutputStream byteArrayOutputStream = this.f1635c;
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        ird ird = bvv.f11339a;
        String str3 = buk.f1597a;
        String valueOf = String.valueOf(fileDescriptor);
        int length = String.valueOf(str3).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 33) + String.valueOf(str2).length()) + String.valueOf(valueOf).length());
        stringBuilder.append(str3);
        stringBuilder.append(str2);
        stringBuilder.append("ByteArrayOutputStream.writeTo#fd=");
        stringBuilder.append(valueOf);
        ird.mo1903a(stringBuilder.toString());
        try {
            byteArrayOutputStream.writeTo(new BufferedOutputStream(new FileOutputStream(fileDescriptor)));
        } catch (Throwable e) {
            bli.m867b(buk.f1597a, "Error when writeTo the ParcelFileDescriptor", e);
        } finally {
            bvv.f11339a.mo1904b();
        }
    }
}
