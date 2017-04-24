
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

public class WPTitle implements Serializable, Parcelable
{

    @SerializedName("rendered")
    @Expose
    private String rendered;
    public final static Parcelable.Creator<WPTitle> CREATOR = new Creator<WPTitle>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WPTitle createFromParcel(Parcel in) {
            WPTitle instance = new WPTitle();
            instance.rendered = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public WPTitle[] newArray(int size) {
            return (new WPTitle[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8021914917520341921L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WPTitle() {
    }

    /**
     * 
     * @param rendered
     */
    public WPTitle(String rendered) {
        super();
        this.rendered = rendered;
    }

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rendered).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Title) == false) {
            return false;
        }
        Title rhs = ((Title) other);
        return new EqualsBuilder().append(rendered, rhs.rendered).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(rendered);
    }

    public int describeContents() {
        return  0;
    }

}
