package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserAddress
 */

@JsonTypeName("userAddress")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class UserAddress {

  private JsonNullable<String> city = JsonNullable.<String>undefined();

  private JsonNullable<String> state = JsonNullable.<String>undefined();

  private JsonNullable<@Size(min = 6) String> pincode = JsonNullable.<String>undefined();

  private JsonNullable<String> addressLine = JsonNullable.<String>undefined();

  public UserAddress city(String city) {
    this.city = JsonNullable.of(city);
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public JsonNullable<String> getCity() {
    return city;
  }

  public void setCity(JsonNullable<String> city) {
    this.city = city;
  }

  public UserAddress state(String state) {
    this.state = JsonNullable.of(state);
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public JsonNullable<String> getState() {
    return state;
  }

  public void setState(JsonNullable<String> state) {
    this.state = state;
  }

  public UserAddress pincode(String pincode) {
    this.pincode = JsonNullable.of(pincode);
    return this;
  }

  /**
   * Get pincode
   * @return pincode
  */
  @Size(min = 6) 
  @Schema(name = "pincode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pincode")
  public JsonNullable<@Size(min = 6) String> getPincode() {
    return pincode;
  }

  public void setPincode(JsonNullable<String> pincode) {
    this.pincode = pincode;
  }

  public UserAddress addressLine(String addressLine) {
    this.addressLine = JsonNullable.of(addressLine);
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
  */
  
  @Schema(name = "addressLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressLine")
  public JsonNullable<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(JsonNullable<String> addressLine) {
    this.addressLine = addressLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAddress userAddress = (UserAddress) o;
    return equalsNullable(this.city, userAddress.city) &&
        equalsNullable(this.state, userAddress.state) &&
        equalsNullable(this.pincode, userAddress.pincode) &&
        equalsNullable(this.addressLine, userAddress.addressLine);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(city), hashCodeNullable(state), hashCodeNullable(pincode), hashCodeNullable(addressLine));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

