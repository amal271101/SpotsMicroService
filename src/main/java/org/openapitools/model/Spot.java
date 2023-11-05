package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SpotCoordinates;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Spot
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-05T15:20:58.426985Z[Etc/UTC]")
public class Spot {

  private String name;

  private SpotCoordinates coordinates;

  private String description;

  /**
   * Default constructor
   * @deprecated Use {@link Spot#Spot(String, SpotCoordinates)}
   */
  @Deprecated
  public Spot() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Spot(String name, SpotCoordinates coordinates) {
    this.name = name;
    this.coordinates = coordinates;
  }

  public Spot name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the spot
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of the spot", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Spot coordinates(SpotCoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
  */
  @NotNull @Valid 
  @Schema(name = "coordinates", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("coordinates")
  public SpotCoordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(SpotCoordinates coordinates) {
    this.coordinates = coordinates;
  }

  public Spot description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the spot
   * @return description
  */
  
  @Schema(name = "description", description = "Description of the spot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Spot spot = (Spot) o;
    return Objects.equals(this.name, spot.name) &&
        Objects.equals(this.coordinates, spot.coordinates) &&
        Objects.equals(this.description, spot.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, coordinates, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Spot {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

