package p000;

import java.io.PushbackReader;
import java.io.Reader;

/* compiled from: PG */
/* renamed from: wl */
public final class wl extends PushbackReader {
    /* renamed from: a */
    private int f9460a = 0;
    /* renamed from: b */
    private int f9461b = 0;
    /* renamed from: c */
    private int f9462c = 0;

    public wl(Reader reader) {
        super(reader, 8);
    }

    public final int read(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[8];
        int i3 = 0;
        Object obj = 1;
        int i4 = i;
        int i5 = 0;
        while (obj != null && i3 < i2) {
            if (super.read(cArr2, i5, 1) == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                int i6;
                char c = cArr2[i5];
                switch (this.f9460a) {
                    case 0:
                        if (c == '&') {
                            this.f9460a = 1;
                            break;
                        }
                        break;
                    case 1:
                        if (c != '#') {
                            this.f9460a = 5;
                            break;
                        }
                        this.f9460a = 2;
                        break;
                    case 2:
                        if (c != 'x') {
                            if (c >= '0' && c <= '9') {
                                this.f9461b = Character.digit(c, 10);
                                this.f9462c = 1;
                                this.f9460a = 4;
                                break;
                            }
                            this.f9460a = 5;
                            break;
                        }
                        this.f9461b = 0;
                        this.f9462c = 0;
                        this.f9460a = 3;
                        break;
                        break;
                    case 3:
                        if (c >= '0') {
                            if (c > '9') {
                            }
                            this.f9461b = (this.f9461b << 4) + Character.digit(c, 16);
                            this.f9462c++;
                            if (this.f9462c > 4) {
                                this.f9460a = 5;
                                break;
                            }
                            this.f9460a = 3;
                            break;
                        }
                        if (c >= 'a') {
                            if (c > 'f') {
                            }
                            this.f9461b = (this.f9461b << 4) + Character.digit(c, 16);
                            this.f9462c++;
                            if (this.f9462c > 4) {
                                this.f9460a = 5;
                            } else {
                                this.f9460a = 3;
                            }
                        }
                        if (c < 'A' || c > 'F') {
                            if (c != ';' || !wp.m6159a((char) this.f9461b)) {
                                this.f9460a = 5;
                                break;
                            }
                            this.f9460a = 0;
                            c = (char) this.f9461b;
                            break;
                        }
                        this.f9461b = (this.f9461b << 4) + Character.digit(c, 16);
                        this.f9462c++;
                        if (this.f9462c > 4) {
                            this.f9460a = 3;
                        } else {
                            this.f9460a = 5;
                        }
                        break;
                    case 4:
                        if (c < '0' || c > '9') {
                            if (c != ';' || !wp.m6159a((char) this.f9461b)) {
                                this.f9460a = 5;
                                break;
                            }
                            this.f9460a = 0;
                            c = (char) this.f9461b;
                            break;
                        }
                        this.f9461b = (this.f9461b * 10) + Character.digit(c, 10);
                        this.f9462c++;
                        if (this.f9462c > 5) {
                            this.f9460a = 5;
                            break;
                        }
                        this.f9460a = 4;
                        break;
                        break;
                    case 5:
                        this.f9460a = 0;
                        break;
                }
                int i7 = this.f9460a;
                if (i7 == 0) {
                    if (wp.m6159a(c)) {
                        c = ' ';
                    }
                    i5 = i4 + 1;
                    cArr[i4] = c;
                    i6 = i3 + 1;
                    i3 = 0;
                } else if (i7 == 5) {
                    unread(cArr2, 0, i5 + 1);
                    i5 = i4;
                    i6 = i3;
                    i3 = 0;
                } else {
                    i6 = i5 + 1;
                    i5 = i4;
                    int i8 = i6;
                    i6 = i3;
                    i3 = i8;
                }
                i4 = i5;
                i5 = i3;
                i3 = i6;
            } else if (i5 > 0) {
                unread(cArr2, 0, i5);
                this.f9460a = 5;
                obj = 1;
                i5 = 0;
            }
        }
        return (i3 > 0 || obj != null) ? i3 : -1;
    }
}
