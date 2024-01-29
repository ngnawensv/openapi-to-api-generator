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
 * InLanguage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
public class InLanguage {

  private Integer languageId;

  private JsonNullable<String> language = JsonNullable.<String>undefined();

  public InLanguage languageId(Integer languageId) {
    this.languageId = languageId;
    return this;
  }

  /**
   * Get languageId
   * @return languageId
  */
  
  @Schema(name = "LanguageId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LanguageId")
  public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }

  public InLanguage language(String language) {
    this.language = JsonNullable.of(language);
    return this;
  }

  /**
   * Get language
   * @return language
  */
  
  @Schema(name = "Language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Language")
  public JsonNullable<String> getLanguage() {
    return language;
  }

  public void setLanguage(JsonNullable<String> language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InLanguage inLanguage = (InLanguage) o;
    return Objects.equals(this.languageId, inLanguage.languageId) &&
        equalsNullable(this.language, inLanguage.language);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageId, hashCodeNullable(language));
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
    sb.append("class InLanguage {\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

