/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package songmaker;

/**
 *
 * @author Max
 */
public class Note {
    public static byte C3   = 48;
    public static byte Db3  = 49;
    public static byte D3   = 50;
    public static byte Eb3  = 51;
    public static byte E3   = 52;
    public static byte F3   = 53;
    public static byte Gb3  = 54;
    public static byte G3   = 55;
    public static byte Ab3  = 56;
    public static byte A3   = 57;
    public static byte Bb3  = 58;
    public static byte B3   = 59;
    public static byte C4   = 60;
    public static byte Db4  = 61;
    public static byte D4   = 62;
    public static byte Eb4  = 63;
    public static byte E4   = 64;
    public static byte F4   = 65;
    public static byte Gb4  = 66;
    public static byte G4   = 67;
    public static byte Ab4  = 68;
    public static byte A4   = 69;
    public static byte Bb4  = 70;
    public static byte B4   = 71;
    public static byte C5   = 72;
    public static byte Db5  = 73;
    public static byte D5   = 74;
    public static byte Eb5  = 75;
    public static byte E5   = 76;
    public static byte F5   = 77;
    public static byte Gb5  = 78;
    public static byte G5   = 79;
    
    
    private byte keycode;
    private short length;
    
    public Note(byte keycode)
    {
        this.keycode = keycode;
        this.length = (short)240;
    }
    public Note(byte keycode, short len)
    {
        this.keycode = keycode;
        this.length =  len;
    }
    public static String keycodeToNoteName(byte keycode)
    {
        String ret = "";
        switch(keycode % 12)
        {
            case 0: ret = "C"; break;
            case 1: ret = "Db"; break;
            case 2: ret = "D"; break;
            case 3: ret = "Eb"; break;
            case 4: ret = "E"; break;
            case 5: ret = "F"; break;
            case 6: ret = "Gb"; break;
            case 7: ret = "G"; break;
            case 8: ret = "Ab"; break;
            case 9: ret = "A"; break;
            case 10: ret = "Bb"; break;
            case 11: ret = "B"; break;
        }
        ret = ret + (keycode/12 - 1);
        return ret;
    }
    
    public byte[] toByteArray()
    {
        byte arr[] = {  this.keycode, 
                        (byte)((this.length & 0xFF00) >> 8),
                        (byte)(this.length & 0xFF)
                     };
        return arr;
    }
    
    @Override
    public String toString()
    {
        return Note.keycodeToNoteName(keycode) + "  Length: " + this.length;
    }
}
