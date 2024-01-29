package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * YoutubeTicket
 */

@JsonTypeName("youtubeTicket")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class YoutubeTicket {

  private Integer ticketId;

  private JsonNullable<String> customerName = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileNo = JsonNullable.<String>undefined();

  private JsonNullable<String> email = JsonNullable.<String>undefined();

  private JsonNullable<String> city = JsonNullable.<String>undefined();

  private JsonNullable<String> state = JsonNullable.<String>undefined();

  private JsonNullable<String> pincode = JsonNullable.<String>undefined();

  private JsonNullable<String> reference = JsonNullable.<String>undefined();

  private Integer adultCount;

  private Integer childCount;

  private Integer adultRate;

  private Integer childRate;

  private Double totalAmount;

  private JsonNullable<Double> discountInPercent = JsonNullable.<Double>undefined();

  private Double finalAmount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime ticketDate;

  private JsonNullable<String> ticketNo = JsonNullable.<String>undefined();

  public YoutubeTicket ticketId(Integer ticketId) {
    this.ticketId = ticketId;
    return this;
  }

  /**
   * Get ticketId
   * @return ticketId
  */
  
  @Schema(name = "ticketId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketId")
  public Integer getTicketId() {
    return ticketId;
  }

  public void setTicketId(Integer ticketId) {
    this.ticketId = ticketId;
  }

  public YoutubeTicket customerName(String customerName) {
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

  public YoutubeTicket mobileNo(String mobileNo) {
    this.mobileNo = JsonNullable.of(mobileNo);
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  */
  
  @Schema(name = "mobileNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNo")
  public JsonNullable<String> getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(JsonNullable<String> mobileNo) {
    this.mobileNo = mobileNo;
  }

  public YoutubeTicket email(String email) {
    this.email = JsonNullable.of(email);
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public JsonNullable<String> getEmail() {
    return email;
  }

  public void setEmail(JsonNullable<String> email) {
    this.email = email;
  }

  public YoutubeTicket city(String city) {
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

  public YoutubeTicket state(String state) {
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

  public YoutubeTicket pincode(String pincode) {
    this.pincode = JsonNullable.of(pincode);
    return this;
  }

  /**
   * Get pincode
   * @return pincode
  */
  
  @Schema(name = "pincode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pincode")
  public JsonNullable<String> getPincode() {
    return pincode;
  }

  public void setPincode(JsonNullable<String> pincode) {
    this.pincode = pincode;
  }

  public YoutubeTicket reference(String reference) {
    this.reference = JsonNullable.of(reference);
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  
  @Schema(name = "reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public JsonNullable<String> getReference() {
    return reference;
  }

  public void setReference(JsonNullable<String> reference) {
    this.reference = reference;
  }

  public YoutubeTicket adultCount(Integer adultCount) {
    this.adultCount = adultCount;
    return this;
  }

  /**
   * Get adultCount
   * @return adultCount
  */
  
  @Schema(name = "adultCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adultCount")
  public Integer getAdultCount() {
    return adultCount;
  }

  public void setAdultCount(Integer adultCount) {
    this.adultCount = adultCount;
  }

  public YoutubeTicket childCount(Integer childCount) {
    this.childCount = childCount;
    return this;
  }

  /**
   * Get childCount
   * @return childCount
  */
  
  @Schema(name = "childCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("childCount")
  public Integer getChildCount() {
    return childCount;
  }

  public void setChildCount(Integer childCount) {
    this.childCount = childCount;
  }

  public YoutubeTicket adultRate(Integer adultRate) {
    this.adultRate = adultRate;
    return this;
  }

  /**
   * Get adultRate
   * @return adultRate
  */
  
  @Schema(name = "adultRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adultRate")
  public Integer getAdultRate() {
    return adultRate;
  }

  public void setAdultRate(Integer adultRate) {
    this.adultRate = adultRate;
  }

  public YoutubeTicket childRate(Integer childRate) {
    this.childRate = childRate;
    return this;
  }

  /**
   * Get childRate
   * @return childRate
  */
  
  @Schema(name = "childRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("childRate")
  public Integer getChildRate() {
    return childRate;
  }

  public void setChildRate(Integer childRate) {
    this.childRate = childRate;
  }

  public YoutubeTicket totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  
  @Schema(name = "totalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalAmount")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public YoutubeTicket discountInPercent(Double discountInPercent) {
    this.discountInPercent = JsonNullable.of(discountInPercent);
    return this;
  }

  /**
   * Get discountInPercent
   * @return discountInPercent
  */
  
  @Schema(name = "discountInPercent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountInPercent")
  public JsonNullable<Double> getDiscountInPercent() {
    return discountInPercent;
  }

  public void setDiscountInPercent(JsonNullable<Double> discountInPercent) {
    this.discountInPercent = discountInPercent;
  }

  public YoutubeTicket finalAmount(Double finalAmount) {
    this.finalAmount = finalAmount;
    return this;
  }

  /**
   * Get finalAmount
   * @return finalAmount
  */
  
  @Schema(name = "finalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finalAmount")
  public Double getFinalAmount() {
    return finalAmount;
  }

  public void setFinalAmount(Double finalAmount) {
    this.finalAmount = finalAmount;
  }

  public YoutubeTicket ticketDate(OffsetDateTime ticketDate) {
    this.ticketDate = ticketDate;
    return this;
  }

  /**
   * Get ticketDate
   * @return ticketDate
  */
  @Valid 
  @Schema(name = "ticketDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketDate")
  public OffsetDateTime getTicketDate() {
    return ticketDate;
  }

  public void setTicketDate(OffsetDateTime ticketDate) {
    this.ticketDate = ticketDate;
  }

  public YoutubeTicket ticketNo(String ticketNo) {
    this.ticketNo = JsonNullable.of(ticketNo);
    return this;
  }

  /**
   * Get ticketNo
   * @return ticketNo
  */
  
  @Schema(name = "ticketNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketNo")
  public JsonNullable<String> getTicketNo() {
    return ticketNo;
  }

  public void setTicketNo(JsonNullable<String> ticketNo) {
    this.ticketNo = ticketNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YoutubeTicket youtubeTicket = (YoutubeTicket) o;
    return Objects.equals(this.ticketId, youtubeTicket.ticketId) &&
        equalsNullable(this.customerName, youtubeTicket.customerName) &&
        equalsNullable(this.mobileNo, youtubeTicket.mobileNo) &&
        equalsNullable(this.email, youtubeTicket.email) &&
        equalsNullable(this.city, youtubeTicket.city) &&
        equalsNullable(this.state, youtubeTicket.state) &&
        equalsNullable(this.pincode, youtubeTicket.pincode) &&
        equalsNullable(this.reference, youtubeTicket.reference) &&
        Objects.equals(this.adultCount, youtubeTicket.adultCount) &&
        Objects.equals(this.childCount, youtubeTicket.childCount) &&
        Objects.equals(this.adultRate, youtubeTicket.adultRate) &&
        Objects.equals(this.childRate, youtubeTicket.childRate) &&
        Objects.equals(this.totalAmount, youtubeTicket.totalAmount) &&
        equalsNullable(this.discountInPercent, youtubeTicket.discountInPercent) &&
        Objects.equals(this.finalAmount, youtubeTicket.finalAmount) &&
        Objects.equals(this.ticketDate, youtubeTicket.ticketDate) &&
        equalsNullable(this.ticketNo, youtubeTicket.ticketNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId, hashCodeNullable(customerName), hashCodeNullable(mobileNo), hashCodeNullable(email), hashCodeNullable(city), hashCodeNullable(state), hashCodeNullable(pincode), hashCodeNullable(reference), adultCount, childCount, adultRate, childRate, totalAmount, hashCodeNullable(discountInPercent), finalAmount, ticketDate, hashCodeNullable(ticketNo));
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
    sb.append("class YoutubeTicket {\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    adultCount: ").append(toIndentedString(adultCount)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    adultRate: ").append(toIndentedString(adultRate)).append("\n");
    sb.append("    childRate: ").append(toIndentedString(childRate)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    discountInPercent: ").append(toIndentedString(discountInPercent)).append("\n");
    sb.append("    finalAmount: ").append(toIndentedString(finalAmount)).append("\n");
    sb.append("    ticketDate: ").append(toIndentedString(ticketDate)).append("\n");
    sb.append("    ticketNo: ").append(toIndentedString(ticketNo)).append("\n");
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

