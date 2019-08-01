package com.example.sunny.poze_map03.map_cluster.data;

/**
 * An abstraction that represents a Geometry object
 * <p>
 * Inspired by https://github.com/googlemaps/android-maps-utils.
 * </p>
 *
 * @param <T> the type of Geometry object
 */
public interface Geometry<T> {
  /**
   * Gets the type of geometry
   *
   * @return type of geometry
   */
  public String getGeometryType();

  /**
   * Gets the stored KML Geometry object
   *
   * @return geometry object
   */
  public T getGeometryObject();

}
