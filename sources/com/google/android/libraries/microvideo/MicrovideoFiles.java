package com.google.android.libraries.microvideo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.ion;
import p000.wb;
import p000.wd;

/* compiled from: PG */
public final class MicrovideoFiles {
    private MicrovideoFiles() {
    }

    public static wd extractXMPData(File file) {
        return ion.m3951a(file.getPath());
    }

    public static InputStream openVideoStream(File file) {
        Integer i = extractXMPData(file).mo2533i("http://ns.google.com/photos/1.0/camera/", "MicroVideoOffset");
        if (i == null) {
            throw new wb("Property value missing", 5);
        }
        long length = file.length() - ((long) i.intValue());
        if (length <= 0) {
            throw new IOException("Microvideo file seems to be truncated. Provided offset is greater  than or equal to the file size.");
        }
        InputStream fileInputStream = new FileInputStream(file);
        fileInputStream.skip(length);
        return fileInputStream;
    }
}
