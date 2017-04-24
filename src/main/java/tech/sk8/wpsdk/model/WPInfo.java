
package tech.sk8.wpsdk.model;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class WPInfo implements Serializable, Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("home")
    @Expose
    private String home;
    @SerializedName("gmt_offset")
    @Expose
    private Integer gmtOffset;
    @SerializedName("timezone_string")
    @Expose
    private String timezoneString;
    @SerializedName("namespaces")
    @Expose
    private List<String> namespaces = null;
    @SerializedName("authentication")
    @Expose
    private List<Object> authentication = null;
    public final static Parcelable.Creator<WPInfo> CREATOR = new Creator<WPInfo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WPInfo createFromParcel(Parcel in) {
            WPInfo instance = new WPInfo();
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.description = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.home = ((String) in.readValue((String.class.getClassLoader())));
            instance.gmtOffset = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.timezoneString = ((String) in.readValue((String.class.getClassLoader())));
            in.readList(instance.namespaces, (java.lang.String.class.getClassLoader()));
            in.readList(instance.authentication, (java.lang.Object.class.getClassLoader()));
            return instance;
        }

        public WPInfo[] newArray(int size) {
            return (new WPInfo[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8349450988197406184L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WPInfo() {
    }

    /**
     * 
     * @param timezoneString
     * @param home
     * @param authentication
     * @param description
     * @param name
     * @param gmtOffset
     * @param namespaces
     * @param url
     */
    public WPInfo(String name, String description, String url, String home, Integer gmtOffset, String timezoneString, List<String> namespaces, List<Object> authentication) {
        super();
        this.name = name;
        this.description = description;
        this.url = url;
        this.home = home;
        this.gmtOffset = gmtOffset;
        this.timezoneString = timezoneString;
        this.namespaces = namespaces;
        this.authentication = authentication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Integer getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(Integer gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public String getTimezoneString() {
        return timezoneString;
    }

    public void setTimezoneString(String timezoneString) {
        this.timezoneString = timezoneString;
    }

    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public List<Object> getAuthentication() {
        return authentication;
    }

    public void setAuthentication(List<Object> authentication) {
        this.authentication = authentication;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(description).append(url).append(home).append(gmtOffset).append(timezoneString).append(namespaces).append(authentication).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WPInfo) == false) {
            return false;
        }
        WPInfo rhs = ((WPInfo) other);
        return new EqualsBuilder().append(name, rhs.name).append(description, rhs.description).append(url, rhs.url).append(home, rhs.home).append(gmtOffset, rhs.gmtOffset).append(timezoneString, rhs.timezoneString).append(namespaces, rhs.namespaces).append(authentication, rhs.authentication).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(url);
        dest.writeValue(home);
        dest.writeValue(gmtOffset);
        dest.writeValue(timezoneString);
        dest.writeList(namespaces);
        dest.writeList(authentication);
    }

    public int describeContents() {
        return  0;
    }

}
