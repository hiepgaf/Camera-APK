package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: eln */
public final class eln implements Serializable {
    /* renamed from: a */
    public String f3935a;
    /* renamed from: b */
    public gkr f3936b;
    /* renamed from: c */
    public String f3937c;
    /* renamed from: d */
    public String f3938d;
    /* renamed from: e */
    public String f3939e;
    /* renamed from: f */
    public String f3940f;
    /* renamed from: g */
    public int f3941g;

    public final String toString() {
        String str = this.f3935a;
        String str2 = this.f3937c;
        String str3 = this.f3938d;
        String str4 = this.f3939e;
        String str5 = this.f3940f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 75) + length2) + length3) + String.valueOf(str4).length()) + String.valueOf(str5).length());
        stringBuilder.append("Session ID : ");
        stringBuilder.append(str);
        stringBuilder.append("\n SessionDir : ");
        stringBuilder.append(str2);
        stringBuilder.append("\n thumbnail : ");
        stringBuilder.append(str3);
        stringBuilder.append("\n metadata : ");
        stringBuilder.append(str4);
        stringBuilder.append("\n orientationFile : ");
        stringBuilder.append(str5);
        return stringBuilder.toString();
    }
}
