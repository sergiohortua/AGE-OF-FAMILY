/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdadFamilia;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

/**
 *
 * @author TOSHIBA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LocalDate father, mother, son, daughter, now;
        father = LocalDate.of(1986, 1, 31);
        mother = LocalDate.of(1995, 12, 7);
        now=LocalDate.now();
        System.out.println("El papa nacio en : " + father);
        DayOfWeek dSemana = father.getDayOfWeek();
        switch (father.getDayOfWeek()) {
            case MONDAY:
                System.out.println("El dia que naci fue : LUNES");
                break;
            case TUESDAY:
                System.out.println("El dia que naci fue : MARTES");
                break;
            case WEDNESDAY:
                System.out.println("El dia que naci fue : MIERCOLES");
                break;
            case THURSDAY:
                System.out.println("El dia que naci fue : JUEVES");
                break;
            case FRIDAY:
                System.out.println("El dia que naci fue : VIERNES");
                break;
            case SATURDAY:
                System.out.println("El dia que naci fue : SABADO");
                break;
            case SUNDAY:
                System.out.println("El dia que naci fue : DOMINGO");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
 
        System.out.println("biciesto? " + father.isLeapYear());
        System.out.println("");
        long diasVividosF=father.until(now, DAYS);
        System.out.println("El papa ha vivido "+diasVividosF+" dias.");
        long añosFather=father.until(now, YEARS);
        System.out.println("El papa tiene "+añosFather+" años");
        long mesesFaltan= father.getMonthValue()-now.getMonthValue();
        long diasFaltan=father.getDayOfYear()-now.getDayOfYear();
        System.out.println("Cuantos dias le hace falta para cumplir años? -----> "+diasFaltan);
        System.out.println("===========================================");
        System.out.println("");
        System.out.println("La mama nacio: " + mother);
        DayOfWeek d2Semana = mother.getDayOfWeek();
        switch (mother.getDayOfWeek()) {
            case MONDAY:
                System.out.println("El dia que naci fue : LUNES");
                break;
            case TUESDAY:
                System.out.println("El dia que naci fue : MARTES");
                break;
            case WEDNESDAY:
                System.out.println("El dia que naci fue : MIERCOLES");
                break;
            case THURSDAY:
                System.out.println("El dia que naci fue : JUEVES");
                break;
            case FRIDAY:
                System.out.println("El dia que naci fue : VIERNES");
                break;
            case SATURDAY:
                System.out.println("El dia que naci fue : SABADO");
                break;
            case SUNDAY:
                System.out.println("El dia que naci fue : DOMINGO");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }

        System.out.println("biciesto? " + mother.isLeapYear());
        long diasMama=mother.until(now, DAYS);
        System.out.println("Cuantos dias ha vivido mama: "+diasMama);  
        long diasCumpleaños=mother.getDayOfYear()-now.getDayOfYear();
        System.out.println("Cuantos dias faltan para el cumpleaños de mama?: "+diasCumpleaños);
        long difFatherAndMother = father.until(mother, YEARS);
        System.out.println("La diferencia en años entre el papa y la mama es de : " + difFatherAndMother+" años.");
        long diasVividosM=mother.until(now, DAYS);
        long añosMama=mother.until(now, YEARS);
        System.out.println("La mama tiene: "+añosMama+" años.");
        System.out.println("Los dias que ha vivido la mama son: "+diasVividosM+" dias");
        
        
    }

}
