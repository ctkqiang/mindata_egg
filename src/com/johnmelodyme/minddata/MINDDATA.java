package com.johnmelodyme.minddata;

/**
 * @AUTHOR: JOHN MELODY ME
 * @COPYRIGHT:  ALL RIGHT RESERVED  ©  JOHN MELODY MELISSA COPYRIGHT
 * This Module is for collecting EEG data which amplifies
 * and convert into a 16 bits domain signal. Brain wave module operating
 * voltage is 3.3v, built-in 50hz filter circuit.
 * The module output is a UART serial port,
 * the serial port parameters and data format are as follows:
 *
 * Serial output configuration:
 * Check digit: None
 * Data bit: 8bit
 * Stop bit: 1bit
 * Baud rate: 115200
 *
Data Format:
 *        The P2 Firmware Protocol was the initial transmission protocol of the OpenEEG project,
 *        used by ModularEEG. It is compatible with the ElectricGuru application.
 *        P2 uses 17 data bytes to transmit 6 channels of EEG data:
 *
 *        1: sync0;          // synchronisation byte 1 = 0xa5
 *        2: sync1;          // synchronisation byte 2 = 0x5a
 *        3: version;        // version number = 2
 *        4: count;          // packet counter. Increases by 1 each packet.
 *        5: Chn1high        // channel 1 high byte
 *        6: Chn1low         // channel 2 low byte
 *        7: Chn2high        // channel 2 high byte
 *        8: Chn2low
 *        9: Chn3high
 *        10: Chn3low
 *        11: Chn4high
 *        12: Chn4low
 *        13: Chn5high
 *        14: Chn5low
 *        15: Chn6high
 *        16: Chn6low        // channel 6 low byte
 *        17: switches;      // State of PD5 to PD2, in bits 3 to 0.
 *
 *         A5 5A 02 39 02 33 01 EB 02 22 01 B3 02 00  02 00 0F
 * *        -- -- -- -- ----- ----- ----- ----- ----- -----  --
 * *        |  |  |  |   |     |     |     |     |     |
 * *        |  |  |  |   |     |     |     |     |     +-------- ch6
 * *        |  |  |  |   |     |     |     |     +-------------- ch5
 * *        |  |  |  |   |     |     |     +-------------------- ch4
 * *        |  |  |  |   |     |     +-------------------------- ch3
 * *        |  |  |  |   |     +-------------------------------- ch2
 * *        |  |  |  |   +-------------------------------------- ch1
 * *        |  |  |  +------------------------------------------ packet counter. Increases by 1 each packet.
 * *        |  |  +--------------------------------------------- version number = 2
 * *        |  +------------------------------------------------ synchronisation byte 2 = 0x5a
 * *        +--------------------------------------------------- synchronisation byte 1 = 0xa5
 * *
 * *       Here we provide a 2-channel module, so the 9th to 16th data is meaningless.
 * *       Here we give two sample code (the team can use this as a template to write data reading software)
 * *
 * *       Parsing code example:
 * *       Embedded code (C language)
 * *       Serial port receiving and parsing :
 * *       For the convenience of reading, the algorithm is not simplified::
 */
public class MINDDATA {
    public static void main(String[] args) {

    }
}