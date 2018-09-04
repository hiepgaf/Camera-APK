package p000;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat.MessagingStyle.Message;
import android.util.Log;

/* compiled from: PG */
/* renamed from: hd */
public final class hd {
    /* renamed from: f */
    public static final Mode f6003f = Mode.SRC_IN;
    /* renamed from: a */
    public final int f6004a;
    /* renamed from: b */
    public Object f6005b;
    /* renamed from: c */
    public int f6006c;
    /* renamed from: d */
    public int f6007d;
    /* renamed from: e */
    public ColorStateList f6008e = null;
    /* renamed from: g */
    public Mode f6009g = f6003f;

    private hd(int i) {
        this.f6004a = i;
    }

    /* renamed from: a */
    public static hd m3076a(Bundle bundle) {
        int i = bundle.getInt(Message.KEY_DATA_MIME_TYPE);
        hd hdVar = new hd(i);
        hdVar.f6006c = bundle.getInt("int1");
        hdVar.f6007d = bundle.getInt("int2");
        if (bundle.containsKey("tint_list")) {
            hdVar.f6008e = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            hdVar.f6009g = Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                hdVar.f6005b = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
                hdVar.f6005b = bundle.getString("obj");
                break;
            case 3:
                hdVar.f6005b = bundle.getByteArray("obj");
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                Log.w("IconCompat", stringBuilder.toString());
                return null;
        }
        return hdVar;
    }

    public final String toString() {
        if (this.f6004a == -1) {
            return String.valueOf(this.f6005b);
        }
        String str;
        StringBuilder stringBuilder = new StringBuilder("Icon(typ=");
        switch (this.f6004a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        stringBuilder.append(str);
        switch (this.f6004a) {
            case 1:
            case 5:
                stringBuilder.append(" size=");
                stringBuilder.append(((Bitmap) this.f6005b).getWidth());
                stringBuilder.append("x");
                stringBuilder.append(((Bitmap) this.f6005b).getHeight());
                break;
            case 2:
                stringBuilder.append(" pkg=");
                int i = this.f6004a;
                if (i == -1) {
                    str = ((Icon) this.f6005b).getResPackage();
                } else if (i != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("called getResPackage() on ");
                    stringBuilder.append(this);
                    throw new IllegalStateException(stringBuilder.toString());
                } else {
                    str = (String) this.f6005b;
                }
                stringBuilder.append(str);
                stringBuilder.append(" id=");
                Object[] objArr = new Object[1];
                i = this.f6004a;
                if (i == -1) {
                    i = ((Icon) this.f6005b).getResId();
                } else if (i != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("called getResId() on ");
                    stringBuilder.append(this);
                    throw new IllegalStateException(stringBuilder.toString());
                } else {
                    i = this.f6006c;
                }
                objArr[0] = Integer.valueOf(i);
                stringBuilder.append(String.format("0x%08x", objArr));
                break;
            case 3:
                stringBuilder.append(" len=");
                stringBuilder.append(this.f6006c);
                if (this.f6007d != 0) {
                    stringBuilder.append(" off=");
                    stringBuilder.append(this.f6007d);
                    break;
                }
                break;
            case 4:
                stringBuilder.append(" uri=");
                stringBuilder.append(this.f6005b);
                break;
        }
        if (this.f6008e != null) {
            stringBuilder.append(" tint=");
            stringBuilder.append(this.f6008e);
        }
        if (this.f6009g != f6003f) {
            stringBuilder.append(" mode=");
            stringBuilder.append(this.f6009g);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
