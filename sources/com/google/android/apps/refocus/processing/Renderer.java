package com.google.android.apps.refocus.processing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.FieldPacker;
import android.support.v8.renderscript.RSRuntimeException;
import android.support.v8.renderscript.RenderScript;
import android.support.v8.renderscript.Script.LaunchOptions;
import com.google.android.apps.refocus.image.DepthTransform;
import java.util.ArrayList;
import p000.bli;
import p000.hrz;
import p000.hsa;
import p000.hsb;
import p000.hsc;
import p000.hsd;
import p000.hse;
import p000.hsf;
import p000.hsg;

/* compiled from: PG */
public class Renderer {
    public static final String TAG = bli.m862a("Renderer");
    public final Context context;
    public final Priority priority;

    /* compiled from: PG */
    public enum Priority {
        NORMAL,
        LOW
    }

    public Renderer(Context context, Priority priority) {
        this.context = context;
        this.priority = priority;
    }

    public Bitmap render(DepthOfFieldOptions depthOfFieldOptions) {
        return render(depthOfFieldOptions, null, null);
    }

    public Bitmap render(DepthOfFieldOptions depthOfFieldOptions, ProgressCallback progressCallback) {
        return render(depthOfFieldOptions, progressCallback, null);
    }

    public Bitmap render(DepthOfFieldOptions depthOfFieldOptions, ProgressCallback progressCallback, Bitmap bitmap) {
        RenderScript a = hse.m3336a(this.context);
        int i;
        if (a != null) {
            int i2;
            int i3;
            if (this.priority == Priority.LOW) {
                a.setPriority(android.support.v8.renderscript.RenderScript.Priority.LOW);
            } else {
                a.setPriority(android.support.v8.renderscript.RenderScript.Priority.NORMAL);
            }
            long currentTimeMillis = System.currentTimeMillis();
            hsf hsf = new hsf(a);
            long currentTimeMillis2 = System.currentTimeMillis();
            DepthTransform depthTransform = depthOfFieldOptions.rgbz.getDepthTransform();
            float f = depthOfFieldOptions.focalDepth;
            float f2 = depthOfFieldOptions.depthOfField;
            float f3 = depthOfFieldOptions.blurInfinity;
            hrz hrz = new hrz();
            if (f2 < 0.0f) {
                f2 = -f2;
                bli.m866b(hrz.f6534a, "Negative depth of field");
            }
            int c = hrz.m3324c(depthTransform.quantize((1.0f - f2) * f));
            int c2 = hrz.m3324c(depthTransform.quantize((f2 + 1.0f) * f));
            hrz.f6535b = new float[64];
            float reconstruct = depthTransform.reconstruct(hrz.m3325d(c));
            float reconstruct2 = depthTransform.reconstruct(hrz.m3325d(c2));
            for (i2 = 1; i2 <= 64; i2++) {
                f2 = depthTransform.reconstruct(hrz.m3325d(i2));
                if (f2 < reconstruct) {
                    f2 = ((reconstruct - f2) * f3) / f2;
                } else if (f2 > reconstruct2) {
                    f2 = ((f2 - reconstruct2) * f3) / f2;
                } else {
                    f2 = 0.0f;
                }
                hrz.f6535b[i2 - 1] = Math.min(f2, 25.0f);
            }
            f3 = Math.max((hrz.m3326a(1) + hrz.m3326a(64)) / 8.0f, 2.0f);
            ArrayList arrayList = new ArrayList(hrz.f6535b.length);
            if (c2 != 1) {
                i2 = c2 - 1;
                arrayList.add(new hsc(i2));
                i3 = i2;
                f = hrz.m3326a(i2) + f3;
                while (i3 > 1) {
                    i = i3 - 1;
                    if (hrz.m3326a(i) <= f) {
                        ((hsc) arrayList.get(arrayList.size() - 1)).f6560b = i;
                        i3 = i;
                    } else {
                        arrayList.add(new hsc(i));
                        f = hrz.m3326a(i) + f3;
                        i3 = i;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(hrz.f6535b.length);
            if (c != 64) {
                i2 = c + 1;
                arrayList2.add(new hsc(i2));
                i3 = i2;
                f = hrz.m3326a(i2) + f3;
                while (i3 < 64) {
                    i = i3 + 1;
                    if (hrz.m3326a(i) <= f) {
                        ((hsc) arrayList2.get(arrayList2.size() - 1)).f6559a = i;
                        i3 = i;
                    } else {
                        arrayList2.add(new hsc(i));
                        f = hrz.m3326a(i) + f3;
                        i3 = i;
                    }
                }
            }
            i = (arrayList2.size() + 1) + arrayList.size();
            hrz.f6536c = new hsc[i];
            hrz.f6537d = arrayList2.size();
            for (i2 = 0; i2 < i; i2++) {
                if (i2 < arrayList2.size()) {
                    hrz.f6536c[i2] = (hsc) arrayList2.get((arrayList2.size() - 1) - i2);
                } else if (i2 == arrayList2.size()) {
                    hrz.f6536c[i2] = new hsc(c, c2);
                } else {
                    hrz.f6536c[i2] = (hsc) arrayList.get(i2 - (arrayList2.size() + 1));
                }
            }
            hsf.f6572b = hrz;
            hsf.f6573c = depthOfFieldOptions.rgbz.getBitmap();
            hsd hsd = new hsd(hsf.f6574d, (byte) 0);
            Bitmap bitmap2 = hsf.f6573c;
            hrz hrz2 = hsf.f6572b;
            hsc hsc = hrz2.f6536c[hrz2.f6537d];
            hsd.f6563c = new hsg(hsd.f6562b);
            hsd.f6565e = new hsa(bitmap2, hsb.f6556a + 1, hsd.f6562b, (hsg) hsd.f6563c);
            hsa hsa = hsd.f6565e;
            hsg hsg = (hsg) hsd.f6563c;
            int i4 = hsa.f6550e;
            int i5 = hsa.f6551f;
            int i6 = hsa.f6552g;
            c = hsc.f6559a;
            i = hsc.f6560b;
            FieldPacker fieldPacker = new FieldPacker(20);
            fieldPacker.addI32(i4);
            fieldPacker.addI32(i5);
            fieldPacker.addI32(i6);
            fieldPacker.addI32(c);
            fieldPacker.addI32(i);
            hsg.invoke(3, fieldPacker);
            Allocation allocation = hsa.f6548c;
            if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                Object obj;
                hsc hsc2;
                LaunchOptions launchOptions;
                Bitmap bitmap3;
                hsg.forEach(1, allocation, null, null, null);
                c = hrz2.f6536c.length - 1;
                while (c >= hrz2.f6537d) {
                    if (progressCallback != null && progressCallback.wasCancelled()) {
                        obj = null;
                        break;
                    }
                    hsc2 = hrz2.f6536c[c];
                    hsd.m3334a(hsc2);
                    hsd.m3333a(hsd.m3332a(hsc2.f6560b, hrz2));
                    hsd.m3335b(c, hrz2);
                    hsg = (hsg) hsd.f6563c;
                    allocation = hsd.f6565e.f6548c;
                    if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                        hsg.forEach(2, allocation, null, null, null);
                        hsg = (hsg) hsd.f6563c;
                        allocation = hsd.f6565e.f6548c;
                        if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                            hsg.forEach(3, allocation, null, null, null);
                            if (hsd.f6564d) {
                                ((hsg) hsd.f6563c).m17531a(1);
                                launchOptions = new LaunchOptions();
                                launchOptions.setX(0, 1);
                                launchOptions.setY(0, hsd.f6565e.f6546a.getHeight());
                                hsg = (hsg) hsd.f6563c;
                                allocation = hsd.f6565e.f6548c;
                                if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                                    hsg.forEach(5, allocation, null, null, launchOptions);
                                } else {
                                    throw new RSRuntimeException("Type mismatch with U8_4!");
                                }
                            }
                            ((hsg) hsd.f6563c).m17531a(0);
                            hsg = (hsg) hsd.f6563c;
                            allocation = hsd.f6565e.f6548c;
                            if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                                hsg.forEach(7, allocation, null, null, null);
                                hsg = (hsg) hsd.f6563c;
                                allocation = hsd.f6565e.f6548c;
                                if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                                    hsg.forEach(9, allocation, null, null, null);
                                    if (progressCallback != null) {
                                        i3 = hrz2.f6536c.length;
                                        progressCallback.setProgress(((float) (i3 - c)) / ((float) i3));
                                    }
                                    c--;
                                } else {
                                    throw new RSRuntimeException("Type mismatch with U8_4!");
                                }
                            }
                            throw new RSRuntimeException("Type mismatch with U8_4!");
                        }
                        throw new RSRuntimeException("Type mismatch with U8_4!");
                    }
                    throw new RSRuntimeException("Type mismatch with U8_4!");
                }
                obj = 1;
                if (obj == null) {
                    bitmap3 = null;
                } else {
                    c = 0;
                    while (c < hrz2.f6537d) {
                        if (progressCallback != null && progressCallback.wasCancelled()) {
                            obj = null;
                            break;
                        }
                        hsc2 = hrz2.f6536c[c];
                        hsd.m3334a(hsc2);
                        hsd.m3333a(hsd.m3332a(hsc2.f6559a, hrz2));
                        hsd.m3335b(c, hrz2);
                        hsg = (hsg) hsd.f6563c;
                        allocation = hsd.f6565e.f6548c;
                        if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                            hsg.forEach(2, allocation, null, null, null);
                            hsg = (hsg) hsd.f6563c;
                            allocation = hsd.f6565e.f6548c;
                            if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                                hsg.forEach(4, allocation, null, null, null);
                                if (hsd.f6564d) {
                                    ((hsg) hsd.f6563c).m17531a(1);
                                    launchOptions = new LaunchOptions();
                                    launchOptions.setX(0, 1);
                                    launchOptions.setY(0, hsd.f6565e.f6546a.getHeight());
                                    hsg = (hsg) hsd.f6563c;
                                    allocation = hsd.f6565e.f6548c;
                                    if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                                        hsg.forEach(6, allocation, null, null, launchOptions);
                                    } else {
                                        throw new RSRuntimeException("Type mismatch with U8_4!");
                                    }
                                }
                                ((hsg) hsd.f6563c).m17531a(0);
                                hsg = (hsg) hsd.f6563c;
                                allocation = hsd.f6565e.f6548c;
                                if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                                    hsg.forEach(8, allocation, null, null, null);
                                    if (progressCallback != null) {
                                        i3 = hrz2.f6536c.length;
                                        progressCallback.setProgress(((float) (((i3 - hrz2.f6537d) + 1) + c)) / ((float) i3));
                                    }
                                    c++;
                                } else {
                                    throw new RSRuntimeException("Type mismatch with U8_4!");
                                }
                            }
                            throw new RSRuntimeException("Type mismatch with U8_4!");
                        }
                        throw new RSRuntimeException("Type mismatch with U8_4!");
                    }
                    hsg = (hsg) hsd.f6563c;
                    allocation = hsd.f6565e.f6548c;
                    if (allocation.getType().getElement().isCompatible(hsg.f23332a)) {
                        hsg.forEach(10, allocation, null, null, null);
                        obj = 1;
                        if (obj != null) {
                            hsg = (hsg) hsd.f6563c;
                            Allocation allocation2 = hsd.f6565e.f6549d;
                            if (allocation2.getType().getElement().isCompatible(hsg.f23332a)) {
                                hsg.forEach(11, null, allocation2, null, null);
                                hsa hsa2 = hsd.f6565e;
                                hsa2.f6549d.copyTo(hsa2.f6547b);
                                bitmap3 = hsd.f6565e.f6547b;
                                hsd.f6562b.finish();
                                bli.m863a(hsd.f6561a, "filterAndBlendAllLayersUsingKernel is finished");
                            } else {
                                throw new RSRuntimeException("Type mismatch with U8_4!");
                            }
                        }
                        bitmap3 = null;
                    } else {
                        throw new RSRuntimeException("Type mismatch with U8_4!");
                    }
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                String str = hsf.f6571a;
                StringBuilder stringBuilder = new StringBuilder(57);
                stringBuilder.append("applyRefocusFilter is finished in ");
                stringBuilder.append(((float) (currentTimeMillis3 - currentTimeMillis2)) / 1000.0f);
                stringBuilder.append(" seconds");
                bli.m863a(str, stringBuilder.toString());
                currentTimeMillis3 = System.currentTimeMillis();
                str = TAG;
                stringBuilder = new StringBuilder(55);
                stringBuilder.append("using RenderScript, finishes in ");
                stringBuilder.append(((float) (currentTimeMillis3 - currentTimeMillis)) / 1000.0f);
                stringBuilder.append(" seconds");
                bli.m863a(str, stringBuilder.toString());
                hse.f6566a.unlock();
                return bitmap3;
            }
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        long currentTimeMillis4 = System.currentTimeMillis();
        i = depthOfFieldOptions.rgbz.getWidth();
        i4 = depthOfFieldOptions.rgbz.getHeight();
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, i4, Config.ARGB_8888);
        }
        if (!ProcessingNative.DepthOfField(depthOfFieldOptions, progressCallback, bitmap)) {
            return null;
        }
        currentTimeMillis3 = System.currentTimeMillis();
        String str2 = TAG;
        StringBuilder stringBuilder2 = new StringBuilder(49);
        stringBuilder2.append("using Native, finishes in ");
        stringBuilder2.append(((float) (currentTimeMillis3 - currentTimeMillis4)) / 1000.0f);
        stringBuilder2.append(" seconds");
        bli.m863a(str2, stringBuilder2.toString());
        return bitmap;
    }
}
