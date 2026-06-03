/*
 * Look4Sat. Amateur radio satellite tracker and pass predictor.
 * Copyright (C) 2019-2026 Arty Bishop and contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.rtbishop.look4sat.core.domain.source

object Sources {
    val satelliteDataUrls = mapOf(
        "All" to "https://tledata.xanyi.eu.org/tledata/all.csv",
        "Amateur" to "https://tledata.xanyi.eu.org/tledata/amateur.csv",
        "Brightest" to "https://tledata.xanyi.eu.org/tledata/brightest.csv",
        "Cubesat" to "https://tledata.xanyi.eu.org/tledata/cubesat.csv",
        "Education" to "https://tledata.xanyi.eu.org/tledata/education.csv",
        "Engineer" to "https://tledata.xanyi.eu.org/tledata/engineering.csv",
        "Geostationary" to "https://tledata.xanyi.eu.org/tledata/geo.csv",
        "Globalstar" to "https://tledata.xanyi.eu.org/tledata/globalstar.csv",
        "GNSS" to "https://tledata.xanyi.eu.org/tledata/gnss.csv",
        "Intelsat" to "https://tledata.xanyi.eu.org/tledata/intelsat.csv",
        "Iridium" to "https://tledata.xanyi.eu.org/tledata/iridium.csv",
        "Military" to "https://tledata.xanyi.eu.org/tledata/military.csv",
        "New" to "https://tledata.xanyi.eu.org/tledata/last-30-days.csv",
        "OneWeb" to "https://tledata.xanyi.eu.org/tledata/oneweb.csv",
        "Orbcomm" to "https://tledata.xanyi.eu.org/tledata/orbcomm.csv",
        "Resource" to "https://tledata.xanyi.eu.org/tledata/resource.csv",
        "SatNOGS" to "https://tledata.xanyi.eu.org/tledata/satnogs.csv",
        "Science" to "https://tledata.xanyi.eu.org/tledata/science.csv",
        "Spire" to "https://tledata.xanyi.eu.org/tledata/spire.csv",
        "Starlink" to "https://tledata.xanyi.eu.org/tledata/starlink.csv",
        "Swarm" to "https://tledata.xanyi.eu.org/tledata/swarm.csv",
        "Weather" to "https://tledata.xanyi.eu.org/tledata/weather.csv",
        "X-Comm" to "https://tledata.xanyi.eu.org/tledata/x-comm.csv",
        "Amsat" to "https://tledata.xanyi.eu.org/tledata/amsat.txt",
        "Classified" to "https://tledata.xanyi.eu.org/tledata/classified.zip",
        "McCants" to "https://tledata.xanyi.eu.org/tledata/mccants.zip",
        "R4UAB" to "https://tledata.xanyi.eu.org/tledata/r4uab.txt",
        "Other" to "" // key for sats filter
    )
    val transceiversDataUrls = mapOf(
        "SatNOGS" to "https://tledata.xanyi.eu.org/tledata/satnogs_transceivers.json"
    )
}
