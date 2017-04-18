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
                    "Parco naturale Paneveggio Pale di S.Martino", /*Titolo*/
                    "Località Castelpietra 2, 38054 Tonadico (TN), Trentino.", /*Indirizzo I scheda*/
                    "Il territorio del Parco Naturale Paneveggio Pale di S. Martino è situato nelle Alpi Orientali (Dolomiti Trentino Orientale) e si sviluppa intorno ai bacini idrografici dei torrenti Cismon, Vanoi e Travignolo,coprendo la Val Venegia, la Foresta di Paneveggio, un'ampia porzione del Gruppo delle Pale di S.Martino, l'estremità orientale della catena del Lagorai ed una parte della catena Lusia - Cima bocche, aree che costituiscono Siti di Importanza Comunitaria e Zone di Protezione Speciale all'interno della Rete Europea \"Natura 2000\".",/*Descrizione*/
                    "Sede del parco Villa Welsperg\nTel. 0439 765973\n\nCentro Visitatori Paneveggio\nTel. 0462 575283\n\nCentro Visitatori S.Martino di Castrozza\nTel. 0439 768859\n\nCasa del Sentiero Etnografico del Vanoi\nTel. 0439 710049 (dal 1 luglio alla seconda domenica di settembre, negli altri periodi\nEcomuseo del Vanoi\nTel. 0439 719106",/*Numeri utilit*/
                    Uri.parse("http://www.magicoveneto.it/Trentino/Paneveggio/C01-Parco-Naturale-Paneveggio-Pale-San-Martino.jpg"),/*Prima immagine*/
                    Uri.parse("http://www.aptcavalese.it/images/stories/mappe-trekking/lagorai.jpg"),/*Immagine mappa*/
                    new LatLng(46.1991488,11.8663663), /*coordinate*/
                    CITY_TRENTO /*citta per ora solo trento*/
            ));

            add(new Attraction(
                    "Parco naturale provinciale dell'Adamello-Brenta",
                    "Via Nazionale 24, 38080 Strembo (TN), Trentino.",
                    "Il Parco Naturale Adamello Brenta è la più vasta area protetta del Trentino, situato nel Trentino occidentale, con i suoi 620,51 kmq comprende i gruppi montuosi dell'Adamello e del Brenta, separati dalla Val Rendena e compresi tra le valli di Non, di Sole e Giudicarie. E' interessato dalla presenza di 48 laghi e dal ghiacciaio dell'Adamello, uno dei più estesi d'Europa.",
                    "Sede del parco Strembo\nTel. 0465 806666",
                    Uri.parse("https://www.ufficiostampa.provincia.tn.it/var/002/storage/images/media/immagini-comunicati-stampa/le-lobbie-in-adamello-image/760878-1-ita-IT/Le-Lobbie-in-Adamello_imagefullwide.jpg"),/* Riga per foto. indirizzo da inserire tra virgolette. solo da internet */
                    Uri.parse("http://www.pnab.it/fileadmin/parco/Mobilità/sentieri/muoversi_a_piedi_h.jpg"),/** Riga per mappa. indirizzo da inserire tra virgolette. solo da internet */
                    new LatLng(46.2072398,10.7185963),
                    CITY_TRENTO
            ));

            add(new Attraction(
                    "Parco Naturale Monte Corno",
                    "Via Am Kofl 2, 39040 Trodena (BZ), Sudtirolo.",
                    "Il parco naturale Monte Corno è un'area naturale protetta in Sudtirolo (Alto Adige) di 6.660,00 ha, delimitata a nord dal passo di San Lugano, a sud-est dalla val di Fiemme, a ovest dalla valle dell'Adige e a sud con il confine provinciale con il Trentino.",
                    "Sede del parco Trodena\nTel. 0471 869247",
                    Uri.parse("http://www.suedtirolerland.it/images/cms/754x435/B-P1070241-Blaetterbachschlucht-Weisshorn.JPG"),
                    Uri.parse("http://parchi-naturali.provincia.bz.it/images/map_MonteCorno.jpg"),
                    new LatLng(46.3227165,11.3467833),
                    CITY_TRENTO
            ));

            add(new Attraction(
                    "Riserva regionale Tre Cime del Monte Bondone.",
                    "Via Torre Verde 7, 38122 Trento (TN), Trentino.",
                    "La Riserva naturale integrale delle Tre Cime del Monte Bondone è un'area naturale protetta del Trentino-Alto Adige istituita nel 1968. Occupa una superficie di 223,14 ha tra i 1580 e 2179 metri sul livello del mare nella Provincia Autonoma di Trento. " +
                    "Il territorio della valle è di origine glaciale e raggiunge tre monti; questi sono, in ordine crescente di altezza: il Dos d'Abramo (2.140 m), il Cornetto (2.176 m) e la Cima Verde (2.102 m).",
                    "A.P.T., Monte Bondone Valle dei Laghi\n Tel. 0461 216000",
                    Uri.parse("http://www.lagodigardaescursioni.it/escursioni-lago-garda-montagna/Bondone-escursione/img-gr/02.jpg"),
                    Uri.parse("https://comune.info/uploads/mappe-comune/cimone/satellite-strade-hibrida-cimone.png"),
                    new LatLng(46.0703951,11.118943),
                    CITY_TRENTO
            ));

            add(new Attraction(
                    "Ecomuseo Argentario",
                    "Via C. Battisti 1, 38045 Civezzano (TN), Trentino.",
                    "L'Ecomuseo Argentario è un territorio ideale per lunghe passeggiate alla scoperta di luoghi nascosti. " +
                            "È attraversato da una fitta rete di sentieri adatti a tutti: dai piccoli esploratori, " +
                            "agli amanti della storia e della natura, agli sportivi. " +
                            "Seguendo la segnaletica bianca e rossa potrete dare spazio alla vostra curiosità e voglia di avventura!",
                    "Sede del parco Civezzano\nTel. 0461/858400, Cell. 3356514145",
                    Uri.parse("https://www.visittrentino.info/website/var/tmp/image-thumbnails/110000/117027/thumb__contentgallery/ecomuseo-dell-argentario_2.jpeg"),
                    Uri.parse("http://ecoargentario.it/media/files/PieghevoleCartina_EcomuseoArgentario_crocini.jpg"),
                    new LatLng(46.0851318,11.1615498),
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
