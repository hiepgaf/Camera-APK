package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: deh */
public final class deh extends dbx {
    /* renamed from: c */
    private static final String f20962c = bli.m862a("StateSavePic");
    /* renamed from: d */
    private final byte[] f20963d;

    public deh(dbx dbx, byte[] bArr) {
        super((bug) dbx);
        this.f20963d = bArr;
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2952e();
    }

    /* renamed from: e */
    public final dbx mo2952e() {
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        String str2;
        String valueOf2;
        StringBuilder stringBuilder2;
        Throwable e;
        Throwable th;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        kbg kbg = kau.f19138a;
        Bundle extras = ((dbu) m991d()).mo2906E().getExtras();
        if (extras != null) {
            kbg c = kbg.m4745c((Uri) extras.getParcelable("output"));
            extras.getString("crop");
            kbg = c;
        }
        if (kbg.mo2084b()) {
            try {
                outputStream2 = ((dbu) m991d()).mo2927c().getContentResolver().openOutputStream((Uri) kbg.mo2081a());
                try {
                    outputStream2.write(this.f20963d);
                    outputStream2.close();
                    str = f20962c;
                    valueOf = String.valueOf(kbg);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    stringBuilder.append("saved result to URI: ");
                    stringBuilder.append(valueOf);
                    bli.m871d(str, stringBuilder.toString());
                    dbx dcf = new dcf(this, kbg.m4745c(new Intent()));
                    if (outputStream2 == null) {
                        return dcf;
                    }
                    try {
                        outputStream2.close();
                        return dcf;
                    } catch (IOException e2) {
                        str2 = f20962c;
                        valueOf2 = String.valueOf(e2);
                        stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
                        stringBuilder2.append("Failed to close stream.");
                        stringBuilder2.append(valueOf2);
                        bli.m866b(str2, stringBuilder2.toString());
                        return dcf;
                    }
                } catch (IOException e3) {
                    e = e3;
                    try {
                        valueOf = f20962c;
                        valueOf2 = String.valueOf(kbg);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                        stringBuilder.append("exception while saving result to URI: ");
                        stringBuilder.append(valueOf2);
                        bli.m867b(valueOf, stringBuilder.toString(), e);
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e4) {
                                valueOf2 = f20962c;
                                str = String.valueOf(e4);
                                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str).length() + 23);
                                stringBuilder3.append("Failed to close stream.");
                                stringBuilder3.append(str);
                                bli.m866b(valueOf2, stringBuilder3.toString());
                            }
                        }
                        return new dcf(this, kau.f19138a);
                    } catch (Throwable e5) {
                        th = e5;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e42) {
                                str2 = f20962c;
                                str = String.valueOf(e42);
                                stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 23);
                                stringBuilder2.append("Failed to close stream.");
                                stringBuilder2.append(str);
                                bli.m866b(str2, stringBuilder2.toString());
                            }
                        }
                        throw th;
                    }
                } catch (Throwable e52) {
                    th = e52;
                    outputStream = outputStream2;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e52 = e6;
                valueOf = f20962c;
                valueOf2 = String.valueOf(kbg);
                stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                stringBuilder.append("exception while saving result to URI: ");
                stringBuilder.append(valueOf2);
                bli.m867b(valueOf, stringBuilder.toString(), e52);
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                return new dcf(this, kau.f19138a);
            } catch (Throwable e522) {
                th = e522;
                outputStream = outputStream2;
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
        }
        return new dcf(this, kbg.m4745c(new Intent("inline-data").putExtra("data", hjg.m3201a(this.f20963d))));
    }
}
