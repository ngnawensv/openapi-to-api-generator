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
 * JobCategory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class JobCategory {

  private Integer jobCategoryId;

  private JsonNullable<String> categoryName = JsonNullable.<String>undefined();

  public JobCategory jobCategoryId(Integer jobCategoryId) {
    this.jobCategoryId = jobCategoryId;
    return this;
  }

  /**
   * Get jobCategoryId
   * @return jobCategoryId
  */
  
  @Schema(name = "JobCategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobCategoryId")
  public Integer getJobCategoryId() {
    return jobCategoryId;
  }

  public void setJobCategoryId(Integer jobCategoryId) {
    this.jobCategoryId = jobCategoryId;
  }

  public JobCategory categoryName(String categoryName) {
    this.categoryName = JsonNullable.of(categoryName);
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  */
  
  @Schema(name = "CategoryName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CategoryName")
  public JsonNullable<String> getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(JsonNullable<String> categoryName) {
    this.categoryName = categoryName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCategory jobCategory = (JobCategory) o;
    return Objects.equals(this.jobCategoryId, jobCategory.jobCategoryId) &&
        equalsNullable(this.categoryName, jobCategory.categoryName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobCategoryId, hashCodeNullable(categoryName));
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
    sb.append("class JobCategory {\n");
    sb.append("    jobCategoryId: ").append(toIndentedString(jobCategoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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

