public interface WPService {
    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    String base = "/wp/v2"

    @GET(base+"/posts")
    Call<List<WPBlog>> find(@Query("page") int sort,
                            @Query("per_page") int sort,
                            @Query("search") String sort,
                            @Query("author") List[int] sort,
                            @Query("author_exclude") List[int] sort,
                            @Query("exclude") List[int] sort,
                            @Query("include") List[int] sort,
                            @Query("offset") int sort,
                            @Query("order") String sort,
                            @Query("orderby") String sort,
                            @Query("status") List[int] sort,
                            @Query("categories") List[int] sort,
                            @Query("categories_exclude") List[int] sort,
                            @Query("tags") List[int] sort,
                            @Query("tags_exclude") List[int] sort);

    @POST(base+"/posts")
    Call<WPBlog> save(@Body WPBlog blog);

    @GET(base+"/posts/{id}")
    Call<UseWPBlogr> get(@Path("id") String posdId,
                         @Path("password") String password);

    @POST(base+"/posts/{id}")
    Call<WPBlog> update(@Path("id") String posdId,
                     @Body WPBlog blog);

    @GET(base+"/posts/{postId}/revisions")
    Call<List<WPRevision>> findRevisions(@Path("postId") String posdId);

    @GET(base+"/posts/{postId}/revisions/{revisionId}")
    Call<WPRevision> getRevision(@Path("postId") String posdId,
                                  @Path("revisionId") String revisionId);

    @DELETE(base+"/posts/{postId}/revisions/{revisionId}")
    Call<WPRevision> deleteRevision(@Path("postId") String posdId,
                                  @Path("revisionId") String revisionId);
}