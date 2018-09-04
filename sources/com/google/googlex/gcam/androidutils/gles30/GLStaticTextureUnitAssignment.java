package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import java.util.ArrayList;

/* compiled from: PG */
public class GLStaticTextureUnitAssignment {
    public GLProgram program;
    public ArrayList samplerIds = new ArrayList();
    public ArrayList textures = new ArrayList();

    public GLStaticTextureUnitAssignment(GLProgram gLProgram) {
        this.program = gLProgram;
    }

    public void apply() {
        for (int i = 0; i < this.textures.size(); i++) {
            GLES30.glActiveTexture(33984 + i);
            ((GLTexture) this.textures.get(i)).bind();
            GLES30.glUniform1i(((Integer) this.samplerIds.get(i)).intValue(), i);
        }
    }

    public void assign(String str, GLTexture gLTexture) {
        this.textures.add(gLTexture);
        this.samplerIds.add(Integer.valueOf(this.program.getUniformLocation(str)));
    }

    public void reset() {
        this.textures.clear();
        this.samplerIds.clear();
    }
}
