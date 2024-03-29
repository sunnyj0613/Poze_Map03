package com.example.sunny.poze_map03.map_cluster.clustering;

import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.geometry.LatLng;

/**
 * ClusterItem represents a marker on the map.
 * <p>
 * Inspired by https://github.com/googlemaps/android-maps-utils.
 * </p>
 */
public interface ClusterItem {

  /**
   * The position of this marker. This must always return the same value.
   */
  LatLng getPosition();

  /**
   * The title of this marker.
   */
  String getTitle();

  /**
   * The description of this marker.
   */
  String getSnippet();

  Icon getIcon();
}