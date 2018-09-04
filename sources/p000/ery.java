package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

/* compiled from: PG */
/* renamed from: ery */
public final class ery {
    /* renamed from: a */
    public static final String f4177a = bli.m862a("PanoMetadata");
    /* renamed from: b */
    public final boolean f4178b;
    /* renamed from: c */
    public final int f4179c;
    /* renamed from: d */
    public final int f4180d;
    /* renamed from: e */
    public final int f4181e;
    /* renamed from: f */
    public final int f4182f;
    /* renamed from: g */
    public final boolean f4183g;
    /* renamed from: h */
    public final boolean f4184h;

    private ery(int i, int i2) {
        Calendar.getInstance();
        Calendar.getInstance();
        this.f4178b = true;
        this.f4179c = i;
        this.f4180d = i2;
        this.f4181e = i;
        this.f4182f = i2;
        this.f4183g = true;
        this.f4184h = false;
    }

    private ery(boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.f4178b = z;
        this.f4179c = i;
        this.f4180d = i2;
        this.f4181e = i3;
        this.f4182f = i4;
        this.f4183g = false;
        this.f4184h = z2;
    }

    /* renamed from: a */
    private static boolean m2091a(wd wdVar, String str) {
        return wdVar.mo2525b("http://ns.google.com/photos/1.0/panorama/", str) ? wdVar.mo2530f("http://ns.google.com/photos/1.0/panorama/", str).booleanValue() : false;
    }

    /* renamed from: b */
    private static Calendar m2092b(wd wdVar, String str) {
        return wdVar.mo2525b("http://ns.google.com/photos/1.0/panorama/", str) ? wdVar.mo2531g("http://ns.google.com/photos/1.0/panorama/", str) : null;
    }

    /* renamed from: c */
    private static int m2093c(wd wdVar, String str) {
        return wdVar.mo2525b("http://ns.google.com/photos/1.0/panorama/", str) ? wdVar.mo2533i("http://ns.google.com/photos/1.0/panorama/", str).intValue() : 0;
    }

    /* renamed from: a */
    private static boolean m2090a(double d, double d2, double d3) {
        return Math.abs(d - d2) < d3;
    }

    /* renamed from: a */
    private static ery m2088a(eys eys) {
        boolean a;
        int c;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        Options options;
        InputStream b;
        int i5;
        int i6;
        Object obj;
        double d;
        double d2;
        Object b2 = eys.m10089b();
        if (b2 == null) {
            return null;
        }
        int i7;
        int i8;
        InputStream inputStream = (InputStream) jri.m13152b(b2);
        wd a2 = ern.m2036a(inputStream);
        try {
            inputStream.close();
        } catch (IOException e) {
            String str = f4177a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
            stringBuilder.append("Failed to close stream: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
        }
        if (a2 != null) {
            int i9;
            try {
                ery.m2092b(a2, "FirstPhotoDate");
                ery.m2092b(a2, "LastPhotoDate");
                ery.m2093c(a2, "SourcePhotosCount");
                valueOf = "ProjectionType";
                if (a2.mo2525b("http://ns.google.com/photos/1.0/panorama/", valueOf)) {
                    a2.mo2534j("http://ns.google.com/photos/1.0/panorama/", valueOf);
                }
                a = ery.m2091a(a2, "UsePanoramaViewer");
                try {
                    c = ery.m2093c(a2, "CroppedAreaImageWidthPixels");
                } catch (wb e2) {
                    c = 0;
                    i = 0;
                    i9 = 0;
                    i2 = 0;
                    b2 = null;
                    z = false;
                    i3 = i2;
                    i4 = i9;
                    i7 = i;
                    i8 = c;
                    z2 = a;
                    options = new Options();
                    options.inJustDecodeBounds = true;
                    b = eys.m10089b();
                    if (b == null) {
                        BitmapFactory.decodeStream(b, null, options);
                        try {
                            b.close();
                        } catch (IOException e3) {
                            String str2 = f4177a;
                            String valueOf2 = String.valueOf(e3);
                            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                            stringBuilder2.append("Failed to close stream: ");
                            stringBuilder2.append(valueOf2);
                            bli.m866b(str2, stringBuilder2.toString());
                        }
                        i5 = options.outWidth;
                        i6 = options.outHeight;
                        i2 = i6 + i6;
                        if (b2 == null) {
                            obj = null;
                        } else if (i2 == i5) {
                            return null;
                        } else {
                            bli.m869c(f4177a, "Could not parse pano metadata for file. Filling in 360 defaults.");
                            obj = 1;
                        }
                        d = ((double) i5) / ((double) i6);
                        d2 = ((double) i8) / ((double) i7);
                        if (obj != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj != null) {
                            return new ery(z2, i8, i7, i4, i3, z);
                        }
                        return new ery(i5, i6);
                    }
                    bli.m873e(f4177a, "Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                    return null;
                }
                try {
                    i = ery.m2093c(a2, "CroppedAreaImageHeightPixels");
                    try {
                        i9 = ery.m2093c(a2, "FullPanoWidthPixels");
                        try {
                            i2 = ery.m2093c(a2, "FullPanoHeightPixels");
                        } catch (wb e4) {
                            i2 = 0;
                            b2 = null;
                            z = false;
                            i3 = i2;
                            i4 = i9;
                            i7 = i;
                            i8 = c;
                            z2 = a;
                            options = new Options();
                            options.inJustDecodeBounds = true;
                            b = eys.m10089b();
                            if (b == null) {
                                bli.m873e(f4177a, "Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                                return null;
                            }
                            BitmapFactory.decodeStream(b, null, options);
                            b.close();
                            i5 = options.outWidth;
                            i6 = options.outHeight;
                            i2 = i6 + i6;
                            if (b2 == null) {
                                obj = null;
                            } else if (i2 == i5) {
                                return null;
                            } else {
                                bli.m869c(f4177a, "Could not parse pano metadata for file. Filling in 360 defaults.");
                                obj = 1;
                            }
                            d = ((double) i5) / ((double) i6);
                            d2 = ((double) i8) / ((double) i7);
                            if (obj != null) {
                            }
                            if (obj != null) {
                            }
                            if (obj != null) {
                                return new ery(i5, i6);
                            }
                            return new ery(z2, i8, i7, i4, i3, z);
                        }
                    } catch (wb e5) {
                        i9 = 0;
                        i2 = 0;
                        b2 = null;
                        z = false;
                        i3 = i2;
                        i4 = i9;
                        i7 = i;
                        i8 = c;
                        z2 = a;
                        options = new Options();
                        options.inJustDecodeBounds = true;
                        b = eys.m10089b();
                        if (b == null) {
                            bli.m873e(f4177a, "Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                            return null;
                        }
                        BitmapFactory.decodeStream(b, null, options);
                        b.close();
                        i5 = options.outWidth;
                        i6 = options.outHeight;
                        i2 = i6 + i6;
                        if (b2 == null) {
                            obj = null;
                        } else if (i2 == i5) {
                            return null;
                        } else {
                            bli.m869c(f4177a, "Could not parse pano metadata for file. Filling in 360 defaults.");
                            obj = 1;
                        }
                        d = ((double) i5) / ((double) i6);
                        d2 = ((double) i8) / ((double) i7);
                        if (obj != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj != null) {
                            return new ery(i5, i6);
                        }
                        return new ery(z2, i8, i7, i4, i3, z);
                    }
                    try {
                        ery.m2093c(a2, "CroppedAreaLeftPixels");
                        ery.m2093c(a2, "CroppedAreaTopPixels");
                        ery.m2093c(a2, "LargestValidInteriorRectLeft");
                        ery.m2093c(a2, "LargestValidInteriorRectTop");
                        ery.m2093c(a2, "LargestValidInteriorRectWidth");
                        ery.m2093c(a2, "LargestValidInteriorRectHeight");
                        if (a2.mo2525b("http://ns.google.com/photos/1.0/panorama/", "IsPhotosphere")) {
                            z = ery.m2091a(a2, "IsPhotosphere");
                        } else {
                            z = ery.m2091a(a2, "UsePanoramaViewer");
                        }
                        if (c <= 0) {
                            b2 = null;
                        } else if (i <= 0) {
                            b2 = null;
                        } else if (i9 <= 0) {
                            b2 = null;
                        } else if (i2 > 0) {
                            b2 = 1;
                        } else {
                            b2 = null;
                        }
                        i3 = i2;
                        i4 = i9;
                        i7 = i;
                        i8 = c;
                        z2 = a;
                    } catch (wb e6) {
                        b2 = null;
                        z = false;
                        i3 = i2;
                        i4 = i9;
                        i7 = i;
                        i8 = c;
                        z2 = a;
                        options = new Options();
                        options.inJustDecodeBounds = true;
                        b = eys.m10089b();
                        if (b == null) {
                            BitmapFactory.decodeStream(b, null, options);
                            b.close();
                            i5 = options.outWidth;
                            i6 = options.outHeight;
                            i2 = i6 + i6;
                            if (b2 == null) {
                                obj = null;
                            } else if (i2 == i5) {
                                return null;
                            } else {
                                bli.m869c(f4177a, "Could not parse pano metadata for file. Filling in 360 defaults.");
                                obj = 1;
                            }
                            d = ((double) i5) / ((double) i6);
                            d2 = ((double) i8) / ((double) i7);
                            if (obj != null) {
                            }
                            if (obj != null) {
                            }
                            if (obj != null) {
                                return new ery(z2, i8, i7, i4, i3, z);
                            }
                            return new ery(i5, i6);
                        }
                        bli.m873e(f4177a, "Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                        return null;
                    }
                } catch (wb e7) {
                    i = 0;
                    i9 = 0;
                    i2 = 0;
                    b2 = null;
                    z = false;
                    i3 = i2;
                    i4 = i9;
                    i7 = i;
                    i8 = c;
                    z2 = a;
                    options = new Options();
                    options.inJustDecodeBounds = true;
                    b = eys.m10089b();
                    if (b == null) {
                        bli.m873e(f4177a, "Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                        return null;
                    }
                    BitmapFactory.decodeStream(b, null, options);
                    b.close();
                    i5 = options.outWidth;
                    i6 = options.outHeight;
                    i2 = i6 + i6;
                    if (b2 == null) {
                        obj = null;
                    } else if (i2 == i5) {
                        return null;
                    } else {
                        bli.m869c(f4177a, "Could not parse pano metadata for file. Filling in 360 defaults.");
                        obj = 1;
                    }
                    d = ((double) i5) / ((double) i6);
                    d2 = ((double) i8) / ((double) i7);
                    if (obj != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj != null) {
                        return new ery(i5, i6);
                    }
                    return new ery(z2, i8, i7, i4, i3, z);
                }
            } catch (wb e8) {
                a = false;
                c = 0;
                i = 0;
                i9 = 0;
                i2 = 0;
                b2 = null;
                z = false;
                i3 = i2;
                i4 = i9;
                i7 = i;
                i8 = c;
                z2 = a;
                options = new Options();
                options.inJustDecodeBounds = true;
                b = eys.m10089b();
                if (b == null) {
                    BitmapFactory.decodeStream(b, null, options);
                    b.close();
                    i5 = options.outWidth;
                    i6 = options.outHeight;
                    i2 = i6 + i6;
                    if (b2 == null) {
                        obj = null;
                    } else if (i2 == i5) {
                        return null;
                    } else {
                        bli.m869c(f4177a, "Could not parse pano metadata for file. Filling in 360 defaults.");
                        obj = 1;
                    }
                    d = ((double) i5) / ((double) i6);
                    d2 = ((double) i8) / ((double) i7);
                    if (obj != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj != null) {
                        return new ery(z2, i8, i7, i4, i3, z);
                    }
                    return new ery(i5, i6);
                }
                bli.m873e(f4177a, "Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                return null;
            }
        }
        b2 = null;
        z = false;
        i3 = 0;
        i4 = 0;
        i7 = 0;
        i8 = 0;
        z2 = false;
        options = new Options();
        options.inJustDecodeBounds = true;
        b = eys.m10089b();
        if (b == null) {
            bli.m873e(f4177a, "Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
            return null;
        }
        BitmapFactory.decodeStream(b, null, options);
        b.close();
        i5 = options.outWidth;
        i6 = options.outHeight;
        i2 = i6 + i6;
        if (b2 == null) {
            obj = null;
        } else if (i2 == i5) {
            return null;
        } else {
            bli.m869c(f4177a, "Could not parse pano metadata for file. Filling in 360 defaults.");
            obj = 1;
        }
        d = ((double) i5) / ((double) i6);
        d2 = ((double) i8) / ((double) i7);
        if (obj != null && !ery.m2090a(d, d2, 0.001d)) {
            bli.m873e(f4177a, "Pano metadata does not match file dimensions.");
            return null;
        } else if (obj != null && !ery.m2090a(((double) i4) / ((double) i3), 2.0d, 0.1d)) {
            bli.m873e(f4177a, "Pano metadata invalid: Full pano dimension not 2:1.");
            return null;
        } else if (obj != null) {
            return new ery(i5, i6);
        } else {
            return new ery(z2, i8, i7, i4, i3, z);
        }
    }

    /* renamed from: a */
    public static ery m2089a(String str) {
        return ery.m2088a(new eys(str));
    }
}
