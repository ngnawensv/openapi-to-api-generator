package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * EventBookingMember
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class EventBookingMember {

  private Integer bookingMemberId;

  private Integer bookingId;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private Integer age;

  private JsonNullable<String> identityCard = JsonNullable.<String>undefined();

  private JsonNullable<String> cardNo = JsonNullable.<String>undefined();

  private JsonNullable<String> contactNo = JsonNullable.<String>undefined();

  public EventBookingMember bookingMemberId(Integer bookingMemberId) {
    this.bookingMemberId = bookingMemberId;
    return this;
  }

  /**
   * Get bookingMemberId
   * @return bookingMemberId
  */
  
  @Schema(name = "BookingMemberId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingMemberId")
  public Integer getBookingMemberId() {
    return bookingMemberId;
  }

  public void setBookingMemberId(Integer bookingMemberId) {
    this.bookingMemberId = bookingMemberId;
  }

  public EventBookingMember bookingId(Integer bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  
  @Schema(name = "BookingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookingId")
  public Integer getBookingId() {
    return bookingId;
  }

  public void setBookingId(Integer bookingId) {
    this.bookingId = bookingId;
  }

  public EventBookingMember name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public EventBookingMember age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  
  @Schema(name = "Age", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public EventBookingMember identityCard(String identityCard) {
    this.identityCard = JsonNullable.of(identityCard);
    return this;
  }

  /**
   * Get identityCard
   * @return identityCard
  */
  
  @Schema(name = "IdentityCard", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IdentityCard")
  public JsonNullable<String> getIdentityCard() {
    return identityCard;
  }

  public void setIdentityCard(JsonNullable<String> identityCard) {
    this.identityCard = identityCard;
  }

  public EventBookingMember cardNo(String cardNo) {
    this.cardNo = JsonNullable.of(cardNo);
    return this;
  }

  /**
   * Get cardNo
   * @return cardNo
  */
  
  @Schema(name = "CardNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CardNo")
  public JsonNullable<String> getCardNo() {
    return cardNo;
  }

  public void setCardNo(JsonNullable<String> cardNo) {
    this.cardNo = cardNo;
  }

  public EventBookingMember contactNo(String contactNo) {
    this.contactNo = JsonNullable.of(contactNo);
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  */
  
  @Schema(name = "ContactNo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContactNo")
  public JsonNullable<String> getContactNo() {
    return contactNo;
  }

  public void setContactNo(JsonNullable<String> contactNo) {
    this.contactNo = contactNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventBookingMember eventBookingMember = (EventBookingMember) o;
    return Objects.equals(this.bookingMemberId, eventBookingMember.bookingMemberId) &&
        Objects.equals(this.bookingId, eventBookingMember.bookingId) &&
        equalsNullable(this.name, eventBookingMember.name) &&
        Objects.equals(this.age, eventBookingMember.age) &&
        equalsNullable(this.identityCard, eventBookingMember.identityCard) &&
        equalsNullable(this.cardNo, eventBookingMember.cardNo) &&
        equalsNullable(this.contactNo, eventBookingMember.contactNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingMemberId, bookingId, hashCodeNullable(name), age, hashCodeNullable(identityCard), hashCodeNullable(cardNo), hashCodeNullable(contactNo));
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
    sb.append("class EventBookingMember {\n");
    sb.append("    bookingMemberId: ").append(toIndentedString(bookingMemberId)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    identityCard: ").append(toIndentedString(identityCard)).append("\n");
    sb.append("    cardNo: ").append(toIndentedString(cardNo)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
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

