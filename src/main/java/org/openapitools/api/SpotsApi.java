/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Spot;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-05T15:20:58.426985Z[Etc/UTC]")
@Validated
@Tag(name = "Favorite Spots", description = "the Favorite Spots API")
public interface SpotsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /spots : Create a Favorite Spot
     *
     * @param spot  (required)
     * @return Spot created successfully (status code 201)
     *         or Bad request (status code 400)
     */
    @Operation(
        operationId = "createSpot",
        summary = "Create a Favorite Spot",
        tags = { "Favorite Spots" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Spot created successfully"),
            @ApiResponse(responseCode = "400", description = "Bad request")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/spots",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createSpot(
        @Parameter(name = "Spot", description = "", required = true) @Valid @RequestBody Spot spot
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /spots/{spot_id} : Delete a Favorite Spot
     *
     * @param spotId ID of the spot (required)
     * @return Spot deleted successfully (status code 204)
     *         or Spot not found (status code 404)
     */
    @Operation(
        operationId = "deleteSpot",
        summary = "Delete a Favorite Spot",
        tags = { "Favorite Spots" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Spot deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Spot not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/spots/{spot_id}"
    )
    default ResponseEntity<Void> deleteSpot(
        @Parameter(name = "spot_id", description = "ID of the spot", required = true, in = ParameterIn.PATH) @PathVariable("spot_id") String spotId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /spots/{spot_id} : Get a Favorite Spot by ID
     *
     * @param spotId ID of the spot (required)
     * @return OK (status code 200)
     *         or Spot not found (status code 404)
     */
    @Operation(
        operationId = "getSpot",
        summary = "Get a Favorite Spot by ID",
        tags = { "Favorite Spots" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Spot.class))
            }),
            @ApiResponse(responseCode = "404", description = "Spot not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/spots/{spot_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Spot> getSpot(
        @Parameter(name = "spot_id", description = "ID of the spot", required = true, in = ParameterIn.PATH) @PathVariable("spot_id") String spotId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"coordinates\" : { \"latitude\" : 0.8008281904610115, \"longitude\" : 6.027456183070403 }, \"description\" : \"description\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /spots/{spot_id} : Update a Favorite Spot
     *
     * @param spotId ID of the spot (required)
     * @param spot  (required)
     * @return Spot updated successfully (status code 200)
     *         or Spot not found (status code 404)
     */
    @Operation(
        operationId = "updateSpot",
        summary = "Update a Favorite Spot",
        tags = { "Favorite Spots" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Spot updated successfully"),
            @ApiResponse(responseCode = "404", description = "Spot not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/spots/{spot_id}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateSpot(
        @Parameter(name = "spot_id", description = "ID of the spot", required = true, in = ParameterIn.PATH) @PathVariable("spot_id") String spotId,
        @Parameter(name = "Spot", description = "", required = true) @Valid @RequestBody Spot spot
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}