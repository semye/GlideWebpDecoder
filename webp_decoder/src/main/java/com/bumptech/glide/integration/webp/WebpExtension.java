package com.bumptech.glide.integration.webp;

import androidx.annotation.NonNull;

import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideType;
import com.bumptech.glide.integration.webp.decoder.WebpDrawable;

/**
 * Created by yesheng on 2020/11/24
 */
@GlideExtension
public final class WebpExtension {

    private WebpExtension() {
    }

    @NonNull
    @GlideType(WebpDrawable.class)
    public static RequestBuilder<WebpDrawable> asWebp(@NonNull RequestBuilder<WebpDrawable> builder) {
        return builder;
    }
}
