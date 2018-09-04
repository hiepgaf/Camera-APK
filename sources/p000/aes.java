package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* renamed from: aes */
final class aes {
    /* renamed from: a */
    private static final aen f350a = new aen();
    /* renamed from: b */
    private final aer f351b;
    /* renamed from: c */
    private final agu f352c;
    /* renamed from: d */
    private final ContentResolver f353d;
    /* renamed from: e */
    private final List f354e;

    private aes(List list, aer aer, agu agu, ContentResolver contentResolver) {
        this.f351b = aer;
        this.f352c = agu;
        this.f353d = contentResolver;
        this.f354e = list;
    }

    aes(List list, aer aer, agu agu, ContentResolver contentResolver, byte b) {
        this(list, aer, agu, contentResolver);
    }

    /* renamed from: a */
    final int m194a(Uri uri) {
        Throwable e;
        String valueOf;
        StringBuilder stringBuilder;
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        try {
            inputStream3 = this.f353d.openInputStream(uri);
            try {
                int a = adk.m162a(this.f354e, inputStream3, this.f352c);
                if (inputStream3 == null) {
                    return a;
                }
                try {
                    inputStream3.close();
                    return a;
                } catch (IOException e2) {
                    return a;
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                        valueOf = String.valueOf(uri);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                        stringBuilder.append("Failed to open uri: ");
                        stringBuilder.append(valueOf);
                        Log.d("ThumbStreamOpener", stringBuilder.toString(), e);
                    }
                    if (inputStream3 != null) {
                        try {
                            inputStream3.close();
                        } catch (IOException e4) {
                        }
                    }
                    return -1;
                } catch (Throwable e5) {
                    inputStream = inputStream3;
                    th = e5;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e6) {
                        }
                    }
                    throw th;
                }
            } catch (NullPointerException e7) {
                e5 = e7;
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    valueOf = String.valueOf(uri);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    stringBuilder.append("Failed to open uri: ");
                    stringBuilder.append(valueOf);
                    Log.d("ThumbStreamOpener", stringBuilder.toString(), e5);
                }
                if (inputStream3 != null) {
                    inputStream3.close();
                }
                return -1;
            } catch (Throwable e52) {
                inputStream = inputStream3;
                th = e52;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (IOException e8) {
            e52 = e8;
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                valueOf = String.valueOf(uri);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("Failed to open uri: ");
                stringBuilder.append(valueOf);
                Log.d("ThumbStreamOpener", stringBuilder.toString(), e52);
            }
            if (inputStream3 != null) {
                inputStream3.close();
            }
            return -1;
        } catch (NullPointerException e9) {
            e52 = e9;
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                valueOf = String.valueOf(uri);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("Failed to open uri: ");
                stringBuilder.append(valueOf);
                Log.d("ThumbStreamOpener", stringBuilder.toString(), e52);
            }
            if (inputStream3 != null) {
                inputStream3.close();
            }
            return -1;
        } catch (Throwable e522) {
            inputStream = inputStream3;
            th = e522;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    private final String m193c(Uri uri) {
        Cursor a = this.f351b.mo34a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    String string = a.getString(0);
                    return string;
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }

    /* renamed from: b */
    public final InputStream m195b(Uri uri) {
        InputStream inputStream = null;
        Object obj = null;
        Object c = m193c(uri);
        if (!TextUtils.isEmpty(c)) {
            File file = new File(c);
            if (file.exists() && file.length() > 0) {
                obj = 1;
            }
            if (obj != null) {
                Uri fromFile = Uri.fromFile(file);
                try {
                    inputStream = this.f353d.openInputStream(fromFile);
                } catch (Throwable e) {
                    String valueOf = String.valueOf(uri);
                    String valueOf2 = String.valueOf(fromFile);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length());
                    stringBuilder.append("NPE opening uri: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" -> ");
                    stringBuilder.append(valueOf2);
                    throw ((FileNotFoundException) new FileNotFoundException(stringBuilder.toString()).initCause(e));
                }
            }
        }
        return inputStream;
    }
}
