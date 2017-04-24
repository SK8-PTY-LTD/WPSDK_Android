public interface PostService {
    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET("/")
    Call<WPInfo> get();

}