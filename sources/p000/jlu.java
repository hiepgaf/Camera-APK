package p000;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.FilterGraph.Builder;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.filterpacks.transform.CropFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.android.libraries.smartburst.filterpacks.storage.FrameConsumerFilter;

/* compiled from: PG */
/* renamed from: jlu */
public final class jlu implements GraphFactory {
    public final FilterGraph create(MffContext mffContext) {
        Builder builder = new Builder(mffContext);
        builder.addVariable("videoProvider", null);
        builder.addVariable("cropRect", null);
        Filter videoProviderSource = new VideoProviderSource(mffContext, "camera");
        builder.addFilter(videoProviderSource);
        builder.assignVariableToFilterInput("videoProvider", "camera", "provider");
        builder.assignValueToFilterInput(Integer.valueOf(640), "camera", "maxDimension");
        Filter cropFilter = new CropFilter(mffContext, "cropper");
        builder.addFilter(cropFilter);
        builder.assignVariableToFilterInput("cropRect", "cropper", "cropRect");
        Filter frameConsumerFilter = new FrameConsumerFilter(mffContext, "frameConsumer");
        builder.addFilter(frameConsumerFilter);
        builder.connect(videoProviderSource, "video", cropFilter, "image");
        builder.connect(cropFilter, "image", frameConsumerFilter, "frame");
        return builder.build();
    }
}
