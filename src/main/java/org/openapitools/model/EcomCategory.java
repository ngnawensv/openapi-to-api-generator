package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EcomCategory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class EcomCategory {

  private Integer categoryId;

  private String categoryName;

  private Integer parentCategoryId;

  public EcomCategory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EcomCategory(String categoryName) {
    this.categoryName = categoryName;
  }

  public EcomCategory categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  
  @Schema(name = "CategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CategoryId")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public EcomCategory categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  */
  @NotNull 
  @Schema(name = "CategoryName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CategoryName")
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public EcomCategory parentCategoryId(Integer parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
    return this;
  }

  /**
   * Get parentCategoryId
   * @return parentCategoryId
  */
  
  @Schema(name = "ParentCategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentCategoryId")
  public Integer getParentCategoryId() {
    return parentCategoryId;
  }

  public void setParentCategoryId(Integer parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcomCategory ecomCategory = (EcomCategory) o;
    return Objects.equals(this.categoryId, ecomCategory.categoryId) &&
        Objects.equals(this.categoryName, ecomCategory.categoryName) &&
        Objects.equals(this.parentCategoryId, ecomCategory.parentCategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryName, parentCategoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcomCategory {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
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

