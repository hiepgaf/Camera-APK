package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import java.io.Closeable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
public class GLBufferObject implements Closeable {
    public final int capacityInBytes;
    public int id;
    public final int target;
    public final int usage;

    /* compiled from: PG */
    public final class Target {
        public static final int ARRAY_BUFFER = 34962;
        public static final int COPY_READ_BUFFER = 36662;
        public static final int COPY_WRITE_BUFFER = 36663;
        public static final int ELEMENT_ARRAY_BUFFER = 34963;
        public static final int PIXEL_PACK_BUFFER = 35051;
        public static final int PIXEL_UNPACK_BUFFER = 35052;
        public static final int TRANSFORM_FEEDBACK_BUFFER = 35982;
        public static final int UNIFORM_BUFFER = 35345;

        private Target() {
        }
    }

    /* compiled from: PG */
    public final class Usage {
        public static final int DYNAMIC_COPY = 35050;
        public static final int DYNAMIC_DRAW = 35048;
        public static final int DYNAMIC_READ = 35049;
        public static final int STATIC_COPY = 35046;
        public static final int STATIC_DRAW = 35044;
        public static final int STATIC_READ = 35045;
        public static final int STREAM_COPY = 35042;
        public static final int STREAM_DRAW = 35040;
        public static final int STREAM_READ = 35041;

        private Usage() {
        }
    }

    public GLBufferObject(int i, int i2, int i3) {
        this.capacityInBytes = i;
        this.target = i2;
        this.usage = i3;
        init();
        bind();
        GLES30.glBufferData(i2, i, null, i3);
        unbind();
    }

    public GLBufferObject(ByteBuffer byteBuffer, int i, int i2) {
        this.capacityInBytes = byteBuffer.capacity();
        this.target = i;
        this.usage = i2;
        init();
        bind();
        GLES30.glBufferData(i, this.capacityInBytes, byteBuffer, i2);
        unbind();
    }

    public void bind() {
        GLES30.glBindBuffer(this.target, this.id);
    }

    public int capacityInBytes() {
        return this.capacityInBytes;
    }

    public void close() {
        GLES30.glDeleteBuffers(1, new int[]{this.id}, 0);
        this.id = 0;
    }

    public int id() {
        return this.id;
    }

    private void init() {
        int[] iArr = new int[1];
        GLES30.glGenBuffers(1, iArr, 0);
        this.id = iArr[0];
    }

    public ByteBuffer map(int i) {
        return mapRange(0, this.capacityInBytes, i);
    }

    public ByteBuffer mapRange(int i, int i2, int i3) {
        return ((ByteBuffer) GLES30.glMapBufferRange(this.target, i, i2, i3)).order(ByteOrder.nativeOrder());
    }

    public void setData(int i, int i2, Buffer buffer) {
        GLES30.glBufferSubData(this.target, i, i2, buffer);
    }

    public void unbind() {
        GLES30.glBindBuffer(this.target, 0);
    }

    public void unmap() {
        GLES30.glUnmapBuffer(this.target);
    }

    public int usage() {
        return this.usage;
    }
}
