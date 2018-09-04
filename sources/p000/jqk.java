package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionStabilizer;
import com.google.android.libraries.smartburst.utils.MathUtils;
import com.google.common.io.ByteStreams;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jqk */
public class jqk implements jnp {
    /* renamed from: a */
    private static Boolean f18957a;
    /* renamed from: b */
    private static Exception f18958b;
    /* renamed from: c */
    private static volatile Thread f18959c;

    jqk() {
    }

    /* renamed from: a */
    public static OutputStream m13077a(File file) {
        return new BufferedOutputStream(new FileOutputStream(file), 8192);
    }

    /* renamed from: a */
    public static void m13093a(jms jms, Context context, jmr jmr, String[] strArr, Executor executor, jqo jqo) {
        if (jmr.m4593a()) {
            jmx.m12981b(jms);
            jnq.m13000a(jms, jqo, executor);
            jms.f7928c = false;
            jms.m4599b(juk.class, "segment_classifier").m4601a(new jqe());
            jms.m4599b(jtf.class, "default").m4601a(new jqi());
            jms.m4599b(jry.class, "parallel_metadata_extractor").m4601a(new jqj());
            jms.m4599b(jry.class, "serial_metadata_extractor").m4601a(new jns(context));
            jms.m4599b(jum.class, "summary_collage_frameset_selector").m4601a(new jnt());
            jms.m4599b(jir[].class, "default").m4601a(new jnu(strArr));
            jms.m4599b(juk.class, "action_burst_segmenter").m4601a(new jnv());
            jms.m4599b(jiq.class, "action_collage_artifact_renderer").m4601a(new jnw());
            jms.m4599b(jir.class, "Collage_Action").m4601a(new jnx());
            jms.m4599b(juk.class, "Collage_Action").m4601a(new jny());
            jms.m4599b(jiq.class, "camera_pan_artifact_renderer").m4601a(new jnz());
            jms.m4599b(jir.class, "Collage_CameraPan").m4601a(new joa());
            jms.m4599b(juk.class, "Collage_CameraPan").m4601a(new job());
            jms.m4599b(jiq.class, "summary_collage_artifact_renderer").m4601a(new jod());
            jms.m4599b(jir.class, "Collage_Summary").m4601a(new joe());
            jms.m4599b(juk.class, "Collage_Summary").m4601a(new jof());
            jms.m4599b(jtv.class, "post_proc_quality_metric").m4601a(new jog());
            jms.m4599b(jtv.class, "facemaximumeyeopen").m4601a(new joh());
            jms.m4599b(jtv.class, "faceaverageeyeopen").m4601a(new joi());
            jms.m4599b(jwp.class, "chroma_histogram_feature_row_metric").m4601a(new joj());
            jms.m4599b(jwq.class, "chroma_histogram_frame_distance_metric").m4601a(new jok());
            jms.m4599b(jiq.class, "action_gif_artifact_renderer").m4601a(new jol());
            jms.m4599b(jir.class, "GIF_Action").m4601a(new jom());
            jms.m4599b(juk.class, "GIF_Action").m4601a(new joo());
            jms.m4599b(juk.class, "continuous_action").m4601a(new jop());
            jms.m4599b(jir.class, "GIF_Summary").m4601a(new joq());
            jms.m4599b(juk.class, "GIF_Summary").m4601a(new jor());
            jms.m4599b(jiq.class, "summary_gif_artifact_renderer").m4601a(new jos());
            jms.m4599b(ByteBuffer.class, "dither_samples").m4601a(new jot(context));
            jms.m4599b(ByteBuffer.class, "skin_samples").m4601a(new jou(context));
            jms.m4599b(ByteBuffer.class, "landmark_extrapolator_models").m4601a(new jov(context));
            jms.m4599b(jjf.class, "default").m4601a(new jow());
            jms.m4599b(MotionStabilizer.class, "default").m4601a(new jox());
            jms.m4599b(jiq.class, "photobooth_artifact_renderer").m4601a(new joz());
            jms.m4599b(jiv[].class, "cropping_layouts").m4601a(new jpa());
            jms.m4599b(jiv[].class, "noncropping_layouts").m4601a(new jpb());
            jms.m4599b(jiv[].class, "combined_layouts").m4601a(new jpc());
            jms.m4599b(jir.class, "Collage_PhotoBooth").m4601a(new jpd());
            jms.m4599b(jiq.class, "all_smiles_artifact_render").m4601a(new jpe());
            jms.m4599b(jir.class, "AllSmiles").m4601a(new jpf());
            jms.m4599b(juk.class, "Collage_PhotoBooth").m4601a(new jpg());
            jms.m4599b(juk.class, "AllSmiles").m4601a(new jph());
            jms.m4599b(juk.class, "face_detector").m4601a(new jpi());
            jms.m4599b(jir.class, "Video_VFR").m4601a(new jpk());
            jms.m4599b(juk.class, "Video_VFR").m4601a(new jpl());
            jms.m4599b(jiq.class, "VFR_video_artifact_render").m4601a(new jpm(context));
            jms.m4599b(jum.class, "panning_collage_frameset_selector").m4601a(new jpn());
            jms.m4599b(juk.class, "jump_cut").m4601a(new jpo());
            jms.m4599b(juk.class, "action_merger").m4601a(new jpp());
            jms.m4599b(jtv.class, "best_frame_quality_metric").m4601a(new jpq());
            jms.m4599b(juk.class, "image_sharpness_filter").m4601a(new jpr());
            jms.m4599b(juk.class, "face_quality_filter").m4601a(new jps());
            jms.m4599b(jso.class, "default").m4601a(new jpt());
            jms.m4599b(jst.class, "default").m4601a(new jpv());
            jms.m4599b(juk.class, "segmenter").m4601a(new jpw());
            jms.m4599b(jtv.class, "panning_content_value").m4601a(new jpx());
            jms.m4599b(jtv.class, "summary_content_value").m4601a(new jpy());
            jms.m4599b(jtv.class, "time_gap_score").m4601a(new jqk());
            jms.m4599b(jtv.class, "color_diversity").m4601a(new jpz());
            jms.m4599b(jtv.class, "video_presentation_time").m4601a(new jqa());
            jms.f7928c = true;
            return;
        }
        jnq.m13000a(jms, jqo, executor);
        jms.f7928c = false;
        jms.m4599b(jtf.class, "default").m4601a(new jnr());
        jms.m4599b(jry.class, "parallel_metadata_extractor").m4601a(new joc());
        jms.m4599b(jry.class, "serial_metadata_extractor").m4601a(new jon());
        jms.m4599b(jir[].class, "default").m4601a(new joy());
        jms.m4599b(jso.class, "default").m4601a(new jpj());
        jms.m4599b(jtv.class, "post_proc_quality_metric").m4601a(new jpu());
        jms.f7928c = true;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        return new jud();
    }

    /* renamed from: a */
    public static FrameImage2D m13075a(int i, int i2) {
        return Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 9), new int[]{i, i2}).asFrameImage2D();
    }

    /* renamed from: a */
    public static void m13092a() {
        if (f18959c == null) {
            f18959c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == f18959c) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    /* renamed from: a */
    public static jrg m13086a(Set set, jrg jrg) {
        boolean z;
        if (jrg.m13136f() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jrj jrj = new jrj();
        NavigableSet treeSet = new TreeSet(jrg.m13135e());
        for (Long longValue : set) {
            long longValue2 = longValue.longValue();
            jrj.m4621a(longValue2, jrg.m13132c(MathUtils.closestValue(treeSet, longValue2)), jrg.f18971a, jrg.f18972b, jrg.f18973c.contains(Long.valueOf(longValue2)));
        }
        return jrj.m4620a();
    }

    /* renamed from: a */
    public static Object m13078a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: a */
    public static FrameImage2D m13076a(Bitmap bitmap) {
        FrameImage2D a = jqk.m13075a(bitmap.getWidth(), bitmap.getHeight());
        a.setBitmap(bitmap);
        return a;
    }

    /* renamed from: a */
    public static ByteBuffer m13084a(Context context, int i) {
        byte[] bArr = new byte[0];
        try {
            bArr = ByteStreams.toByteArray(new BufferedInputStream(context.getResources().openRawResource(i), 8192));
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    /* renamed from: a */
    public static ArrayList m13085a(String str, String str2) {
        Object arrayList = new ArrayList(r11);
        for (String str3 : str.split("\n")) {
            Object str4;
            int indexOf = str3.indexOf(32);
            String[] split = str3.substring(0, indexOf).split(":");
            int i = split.length != 2 ? 0 : indexOf > 0 ? 1 : 0;
            String valueOf = String.valueOf(str3);
            String str5 = "Invalid license meta-data line:\n";
            if (valueOf.length() == 0) {
                str4 = new String(str5);
            } else {
                str4 = str5.concat(valueOf);
            }
            if (i == 0) {
                throw new IllegalStateException(String.valueOf(str4));
            }
            arrayList.add(new kaj(str3.substring(indexOf + 1), Long.parseLong(split[0]), Integer.parseInt(split[1]), str2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static String m13081a(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = LfuScheduler.MAX_PRIORITY;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (Throwable e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (Throwable e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    /* renamed from: a */
    public static String m13083a(String str, String str2, long j, int i) {
        Throwable e;
        JarFile jarFile;
        Throwable th;
        JarFile jarFile2 = null;
        JarFile jarFile3;
        try {
            jarFile3 = new JarFile(str2);
            try {
                String a;
                ZipEntry jarEntry = jarFile3.getJarEntry(str);
                if (jarEntry != null) {
                    a = jqk.m13081a(jarFile3.getInputStream(jarEntry), j, i);
                    try {
                        jarFile3.close();
                    } catch (IOException e2) {
                    }
                } else {
                    try {
                        jarFile3.close();
                    } catch (IOException e3) {
                    }
                }
                return a;
            } catch (IOException e4) {
                e = e4;
                try {
                    throw new RuntimeException("Failed to read license text.", e);
                } catch (Throwable e5) {
                    jarFile = jarFile3;
                    th = e5;
                    jarFile2 = jarFile;
                    if (jarFile2 != null) {
                        try {
                            jarFile2.close();
                        } catch (IOException e6) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable e52) {
                jarFile = jarFile3;
                th = e52;
                jarFile2 = jarFile;
                if (jarFile2 != null) {
                    jarFile2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            e52 = th2;
            jarFile3 = null;
            throw new RuntimeException("Failed to read license text.", e52);
        } catch (Throwable th3) {
            th2 = th3;
            if (jarFile2 != null) {
                jarFile2.close();
            }
            throw th2;
        }
    }

    /* renamed from: a */
    public static String m13080a(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return jqk.m13081a(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder))), j, i);
    }

    /* renamed from: a */
    public static void m13094a(jms jms, jyt jyt) {
        jms.m4597a(juk.class, new jye(jyt.m4699a("segmentation.txt")));
        jms.m4597a(jwp.class, new jyf(jyt));
        jms.m4597a(jst.class, new jyg(jyt.m4699a("frame_sequence_distances.txt")));
        jms.m4597a(jiq.class, new jyh(jyt.m4699a("artifact_renderer.txt")));
        jms.m4597a(jxm.class, new jyi(jyt));
        jyt.m4701a("post_process_config.txt", jms.m4596a());
    }

    /* renamed from: c */
    private static boolean m13103c() {
        if (f18957a != null) {
            return f18957a.booleanValue();
        }
        if (f18958b != null) {
            throw f18958b;
        }
        try {
            f18957a = Boolean.valueOf(Build.PRODUCT.startsWith("sdk_google"));
            return f18957a.booleanValue();
        } catch (Exception e) {
            f18958b = e;
            throw e;
        }
    }

    /* renamed from: b */
    public static boolean m13100b() {
        try {
            return jqk.m13103c();
        } catch (Throwable e) {
            Log.w("IsEmulator", "Could not determine if emulator.  Assuming false.", e);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m13096a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: a */
    public static jrj m13087a(File file, jxy jxy) {
        jzp a;
        int i;
        String valueOf;
        String str;
        jrj jrj = new jrj();
        File[] f = jxy.mo2067f(file);
        if (f != null) {
            int length = f.length;
            if (length != 0) {
                int i2;
                jzp a2 = jzp.m4713a(0, 0);
                Map hashMap = new HashMap();
                int i3 = LfuScheduler.MAX_PRIORITY;
                int i4 = 0;
                while (i4 < length) {
                    jzp jzp;
                    File file2 = f[i4];
                    try {
                        jqz jqz = new jqz(file2);
                        hashMap.put(file2, jqz);
                        int i5 = jqz.f21886a;
                        int i6 = jqz.f21887b;
                        i2 = i5 * i6;
                        if (i2 < i3) {
                            try {
                                a = jzp.m4713a(i5, i6);
                                i = i2;
                            } catch (jra e) {
                                valueOf = String.valueOf(file2.getAbsolutePath());
                                str = "BitmapDecodingException for file : ";
                                if (valueOf.length() != 0) {
                                    valueOf = new String(str);
                                } else {
                                    valueOf = str.concat(valueOf);
                                }
                                Log.w("Summaries", valueOf);
                                a = a2;
                                i = i2;
                                i4++;
                                jzp = a;
                                i3 = i;
                                a2 = jzp;
                            }
                        } else {
                            jzp = a2;
                            i = i3;
                            a = jzp;
                        }
                    } catch (jra e2) {
                        i2 = i3;
                        valueOf = String.valueOf(file2.getAbsolutePath());
                        str = "BitmapDecodingException for file : ";
                        if (valueOf.length() != 0) {
                            valueOf = str.concat(valueOf);
                        } else {
                            valueOf = new String(str);
                        }
                        Log.w("Summaries", valueOf);
                        a = a2;
                        i = i2;
                        i4++;
                        jzp = a;
                        i3 = i;
                        a2 = jzp;
                    }
                    i4++;
                    jzp = a;
                    i3 = i;
                    a2 = jzp;
                }
                i4 = f.length;
                i2 = 0;
                while (i2 < i4) {
                    File file3 = f[i2];
                    try {
                        if (hashMap.containsKey(file3)) {
                            jrj.m4623a(jxy.mo2068g(file3), jqk.m13089a(new kab(jqk.m13097b(new jrf((jqz) hashMap.get(file3), a2.f8149a, a2.f8150b)))), false);
                        }
                        i2++;
                    } catch (Throwable e3) {
                        String valueOf2 = String.valueOf(file3);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 34);
                        stringBuilder.append("Couldn't get timestamp from file: ");
                        stringBuilder.append(valueOf2);
                        throw new RuntimeException(stringBuilder.toString(), e3);
                    }
                }
                return jrj;
            }
        }
        return jrj;
    }

    /* renamed from: a */
    public static kah m13089a(kai kai) {
        return new jzz(kai);
    }

    /* renamed from: a */
    public static kbn m13091a(kbn kbn) {
        if ((kbn instanceof kbp) || (kbn instanceof kbo)) {
            return kbn;
        }
        if (kbn instanceof Serializable) {
            return new kbo(kbn);
        }
        return new kbp(kbn);
    }

    /* renamed from: a */
    public static kbn m13090a(Object obj) {
        return new kbq(obj);
    }

    /* renamed from: b */
    public static boolean m13101b(File file) {
        boolean z;
        if (file.isDirectory()) {
            int i;
            jri.m13152b((Object) file);
            jri.m13143a(file.isDirectory());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int i2 = 0;
                i = 1;
                while (i2 < listFiles.length) {
                    int b = jqk.m13101b(listFiles[i2]) & i;
                    i2++;
                    i = b;
                }
            } else {
                i = 1;
            }
            z = i != 0;
        } else {
            z = true;
        }
        if (z && file.delete()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static kah m13088a(AutoCloseable autoCloseable) {
        return jqk.m13089a(new kab(jqk.m13097b(autoCloseable)));
    }

    /* renamed from: b */
    public static jzx m13097b(AutoCloseable autoCloseable) {
        return new kaa(autoCloseable);
    }

    /* renamed from: a */
    public static String m13082a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (jqk.m13096a(str.charAt(i))) {
                char[] toCharArray = str.toCharArray();
                while (i < length) {
                    char c = toCharArray[i];
                    if (jqk.m13096a(c)) {
                        toCharArray[i] = (char) (c ^ 32);
                    }
                    i++;
                }
                return String.valueOf(toCharArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static kbd m13098b(Object obj) {
        return new kbd(obj.getClass().getSimpleName());
    }

    /* renamed from: b */
    public static kbd m13099b(String str) {
        return new kbd(str);
    }

    /* renamed from: a */
    public static void m13095a(boolean z) {
        if (!z) {
            throw new kbs();
        }
    }

    /* renamed from: c */
    public static Object m13102c(Object obj) {
        return jqk.m13079a(obj, "expected a non-null reference", new Object[0]);
    }

    /* renamed from: a */
    public static Object m13079a(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new kbs(jri.m13141a(str, objArr));
    }
}
