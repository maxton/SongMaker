# SongMaker
Tt makes song files for our arduino piano teacher.

SongMaker was written over a 21-hour period in late March 2015, during the second annual "MakeBU" hackathon.

It reads and writes the .sng format, a simplified music sequence file.

##Structure of a .sng file
###Header
* unsigned byte `nameLen` : the length of the following ASCII string
* character array `name` : the song's name in ASCII, length `nameLen`
* unsigned byte `numNotes` : the number of notes/chords in the sequence

###Data
The notes themselves are designated as notes or chords, which group several notes.

If a chord:
* unsigned byte `code` = 0x00 for a chord
* unsigned byte `number` of notes in chord
* byte array `midiKey` array of notes of size `number`
* unsigned short `len` length of the note in ms (reading/writing this value is unimplemented. its default is 240)

If a note:
* unsigned byte `code` the MIDI key code
* unsigned short `len` length of the note in ms

##Screenshot
<img src="https://raw.githubusercontent.com/maxton/SongMaker/master/screenshot.png"/>
  

