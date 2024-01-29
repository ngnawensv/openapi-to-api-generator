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
 * QuizCategory
 */

@JsonTypeName("quizCategory")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class QuizCategory {

  private Integer categoryId;

  private JsonNullable<String> categoryName = JsonNullable.<String>undefined();

  private Integer parentCategoryId;

  private JsonNullable<String> imageUrl = JsonNullable.<String>undefined();

  public QuizCategory categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "categoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public QuizCategory categoryName(String categoryName) {
    this.categoryName = JsonNullable.of(categoryName);
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  */
  
  @Schema(name = "categoryName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryName")
  public JsonNullable<String> getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(JsonNullable<String> categoryName) {
    this.categoryName = categoryName;
  }

  public QuizCategory parentCategoryId(Integer parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
    return this;
  }

  /**
   * Get parentCategoryId
   * @return parentCategoryId
  */
  
  @Schema(name = "parentCategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentCategoryId")
  public Integer getParentCategoryId() {
    return parentCategoryId;
  }

  public void setParentCategoryId(Integer parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }

  public QuizCategory imageUrl(String imageUrl) {
    this.imageUrl = JsonNullable.of(imageUrl);
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @Schema(name = "imageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUrl")
  public JsonNullable<String> getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(JsonNullable<String> imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizCategory quizCategory = (QuizCategory) o;
    return Objects.equals(this.categoryId, quizCategory.categoryId) &&
        equalsNullable(this.categoryName, quizCategory.categoryName) &&
        Objects.equals(this.parentCategoryId, quizCategory.parentCategoryId) &&
        equalsNullable(this.imageUrl, quizCategory.imageUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, hashCodeNullable(categoryName), parentCategoryId, hashCodeNullable(imageUrl));
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
    sb.append("class QuizCategory {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

