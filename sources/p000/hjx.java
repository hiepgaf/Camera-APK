package p000;

/* compiled from: PG */
/* renamed from: hjx */
public final class hjx implements Comparable {
    /* renamed from: a */
    private final int[] f6282a;

    public hjx(String str) {
        String valueOf;
        String str2;
        String[] split = str.split("\\.");
        if (split != null) {
            int length = split.length;
            if (length >= 2) {
                this.f6282a = new int[length];
                length = 0;
                while (length < split.length) {
                    try {
                        this.f6282a[length] = Integer.parseInt(split[length]);
                        length++;
                    } catch (NumberFormatException e) {
                        valueOf = String.valueOf(str);
                        str2 = "Unrecognized version name is found: ";
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                    }
                }
                return;
            }
        }
        valueOf = String.valueOf(str);
        str2 = "Unrecognized version name is found: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        throw new IllegalArgumentException(valueOf);
    }

    /* renamed from: a */
    public final int m3213a(hjx hjx) {
        int i = 0;
        while (true) {
            int[] iArr = this.f6282a;
            int length = iArr.length;
            if (i >= length) {
                break;
            }
            int[] iArr2 = hjx.f6282a;
            if (i >= iArr2.length) {
                break;
            }
            length = iArr[i];
            int i2 = iArr2[i];
            if (length > i2) {
                return 1;
            }
            if (length < i2) {
                return -1;
            }
            i++;
        }
        i = hjx.f6282a.length;
        int[] iArr3;
        if (length < i) {
            i = length;
            while (true) {
                iArr3 = hjx.f6282a;
                if (i >= iArr3.length) {
                    return 0;
                }
                length = iArr3[i];
                if (length > 0) {
                    return 1;
                }
                if (length < 0) {
                    return -1;
                }
                i++;
            }
        } else {
            while (true) {
                iArr3 = this.f6282a;
                if (i >= iArr3.length) {
                    return 0;
                }
                length = iArr3[i];
                if (length > 0) {
                    return 1;
                }
                if (length < 0) {
                    return -1;
                }
                i++;
            }
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m3213a((hjx) obj);
    }
}
