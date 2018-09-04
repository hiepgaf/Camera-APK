package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import p000.htl;
import p000.hxy;

public class FileTeleporter extends zza {
    public static final Creator CREATOR = new hxy();
    /* renamed from: a */
    public File f20570a;
    /* renamed from: b */
    private ParcelFileDescriptor f20571b;
    /* renamed from: c */
    private final String f20572c;
    /* renamed from: d */
    private final String f20573d;

    public FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.f20571b = parcelFileDescriptor;
        this.f20572c = str;
        this.f20573d = str2;
    }

    /* renamed from: a */
    private static void m15112a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f20571b == null) {
            Closeable dataOutputStream = new DataOutputStream(m15111a());
            Object[] objArr = null;
            try {
                dataOutputStream.writeInt(objArr.length);
                dataOutputStream.writeUTF(this.f20572c);
                dataOutputStream.writeUTF(this.f20573d);
                dataOutputStream.write(null);
                m15112a(dataOutputStream);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m15112a(dataOutputStream);
            }
        }
        int b = htl.m3430b(parcel, 20293);
        htl.m3411a(parcel, 2, this.f20571b, i);
        htl.m3412a(parcel, 3, this.f20572c);
        htl.m3412a(parcel, 4, this.f20573d);
        htl.m3439c(parcel, b);
    }

    /* renamed from: a */
    private final FileOutputStream m15111a() {
        File file = this.f20570a;
        if (file == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            file = File.createTempFile("teleporter", ".tmp", file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.f20571b = ParcelFileDescriptor.open(file, 268435456);
                file.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted.");
            }
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not create temporary file:", e2);
        }
    }
}
