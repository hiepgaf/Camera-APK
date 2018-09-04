package p000;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: aci */
public final class aci extends RuntimeException {
    public aci() {
        this("Failed to find image header parser.");
    }

    public aci(Class cls) {
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 227);
        stringBuilder.append("Failed to find result encoder for resource class: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        this(stringBuilder.toString());
    }

    public aci(Class cls, byte b) {
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
        stringBuilder.append("Failed to find source encoder for data class: ");
        stringBuilder.append(valueOf);
        this(stringBuilder.toString());
    }

    public aci(Class cls, Class cls2) {
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(valueOf2).length());
        stringBuilder.append("Failed to find any ModelLoaders for model: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" and data: ");
        stringBuilder.append(valueOf2);
        this(stringBuilder.toString());
    }

    public aci(Object obj) {
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 43);
        stringBuilder.append("Failed to find any ModelLoaders for model: ");
        stringBuilder.append(valueOf);
        this(stringBuilder.toString());
    }

    private aci(String str) {
        super(str);
    }

    public aci(String str, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
        stringBuilder.append(str);
        stringBuilder.append(" Parcel: pos=");
        stringBuilder.append(dataPosition);
        stringBuilder.append(" size=");
        stringBuilder.append(dataSize);
        super(stringBuilder.toString());
    }

    public aci(String str, Throwable th) {
        super(str, th);
    }
}
