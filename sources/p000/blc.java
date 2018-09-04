package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.ParcelFileDescriptor;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: blc */
public final class blc {
    /* renamed from: a */
    public final Context f1261a;

    static {
        bli.m862a("IconLoader");
    }

    public blc(Context context) {
        this.f1261a = context;
    }

    /* renamed from: a */
    public static ParcelFileDescriptor m860a(Bitmap bitmap, CompressFormat compressFormat) {
        ParcelFileDescriptor parcelFileDescriptor;
        OutputStream bufferedOutputStream;
        Object e;
        OutputStream outputStream;
        String message;
        Throwable th;
        OutputStream outputStream2;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor3 = createPipe[0];
            parcelFileDescriptor = createPipe[1];
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
            } catch (IOException e2) {
                e = e2;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e4) {
                        e = e4;
                    }
                }
                message = ((IOException) jri.m13152b(e)).getMessage();
                if (message != null) {
                    throw new FileNotFoundException(message);
                }
                throw new FileNotFoundException();
            } catch (Throwable th2) {
                th = th2;
                outputStream2 = null;
                parcelFileDescriptor2 = parcelFileDescriptor;
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                    } catch (IOException e5) {
                    }
                }
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
            try {
                bitmap.compress(compressFormat, 100, bufferedOutputStream);
                bufferedOutputStream.close();
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException e7) {
                    }
                }
                try {
                    bufferedOutputStream.close();
                } catch (IOException e8) {
                }
                return parcelFileDescriptor3;
            } catch (IOException e9) {
                e = e9;
                outputStream = bufferedOutputStream;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                message = ((IOException) jri.m13152b(e)).getMessage();
                if (message != null) {
                    throw new FileNotFoundException(message);
                }
                throw new FileNotFoundException();
            } catch (Throwable th22) {
                parcelFileDescriptor2 = parcelFileDescriptor;
                OutputStream outputStream3 = bufferedOutputStream;
                th = th22;
                outputStream2 = outputStream3;
                if (parcelFileDescriptor2 != null) {
                    parcelFileDescriptor2.close();
                }
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            parcelFileDescriptor = null;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            message = ((IOException) jri.m13152b(e)).getMessage();
            if (message != null) {
                throw new FileNotFoundException();
            }
            throw new FileNotFoundException(message);
        } catch (Throwable th222) {
            th = th222;
            outputStream2 = null;
            if (parcelFileDescriptor2 != null) {
                parcelFileDescriptor2.close();
            }
            if (outputStream2 != null) {
                outputStream2.close();
            }
            throw th;
        }
    }
}
