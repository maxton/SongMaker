/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package songmaker;

import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class Chord extends Note {
    
    ArrayList<Byte> keycodes;
    ArrayList<Short> lens;
    short length = 240;
    public Chord()
    {
        super((byte)0);
        keycodes = new ArrayList<>();
    }
    public void setLength(short len)
    {
        this.length = len;
    }
    public void addNote(byte keycode)
    {
        keycodes.add(keycode);
    }
    
    public byte[] toByteArray()
    {
        byte ret[] = new byte[4+keycodes.size()];
        ret[0] = (byte)0;
        ret[1] = (byte)keycodes.size();
        int index = 2;
        for(int i=0; i<keycodes.size(); i++)
        {
            ret[index++] = keycodes.get(i);
        }
        ret[index++] = (byte)((length & 0xFF00) >> 8);
        ret[index] = (byte)(length & 0xFF);
        return ret;
    }
    
    public int getNumNotes()
    {
        return keycodes.size();
    }
    
    @Override
    public String toString()
    {
        String ret = "Chord: ";
        for(int i = 0; i < keycodes.size(); i++)
        {
            System.out.println(Note.keycodeToNoteName(keycodes.get(i)));
            ret = ret + Note.keycodeToNoteName(keycodes.get(i)) + " ";
        }
        ret = ret + "Length: 240";
        return ret;
    }
}
