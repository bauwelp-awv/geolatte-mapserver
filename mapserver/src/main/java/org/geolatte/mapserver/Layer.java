package org.geolatte.mapserver;

import org.geolatte.mapserver.image.Image;
import org.geolatte.mapserver.ows.GetMapRequest;

/**
 *
 *
 * Created by Karel Maesen, Geovise BVBA on 13/04/2018.
 */
public interface Layer {

    String getName();

    Image createMapImage(GetMapRequest request);

}