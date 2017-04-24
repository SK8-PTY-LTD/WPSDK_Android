
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

public class WPGuid implements Serializable, Parcelable
{

    @SerializedName("rendered")
    @Expose
    private String rendered;
    public final static Parcelable.Creator<WPGuid> CREATOR = new Creator<WPGuid>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WPGuid createFromParcel(Parcel in) {
            WPGuid instance = new WPGuid();
            instance.rendered = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public WPGuid[] newArray(int size) {
            return (new WPGuid[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6673041655756057364L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WPGuid() {
    }

    /**
     * 
     * @param rendered
     */
    public WPGuid(String rendered) {
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
        if ((other instanceof WPGuid) == false) {
            return false;
        }
        WPGuid rhs = ((WPGuid) other);
        return new EqualsBuilder().append(rendered, rhs.rendered).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(rendered);
    }

    public int describeContents() {
        return  0;
    }

}
