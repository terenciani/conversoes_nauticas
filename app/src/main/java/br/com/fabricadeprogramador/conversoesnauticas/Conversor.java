package br.com.fabricadeprogramador.conversoesnauticas;

/**
 * Created by terenciani on 03/11/15.
 */
public class Conversor {

    public static Double metros2milhasNauticas (Double metros){

        return metros / 1852;

    }

    public static Double metros2milhasTerrestres (Double metros){

        return metros / 1609.528408176;

    }

    public static Double metros2Kilometros (Double metros){

        return metros / 1000;

    }

    public static Double milhasNauticas2metros (Double milhasNauticas){

        return milhasNauticas * 1852;

    }

    public static double milhasTerrestres2metros (Double milhasTerrestres){

        return milhasTerrestres * 1609.528408176;

    }

    public static double kilometros2metros (Double kilometro){

        return kilometro * 1000;

    }




}
