package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * EventMaster
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class EventMaster {

  private Integer eventId;

  private JsonNullable<String> eventName = JsonNullable.<String>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> location = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> startTime = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> endTime = JsonNullable.<String>undefined();

  private JsonNullable<String> imageUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> capacity = JsonNullable.<String>undefined();

  private Double price;

  private Integer organizerId;

  private Boolean isIdentityMandatory;

  private Boolean isCoupleEntryMandatory;

  public EventMaster eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  */
  
  @Schema(name = "EventId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EventId")
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public EventMaster eventName(String eventName) {
    this.eventName = JsonNullable.of(eventName);
    return this;
  }

  /**
   * Get eventName
   * @return eventName
  */
  
  @Schema(name = "EventName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EventName")
  public JsonNullable<String> getEventName() {
    return eventName;
  }

  public void setEventName(JsonNullable<String> eventName) {
    this.eventName = eventName;
  }

  public EventMaster description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "Description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public EventMaster location(String location) {
    this.location = JsonNullable.of(location);
    return this;
  }

  /**
   * Get location
   * @return location
  */
  
  @Schema(name = "Location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Location")
  public JsonNullable<String> getLocation() {
    return location;
  }

  public void setLocation(JsonNullable<String> location) {
    this.location = location;
  }

  public EventMaster startDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @Valid 
  @Schema(name = "StartDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartDate")
  public JsonNullable<OffsetDateTime> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public EventMaster startTime(String startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  
  @Schema(name = "StartTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartTime")
  public JsonNullable<String> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<String> startTime) {
    this.startTime = startTime;
  }

  public EventMaster endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "EndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndDate")
  public JsonNullable<OffsetDateTime> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public EventMaster endTime(String endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  */
  
  @Schema(name = "EndTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndTime")
  public JsonNullable<String> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<String> endTime) {
    this.endTime = endTime;
  }

  public EventMaster imageUrl(String imageUrl) {
    this.imageUrl = JsonNullable.of(imageUrl);
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @Schema(name = "ImageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageUrl")
  public JsonNullable<String> getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(JsonNullable<String> imageUrl) {
    this.imageUrl = imageUrl;
  }

  public EventMaster capacity(String capacity) {
    this.capacity = JsonNullable.of(capacity);
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  */
  
  @Schema(name = "Capacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Capacity")
  public JsonNullable<String> getCapacity() {
    return capacity;
  }

  public void setCapacity(JsonNullable<String> capacity) {
    this.capacity = capacity;
  }

  public EventMaster price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  
  @Schema(name = "Price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public EventMaster organizerId(Integer organizerId) {
    this.organizerId = organizerId;
    return this;
  }

  /**
   * Get organizerId
   * @return organizerId
  */
  
  @Schema(name = "OrganizerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrganizerId")
  public Integer getOrganizerId() {
    return organizerId;
  }

  public void setOrganizerId(Integer organizerId) {
    this.organizerId = organizerId;
  }

  public EventMaster isIdentityMandatory(Boolean isIdentityMandatory) {
    this.isIdentityMandatory = isIdentityMandatory;
    return this;
  }

  /**
   * Get isIdentityMandatory
   * @return isIdentityMandatory
  */
  
  @Schema(name = "IsIdentityMandatory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsIdentityMandatory")
  public Boolean getIsIdentityMandatory() {
    return isIdentityMandatory;
  }

  public void setIsIdentityMandatory(Boolean isIdentityMandatory) {
    this.isIdentityMandatory = isIdentityMandatory;
  }

  public EventMaster isCoupleEntryMandatory(Boolean isCoupleEntryMandatory) {
    this.isCoupleEntryMandatory = isCoupleEntryMandatory;
    return this;
  }

  /**
   * Get isCoupleEntryMandatory
   * @return isCoupleEntryMandatory
  */
  
  @Schema(name = "IsCoupleEntryMandatory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsCoupleEntryMandatory")
  public Boolean getIsCoupleEntryMandatory() {
    return isCoupleEntryMandatory;
  }

  public void setIsCoupleEntryMandatory(Boolean isCoupleEntryMandatory) {
    this.isCoupleEntryMandatory = isCoupleEntryMandatory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventMaster eventMaster = (EventMaster) o;
    return Objects.equals(this.eventId, eventMaster.eventId) &&
        equalsNullable(this.eventName, eventMaster.eventName) &&
        equalsNullable(this.description, eventMaster.description) &&
        equalsNullable(this.location, eventMaster.location) &&
        equalsNullable(this.startDate, eventMaster.startDate) &&
        equalsNullable(this.startTime, eventMaster.startTime) &&
        equalsNullable(this.endDate, eventMaster.endDate) &&
        equalsNullable(this.endTime, eventMaster.endTime) &&
        equalsNullable(this.imageUrl, eventMaster.imageUrl) &&
        equalsNullable(this.capacity, eventMaster.capacity) &&
        Objects.equals(this.price, eventMaster.price) &&
        Objects.equals(this.organizerId, eventMaster.organizerId) &&
        Objects.equals(this.isIdentityMandatory, eventMaster.isIdentityMandatory) &&
        Objects.equals(this.isCoupleEntryMandatory, eventMaster.isCoupleEntryMandatory);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, hashCodeNullable(eventName), hashCodeNullable(description), hashCodeNullable(location), hashCodeNullable(startDate), hashCodeNullable(startTime), hashCodeNullable(endDate), hashCodeNullable(endTime), hashCodeNullable(imageUrl), hashCodeNullable(capacity), price, organizerId, isIdentityMandatory, isCoupleEntryMandatory);
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
    sb.append("class EventMaster {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    organizerId: ").append(toIndentedString(organizerId)).append("\n");
    sb.append("    isIdentityMandatory: ").append(toIndentedString(isIdentityMandatory)).append("\n");
    sb.append("    isCoupleEntryMandatory: ").append(toIndentedString(isCoupleEntryMandatory)).append("\n");
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

