package tech.sk8.wpsdk;

import android.content.Context;
import android.util.Log;

import tech.sk8.wpsdk.model.Post;
import tech.sk8.wpsdk.service.PostService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * WPSDK is a REST Client for your WordPress 4.7+
 *
 * @author Jack Song
 * @see https://github.com/sk8-pty-ltd/WPSDK_Android
 * @see https://github.com/square/retrofit
 * @see https://github.com/codepath/android_guides/wiki/Consuming-APIs-with-Retrofit
 */
public class WPSDK {

    public static Context context;
    public static Retrofit retrofit;
    public static PostService postService;
    private static RestClient sharedInstance;

    public WPSDK(Context context, String protocol, String domainName) {

        this.context = context;

        String baseURL = protocol + "://" + domainName + "/wp-json";

        retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        postService = retrofit.create(PostService.class);

        sharedInstance = this;
    }

    public static WPSDK getSharedInstance() {
        return sharedInstance;
    }

}

