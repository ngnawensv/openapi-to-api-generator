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
 * ZoomCarReview
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class ZoomCarReview {

  private Integer carRatingId;

  private Integer carId;

  private Integer bookingId;

  private Integer rating;

  private JsonNullable<String> reviewTitle = JsonNullable.<String>undefined();

  private String review;

  public ZoomCarReview() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ZoomCarReview(Integer carId, Integer bookingId, Integer rating, String review) {
    this.carId = carId;
    this.bookingId = bookingId;
    this.rating = rating;
    this.review = review;
  }

  public ZoomCarReview carRatingId(Integer carRatingId) {
    this.carRatingId = carRatingId;
    return this;
  }

  /**
   * Get carRatingId
   * @return carRatingId
  */
  
  @Schema(name = "carRatingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carRatingId")
  public Integer getCarRatingId() {
    return carRatingId;
  }

  public void setCarRatingId(Integer carRatingId) {
    this.carRatingId = carRatingId;
  }

  public ZoomCarReview carId(Integer carId) {
    this.carId = carId;
    return this;
  }

  /**
   * Get carId
   * @return carId
  */
  @NotNull 
  @Schema(name = "carId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("carId")
  public Integer getCarId() {
    return carId;
  }

  public void setCarId(Integer carId) {
    this.carId = carId;
  }

  public ZoomCarReview bookingId(Integer bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  @NotNull 
  @Schema(name = "bookingId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bookingId")
  public Integer getBookingId() {
    return bookingId;
  }

  public void setBookingId(Integer bookingId) {
    this.bookingId = bookingId;
  }

  public ZoomCarReview rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  */
  @NotNull 
  @Schema(name = "rating", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public ZoomCarReview reviewTitle(String reviewTitle) {
    this.reviewTitle = JsonNullable.of(reviewTitle);
    return this;
  }

  /**
   * Get reviewTitle
   * @return reviewTitle
  */
  
  @Schema(name = "reviewTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reviewTitle")
  public JsonNullable<String> getReviewTitle() {
    return reviewTitle;
  }

  public void setReviewTitle(JsonNullable<String> reviewTitle) {
    this.reviewTitle = reviewTitle;
  }

  public ZoomCarReview review(String review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
  */
  @NotNull 
  @Schema(name = "review", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("review")
  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoomCarReview zoomCarReview = (ZoomCarReview) o;
    return Objects.equals(this.carRatingId, zoomCarReview.carRatingId) &&
        Objects.equals(this.carId, zoomCarReview.carId) &&
        Objects.equals(this.bookingId, zoomCarReview.bookingId) &&
        Objects.equals(this.rating, zoomCarReview.rating) &&
        equalsNullable(this.reviewTitle, zoomCarReview.reviewTitle) &&
        Objects.equals(this.review, zoomCarReview.review);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(carRatingId, carId, bookingId, rating, hashCodeNullable(reviewTitle), review);
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
    sb.append("class ZoomCarReview {\n");
    sb.append("    carRatingId: ").append(toIndentedString(carRatingId)).append("\n");
    sb.append("    carId: ").append(toIndentedString(carId)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    reviewTitle: ").append(toIndentedString(reviewTitle)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
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

