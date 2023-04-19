import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formatação desejada
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");//formatação desejada
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//formatação desejada

        LocalDate d01 = LocalDate.now(); //Data generica
        LocalDateTime d02 = LocalDateTime.now(); //Data com horário
        Instant d03 = Instant.now(); //Data com horário Padrão GMT

        LocalDate d04 = LocalDate.parse("2022-04-19"); //Conversão padrão ISO para Date
        LocalDateTime d05 = LocalDateTime.parse("2022-04-19T11:06:26");//Conversão padrão ISO para Date com horario
        Instant d06 = Instant.parse("2022-04-19T11:06:26Z");//Conversão padrão ISO para Date com horario
        Instant d07 = Instant.parse("2022-04-19T11:06:26-03:00");//Conversão padrão ISO para Date com fuso-horario

        LocalDate d08 = LocalDate.parse("19/04/2023", fmt1); //Localdate com formatação desejada fmt1
        LocalDateTime d09 = LocalDateTime.parse("19/04/2023 11:20", fmt2); //Localdate com formatação desejada fmt2

        LocalDate d10 = LocalDate.of(2023, 04, 19);
        LocalDateTime d11 = LocalDateTime.of(2023, 04,19, 11, 30);




        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        System.out.println("\n*************");
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));

        System.out.println("d05 = " + d05.format(fmt2));

        System.out.println("d06 = " + fmt3.format(d06));   
        
    }
}