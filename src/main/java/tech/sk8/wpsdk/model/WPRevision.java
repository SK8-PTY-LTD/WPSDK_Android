
package tech.sk8.wpsdk.model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class WPRevision implements Serializable, Parcelable
{

    @SerializedName("author")
    @Expose
    private Integer author;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;
    @SerializedName("parent")
    @Expose
    private Integer parent;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("guid")
    @Expose
    private Guid guid;
    @SerializedName("title")
    @Expose
    private WPTitle title;
    @SerializedName("content")
    @Expose
    private WPContent content;
    @SerializedName("excerpt")
    @Expose
    private WPExcerpt excerpt;
    public final static Parcelable.Creator<WPRevision> CREATOR = new Creator<WPRevision>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WPRevision createFromParcel(Parcel in) {
            WPRevision instance = new WPRevision();
            instance.author = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.date = ((String) in.readValue((String.class.getClassLoader())));
            instance.dateGmt = ((String) in.readValue((String.class.getClassLoader())));
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.modified = ((String) in.readValue((String.class.getClassLoader())));
            instance.modifiedGmt = ((String) in.readValue((String.class.getClassLoader())));
            instance.parent = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.slug = ((String) in.readValue((String.class.getClassLoader())));
            instance.guid = ((Guid) in.readValue((Guid.class.getClassLoader())));
            instance.title = ((WPTitle) in.readValue((WPTitle.class.getClassLoader())));
            instance.content = ((WPContent) in.readValue((WPContent.class.getClassLoader())));
            instance.excerpt = ((WPExcerpt) in.readValue((WPExcerpt.class.getClassLoader())));
            return instance;
        }

        public WPRevision[] newArray(int size) {
            return (new WPRevision[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7764087942527986062L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WPRevision() {
    }

    /**
     * 
     * @param content
     * @param guid
     * @param modifiedGmt
     * @param id
     * @param author
     * @param title
     * @param excerpt
     * @param parent
     * @param slug
     * @param dateGmt
     * @param date
     * @param modified
     */
    public WPRevision(Integer author, String date, String dateGmt, Integer id, String modified, String modifiedGmt, Integer parent, String slug, Guid guid, WPTitle title, WPContent content, WPExcerpt excerpt) {
        super();
        this.author = author;
        this.date = date;
        this.dateGmt = dateGmt;
        this.id = id;
        this.modified = modified;
        this.modifiedGmt = modifiedGmt;
        this.parent = parent;
        this.slug = slug;
        this.guid = guid;
        this.title = title;
        this.content = content;
        this.excerpt = excerpt;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(author).append(date).append(dateGmt).append(id).append(modified).append(modifiedGmt).append(parent).append(slug).append(guid).append(title).append(content).append(excerpt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WPRevision) == false) {
            return false;
        }
        WPRevision rhs = ((WPRevision) other);
        return new EqualsBuilder().append(author, rhs.author).append(date, rhs.date).append(dateGmt, rhs.dateGmt).append(id, rhs.id).append(modified, rhs.modified).append(modifiedGmt, rhs.modifiedGmt).append(parent, rhs.parent).append(slug, rhs.slug).append(guid, rhs.guid).append(title, rhs.title).append(content, rhs.content).append(excerpt, rhs.excerpt).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(author);
        dest.writeValue(date);
        dest.writeValue(dateGmt);
        dest.writeValue(id);
        dest.writeValue(modified);
        dest.writeValue(modifiedGmt);
        dest.writeValue(parent);
        dest.writeValue(slug);
        dest.writeValue(guid);
        dest.writeValue(title);
        dest.writeValue(content);
        dest.writeValue(excerpt);
    }

    public int describeContents() {
        return  0;
    }

}
