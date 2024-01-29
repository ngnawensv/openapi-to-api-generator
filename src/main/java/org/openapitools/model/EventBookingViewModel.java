package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EventBookingMember;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EventBookingViewModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class EventBookingViewModel {

  private Integer bookingId;

  private Integer userId;

  private Integer eventId;

  private Integer noOfTickets;

  @Valid
  private JsonNullable<List<@Valid EventBookingMember>> eventBookingMembers = JsonNullable.<List<@Valid EventBookingMember>>undefined();

  public EventBookingViewModel bookingId(Integer bookingId) {
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

  public EventBookingViewModel userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "UserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public EventBookingViewModel eventId(Integer eventId) {
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

  public EventBookingViewModel noOfTickets(Integer noOfTickets) {
    this.noOfTickets = noOfTickets;
    return this;
  }

  /**
   * Get noOfTickets
   * @return noOfTickets
  */
  
  @Schema(name = "NoOfTickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NoOfTickets")
  public Integer getNoOfTickets() {
    return noOfTickets;
  }

  public void setNoOfTickets(Integer noOfTickets) {
    this.noOfTickets = noOfTickets;
  }

  public EventBookingViewModel eventBookingMembers(List<@Valid EventBookingMember> eventBookingMembers) {
    this.eventBookingMembers = JsonNullable.of(eventBookingMembers);
    return this;
  }

  public EventBookingViewModel addEventBookingMembersItem(EventBookingMember eventBookingMembersItem) {
    if (this.eventBookingMembers == null || !this.eventBookingMembers.isPresent()) {
      this.eventBookingMembers = JsonNullable.of(new ArrayList<>());
    }
    this.eventBookingMembers.get().add(eventBookingMembersItem);
    return this;
  }

  /**
   * Get eventBookingMembers
   * @return eventBookingMembers
  */
  @Valid 
  @Schema(name = "EventBookingMembers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EventBookingMembers")
  public JsonNullable<List<@Valid EventBookingMember>> getEventBookingMembers() {
    return eventBookingMembers;
  }

  public void setEventBookingMembers(JsonNullable<List<@Valid EventBookingMember>> eventBookingMembers) {
    this.eventBookingMembers = eventBookingMembers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventBookingViewModel eventBookingViewModel = (EventBookingViewModel) o;
    return Objects.equals(this.bookingId, eventBookingViewModel.bookingId) &&
        Objects.equals(this.userId, eventBookingViewModel.userId) &&
        Objects.equals(this.eventId, eventBookingViewModel.eventId) &&
        Objects.equals(this.noOfTickets, eventBookingViewModel.noOfTickets) &&
        equalsNullable(this.eventBookingMembers, eventBookingViewModel.eventBookingMembers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, userId, eventId, noOfTickets, hashCodeNullable(eventBookingMembers));
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
    sb.append("class EventBookingViewModel {\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    noOfTickets: ").append(toIndentedString(noOfTickets)).append("\n");
    sb.append("    eventBookingMembers: ").append(toIndentedString(eventBookingMembers)).append("\n");
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

