package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.location.Location;
import android.media.ExifInterface;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;

/* compiled from: PG */
/* renamed from: emd */
public final class emd {
    /* renamed from: a */
    private static final String f3964a = bli.m862a("MetadataUtils");
    /* renamed from: b */
    private static NumberFormat f3965b = NumberFormat.getInstance(Locale.US);

    /* renamed from: a */
    private static String m1868a(double d) {
        String str = null;
        String[] split = Location.convert(Math.abs(d), 2).split(":");
        if (split.length != 3) {
            return str;
        }
        String str2;
        String str3;
        try {
            float floatValue = f3965b.parse(split[2]).floatValue();
            str2 = split[0];
            str3 = split[1];
            str = String.valueOf((int) (floatValue * 1000.0f));
            int length = String.valueOf(str2).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 11) + String.valueOf(str3).length()) + String.valueOf(str).length());
            stringBuilder.append(str2);
            stringBuilder.append("/1,");
            stringBuilder.append(str3);
            stringBuilder.append("/1,");
            stringBuilder.append(str);
            stringBuilder.append("/1000");
            return stringBuilder.toString();
        } catch (ParseException e) {
            str2 = f3964a;
            str3 = String.valueOf(split[2]);
            String str4 = "Could not parse float: ";
            if (str3.length() == 0) {
                str3 = new String(str4);
            } else {
                str3 = str4.concat(str3);
            }
            bli.m873e(str2, str3);
            return str;
        }
    }

    /* renamed from: a */
    public static float m1867a(Map map) {
        if (map == null) {
            return 0.0f;
        }
        String str = (String) map.get("full_pano_width");
        try {
            return (((float) Integer.parseInt((String) map.get("cropped_area_width"))) / ((float) Integer.parseInt(str))) * 360.0f;
        } catch (NumberFormatException e) {
            return 0.0f;
        }
    }

    /* renamed from: a */
    public static Map m1871a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            try {
                Map hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(",", 2);
                        if (split.length == 2) {
                            hashMap.put(split[0], split[1].trim());
                        }
                    } else {
                        try {
                            bufferedReader.close();
                            return hashMap;
                        } catch (IOException e) {
                            return hashMap;
                        }
                    }
                }
            } catch (FileNotFoundException e2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                    }
                }
                return null;
            } catch (IOException e4) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e7) {
            bufferedReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return null;
        } catch (IOException e8) {
            bufferedReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static Date m1870a(Entry entry) {
        try {
            return new Date(Long.parseLong((String) entry.getValue()));
        } catch (Throwable e) {
            Throwable th = e;
            String str = f3964a;
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 30) + String.valueOf(str3).length());
            stringBuilder.append("Parse date failed for ");
            stringBuilder.append(str2);
            stringBuilder.append(" ,value:");
            stringBuilder.append(str3);
            bli.m864a(str, stringBuilder.toString(), th);
            return null;
        }
    }

    /* renamed from: b */
    private static Double m1874b(Entry entry) {
        try {
            return Double.valueOf(f3965b.parse((String) entry.getValue()).doubleValue());
        } catch (Throwable e) {
            Throwable th = e;
            String str = f3964a;
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 32) + String.valueOf(str3).length());
            stringBuilder.append("Parse double failed for ");
            stringBuilder.append(str2);
            stringBuilder.append(" ,value:");
            stringBuilder.append(str3);
            bli.m874e(str, stringBuilder.toString(), th);
            return null;
        }
    }

    /* renamed from: c */
    private static Integer m1875c(Entry entry) {
        try {
            return Integer.valueOf((String) entry.getValue());
        } catch (Throwable e) {
            Throwable th = e;
            String str = f3964a;
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 33) + String.valueOf(str3).length());
            stringBuilder.append("Parse integer failed for ");
            stringBuilder.append(str2);
            stringBuilder.append(" ,value:");
            stringBuilder.append(str3);
            bli.m874e(str, stringBuilder.toString(), th);
            return null;
        }
    }

    /* renamed from: a */
    private static String m1869a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static boolean m1873a(String str, List list) {
        FileWriter fileWriter;
        String str2;
        String valueOf;
        Throwable th;
        FileWriter fileWriter2;
        if (list == null || list.size() == 0) {
            return false;
        }
        try {
            FileWriter fileWriter3 = new FileWriter(str);
            try {
                fileWriter3.write(emd.m1869a("%s,%d\n", "first_photo_time", Long.valueOf(((emf) list.get(0)).f3966a)));
                fileWriter3.write(emd.m1869a("%s,%d\n", "last_photo_time", Long.valueOf(((emf) list.get(list.size() - 1)).f3966a)));
                fileWriter3.write(emd.m1869a("%s,%d\n", "source_photos_count", Integer.valueOf(list.size())));
                fileWriter3.write(emd.m1869a("%s,%d\n", "pose_heading", Integer.valueOf(((emf) list.get(0)).f3968c)));
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((emf) list.get(size)).f3967b != null) {
                        fileWriter3.write(emd.m1869a("%s,%f\n", "location_altitude", Double.valueOf(((emf) list.get(size)).f3967b.getAltitude())));
                        fileWriter3.write(emd.m1869a("%s,%f\n", "location_latitude", Double.valueOf(r0.getLatitude())));
                        fileWriter3.write(emd.m1869a("%s,%f\n", "location_longitude", Double.valueOf(r0.getLongitude())));
                        fileWriter3.write(emd.m1869a("%s,%s\n", "location_provider", r0.getProvider()));
                        fileWriter3.write(emd.m1869a("%s,%d\n", "location_time", Long.valueOf(r0.getTime())));
                        break;
                    }
                }
                try {
                    fileWriter3.close();
                } catch (IOException e) {
                }
                return true;
            } catch (IOException e2) {
                fileWriter = fileWriter3;
                try {
                    str2 = "Could not write metadata file: ";
                    valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        valueOf = new String(str2);
                    } else {
                        str2.concat(valueOf);
                    }
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException e3) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    FileWriter fileWriter4 = fileWriter;
                    th = th2;
                    fileWriter2 = fileWriter4;
                    if (fileWriter2 != null) {
                        try {
                            fileWriter2.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th22) {
                th = th22;
                fileWriter2 = fileWriter3;
                if (fileWriter2 != null) {
                    fileWriter2.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            fileWriter = null;
            str2 = "Could not write metadata file: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
            return false;
        } catch (Throwable th222) {
            th = th222;
            fileWriter2 = null;
            if (fileWriter2 != null) {
                fileWriter2.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static void m1872a(String str, Map map, String str2, boolean z, boolean z2, kbg kbg, boolean z3) {
        if (str != null && new File(str).exists()) {
            String absolutePath;
            Options options;
            String str3;
            File[] listFiles = new File(str2).listFiles(new eme());
            if (listFiles.length > 0) {
                absolutePath = listFiles[0].getAbsolutePath();
            } else {
                absolutePath = null;
            }
            try {
                ExifInterface exifInterface = new ExifInterface(str);
                if (absolutePath != null) {
                    exifInterface.setAttribute("Make", new ExifInterface(absolutePath).getAttribute("Make"));
                } else {
                    exifInterface.setAttribute("Make", Build.MANUFACTURER);
                }
                options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                exifInterface.setAttribute("ImageWidth", String.valueOf(options.outWidth));
                exifInterface.setAttribute("ImageLength", String.valueOf(options.outHeight));
                absolutePath = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US).format(new Date(System.currentTimeMillis()));
                exifInterface.setAttribute("DateTime", absolutePath);
                exifInterface.setAttribute("DateTimeOriginal", absolutePath);
                exifInterface.setAttribute("DateTimeDigitized", absolutePath);
                exifInterface.setAttribute("Model", Build.MODEL);
                if (map != null) {
                    Double d = null;
                    Double d2 = null;
                    Double d3 = null;
                    Date date = null;
                    for (Entry entry : map.entrySet()) {
                        Double d4;
                        Date date2;
                        Double d5;
                        if (((String) entry.getKey()).equals("location_altitude")) {
                            d4 = d3;
                            d3 = emd.m1874b(entry);
                            date2 = date;
                            d5 = d2;
                        } else if (((String) entry.getKey()).equals("location_latitude")) {
                            d4 = d3;
                            d3 = d;
                            Double b = emd.m1874b(entry);
                            date2 = date;
                            d5 = b;
                        } else if (((String) entry.getKey()).equals("location_longitude")) {
                            d4 = emd.m1874b(entry);
                            d3 = d;
                            date2 = date;
                            d5 = d2;
                        } else if (((String) entry.getKey()).equals("location_provider")) {
                            exifInterface.setAttribute("GPSProcessingMethod", (String) entry.getValue());
                            date2 = date;
                            d4 = d3;
                            d5 = d2;
                            d3 = d;
                        } else if (((String) entry.getKey()).equals("location_time")) {
                            date2 = emd.m1870a(entry);
                            d4 = d3;
                            d5 = d2;
                            d3 = d;
                        } else {
                            date2 = date;
                            d4 = d3;
                            d5 = d2;
                            d3 = d;
                        }
                        d2 = d5;
                        d = d3;
                        date = date2;
                        d3 = d4;
                    }
                    if (d != null) {
                        str3 = "GPSAltitudeRef";
                        if (d.doubleValue() >= 0.0d) {
                            absolutePath = "0";
                        } else {
                            absolutePath = "1";
                        }
                        exifInterface.setAttribute(str3, absolutePath);
                    }
                    if (!(d2 == null || d3 == null)) {
                        String a = emd.m1868a(d2.doubleValue());
                        if (d2.doubleValue() < 0.0d) {
                            str3 = "S";
                        } else {
                            str3 = "N";
                        }
                        String a2 = emd.m1868a(d3.doubleValue());
                        if (d3.doubleValue() < 0.0d) {
                            absolutePath = "W";
                        } else {
                            absolutePath = "E";
                        }
                        if (!(a == null || a2 == null)) {
                            exifInterface.setAttribute("GPSLatitude", a);
                            exifInterface.setAttribute("GPSLatitudeRef", str3);
                            exifInterface.setAttribute("GPSLongitude", a2);
                            exifInterface.setAttribute("GPSLongitudeRef", absolutePath);
                        }
                    }
                    if (date != null) {
                        TimeZone timeZone = TimeZone.getTimeZone("UTC");
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd", Locale.US);
                        simpleDateFormat.setTimeZone(timeZone);
                        exifInterface.setAttribute("GPSDateStamp", simpleDateFormat.format(date));
                        simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
                        simpleDateFormat.setTimeZone(timeZone);
                        exifInterface.setAttribute("GPSTimeStamp", simpleDateFormat.format(date));
                    }
                }
                exifInterface.saveAttributes();
            } catch (IOException e) {
                absolutePath = String.valueOf(str);
                str3 = "Write exif failed :";
                if (absolutePath.length() == 0) {
                    absolutePath = new String(str3);
                } else {
                    str3.concat(absolutePath);
                }
            }
            if (z2 || kbg.mo2084b()) {
                wd a3 = ern.m2035a();
                if (z2) {
                    try {
                        a3.mo2523a("http://ns.google.com/photos/1.0/panorama/", "UsePanoramaViewer", z);
                        a3.mo2523a("http://ns.google.com/photos/1.0/panorama/", "IsPhotosphere", z3);
                        a3.mo2518a("http://ns.google.com/photos/1.0/panorama/", "ProjectionType", (Object) "equirectangular");
                        if (map != null) {
                            Integer num = null;
                            Integer num2 = null;
                            Integer num3 = null;
                            Integer num4 = null;
                            Integer num5 = null;
                            Integer num6 = null;
                            Date date3 = null;
                            Date date4 = null;
                            Integer num7 = null;
                            Integer num8 = null;
                            Integer num9 = null;
                            for (Entry entry2 : map.entrySet()) {
                                Integer num10;
                                Date date5;
                                Integer num11;
                                Date date6;
                                Integer num12;
                                Integer num13;
                                Integer num14;
                                if (((String) entry2.getKey()).equals("full_pano_width")) {
                                    num10 = num8;
                                    date5 = date4;
                                    num11 = num6;
                                    num6 = num2;
                                    num2 = num4;
                                    num14 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = emd.m1875c(entry2);
                                    num13 = num9;
                                    num9 = num14;
                                } else if (((String) entry2.getKey()).equals("full_pano_height")) {
                                    num10 = num8;
                                    date5 = date4;
                                    num11 = num6;
                                    num6 = num2;
                                    num2 = emd.m1875c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("cropped_area_width")) {
                                    num10 = num8;
                                    num = num3;
                                    date5 = date4;
                                    num11 = num6;
                                    num6 = num2;
                                    num2 = num4;
                                    num14 = num5;
                                    num5 = emd.m1875c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num14;
                                } else if (((String) entry2.getKey()).equals("cropped_area_height")) {
                                    num10 = num8;
                                    num2 = num4;
                                    date5 = date4;
                                    num11 = num6;
                                    num6 = emd.m1875c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("cropped_area_top")) {
                                    num10 = num8;
                                    num5 = num;
                                    date5 = date4;
                                    num = num3;
                                    num11 = num6;
                                    num6 = num2;
                                    num2 = num4;
                                    Date date7 = date3;
                                    num12 = emd.m1875c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date7;
                                } else if (((String) entry2.getKey()).equals("cropped_area_left")) {
                                    num10 = num8;
                                    num6 = num2;
                                    date5 = date4;
                                    num2 = num4;
                                    num11 = emd.m1875c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("first_photo_time")) {
                                    num10 = num8;
                                    num12 = num5;
                                    date5 = date4;
                                    num5 = num;
                                    num11 = num6;
                                    num = num3;
                                    num6 = num2;
                                    num2 = num4;
                                    num14 = num7;
                                    date6 = emd.m1870a(entry2);
                                    num13 = num9;
                                    num9 = num14;
                                } else if (((String) entry2.getKey()).equals("last_photo_time")) {
                                    num10 = num8;
                                    num11 = num6;
                                    date5 = emd.m1870a(entry2);
                                    num6 = num2;
                                    num13 = num9;
                                    num2 = num4;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("source_photos_count")) {
                                    num10 = num8;
                                    date6 = date3;
                                    date5 = date4;
                                    num12 = num5;
                                    num11 = num6;
                                    num5 = num;
                                    num6 = num2;
                                    num = num3;
                                    num2 = num4;
                                    num14 = num9;
                                    num9 = emd.m1875c(entry2);
                                    num13 = num14;
                                } else if (((String) entry2.getKey()).equals("pose_heading")) {
                                    num10 = emd.m1875c(entry2);
                                    date5 = date4;
                                    num13 = num9;
                                    num11 = num6;
                                    num9 = num7;
                                    num6 = num2;
                                    date6 = date3;
                                    num2 = num4;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("yaw_correction_deg")) {
                                    num13 = emd.m1875c(entry2);
                                    num10 = num8;
                                    num9 = num7;
                                    date5 = date4;
                                    date6 = date3;
                                    num11 = num6;
                                    num12 = num5;
                                    num6 = num2;
                                    num5 = num;
                                    num2 = num4;
                                    num = num3;
                                } else {
                                    num13 = num9;
                                    num10 = num8;
                                    num9 = num7;
                                    date5 = date4;
                                    date6 = date3;
                                    num11 = num6;
                                    num12 = num5;
                                    num6 = num2;
                                    num5 = num;
                                    num2 = num4;
                                    num = num3;
                                }
                                num4 = num2;
                                num3 = num;
                                num2 = num6;
                                num = num5;
                                num6 = num11;
                                num5 = num12;
                                date3 = date6;
                                date4 = date5;
                                num8 = num10;
                                num7 = num9;
                                num9 = num13;
                            }
                            if (!(num == null || num2 == null)) {
                                a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "CroppedAreaImageHeightPixels", num2.intValue());
                                a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "CroppedAreaImageWidthPixels", num.intValue());
                            }
                            if (!(num3 == null || num4 == null)) {
                                a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "FullPanoHeightPixels", num4.intValue());
                                a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "FullPanoWidthPixels", num3.intValue());
                            }
                            if (!(num5 == null || num6 == null)) {
                                a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "CroppedAreaTopPixels", num5.intValue());
                                a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "CroppedAreaLeftPixels", num6.intValue());
                            }
                            if (date3 != null) {
                                a3.mo2518a("http://ns.google.com/photos/1.0/panorama/", "FirstPhotoDate", new wq(date3, TimeZone.getTimeZone("GMT")));
                            }
                            if (date4 != null) {
                                a3.mo2521a("http://ns.google.com/photos/1.0/panorama/", "LastPhotoDate", new wq(date4, TimeZone.getTimeZone("GMT")));
                            }
                            if (num7 != null) {
                                a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "SourcePhotosCount", num7.intValue());
                            }
                            if (!(num8 == null || num9 == null)) {
                                a3.mo2516a("http://ns.google.com/photos/1.0/panorama/", "PoseHeadingDegrees", (double) (((num9.intValue() + num8.intValue()) + 720) % 360));
                            }
                        }
                        options = new Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str, options);
                        int i = options.outWidth;
                        int i2 = options.outHeight;
                        a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "LargestValidInteriorRectLeft", 0);
                        a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "LargestValidInteriorRectTop", 0);
                        a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "LargestValidInteriorRectWidth", i);
                        a3.mo2517a("http://ns.google.com/photos/1.0/panorama/", "LargestValidInteriorRectHeight", i2);
                    } catch (wb e2) {
                        absolutePath = String.valueOf(e2.getLocalizedMessage());
                        str3 = "Set xmp property failed:";
                        if (absolutePath.length() == 0) {
                            absolutePath = new String(str3);
                            return;
                        } else {
                            str3.concat(absolutePath);
                            return;
                        }
                    }
                }
                if (kbg.mo2084b()) {
                    ern.m2044a(a3, (String) kbg.mo2081a());
                }
                if (!ern.m2043a(str, a3)) {
                    absolutePath = "Write XMP meta to file failed:";
                    str3 = String.valueOf(str);
                    if (str3.length() == 0) {
                        str3 = new String(absolutePath);
                    } else {
                        absolutePath.concat(str3);
                    }
                }
            }
        }
    }
}
