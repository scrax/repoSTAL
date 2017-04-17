/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.xyztouristattractions.provider;

import android.net.Uri;

import com.example.android.xyztouristattractions.common.Attraction;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.SphericalUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Static data content provider.
 */
public class TouristAttractions {

    public static final String CITY_TRENTO = "Trento";

    public static final String TEST_CITY = CITY_TRENTO;

    private static final float TRIGGER_RADIUS = 2000; // 2KM
    private static final int TRIGGER_TRANSITION = Geofence.GEOFENCE_TRANSITION_ENTER |
            Geofence.GEOFENCE_TRANSITION_EXIT;
    private static final long EXPIRATION_DURATION = Geofence.NEVER_EXPIRE;

    public static final Map<String, LatLng> CITY_LOCATIONS = new HashMap<String, LatLng>() {{
        put(CITY_TRENTO, new LatLng(46.067222, 11.1203517));
    }};

    /**
     * All photos used with permission under the Creative Commons Attribution-ShareAlike License.
     */
    public static final HashMap<String, List<Attraction>> ATTRACTIONS =
            new HashMap<String, List<Attraction>>() {{

        put(CITY_TRENTO, new ArrayList<Attraction>() {{
            add(new Attraction(
                    "Parco Nat. Paneveggio Pale di S.Martino", /*Titolo*/
                    "Località Paneveggio 7, Predazzo TN, Trentino.", /*Indirizzo I scheda*/
                    "Il territorio del Parco Naturale Paneveggio Pale di S. Martino è situato nelle Alpi Orientali (Dolomiti Trentino Orientale) e si sviluppa intorno ai bacini idrografici dei torrenti Cismon, Vanoi e Travignolo,coprendo la Val Venegia, la Foresta di Paneveggio, un'ampia porzione del Gruppo delle Pale di S.Martino, l'estremità orientale della catena del Lagorai ed una parte della catena Lusia - Cima bocche, aree che costituiscono Siti di Importanza Comunitaria e Zone di Protezione Speciale all'interno della Rete Europea \"Natura 2000\".",/*Descrizione*/
                    "Sede del Parco Villa Welsperg\nTel. 0439 765973\n\nCentro Visitatori Paneveggio\nTel. 0462 575283\n\nCentro Visitatori S.Martino di Castrozza\nTel. 0439 768859\n\nCasa del Sentiero Etnografico del Vanoi\nTel. 0439 710049 (dal 1 luglio alla seconda domenica di settembre, negli altri periodi\nEcomuseo del Vanoi\nTel. 0439 719106",/*Numeri utilit*/
                    Uri.parse("http://www.magicoveneto.it/Trentino/Paneveggio/C01-Parco-Naturale-Paneveggio-Pale-San-Martino.jpg"),/*Prima immagine*/
                    Uri.parse("http://www.aptcavalese.it/images/stories/mappe-trekking/lagorai.jpg"),/*Immagine mappa*/
                    new LatLng(46.2785779,11.7797378), /*coordinate*/
                    CITY_TRENTO /*citta per ora solo trento*/
            ));

            add(new Attraction(
                    "MUSE Trento",
                    "via Del MUSE, Trento.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut nulla neque. Morbi nec felis vel neque rhoncus malesuada. Mauris non nisi est. Nunc in ipsum euismod, suscipit dolor eget, efficitur nisi. Integer venenatis mauris mauris, quis luctus risus pellentesque a. Duis tempus est at ligula vehicula fermentum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n\nNam ut sodales nibh, euismod aliquet lectus. Curabitur ornare dictum nisi, at faucibus magna. Morbi tempus nibh sed sodales volutpat. Etiam sodales, turpis sit amet porttitor tristique, libero libero faucibus est, viverra dictum risus ipsum vel augue. Nulla dolor magna, iaculis ac ornare id, fermentum eget massa. Sed mattis, odio nec sodales vehicula, neque metus ullamcorper nulla, sit amet ullamcorper risus lectus a ipsum. Curabitur venenatis feugiat quam nec elementum. Curabitur a interdum urna. Curabitur tincidunt tortor eget neque condimentum blandit. Etiam imperdiet, enim nec blandit convallis, nunc augue.",
                    "Sede del Parco Villa Welsperg\nTel. 0439 765973\n\nCentro Visitatori Paneveggio\nTel. 0462 575283\n\nCentro Visitatori S.Martino di Castrozza\nTel. 0439 768859\n\nCasa del Sentiero Etnografico del Vanoi\nTel. 0439 710049 (dal 1 luglio alla seconda domenica di settembre, negli altri periodi\nEcomuseo del Vanoi\nTel. 0439 719106",
                    Uri.parse("https://c1.staticflickr.com/9/8611/15450870504_a8c317183f_b.jpg"),/* Riga per foto. indirizzo da inserire tra virgolette. solo da internet */
                    Uri.parse("https://lh4.googleusercontent.com/-ch9Kk-7pD68/VGLkCNh5niI/AAAAAAAAADc/ztxkRHWX-po/w600-no/DSC_2739.JPG"),/** Riga per mappa. indirizzo da inserire tra virgolette. solo da internet */
                    new LatLng(46.0614453,11.1164571),
                    CITY_TRENTO
            ));

            add(new Attraction(
                    "Parco Naturale zonale della Maranza",
                    "Rifugio Maranza, via cimirlo 1 TN, Trentino.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ut dui in ipsum suscipit aliquet pretium aliquet odio. Nam posuere nunc sed risus molestie varius. Suspendisse posuere faucibus urna, id vestibulum ante iaculis et. Vivamus placerat suscipit sem, a tempor nunc vehicula ac. Ut libero velit, dapibus sit amet euismod vel, dignissim a nisl.\n\nDonec non dui non felis laoreet malesuada. Fusce ac metus ultrices, fermentum felis quis, varius velit. Donec ac felis semper, scelerisque diam sed, dignissim risus. Maecenas vel semper sapien. Fusce euismod justo posuere, efficitur risus tincidunt, congue tellus. In hac habitasse platea dictumst. Sed lobortis risus consequat vehicula facilisis.\n\nIn hendrerit, neque in gravida rutrum, purus enim aliquet lectus, sit amet vulputate tortor lacus at sem. Aenean lorem metus, finibus rhoncus eros at, ullamcorper fringilla velit. Nulla vitae porttitor metus, quis gravida lectus. In rhoncus, diam a elementum luctus, erat nisi tempus ex, in porta est.",
                    "Rifugio Maranza\nTel. 0461999999\n\nSoccorso Alpino\n1 1 8",
                    Uri.parse("http://www.trentinotrailrunning.it/images/gallerie-articoli/marzola/IMG-037.jpg"),
                    Uri.parse("http://1.bp.blogspot.com/-KjT5Zb7jZ0k/VFU0xWhyZfI/AAAAAAAAD9g/5YZnc8CBYnM/s1600/Marzola.JPG"),
                    new LatLng(46.0449298,11.1419159),
                    CITY_TRENTO
            ));

            add(new Attraction(
                    "Parco nazionale della Majalla",
                    "Via Badia 23, Sulmona AQ, Abruzzo.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam et nunc in leo laoreet placerat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin vestibulum laoreet odio nec posuere. Quisque ante arcu, malesuada vitae velit a, auctor tincidunt ante. Mauris varius eros eros, eget scelerisque mi scelerisque ut. Donec vehicula vitae urna ac hendrerit. Phasellus egestas risus nec euismod auctor.\n\nInteger fermentum velit et dolor varius sagittis. Proin et viverra sapien. Nulla aliquet ante et hendrerit egestas. Duis vulputate libero in nisi gravida cursus. Praesent laoreet nec dolor non iaculis. Aliquam eleifend ultricies ipsum, eu pellentesque libero rutrum non. Mauris et purus erat. Nullam semper mi id tincidunt viverra. Ut porta sem congue lectus luctus ultricies. Suspendisse iaculis lacinia nibh, eu accumsan magna volutpat vel. Sed id interdum mi, vel sollicitudin elit. Fusce facilisis elementum gravida. Duis at volutpat odio. Integer porta convallis tincidunt. Donec aliquam, leo ut.",
                    "Numeri",
                    Uri.parse("https://lh4.googleusercontent.com/-wbNgVdUkBiE/VHe99hGVtNI/AAAAAAAAAFY/fAHfhchNLJw/w600-no/IMG_20141124_143747.jpg"),
                    Uri.parse("https://lh6.googleusercontent.com/-sjY_xlEOic4/VHe9-I4DD9I/AAAAAAAAAFI/Mt0VnjU7SxQ/w600-no/IMG_20141124_144008.jpg"),
                    new LatLng(46.0945482,11.130256),
                    CITY_TRENTO
            ));

            add(new Attraction(
                    "Ecomuseo Argentario",
                    "L'ecomuseo argentario . Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum.",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam eros velit, faucibus in mi in, accumsan eleifend magna. Fusce efficitur volutpat leo nec finibus. Vivamus luctus quis dolor ac interdum. Donec iaculis, orci quis semper vulputate, tortor nisi porttitor tortor, at pretium ante quam ut odio. Donec fringilla sapien et dolor pharetra ultrices. Aenean faucibus felis non vulputate iaculis.\n\nEtiam eget dapibus ligula. Nunc facilisis dignissim tortor et elementum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam condimentum pellentesque mollis. Aliquam finibus urna ipsum, sed accumsan ante blandit quis. Vestibulum vel lacinia ligula. Nunc justo ex, volutpat nec justo ut, efficitur gravida lectus. Mauris cursus dui libero, vel tristique purus laoreet non.\n\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultrices ullamcorper est, at consequat massa. Nam egestas at urna at pellentesque. Quisque lacus quam, efficitur vel erat eget, placerat feugiat eros. Mauris.",
                    "Ass. sticavoli",
                    Uri.parse("https://lh6.googleusercontent.com/-kypwDfnk674/VGLWpQPm4VI/AAAAAAAAAB0/SrfL0fE9DnE/w500-no/OI000020_2.jpg"),
                    Uri.parse("https://lh3.googleusercontent.com/-6_Ioko2ysgU/VHva2PjmRCI/AAAAAAAAAGM/cHjJC7ney4Q/w500-no/PC190054.JPG"),
                    new LatLng(46.0853217,11.1711999),
                    CITY_TRENTO
            ));
        }});

    }};

    /**
     * Creates a list of geofences based on the city locations
     */
    public static List<Geofence> getGeofenceList() {
        List<Geofence> geofenceList = new ArrayList<Geofence>();
        for (String city : CITY_LOCATIONS.keySet()) {
            LatLng cityLatLng = CITY_LOCATIONS.get(city);
            geofenceList.add(new Geofence.Builder()
                    .setCircularRegion(cityLatLng.latitude, cityLatLng.longitude, TRIGGER_RADIUS)
                    .setRequestId(city)
                    .setTransitionTypes(TRIGGER_TRANSITION)
                    .setExpirationDuration(EXPIRATION_DURATION)
                    .build());
        }
        return geofenceList;
    }

    public static String getClosestCity(LatLng curLatLng) {
        if (curLatLng == null) {
            // If location is unknown return test city so some data is shown
            return TEST_CITY;
        }

        double minDistance = 0;
        String closestCity = null;
        for (Map.Entry<String, LatLng> entry: CITY_LOCATIONS.entrySet()) {
            double distance = SphericalUtil.computeDistanceBetween(curLatLng, entry.getValue());
            if (minDistance == 0 || distance < minDistance) {
                minDistance = distance;
                closestCity = entry.getKey();
            }
        }
        return closestCity;
    }
}
