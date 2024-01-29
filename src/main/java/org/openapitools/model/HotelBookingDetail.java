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
 * HotelBookingDetail
 */

@JsonTypeName("hotelBookingDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class HotelBookingDetail {

  private Integer bookingDetailId;

  private Integer bookingId;

  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

  private JsonNullable<String> aadharCardNo = JsonNullable.<String>undefined();

  public HotelBookingDetail bookingDetailId(Integer bookingDetailId) {
    this.bookingDetailId = bookingDetailId;
    return this;
  }

  /**
   * Get bookingDetailId
   * @return bookingDetailId
  */
  
  @Schema(name = "bookingDetailId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingDetailId")
  public Integer getBookingDetailId() {
    return bookingDetailId;
  }

  public void setBookingDetailId(Integer bookingDetailId) {
    this.bookingDetailId = bookingDetailId;
  }

  public HotelBookingDetail bookingId(Integer bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  
  @Schema(name = "bookingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bookingId")
  public Integer getBookingId() {
    return bookingId;
  }

  public void setBookingId(Integer bookingId) {
    this.bookingId = bookingId;
  }

  public HotelBookingDetail customerName(String customerName) {
    this.customerName = JsonNullable.of(customerName);
    return this;
  }

  /**
   * Get customerName
   * @return customerName
  */
  
  @Schema(name = "customerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerName")
  public JsonNullable<String> getCustomerName() {
    return customerName;
  }

  public void setCustomerName(JsonNullable<String> customerName) {
    this.customerName = customerName;
  }

  public HotelBookingDetail aadharCardNo(String aadharCardNo) {
    this.aadharCardNo = JsonNullable.of(aadharCardNo);
    return this;
  }

  /**
   * Get aadharCardNo
   * @return aadharCardNo
  */
  
  @Schema(name = "aadharCardNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aadharCardNo")
  public JsonNullable<String> getAadharCardNo() {
    return aadharCardNo;
  }

  public void setAadharCardNo(JsonNullable<String> aadharCardNo) {
    this.aadharCardNo = aadharCardNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelBookingDetail hotelBookingDetail = (HotelBookingDetail) o;
    return Objects.equals(this.bookingDetailId, hotelBookingDetail.bookingDetailId) &&
        Objects.equals(this.bookingId, hotelBookingDetail.bookingId) &&
        equalsNullable(this.customerName, hotelBookingDetail.customerName) &&
        equalsNullable(this.aadharCardNo, hotelBookingDetail.aadharCardNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingDetailId, bookingId, hashCodeNullable(customerName), hashCodeNullable(aadharCardNo));
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
    sb.append("class HotelBookingDetail {\n");
    sb.append("    bookingDetailId: ").append(toIndentedString(bookingDetailId)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    aadharCardNo: ").append(toIndentedString(aadharCardNo)).append("\n");
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

