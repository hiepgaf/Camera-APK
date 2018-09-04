package com.google.googlex.gcam.androidutils.gles31;

import android.opengl.GLES31;
import java.io.Closeable;

/* compiled from: PG */
public class GLProgramPipeline implements Closeable {
    public final int id;

    /* compiled from: PG */
    public final class Stages {
        public static final int ALL_SHADER_BITS = -1;
        public static final int COMPUTE_SHADER_BIT = 32;
        public static final int FRAGMENT_SHADER_BIT = 2;
        public static final int VERTEX_SHADER_BIT = 1;

        private Stages() {
        }
    }

    public GLProgramPipeline() {
        int[] iArr = new int[1];
        GLES31.glGenProgramPipelines(1, iArr, 0);
        this.id = iArr[0];
    }

    public void attachProgramToStages(int i, GLSeparableProgram gLSeparableProgram) {
        GLES31.glUseProgramStages(this.id, i, gLSeparableProgram.id());
    }

    public void bind() {
        GLES31.glBindProgramPipeline(this.id);
    }

    public void close() {
        GLES31.glDeleteProgramPipelines(1, new int[]{this.id}, 0);
    }

    public void detachStages(int i) {
        GLES31.glUseProgramStages(this.id, i, 0);
    }

    public String infoLog() {
        return GLES31.glGetProgramPipelineInfoLog(this.id);
    }

    public static void unbindAll() {
        GLES31.glBindProgramPipeline(0);
    }

    public boolean validate() {
        GLES31.glValidateProgramPipeline(this.id);
        int[] iArr = new int[1];
        GLES31.glGetProgramPipelineiv(this.id, 35715, iArr, 0);
        if (iArr[0] == 1) {
            return true;
        }
        return false;
    }
}
