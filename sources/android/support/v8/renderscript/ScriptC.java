package android.support.v8.renderscript;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
public class ScriptC extends Script {
    public static final String TAG = "ScriptC";

    protected ScriptC(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    protected ScriptC(RenderScript renderScript, Resources resources, int i) {
        super(0, renderScript);
        long internalCreate = internalCreate(renderScript, resources, i);
        if (internalCreate == 0) {
            throw new RSRuntimeException("Loading of ScriptC script failed.");
        }
        setID(internalCreate);
    }

    public ScriptC(RenderScript renderScript, String str, byte[] bArr, byte[] bArr2) {
        long internalStringCreate;
        super(0, renderScript);
        if (RenderScript.sPointerSize == 4) {
            internalStringCreate = internalStringCreate(renderScript, str, bArr);
        } else {
            internalStringCreate = internalStringCreate(renderScript, str, bArr2);
        }
        if (internalStringCreate == 0) {
            throw new RSRuntimeException("Loading of ScriptC script failed.");
        }
        setID(internalStringCreate);
    }

    private static synchronized long internalCreate(RenderScript renderScript, Resources resources, int i) {
        long nScriptCCreate;
        synchronized (ScriptC.class) {
            InputStream openRawResource = resources.openRawResource(i);
            try {
                Object obj = new byte[1024];
                int i2 = 0;
                while (true) {
                    Object obj2;
                    int length = obj.length;
                    int i3 = length - i2;
                    if (i3 == 0) {
                        obj2 = new byte[(length + length)];
                        System.arraycopy(obj, 0, obj2, 0, length);
                        i3 = obj2.length - i2;
                    } else {
                        obj2 = obj;
                    }
                    i3 = openRawResource.read(obj2, i2, i3);
                    if (i3 > 0) {
                        i2 = i3 + i2;
                        obj = obj2;
                    } else {
                        openRawResource.close();
                        nScriptCCreate = renderScript.nScriptCCreate(resources.getResourceEntryName(i), renderScript.getApplicationContext().getCacheDir().toString(), obj2, i2);
                    }
                }
            } catch (IOException e) {
                throw new NotFoundException();
            } catch (Throwable th) {
                openRawResource.close();
            }
        }
        return nScriptCCreate;
    }

    private static synchronized long internalStringCreate(RenderScript renderScript, String str, byte[] bArr) {
        long nScriptCCreate;
        synchronized (ScriptC.class) {
            nScriptCCreate = renderScript.nScriptCCreate(str, renderScript.getApplicationContext().getCacheDir().toString(), bArr, bArr.length);
        }
        return nScriptCCreate;
    }
}
