
package tech.sk8.wpsdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class WPBlog implements Serializable, Parcelable
{

    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;
    @SerializedName("guid")
    @Expose
    private Guid guid;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private WPTitle title;
    @SerializedName("content")
    @Expose
    private WPContent content;
    @SerializedName("excerpt")
    @Expose
    private WPExcerpt excerpt;
    @SerializedName("author")
    @Expose
    private Integer author;
    @SerializedName("featured_media")
    @Expose
    private Integer featuredMedia;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("sticky")
    @Expose
    private Boolean sticky;
    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("meta")
    @Expose
    private List<Object> meta = null;
    @SerializedName("categories")
    @Expose
    private List<Integer> categories = null;
    @SerializedName("tags")
    @Expose
    private List<Integer> tags = null;
    public final static Parcelable.Creator<WPBlog> CREATOR = new Creator<WPBlog>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WPBlog createFromParcel(Parcel in) {
            WPBlog instance = new WPBlog();
            instance.password = ((String) in.readValue((Integer.class.getClassLoader())));
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.date = ((String) in.readValue((String.class.getClassLoader())));
            instance.dateGmt = ((String) in.readValue((String.class.getClassLoader())));
            instance.guid = ((Guid) in.readValue((Guid.class.getClassLoader())));
            instance.modified = ((String) in.readValue((String.class.getClassLoader())));
            instance.modifiedGmt = ((String) in.readValue((String.class.getClassLoader())));
            instance.slug = ((String) in.readValue((String.class.getClassLoader())));
            instance.status = ((String) in.readValue((String.class.getClassLoader())));
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.link = ((String) in.readValue((String.class.getClassLoader())));
            instance.title = ((WPTitle) in.readValue((WPTitle.class.getClassLoader())));
            instance.content = ((WPContent) in.readValue((WPContent.class.getClassLoader())));
            instance.excerpt = ((WPExcerpt) in.readValue((Excerpt.class.getClassLoader())));
            instance.author = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.featuredMedia = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.commentStatus = ((String) in.readValue((String.class.getClassLoader())));
            instance.pingStatus = ((String) in.readValue((String.class.getClassLoader())));
            instance.sticky = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.template = ((String) in.readValue((String.class.getClassLoader())));
            instance.format = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.meta, (java.lang.Object.class.getClassLoader()));
            in.readList(instance.categories, (java.lang.Integer.class.getClassLoader()));
            in.readList(instance.tags, (java.lang.Integer.class.getClassLoader()));
            return instance;
        }

        public WPBlog[] newArray(int size) {
            return (new WPBlog[size]);
        }

    }
    ;
    private final static long serialVersionUID = -4318221144059018082L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WPBlog() {
    }

    /**
     * 
     * @param tags
     * @param template
     * @param status
     * @param commentStatus
     * @param excerpt
     * @param link
     * @param format
     * @param dateGmt
     * @param date
     * @param type
     * @param pingStatus
     * @param meta
     * @param modified
     * @param id
     * @param guid
     * @param modifiedGmt
     * @param content
     * @param author
     * @param sticky
     * @param title
     * @param featuredMedia
     * @param categories
     * @param slug
     */
    public WPBlog(String password, String date, String dateGmt, String slug, String status, String type, String link, WPTitle title, WPContent content, WPExcerpt excerpt, Integer author, Integer featuredMedia, String commentStatus, String pingStatus, Boolean sticky, String template, String format, List<Object> meta, List<Integer> categories, List<Integer> tags) {
        super();
        this.password = password;
        this.date = date;
        this.dateGmt = dateGmt;
        this.slug = slug;
        this.status = status;
        this.type = type;
        this.link = link;
        this.title = title;
        this.content = content;
        this.excerpt = excerpt;
        this.author = author;
        this.featuredMedia = featuredMedia;
        this.commentStatus = commentStatus;
        this.pingStatus = pingStatus;
        this.sticky = sticky;
        this.template = template;
        this.format = format;
        this.meta = meta;
        this.categories = categories;
        this.tags = tags;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public String getModified() {
        return modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public WPTitle getTitle() {
        return title;
    }

    public void setTitle(WPTitle title) {
        this.title = title;
    }

    public WPContent getContent() {
        return content;
    }

    public void setContent(WPContent content) {
        this.content = content;
    }

    public WPExcerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(WPExcerpt excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(Integer featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public void setSticky(Boolean sticky) {
        this.sticky = sticky;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(date).append(dateGmt).append(guid).append(modified).append(modifiedGmt).append(slug).append(status).append(type).append(link).append(title).append(content).append(excerpt).append(author).append(featuredMedia).append(commentStatus).append(pingStatus).append(sticky).append(template).append(format).append(meta).append(categories).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WPBlog) == false) {
            return false;
        }
        WPBlog rhs = ((WPBlog) other);
        return new EqualsBuilder().append(id, rhs.id).append(date, rhs.date).append(dateGmt, rhs.dateGmt).append(guid, rhs.guid).append(modified, rhs.modified).append(modifiedGmt, rhs.modifiedGmt).append(slug, rhs.slug).append(status, rhs.status).append(type, rhs.type).append(link, rhs.link).append(title, rhs.title).append(content, rhs.content).append(excerpt, rhs.excerpt).append(author, rhs.author).append(featuredMedia, rhs.featuredMedia).append(commentStatus, rhs.commentStatus).append(pingStatus, rhs.pingStatus).append(sticky, rhs.sticky).append(template, rhs.template).append(format, rhs.format).append(meta, rhs.meta).append(categories, rhs.categories).append(tags, rhs.tags).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(password);
        dest.writeValue(id);
        dest.writeValue(date);
        dest.writeValue(dateGmt);
        dest.writeValue(guid);
        dest.writeValue(modified);
        dest.writeValue(modifiedGmt);
        dest.writeValue(slug);
        dest.writeValue(status);
        dest.writeValue(type);
        dest.writeValue(link);
        dest.writeValue(title);
        dest.writeValue(content);
        dest.writeValue(excerpt);
        dest.writeValue(author);
        dest.writeValue(featuredMedia);
        dest.writeValue(commentStatus);
        dest.writeValue(pingStatus);
        dest.writeValue(sticky);
        dest.writeValue(template);
        dest.writeValue(format);
        dest.writeList(meta);
        dest.writeList(categories);
        dest.writeList(tags);
    }

    public int describeContents() {
        return  0;
    }

}
