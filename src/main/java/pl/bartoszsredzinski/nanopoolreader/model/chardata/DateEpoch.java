package pl.bartoszsredzinski.nanopoolreader.model.chardata;

import java.util.Date;

public class DateEpoch{

    private Date date;
    public DateEpoch(long d){
        date = new Date(d * 1000l);
    }

    public Date getDate(){
        return date;
    }
}
