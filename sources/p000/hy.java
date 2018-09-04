package p000;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hy */
public final class hy {
    /* renamed from: a */
    public static final ib f6800a = ic.f6921c;
    /* renamed from: b */
    private static final String f6801b = Character.toString('‎');
    /* renamed from: c */
    private static final String f6802c = Character.toString('‏');
    /* renamed from: d */
    private static final hy f6803d = new hy(false, 2, f6800a);
    /* renamed from: e */
    private static final hy f6804e = new hy(true, 2, f6800a);
    /* renamed from: f */
    private final boolean f6805f;
    /* renamed from: g */
    private final int f6806g;
    /* renamed from: h */
    private final ib f6807h;

    private hy(boolean z, int i, ib ibVar) {
        this.f6805f = z;
        this.f6806g = i;
        this.f6807h = ibVar;
    }

    /* renamed from: b */
    private static int m3582b(CharSequence charSequence) {
        ia iaVar = new ia(charSequence);
        iaVar.f6863d = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = iaVar.f6863d;
            if (i4 < iaVar.f6862c && i == 0) {
                byte directionality;
                iaVar.f6864e = iaVar.f6860a.charAt(i4);
                if (Character.isHighSurrogate(iaVar.f6864e)) {
                    i4 = Character.codePointAt(iaVar.f6860a, iaVar.f6863d);
                    iaVar.f6863d += Character.charCount(i4);
                    directionality = Character.getDirectionality(i4);
                } else {
                    iaVar.f6863d++;
                    directionality = ia.m3597a(iaVar.f6864e);
                    boolean z = iaVar.f6861b;
                }
                switch (directionality) {
                    case (byte) 0:
                        if (i3 != 0) {
                            i = i3;
                            break;
                        }
                        return -1;
                    case (byte) 1:
                    case (byte) 2:
                        if (i3 != 0) {
                            i = i3;
                            break;
                        }
                        return 1;
                    case (byte) 9:
                        break;
                    case (byte) 14:
                    case (byte) 15:
                        i3++;
                        i2 = -1;
                        break;
                    case (byte) 16:
                    case (byte) 17:
                        i3++;
                        i2 = 1;
                        break;
                    case (byte) 18:
                        i3--;
                        i2 = 0;
                        break;
                    default:
                        i = i3;
                        break;
                }
            } else if (i == 0) {
                return 0;
            } else {
                if (i2 != 0) {
                    return i2;
                }
                while (iaVar.f6863d > 0) {
                    switch (iaVar.m3598a()) {
                        case (byte) 14:
                        case (byte) 15:
                            if (i != i3) {
                                i3--;
                                break;
                            }
                            return -1;
                        case (byte) 16:
                        case (byte) 17:
                            if (i != i3) {
                                i3--;
                                break;
                            }
                            return 1;
                        case (byte) 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
                return 0;
            }
        }
    }

    /* renamed from: c */
    private static int m3583c(CharSequence charSequence) {
        ia iaVar = new ia(charSequence);
        iaVar.f6863d = iaVar.f6862c;
        int i = 0;
        int i2 = 0;
        while (iaVar.f6863d > 0) {
            switch (iaVar.m3598a()) {
                case (byte) 0:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                        break;
                    }
                    return -1;
                case (byte) 1:
                case (byte) 2:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                        break;
                    }
                    return 1;
                case (byte) 9:
                    break;
                case (byte) 14:
                case (byte) 15:
                    if (i != i2) {
                        i2--;
                        break;
                    }
                    return -1;
                case (byte) 16:
                case (byte) 17:
                    if (i != i2) {
                        i2--;
                        break;
                    }
                    return 1;
                case (byte) 18:
                    i2++;
                    break;
                default:
                    if (i != 0) {
                        break;
                    }
                    i = i2;
                    break;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static hy m3580a() {
        hz hzVar = new hz();
        if (hzVar.f6828b != 2 || hzVar.f6829c != f6800a) {
            return new hy(hzVar.f6827a, hzVar.f6828b, hzVar.f6829c);
        }
        if (hzVar.f6827a) {
            return f6804e;
        }
        return f6803d;
    }

    /* renamed from: a */
    static boolean m3581a(Locale locale) {
        return ig.m3738a(locale) == 1;
    }

    /* renamed from: a */
    public final CharSequence m3584a(CharSequence charSequence) {
        ib ibVar = this.f6807h;
        if (charSequence == null) {
            return null;
        }
        boolean a;
        CharSequence charSequence2;
        boolean a2 = ibVar.m3607a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f6806g & 2) != 0) {
            if (a2) {
                ibVar = ic.f6920b;
            } else {
                ibVar = ic.f6919a;
            }
            a = ibVar.m3607a(charSequence, charSequence.length());
            if (!this.f6805f && (a || hy.m3582b(charSequence) == 1)) {
                charSequence2 = f6801b;
            } else if (!this.f6805f || (a && hy.m3582b(charSequence) != -1)) {
                charSequence2 = "";
            } else {
                charSequence2 = f6802c;
            }
            spannableStringBuilder.append(charSequence2);
        }
        if (a2 != this.f6805f) {
            char c;
            if (a2) {
                c = '‫';
            } else {
                c = '‪';
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('‬');
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (a2) {
            ibVar = ic.f6920b;
        } else {
            ibVar = ic.f6919a;
        }
        a = ibVar.m3607a(charSequence, charSequence.length());
        if (!this.f6805f && (a || hy.m3583c(charSequence) == 1)) {
            charSequence2 = f6801b;
        } else if (!this.f6805f || (a && hy.m3583c(charSequence) != -1)) {
            charSequence2 = "";
        } else {
            charSequence2 = f6802c;
        }
        spannableStringBuilder.append(charSequence2);
        return spannableStringBuilder;
    }
}
