package com.google.googlex.gcam.androidutils.gles30;

import android.content.res.Resources;
import android.opengl.GLES30;
import com.google.googlex.gcam.androidutils.AndroidUtilities;
import java.io.Closeable;

/* compiled from: PG */
public class GLShader implements Closeable {
    public final int id;

    /* compiled from: PG */
    public final class ShaderTypes {
        public static final int FRAGMENT_SHADER = 35632;
        public static final int VERTEX_SHADER = 35633;

        private ShaderTypes() {
        }
    }

    public GLShader(int i, Resources resources, int i2) {
        this(i, AndroidUtilities.readRawResource(resources, i2));
    }

    public GLShader(int i, String str) {
        this.id = GLUtilities.loadShader(i, str);
    }

    public void close() {
        GLES30.glDeleteShader(this.id);
    }

    public int getId() {
        return this.id;
    }
}
