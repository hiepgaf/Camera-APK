package p000;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.FilterGraph.Builder;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.BranchFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.image.BoxFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.image.ToGrayFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.android.libraries.smartburst.filterpacks.image.ImageStatisticsFilter;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionAnalysisFilter;

/* compiled from: PG */
/* renamed from: jls */
public final class jls implements GraphFactory {
    public final FilterGraph create(MffContext mffContext) {
        Builder builder = new Builder(mffContext);
        builder.addVariable("videoProvider", null);
        builder.addVariable("targetFrameRate", Float.valueOf(30.0f));
        Filter videoProviderSource = new VideoProviderSource(mffContext, "camera");
        builder.addFilter(videoProviderSource);
        builder.assignVariableToFilterInput("videoProvider", "camera", "provider");
        builder.assignValueToFilterInput(Integer.valueOf(MediaDecoder.ROTATE_180), "camera", "minDimension");
        builder.assignValueToFilterInput(Integer.valueOf(4), "camera", "multipleOfX");
        builder.assignVariableToFilterInput("targetFrameRate", "camera", MotionAnalysisFilter.FRAME_RATE);
        Filter toGrayFilter = new ToGrayFilter(mffContext, "toGray");
        builder.addFilter(toGrayFilter);
        Filter branchFilter = new BranchFilter(mffContext, "inputBranch");
        builder.addFilter(branchFilter);
        Filter boxFilter = new BoxFilter(mffContext, "verticalBoxFilter");
        builder.addFilter(boxFilter);
        Integer valueOf = Integer.valueOf(1);
        builder.assignValueToFilterInput(valueOf, "verticalBoxFilter", "filterWidth");
        Integer valueOf2 = Integer.valueOf(7);
        builder.assignValueToFilterInput(valueOf2, "verticalBoxFilter", "filterHeight");
        Filter boxFilter2 = new BoxFilter(mffContext, "horizontalBoxFilter");
        builder.addFilter(boxFilter2);
        builder.assignValueToFilterInput(valueOf2, "horizontalBoxFilter", "filterWidth");
        builder.assignValueToFilterInput(valueOf, "horizontalBoxFilter", "filterHeight");
        Filter imageStatisticsFilter = new ImageStatisticsFilter(mffContext, "imageStats");
        builder.addFilter(imageStatisticsFilter);
        valueOf2 = Integer.valueOf(5);
        builder.assignValueToFilterInput(valueOf2, "imageStats", "numBlocksX");
        builder.assignValueToFilterInput(valueOf2, "imageStats", "numBlocksY");
        builder.connect(videoProviderSource, "video", toGrayFilter, "image");
        builder.connect(toGrayFilter, "image", branchFilter, "input");
        builder.connect(branchFilter, "toHorizontalBlur", boxFilter2, "image");
        builder.connect(boxFilter2, "image", imageStatisticsFilter, "blurredX");
        builder.connect(branchFilter, "toVerticalBlur", boxFilter, "image");
        builder.connect(boxFilter, "image", imageStatisticsFilter, "blurredY");
        builder.connect(branchFilter, "toImageStats", imageStatisticsFilter, "image");
        return builder.build();
    }
}
