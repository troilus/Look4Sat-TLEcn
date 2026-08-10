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

        "Amsat" to "https://tledata.xanyi.eu.org/tledata/amsat.txt",
        "Classified" to "https://tledata.xanyi.eu.org/tledata/classified.zip",
        "McCants" to "https://tledata.xanyi.eu.org/tledata/mccants.zip",
        "R4UAB" to "https://tledata.xanyi.eu.org/tledata/r4uab.txt",
        "SatNOGS" to "https://tledata.xanyi.eu.org/tledata/satnogs.csv",
        "ARISS" to "https://tledata.xanyi.eu.org/tledata/iss.txt",

        "Other" to "" // key for sats filter
    )
    val transceiversDataUrls = mapOf(
        "SatNOGS" to "https://tledata.xanyi.eu.org/tledata/satnogs_transceivers.json"
    )
    val satelliteModes = listOf(
        "4FSK", "64-QAM", "AFSK", "AFSK TUBiX10", "AHRPT", "AM", "APT", "ASK", "BPSK",
        "BPSK PMT-A3", "CERTO", "CW", "DATV", "DBPSK", "DOKA", "DPSK", "DQPSK", "DSB", "DSTAR",
        "DUV", "DVB-S2", "FFSK", "FM", "FMN", "FSK", "FSK AX.100 Mode 5", "FSK AX.100 Mode 6",
        "FSK AX.25 G3RUH", "FT8", "GENESIS FSK", "GFSK", "GFSK Pkst", "GFSK Rktr", "GFSK/BPSK",
        "GMSK", "GMSK USP", "HRPT", "LoRa", "LRPT", "LSB", "MFSK", "MSK", "MSK AX.100 Mode 5",
        "MSK AX.100 Mode 6", "OFDM", "OQPSK", "PPM", "PSK", "PSK31", "PSK63", "QPSK", "QPSK31",
        "QPSK63", "SIDLOC", "SQPSK", "SSDV", "SSTV", "UNKNOWN", "USB", "WSJT"
    )
}
