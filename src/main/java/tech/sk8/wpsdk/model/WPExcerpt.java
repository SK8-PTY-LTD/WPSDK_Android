
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

public class WPExcerpt implements Serializable, Parcelable
{

    @SerializedName("rendered")
    @Expose
    private String rendered;
    @SerializedName("protected")
    @Expose
    private Boolean _protected;
    public final static Parcelable.Creator<WPExcerpt> CREATOR = new Creator<WPExcerpt>() {


        @SuppressWarnings({
            "unchecked"
        })
        public WPExcerpt createFromParcel(Parcel in) {
            WPExcerpt instance = new WPExcerpt();
            instance.rendered = ((String) in.readValue((String.class.getClassLoader())));
            instance._protected = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            return instance;
        }

        public WPExcerpt[] newArray(int size) {
            return (new WPExcerpt[size]);
        }

    }
    ;
    private final static long serialVersionUID = -2651972693878460889L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WPExcerpt() {
    }

    /**
     * 
     * @param rendered
     * @param _protected
     */
    public WPExcerpt(String rendered, Boolean _protected) {
        super();
        this.rendered = rendered;
        this._protected = _protected;
    }

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rendered).append(_protected).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WPExcerpt) == false) {
            return false;
        }
        WPExcerpt rhs = ((WPExcerpt) other);
        return new EqualsBuilder().append(rendered, rhs.rendered).append(_protected, rhs._protected).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(rendered);
        dest.writeValue(_protected);
    }

    public int describeContents() {
        return  0;
    }

}
