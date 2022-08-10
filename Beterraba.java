import java.util.Scanner;

public class Beterraba{
    public static void main(String []args){

        int segsTotal;

        Scanner input = new Scanner(System.in);

        System.out.print("Passa a hora rapeize!\n");
        System.out.print("Hora: ");
        int hora = input.nextInt();
        System.out.print(hora +":__"+":__");
        System.out.print("\nMinutos: ");
        int minutos = input.nextInt();
        System.out.print(hora +":"+ minutos +":__");
        System.out.print("\nSegundos: ");
        int segundos = input.nextInt();
        System.out.print(hora +":"+ minutos +":"+ segundos);

        input.close();

        segsTotal = ((hora*3600) + (minutos*60) + segundos) -1 ;
        System.out.print("\nJá se passaram "+ segsTotal +" segundos.\n");

        int diaTotal = 24;

        int faltaQuantoProFinal = (diaTotal * 3600) - segsTotal;
        System.out.print("\nFaltam "+ faltaQuantoProFinal +" segundos para acabar o dia.");
        
        int tempoRestanteParaConversao = faltaQuantoProFinal;

        tempoRestanteParaConversao = tempoRestanteParaConversao/3600;
        System.out.print("\n"+tempoRestanteParaConversao);
        int restanteDeHoras = (int)tempoRestanteParaConversao;
        tempoRestanteParaConversao = tempoRestanteParaConversao/60;
        System.out.print("\n"+tempoRestanteParaConversao);
        int restanteDeMinutos = (int)tempoRestanteParaConversao;
        System.out.print("\n"+tempoRestanteParaConversao);
        int restanteDeSegundos = tempoRestanteParaConversao/60;

        System.out.print("\nMais precisamente: "+ restanteDeHoras +":"+ restanteDeMinutos +":"+ restanteDeSegundos +"\n");

    }
}