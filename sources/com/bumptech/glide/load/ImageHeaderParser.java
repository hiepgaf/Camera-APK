package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.agu;

/* compiled from: PG */
public interface ImageHeaderParser {

    /* compiled from: PG */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        /* renamed from: a */
        private final boolean f2237a;

        private ImageType(boolean z) {
            this.f2237a = z;
        }

        public final boolean hasAlpha() {
            return this.f2237a;
        }
    }

    /* renamed from: a */
    int mo104a(InputStream inputStream, agu agu);

    /* renamed from: a */
    ImageType mo105a(InputStream inputStream);

    /* renamed from: a */
    ImageType mo106a(ByteBuffer byteBuffer);
}
